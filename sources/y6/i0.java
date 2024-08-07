package y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class i0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                z10 = SafeParcelReader.l(readInt, parcel);
            } else if (c10 == 3) {
                z11 = SafeParcelReader.l(readInt, parcel);
            } else if (c10 == 4) {
                i11 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 5) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                i12 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new RootTelemetryConfiguration(i10, z10, z11, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new RootTelemetryConfiguration[i10];
    }
}
