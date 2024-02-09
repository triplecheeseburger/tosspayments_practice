package hakim.payment.demo.dto.toss.nested;

import hakim.payment.demo.dto.toss.type.*;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CardDto {
    private Double amount;
    private CardCompany issuerCode;
    private CardCompany acquirerCode;
    @Size(max = 20)
    private String number;
    private Integer installmentPlanMonths;
    @Size(max = 8)
    private String approveNo;
    private Boolean useCardPoint;
    private CardType cardType;
    private OwnerType ownerType;
    private AcquireStatus acquireStatus;
    private Boolean isInterestFree;
    @Nullable
    private InterestPayer interestPayer;

    public void setIssuerCode(String issuerCode) {
        this.issuerCode = CardCompany.findByCode(issuerCode);
    }

    public void setAcquirerCode(String acquirerCode) {
        this.acquirerCode = CardCompany.findByCode(acquirerCode);
    }

    public void setCardType(String cardType) {
        this.cardType = CardType.findByKr(cardType);
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = OwnerType.findByKr(ownerType);
    }
}
