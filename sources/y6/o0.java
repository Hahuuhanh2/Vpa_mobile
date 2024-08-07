package y6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class o0 extends d0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f17579g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f17580h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(a aVar, int i10, IBinder iBinder, Bundle bundle) {
        super(aVar, i10, bundle);
        this.f17580h = aVar;
        this.f17579g = iBinder;
    }

    public final void c(ConnectionResult connectionResult) {
        if (this.f17580h.zzx != null) {
            ((v) this.f17580h.zzx).f17594a.r(connectionResult);
        }
        this.f17580h.onConnectionFailed(connectionResult);
    }

    public final boolean d() {
        try {
            IBinder iBinder = this.f17579g;
            j.f(iBinder);
            if (!this.f17580h.getServiceDescriptor().equals(iBinder.getInterfaceDescriptor())) {
                this.f17580h.getServiceDescriptor();
                return false;
            }
            IInterface createServiceInterface = this.f17580h.createServiceInterface(this.f17579g);
            if (createServiceInterface == null) {
                return false;
            }
            if (!a.zzn(this.f17580h, 2, 4, createServiceInterface) && !a.zzn(this.f17580h, 3, 4, createServiceInterface)) {
                return false;
            }
            this.f17580h.zzB = null;
            a aVar = this.f17580h;
            aVar.getConnectionHint();
            if (aVar.zzw != null) {
                ((u) this.f17580h.zzw).f17589a.o();
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
