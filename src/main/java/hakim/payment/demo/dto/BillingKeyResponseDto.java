package hakim.payment.demo.dto;

import hakim.payment.demo.dto.toss.nested.CardDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class BillingKeyResponseDto {
    private String mId;
    private String customerKey;
    private OffsetDateTime authenticatedAt;
    private String method;
    private String billingKey;
    private CardDto card;
}
