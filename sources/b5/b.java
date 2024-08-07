package b5;

import android.graphics.Bitmap;
import s4.c;
import s4.g;
import s4.h;
import s4.k;

/* compiled from: BitmapEncoder */
public final class b implements k<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Integer> f4005b = g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c  reason: collision with root package name */
    public static final g<Bitmap.CompressFormat> f4006c = new g<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, g.f14626e);

    /* renamed from: a  reason: collision with root package name */
    public final v4.b f4007a;

    public b(v4.b bVar) {
        this.f4007a = bVar;
    }

    public final c d(h hVar) {
        return c.TRANSFORMED;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|39|(0)|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r4 != null) goto L_0x0060;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0086 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083 A[SYNTHETIC, Splitter:B:41:0x0083] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(java.lang.Object r7, java.io.File r8, s4.h r9) {
        /*
            r6 = this;
            u4.u r7 = (u4.u) r7
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r7 = r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            s4.g<android.graphics.Bitmap$CompressFormat> r1 = f4006c
            java.lang.Object r1 = r9.c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r1 = r7.hasAlpha()
            if (r1 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r7.getWidth()
            r7.getHeight()
            int r2 = o5.h.f13744a     // Catch:{ all -> 0x0087 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0087 }
            s4.g<java.lang.Integer> r2 = f4005b     // Catch:{ all -> 0x0087 }
            java.lang.Object r2 = r9.c(r2)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0087 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0087 }
            r3 = 0
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005a }
            r5.<init>(r8)     // Catch:{ IOException -> 0x005a }
            v4.b r8 = r6.f4007a     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            if (r8 == 0) goto L_0x004d
            com.bumptech.glide.load.data.c r8 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            v4.b r4 = r6.f4007a     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            r8.<init>(r5, r4)     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            r4 = r8
            goto L_0x004e
        L_0x004b:
            r7 = move-exception
            goto L_0x0081
        L_0x004d:
            r4 = r5
        L_0x004e:
            r7.compress(r1, r2, r4)     // Catch:{ IOException -> 0x005a }
            r4.close()     // Catch:{ IOException -> 0x005a }
            r3 = 1
            goto L_0x0060
        L_0x0056:
            r4 = r5
            goto L_0x005a
        L_0x0058:
            r7 = move-exception
            goto L_0x0080
        L_0x005a:
            r8 = 3
            android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0063
        L_0x0060:
            r4.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            r8 = 2
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x0087 }
            if (r8 == 0) goto L_0x007f
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x0087 }
            o5.l.c(r7)     // Catch:{ all -> 0x0087 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0087 }
            s4.g<android.graphics.Bitmap$CompressFormat> r8 = f4006c     // Catch:{ all -> 0x0087 }
            java.lang.Object r8 = r9.c(r8)     // Catch:{ all -> 0x0087 }
            java.util.Objects.toString(r8)     // Catch:{ all -> 0x0087 }
            r7.hasAlpha()     // Catch:{ all -> 0x0087 }
        L_0x007f:
            return r3
        L_0x0080:
            r5 = r4
        L_0x0081:
            if (r5 == 0) goto L_0x0086
            r5.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            throw r7     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.b.i(java.lang.Object, java.io.File, s4.h):boolean");
    }
}
