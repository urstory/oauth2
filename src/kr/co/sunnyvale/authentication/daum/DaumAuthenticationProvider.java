package kr.co.sunnyvale.authentication.daum;

import kr.co.sunnyvale.authentication.common.CommonConst;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * @author <a href="mailto:phjang1983@daum.net">Jang,Pyohwan</a>
 * @company  : http://jakduk.com
 * @date     : 2014. 10. 11.
 * @desc     :
 */
public class DaumAuthenticationProvider implements AuthenticationProvider {

//    @Autowired
//    private OAuthDetailService oauthDetailService;

    private DaumService daumService;

    private Logger logger = Logger.getLogger(this.getClass());

    public void setDaumService(DaumService daumService) {
        this.daumService = daumService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = (authentication.getPrincipal() == null) ? "NONE_PROVIDED" : authentication.getName();

//        if (username.equals(CommonConst.OAUTH_TYPE_DAUM)) {
//
//            DaumUser user = daumService.findUser();
//
//            OAuthPrincipal principal = (OAuthPrincipal) oauthDetailService.loadUser(user.getUserid(), user.getNickname(), CommonConst.OAUTH_TYPE_DAUM);
//
//            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(principal, authentication.getCredentials(), principal.getAuthorities());
//
//            token.setDetails(oauthDetailService.getUserDetails(user));
//
//            return token;
//        } else {
//            throw new BadCredentialsException("fail to authenticate Daum");
//        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }

}