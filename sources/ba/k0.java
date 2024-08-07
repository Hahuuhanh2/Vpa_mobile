package ba;

import android.os.Parcelable;
import com.google.firebase.auth.internal.zzx;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class k0 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v14, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v16, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r18)
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r16 = r15
            r14 = 0
        L_0x0014:
            int r4 = r18.dataPosition()
            if (r4 >= r1) goto L_0x0093
            int r4 = r18.readInt()
            char r2 = (char) r4
            switch(r2) {
                case 1: goto L_0x0089;
                case 2: goto L_0x007f;
                case 3: goto L_0x007a;
                case 4: goto L_0x0075;
                case 5: goto L_0x006e;
                case 6: goto L_0x0069;
                case 7: goto L_0x0064;
                case 8: goto L_0x004a;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x0031;
                case 12: goto L_0x0026;
                default: goto L_0x0022;
            }
        L_0x0022:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.s(r4, r0)
            goto L_0x0014
        L_0x0026:
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzbd> r2 = com.google.firebase.auth.internal.zzbd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r0, r4, r2)
            r16 = r2
            com.google.firebase.auth.internal.zzbd r16 = (com.google.firebase.auth.internal.zzbd) r16
            goto L_0x0014
        L_0x0031:
            android.os.Parcelable$Creator<com.google.firebase.auth.zze> r2 = com.google.firebase.auth.zze.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r0, r4, r2)
            r15 = r2
            com.google.firebase.auth.zze r15 = (com.google.firebase.auth.zze) r15
            goto L_0x0014
        L_0x003b:
            boolean r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.l(r4, r0)
            goto L_0x0014
        L_0x0040:
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzz> r2 = com.google.firebase.auth.internal.zzz.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r0, r4, r2)
            r13 = r2
            com.google.firebase.auth.internal.zzz r13 = (com.google.firebase.auth.internal.zzz) r13
            goto L_0x0014
        L_0x004a:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r4, r0)
            if (r2 != 0) goto L_0x0052
            r12 = r3
            goto L_0x0014
        L_0x0052:
            r4 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.u(r0, r2, r4)
            int r2 = r18.readInt()
            if (r2 == 0) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            goto L_0x0014
        L_0x0064:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r4, r0)
            goto L_0x0014
        L_0x0069:
            java.util.ArrayList r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.h(r4, r0)
            goto L_0x0014
        L_0x006e:
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzt> r2 = com.google.firebase.auth.internal.zzt.CREATOR
            java.util.ArrayList r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.j(r0, r4, r2)
            goto L_0x0014
        L_0x0075:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r4, r0)
            goto L_0x0014
        L_0x007a:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r4, r0)
            goto L_0x0014
        L_0x007f:
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzt> r2 = com.google.firebase.auth.internal.zzt.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r0, r4, r2)
            r6 = r2
            com.google.firebase.auth.internal.zzt r6 = (com.google.firebase.auth.internal.zzt) r6
            goto L_0x0014
        L_0x0089:
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzahb> r2 = com.google.android.gms.internal.p001firebaseauthapi.zzahb.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r0, r4, r2)
            r5 = r2
            com.google.android.gms.internal.firebase-auth-api.zzahb r5 = (com.google.android.gms.internal.p001firebaseauthapi.zzahb) r5
            goto L_0x0014
        L_0x0093:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.k(r1, r0)
            com.google.firebase.auth.internal.zzx r0 = new com.google.firebase.auth.internal.zzx
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.k0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzx[i10];
    }
}
