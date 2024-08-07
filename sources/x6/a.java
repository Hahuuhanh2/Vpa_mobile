package x6;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i11 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                i11 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new BitmapTeleporter(i10, parcelFileDescriptor, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new BitmapTeleporter[i10];
    }
}
