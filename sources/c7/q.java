package c7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.base.zav;
import w6.j;
import y6.b;
import y6.c;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class q extends c {
    public q(Context context, Looper looper, b bVar, w6.c cVar, j jVar) {
        super(context, looper, 308, bVar, cVar, jVar);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof h) {
            return (h) queryLocalInterface;
        }
        return new h(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return zav.zab;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
