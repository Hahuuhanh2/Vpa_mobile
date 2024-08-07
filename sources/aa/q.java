package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.TwitterAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class q implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                str2 = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new TwitterAuthCredential(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new TwitterAuthCredential[i10];
    }
}
