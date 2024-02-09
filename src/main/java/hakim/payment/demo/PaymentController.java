package hakim.payment.demo;

import hakim.payment.demo.dto.*;
import hakim.payment.demo.dto.toss.BillingDto;
import hakim.payment.demo.dto.toss.PaymentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final WebClient webClient;

    @GetMapping("/billing/success")
    public PaymentDto[] paymentSuccess(@RequestParam(name = "customerKey") String customerKey, @RequestParam(name = "authKey") String authKey) {
        //get and save BillingKey
        BillingDto billingKeyResponse = webClient.post()
                .uri("/v1/billing/authorizations/issue")
                .bodyValue(BillingKeyRequestDto.builder()
                        .authKey(authKey)
                        .customerKey(customerKey)
                        .build())
                .retrieve()
                .bodyToMono(BillingDto.class)
                .block();
        PaymentDto billingResponse = webClient.post()
                .uri("/v1/billing/" + billingKeyResponse.getBillingKey())
                .bodyValue(BillingRequestDto.builder()
                        .amount("9700")
                        .customerKey(billingKeyResponse.getCustomerKey())
                        .orderId(UUID.randomUUID().toString())
                        .orderName("구독좋아요알림설정까지")
                        .cardInstallmentPlan("0")
                        .customerEmail("constantly@kakao.com")
                        .customerMobilePhone("01087440936")
                        .customerName("김한결")
                        .taxExemptionAmount("0")
                        .taxFreeAmount("0")
                        .build())
                .retrieve()
                .bodyToMono(PaymentDto.class)
                .block();
        PaymentDto billingResponse2 = webClient.post()
                .uri("/v1/billing/" + billingKeyResponse.getBillingKey())
                .bodyValue(BillingRequestDto.builder()
                        .amount("300")
                        .customerKey(billingKeyResponse.getCustomerKey())
                        .orderId(UUID.randomUUID().toString())
                        .orderName("두번째결제입니다")
                        .cardInstallmentPlan("0")
                        .customerEmail("constantly@kakao.com")
                        .customerMobilePhone("01087440936")
                        .customerName("김한결")
                        .taxExemptionAmount("0")
                        .taxFreeAmount("0")
                        .build())
                .retrieve()
                .bodyToMono(PaymentDto.class)
                .block();
        return new PaymentDto[]{billingResponse, billingResponse2};
    }

    @GetMapping("/payment/cancel")
    public PaymentDto paymentCancel(@RequestParam(name = "paymentKey") String paymentKey) {
        PaymentDto response = webClient.post()
                .uri("/v1/payments/" + paymentKey + "/cancel")
                .bodyValue(CancelPaymentTossRequestDto.builder()
                        .cancelReason("내마음은갈대같아서")
                        .build())
                .retrieve()
                .bodyToMono(PaymentDto.class)
                .block();
        return response;
    }
}
