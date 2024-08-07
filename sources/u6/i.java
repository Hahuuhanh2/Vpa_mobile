package u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class i implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        long j10 = -1;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 2) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                j10 = SafeParcelReader.p(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new Feature(str, j10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Feature[i10];
    }
}
