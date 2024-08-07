package j4;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import c4.a;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.g0;
import com.airbnb.lottie.i;
import e4.p;
import n4.g;
import z.k;

/* compiled from: ImageLayer */
public final class d extends b {
    public final a C = new a(3);
    public final Rect D = new Rect();
    public final Rect E = new Rect();
    public final d0 F;
    public p G;
    public p H;

    public d(c0 c0Var, e eVar) {
        super(c0Var, eVar);
        d0 d0Var;
        String str = eVar.f11668g;
        i iVar = c0Var.f4772a;
        if (iVar == null) {
            d0Var = null;
        } else {
            d0Var = iVar.f4835d.get(str);
        }
        this.F = d0Var;
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        if (this.F != null) {
            float c10 = g.c();
            d0 d0Var = this.F;
            rectF.set(0.0f, 0.0f, ((float) d0Var.f4794a) * c10, ((float) d0Var.f4795b) * c10);
            this.f11649n.mapRect(rectF);
        }
    }

    public final void h(k kVar, Object obj) {
        super.h(kVar, obj);
        if (obj == g0.K) {
            if (kVar == null) {
                this.G = null;
            } else {
                this.G = new p(kVar, null);
            }
        } else if (obj != g0.N) {
        } else {
            if (kVar == null) {
                this.H = null;
            } else {
                this.H = new p(kVar, null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(android.graphics.Canvas r12, android.graphics.Matrix r13, int r14) {
        /*
            r11 = this;
            e4.p r0 = r11.H
            r1 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r0.f()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x000f
            goto L_0x0122
        L_0x000f:
            j4.e r0 = r11.f11651p
            java.lang.String r0 = r0.f11668g
            com.airbnb.lottie.c0 r2 = r11.f11650o
            android.graphics.drawable.Drawable$Callback r3 = r2.getCallback()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0066
        L_0x001f:
            f4.b r3 = r2.f4779o
            if (r3 == 0) goto L_0x004b
            android.graphics.drawable.Drawable$Callback r6 = r2.getCallback()
            if (r6 != 0) goto L_0x002a
            goto L_0x0035
        L_0x002a:
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L_0x0035
            android.view.View r6 = (android.view.View) r6
            android.content.Context r6 = r6.getContext()
            goto L_0x0036
        L_0x0035:
            r6 = r4
        L_0x0036:
            if (r6 != 0) goto L_0x003c
            android.content.Context r7 = r3.f9912a
            if (r7 == 0) goto L_0x0044
        L_0x003c:
            android.content.Context r3 = r3.f9912a
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0046
        L_0x0044:
            r3 = r5
            goto L_0x0047
        L_0x0046:
            r3 = r1
        L_0x0047:
            if (r3 != 0) goto L_0x004b
            r2.f4779o = r4
        L_0x004b:
            f4.b r3 = r2.f4779o
            if (r3 != 0) goto L_0x0064
            f4.b r3 = new f4.b
            android.graphics.drawable.Drawable$Callback r6 = r2.getCallback()
            java.lang.String r7 = r2.f4780p
            r8 = 0
            r2.getClass()
            com.airbnb.lottie.i r9 = r2.f4772a
            java.util.Map<java.lang.String, com.airbnb.lottie.d0> r9 = r9.f4835d
            r3.<init>(r6, r7, r8, r9)
            r2.f4779o = r3
        L_0x0064:
            f4.b r2 = r2.f4779o
        L_0x0066:
            if (r2 == 0) goto L_0x0116
            java.util.Map<java.lang.String, com.airbnb.lottie.d0> r3 = r2.f9914c
            java.lang.Object r3 = r3.get(r0)
            com.airbnb.lottie.d0 r3 = (com.airbnb.lottie.d0) r3
            if (r3 != 0) goto L_0x0074
            goto L_0x0116
        L_0x0074:
            android.graphics.Bitmap r6 = r3.f4797d
            if (r6 == 0) goto L_0x007b
            r0 = r6
            goto L_0x0117
        L_0x007b:
            r2.getClass()
            java.lang.String r6 = r3.f4796c
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inScaled = r5
            r8 = 160(0xa0, float:2.24E-43)
            r7.inDensity = r8
            java.lang.String r8 = "data:"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x00ba
            java.lang.String r8 = "base64,"
            int r8 = r6.indexOf(r8)
            if (r8 <= 0) goto L_0x00ba
            r3 = 44
            int r3 = r6.indexOf(r3)     // Catch:{ IllegalArgumentException -> 0x00b3 }
            int r3 = r3 + r5
            java.lang.String r3 = r6.substring(r3)     // Catch:{ IllegalArgumentException -> 0x00b3 }
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch:{ IllegalArgumentException -> 0x00b3 }
            int r5 = r3.length
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r1, r5, r7)
            r2.a(r0, r3)
            goto L_0x00ff
        L_0x00b3:
            r0 = move-exception
            java.lang.String r2 = "data URL did not have correct base64 format."
            n4.c.c(r2, r0)
            goto L_0x0116
        L_0x00ba:
            java.lang.String r8 = r2.f9913b     // Catch:{ IOException -> 0x0110 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IOException -> 0x0110 }
            if (r8 != 0) goto L_0x0108
            android.content.Context r8 = r2.f9912a     // Catch:{ IOException -> 0x0110 }
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r9.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r10 = r2.f9913b     // Catch:{ IOException -> 0x0110 }
            r9.append(r10)     // Catch:{ IOException -> 0x0110 }
            r9.append(r6)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r6 = r9.toString()     // Catch:{ IOException -> 0x0110 }
            java.io.InputStream r6 = r8.open(r6)     // Catch:{ IOException -> 0x0110 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6, r4, r7)     // Catch:{ IllegalArgumentException -> 0x0101 }
            int r7 = r3.f4794a
            int r3 = r3.f4795b
            n4.g$a r8 = n4.g.f13513a
            int r8 = r6.getWidth()
            if (r8 != r7) goto L_0x00f5
            int r8 = r6.getHeight()
            if (r8 != r3) goto L_0x00f5
            r3 = r6
            goto L_0x00fc
        L_0x00f5:
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r6, r7, r3, r5)
            r6.recycle()
        L_0x00fc:
            r2.a(r0, r3)
        L_0x00ff:
            r0 = r3
            goto L_0x0117
        L_0x0101:
            r0 = move-exception
            java.lang.String r2 = "Unable to decode image."
            n4.c.c(r2, r0)
            goto L_0x0116
        L_0x0108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0110 }
            java.lang.String r2 = "You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0110 }
            throw r0     // Catch:{ IOException -> 0x0110 }
        L_0x0110:
            r0 = move-exception
            java.lang.String r2 = "Unable to open asset."
            n4.c.c(r2, r0)
        L_0x0116:
            r0 = r4
        L_0x0117:
            if (r0 == 0) goto L_0x011a
            goto L_0x0122
        L_0x011a:
            com.airbnb.lottie.d0 r0 = r11.F
            if (r0 == 0) goto L_0x0121
            android.graphics.Bitmap r0 = r0.f4797d
            goto L_0x0122
        L_0x0121:
            r0 = r4
        L_0x0122:
            if (r0 == 0) goto L_0x0191
            boolean r2 = r0.isRecycled()
            if (r2 != 0) goto L_0x0191
            com.airbnb.lottie.d0 r2 = r11.F
            if (r2 != 0) goto L_0x012f
            goto L_0x0191
        L_0x012f:
            float r2 = n4.g.c()
            c4.a r3 = r11.C
            r3.setAlpha(r14)
            e4.p r14 = r11.G
            if (r14 == 0) goto L_0x0147
            c4.a r3 = r11.C
            java.lang.Object r14 = r14.f()
            android.graphics.ColorFilter r14 = (android.graphics.ColorFilter) r14
            r3.setColorFilter(r14)
        L_0x0147:
            r12.save()
            r12.concat(r13)
            android.graphics.Rect r13 = r11.D
            int r14 = r0.getWidth()
            int r3 = r0.getHeight()
            r13.set(r1, r1, r14, r3)
            com.airbnb.lottie.c0 r13 = r11.f11650o
            boolean r13 = r13.f4783s
            if (r13 == 0) goto L_0x0172
            android.graphics.Rect r13 = r11.E
            com.airbnb.lottie.d0 r14 = r11.F
            int r3 = r14.f4794a
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (int) r3
            int r14 = r14.f4795b
            float r14 = (float) r14
            float r14 = r14 * r2
            int r14 = (int) r14
            r13.set(r1, r1, r3, r14)
            goto L_0x0185
        L_0x0172:
            android.graphics.Rect r13 = r11.E
            int r14 = r0.getWidth()
            float r14 = (float) r14
            float r14 = r14 * r2
            int r14 = (int) r14
            int r3 = r0.getHeight()
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = (int) r3
            r13.set(r1, r1, r14, r2)
        L_0x0185:
            android.graphics.Rect r13 = r11.D
            android.graphics.Rect r14 = r11.E
            c4.a r1 = r11.C
            r12.drawBitmap(r0, r13, r14, r1)
            r12.restore()
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
