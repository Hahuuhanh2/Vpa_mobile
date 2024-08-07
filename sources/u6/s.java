package u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzq;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class s implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = SafeParcelReader.l(readInt, parcel);
            } else if (c10 == 2) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 3) {
                i11 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 4) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                i10 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzq(i11, i10, str, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
