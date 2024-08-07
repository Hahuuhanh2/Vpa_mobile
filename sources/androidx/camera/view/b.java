package androidx.camera.view;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.view.PreviewView;
import g0.n;
import p3.l0;

/* compiled from: PreviewTransformation */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Size f1487a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f1488b;

    /* renamed from: c  reason: collision with root package name */
    public int f1489c;

    /* renamed from: d  reason: collision with root package name */
    public Matrix f1490d;

    /* renamed from: e  reason: collision with root package name */
    public int f1491e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1492f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1493g;

    /* renamed from: h  reason: collision with root package name */
    public PreviewView.f f1494h = PreviewView.f.FILL_CENTER;

    public final void a(int i10, Size size) {
        if (f()) {
            Matrix matrix = new Matrix();
            c(i10, size).invert(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(new RectF(0.0f, 0.0f, (float) this.f1487a.getWidth(), (float) this.f1487a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix.postConcat(matrix2);
        }
    }

    public final Size b() {
        if (n.c(this.f1489c)) {
            return new Size(this.f1488b.height(), this.f1488b.width());
        }
        return new Size(this.f1488b.width(), this.f1488b.height());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix c(int r9, android.util.Size r10) {
        /*
            r8 = this;
            boolean r0 = r8.f()
            r1 = 0
            al.g0.E(r1, r0)
            android.util.Size r0 = r8.b()
            r1 = 1
            boolean r0 = g0.n.d(r10, r1, r0)
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0026
            android.graphics.RectF r9 = new android.graphics.RectF
            int r0 = r10.getWidth()
            float r0 = (float) r0
            int r10 = r10.getHeight()
            float r10 = (float) r10
            r9.<init>(r3, r3, r0, r10)
            goto L_0x00b3
        L_0x0026:
            android.graphics.RectF r0 = new android.graphics.RectF
            int r4 = r10.getWidth()
            float r4 = (float) r4
            int r5 = r10.getHeight()
            float r5 = (float) r5
            r0.<init>(r3, r3, r4, r5)
            android.util.Size r4 = r8.b()
            android.graphics.RectF r5 = new android.graphics.RectF
            int r6 = r4.getWidth()
            float r6 = (float) r6
            int r4 = r4.getHeight()
            float r4 = (float) r4
            r5.<init>(r3, r3, r6, r4)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            androidx.camera.view.PreviewView$f r4 = r8.f1494h
            int r6 = r4.ordinal()
            if (r6 == 0) goto L_0x0074
            if (r6 == r1) goto L_0x0071
            r7 = 2
            if (r6 == r7) goto L_0x006e
            r7 = 3
            if (r6 == r7) goto L_0x0074
            r7 = 4
            if (r6 == r7) goto L_0x0071
            r7 = 5
            if (r6 == r7) goto L_0x006e
            r4.toString()
            java.lang.String r6 = "PreviewTransform"
            c0.p0.b(r6)
            android.graphics.Matrix$ScaleToFit r6 = android.graphics.Matrix.ScaleToFit.FILL
            goto L_0x0076
        L_0x006e:
            android.graphics.Matrix$ScaleToFit r6 = android.graphics.Matrix.ScaleToFit.END
            goto L_0x0076
        L_0x0071:
            android.graphics.Matrix$ScaleToFit r6 = android.graphics.Matrix.ScaleToFit.CENTER
            goto L_0x0076
        L_0x0074:
            android.graphics.Matrix$ScaleToFit r6 = android.graphics.Matrix.ScaleToFit.START
        L_0x0076:
            androidx.camera.view.PreviewView$f r7 = androidx.camera.view.PreviewView.f.FIT_CENTER
            if (r4 == r7) goto L_0x0085
            androidx.camera.view.PreviewView$f r7 = androidx.camera.view.PreviewView.f.FIT_START
            if (r4 == r7) goto L_0x0085
            androidx.camera.view.PreviewView$f r7 = androidx.camera.view.PreviewView.f.FIT_END
            if (r4 != r7) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r4 = r2
            goto L_0x0086
        L_0x0085:
            r4 = r1
        L_0x0086:
            if (r4 == 0) goto L_0x008c
            r3.setRectToRect(r5, r0, r6)
            goto L_0x0092
        L_0x008c:
            r3.setRectToRect(r0, r5, r6)
            r3.invert(r3)
        L_0x0092:
            r3.mapRect(r5)
            if (r9 != r1) goto L_0x00b2
            int r9 = r10.getWidth()
            float r9 = (float) r9
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            android.graphics.RectF r10 = new android.graphics.RectF
            float r9 = r9 + r9
            float r0 = r5.right
            float r0 = r9 - r0
            float r1 = r5.top
            float r3 = r5.left
            float r9 = r9 - r3
            float r3 = r5.bottom
            r10.<init>(r0, r1, r9, r3)
            r9 = r10
            goto L_0x00b3
        L_0x00b2:
            r9 = r5
        L_0x00b3:
            android.graphics.RectF r10 = new android.graphics.RectF
            android.graphics.Rect r0 = r8.f1488b
            r10.<init>(r0)
            int r0 = r8.f1489c
            android.graphics.Matrix r9 = g0.n.a(r0, r10, r9, r2)
            boolean r10 = r8.f1492f
            if (r10 == 0) goto L_0x00f7
            boolean r10 = r8.f1493g
            if (r10 == 0) goto L_0x00f7
            int r10 = r8.f1489c
            boolean r10 = g0.n.c(r10)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 == 0) goto L_0x00e6
            android.graphics.Rect r10 = r8.f1488b
            int r10 = r10.centerX()
            float r10 = (float) r10
            android.graphics.Rect r2 = r8.f1488b
            int r2 = r2.centerY()
            float r2 = (float) r2
            r9.preScale(r0, r1, r10, r2)
            goto L_0x00f7
        L_0x00e6:
            android.graphics.Rect r10 = r8.f1488b
            int r10 = r10.centerX()
            float r10 = (float) r10
            android.graphics.Rect r2 = r8.f1488b
            int r2 = r2.centerY()
            float r2 = (float) r2
            r9.preScale(r1, r0, r10, r2)
        L_0x00f7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.b.c(int, android.util.Size):android.graphics.Matrix");
    }

    public final Matrix d() {
        int i10;
        g0.E((String) null, f());
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f1487a.getWidth(), (float) this.f1487a.getHeight());
        if (!this.f1493g) {
            i10 = this.f1489c;
        } else {
            i10 = -l0.M0(this.f1491e);
        }
        return n.a(i10, rectF, rectF, false);
    }

    public final RectF e(int i10, Size size) {
        g0.E((String) null, f());
        Matrix c10 = c(i10, size);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f1487a.getWidth(), (float) this.f1487a.getHeight());
        c10.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        boolean z10;
        if (!this.f1493g || this.f1491e != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f1488b == null || this.f1487a == null || !z10) {
            return false;
        }
        return true;
    }
}
