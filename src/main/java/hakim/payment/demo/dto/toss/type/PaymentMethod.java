package hakim.payment.demo.dto.toss.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum PaymentMethod {
    CARD("카드"),
    VIRTUAL_ACCOUNT("가상계좌"),
    EASY_PAY("간편결제"),
    MOBILE_PHONE("휴대폰"),
    TRANSFER("계좌이체"),
    CULTURE_GIFT_CERTIFICATE("문화상품권"),
    BOOK_GIFT_CERTIFICATE("도서문화상품권"),
    GAME_GIFT_CERTIFICATE("게임문화상품권");

    private final String kr;
    PaymentMethod(String kr) {
        this.kr = kr;
    }

    public static PaymentMethod findByKr(String kr) {
        for (PaymentMethod method : values()) {
            if (method.getKr().equals(kr)) {
                return method;
            }
        }
        throw new IllegalArgumentException("No matching CardCompany for code: " + kr);
    }
}
