package y6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zzk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class r0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i10 = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                bundle = SafeParcelReader.b(readInt, parcel);
            } else if (c10 == 2) {
                featureArr = (Feature[]) SafeParcelReader.i(parcel, readInt, Feature.CREATOR);
            } else if (c10 == 3) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 4) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.e(parcel, readInt, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzk(bundle, featureArr, i10, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
