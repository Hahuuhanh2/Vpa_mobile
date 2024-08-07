package ab;

import cb.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import f0.b0;

/* compiled from: GetAuthTokenListener */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final i f156a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<f> f157b;

    public d(i iVar, TaskCompletionSource<f> taskCompletionSource) {
        this.f156a = iVar;
        this.f157b = taskCompletionSource;
    }

    public final boolean a(a aVar) {
        boolean z10;
        String str;
        if (aVar.f() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || this.f156a.b(aVar)) {
            return false;
        }
        TaskCompletionSource<f> taskCompletionSource = this.f157b;
        String str2 = aVar.f4669d;
        if (str2 != null) {
            Long valueOf = Long.valueOf(aVar.f4671f);
            Long valueOf2 = Long.valueOf(aVar.f4672g);
            if (valueOf == null) {
                str = " tokenExpirationTimestamp";
            } else {
                str = "";
            }
            if (valueOf2 == null) {
                str = b0.r(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                taskCompletionSource.setResult(new a(str2, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException(b0.r("Missing required properties:", str));
        }
        throw new NullPointerException("Null token");
    }

    public final boolean b(Exception exc) {
        this.f157b.trySetException(exc);
        return true;
    }
}
