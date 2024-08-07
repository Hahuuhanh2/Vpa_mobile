package w6;

import al.a0;
import al.k;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import ek.i;
import java.util.concurrent.Callable;
import lc.n;
import v6.e;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16622a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16623b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16624c;

    public /* synthetic */ l0(int i10, Object obj, Object obj2) {
        this.f16622a = i10;
        this.f16623b = obj;
        this.f16624c = obj2;
    }

    public final void run() {
        boolean z10;
        switch (this.f16622a) {
            case 1:
                try {
                    BasePendingResult.zaa.set(Boolean.TRUE);
                    ((y0) this.f16624c).getClass();
                    j.f((Object) null);
                    throw null;
                } catch (RuntimeException e10) {
                    w0 w0Var = ((y0) this.f16624c).f16681f;
                    w0Var.sendMessage(w0Var.obtainMessage(1, e10));
                    BasePendingResult.zaa.set(Boolean.FALSE);
                    y0.e((e) this.f16623b);
                    c cVar = (c) ((y0) this.f16624c).f16680e.get();
                    if (cVar != null) {
                        cVar.d();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    BasePendingResult.zaa.set(Boolean.FALSE);
                    y0.e((e) this.f16623b);
                    c cVar2 = (c) ((y0) this.f16624c).f16680e.get();
                    if (cVar2 != null) {
                        cVar2.d();
                    }
                    throw th2;
                }
            case 2:
                Callable callable = (Callable) this.f16623b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16624c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (MlKitException e11) {
                    taskCompletionSource.setException(e11);
                    return;
                } catch (Exception e12) {
                    taskCompletionSource.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", e12));
                    return;
                }
            case 3:
                n nVar = (n) this.f16623b;
                Runnable runnable = (Runnable) this.f16624c;
                if (((Thread) nVar.f12932d.getAndSet(Thread.currentThread())) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j.i(z10);
                try {
                    runnable.run();
                    nVar.f12932d.set((Object) null);
                    nVar.b();
                    return;
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th3});
                        break;
                    } catch (Exception unused) {
                        break;
                    }
                }
            default:
                ((k) this.f16624c).j((a0) this.f16623b, i.f20112a);
                return;
        }
        throw th;
    }

    public l0(y0 y0Var, e eVar) {
        this.f16622a = 1;
        this.f16624c = y0Var;
        this.f16623b = eVar;
    }
}
