package hakim.payment.demo.dto.toss.nested;

import hakim.payment.demo.dto.toss.type.SettlementStatus;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GiftCertificateDto {
    @Size(max = 8)
    private String approveNo;
    private SettlementStatus settlementStatus;
}
