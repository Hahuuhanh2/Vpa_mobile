package y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class o implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        ArrayList<MethodInvocation> arrayList = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                arrayList = SafeParcelReader.j(parcel, readInt, MethodInvocation.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new TelemetryData(i10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new TelemetryData[i10];
    }
}
