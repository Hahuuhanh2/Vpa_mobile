package t6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class b implements Parcelable.Creator<CloudMessage> {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new CloudMessage(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new CloudMessage[i10];
    }
}
