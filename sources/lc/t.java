package lc;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f12943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f12944b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f12945c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Callable f12946d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12947e;

    public /* synthetic */ t(j jVar, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f12943a = jVar;
        this.f12944b = cancellationToken;
        this.f12945c = cancellationTokenSource;
        this.f12946d = callable;
        this.f12947e = taskCompletionSource;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        throw new com.google.mlkit.common.MlKitException("Internal error has occurred when executing ML Kit tasks", (java.lang.Exception) r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            lc.j r0 = r7.f12943a
            com.google.android.gms.tasks.CancellationToken r1 = r7.f12944b
            com.google.android.gms.tasks.CancellationTokenSource r2 = r7.f12945c
            java.util.concurrent.Callable r3 = r7.f12946d
            com.google.android.gms.tasks.TaskCompletionSource r4 = r7.f12947e
            r0.getClass()
            boolean r5 = r1.isCancellationRequested()
            if (r5 == 0) goto L_0x0017
            r2.cancel()
            goto L_0x0069
        L_0x0017:
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f12920c     // Catch:{ RuntimeException -> 0x0052 }
            boolean r5 = r5.get()     // Catch:{ RuntimeException -> 0x0052 }
            if (r5 != 0) goto L_0x0036
            r5 = r0
            qc.h r5 = (qc.h) r5     // Catch:{ RuntimeException -> 0x0052 }
            monitor-enter(r5)     // Catch:{ RuntimeException -> 0x0052 }
            qc.i r6 = r5.f14424e     // Catch:{ all -> 0x0033 }
            boolean r6 = r6.zzc()     // Catch:{ all -> 0x0033 }
            r5.f14428i = r6     // Catch:{ all -> 0x0033 }
            monitor-exit(r5)     // Catch:{ RuntimeException -> 0x0052 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f12920c     // Catch:{ RuntimeException -> 0x0052 }
            r5 = 1
            r0.set(r5)     // Catch:{ RuntimeException -> 0x0052 }
            goto L_0x0036
        L_0x0033:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ RuntimeException -> 0x0052 }
            throw r0     // Catch:{ RuntimeException -> 0x0052 }
        L_0x0036:
            boolean r0 = r1.isCancellationRequested()     // Catch:{ RuntimeException -> 0x0052 }
            if (r0 == 0) goto L_0x0040
            r2.cancel()     // Catch:{ RuntimeException -> 0x0052 }
            goto L_0x0069
        L_0x0040:
            java.lang.Object r0 = r3.call()     // Catch:{ RuntimeException -> 0x0052 }
            boolean r3 = r1.isCancellationRequested()     // Catch:{ Exception -> 0x005b }
            if (r3 == 0) goto L_0x004e
            r2.cancel()     // Catch:{ Exception -> 0x005b }
            goto L_0x0069
        L_0x004e:
            r4.setResult(r0)     // Catch:{ Exception -> 0x005b }
            goto L_0x0069
        L_0x0052:
            r0 = move-exception
            com.google.mlkit.common.MlKitException r3 = new com.google.mlkit.common.MlKitException     // Catch:{ Exception -> 0x005b }
            java.lang.String r5 = "Internal error has occurred when executing ML Kit tasks"
            r3.<init>((java.lang.String) r5, (java.lang.Exception) r0)     // Catch:{ Exception -> 0x005b }
            throw r3     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            r0 = move-exception
            boolean r1 = r1.isCancellationRequested()
            if (r1 == 0) goto L_0x0066
            r2.cancel()
            goto L_0x0069
        L_0x0066:
            r4.setException(r0)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.t.run():void");
    }
}
