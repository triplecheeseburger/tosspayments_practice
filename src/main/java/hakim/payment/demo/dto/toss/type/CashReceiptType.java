package hakim.payment.demo.dto.toss.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum CashReceiptType {
    DEDUCTION("소득공제"),
    PROOF("지출증빙"),
    NONE("미발행");

    private final String kr;

    CashReceiptType(String kr) {
        this.kr = kr;
    }

    public static CashReceiptType findByKr(String kr) {
        for (CashReceiptType type : values()) {
            if (type.getKr().equals(kr)) {
                return type;
            }
        }
        throw new IllegalArgumentException("CardType not found: " + kr);
    }
}
