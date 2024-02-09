package hakim.payment.demo.dto.toss.type;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MobilePhoneDto {
    private String customerMobilePhone;
    private SettlementStatus settlementStatus;
    private String receiptUrl;
}
