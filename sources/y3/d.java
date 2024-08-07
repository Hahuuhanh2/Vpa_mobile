package y3;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import o3.j;
import o3.m;
import p3.j0;
import p3.o;
import p3.o0;
import p3.r;
import x3.b;
import x3.t;

/* compiled from: CancelWorkRunnable */
public abstract class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final o f17396a = new o();

    public static void a(j0 j0Var, String str) {
        o0 b10;
        WorkDatabase workDatabase = j0Var.f13939c;
        t u10 = workDatabase.u();
        b p10 = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            o3.o s10 = u10.s(str2);
            if (!(s10 == o3.o.SUCCEEDED || s10 == o3.o.FAILED)) {
                u10.v(str2);
            }
            linkedList.addAll(p10.a(str2));
        }
        r rVar = j0Var.f13942f;
        synchronized (rVar.f14021k) {
            j.a().getClass();
            rVar.f14019i.add(str);
            b10 = rVar.b(str);
        }
        r.d(b10, 1);
        for (p3.t b11 : j0Var.f13941e) {
            b11.b(str);
        }
    }

    public abstract void b();

    public final void run() {
        try {
            b();
            this.f17396a.a(m.f13686a);
        } catch (Throwable th2) {
            this.f17396a.a(new m.a.C0169a(th2));
        }
    }
}
