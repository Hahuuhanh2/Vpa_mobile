package yd;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import com.google.zxing.client.android.R$id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xd.h;
import xd.n;
import xd.o;
import zc.b;

/* compiled from: CameraManager */
public final class e {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f17694n = 0;

    /* renamed from: a  reason: collision with root package name */
    public Camera f17695a;

    /* renamed from: b  reason: collision with root package name */
    public Camera.CameraInfo f17696b;

    /* renamed from: c  reason: collision with root package name */
    public a f17697c;

    /* renamed from: d  reason: collision with root package name */
    public b f17698d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17699e;

    /* renamed from: f  reason: collision with root package name */
    public String f17700f;

    /* renamed from: g  reason: collision with root package name */
    public f f17701g = new f();

    /* renamed from: h  reason: collision with root package name */
    public i f17702h;

    /* renamed from: i  reason: collision with root package name */
    public n f17703i;

    /* renamed from: j  reason: collision with root package name */
    public n f17704j;

    /* renamed from: k  reason: collision with root package name */
    public int f17705k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Context f17706l;

    /* renamed from: m  reason: collision with root package name */
    public final a f17707m;

    /* compiled from: CameraManager */
    public final class a implements Camera.PreviewCallback {

        /* renamed from: a  reason: collision with root package name */
        public l f17708a;

        /* renamed from: b  reason: collision with root package name */
        public n f17709b;

        public a() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            n nVar = this.f17709b;
            l lVar = this.f17708a;
            if (nVar == null || lVar == null) {
                int i10 = e.f17694n;
                if (lVar != null) {
                    new Exception("No resolution available");
                    h.b bVar = (h.b) lVar;
                    synchronized (h.this.f17299h) {
                        h hVar = h.this;
                        if (hVar.f17298g) {
                            hVar.f17294c.obtainMessage(R$id.zxing_preview_failed).sendToTarget();
                        }
                    }
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    o oVar = new o(bArr2, nVar.f17310a, nVar.f17311b, camera.getParameters().getPreviewFormat(), e.this.f17705k);
                    h.b bVar2 = (h.b) lVar;
                    synchronized (h.this.f17299h) {
                        h hVar2 = h.this;
                        if (hVar2.f17298g) {
                            hVar2.f17294c.obtainMessage(R$id.zxing_decode, oVar).sendToTarget();
                        }
                    }
                } catch (RuntimeException unused) {
                    int i11 = e.f17694n;
                    h.b bVar3 = (h.b) lVar;
                    synchronized (h.this.f17299h) {
                        h hVar3 = h.this;
                        if (hVar3.f17298g) {
                            hVar3.f17294c.obtainMessage(R$id.zxing_preview_failed).sendToTarget();
                        }
                    }
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
        }
    }

    public e(Context context) {
        this.f17706l = context;
        this.f17707m = new a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:2|3|4|(12:(2:7|(2:9|(1:11)(1:12))(1:13))(1:14)|16|(1:18)(1:19)|20|21|22|23|24|25|(1:28)(1:29)|30|31)|15|16|(0)(0)|20|21|22|23|24|25|(0)(0)|30|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ Exception -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[Catch:{ Exception -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            android.hardware.Camera r0 = r6.f17695a
            if (r0 == 0) goto L_0x0065
            r1 = 0
            r2 = 1
            yd.i r3 = r6.f17702h     // Catch:{ Exception -> 0x003b }
            int r3 = r3.f17718b     // Catch:{ Exception -> 0x003b }
            if (r3 == 0) goto L_0x001e
            if (r3 == r2) goto L_0x001b
            r4 = 2
            if (r3 == r4) goto L_0x0018
            r4 = 3
            if (r3 == r4) goto L_0x0015
            goto L_0x001e
        L_0x0015:
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x001f
        L_0x0018:
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x001f
        L_0x001b:
            r3 = 90
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            android.hardware.Camera$CameraInfo r4 = r6.f17696b     // Catch:{ Exception -> 0x003b }
            int r5 = r4.facing     // Catch:{ Exception -> 0x003b }
            if (r5 != r2) goto L_0x002f
            int r4 = r4.orientation     // Catch:{ Exception -> 0x003b }
            int r4 = r4 + r3
            int r4 = r4 % 360
            int r3 = 360 - r4
            int r3 = r3 % 360
            goto L_0x0036
        L_0x002f:
            int r4 = r4.orientation     // Catch:{ Exception -> 0x003b }
            int r4 = r4 - r3
            int r4 = r4 + 360
            int r3 = r4 % 360
        L_0x0036:
            r6.f17705k = r3     // Catch:{ Exception -> 0x003b }
            r0.setDisplayOrientation(r3)     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            r6.c(r1)     // Catch:{ Exception -> 0x003f }
            goto L_0x0042
        L_0x003f:
            r6.c(r2)     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            android.hardware.Camera r0 = r6.f17695a
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            android.hardware.Camera$Size r0 = r0.getPreviewSize()
            if (r0 != 0) goto L_0x0053
            xd.n r0 = r6.f17703i
            r6.f17704j = r0
            goto L_0x005e
        L_0x0053:
            xd.n r1 = new xd.n
            int r2 = r0.width
            int r0 = r0.height
            r1.<init>(r2, r0)
            r6.f17704j = r1
        L_0x005e:
            yd.e$a r0 = r6.f17707m
            xd.n r1 = r6.f17704j
            r0.f17709b = r1
            return
        L_0x0065:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Camera not open"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.e.a():void");
    }

    public final void b() {
        Camera camera;
        int a10 = bd.a.a(this.f17701g.f17711a);
        if (a10 == -1) {
            camera = null;
        } else {
            camera = Camera.open(a10);
        }
        this.f17695a = camera;
        if (camera != null) {
            int a11 = bd.a.a(this.f17701g.f17711a);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f17696b = cameraInfo;
            Camera.getCameraInfo(a11, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    public final void c(boolean z10) {
        boolean z11;
        Camera.Parameters parameters = this.f17695a.getParameters();
        String str = this.f17700f;
        if (str == null) {
            this.f17700f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters != null) {
            parameters.flatten();
            this.f17701g.getClass();
            int i10 = ad.a.f165a;
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            String a10 = ad.a.a(supportedFocusModes, "auto");
            if (!z10 && a10 == null) {
                a10 = ad.a.a(supportedFocusModes, "macro", "edof");
            }
            if (a10 != null && !a10.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(a10);
            }
            if (!z10) {
                ad.a.b(parameters, false);
                this.f17701g.getClass();
                this.f17701g.getClass();
                this.f17701g.getClass();
            }
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            ArrayList arrayList = new ArrayList();
            if (supportedPreviewSizes == null) {
                Camera.Size previewSize = parameters.getPreviewSize();
                if (previewSize != null) {
                    arrayList.add(new n(previewSize.width, previewSize.height));
                }
            } else {
                for (Camera.Size next : supportedPreviewSizes) {
                    arrayList.add(new n(next.width, next.height));
                }
            }
            int[] iArr = null;
            if (arrayList.size() == 0) {
                this.f17703i = null;
            } else {
                i iVar = this.f17702h;
                int i11 = this.f17705k;
                if (i11 != -1) {
                    if (i11 % 180 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    n nVar = iVar.f17717a;
                    if (nVar == null) {
                        nVar = null;
                    } else if (z11) {
                        nVar = new n(nVar.f17311b, nVar.f17310a);
                    }
                    n nVar2 = iVar.f17719c;
                    nVar2.getClass();
                    if (nVar != null) {
                        Collections.sort(arrayList, new m(nVar2, nVar));
                    }
                    Objects.toString(nVar);
                    Objects.toString(arrayList);
                    n nVar3 = (n) arrayList.get(0);
                    this.f17703i = nVar3;
                    parameters.setPreviewSize(nVar3.f17310a, nVar3.f17311b);
                } else {
                    throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                }
            }
            if (Build.DEVICE.equals("glass-1")) {
                List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                    Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                    while (it.hasNext()) {
                        Arrays.toString(it.next());
                        it.hasNext();
                    }
                }
                if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                    Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        int[] next2 = it2.next();
                        int i12 = next2[0];
                        int i13 = next2[1];
                        if (i12 >= 10000 && i13 <= 20000) {
                            iArr = next2;
                            break;
                        }
                    }
                    if (iArr != null) {
                        int[] iArr2 = new int[2];
                        parameters.getPreviewFpsRange(iArr2);
                        if (Arrays.equals(iArr2, iArr)) {
                            Arrays.toString(iArr);
                        } else {
                            Arrays.toString(iArr);
                            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                        }
                    }
                }
            }
            parameters.flatten();
            this.f17695a.setParameters(parameters);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|(2:16|(2:18|19))|20|21|(2:23|(1:38)(5:27|28|29|30|32))(1:36)) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0068 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[Catch:{ RuntimeException -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(boolean r5) {
        /*
            r4 = this;
            android.hardware.Camera r0 = r4.f17695a
            if (r0 == 0) goto L_0x006b
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ RuntimeException -> 0x006b }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r0.getFlashMode()     // Catch:{ RuntimeException -> 0x006b }
            if (r0 == 0) goto L_0x0024
            java.lang.String r3 = "on"
            boolean r3 = r3.equals(r0)     // Catch:{ RuntimeException -> 0x006b }
            if (r3 != 0) goto L_0x0022
            java.lang.String r3 = "torch"
            boolean r0 = r3.equals(r0)     // Catch:{ RuntimeException -> 0x006b }
            if (r0 == 0) goto L_0x0024
        L_0x0022:
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            if (r5 == r0) goto L_0x006b
            yd.a r0 = r4.f17697c     // Catch:{ RuntimeException -> 0x006b }
            if (r0 == 0) goto L_0x003d
            r0.f17662a = r1     // Catch:{ RuntimeException -> 0x006b }
            r0.f17663b = r2     // Catch:{ RuntimeException -> 0x006b }
            android.os.Handler r3 = r0.f17666e     // Catch:{ RuntimeException -> 0x006b }
            r3.removeMessages(r1)     // Catch:{ RuntimeException -> 0x006b }
            boolean r3 = r0.f17664c     // Catch:{ RuntimeException -> 0x006b }
            if (r3 == 0) goto L_0x003d
            android.hardware.Camera r0 = r0.f17665d     // Catch:{ RuntimeException -> 0x003d }
            r0.cancelAutoFocus()     // Catch:{ RuntimeException -> 0x003d }
        L_0x003d:
            android.hardware.Camera r0 = r4.f17695a     // Catch:{ RuntimeException -> 0x006b }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ RuntimeException -> 0x006b }
            ad.a.b(r0, r5)     // Catch:{ RuntimeException -> 0x006b }
            yd.f r5 = r4.f17701g     // Catch:{ RuntimeException -> 0x006b }
            r5.getClass()     // Catch:{ RuntimeException -> 0x006b }
            android.hardware.Camera r5 = r4.f17695a     // Catch:{ RuntimeException -> 0x006b }
            r5.setParameters(r0)     // Catch:{ RuntimeException -> 0x006b }
            yd.a r5 = r4.f17697c     // Catch:{ RuntimeException -> 0x006b }
            if (r5 == 0) goto L_0x006b
            r5.f17662a = r2     // Catch:{ RuntimeException -> 0x006b }
            boolean r0 = r5.f17664c     // Catch:{ RuntimeException -> 0x006b }
            if (r0 == 0) goto L_0x006b
            boolean r0 = r5.f17663b     // Catch:{ RuntimeException -> 0x006b }
            if (r0 != 0) goto L_0x006b
            android.hardware.Camera r0 = r5.f17665d     // Catch:{ RuntimeException -> 0x0068 }
            yd.a$b r2 = r5.f17667f     // Catch:{ RuntimeException -> 0x0068 }
            r0.autoFocus(r2)     // Catch:{ RuntimeException -> 0x0068 }
            r5.f17663b = r1     // Catch:{ RuntimeException -> 0x0068 }
            goto L_0x006b
        L_0x0068:
            r5.a()     // Catch:{ RuntimeException -> 0x006b }
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.e.d(boolean):void");
    }

    public final void e() {
        Camera camera = this.f17695a;
        if (camera != null && !this.f17699e) {
            camera.startPreview();
            this.f17699e = true;
            this.f17697c = new a(this.f17695a, this.f17701g);
            Context context = this.f17706l;
            f fVar = this.f17701g;
            this.f17698d = new b(context, this, fVar);
            fVar.getClass();
        }
    }
}
