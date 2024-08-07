package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.safetynet.HarmfulAppsData;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class f implements Parcelable.Creator<HarmfulAppsData> {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        int i10 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 3) {
                bArr = SafeParcelReader.c(readInt, parcel);
            } else if (c10 != 4) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                i10 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new HarmfulAppsData(str, bArr, i10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new HarmfulAppsData[i10];
    }
}
