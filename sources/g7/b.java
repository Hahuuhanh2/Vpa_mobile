package g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class b implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int t10 = SafeParcelReader.t(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f10 = 0.0f;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 2:
                    j10 = SafeParcelReader.p(readInt, parcel2);
                    break;
                case 4:
                    str = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 5:
                    i12 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 6:
                    arrayList = SafeParcelReader.h(readInt, parcel2);
                    break;
                case 8:
                    j11 = SafeParcelReader.p(readInt, parcel2);
                    break;
                case 10:
                    str3 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 11:
                    i11 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 12:
                    str2 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 13:
                    str4 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 14:
                    i13 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 15:
                    SafeParcelReader.v(parcel2, readInt, 4);
                    f10 = parcel.readFloat();
                    break;
                case 16:
                    j12 = SafeParcelReader.p(readInt, parcel2);
                    break;
                case 17:
                    str5 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 18:
                    z10 = SafeParcelReader.l(readInt, parcel2);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel2);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel2);
        return new WakeLockEvent(i10, j10, i11, str, i12, arrayList, str2, j11, i13, str3, str4, f10, j12, str5, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new WakeLockEvent[i10];
    }
}
