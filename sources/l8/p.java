package l8;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: ShapePath */
public final class p {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f12864a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f12865b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f12866c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f12867d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f12868e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f12869f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f12870g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f12871h = new ArrayList();

    /* compiled from: ShapePath */
    public static class a extends f {

        /* renamed from: c  reason: collision with root package name */
        public final c f12872c;

        public a(c cVar) {
            this.f12872c = cVar;
        }

        public final void a(Matrix matrix, k8.a aVar, int i10, Canvas canvas) {
            boolean z10;
            k8.a aVar2 = aVar;
            int i11 = i10;
            Canvas canvas2 = canvas;
            c cVar = this.f12872c;
            float f10 = cVar.f12881f;
            float f11 = cVar.f12882g;
            c cVar2 = this.f12872c;
            RectF rectF = new RectF(cVar2.f12877b, cVar2.f12878c, cVar2.f12879d, cVar2.f12880e);
            if (f11 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path = aVar2.f12060g;
            if (z10) {
                int[] iArr = k8.a.f12052k;
                iArr[0] = 0;
                iArr[1] = aVar2.f12059f;
                iArr[2] = aVar2.f12058e;
                iArr[3] = aVar2.f12057d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = (float) (-i11);
                rectF.inset(f12, f12);
                int[] iArr2 = k8.a.f12052k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f12057d;
                iArr2[2] = aVar2.f12058e;
                iArr2[3] = aVar2.f12059f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (((float) i11) / width);
                float[] fArr = k8.a.f12053l;
                fArr[1] = f13;
                fArr[2] = ((1.0f - f13) / 2.0f) + f13;
                aVar2.f12055b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, k8.a.f12052k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z10) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f12061h);
                }
                canvas.drawArc(rectF, f10, f11, true, aVar2.f12055b);
                canvas.restore();
            }
        }
    }

    /* compiled from: ShapePath */
    public static class b extends f {

        /* renamed from: c  reason: collision with root package name */
        public final d f12873c;

        /* renamed from: d  reason: collision with root package name */
        public final float f12874d;

        /* renamed from: e  reason: collision with root package name */
        public final float f12875e;

        public b(d dVar, float f10, float f11) {
            this.f12873c = dVar;
            this.f12874d = f10;
            this.f12875e = f11;
        }

        public final void a(Matrix matrix, k8.a aVar, int i10, Canvas canvas) {
            d dVar = this.f12873c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f12884c - this.f12875e), (double) (dVar.f12883b - this.f12874d)), 0.0f);
            this.f12887a.set(matrix);
            this.f12887a.preTranslate(this.f12874d, this.f12875e);
            this.f12887a.preRotate(b());
            Matrix matrix2 = this.f12887a;
            aVar.getClass();
            rectF.bottom += (float) i10;
            rectF.offset(0.0f, (float) (-i10));
            int[] iArr = k8.a.f12050i;
            iArr[0] = aVar.f12059f;
            iArr[1] = aVar.f12058e;
            iArr[2] = aVar.f12057d;
            Paint paint = aVar.f12056c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, k8.a.f12051j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f12056c);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f12873c;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f12884c - this.f12875e) / (dVar.f12883b - this.f12874d))));
        }
    }

    /* compiled from: ShapePath */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f12876h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f12877b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f12878c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f12879d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f12880e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f12881f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f12882g;

        public c(float f10, float f11, float f12, float f13) {
            this.f12877b = f10;
            this.f12878c = f11;
            this.f12879d = f12;
            this.f12880e = f13;
        }

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f12885a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f12876h;
            rectF.set(this.f12877b, this.f12878c, this.f12879d, this.f12880e);
            path.arcTo(rectF, this.f12881f, this.f12882g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f12883b;

        /* renamed from: c  reason: collision with root package name */
        public float f12884c;

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f12885a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f12883b, this.f12884c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f12885a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath */
    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final Matrix f12886b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f12887a = new Matrix();

        public abstract void a(Matrix matrix, k8.a aVar, int i10, Canvas canvas);
    }

    public p() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        c cVar = new c(f10, f11, f12, f13);
        cVar.f12881f = f14;
        cVar.f12882g = f15;
        this.f12870g.add(cVar);
        a aVar = new a(cVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z10) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        b(f14);
        this.f12871h.add(aVar);
        this.f12868e = f16;
        double d10 = (double) f17;
        this.f12866c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f12867d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f12868e;
        if (f11 != f10) {
            float f12 = ((f10 - f11) + 360.0f) % 360.0f;
            if (f12 <= 180.0f) {
                float f13 = this.f12866c;
                float f14 = this.f12867d;
                c cVar = new c(f13, f14, f13, f14);
                cVar.f12881f = this.f12868e;
                cVar.f12882g = f12;
                this.f12871h.add(new a(cVar));
                this.f12868e = f10;
            }
        }
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f12870g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f12870g.get(i10)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f12883b = f10;
        dVar.f12884c = f11;
        this.f12870g.add(dVar);
        b bVar = new b(dVar, this.f12866c, this.f12867d);
        b(bVar.b() + 270.0f);
        this.f12871h.add(bVar);
        this.f12868e = bVar.b() + 270.0f;
        this.f12866c = f10;
        this.f12867d = f11;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f12864a = f10;
        this.f12865b = f11;
        this.f12866c = f10;
        this.f12867d = f11;
        this.f12868e = f12;
        this.f12869f = (f12 + f13) % 360.0f;
        this.f12870g.clear();
        this.f12871h.clear();
    }
}
