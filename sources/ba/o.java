package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzbd;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class o implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        ArrayList<PhoneMultiFactorInfo> arrayList = null;
        ArrayList<TotpMultiFactorInfo> arrayList2 = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = SafeParcelReader.j(parcel, readInt, PhoneMultiFactorInfo.CREATOR);
            } else if (c10 != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                arrayList2 = SafeParcelReader.j(parcel, readInt, TotpMultiFactorInfo.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzbd(arrayList, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbd[i10];
    }
}
