package v6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class j implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new Scope(i10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}