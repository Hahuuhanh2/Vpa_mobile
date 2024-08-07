package r6;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r21) {
        /*
            r20 = this;
            r0 = r21
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r21)
            r2 = 0
            r3 = 0
            r4 = 0
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r7 = r3
            r14 = r4
        L_0x001a:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L_0x006f
            int r2 = r21.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0065;
                case 3: goto L_0x0060;
                case 4: goto L_0x005b;
                case 5: goto L_0x0056;
                case 6: goto L_0x004c;
                case 7: goto L_0x0047;
                case 8: goto L_0x0042;
                case 9: goto L_0x003d;
                case 10: goto L_0x0036;
                case 11: goto L_0x0031;
                case 12: goto L_0x002c;
                default: goto L_0x0028;
            }
        L_0x0028:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.s(r2, r0)
            goto L_0x001a
        L_0x002c:
            java.lang.String r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x001a
        L_0x0031:
            java.lang.String r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x001a
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.j(r0, r2, r3)
            goto L_0x001a
        L_0x003d:
            java.lang.String r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x001a
        L_0x0042:
            long r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r2, r0)
            goto L_0x001a
        L_0x0047:
            java.lang.String r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x001a
        L_0x004c:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r0, r2, r3)
            r12 = r2
            android.net.Uri r12 = (android.net.Uri) r12
            goto L_0x001a
        L_0x0056:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x001a
        L_0x005b:
            java.lang.String r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x001a
        L_0x0060:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x001a
        L_0x0065:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x001a
        L_0x006a:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r2, r0)
            goto L_0x001a
        L_0x006f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.k(r1, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
