package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class h implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        ConnectionResult connectionResult = null;
        int i10 = 0;
        zav zav = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                zav = (zav) SafeParcelReader.e(parcel, readInt, zav.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zak(i10, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zak[i10];
    }
}
