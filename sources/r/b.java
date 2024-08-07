package r;

import android.app.PendingIntent;
import android.os.IBinder;
import b.a;

/* compiled from: CustomTabsSessionToken */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f14451a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f14452b;

    public b(a aVar, PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f14451a = aVar;
        this.f14452b = pendingIntent;
    }

    public final IBinder a() {
        a aVar = this.f14451a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        PendingIntent pendingIntent = bVar.f14452b;
        PendingIntent pendingIntent2 = this.f14452b;
        boolean z11 = true;
        if (pendingIntent2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (pendingIntent != null) {
            z11 = false;
        }
        if (z10 != z11) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        return a().equals(bVar.a());
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f14452b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return a().hashCode();
    }
}
