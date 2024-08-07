package kj;

import android.graphics.Bitmap;
import java.io.File;
import sk.j;

/* compiled from: DefaultConstraint.kt */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f20832a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20833b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20834c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap.CompressFormat f20835d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20836e;

    public c(int i10, int i11, Bitmap.CompressFormat compressFormat, int i12) {
        this.f20833b = i10;
        this.f20834c = i11;
        this.f20835d = compressFormat;
        this.f20836e = i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File a(java.io.File r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "imageFile"
            r2 = r17
            sk.j.g(r2, r0)
            int r0 = r1.f20833b
            int r3 = r1.f20834c
            java.lang.String r4 = jj.c.f20793a
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r5 = 1
            r4.inJustDecodeBounds = r5
            java.lang.String r6 = r17.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r6, r4)
            int r6 = r4.outHeight
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = r4.outWidth
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r6 = r6.intValue()
            int r7 = r7.intValue()
            r8 = 2
            if (r6 > r3) goto L_0x003a
            if (r7 <= r0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r9 = r5
            goto L_0x0048
        L_0x003a:
            int r6 = r6 / r8
            int r7 = r7 / r8
            r9 = r5
        L_0x003d:
            int r10 = r6 / r9
            if (r10 < r3) goto L_0x0048
            int r10 = r7 / r9
            if (r10 < r0) goto L_0x0048
            int r9 = r9 * 2
            goto L_0x003d
        L_0x0048:
            r4.inSampleSize = r9
            r0 = 0
            r4.inJustDecodeBounds = r0
            java.lang.String r3 = r17.getAbsolutePath()
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeFile(r3, r4)
            java.lang.String r3 = "BitmapFactory.decodeFile…eFile.absolutePath, this)"
            sk.j.b(r9, r3)
            android.media.ExifInterface r3 = new android.media.ExifInterface
            java.lang.String r4 = r17.getAbsolutePath()
            r3.<init>(r4)
            java.lang.String r4 = "Orientation"
            int r3 = r3.getAttributeInt(r4, r0)
            android.graphics.Matrix r14 = new android.graphics.Matrix
            r14.<init>()
            r4 = 3
            r6 = 6
            if (r3 == r4) goto L_0x0085
            if (r3 == r6) goto L_0x007f
            r4 = 8
            if (r3 == r4) goto L_0x0079
            goto L_0x008a
        L_0x0079:
            r3 = 1132920832(0x43870000, float:270.0)
            r14.postRotate(r3)
            goto L_0x008a
        L_0x007f:
            r3 = 1119092736(0x42b40000, float:90.0)
            r14.postRotate(r3)
            goto L_0x008a
        L_0x0085:
            r3 = 1127481344(0x43340000, float:180.0)
            r14.postRotate(r3)
        L_0x008a:
            r10 = 0
            r11 = 0
            int r12 = r9.getWidth()
            int r13 = r9.getHeight()
            r15 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r4 = "Bitmap.createBitmap(bitm…map.height, matrix, true)"
            sk.j.b(r3, r4)
            android.graphics.Bitmap$CompressFormat r4 = r1.f20835d
            int r7 = r1.f20836e
            java.lang.String r9 = "format"
            sk.j.g(r4, r9)
            java.lang.String r9 = fk.h.s0(r17)
            java.lang.String r9 = r9.toLowerCase()
            java.lang.String r10 = "(this as java.lang.String).toLowerCase()"
            sk.j.b(r9, r10)
            int r10 = r9.hashCode()
            r11 = 111145(0x1b229, float:1.55747E-40)
            java.lang.String r12 = "webp"
            java.lang.String r13 = "png"
            if (r10 == r11) goto L_0x00d0
            r11 = 3645340(0x379f9c, float:5.10821E-39)
            if (r10 == r11) goto L_0x00c7
            goto L_0x00d9
        L_0x00c7:
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x00d9
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.WEBP
            goto L_0x00db
        L_0x00d0:
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x00d9
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x00db
        L_0x00d9:
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x00db:
            if (r4 != r9) goto L_0x00df
            r9 = r2
            goto L_0x0124
        L_0x00df:
            java.io.File r9 = new java.io.File
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r17.getAbsolutePath()
            java.lang.String r14 = "imageFile.absolutePath"
            sk.j.b(r11, r14)
            java.lang.String r14 = "."
            int r6 = yk.l.V0(r11, r14, r6)
            r14 = -1
            if (r6 != r14) goto L_0x00f9
            goto L_0x0102
        L_0x00f9:
            java.lang.String r11 = r11.substring(r0, r6)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            sk.j.e(r11, r0)
        L_0x0102:
            r10.append(r11)
            r0 = 46
            r10.append(r0)
            int[] r0 = jj.b.f20792a
            int r6 = r4.ordinal()
            r0 = r0[r6]
            if (r0 == r5) goto L_0x0119
            if (r0 == r8) goto L_0x011a
            java.lang.String r12 = "jpg"
            goto L_0x011a
        L_0x0119:
            r12 = r13
        L_0x011a:
            r10.append(r12)
            java.lang.String r0 = r10.toString()
            r9.<init>(r0)
        L_0x0124:
            r17.delete()
            java.io.File r0 = r9.getParentFile()
            if (r0 == 0) goto L_0x0130
            r0.mkdirs()
        L_0x0130:
            r2 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0149 }
            r6.<init>(r0)     // Catch:{ all -> 0x0149 }
            r3.compress(r4, r7, r6)     // Catch:{ all -> 0x0146 }
            r6.flush()
            r6.close()
            r1.f20832a = r5
            return r9
        L_0x0146:
            r0 = move-exception
            r2 = r6
            goto L_0x014a
        L_0x0149:
            r0 = move-exception
        L_0x014a:
            if (r2 == 0) goto L_0x0152
            r2.flush()
            r2.close()
        L_0x0152:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.c.a(java.io.File):java.io.File");
    }

    public final boolean b(File file) {
        j.g(file, "imageFile");
        return this.f20832a;
    }
}
