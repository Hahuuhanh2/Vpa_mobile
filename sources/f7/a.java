package f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zan;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        ArrayList<zal> arrayList = null;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                arrayList = SafeParcelReader.j(parcel, readInt, zal.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zan(i10, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zan[i10];
    }
}
