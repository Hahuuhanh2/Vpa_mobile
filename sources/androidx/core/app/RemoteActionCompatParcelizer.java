package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f2104a;
        if (versionedParcel.h(1)) {
            obj = versionedParcel.m();
        }
        remoteActionCompat.f2104a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f2105b;
        if (versionedParcel.h(2)) {
            charSequence = versionedParcel.g();
        }
        remoteActionCompat.f2105b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2106c;
        if (versionedParcel.h(3)) {
            charSequence2 = versionedParcel.g();
        }
        remoteActionCompat.f2106c = charSequence2;
        Object obj2 = remoteActionCompat.f2107d;
        if (versionedParcel.h(4)) {
            obj2 = versionedParcel.k();
        }
        remoteActionCompat.f2107d = (PendingIntent) obj2;
        boolean z10 = remoteActionCompat.f2108e;
        if (versionedParcel.h(5)) {
            z10 = versionedParcel.e();
        }
        remoteActionCompat.f2108e = z10;
        boolean z11 = remoteActionCompat.f2109f;
        if (versionedParcel.h(6)) {
            z11 = versionedParcel.e();
        }
        remoteActionCompat.f2109f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        IconCompat iconCompat = remoteActionCompat.f2104a;
        versionedParcel.n(1);
        versionedParcel.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2105b;
        versionedParcel.n(2);
        versionedParcel.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f2106c;
        versionedParcel.n(3);
        versionedParcel.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f2107d;
        versionedParcel.n(4);
        versionedParcel.t(pendingIntent);
        boolean z10 = remoteActionCompat.f2108e;
        versionedParcel.n(5);
        versionedParcel.o(z10);
        boolean z11 = remoteActionCompat.f2109f;
        versionedParcel.n(6);
        versionedParcel.o(z11);
    }
}
