package f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class c implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        Parcel parcel2 = null;
        zan zan = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                int r10 = SafeParcelReader.r(readInt, parcel);
                int dataPosition = parcel.dataPosition();
                if (r10 == 0) {
                    parcel2 = null;
                } else {
                    Parcel obtain = Parcel.obtain();
                    obtain.appendFrom(parcel, dataPosition, r10);
                    parcel.setDataPosition(dataPosition + r10);
                    parcel2 = obtain;
                }
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                zan = (zan) SafeParcelReader.e(parcel, readInt, zan.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new SafeParcelResponse(i10, parcel2, zan);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SafeParcelResponse[i10];
    }
}
