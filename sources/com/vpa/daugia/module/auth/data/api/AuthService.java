package com.vpa.daugia.module.auth.data.api;

import com.vpa.daugia.module.auth.data.api.response.CheckRecover;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.module.auth.data.model.User;
import ef.k;
import ik.d;
import java.util.Map;
import xl.a;
import xl.f;
import xl.j;
import xl.o;
import xl.t;
import yk.l;

/* compiled from: AuthService.kt */
public interface AuthService {

    /* compiled from: AuthService.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object checkOtpEmail$default(AuthService authService, Map map, Object obj, d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                return authService.checkOtpEmail(map, obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkOtpEmail");
        }

        public static /* synthetic */ Object checkOtpPhone$default(AuthService authService, Map map, Object obj, d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                return authService.checkOtpPhone(map, obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkOtpPhone");
        }

        public static /* synthetic */ Object requestOtp$default(AuthService authService, Map map, String str, String str2, String str3, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = "";
                }
                String str4 = str;
                if ((i10 & 4) != 0) {
                    str2 = "register";
                }
                String str5 = str2;
                if ((i10 & 8) != 0) {
                    str3 = l.k1(String.valueOf(System.currentTimeMillis())).toString();
                }
                return authService.requestOtp(map, str4, str5, str3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOtp");
        }

        public static /* synthetic */ Object updateDevice$default(AuthService authService, Map map, Object obj, d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                return authService.updateDevice(map, obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateDevice");
        }
    }

    @o("web-api/user-bidding/api/user/change-password")
    Object changePassword(@j Map<String, String> map, @a Object obj, d<? super k<Object>> dVar);

    @o("web-api/user-bidding/api/account/check-recover-password-code-with-email")
    Object checkOtpEmail(@j Map<String, String> map, @a Object obj, d<? super CheckRecover> dVar);

    @o("web-api/user-bidding/api/account/check-recover-password-code-with-phone")
    Object checkOtpPhone(@j Map<String, String> map, @a Object obj, d<? super CheckRecover> dVar);

    @f("web-api/user-bidding/api/user/get-profile")
    Object getProfile(@j Map<String, String> map, d<? super k<User>> dVar);

    @f("web-api/user-bidding/api/account/get-recover-password-code-with-mail")
    Object getRecoverWithMail(@j Map<String, String> map, @t("email") String str, d<? super k<Object>> dVar);

    @f("web-api/user-bidding/api/account/get-recover-password-code-with-phone")
    Object getRecoverWithPhone(@j Map<String, String> map, @t("phone") String str, d<? super k<Object>> dVar);

    @o("web-api/user-bidding/api/account/authenticate")
    Object login(@j Map<String, String> map, @a Object obj, d<? super k<Auth>> dVar);

    @o("web-api/user-bidding/api/account/mobile/logout")
    Object logout(@j Map<String, String> map, d<? super k<Object>> dVar);

    @o("web-api/user-bidding/api/account/recover-password-with-mail")
    Object recoverWithMail(@j Map<String, String> map, @a Object obj, d<? super k<Object>> dVar);

    @o("web-api/user-bidding/api/account/recover-password-with-phone")
    Object recoverWithPhone(@j Map<String, String> map, @a Object obj, d<? super k<Object>> dVar);

    @o("/web-api/user-bidding/api/account/mobile/authenticate-with-refresh-token")
    Object refreshToken(@j Map<String, String> map, @a Object obj, d<? super k<Auth>> dVar);

    @o("web-api/user-bidding/api/account/v2/register-person-basic-info")
    Object register(@j Map<String, String> map, @a Object obj, d<? super k<Auth>> dVar);

    @o("web-api/user-bidding/api/account/v2/register-org-basic-info")
    Object registerORG(@j Map<String, String> map, @a Object obj, d<? super k<Auth>> dVar);

    @f("web-api/user-bidding/api/account/get-phone-verification-code")
    Object requestOtp(@j Map<String, String> map, @t("phone") String str, @t("serviceCode") String str2, @t("timestamp") String str3, d<? super k<Object>> dVar);

    @o("web-api/user-bidding/api/user/update-user-device-information")
    Object updateDevice(@j Map<String, String> map, @a Object obj, d<? super k<Object>> dVar);

    @o("web-api/user-bidding/api/user/v2/update-org-profile")
    Object updateORGProfile(@j Map<String, String> map, @a Object obj, d<? super k<User>> dVar);

    @o("web-api/user-bidding/api/user/v2/update-person-profile")
    Object updatePersonProfile(@j Map<String, String> map, @a Object obj, d<? super k<User>> dVar);
}
