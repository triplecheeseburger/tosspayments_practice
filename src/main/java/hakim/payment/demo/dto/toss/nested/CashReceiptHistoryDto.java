package hakim.payment.demo.dto.toss.nested;

import hakim.payment.demo.dto.toss.type.CashReceiptIssueStatus;
import hakim.payment.demo.dto.toss.type.CashReceiptType;
import hakim.payment.demo.dto.toss.type.TransactionType;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class CashReceiptHistoryDto {
    @Size(max = 200)
    private String receiptKey;
    @Size(min = 6, max = 64)
    private String orderId;
    @Size(max = 100)
    private String orderName;
    private CashReceiptType type;
    @Size(max = 9)
    private String issueNumber;
    private String receiptUrl;
    @Size(max = 10)
    private String businessNumber;
    private TransactionType transactionType;
    private Integer amount;
    private Integer taxFreeAmount;
    private CashReceiptIssueStatus issueStatus;
    private FailureDto failure;
    @Size(max = 30)
    private String customerIdentityNumber;
    private OffsetDateTime requestedAt;

    public void setType(String type) {
        this.type = CashReceiptType.findByKr(type);
    }

}
