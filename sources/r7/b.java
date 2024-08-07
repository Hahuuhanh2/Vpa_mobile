package r7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.signin.internal.zaa;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class b implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                i11 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zaa(i10, i11, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zaa[i10];
    }
}
