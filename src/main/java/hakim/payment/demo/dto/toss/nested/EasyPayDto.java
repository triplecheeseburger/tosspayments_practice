package hakim.payment.demo.dto.toss.nested;

import hakim.payment.demo.dto.toss.type.EasyPayProvider;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EasyPayDto {
    private EasyPayProvider provider;
    private Double amount;
    private Double discountAmount;

    public void setProvider(String provider) {
        this.provider = EasyPayProvider.findByKr(provider);
    }
}
