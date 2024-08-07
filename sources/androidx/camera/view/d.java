package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import c0.d1;
import c0.p0;
import e0.c0;
import java.util.Objects;
import java.util.concurrent.Executor;
import r0.f;
import v.i;

/* compiled from: SurfaceViewImplementation */
public final class d extends c {

    /* renamed from: e  reason: collision with root package name */
    public SurfaceView f1499e;

    /* renamed from: f  reason: collision with root package name */
    public final b f1500f = new b();

    /* compiled from: SurfaceViewImplementation */
    public static class a {
        public static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* compiled from: SurfaceViewImplementation */
    public class b implements SurfaceHolder.Callback {

        /* renamed from: a  reason: collision with root package name */
        public Size f1501a;

        /* renamed from: b  reason: collision with root package name */
        public d1 f1502b;

        /* renamed from: c  reason: collision with root package name */
        public d1 f1503c;

        /* renamed from: d  reason: collision with root package name */
        public c.a f1504d;

        /* renamed from: e  reason: collision with root package name */
        public Size f1505e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1506f = false;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1507n = false;

        public b() {
        }

        public final void a() {
            if (this.f1502b != null) {
                Objects.toString(this.f1502b);
                p0.a("SurfaceViewImpl");
                this.f1502b.b();
            }
        }

        public final boolean b() {
            boolean z10;
            Surface surface = d.this.f1499e.getHolder().getSurface();
            if (this.f1506f || this.f1502b == null || !Objects.equals(this.f1501a, this.f1505e)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            p0.a("SurfaceViewImpl");
            c.a aVar = this.f1504d;
            d1 d1Var = this.f1502b;
            Objects.requireNonNull(d1Var);
            d1Var.a(surface, k1.a.getMainExecutor(d.this.f1499e.getContext()), new c0(aVar, 1));
            this.f1506f = true;
            d dVar = d.this;
            dVar.f1498d = true;
            dVar.f();
            return true;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            p0.a("SurfaceViewImpl");
            this.f1505e = new Size(i11, i12);
            b();
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            d1 d1Var;
            p0.a("SurfaceViewImpl");
            if (this.f1507n && (d1Var = this.f1503c) != null) {
                d1Var.b();
                d1Var.f4219g.a(null);
                this.f1503c = null;
                this.f1507n = false;
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            p0.a("SurfaceViewImpl");
            if (!this.f1506f) {
                a();
            } else if (this.f1502b != null) {
                Objects.toString(this.f1502b);
                p0.a("SurfaceViewImpl");
                this.f1502b.f4221i.a();
            }
            this.f1507n = true;
            d1 d1Var = this.f1502b;
            if (d1Var != null) {
                this.f1503c = d1Var;
            }
            this.f1506f = false;
            this.f1502b = null;
            this.f1504d = null;
            this.f1505e = null;
            this.f1501a = null;
        }
    }

    public d(PreviewView previewView, b bVar) {
        super(previewView, bVar);
    }

    public final View a() {
        return this.f1499e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        c0.p0.c("SurfaceViewImpl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r3.quitSafely();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b() {
        /*
            r8 = this;
            java.lang.String r0 = "SurfaceViewImpl"
            android.view.SurfaceView r1 = r8.f1499e
            if (r1 == 0) goto L_0x0072
            android.view.SurfaceHolder r1 = r1.getHolder()
            android.view.Surface r1 = r1.getSurface()
            if (r1 == 0) goto L_0x0072
            android.view.SurfaceView r1 = r8.f1499e
            android.view.SurfaceHolder r1 = r1.getHolder()
            android.view.Surface r1 = r1.getSurface()
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0021
            goto L_0x0072
        L_0x0021:
            java.util.concurrent.Semaphore r1 = new java.util.concurrent.Semaphore
            r2 = 0
            r1.<init>(r2)
            android.view.SurfaceView r2 = r8.f1499e
            int r2 = r2.getWidth()
            android.view.SurfaceView r3 = r8.f1499e
            int r3 = r3.getHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            android.os.HandlerThread r3 = new android.os.HandlerThread
            java.lang.String r4 = "pixelCopyRequest Thread"
            r3.<init>(r4)
            r3.start()
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = r3.getLooper()
            r4.<init>(r5)
            android.view.SurfaceView r5 = r8.f1499e
            r0.h r6 = new r0.h
            r6.<init>(r1)
            androidx.camera.view.d.a.a(r5, r2, r6, r4)
            r4 = 1
            r5 = 100
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0067 }
            boolean r1 = r1.tryAcquire(r4, r5, r7)     // Catch:{ InterruptedException -> 0x0067 }
            if (r1 != 0) goto L_0x006a
            c0.p0.b(r0)     // Catch:{ InterruptedException -> 0x0067 }
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            goto L_0x006e
        L_0x0067:
            c0.p0.c(r0)     // Catch:{ all -> 0x0065 }
        L_0x006a:
            r3.quitSafely()
            return r2
        L_0x006e:
            r3.quitSafely()
            throw r0
        L_0x0072:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.d.b():android.graphics.Bitmap");
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e(d1 d1Var, f fVar) {
        boolean z10;
        SurfaceView surfaceView = this.f1499e;
        boolean equals = Objects.equals(this.f1495a, d1Var.f4214b);
        if (surfaceView == null || !equals) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f1495a = d1Var.f4214b;
            this.f1496b.getClass();
            this.f1495a.getClass();
            SurfaceView surfaceView2 = new SurfaceView(this.f1496b.getContext());
            this.f1499e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f1495a.getWidth(), this.f1495a.getHeight()));
            this.f1496b.removeAllViews();
            this.f1496b.addView(this.f1499e);
            this.f1499e.getHolder().addCallback(this.f1500f);
        }
        Executor mainExecutor = k1.a.getMainExecutor(this.f1499e.getContext());
        d.d dVar = new d.d(fVar, 16);
        z0.c<Void> cVar = d1Var.f4220h.f17800c;
        if (cVar != null) {
            cVar.b(dVar, mainExecutor);
        }
        this.f1499e.post(new i(2, this, d1Var, fVar));
    }

    public final void g(Executor executor, PreviewView.d dVar) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    public final v8.a<Void> h() {
        return i0.f.c((Object) null);
    }
}
