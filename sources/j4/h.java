package j4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c4.a;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.p;
import z.k;

/* compiled from: SolidLayer */
public final class h extends b {
    public final RectF C = new RectF();
    public final a D;
    public final float[] E;
    public final Path F;
    public final e G;
    public p H;

    public h(c0 c0Var, e eVar) {
        super(c0Var, eVar);
        a aVar = new a();
        this.D = aVar;
        this.E = new float[8];
        this.F = new Path();
        this.G = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f11673l);
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        RectF rectF2 = this.C;
        e eVar = this.G;
        rectF2.set(0.0f, 0.0f, (float) eVar.f11671j, (float) eVar.f11672k);
        this.f11649n.mapRect(this.C);
        rectF.set(this.C);
    }

    public final void h(k kVar, Object obj) {
        super.h(kVar, obj);
        if (obj != g0.K) {
            return;
        }
        if (kVar == null) {
            this.H = null;
        } else {
            this.H = new p(kVar, null);
        }
    }

    public final void l(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        int alpha = Color.alpha(this.G.f11673l);
        if (alpha != 0) {
            e4.a<Integer, Integer> aVar = this.f11658w.f9146j;
            if (aVar == null) {
                i11 = 100;
            } else {
                i11 = aVar.f().intValue();
            }
            int i12 = (int) ((((((float) alpha) / 255.0f) * ((float) i11)) / 100.0f) * (((float) i10) / 255.0f) * 255.0f);
            this.D.setAlpha(i12);
            p pVar = this.H;
            if (pVar != null) {
                this.D.setColorFilter((ColorFilter) pVar.f());
            }
            if (i12 > 0) {
                float[] fArr = this.E;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                e eVar = this.G;
                float f10 = (float) eVar.f11671j;
                fArr[2] = f10;
                fArr[3] = 0.0f;
                fArr[4] = f10;
                float f11 = (float) eVar.f11672k;
                fArr[5] = f11;
                fArr[6] = 0.0f;
                fArr[7] = f11;
                matrix.mapPoints(fArr);
                this.F.reset();
                Path path = this.F;
                float[] fArr2 = this.E;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.F;
                float[] fArr3 = this.E;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.F;
                float[] fArr4 = this.E;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.F;
                float[] fArr5 = this.E;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.F;
                float[] fArr6 = this.E;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.F.close();
                canvas.drawPath(this.F, this.D);
            }
        }
    }
}
