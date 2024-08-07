package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageReader;
import android.media.ImageWriter;
import androidx.camera.core.d;
import androidx.camera.core.f;
import c0.b0;
import f0.d0;
import g0.n;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* compiled from: ImageAnalysisAbstractAnalyzer */
public abstract class e0 implements d0.a {

    /* renamed from: a  reason: collision with root package name */
    public b0.a f4229a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f4230b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f4231c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f4232d = 1;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4233e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f4234f;

    /* renamed from: n  reason: collision with root package name */
    public Executor f4235n;

    /* renamed from: o  reason: collision with root package name */
    public f f4236o;

    /* renamed from: p  reason: collision with root package name */
    public ImageWriter f4237p;

    /* renamed from: q  reason: collision with root package name */
    public Rect f4238q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public Rect f4239r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public Matrix f4240s = new Matrix();

    /* renamed from: t  reason: collision with root package name */
    public Matrix f4241t = new Matrix();

    /* renamed from: u  reason: collision with root package name */
    public ByteBuffer f4242u;

    /* renamed from: v  reason: collision with root package name */
    public ByteBuffer f4243v;

    /* renamed from: w  reason: collision with root package name */
    public ByteBuffer f4244w;

    /* renamed from: x  reason: collision with root package name */
    public ByteBuffer f4245x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f4246y = new Object();

    /* renamed from: z  reason: collision with root package name */
    public boolean f4247z = true;

    public abstract d a(d0 d0Var);

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0070  */
    public final v8.a<java.lang.Void> b(androidx.camera.core.d r15) {
        /*
            r14 = this;
            boolean r0 = r14.f4233e
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r0 = r14.f4230b
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            java.lang.Object r2 = r14.f4246y
            monitor-enter(r2)
            java.util.concurrent.Executor r9 = r14.f4235n     // Catch:{ all -> 0x00c2 }
            c0.b0$a r10 = r14.f4229a     // Catch:{ all -> 0x00c2 }
            boolean r3 = r14.f4233e     // Catch:{ all -> 0x00c2 }
            r11 = 1
            if (r3 == 0) goto L_0x001b
            int r3 = r14.f4231c     // Catch:{ all -> 0x00c2 }
            if (r0 == r3) goto L_0x001b
            r12 = r11
            goto L_0x001c
        L_0x001b:
            r12 = r1
        L_0x001c:
            if (r12 == 0) goto L_0x0021
            r14.h(r15, r0)     // Catch:{ all -> 0x00c2 }
        L_0x0021:
            boolean r3 = r14.f4233e     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x0028
            r14.d(r15)     // Catch:{ all -> 0x00c2 }
        L_0x0028:
            androidx.camera.core.f r3 = r14.f4236o     // Catch:{ all -> 0x00c2 }
            android.media.ImageWriter r4 = r14.f4237p     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r5 = r14.f4242u     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r6 = r14.f4243v     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r7 = r14.f4244w     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r8 = r14.f4245x     // Catch:{ all -> 0x00c2 }
            monitor-exit(r2)     // Catch:{ all -> 0x00c2 }
            if (r10 == 0) goto L_0x00b4
            if (r9 == 0) goto L_0x00b4
            boolean r2 = r14.f4247z
            if (r2 == 0) goto L_0x00b4
            if (r3 == 0) goto L_0x0068
            int r2 = r14.f4232d
            r13 = 2
            if (r2 != r13) goto L_0x004b
            boolean r2 = r14.f4234f
            c0.w0 r2 = androidx.camera.core.ImageProcessingUtil.c(r15, r3, r5, r0, r2)
            goto L_0x0069
        L_0x004b:
            int r2 = r14.f4232d
            if (r2 != r11) goto L_0x0068
            boolean r2 = r14.f4234f
            if (r2 == 0) goto L_0x0056
            androidx.camera.core.ImageProcessingUtil.a(r15)
        L_0x0056:
            if (r4 == 0) goto L_0x0068
            if (r6 == 0) goto L_0x0068
            if (r7 == 0) goto L_0x0068
            if (r8 == 0) goto L_0x0068
            r2 = r15
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r0
            c0.w0 r2 = androidx.camera.core.ImageProcessingUtil.g(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            if (r2 != 0) goto L_0x006c
            r1 = r11
        L_0x006c:
            if (r1 == 0) goto L_0x0070
            r8 = r15
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            java.lang.Object r3 = r14.f4246y
            monitor-enter(r3)
            if (r12 == 0) goto L_0x0095
            if (r1 != 0) goto L_0x0095
            int r1 = r15.c()     // Catch:{ all -> 0x00b1 }
            int r4 = r15.b()     // Catch:{ all -> 0x00b1 }
            int r5 = r8.c()     // Catch:{ all -> 0x00b1 }
            int r6 = r8.b()     // Catch:{ all -> 0x00b1 }
            r14.g(r1, r4, r5, r6)     // Catch:{ all -> 0x00b1 }
        L_0x0095:
            r14.f4231c = r0     // Catch:{ all -> 0x00b1 }
            android.graphics.Rect r0 = r14.f4239r     // Catch:{ all -> 0x00b1 }
            r2.set(r0)     // Catch:{ all -> 0x00b1 }
            android.graphics.Matrix r0 = r14.f4241t     // Catch:{ all -> 0x00b1 }
            r7.set(r0)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            c0.c0 r0 = new c0.c0
            r3 = r0
            r4 = r14
            r5 = r9
            r6 = r15
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            z0.b$d r15 = z0.b.a(r0)
            goto L_0x00c1
        L_0x00b1:
            r15 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            throw r15
        L_0x00b4:
            androidx.core.os.OperationCanceledException r15 = new androidx.core.os.OperationCanceledException
            java.lang.String r0 = "No analyzer or executor currently set."
            r15.<init>(r0)
            i0.i$a r0 = new i0.i$a
            r0.<init>(r15)
            r15 = r0
        L_0x00c1:
            return r15
        L_0x00c2:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c2 }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.e0.b(androidx.camera.core.d):v8.a");
    }

    public abstract void c();

    public final void d(d dVar) {
        if (this.f4232d == 1) {
            if (this.f4243v == null) {
                this.f4243v = ByteBuffer.allocateDirect(dVar.b() * dVar.c());
            }
            this.f4243v.position(0);
            if (this.f4244w == null) {
                this.f4244w = ByteBuffer.allocateDirect((dVar.b() * dVar.c()) / 4);
            }
            this.f4244w.position(0);
            if (this.f4245x == null) {
                this.f4245x = ByteBuffer.allocateDirect((dVar.b() * dVar.c()) / 4);
            }
            this.f4245x.position(0);
        } else if (this.f4232d == 2 && this.f4242u == null) {
            this.f4242u = ByteBuffer.allocateDirect(dVar.b() * dVar.c() * 4);
        }
    }

    public abstract void e(d dVar);

    public final void f(d0 d0Var) {
        try {
            d a10 = a(d0Var);
            if (a10 != null) {
                e(a10);
            }
        } catch (IllegalStateException unused) {
            p0.c("ImageAnalysisAnalyzer");
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        int i14 = this.f4230b;
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) i10, (float) i11);
            RectF rectF2 = n.f10263a;
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            matrix.postRotate((float) i14);
            RectF rectF3 = new RectF(0.0f, 0.0f, (float) i12, (float) i13);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f4238q);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f4239r = rect;
        this.f4241t.setConcat(this.f4240s, matrix);
    }

    public final void h(d dVar, int i10) {
        boolean z10;
        int i11;
        f fVar = this.f4236o;
        if (fVar != null) {
            fVar.a();
            int c10 = dVar.c();
            int b10 = dVar.b();
            int e10 = this.f4236o.e();
            int h10 = this.f4236o.h();
            if (i10 == 90 || i10 == 270) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = b10;
            } else {
                i11 = c10;
            }
            if (!z10) {
                c10 = b10;
            }
            this.f4236o = new f(new b(ImageReader.newInstance(i11, c10, e10, h10)));
            if (this.f4232d == 1) {
                ImageWriter imageWriter = this.f4237p;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.f4237p = ImageWriter.newInstance(this.f4236o.getSurface(), this.f4236o.h());
            }
        }
    }
}
