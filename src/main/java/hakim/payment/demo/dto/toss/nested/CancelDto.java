package hakim.payment.demo.dto.toss.nested;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class CancelDto {
    private Double cancelAmount;
    @Size(max = 200)
    private String cancelReason;
    private Double taxFreeAmount;
    private Integer taxExemptionAmount;
    private Double refundableAmount;
    private Double easyPayDiscountAmount;
    private OffsetDateTime canceledAt;
    @Size(max = 64)
    private String transactionKey;
    @Nullable
    private String receiptKey;
}

