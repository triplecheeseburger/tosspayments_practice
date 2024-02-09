package hakim.payment.demo;

import io.netty.channel.ChannelOption;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.netty.http.client.HttpClient;

import java.util.Base64;

@Configuration
public class WebClientConfig {
    HttpClient httpClient = HttpClient.create().option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000); // 10초

    @Value("${payment.api-url}")
    private String tossApiUrl;
    @Value("${payment.secret-key}")
    private String tossApiKey;

    @Bean
    public WebClient webClient() {
        HttpHeaders _headers = new HttpHeaders();
        String _encodedKey = Base64.getEncoder().encodeToString((tossApiKey + ":").getBytes());
        _headers.add("Authorization", "Basic " + _encodedKey);
        _headers.add("Content-Type", "application/json;charset=utf-8");
        return WebClient.builder()
                .baseUrl(tossApiUrl)
                .defaultHeaders(httpHeaders -> httpHeaders.addAll(_headers))
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .build();
    }
}
