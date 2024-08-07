package y6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public abstract class f0 extends zzb {
    public f0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc.zzb(parcel);
            m0 m0Var = (m0) this;
            j.g(m0Var.f17575a, "onPostInitComplete can be called only once per call to getRemoteService");
            m0Var.f17575a.onPostInitHandler(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.zza(parcel, Bundle.CREATOR), m0Var.f17576b);
            m0Var.f17575a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i10 != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            zzk zzk = (zzk) zzc.zza(parcel, zzk.CREATOR);
            zzc.zzb(parcel);
            m0 m0Var2 = (m0) this;
            a aVar = m0Var2.f17575a;
            j.g(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            j.f(zzk);
            a.zzj(aVar, zzk);
            Bundle bundle2 = zzk.f5437a;
            j.g(m0Var2.f17575a, "onPostInitComplete can be called only once per call to getRemoteService");
            m0Var2.f17575a.onPostInitHandler(readInt, readStrongBinder, bundle2, m0Var2.f17576b);
            m0Var2.f17575a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
