package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.safetynet.zzf;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class h implements Parcelable.Creator<zzf> {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzf(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
