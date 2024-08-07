package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.internal.zzz;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class c implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                j10 = SafeParcelReader.p(readInt, parcel);
            } else if (c10 != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                j11 = SafeParcelReader.p(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzz(j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzz[i10];
    }
}
