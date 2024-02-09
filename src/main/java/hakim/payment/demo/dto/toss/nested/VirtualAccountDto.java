package hakim.payment.demo.dto.toss.nested;

import hakim.payment.demo.dto.toss.type.AccountType;
import hakim.payment.demo.dto.toss.type.BankCode;
import hakim.payment.demo.dto.toss.type.RefundStatus;
import hakim.payment.demo.dto.toss.type.SettlementStatus;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class VirtualAccountDto {
    private AccountType accountType;
    @Size(max = 20)
    private String accountNumber;
    private BankCode bankCode;
    @Size(max = 100)
    private String customerName;
    private OffsetDateTime dueDate;
    private RefundStatus refundStatus;
    private Boolean expired;
    private SettlementStatus settlementStatus;
    private RefundReceiveAccountDto refundReceiveAccount;

    public void setAccountType(String accountType) {
        this.accountType = AccountType.findByKr(accountType);
    }

    public void setBankCode(String bankCode) {
        this.bankCode = BankCode.findByCode(bankCode);
    }
}
