package l7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import k7.a;
import k7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class f extends zza {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final a m(b bVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        a m10 = a.C0135a.m(zzB.readStrongBinder());
        zzB.recycle();
        return m10;
    }

    public final a o(b bVar, String str, int i10, b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(8, zza);
        a m10 = a.C0135a.m(zzB.readStrongBinder());
        zzB.recycle();
        return m10;
    }

    public final a r(b bVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        a m10 = a.C0135a.m(zzB.readStrongBinder());
        zzB.recycle();
        return m10;
    }

    public final a x(b bVar, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        a m10 = a.C0135a.m(zzB.readStrongBinder());
        zzB.recycle();
        return m10;
    }
}
