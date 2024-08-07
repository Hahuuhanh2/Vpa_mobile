package l8;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import l8.h;
import l8.p;
import lb.b;

/* compiled from: ShapeAppearancePathProvider */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final p[] f12849a = new p[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f12850b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f12851c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f12852d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f12853e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f12854f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final p f12855g = new p();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f12856h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f12857i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f12858j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f12859k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f12860l = true;

    /* compiled from: ShapeAppearancePathProvider */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final n f12861a = new n();
    }

    public n() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f12849a[i10] = new p();
            this.f12850b[i10] = new Matrix();
            this.f12851c[i10] = new Matrix();
        }
    }

    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v13 */
    public final void a(m mVar, float f10, RectF rectF, h.a aVar, Path path) {
        int i10;
        int i11;
        float f11;
        f fVar;
        int i12;
        boolean z10;
        d dVar;
        b bVar;
        m mVar2 = mVar;
        float f12 = f10;
        RectF rectF2 = rectF;
        h.a aVar2 = aVar;
        Path path2 = path;
        path.rewind();
        this.f12853e.rewind();
        this.f12854f.rewind();
        this.f12854f.addRect(rectF2, Path.Direction.CW);
        ? r62 = 0;
        int i13 = 0;
        while (true) {
            i10 = 3;
            if (i13 >= 4) {
                break;
            }
            if (i13 == 1) {
                dVar = mVar2.f12831g;
            } else if (i13 == 2) {
                dVar = mVar2.f12832h;
            } else if (i13 != 3) {
                dVar = mVar2.f12830f;
            } else {
                dVar = mVar2.f12829e;
            }
            if (i13 == 1) {
                bVar = mVar2.f12827c;
            } else if (i13 == 2) {
                bVar = mVar2.f12828d;
            } else if (i13 != 3) {
                bVar = mVar2.f12826b;
            } else {
                bVar = mVar2.f12825a;
            }
            p pVar = this.f12849a[i13];
            bVar.getClass();
            bVar.g(f12, dVar.a(rectF2), pVar);
            int i14 = i13 + 1;
            float f13 = (float) ((i14 % 4) * 90);
            this.f12850b[i13].reset();
            PointF pointF = this.f12852d;
            if (i13 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i13 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i13 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            Matrix matrix = this.f12850b[i13];
            PointF pointF2 = this.f12852d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f12850b[i13].preRotate(f13);
            float[] fArr = this.f12856h;
            p pVar2 = this.f12849a[i13];
            fArr[0] = pVar2.f12866c;
            fArr[1] = pVar2.f12867d;
            this.f12850b[i13].mapPoints(fArr);
            this.f12851c[i13].reset();
            Matrix matrix2 = this.f12851c[i13];
            float[] fArr2 = this.f12856h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.f12851c[i13].preRotate(f13);
            i13 = i14;
        }
        int i15 = 0;
        for (i11 = 4; i15 < i11; i11 = 4) {
            float[] fArr3 = this.f12856h;
            p pVar3 = this.f12849a[i15];
            fArr3[r62] = pVar3.f12864a;
            fArr3[1] = pVar3.f12865b;
            this.f12850b[i15].mapPoints(fArr3);
            if (i15 == 0) {
                float[] fArr4 = this.f12856h;
                path2.moveTo(fArr4[r62], fArr4[1]);
            } else {
                float[] fArr5 = this.f12856h;
                path2.lineTo(fArr5[r62], fArr5[1]);
            }
            this.f12849a[i15].c(this.f12850b[i15], path2);
            if (aVar2 != null) {
                p pVar4 = this.f12849a[i15];
                Matrix matrix3 = this.f12850b[i15];
                BitSet bitSet = h.this.f12781d;
                pVar4.getClass();
                bitSet.set(i15, r62);
                p.f[] fVarArr = h.this.f12779b;
                pVar4.b(pVar4.f12869f);
                fVarArr[i15] = new o(new ArrayList(pVar4.f12871h), new Matrix(matrix3));
            }
            int i16 = i15 + 1;
            int i17 = i16 % 4;
            float[] fArr6 = this.f12856h;
            p pVar5 = this.f12849a[i15];
            fArr6[r62] = pVar5.f12866c;
            fArr6[1] = pVar5.f12867d;
            this.f12850b[i15].mapPoints(fArr6);
            float[] fArr7 = this.f12857i;
            p pVar6 = this.f12849a[i17];
            fArr7[r62] = pVar6.f12864a;
            fArr7[1] = pVar6.f12865b;
            this.f12850b[i17].mapPoints(fArr7);
            float[] fArr8 = this.f12856h;
            float f14 = fArr8[r62];
            float[] fArr9 = this.f12857i;
            int i18 = i15;
            float max = Math.max(((float) Math.hypot((double) (f14 - fArr9[r62]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f12856h;
            p pVar7 = this.f12849a[i18];
            fArr10[0] = pVar7.f12866c;
            fArr10[1] = pVar7.f12867d;
            this.f12850b[i18].mapPoints(fArr10);
            int i19 = i18;
            if (i19 == 1 || i19 == i10) {
                f11 = Math.abs(rectF.centerX() - this.f12856h[0]);
            } else {
                f11 = Math.abs(rectF.centerY() - this.f12856h[1]);
            }
            this.f12855g.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i19 == 1) {
                i12 = 3;
                fVar = mVar2.f12835k;
            } else if (i19 != 2) {
                i12 = 3;
                if (i19 != 3) {
                    fVar = mVar2.f12834j;
                } else {
                    fVar = mVar2.f12833i;
                }
            } else {
                i12 = 3;
                fVar = mVar2.f12836l;
            }
            fVar.b(max, f11, f12, this.f12855g);
            this.f12858j.reset();
            this.f12855g.c(this.f12851c[i19], this.f12858j);
            if (!this.f12860l || (!fVar.a() && !b(this.f12858j, i19) && !b(this.f12858j, i17))) {
                this.f12855g.c(this.f12851c[i19], path2);
            } else {
                Path path3 = this.f12858j;
                path3.op(path3, this.f12854f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f12856h;
                p pVar8 = this.f12855g;
                fArr11[0] = pVar8.f12864a;
                fArr11[1] = pVar8.f12865b;
                this.f12851c[i19].mapPoints(fArr11);
                Path path4 = this.f12853e;
                float[] fArr12 = this.f12856h;
                path4.moveTo(fArr12[0], fArr12[1]);
                this.f12855g.c(this.f12851c[i19], this.f12853e);
            }
            if (aVar2 != null) {
                p pVar9 = this.f12855g;
                Matrix matrix4 = this.f12851c[i19];
                pVar9.getClass();
                z10 = false;
                h.this.f12781d.set(i19 + 4, false);
                p.f[] fVarArr2 = h.this.f12780c;
                pVar9.b(pVar9.f12869f);
                fVarArr2[i19] = new o(new ArrayList(pVar9.f12871h), new Matrix(matrix4));
            } else {
                z10 = false;
            }
            i10 = i12;
            i15 = i16;
            r62 = z10;
        }
        path.close();
        this.f12853e.close();
        if (!this.f12853e.isEmpty()) {
            path2.op(this.f12853e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        this.f12859k.reset();
        this.f12849a[i10].c(this.f12850b[i10], this.f12859k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f12859k.computeBounds(rectF, true);
        path.op(this.f12859k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }
}
