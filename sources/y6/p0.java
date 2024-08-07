package y6;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class p0 extends d0 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f17581g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(a aVar, int i10) {
        super(aVar, i10, (Bundle) null);
        this.f17581g = aVar;
    }

    public final void c(ConnectionResult connectionResult) {
        if (!this.f17581g.enableLocalFallback() || !a.zzo(this.f17581g)) {
            this.f17581g.zzc.a(connectionResult);
            this.f17581g.onConnectionFailed(connectionResult);
            return;
        }
        a.zzk(this.f17581g, 16);
    }

    public final boolean d() {
        this.f17581g.zzc.a(ConnectionResult.f5319e);
        return true;
    }
}
