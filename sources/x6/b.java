package x6;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class b implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                strArr = SafeParcelReader.g(readInt, parcel);
            } else if (c10 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.i(parcel, readInt, CursorWindow.CREATOR);
            } else if (c10 == 3) {
                i12 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 4) {
                bundle = SafeParcelReader.b(readInt, parcel);
            } else if (c10 != 1000) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                i11 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        DataHolder dataHolder = new DataHolder(i11, strArr, cursorWindowArr, i12, bundle);
        dataHolder.f5368c = new Bundle();
        int i13 = 0;
        while (true) {
            String[] strArr2 = dataHolder.f5367b;
            if (i13 >= strArr2.length) {
                break;
            }
            dataHolder.f5368c.putInt(strArr2[i13], i13);
            i13++;
        }
        dataHolder.f5372n = new int[dataHolder.f5369d.length];
        int i14 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = dataHolder.f5369d;
            if (i10 >= cursorWindowArr2.length) {
                return dataHolder;
            }
            dataHolder.f5372n[i10] = i14;
            i14 += dataHolder.f5369d[i10].getNumRows() - (i14 - cursorWindowArr2[i10].getStartPosition());
            i10++;
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
