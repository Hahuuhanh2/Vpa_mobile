package y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zax;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class b0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        Scope[] scopeArr = null;
        int i12 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                i12 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 3) {
                i11 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 4) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.i(parcel, readInt, Scope.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zax(i10, i12, i11, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zax[i10];
    }
}
