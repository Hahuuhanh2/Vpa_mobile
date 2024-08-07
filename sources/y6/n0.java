package y6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class n0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f17577a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f17578b;

    public n0(a aVar, int i10) {
        this.f17578b = aVar;
        this.f17577a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g gVar;
        a aVar = this.f17578b;
        if (iBinder == null) {
            a.zzk(aVar, 16);
            return;
        }
        synchronized (aVar.zzq) {
            a aVar2 = this.f17578b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof g)) {
                gVar = new g0(iBinder);
            } else {
                gVar = (g) queryLocalInterface;
            }
            aVar2.zzr = gVar;
        }
        this.f17578b.zzl(0, (Bundle) null, this.f17577a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f17578b.zzq) {
            this.f17578b.zzr = null;
        }
        a aVar = this.f17578b;
        int i10 = this.f17577a;
        Handler handler = aVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
