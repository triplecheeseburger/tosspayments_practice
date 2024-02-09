package hakim.payment.demo.dto.toss.nested;

import hakim.payment.demo.dto.toss.type.BankCode;
import hakim.payment.demo.dto.toss.type.SettlementStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TransferDto {
    private BankCode bankCode;
    private SettlementStatus settlementStatus;

    public void setBankCode(String bankCode) {
        this.bankCode = BankCode.findByCode(bankCode);
    }
}
