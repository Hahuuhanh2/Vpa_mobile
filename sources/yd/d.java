package yd;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.google.zxing.client.android.R$id;
import x2.g;
import xd.n;

/* compiled from: CameraInstance */
public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f17676n = 0;

    /* renamed from: a  reason: collision with root package name */
    public g f17677a;

    /* renamed from: b  reason: collision with root package name */
    public g f17678b;

    /* renamed from: c  reason: collision with root package name */
    public e f17679c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f17680d;

    /* renamed from: e  reason: collision with root package name */
    public i f17681e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17682f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17683g = true;

    /* renamed from: h  reason: collision with root package name */
    public Handler f17684h;

    /* renamed from: i  reason: collision with root package name */
    public f f17685i = new f();

    /* renamed from: j  reason: collision with root package name */
    public a f17686j = new a();

    /* renamed from: k  reason: collision with root package name */
    public b f17687k = new b();

    /* renamed from: l  reason: collision with root package name */
    public c f17688l = new c();

    /* renamed from: m  reason: collision with root package name */
    public C0239d f17689m = new C0239d();

    /* compiled from: CameraInstance */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            try {
                int i10 = d.f17676n;
                d.this.f17679c.b();
            } catch (Exception e10) {
                Handler handler = d.this.f17680d;
                if (handler != null) {
                    handler.obtainMessage(R$id.zxing_camera_error, e10).sendToTarget();
                }
            }
        }
    }

    /* compiled from: CameraInstance */
    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            boolean z10;
            try {
                int i10 = d.f17676n;
                d.this.f17679c.a();
                d dVar = d.this;
                Handler handler = dVar.f17680d;
                if (handler != null) {
                    int i11 = R$id.zxing_prewiew_size_ready;
                    e eVar = dVar.f17679c;
                    n nVar = eVar.f17704j;
                    if (nVar == null) {
                        nVar = null;
                    } else {
                        int i12 = eVar.f17705k;
                        if (i12 != -1) {
                            if (i12 % 180 != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                nVar = new n(nVar.f17311b, nVar.f17310a);
                            }
                        } else {
                            throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                        }
                    }
                    handler.obtainMessage(i11, nVar).sendToTarget();
                }
            } catch (Exception e10) {
                Handler handler2 = d.this.f17680d;
                if (handler2 != null) {
                    handler2.obtainMessage(R$id.zxing_camera_error, e10).sendToTarget();
                }
            }
        }
    }

    /* compiled from: CameraInstance */
    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            try {
                int i10 = d.f17676n;
                d dVar = d.this;
                e eVar = dVar.f17679c;
                g gVar = dVar.f17678b;
                Camera camera = eVar.f17695a;
                SurfaceHolder surfaceHolder = (SurfaceHolder) gVar.f16904b;
                if (surfaceHolder != null) {
                    camera.setPreviewDisplay(surfaceHolder);
                } else {
                    camera.setPreviewTexture((SurfaceTexture) gVar.f16905c);
                }
                d.this.f17679c.e();
            } catch (Exception e10) {
                Handler handler = d.this.f17680d;
                if (handler != null) {
                    handler.obtainMessage(R$id.zxing_camera_error, e10).sendToTarget();
                }
            }
        }
    }

    /* renamed from: yd.d$d  reason: collision with other inner class name */
    /* compiled from: CameraInstance */
    public class C0239d implements Runnable {
        public C0239d() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:4|(2:6|7)|8|9) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                r0 = 1
                r1 = 0
                int r2 = yd.d.f17676n     // Catch:{ Exception -> 0x0046 }
                yd.d r2 = yd.d.this     // Catch:{ Exception -> 0x0046 }
                yd.e r2 = r2.f17679c     // Catch:{ Exception -> 0x0046 }
                yd.a r3 = r2.f17697c     // Catch:{ Exception -> 0x0046 }
                r4 = 0
                if (r3 == 0) goto L_0x0021
                r3.f17662a = r0     // Catch:{ Exception -> 0x0046 }
                r3.f17663b = r4     // Catch:{ Exception -> 0x0046 }
                android.os.Handler r5 = r3.f17666e     // Catch:{ Exception -> 0x0046 }
                r5.removeMessages(r0)     // Catch:{ Exception -> 0x0046 }
                boolean r5 = r3.f17664c     // Catch:{ Exception -> 0x0046 }
                if (r5 == 0) goto L_0x001f
                android.hardware.Camera r3 = r3.f17665d     // Catch:{ RuntimeException -> 0x001f }
                r3.cancelAutoFocus()     // Catch:{ RuntimeException -> 0x001f }
            L_0x001f:
                r2.f17697c = r1     // Catch:{ Exception -> 0x0046 }
            L_0x0021:
                zc.b r3 = r2.f17698d     // Catch:{ Exception -> 0x0046 }
                if (r3 == 0) goto L_0x0027
                r2.f17698d = r1     // Catch:{ Exception -> 0x0046 }
            L_0x0027:
                android.hardware.Camera r3 = r2.f17695a     // Catch:{ Exception -> 0x0046 }
                if (r3 == 0) goto L_0x0038
                boolean r5 = r2.f17699e     // Catch:{ Exception -> 0x0046 }
                if (r5 == 0) goto L_0x0038
                r3.stopPreview()     // Catch:{ Exception -> 0x0046 }
                yd.e$a r3 = r2.f17707m     // Catch:{ Exception -> 0x0046 }
                r3.f17708a = r1     // Catch:{ Exception -> 0x0046 }
                r2.f17699e = r4     // Catch:{ Exception -> 0x0046 }
            L_0x0038:
                yd.d r2 = yd.d.this     // Catch:{ Exception -> 0x0046 }
                yd.e r2 = r2.f17679c     // Catch:{ Exception -> 0x0046 }
                android.hardware.Camera r3 = r2.f17695a     // Catch:{ Exception -> 0x0046 }
                if (r3 == 0) goto L_0x0048
                r3.release()     // Catch:{ Exception -> 0x0046 }
                r2.f17695a = r1     // Catch:{ Exception -> 0x0046 }
                goto L_0x0048
            L_0x0046:
                int r2 = yd.d.f17676n
            L_0x0048:
                yd.d r2 = yd.d.this
                r2.f17683g = r0
                android.os.Handler r0 = r2.f17680d
                int r2 = com.google.zxing.client.android.R$id.zxing_camera_closed
                r0.sendEmptyMessage(r2)
                yd.d r0 = yd.d.this
                yd.g r0 = r0.f17677a
                java.lang.Object r2 = r0.f17716d
                monitor-enter(r2)
                int r3 = r0.f17715c     // Catch:{ all -> 0x0075 }
                int r3 = r3 + -1
                r0.f17715c = r3     // Catch:{ all -> 0x0075 }
                if (r3 != 0) goto L_0x0073
                java.lang.Object r3 = r0.f17716d     // Catch:{ all -> 0x0075 }
                monitor-enter(r3)     // Catch:{ all -> 0x0075 }
                android.os.HandlerThread r4 = r0.f17714b     // Catch:{ all -> 0x0070 }
                r4.quit()     // Catch:{ all -> 0x0070 }
                r0.f17714b = r1     // Catch:{ all -> 0x0070 }
                r0.f17713a = r1     // Catch:{ all -> 0x0070 }
                monitor-exit(r3)     // Catch:{ all -> 0x0070 }
                goto L_0x0073
            L_0x0070:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0070 }
                throw r0     // Catch:{ all -> 0x0075 }
            L_0x0073:
                monitor-exit(r2)     // Catch:{ all -> 0x0075 }
                return
            L_0x0075:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0075 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yd.d.C0239d.run():void");
        }
    }

    public d(Context context) {
        j7.a.F0();
        if (g.f17712e == null) {
            g.f17712e = new g();
        }
        this.f17677a = g.f17712e;
        e eVar = new e(context);
        this.f17679c = eVar;
        eVar.f17701g = this.f17685i;
        this.f17684h = new Handler();
    }
}
