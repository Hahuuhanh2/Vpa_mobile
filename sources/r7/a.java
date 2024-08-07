package r7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.c;
import q7.f;
import y6.b;
import y6.c;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a extends c<e> implements f {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f14515e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14516a = true;

    /* renamed from: b  reason: collision with root package name */
    public final b f14517b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f14518c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f14519d;

    public a(Context context, Looper looper, b bVar, Bundle bundle, c.a aVar, c.b bVar2) {
        super(context, looper, 44, bVar, aVar, bVar2);
        this.f14517b = bVar;
        this.f14518c = bundle;
        this.f14519d = bVar.f17541h;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new e(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f14517b.f17538e)) {
            this.f14518c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f14517b.f17538e);
        }
        return this.f14518c;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.f14516a;
    }
}
