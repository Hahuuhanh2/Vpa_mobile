package z6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.base.zaf;
import w6.j;
import y6.b;
import y6.c;
import y6.m;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public final m f17892a;

    public d(Context context, Looper looper, b bVar, m mVar, w6.c cVar, j jVar) {
        super(context, looper, 270, bVar, cVar, jVar);
        this.f17892a = mVar;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return zaf.zab;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        m mVar = this.f17892a;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String str = mVar.f17573a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final int getMinApkVersion() {
        return 203400000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }
}
