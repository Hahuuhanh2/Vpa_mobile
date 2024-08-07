package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class e implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        Long l10 = null;
        Long l11 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                i11 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 3) {
                l10 = SafeParcelReader.q(readInt, parcel);
            } else if (c10 == 4) {
                l11 = SafeParcelReader.q(readInt, parcel);
            } else if (c10 != 5) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                i12 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new ModuleInstallStatusUpdate(i10, i11, l10, l11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallStatusUpdate[i10];
    }
}
