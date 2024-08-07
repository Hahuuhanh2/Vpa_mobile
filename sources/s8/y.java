package s8;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public abstract class y extends k implements z {
    public y() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        l.b(parcel);
        b((Bundle) l.a(parcel, Bundle.CREATOR));
        return true;
    }
}
