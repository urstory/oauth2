package kr.co.sunnyvale.authentication.common;
public class CommonConst {

    /**
     * 사용자 쿠키
     */
    public final static String COOKIE_EMAIL = "email";
    public final static String COOKIE_REMEMBER = "remember";
    public final static Integer COOKIE_EMAIL_MAX_AGE = 60 * 60 * 24 * 30; // 30 days

    /**
     * OAuth 종류
     */
    public final static String OAUTH_TYPE_FACEBOOK = "facebook";
    public final static String OAUTH_TYPE_DAUM = "daum";
    public final static String AUTH_TYPE_JAKDUK = "jakduk";

    /**
     * OAuth 추가 정보 입력 여부
     */
    public final static String OAUTH_ADDITIONAL_INFO_STATUS_NONE = "none";
    public final static String OAUTH_ADDITIONAL_INFO_STATUS_UNUSE = "unuse";
    public final static String OAUTH_ADDITIONAL_INFO_STATUS_BLANK = "blank";
    public final static String OAUTH_ADDITIONAL_INFO_STATUS_OK = "ok";

}