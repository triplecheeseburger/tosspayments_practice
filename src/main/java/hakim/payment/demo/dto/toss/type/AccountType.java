package hakim.payment.demo.dto.toss.type;

import lombok.Getter;

@Getter
public enum AccountType {
    NORMAL("일반"),
    FIXED("고정");

    private final String kr;

    AccountType(String kr) {
        this.kr = kr;
    }

    public static AccountType findByKr(String kr) {
        for (AccountType type : values()) {
            if (type.getKr().equals(kr)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No matching AccountType for code: " + kr);
    }
}
