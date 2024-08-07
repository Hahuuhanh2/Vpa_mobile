package w6;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f16593a;

    public e1(int i10) {
        this.f16593a = i10;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), (PendingIntent) null, (ConnectionResult) null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(b0 b0Var);

    public abstract void d(s sVar, boolean z10);
}
