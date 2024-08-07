package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PlayGamesAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class o implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new PlayGamesAuthCredential(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayGamesAuthCredential[i10];
    }
}
