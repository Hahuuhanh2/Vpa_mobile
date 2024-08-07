package wb;

import h7.b;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONException;
import w.o;

/* compiled from: ConfigGetParameterHandler */
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f16776e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f16777f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f16778a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f16779b;

    /* renamed from: c  reason: collision with root package name */
    public final c f16780c;

    /* renamed from: d  reason: collision with root package name */
    public final c f16781d;

    static {
        Charset.forName("UTF-8");
    }

    public f(ScheduledExecutorService scheduledExecutorService, c cVar, c cVar2) {
        this.f16779b = scheduledExecutorService;
        this.f16780c = cVar;
        this.f16781d = cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return (wb.d) wb.c.a(r1.b(), java.util.concurrent.TimeUnit.SECONDS);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static wb.d b(wb.c r1) {
        /*
            monitor-enter(r1)
            com.google.android.gms.tasks.Task<wb.d> r0 = r1.f16762c     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isSuccessful()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.tasks.Task<wb.d> r0 = r1.f16762c     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.getResult()     // Catch:{ all -> 0x0026 }
            wb.d r0 = (wb.d) r0     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0025
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            com.google.android.gms.tasks.Task r1 = r1.b()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0024 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0024 }
            java.lang.Object r1 = wb.c.a(r1, r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0024 }
            r0 = r1
            wb.d r0 = (wb.d) r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.f.b(wb.c):wb.d");
    }

    public static HashSet c(c cVar) {
        HashSet hashSet = new HashSet();
        d b10 = b(cVar);
        if (b10 == null) {
            return hashSet;
        }
        Iterator<String> keys = b10.f16766b.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public static String d(c cVar, String str) {
        d b10 = b(cVar);
        if (b10 == null) {
            return null;
        }
        try {
            return b10.f16766b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void e(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str});
    }

    public final void a(d dVar, String str) {
        if (dVar != null) {
            synchronized (this.f16778a) {
                Iterator it = this.f16778a.iterator();
                while (it.hasNext()) {
                    this.f16779b.execute(new o(9, (b) it.next(), str, dVar));
                }
            }
        }
    }
}
