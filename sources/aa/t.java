package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class t implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        while (parcel.dataPosition() < t10) {
            SafeParcelReader.s(parcel.readInt(), parcel);
        }
        SafeParcelReader.k(t10, parcel);
        return new PhoneAuthProvider$ForceResendingToken();
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new PhoneAuthProvider$ForceResendingToken[i10];
    }
}
