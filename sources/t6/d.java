package t6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.zzd;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class d implements Parcelable.Creator<zzd> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzd(parcel.readStrongBinder());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzd[i10];
    }
}
