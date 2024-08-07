package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;

/* compiled from: RemoteMessageCreator */
public final class t implements Parcelable.Creator<RemoteMessage> {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                bundle = SafeParcelReader.b(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new RemoteMessage(bundle);
    }

    public final Object[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
