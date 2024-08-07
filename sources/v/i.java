package v;

import android.content.Context;
import android.content.Intent;
import android.util.Size;
import android.view.View;
import androidx.camera.view.c;
import androidx.camera.view.d;
import androidx.fragment.app.l0;
import c0.d1;
import c0.p0;
import c0.q0;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import da.g;
import f0.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;
import kh.h;
import lb.a;
import sk.j;
import tb.i;
import tb.m;
import v.o;
import we.b;
import x2.k;
import zg.a0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15704a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15705b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15706c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f15707d;

    public /* synthetic */ i(int i10, Object obj, Object obj2, Object obj3) {
        this.f15704a = i10;
        this.f15705b = obj;
        this.f15706c = obj2;
        this.f15707d = obj3;
    }

    public final void run() {
        switch (this.f15704a) {
            case 0:
                f fVar = (f) this.f15707d;
                o.a aVar = ((o) this.f15705b).f15778x;
                aVar.f15779a.add(fVar);
                aVar.f15780b.put(fVar, (Executor) this.f15706c);
                return;
            case 2:
                d1 d1Var = (d1) this.f15706c;
                c.a aVar2 = (c.a) this.f15707d;
                d.b bVar = ((d) this.f15705b).f1500f;
                bVar.a();
                if (bVar.f1507n) {
                    bVar.f1507n = false;
                    d1Var.b();
                    d1Var.f4219g.a(null);
                    return;
                }
                bVar.f1502b = d1Var;
                bVar.f1504d = aVar2;
                Size size = d1Var.f4214b;
                bVar.f1501a = size;
                bVar.f1506f = false;
                if (!bVar.b()) {
                    p0.a("SurfaceViewImpl");
                    d.this.f1499e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    return;
                }
                return;
            case 3:
                List list = (List) this.f15705b;
                l0.b bVar2 = (l0.b) this.f15706c;
                j.f(list, "$awaitingContainerChanges");
                j.f(bVar2, "$operation");
                j.f((androidx.fragment.app.d) this.f15707d, "this$0");
                if (list.contains(bVar2)) {
                    list.remove(bVar2);
                    View view = bVar2.f2671c.L;
                    l0.b.C0024b bVar3 = bVar2.f2669a;
                    j.e(view, "view");
                    bVar3.b(view);
                    return;
                }
                return;
            case 4:
                k kVar = (k) this.f15705b;
                j.f(kVar, "this$0");
                j.f((String) this.f15706c, "$sql");
                j.f((List) this.f15707d, "$inputArguments");
                kVar.getClass();
                throw null;
            case 5:
                ((da.f) this.f15705b).f8846a.execute(new n(26, (Runnable) this.f15706c, (g.b) this.f15707d));
                return;
            case 6:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.f15705b;
                Intent intent = (Intent) this.f15706c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15707d;
                int i10 = EnhancedIntentService.f7575f;
                enhancedIntentService.getClass();
                try {
                    enhancedIntentService.c(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 7:
                rb.d dVar = (rb.d) this.f15705b;
                a aVar3 = rb.d.f14545y;
                dVar.getClass();
                i.a M = tb.i.M();
                M.s();
                tb.i.I((tb.i) M.f7906b, (m) this.f15706c);
                dVar.e(M, (tb.d) this.f15707d);
                return;
            case 8:
                String str = (String) this.f15705b;
                ph.a aVar4 = (ph.a) this.f15706c;
                Context context = (Context) this.f15707d;
                j.f(aVar4, "this$0");
                j.f(context, "$context");
                try {
                    b.d(new i(9, aVar4, new URL(str).openStream(), context));
                    return;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                ph.a aVar5 = (ph.a) this.f15705b;
                Context context2 = (Context) this.f15707d;
                j.f(aVar5, "this$0");
                j.f(context2, "$context");
                PDFView pDFView = (PDFView) aVar5.f22642i.f21381f;
                pDFView.getClass();
                PDFView.a aVar6 = new PDFView.a(new z.j((InputStream) this.f15706c, 5));
                aVar6.f5067k = null;
                aVar6.f5064h = 0;
                aVar6.f5058b = true;
                aVar6.f5065i = false;
                aVar6.f5059c = true;
                aVar6.f5063g = new q0(context2, 18);
                aVar6.f5060d = new a0(5);
                aVar6.f5062f = new h(2);
                aVar6.f5061e = new q0(aVar5, 19);
                aVar6.f5069m = 0;
                aVar6.f5066j = false;
                aVar6.f5068l = true;
                aVar6.a();
                ((PDFView) aVar5.f22642i.f21381f).r();
                ((PDFView) aVar5.f22642i.f21381f).S = true;
                return;
        }
    }
}
