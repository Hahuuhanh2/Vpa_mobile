package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class g implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        zat zat = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                zat = (zat) SafeParcelReader.e(parcel, readInt, zat.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zai(i10, zat);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zai[i10];
    }
}
