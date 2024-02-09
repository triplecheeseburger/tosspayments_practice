package hakim.payment.demo.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CancelPaymentTossRequestDto {
    @NotNull
    private String cancelReason;
    @Nullable
    private Integer cancelAmount;
    @Nullable
    private Object refundReceiveAccount;
    @Nullable
    private Integer taxFreeAmount;
    @Nullable
    private String currency;

}
