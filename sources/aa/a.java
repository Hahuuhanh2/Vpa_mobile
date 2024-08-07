package aa;

import android.net.Uri;
import com.google.android.gms.internal.p001firebaseauthapi.zzap;
import java.util.HashMap;
import java.util.Set;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f119c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f120a;

    /* renamed from: b  reason: collision with root package name */
    public final String f121b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        zzap.zzc(hashMap.entrySet());
    }

    public a(String str) {
        String a10 = a(str, "apiKey");
        String a11 = a(str, "oobCode");
        String a12 = a(str, "mode");
        if (a10 == null || a11 == null || a12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        j.c(a10);
        j.c(a11);
        this.f120a = a11;
        j.c(a12);
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f121b = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            j.c(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
