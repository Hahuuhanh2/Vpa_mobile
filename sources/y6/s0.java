package y6;

import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class s0 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r8 = r6
            r4 = r2
            r7 = r4
            r9 = r7
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0041
            int r1 = r11.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x0037;
                case 2: goto L_0x0032;
                case 3: goto L_0x002d;
                case 4: goto L_0x0028;
                case 5: goto L_0x0023;
                case 6: goto L_0x001e;
                default: goto L_0x001a;
            }
        L_0x001a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.s(r1, r11)
            goto L_0x000c
        L_0x001e:
            int[] r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r1, r11)
            goto L_0x000c
        L_0x0023:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r1, r11)
            goto L_0x000c
        L_0x0028:
            int[] r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r1, r11)
            goto L_0x000c
        L_0x002d:
            boolean r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.l(r1, r11)
            goto L_0x000c
        L_0x0032:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.l(r1, r11)
            goto L_0x000c
        L_0x0037:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.RootTelemetryConfiguration> r2 = com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.e(r11, r1, r2)
            r4 = r1
            com.google.android.gms.common.internal.RootTelemetryConfiguration r4 = (com.google.android.gms.common.internal.RootTelemetryConfiguration) r4
            goto L_0x000c
        L_0x0041:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.k(r0, r11)
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.s0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
