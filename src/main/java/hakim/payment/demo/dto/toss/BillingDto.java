package hakim.payment.demo.dto.toss;

import hakim.payment.demo.dto.toss.nested.CardDto;
import hakim.payment.demo.dto.toss.type.PaymentMethod;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class BillingDto {
    @Size(max = 14)
    private String mId;
    @Size(max = 300)
    private String customerKey;
    private OffsetDateTime authenticatedAt;
//    private String method;
    private PaymentMethod method;
    @Size(max = 200)
    private String billingKey;
    private CardDto card;

    public void setMethod(String method) {
        this.method = PaymentMethod.findByKr(method);
    }
}
