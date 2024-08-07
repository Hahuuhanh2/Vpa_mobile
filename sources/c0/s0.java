package c0;

import android.content.Context;
import android.view.View;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.a;
import androidx.emoji2.text.d;
import androidx.emoji2.text.e;
import androidx.emoji2.text.g;
import androidx.fragment.app.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import da.f;
import da.g;
import ia.o0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import n0.u;
import n0.x;
import sk.j;
import tb.i;
import ul.h;
import ul.y;
import x2.k;
import x2.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4325a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4326b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4327c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f4328d;

    public /* synthetic */ s0(int i10, Object obj, Object obj2, Object obj3) {
        this.f4325a = i10;
        this.f4327c = obj;
        this.f4326b = obj2;
        this.f4328d = obj3;
    }

    public final void run() {
        switch (this.f4325a) {
            case 1:
                ((x) this.f4327c).a((u) this.f4326b, (Map.Entry) this.f4328d);
                return;
            case 2:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f4327c;
                d.h hVar = (d.h) this.f4326b;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f4328d;
                bVar.getClass();
                try {
                    g a10 = a.a(bVar.f2375a);
                    if (a10 != null) {
                        g.b bVar2 = (g.b) a10.f2392a;
                        synchronized (bVar2.f2412d) {
                            bVar2.f2414f = threadPoolExecutor;
                        }
                        a10.f2392a.a(new e(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    hVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                androidx.fragment.app.d dVar = (androidx.fragment.app.d) this.f4327c;
                d.a aVar = (d.a) this.f4328d;
                j.f(dVar, "this$0");
                j.f(aVar, "$animationInfo");
                dVar.f2663a.endViewTransition((View) this.f4326b);
                aVar.a();
                return;
            case 4:
                k kVar = (k) this.f4327c;
                c3.e eVar = (c3.e) this.f4326b;
                j.f(kVar, "this$0");
                j.f(eVar, "$query");
                j.f((l) this.f4328d, "$queryInterceptorProgram");
                kVar.getClass();
                eVar.h();
                throw null;
            case 5:
                ((f) this.f4327c).f8846a.execute(new v.f(24, (Runnable) this.f4326b, (g.b) this.f4328d));
                return;
            case 6:
                Callable callable = (Callable) this.f4327c;
                Executor executor = (Executor) this.f4326b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4328d;
                ExecutorService executorService = o0.f11348a;
                try {
                    ((Task) callable.call()).continueWith(executor, new ca.a(taskCompletionSource, 18));
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 7:
                ((SessionManager) this.f4327c).lambda$setApplicationContext$0((Context) this.f4326b, (PerfSession) this.f4328d);
                return;
            case 8:
                ((GaugeManager) this.f4327c).lambda$stopCollectingGauges$3((String) this.f4326b, (tb.d) this.f4328d);
                return;
            case 9:
                rb.d dVar2 = (rb.d) this.f4327c;
                lb.a aVar2 = rb.d.f14545y;
                dVar2.getClass();
                i.a M = i.M();
                M.s();
                i.H((i) M.f7906b, (tb.g) this.f4326b);
                dVar2.e(M, (tb.d) this.f4328d);
                return;
            default:
                h.a.C0310a aVar3 = (h.a.C0310a) this.f4327c;
                ul.d dVar3 = (ul.d) this.f4326b;
                y yVar = (y) this.f4328d;
                if (h.a.this.f23111b.h()) {
                    dVar3.c(h.a.this, new IOException("Canceled"));
                    return;
                } else {
                    dVar3.a(h.a.this, yVar);
                    return;
                }
        }
    }
}
