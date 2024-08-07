package ba;

import android.os.Parcelable;
import com.google.firebase.auth.internal.zzag;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class f implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x000a:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x004a
            int r1 = r10.readInt()
            char r2 = (char) r1
            r8 = 1
            if (r2 == r8) goto L_0x0045
            r8 = 2
            if (r2 == r8) goto L_0x0040
            r8 = 3
            if (r2 == r8) goto L_0x0039
            r8 = 4
            if (r2 == r8) goto L_0x0032
            r8 = 5
            if (r2 == r8) goto L_0x0028
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.s(r1, r10)
            goto L_0x000a
        L_0x0028:
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzx> r2 = com.google.firebase.auth.internal.zzx.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r10, r1, r2)
            r7 = r1
            com.google.firebase.auth.internal.zzx r7 = (com.google.firebase.auth.internal.zzx) r7
            goto L_0x000a
        L_0x0032:
            android.os.Parcelable$Creator<com.google.firebase.auth.TotpMultiFactorInfo> r2 = com.google.firebase.auth.TotpMultiFactorInfo.CREATOR
            java.util.ArrayList r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.j(r10, r1, r2)
            goto L_0x000a
        L_0x0039:
            android.os.Parcelable$Creator<com.google.firebase.auth.PhoneMultiFactorInfo> r2 = com.google.firebase.auth.PhoneMultiFactorInfo.CREATOR
            java.util.ArrayList r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.j(r10, r1, r2)
            goto L_0x000a
        L_0x0040:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r1, r10)
            goto L_0x000a
        L_0x0045:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r1, r10)
            goto L_0x000a
        L_0x004a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.k(r0, r10)
            com.google.firebase.auth.internal.zzag r10 = new com.google.firebase.auth.internal.zzag
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.f.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzag[i10];
    }
}
