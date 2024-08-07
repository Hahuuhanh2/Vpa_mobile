package u6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzo;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class r implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 2:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 3:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 4:
                    iBinder = SafeParcelReader.n(readInt, parcel);
                    break;
                case 5:
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    z13 = SafeParcelReader.l(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzo(str, z10, z11, iBinder, z12, z13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
