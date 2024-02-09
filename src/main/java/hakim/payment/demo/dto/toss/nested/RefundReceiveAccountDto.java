package hakim.payment.demo.dto.toss.nested;

import hakim.payment.demo.dto.toss.type.BankCode;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RefundReceiveAccountDto {
    private BankCode bankCode;
    @Size(max = 20)
    private String accountNumber;
    private String holderName;

    public void setBankCode(String bankCode) {
        this.bankCode = BankCode.findByCode(bankCode);
    }
}
