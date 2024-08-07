package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzif;
import com.google.android.recaptcha.internal.zzig;
import f0.b0;
import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzig<MessageType extends zzig<MessageType, BuilderType>, BuilderType extends zzif<MessageType, BuilderType>> implements zzlx {
    public int zza = 0;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzc(java.lang.Iterable r6, java.util.List r7) {
        /*
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzla.zza
            r6.getClass()
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzlj
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            if (r0 == 0) goto L_0x0064
            com.google.android.recaptcha.internal.zzlj r6 = (com.google.android.recaptcha.internal.zzlj) r6
            java.util.List r6 = r6.zza()
            r0 = r7
            com.google.android.recaptcha.internal.zzlj r0 = (com.google.android.recaptcha.internal.zzlj) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x001e:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x00ae
            java.lang.Object r3 = r6.next()
            if (r3 != 0) goto L_0x0045
            int r6 = r0.size()
            int r6 = r6 - r7
            java.lang.String r6 = v.v.d(r2, r6, r1)
            int r1 = r0.size()
        L_0x0037:
            int r1 = r1 + -1
            if (r1 < r7) goto L_0x003f
            r0.remove(r1)
            goto L_0x0037
        L_0x003f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x0045:
            boolean r4 = r3 instanceof com.google.android.recaptcha.internal.zziv
            if (r4 == 0) goto L_0x004f
            com.google.android.recaptcha.internal.zziv r3 = (com.google.android.recaptcha.internal.zziv) r3
            r0.zzb()
            goto L_0x001e
        L_0x004f:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L_0x005e
            r4 = 0
            byte[] r3 = (byte[]) r3
            int r5 = r3.length
            com.google.android.recaptcha.internal.zziv.zzk(r3, r4, r5)
            r0.zzb()
            goto L_0x001e
        L_0x005e:
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            goto L_0x001e
        L_0x0064:
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzmf
            if (r0 != 0) goto L_0x00af
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x007b
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r7.size()
            int r4 = r6.size()
            int r4 = r4 + r3
            r0.ensureCapacity(r4)
        L_0x007b:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0083:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x00ae
            java.lang.Object r3 = r6.next()
            if (r3 != 0) goto L_0x00aa
            int r6 = r7.size()
            int r6 = r6 - r0
            java.lang.String r6 = v.v.d(r2, r6, r1)
            int r1 = r7.size()
        L_0x009c:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00a4
            r7.remove(r1)
            goto L_0x009c
        L_0x00a4:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x00aa:
            r7.add(r3)
            goto L_0x0083
        L_0x00ae:
            return
        L_0x00af:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzig.zzc(java.lang.Iterable, java.util.List):void");
    }

    public int zza(zzmk zzmk) {
        throw null;
    }

    public final zziv zzb() {
        try {
            int zzn = zzn();
            zziv zziv = zziv.zzb;
            byte[] bArr = new byte[zzn];
            zzjg zzz = zzjg.zzz(bArr, 0, zzn);
            zze(zzz);
            zzz.zzA();
            return new zziu(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(b0.s("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final byte[] zzd() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            zzjg zzz = zzjg.zzz(bArr, 0, zzn);
            zze(zzz);
            zzz.zzA();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(b0.s("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
