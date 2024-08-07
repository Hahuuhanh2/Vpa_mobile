package androidx.camera.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import c0.d1;
import c0.g1;
import c0.p0;
import c0.r0;
import c0.t0;
import f0.g0;
import f0.j0;
import f0.q;
import f0.r;
import g0.m;
import g0.n;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r2.p;
import w.o;
import w1.d0;

public final class PreviewView extends FrameLayout {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f1453t = 0;

    /* renamed from: a  reason: collision with root package name */
    public c f1454a;

    /* renamed from: b  reason: collision with root package name */
    public c f1455b;

    /* renamed from: c  reason: collision with root package name */
    public final b f1456c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1457d;

    /* renamed from: e  reason: collision with root package name */
    public final p<g> f1458e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<a> f1459f;

    /* renamed from: n  reason: collision with root package name */
    public Executor f1460n;

    /* renamed from: o  reason: collision with root package name */
    public r0.g f1461o;

    /* renamed from: p  reason: collision with root package name */
    public q f1462p;

    /* renamed from: q  reason: collision with root package name */
    public final b f1463q;

    /* renamed from: r  reason: collision with root package name */
    public final r0.e f1464r;

    /* renamed from: s  reason: collision with root package name */
    public final a f1465s;

    public class a implements t0.c {
        public a() {
        }

        public final void a(d1 d1Var) {
            d1.d dVar;
            boolean z10;
            c cVar;
            if (!m.b()) {
                k1.a.getMainExecutor(PreviewView.this.getContext()).execute(new v.f(11, this, d1Var));
                return;
            }
            p0.a("PreviewView");
            r rVar = d1Var.f4215c;
            PreviewView.this.f1462p = rVar.n();
            Executor mainExecutor = k1.a.getMainExecutor(PreviewView.this.getContext());
            n0.f fVar = new n0.f(2, this, rVar, d1Var);
            synchronized (d1Var.f4213a) {
                d1Var.f4223k = fVar;
                d1Var.f4224l = mainExecutor;
                dVar = d1Var.f4222j;
            }
            if (dVar != null) {
                mainExecutor.execute(new v.f(7, fVar, dVar));
            }
            PreviewView previewView = PreviewView.this;
            c cVar2 = previewView.f1455b;
            c cVar3 = previewView.f1454a;
            if (!(cVar2 instanceof d) || PreviewView.b(d1Var, cVar3)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.b(d1Var, previewView2.f1454a)) {
                    PreviewView previewView3 = PreviewView.this;
                    cVar = new f(previewView3, previewView3.f1456c);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    cVar = new d(previewView4, previewView4.f1456c);
                }
                previewView2.f1455b = cVar;
            }
            q n10 = rVar.n();
            PreviewView previewView5 = PreviewView.this;
            a aVar = new a(n10, previewView5.f1458e, previewView5.f1455b);
            PreviewView.this.f1459f.set(aVar);
            j0<r.a> g2 = rVar.g();
            Executor mainExecutor2 = k1.a.getMainExecutor(PreviewView.this.getContext());
            g0 g0Var = (g0) g2;
            synchronized (g0Var.f9534b) {
                g0.a aVar2 = (g0.a) g0Var.f9534b.get(aVar);
                if (aVar2 != null) {
                    aVar2.f9535a.set(false);
                }
                g0.a aVar3 = new g0.a(mainExecutor2, aVar);
                g0Var.f9534b.put(aVar, aVar3);
                j7.a.f0().execute(new o(1, g0Var, aVar2, aVar3));
            }
            PreviewView.this.f1455b.e(d1Var, new r0.f(this, aVar, rVar));
            PreviewView.this.getClass();
        }
    }

    public class b implements DisplayManager.DisplayListener {
        public b() {
        }

        public final void onDisplayAdded(int i10) {
        }

        public final void onDisplayChanged(int i10) {
            Display display = PreviewView.this.getDisplay();
            if (display != null && display.getDisplayId() == i10) {
                PreviewView.this.a();
            }
        }

        public final void onDisplayRemoved(int i10) {
        }
    }

    public enum c {
        PERFORMANCE(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f1470a;

        /* access modifiers changed from: public */
        c(int i10) {
            this.f1470a = i10;
        }
    }

    public interface d {
        void a();
    }

    public class e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public e() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    public enum f {
        FILL_CENTER(1),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f1477a;

        /* access modifiers changed from: public */
        f(int i10) {
            this.f1477a = i10;
        }
    }

    public enum g {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean b(d1 d1Var, c cVar) {
        boolean z10;
        boolean equals = d1Var.f4215c.n().h().equals("androidx.camera.camera2.legacy");
        z.d dVar = s0.a.f14586a;
        if (dVar.f(s0.c.class) == null && dVar.f(s0.b.class) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (Build.VERSION.SDK_INT <= 24 || equals || z10) {
            return true;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                i10 = 3;
                if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                    StringBuilder q10 = android.support.v4.media.a.q("Unexpected scale type: ");
                    q10.append(getScaleType());
                    throw new IllegalStateException(q10.toString());
                }
            }
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            g0.m.a()
            androidx.camera.view.c r0 = r4.f1455b
            if (r0 == 0) goto L_0x0031
            boolean r0 = r4.f1457d
            if (r0 == 0) goto L_0x002c
            android.view.Display r0 = r4.getDisplay()
            if (r0 == 0) goto L_0x002c
            f0.q r1 = r4.f1462p
            if (r1 == 0) goto L_0x002c
            androidx.camera.view.b r2 = r4.f1456c
            int r3 = r0.getRotation()
            int r1 = r1.j(r3)
            int r0 = r0.getRotation()
            boolean r3 = r2.f1493g
            if (r3 != 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            r2.f1489c = r1
            r2.f1491e = r0
        L_0x002c:
            androidx.camera.view.c r0 = r4.f1455b
            r0.f()
        L_0x0031:
            r0.g r0 = r4.f1461o
            android.util.Size r1 = new android.util.Size
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            r1.<init>(r2, r3)
            int r2 = r4.getLayoutDirection()
            r0.getClass()
            g0.m.a()
            monitor-enter(r0)
            int r3 = r1.getWidth()     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x005f
            int r3 = r1.getHeight()     // Catch:{ all -> 0x0061 }
            if (r3 != 0) goto L_0x0058
            goto L_0x005f
        L_0x0058:
            androidx.camera.view.b r3 = r0.f14464a     // Catch:{ all -> 0x0061 }
            r3.a(r2, r1)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0060
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
        L_0x0060:
            return
        L_0x0061:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.a():void");
    }

    public Bitmap getBitmap() {
        Bitmap b10;
        m.a();
        c cVar = this.f1455b;
        if (cVar == null || (b10 = cVar.b()) == null) {
            return null;
        }
        b bVar = cVar.f1497c;
        Size size = new Size(cVar.f1496b.getWidth(), cVar.f1496b.getHeight());
        int layoutDirection = cVar.f1496b.getLayoutDirection();
        if (!bVar.f()) {
            return b10;
        }
        Matrix d10 = bVar.d();
        RectF e10 = bVar.e(layoutDirection, size);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b10.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d10);
        matrix.postScale(e10.width() / ((float) bVar.f1487a.getWidth()), e10.height() / ((float) bVar.f1487a.getHeight()));
        matrix.postTranslate(e10.left, e10.top);
        canvas.drawBitmap(b10, matrix, new Paint(7));
        return createBitmap;
    }

    public r0.a getController() {
        m.a();
        return null;
    }

    public c getImplementationMode() {
        m.a();
        return this.f1454a;
    }

    public r0 getMeteringPointFactory() {
        m.a();
        return this.f1461o;
    }

    public t0.a getOutputTransform() {
        Matrix matrix;
        m.a();
        try {
            matrix = this.f1456c.c(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = this.f1456c.f1488b;
        if (matrix == null || rect == null) {
            p0.a("PreviewView");
            return null;
        }
        RectF rectF = n.f10263a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(n.f10263a, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.f1455b instanceof f) {
            matrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            p0.g("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new t0.a();
    }

    public androidx.lifecycle.p<g> getPreviewStreamState() {
        return this.f1458e;
    }

    public f getScaleType() {
        m.a();
        return this.f1456c.f1494h;
    }

    public Matrix getSensorToViewTransform() {
        m.a();
        b bVar = this.f1456c;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        if (!bVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(bVar.f1490d);
        matrix.postConcat(bVar.c(layoutDirection, size));
        return matrix;
    }

    public t0.c getSurfaceProvider() {
        m.a();
        return this.f1465s;
    }

    public g1 getViewPort() {
        m.a();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        m.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new g1(getViewPortScaleType(), new Rational(getWidth(), getHeight()), rotation, getLayoutDirection());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f1463q, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f1464r);
        c cVar = this.f1455b;
        if (cVar != null) {
            cVar.c();
        }
        m.a();
        getViewPort();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f1464r);
        c cVar = this.f1455b;
        if (cVar != null) {
            cVar.d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.f1463q);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final boolean performClick() {
        return super.performClick();
    }

    public void setController(r0.a aVar) {
        m.a();
        m.a();
        getViewPort();
    }

    public void setFrameUpdateListener(Executor executor, d dVar) {
        if (this.f1454a != c.PERFORMANCE) {
            this.f1460n = executor;
            c cVar = this.f1455b;
            if (cVar != null) {
                cVar.g(executor, dVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
    }

    public void setImplementationMode(c cVar) {
        m.a();
        this.f1454a = cVar;
    }

    public void setScaleType(f fVar) {
        m.a();
        this.f1456c.f1494h = fVar;
        a();
        m.a();
        getViewPort();
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        this.f1454a = c.PERFORMANCE;
        b bVar = new b();
        this.f1456c = bVar;
        this.f1457d = true;
        this.f1458e = new p<>(g.IDLE);
        this.f1459f = new AtomicReference<>();
        this.f1461o = new r0.g(bVar);
        this.f1463q = new b();
        this.f1464r = new r0.e(this, 0);
        this.f1465s = new a();
        m.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = R$styleable.PreviewView;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        d0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        try {
            int integer = obtainStyledAttributes.getInteger(R$styleable.PreviewView_scaleType, bVar.f1494h.f1477a);
            for (f fVar : f.values()) {
                if (fVar.f1477a == integer) {
                    setScaleType(fVar);
                    int integer2 = obtainStyledAttributes.getInteger(R$styleable.PreviewView_implementationMode, 0);
                    for (c cVar : c.values()) {
                        if (cVar.f1470a == integer2) {
                            setImplementationMode(cVar);
                            obtainStyledAttributes.recycle();
                            new ScaleGestureDetector(context, new e());
                            if (getBackground() == null) {
                                setBackgroundColor(k1.a.getColor(getContext(), 17170444));
                                return;
                            }
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
