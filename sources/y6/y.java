package y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class y implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 2:
                    i11 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 3:
                    i12 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 4:
                    j10 = SafeParcelReader.p(readInt, parcel2);
                    break;
                case 5:
                    j11 = SafeParcelReader.p(readInt, parcel2);
                    break;
                case 6:
                    str = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 8:
                    i13 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 9:
                    i14 = SafeParcelReader.o(readInt, parcel2);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel2);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel2);
        return new MethodInvocation(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
