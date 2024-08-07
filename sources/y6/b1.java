package y6;

import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import k7.a;
import u6.m;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public abstract class b1 extends zzb implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f17546a = 0;

    public b1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            a zzd = ((m) this).zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = ((m) this).f15301b;
            parcel2.writeNoException();
            parcel2.writeInt(i12);
        }
        return true;
    }
}
