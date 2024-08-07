package p3;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import j7.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3.j;
import x3.s;
import x3.t;

/* compiled from: Schedulers */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14027a = 0;

    static {
        j.b("Schedulers");
    }

    public static void a(t tVar, a aVar, List list) {
        if (list.size() > 0) {
            aVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tVar.e(currentTimeMillis, ((s) it.next()).f17019a);
            }
        }
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<t> list) {
        if (list != null && list.size() != 0) {
            t u10 = workDatabase.u();
            workDatabase.c();
            ArrayList arrayList = null;
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList = u10.r();
                    a(u10, aVar.f3743c, arrayList);
                }
                ArrayList h10 = u10.h(aVar.f3750j);
                a(u10, aVar.f3743c, h10);
                if (arrayList != null) {
                    h10.addAll(arrayList);
                }
                ArrayList c10 = u10.c();
                workDatabase.n();
                workDatabase.j();
                if (h10.size() > 0) {
                    s[] sVarArr = (s[]) h10.toArray(new s[h10.size()]);
                    for (t next : list) {
                        if (next.a()) {
                            next.d(sVarArr);
                        }
                    }
                }
                if (c10.size() > 0) {
                    s[] sVarArr2 = (s[]) c10.toArray(new s[c10.size()]);
                    for (t next2 : list) {
                        if (!next2.a()) {
                            next2.d(sVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.j();
                throw th2;
            }
        }
    }
}
