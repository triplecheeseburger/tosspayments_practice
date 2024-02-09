package hakim.payment.demo.dto.toss.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum CardCompany {

    IBK_BC("3K", "기업비씨", "IBK_BC"),
    GWANGJUBANK("46", "광주", "GWANGJUBANK"),
    LOTTE("71", "롯데", "LOTTE"),
    KDBBANK("30", "산업", "KDBBANK"),
    BC("31", "-", "BC"),
    SAMSUNG("51", "삼성", "SAMSUNG"),
    SAEMAUL("38", "새마을", "SAEMAUL"),
    SHINHAN("41", "신한", "SHINHAN"),
    SHINHYEOP("62", "신협", "SHINHYEOP"),
    CITI("36", "씨티", "CITI"),
    WOORI_BC("33", "우리BC카드(BC 매입)", "WOORI"),
    WOORI("W1", "우리카드(우리 매입)", "WOORI"),
    POST("37", "우체국", "POST"),
    SAVINGBANK("39", "저축", "SAVINGBANK"),
    JEONBUKBANK("35", "전북", "JEONBUKBANK"),
    JEJUBANK("42", "제주", "JEJUBANK"),
    KAKAOBANK("15", "카카오뱅크", "KAKAOBANK"),
    KBANK("3A", "케이뱅크", "KBANK"),
    TOSSBANK("24", "토스뱅크", "TOSSBANK"),
    HANA("21", "하나", "HANA"),
    HYUNDAI("61", "현대", "HYUNDAI"),
    KOOKMIN("11", "국민", "KOOKMIN"),
    NONGHYEOP("91", "농협", "NONGHYEOP"),
    SUHYEOP("34", "수협", "SUHYEOP");

    private final String code;
    private final String kr;
    private final String en;

    CardCompany(String code, String kr, String en) {
        this.code = code;
        this.kr = kr;
        this.en = en;
    }

    public static CardCompany findByCode(String code) {
        for (CardCompany company : values()) {
            if (company.getCode().equals(code)) {
                return company;
            }
        }
        throw new IllegalArgumentException("No matching CardCompany for code: " + code);
    }
}

