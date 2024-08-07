package ba;

import android.os.Parcelable;
import com.google.firebase.auth.internal.zzae;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class e implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.Parcelable] */
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
            r8 = r7
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x004e
            int r1 = r10.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x0047;
                case 2: goto L_0x003d;
                case 3: goto L_0x0038;
                case 4: goto L_0x002e;
                case 5: goto L_0x0024;
                case 6: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.s(r1, r10)
            goto L_0x000b
        L_0x001d:
            android.os.Parcelable$Creator<com.google.firebase.auth.TotpMultiFactorInfo> r2 = com.google.firebase.auth.TotpMultiFactorInfo.CREATOR
            java.util.ArrayList r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.j(r10, r1, r2)
            goto L_0x000b
        L_0x0024:
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzx> r2 = com.google.firebase.auth.internal.zzx.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r10, r1, r2)
            r7 = r1
            com.google.firebase.auth.internal.zzx r7 = (com.google.firebase.auth.internal.zzx) r7
            goto L_0x000b
        L_0x002e:
            android.os.Parcelable$Creator<com.google.firebase.auth.zze> r2 = com.google.firebase.auth.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r10, r1, r2)
            r6 = r1
            com.google.firebase.auth.zze r6 = (com.google.firebase.auth.zze) r6
            goto L_0x000b
        L_0x0038:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r1, r10)
            goto L_0x000b
        L_0x003d:
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzag> r2 = com.google.firebase.auth.internal.zzag.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r10, r1, r2)
            r4 = r1
            com.google.firebase.auth.internal.zzag r4 = (com.google.firebase.auth.internal.zzag) r4
            goto L_0x000b
        L_0x0047:
            android.os.Parcelable$Creator<com.google.firebase.auth.PhoneMultiFactorInfo> r2 = com.google.firebase.auth.PhoneMultiFactorInfo.CREATOR
            java.util.ArrayList r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.j(r10, r1, r2)
            goto L_0x000b
        L_0x004e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.k(r0, r10)
            com.google.firebase.auth.internal.zzae r10 = new com.google.firebase.auth.internal.zzae
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzae[i10];
    }
}
