package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class s implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 2:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 4:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 8:
                    str6 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 9:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 10:
                    str7 = SafeParcelReader.f(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new ActionCodeSettings(str, str2, str3, str4, z10, str5, z11, str6, i10, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActionCodeSettings[i10];
    }
}
