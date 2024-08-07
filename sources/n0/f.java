package n0;

import c0.d1;
import c0.o;
import c0.q0;
import c0.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import f0.q;
import f6.n;
import f6.s;
import java.util.List;
import n6.a;
import r0.d;
import v.l;
import vb.e;
import w.j;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements b.c, d1.e, a.C0164a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13328c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13329d;

    public /* synthetic */ f(int i10, Object obj, Object obj2, Object obj3) {
        this.f13326a = i10;
        this.f13327b = obj;
        this.f13328c = obj2;
        this.f13329d = obj3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(c0.d1.d r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f13327b
            androidx.camera.view.PreviewView$a r0 = (androidx.camera.view.PreviewView.a) r0
            java.lang.Object r1 = r7.f13328c
            f0.r r1 = (f0.r) r1
            java.lang.Object r2 = r7.f13329d
            c0.d1 r2 = (c0.d1) r2
            r0.getClass()
            java.util.Objects.toString(r8)
            java.lang.String r3 = "PreviewView"
            c0.p0.a(r3)
            f0.q r1 = r1.n()
            int r1 = r1.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x002b
            c0.p0.g(r3)
            goto L_0x0031
        L_0x002b:
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0033
        L_0x0031:
            r1 = r5
            goto L_0x0034
        L_0x0033:
            r1 = r4
        L_0x0034:
            androidx.camera.view.PreviewView r3 = androidx.camera.view.PreviewView.this
            androidx.camera.view.b r3 = r3.f1456c
            android.util.Size r2 = r2.f4214b
            r3.getClass()
            java.util.Objects.toString(r8)
            java.util.Objects.toString(r2)
            java.lang.String r6 = "PreviewTransform"
            c0.p0.a(r6)
            android.graphics.Rect r6 = r8.a()
            r3.f1488b = r6
            int r6 = r8.c()
            r3.f1489c = r6
            int r6 = r8.e()
            r3.f1491e = r6
            r3.f1487a = r2
            r3.f1492f = r1
            boolean r1 = r8.f()
            r3.f1493g = r1
            android.graphics.Matrix r1 = r8.d()
            r3.f1490d = r1
            int r8 = r8.e()
            r1 = -1
            if (r8 == r1) goto L_0x007f
            androidx.camera.view.PreviewView r8 = androidx.camera.view.PreviewView.this
            androidx.camera.view.c r1 = r8.f1455b
            if (r1 == 0) goto L_0x007c
            boolean r1 = r1 instanceof androidx.camera.view.d
            if (r1 == 0) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            r8.f1457d = r4
            goto L_0x0083
        L_0x007f:
            androidx.camera.view.PreviewView r8 = androidx.camera.view.PreviewView.this
            r8.f1457d = r5
        L_0x0083:
            androidx.camera.view.PreviewView r8 = androidx.camera.view.PreviewView.this
            r8.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.f.c(c0.d1$d):void");
    }

    public final Object d() {
        k6.a aVar = (k6.a) this.f13327b;
        s sVar = (s) this.f13328c;
        aVar.f12037d.C0(sVar, (n) this.f13329d);
        aVar.f12034a.a(sVar, 1);
        return null;
    }

    public final String e(b.a aVar) {
        switch (this.f13326a) {
            case 0:
                j jVar = (j) this.f13327b;
                jVar.getClass();
                jVar.f(new j(jVar, (x) this.f13328c, (o) this.f13329d, aVar, 2), new l(1));
                return "Init GlRenderer";
            default:
                o oVar = (o) this.f13328c;
                ((androidx.camera.view.a) this.f13327b).getClass();
                d dVar = new d(aVar, oVar);
                ((List) this.f13329d).add(dVar);
                ((q) oVar).g(j7.a.x(), dVar);
                return "waitForCaptureResult";
        }
    }

    public final Object then(Task task) {
        boolean z10;
        e eVar = (e) this.f13327b;
        Task task2 = (Task) this.f13328c;
        Task task3 = (Task) this.f13329d;
        eVar.getClass();
        if (!task2.isSuccessful() || task2.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        wb.d dVar = (wb.d) task2.getResult();
        if (task3.isSuccessful()) {
            wb.d dVar2 = (wb.d) task3.getResult();
            if (dVar2 == null || !dVar.f16767c.equals(dVar2.f16767c)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return Tasks.forResult(Boolean.FALSE);
            }
        }
        return eVar.f16146e.c(dVar).continueWith(eVar.f16144c, new q0(eVar, 14));
    }
}
