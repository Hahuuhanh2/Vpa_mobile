package d9;

import g9.b;
import g9.c;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w8.n;

/* compiled from: MonitoringUtil */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8783a = new a();

    /* compiled from: MonitoringUtil */
    public static class a implements b.a {
    }

    public static <P> c a(n<P> nVar) {
        w8.g gVar;
        ArrayList arrayList = new ArrayList();
        g9.a aVar = g9.a.f10398b;
        g9.a aVar2 = nVar.f16731c;
        Iterator<List<n.b<P>>> it = nVar.f16729a.values().iterator();
        while (true) {
            boolean z10 = true;
            if (it.hasNext()) {
                Iterator it2 = it.next().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        n.b bVar = (n.b) it2.next();
                        int ordinal = bVar.f16739d.ordinal();
                        if (ordinal == 1) {
                            gVar = w8.g.f16718b;
                        } else if (ordinal == 2) {
                            gVar = w8.g.f16719c;
                        } else if (ordinal == 3) {
                            gVar = w8.g.f16720d;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                        int i10 = bVar.f16741f;
                        String str = bVar.f16742g;
                        if (str.startsWith("type.googleapis.com/google.crypto.")) {
                            str = str.substring(34);
                        }
                        arrayList.add(new c.a(gVar, i10, str, bVar.f16740e.name()));
                    }
                }
            } else {
                n.b<P> bVar2 = nVar.f16730b;
                Integer num = null;
                if (bVar2 != null) {
                    num = Integer.valueOf(bVar2.f16741f);
                }
                if (num != null) {
                    try {
                        int intValue = num.intValue();
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((c.a) it3.next()).f10404b == intValue) {
                                    break;
                                }
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (!z10) {
                            throw new GeneralSecurityException("primary key ID is not present in entries");
                        }
                    } catch (GeneralSecurityException e10) {
                        throw new IllegalStateException(e10);
                    }
                }
                return new c(aVar2, Collections.unmodifiableList(arrayList), num);
            }
        }
    }
}
