package y6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import k7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class a1 extends zza implements e0 {
    public a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final a zzd() {
        Parcel zzB = zzB(1, zza());
        a m10 = a.C0135a.m(zzB.readStrongBinder());
        zzB.recycle();
        return m10;
    }
}
