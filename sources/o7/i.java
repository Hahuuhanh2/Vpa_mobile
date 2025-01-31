package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.safetynet.zzh;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class i implements Parcelable.Creator<zzh> {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                z10 = SafeParcelReader.l(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzh(i10, z10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzh[i10];
    }
}
