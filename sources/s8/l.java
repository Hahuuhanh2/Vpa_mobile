package s8;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14691a = 0;

    static {
        l.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(a.m("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
