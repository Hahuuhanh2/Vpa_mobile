package w;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import android.view.View;
import androidx.appcompat.app.p;
import androidx.fragment.app.h0;
import c3.e;
import com.google.firebase.perf.session.gauges.GaugeManager;
import da.g;
import f0.g0;
import h7.b;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import n0.j;
import p3.d;
import p3.o0;
import p3.r;
import tb.h;
import tb.i;
import ul.h;
import v8.a;
import w.f;
import x2.k;
import x2.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16242b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f16243c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f16244d;

    public /* synthetic */ o(int i10, Object obj, Object obj2, Object obj3) {
        this.f16241a = i10;
        this.f16242b = obj;
        this.f16243c = obj2;
        this.f16244d = obj3;
    }

    public final void run() {
        boolean z10;
        switch (this.f16241a) {
            case 0:
                b.a(((f.c) this.f16242b).f16207a, (CameraCaptureSession) this.f16243c, (Surface) this.f16244d);
                return;
            case 1:
                g0 g0Var = (g0) this.f16242b;
                g0.a aVar = (g0.a) this.f16243c;
                g0.a aVar2 = (g0.a) this.f16244d;
                if (aVar != null) {
                    g0Var.f9533a.i(aVar);
                }
                g0Var.f9533a.f(aVar2);
                return;
            case 2:
                Runnable runnable = (Runnable) this.f16243c;
                Runnable runnable2 = (Runnable) this.f16244d;
                if (((j) this.f16242b).f13347j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 3:
                Rect rect = (Rect) this.f16244d;
                sk.j.f((h0) this.f16242b, "$impl");
                sk.j.f(rect, "$lastInEpicenterRect");
                h0.g((View) this.f16243c, rect);
                return;
            case 4:
                k kVar = (k) this.f16242b;
                e eVar = (e) this.f16243c;
                sk.j.f(kVar, "this$0");
                sk.j.f(eVar, "$query");
                sk.j.f((l) this.f16244d, "$queryInterceptorProgram");
                kVar.getClass();
                eVar.h();
                throw null;
            case 5:
                r rVar = (r) this.f16242b;
                a aVar3 = (a) this.f16243c;
                o0 o0Var = (o0) this.f16244d;
                int i10 = r.f14010l;
                rVar.getClass();
                try {
                    z10 = ((Boolean) aVar3.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    z10 = true;
                }
                synchronized (rVar.f14021k) {
                    x3.l Q = al.g0.Q(o0Var.f13979c);
                    String str = Q.f17010a;
                    if (rVar.c(str) == o0Var) {
                        rVar.b(str);
                    }
                    o3.j.a().getClass();
                    Iterator it = rVar.f14020j.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).c(Q, z10);
                    }
                }
                return;
            case 6:
                ((da.f) this.f16242b).f8846a.execute(new p((Runnable) this.f16243c, (g.b) this.f16244d));
                return;
            case 7:
                ((GaugeManager) this.f16242b).lambda$startCollectingGauges$2((String) this.f16243c, (tb.d) this.f16244d);
                return;
            case 8:
                rb.d dVar = (rb.d) this.f16242b;
                lb.a aVar4 = rb.d.f14545y;
                dVar.getClass();
                i.a M = i.M();
                M.s();
                i.J((i) M.f7906b, (h) this.f16243c);
                dVar.e(M, (tb.d) this.f16244d);
                return;
            case 9:
                Pattern pattern = wb.f.f16776e;
                ((b) this.f16242b).a((String) this.f16243c, (wb.d) this.f16244d);
                return;
            default:
                ((ul.d) this.f16243c).c(h.a.this, (Throwable) this.f16244d);
                return;
        }
    }
}
