package com.google.android.recaptcha.internal;

import fk.h;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import p3.l0;
import pk.a;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzbx {
    public static final byte[] zza(File file) {
        j.f(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i10 = (int) length;
                byte[] bArr = new byte[i10];
                int i11 = i10;
                int i12 = 0;
                while (i11 > 0) {
                    int read = fileInputStream.read(bArr, i12, i11);
                    if (read < 0) {
                        break;
                    }
                    i11 -= read;
                    i12 += read;
                }
                if (i11 > 0) {
                    bArr = Arrays.copyOf(bArr, i12);
                    j.e(bArr, "copyOf(this, newSize)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        a aVar = new a();
                        aVar.write(read2);
                        l0.z(fileInputStream, aVar, 8192);
                        int size = aVar.size() + i10;
                        if (size >= 0) {
                            byte[] d10 = aVar.d();
                            bArr = Arrays.copyOf(bArr, size);
                            j.e(bArr, "copyOf(this, newSize)");
                            h.n0(d10, i10, bArr, 0, aVar.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                l0.u(fileInputStream, (Throwable) null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th2) {
            l0.u(fileInputStream, th);
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        p3.l0.u(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void zzb(java.io.File r1, byte[] r2) {
        /*
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r1.delete()
            if (r0 == 0) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Unable to delete existing encrypted file"
            r1.<init>(r2)
            throw r1
        L_0x0015:
            java.lang.String r0 = "array"
            sk.j.f(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0029 }
            ek.i r1 = ek.i.f20112a     // Catch:{ all -> 0x0029 }
            r1 = 0
            p3.l0.u(r0, r1)
            return
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r2 = move-exception
            p3.l0.u(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbx.zzb(java.io.File, byte[]):void");
    }
}
