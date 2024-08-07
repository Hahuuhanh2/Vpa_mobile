package s8;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public abstract class r extends k implements s {
    public r() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            l.b(parcel);
            e((Bundle) l.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 == 3) {
            l.b(parcel);
            c((Bundle) l.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 == 4) {
            l.b(parcel);
            d((Bundle) l.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 != 5) {
            return false;
        } else {
            l.b(parcel);
            b((Bundle) l.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
