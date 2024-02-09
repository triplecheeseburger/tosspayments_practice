package hakim.payment.demo.dto.toss.nested;

import hakim.payment.demo.dto.toss.type.CashReceiptType;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CashReceiptDto {
    private CashReceiptType type;
    @Size(max = 200)
    private String receiptKey;
    @Size(max = 9)
    private String issueNumber;
    private String receiptUrl;
    private Double amount;
    private Double taxFreeAmount;

    public void setType(String type) {
        this.type = CashReceiptType.findByKr(type);
    }
}
