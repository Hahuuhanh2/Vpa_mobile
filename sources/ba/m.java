package ba;

import a7.a;
import com.google.android.gms.internal.p001firebaseauthapi.zzzr;
import java.util.HashMap;
import vl.d;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4120a = new a("GetTokenResultFactory", new String[0]);

    public static d a(String str) {
        Object obj;
        try {
            obj = n.b(str);
        } catch (zzzr unused) {
            f4120a.a("Error parsing token claims", new Object[0]);
            obj = new HashMap();
        }
        return new d(6, str, obj);
    }
}
