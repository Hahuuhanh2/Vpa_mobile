package o7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class j implements Parcelable.Creator<SafeBrowsingData> {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j10 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 3) {
                dataHolder = (DataHolder) SafeParcelReader.e(parcel, readInt, DataHolder.CREATOR);
            } else if (c10 == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c10 == 5) {
                j10 = SafeParcelReader.p(readInt, parcel);
            } else if (c10 != 6) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                bArr = SafeParcelReader.c(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new SafeBrowsingData(str, dataHolder, parcelFileDescriptor, j10, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new SafeBrowsingData[i10];
    }
}
