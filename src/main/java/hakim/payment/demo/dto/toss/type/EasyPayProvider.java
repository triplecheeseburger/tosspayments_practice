package hakim.payment.demo.dto.toss.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum EasyPayProvider {
    TOSSPAY("토스페이"),
    NAVERPAY("네이버페이"),
    SAMSUMGPAY("삼성페이"),
    LPAY("엘페이"),
    KAKAOPAY("카카오페이"),
    PAYCO("페이코"),
    SSG("SSG페이"),
    APPLEPAY("애플페이"),
    PINPAY("핀페이");

    private final String kr;

    EasyPayProvider(String kr) {
        this.kr = kr;
    }

    public static EasyPayProvider findByKr(String kr) {
        for (EasyPayProvider provider : values()) {
            if (provider.getKr().equalsIgnoreCase(kr)) {
                return provider;
            }
        }
        throw new IllegalArgumentException("CardType not found: " + kr);
    }
}
