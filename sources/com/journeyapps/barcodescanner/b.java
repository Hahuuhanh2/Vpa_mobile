package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import com.google.zxing.client.android.R$string;
import com.journeyapps.barcodescanner.CameraPreview;
import java.util.List;
import uc.j;
import zc.h;

/* compiled from: CaptureManager */
public final class b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f8014l = 0;

    /* renamed from: a  reason: collision with root package name */
    public Activity f8015a;

    /* renamed from: b  reason: collision with root package name */
    public DecoratedBarcodeView f8016b;

    /* renamed from: c  reason: collision with root package name */
    public int f8017c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8018d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8019e = false;

    /* renamed from: f  reason: collision with root package name */
    public h f8020f;

    /* renamed from: g  reason: collision with root package name */
    public zc.e f8021g;

    /* renamed from: h  reason: collision with root package name */
    public Handler f8022h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8023i = false;

    /* renamed from: j  reason: collision with root package name */
    public a f8024j = new a();

    /* renamed from: k  reason: collision with root package name */
    public boolean f8025k;

    /* compiled from: CaptureManager */
    public class a implements xd.a {

        /* renamed from: com.journeyapps.barcodescanner.b$a$a  reason: collision with other inner class name */
        /* compiled from: CaptureManager */
        public class C0076a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ xd.b f8027a;

            public C0076a(xd.b bVar) {
                this.f8027a = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:24:0x00ce  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0137  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r15 = this;
                    com.journeyapps.barcodescanner.b$a r0 = com.journeyapps.barcodescanner.b.a.this
                    com.journeyapps.barcodescanner.b r0 = com.journeyapps.barcodescanner.b.this
                    xd.b r1 = r15.f8027a
                    boolean r2 = r0.f8018d
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L_0x0097
                    xd.o r2 = r1.f17286b
                    android.graphics.Rect r5 = r2.f17317f
                    int r6 = r2.f17316e
                    int r6 = r6 % 180
                    if (r6 == 0) goto L_0x0018
                    r6 = r3
                    goto L_0x0019
                L_0x0018:
                    r6 = r4
                L_0x0019:
                    if (r6 == 0) goto L_0x0029
                    android.graphics.Rect r6 = new android.graphics.Rect
                    int r7 = r5.top
                    int r8 = r5.left
                    int r9 = r5.bottom
                    int r5 = r5.right
                    r6.<init>(r7, r8, r9, r5)
                    r5 = r6
                L_0x0029:
                    android.graphics.YuvImage r12 = new android.graphics.YuvImage
                    byte[] r7 = r2.f17312a
                    int r8 = r2.f17315d
                    int r9 = r2.f17313b
                    int r10 = r2.f17314c
                    r11 = 0
                    r6 = r12
                    r6.<init>(r7, r8, r9, r10, r11)
                    java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
                    r6.<init>()
                    r7 = 90
                    r12.compressToJpeg(r5, r7, r6)
                    byte[] r5 = r6.toByteArray()
                    android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
                    r6.<init>()
                    r7 = 2
                    r6.inSampleSize = r7
                    int r7 = r5.length
                    android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r5, r4, r7, r6)
                    int r5 = r2.f17316e
                    if (r5 == 0) goto L_0x0071
                    android.graphics.Matrix r13 = new android.graphics.Matrix
                    r13.<init>()
                    int r2 = r2.f17316e
                    float r2 = (float) r2
                    r13.postRotate(r2)
                    r9 = 0
                    r10 = 0
                    int r11 = r8.getWidth()
                    int r12 = r8.getHeight()
                    r14 = 0
                    android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)
                L_0x0071:
                    java.lang.String r2 = "barcodeimage"
                    java.lang.String r5 = ".jpg"
                    android.app.Activity r6 = r0.f8015a     // Catch:{ IOException -> 0x0093 }
                    java.io.File r6 = r6.getCacheDir()     // Catch:{ IOException -> 0x0093 }
                    java.io.File r2 = java.io.File.createTempFile(r2, r5, r6)     // Catch:{ IOException -> 0x0093 }
                    java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0093 }
                    r5.<init>(r2)     // Catch:{ IOException -> 0x0093 }
                    android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0093 }
                    r7 = 100
                    r8.compress(r6, r7, r5)     // Catch:{ IOException -> 0x0093 }
                    r5.close()     // Catch:{ IOException -> 0x0093 }
                    java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0093 }
                    goto L_0x0098
                L_0x0093:
                    r2 = move-exception
                    r2.toString()
                L_0x0097:
                    r2 = 0
                L_0x0098:
                    android.content.Intent r5 = new android.content.Intent
                    java.lang.String r6 = "com.google.zxing.client.android.SCAN"
                    r5.<init>(r6)
                    r6 = 524288(0x80000, float:7.34684E-40)
                    r5.addFlags(r6)
                    uc.h r6 = r1.f17285a
                    java.lang.String r6 = r6.f15472a
                    java.lang.String r7 = "SCAN_RESULT"
                    r5.putExtra(r7, r6)
                    uc.h r6 = r1.f17285a
                    uc.a r6 = r6.f15475d
                    java.lang.String r6 = r6.toString()
                    java.lang.String r7 = "SCAN_RESULT_FORMAT"
                    r5.putExtra(r7, r6)
                    uc.h r6 = r1.f17285a
                    byte[] r6 = r6.f15473b
                    if (r6 == 0) goto L_0x00c8
                    int r7 = r6.length
                    if (r7 <= 0) goto L_0x00c8
                    java.lang.String r7 = "SCAN_RESULT_BYTES"
                    r5.putExtra(r7, r6)
                L_0x00c8:
                    uc.h r1 = r1.f17285a
                    java.util.Map<uc.i, java.lang.Object> r1 = r1.f15476e
                    if (r1 == 0) goto L_0x0135
                    uc.i r6 = uc.i.f15483n
                    boolean r7 = r1.containsKey(r6)
                    if (r7 == 0) goto L_0x00e3
                    java.lang.Object r6 = r1.get(r6)
                    java.lang.String r6 = r6.toString()
                    java.lang.String r7 = "SCAN_RESULT_UPC_EAN_EXTENSION"
                    r5.putExtra(r7, r6)
                L_0x00e3:
                    uc.i r6 = uc.i.f15477a
                    java.lang.Object r6 = r1.get(r6)
                    java.lang.Number r6 = (java.lang.Number) r6
                    if (r6 == 0) goto L_0x00f6
                    int r6 = r6.intValue()
                    java.lang.String r7 = "SCAN_RESULT_ORIENTATION"
                    r5.putExtra(r7, r6)
                L_0x00f6:
                    uc.i r6 = uc.i.f15479c
                    java.lang.Object r6 = r1.get(r6)
                    java.lang.String r6 = (java.lang.String) r6
                    if (r6 == 0) goto L_0x0105
                    java.lang.String r7 = "SCAN_RESULT_ERROR_CORRECTION_LEVEL"
                    r5.putExtra(r7, r6)
                L_0x0105:
                    uc.i r6 = uc.i.f15478b
                    java.lang.Object r1 = r1.get(r6)
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    if (r1 == 0) goto L_0x0135
                    java.util.Iterator r1 = r1.iterator()
                L_0x0113:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x0135
                    java.lang.Object r6 = r1.next()
                    byte[] r6 = (byte[]) r6
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "SCAN_RESULT_BYTE_SEGMENTS_"
                    r7.append(r8)
                    r7.append(r4)
                    java.lang.String r7 = r7.toString()
                    r5.putExtra(r7, r6)
                    int r4 = r4 + r3
                    goto L_0x0113
                L_0x0135:
                    if (r2 == 0) goto L_0x013c
                    java.lang.String r1 = "SCAN_RESULT_IMAGE_PATH"
                    r5.putExtra(r1, r2)
                L_0x013c:
                    android.app.Activity r1 = r0.f8015a
                    r2 = -1
                    r1.setResult(r2, r5)
                    r0.a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.b.a.C0076a.run():void");
            }
        }

        public a() {
        }

        public final void a(xd.b bVar) {
            b.this.f8016b.f7996a.d();
            zc.e eVar = b.this.f8021g;
            synchronized (eVar) {
                if (eVar.f17965b) {
                    eVar.a();
                }
            }
            b.this.f8022h.post(new C0076a(bVar));
        }

        public final void b(List<j> list) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.b$b  reason: collision with other inner class name */
    /* compiled from: CaptureManager */
    public class C0077b implements CameraPreview.e {
        public C0077b() {
        }

        public final void a() {
        }

        public final void b(Exception exc) {
            b.this.b();
        }

        public final void c() {
        }

        public final void d() {
            b bVar = b.this;
            if (bVar.f8023i) {
                int i10 = b.f8014l;
                bVar.c();
            }
        }

        public final void e() {
        }
    }

    /* compiled from: CaptureManager */
    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            int i10 = b.f8014l;
            b.this.c();
        }
    }

    /* compiled from: CaptureManager */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i10) {
            b.this.c();
        }
    }

    /* compiled from: CaptureManager */
    public class e implements DialogInterface.OnCancelListener {
        public e() {
        }

        public final void onCancel(DialogInterface dialogInterface) {
            b.this.c();
        }
    }

    public b(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        C0077b bVar = new C0077b();
        this.f8025k = false;
        this.f8015a = activity;
        this.f8016b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f7980q.add(bVar);
        this.f8022h = new Handler();
        this.f8020f = new h(activity, new c());
        this.f8021g = new zc.e(activity);
    }

    public final void a() {
        boolean z10;
        yd.d dVar = this.f8016b.getBarcodeView().f7971a;
        if (dVar == null || dVar.f17683g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c();
        } else {
            this.f8023i = true;
        }
        this.f8016b.f7996a.d();
        this.f8020f.a();
    }

    public final void b() {
        if (!this.f8015a.isFinishing() && !this.f8019e && !this.f8023i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f8015a);
            builder.setTitle(this.f8015a.getString(R$string.zxing_app_name));
            builder.setMessage(this.f8015a.getString(R$string.zxing_msg_camera_framework_bug));
            builder.setPositiveButton(R$string.zxing_button_ok, new d());
            builder.setOnCancelListener(new e());
            builder.show();
        }
    }

    public final void c() {
        this.f8015a.finish();
    }
}
