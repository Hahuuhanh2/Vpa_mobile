package u6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzs;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class t implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 2) {
                iBinder = SafeParcelReader.n(readInt, parcel);
            } else if (c10 == 3) {
                z10 = SafeParcelReader.l(readInt, parcel);
            } else if (c10 != 4) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                z11 = SafeParcelReader.l(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzs(str, iBinder, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
