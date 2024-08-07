package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p001firebaseauthapi.zzaia;
import com.google.firebase.auth.TotpMultiFactorInfo;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class p implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        zzaia zzaia = null;
        long j10 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 2) {
                str2 = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 3) {
                j10 = SafeParcelReader.p(readInt, parcel);
            } else if (c10 != 4) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                zzaia = (zzaia) SafeParcelReader.e(parcel, readInt, zzaia.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new TotpMultiFactorInfo(str, str2, j10, zzaia);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new TotpMultiFactorInfo[i10];
    }
}
