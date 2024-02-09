package hakim.payment.demo.dto.toss.nested;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FailureDto {
    private String code;
    private String message;
}
