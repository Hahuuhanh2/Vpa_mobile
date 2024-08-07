package y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.GetServiceRequest;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class t0 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, getServiceRequest.f5391a);
        l0.b1(parcel, 2, getServiceRequest.f5392b);
        l0.b1(parcel, 3, getServiceRequest.f5393c);
        l0.f1(parcel, 4, getServiceRequest.f5394d);
        l0.a1(parcel, 5, getServiceRequest.f5395e);
        l0.i1(parcel, 6, getServiceRequest.f5396f, i10);
        l0.Y0(parcel, 7, getServiceRequest.f5397n);
        l0.e1(parcel, 8, getServiceRequest.f5398o, i10);
        l0.i1(parcel, 10, getServiceRequest.f5399p, i10);
        l0.i1(parcel, 11, getServiceRequest.f5400q, i10);
        l0.X0(parcel, 12, getServiceRequest.f5401r);
        l0.b1(parcel, 13, getServiceRequest.f5402s);
        l0.X0(parcel, 14, getServiceRequest.f5403t);
        l0.f1(parcel, 15, getServiceRequest.f5404u);
        l0.o1(n12, parcel);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r23)
            com.google.android.gms.common.api.Scope[] r2 = com.google.android.gms.common.internal.GetServiceRequest.f5389v
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.google.android.gms.common.Feature[] r4 = com.google.android.gms.common.internal.GetServiceRequest.f5390w
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x0025:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0093
            int r2 = r23.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x008e;
                case 2: goto L_0x0089;
                case 3: goto L_0x0084;
                case 4: goto L_0x007f;
                case 5: goto L_0x007a;
                case 6: goto L_0x0070;
                case 7: goto L_0x006b;
                case 8: goto L_0x0061;
                case 9: goto L_0x0033;
                case 10: goto L_0x0056;
                case 11: goto L_0x004b;
                case 12: goto L_0x0046;
                case 13: goto L_0x0041;
                case 14: goto L_0x003c;
                case 15: goto L_0x0037;
                default: goto L_0x0033;
            }
        L_0x0033:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.s(r2, r0)
            goto L_0x0025
        L_0x0037:
            java.lang.String r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x0025
        L_0x003c:
            boolean r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.l(r2, r0)
            goto L_0x0025
        L_0x0041:
            int r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r2, r0)
            goto L_0x0025
        L_0x0046:
            boolean r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.l(r2, r0)
            goto L_0x0025
        L_0x004b:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.i(r0, r2, r3)
            r17 = r2
            com.google.android.gms.common.Feature[] r17 = (com.google.android.gms.common.Feature[]) r17
            goto L_0x0025
        L_0x0056:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.i(r0, r2, r3)
            r16 = r2
            com.google.android.gms.common.Feature[] r16 = (com.google.android.gms.common.Feature[]) r16
            goto L_0x0025
        L_0x0061:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x0025
        L_0x006b:
            android.os.Bundle r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r2, r0)
            goto L_0x0025
        L_0x0070:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.i(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x0025
        L_0x007a:
            android.os.IBinder r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.n(r2, r0)
            goto L_0x0025
        L_0x007f:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r2, r0)
            goto L_0x0025
        L_0x0084:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r2, r0)
            goto L_0x0025
        L_0x0089:
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r2, r0)
            goto L_0x0025
        L_0x008e:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r2, r0)
            goto L_0x0025
        L_0x0093:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.k(r1, r0)
            com.google.android.gms.common.internal.GetServiceRequest r0 = new com.google.android.gms.common.internal.GetServiceRequest
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.t0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
