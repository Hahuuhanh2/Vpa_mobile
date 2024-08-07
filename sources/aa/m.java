package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class m implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 2) {
                str2 = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 4) {
                str3 = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 5) {
                z10 = SafeParcelReader.l(readInt, parcel);
            } else if (c10 != 6) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                str4 = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new PhoneAuthCredential(str, str2, str3, str4, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new PhoneAuthCredential[i10];
    }
}
