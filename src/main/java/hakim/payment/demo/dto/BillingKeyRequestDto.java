package hakim.payment.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BillingKeyRequestDto {
    private String customerKey;
    private String authKey;
}
