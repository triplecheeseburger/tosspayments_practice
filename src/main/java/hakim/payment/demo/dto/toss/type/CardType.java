package hakim.payment.demo.dto.toss.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum CardType {
    CREDIT("신용"),
    CHECK("체크"),
    GIFT("기프트");

    private final String kr;

    CardType(String kr) {
        this.kr = kr;
    }

    public static CardType findByKr(String kr) {
        for (CardType cardType : values()) {
            if (cardType.getKr().equalsIgnoreCase(kr)) {
                return cardType;
            }
        }
        throw new IllegalArgumentException("CardType not found: " + kr);
    }
}
