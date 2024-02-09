package hakim.payment.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BillingRequestDto {
    private String amount;
    private String customerKey;
    private String orderId;
    private String orderName;
    private String cardInstallmentPlan;
    private String customerEmail;
    private String customerMobilePhone;
    private String customerName;
    private String taxExemptionAmount;
    private String taxFreeAmount;
}
