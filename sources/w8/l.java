package w8;

import f0.b0;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: KmsClients */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<k> f16728a = new CopyOnWriteArrayList<>();

    public static k a(String str) {
        Iterator<k> it = f16728a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(b0.r("No KMS client does support: ", str));
    }
}
