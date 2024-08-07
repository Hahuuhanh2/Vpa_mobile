package t6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public abstract class o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f14869a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<T> f14870b = new TaskCompletionSource<>();

    /* renamed from: c  reason: collision with root package name */
    public final int f14871c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f14872d;

    public o(int i10, int i11, Bundle bundle) {
        this.f14869a = i10;
        this.f14871c = i11;
        this.f14872d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzq);
            new StringBuilder(valueOf.length() + 14 + valueOf2.length());
        }
        this.f14870b.setException(zzq);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle);
            new StringBuilder(valueOf.length() + 16 + valueOf2.length());
        }
        this.f14870b.setResult(bundle);
    }

    public final String toString() {
        int i10 = this.f14871c;
        int i11 = this.f14869a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(b());
        sb2.append("}");
        return sb2.toString();
    }
}
