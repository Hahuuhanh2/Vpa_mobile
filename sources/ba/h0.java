package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.internal.zzp;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.zze;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class h0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        zzx zzx = null;
        zzp zzp = null;
        zze zze = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                zzx = (zzx) SafeParcelReader.e(parcel, readInt, zzx.CREATOR);
            } else if (c10 == 2) {
                zzp = (zzp) SafeParcelReader.e(parcel, readInt, zzp.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                zze = (zze) SafeParcelReader.e(parcel, readInt, zze.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzr(zzx, zzp, zze);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
