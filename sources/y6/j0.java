package y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zzak;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class j0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                i10 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzak(i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzak[i10];
    }
}
