package hakim.payment.demo.dto.toss;

import hakim.payment.demo.dto.toss.nested.*;
import hakim.payment.demo.dto.toss.type.*;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class PaymentDto {
    private String version;
    @Size(max = 200)
    private String paymentKey;
    private PaymentType type;
    @Size(min = 6, max = 64)
    private String orderId;
    @Size(max = 100)
    private String orderName;
    @Size(max = 14)
    private String mId;
    private String currency;
    private String method;
//    private PaymentMethod method;
    private Double totalAmount;
    private Double balanceAmount;
    private String status;
//    private PaymentStatus status;
    private OffsetDateTime requestedAt;
    private OffsetDateTime approvedAt;
    private Boolean uesEscrow;
    @Nullable
    private String lastTransactionKey;
    private Double suppliedAmount;
    private Double vat;
    private Boolean cultureExpense;
    private Double taxFreeAmount;
    private Integer taxExemptionAmount;
    private List<CancelDto> cancels;
    private Boolean isPartialCancelable;
    @Nullable
    private CardDto card;
    private VirtualAccountDto virtualAccount;
    @Nullable
    private String secret;
    @Nullable
    private MobilePhoneDto mobilePhone;
    @Nullable
    private GiftCertificateDto giftCertificate;
    @Nullable
    private TransferDto transfer;
    @Nullable
    private ReceiptDto receipt;
    @Nullable
    private CheckoutDto checkout;
    @Nullable
    private EasyPayDto easyPay;
    private String country;
    @Nullable
    private FailureDto failure;
    @Nullable
    private CashReceiptDto cashReceipt;
    @Nullable
    private List<CashReceiptHistoryDto> cashReceipts;
    @Nullable
    private DiscountDto discount;
}
