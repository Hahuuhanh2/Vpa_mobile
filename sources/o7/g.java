package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.zzd;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class g implements Parcelable.Creator<zzd> {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        boolean z10 = false;
        long j10 = 0;
        HarmfulAppsData[] harmfulAppsDataArr = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                j10 = SafeParcelReader.p(readInt, parcel);
            } else if (c10 == 3) {
                harmfulAppsDataArr = (HarmfulAppsData[]) SafeParcelReader.i(parcel, readInt, HarmfulAppsData.CREATOR);
            } else if (c10 == 4) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 5) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                z10 = SafeParcelReader.l(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzd(j10, harmfulAppsDataArr, i10, z10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzd[i10];
    }
}
