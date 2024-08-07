package y6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class z implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                account = (Account) SafeParcelReader.e(parcel, readInt, Account.CREATOR);
            } else if (c10 == 3) {
                i11 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 != 4) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zat(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zat[i10];
    }
}
