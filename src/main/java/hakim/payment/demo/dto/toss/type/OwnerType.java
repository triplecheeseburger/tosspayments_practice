package hakim.payment.demo.dto.toss.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum OwnerType {

    PERSONAL("개인"),
    COMPANY("법인"),
    UNKNOWN("미확인");

    private final String kr;

    OwnerType(String kr) {
        this.kr = kr;
    }

    public static OwnerType findByKr(String kr) {
        for (OwnerType type : values()) {
            if (type.getKr().equals(kr)) {
                return type;
            }
        }
        throw new IllegalArgumentException("CardType not found: " + kr);
    }
}
