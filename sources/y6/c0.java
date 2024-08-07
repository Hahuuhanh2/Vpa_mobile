package y6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.base.zac;
import f0.b0;
import k7.a;
import k7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class c0 extends RemoteCreator {

    /* renamed from: c  reason: collision with root package name */
    public static final c0 f17547c = new c0();

    public static View c(Context context, int i10, int i11) {
        c0 c0Var = f17547c;
        try {
            zax zax = new zax(1, i10, i11, (Scope[]) null);
            b bVar = new b(context);
            x xVar = (x) c0Var.b(context);
            Parcel zaa = xVar.zaa();
            zac.zae(zaa, bVar);
            zac.zad(zaa, zax);
            Parcel zab = xVar.zab(2, zaa);
            a m10 = a.C0135a.m(zab.readStrongBinder());
            zab.recycle();
            return (View) b.o(m10);
        } catch (Exception e10) {
            throw new RemoteCreator.RemoteCreatorException(b0.p("Could not get button with size ", i10, " and color ", i11), e10);
        }
    }

    public final /* synthetic */ x a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof x) {
            return (x) queryLocalInterface;
        }
        return new x(iBinder);
    }
}
