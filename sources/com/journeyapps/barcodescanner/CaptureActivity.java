package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import k1.a;
import yd.d;
import zc.h;

public class CaptureActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public b f7994a;

    /* renamed from: b  reason: collision with root package name */
    public DecoratedBarcodeView f7995b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            super.onCreate(r18)
            int r2 = com.google.zxing.client.android.R$layout.zxing_capture
            r0.setContentView(r2)
            int r2 = com.google.zxing.client.android.R$id.zxing_barcode_scanner
            android.view.View r2 = r0.findViewById(r2)
            com.journeyapps.barcodescanner.DecoratedBarcodeView r2 = (com.journeyapps.barcodescanner.DecoratedBarcodeView) r2
            r0.f7995b = r2
            com.journeyapps.barcodescanner.b r2 = new com.journeyapps.barcodescanner.b
            com.journeyapps.barcodescanner.DecoratedBarcodeView r3 = r0.f7995b
            r2.<init>(r0, r3)
            r0.f7994a = r2
            android.content.Intent r3 = r17.getIntent()
            android.app.Activity r4 = r2.f8015a
            android.view.Window r4 = r4.getWindow()
            r5 = 128(0x80, float:1.794E-43)
            r4.addFlags(r5)
            r4 = -1
            if (r1 == 0) goto L_0x0039
            java.lang.String r5 = "SAVED_ORIENTATION_LOCK"
            int r1 = r1.getInt(r5, r4)
            r2.f8017c = r1
        L_0x0039:
            r1 = 2
            if (r3 == 0) goto L_0x01b8
            java.lang.String r5 = "SCAN_ORIENTATION_LOCKED"
            r6 = 1
            boolean r5 = r3.getBooleanExtra(r5, r6)
            r7 = 0
            if (r5 == 0) goto L_0x0085
            int r5 = r2.f8017c
            if (r5 != r4) goto L_0x007e
            android.app.Activity r5 = r2.f8015a
            android.view.WindowManager r5 = r5.getWindowManager()
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getRotation()
            android.app.Activity r8 = r2.f8015a
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            if (r8 != r1) goto L_0x006e
            if (r5 == 0) goto L_0x007b
            if (r5 != r6) goto L_0x006b
            goto L_0x007b
        L_0x006b:
            r5 = 8
            goto L_0x007c
        L_0x006e:
            if (r8 != r6) goto L_0x007b
            if (r5 == 0) goto L_0x0079
            r8 = 3
            if (r5 != r8) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r5 = 9
            goto L_0x007c
        L_0x0079:
            r5 = r6
            goto L_0x007c
        L_0x007b:
            r5 = r7
        L_0x007c:
            r2.f8017c = r5
        L_0x007e:
            android.app.Activity r5 = r2.f8015a
            int r8 = r2.f8017c
            r5.setRequestedOrientation(r8)
        L_0x0085:
            java.lang.String r5 = r3.getAction()
            java.lang.String r8 = "com.google.zxing.client.android.SCAN"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0188
            com.journeyapps.barcodescanner.DecoratedBarcodeView r5 = r2.f8016b
            r5.getClass()
            java.util.regex.Pattern r8 = zc.f.f17966a
            java.lang.String r8 = "SCAN_FORMATS"
            java.lang.String r8 = r3.getStringExtra(r8)
            r9 = 0
            if (r8 == 0) goto L_0x00ac
            java.util.regex.Pattern r10 = zc.f.f17966a
            java.lang.String[] r8 = r10.split(r8)
            java.util.List r8 = java.util.Arrays.asList(r8)
            goto L_0x00ad
        L_0x00ac:
            r8 = r9
        L_0x00ad:
            java.lang.String r10 = "SCAN_MODE"
            java.lang.String r10 = r3.getStringExtra(r10)
            if (r8 == 0) goto L_0x00d3
            java.lang.Class<uc.a> r11 = uc.a.class
            java.util.EnumSet r11 = java.util.EnumSet.noneOf(r11)
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IllegalArgumentException -> 0x00d3 }
        L_0x00bf:
            boolean r12 = r8.hasNext()     // Catch:{ IllegalArgumentException -> 0x00d3 }
            if (r12 == 0) goto L_0x00e0
            java.lang.Object r12 = r8.next()     // Catch:{ IllegalArgumentException -> 0x00d3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IllegalArgumentException -> 0x00d3 }
            uc.a r12 = uc.a.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x00d3 }
            r11.add(r12)     // Catch:{ IllegalArgumentException -> 0x00d3 }
            goto L_0x00bf
        L_0x00d3:
            if (r10 == 0) goto L_0x00df
            java.util.HashMap r8 = zc.f.f17967b
            java.lang.Object r8 = r8.get(r10)
            r11 = r8
            java.util.Set r11 = (java.util.Set) r11
            goto L_0x00e0
        L_0x00df:
            r11 = r9
        L_0x00e0:
            int r8 = zc.g.f17968a
            android.os.Bundle r8 = r3.getExtras()
            if (r8 == 0) goto L_0x0145
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x00ef
            goto L_0x0145
        L_0x00ef:
            java.util.EnumMap r9 = new java.util.EnumMap
            java.lang.Class<uc.b> r10 = uc.b.class
            r9.<init>(r10)
            uc.b[] r10 = uc.b.values()
            int r12 = r10.length
            r13 = r7
        L_0x00fc:
            if (r13 >= r12) goto L_0x0142
            r14 = r10[r13]
            uc.b r15 = uc.b.CHARACTER_SET
            if (r14 == r15) goto L_0x013d
            uc.b r15 = uc.b.NEED_RESULT_POINT_CALLBACK
            if (r14 == r15) goto L_0x013d
            uc.b r15 = uc.b.POSSIBLE_FORMATS
            if (r14 != r15) goto L_0x010d
            goto L_0x013d
        L_0x010d:
            java.lang.String r15 = r14.name()
            boolean r16 = r8.containsKey(r15)
            if (r16 == 0) goto L_0x013d
            java.lang.Class<?> r1 = r14.f15460a
            java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0127
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r9.put(r14, r1)
            goto L_0x013d
        L_0x0127:
            java.lang.Object r1 = r8.get(r15)
            java.lang.Class<?> r6 = r14.f15460a
            boolean r6 = r6.isInstance(r1)
            if (r6 == 0) goto L_0x0137
            r9.put(r14, r1)
            goto L_0x013d
        L_0x0137:
            r14.toString()
            java.util.Objects.toString(r1)
        L_0x013d:
            int r13 = r13 + 1
            r1 = 2
            r6 = 1
            goto L_0x00fc
        L_0x0142:
            r9.toString()
        L_0x0145:
            yd.f r1 = new yd.f
            r1.<init>()
            java.lang.String r6 = "SCAN_CAMERA_ID"
            boolean r8 = r3.hasExtra(r6)
            if (r8 == 0) goto L_0x015a
            int r4 = r3.getIntExtra(r6, r4)
            if (r4 < 0) goto L_0x015a
            r1.f17711a = r4
        L_0x015a:
            java.lang.String r4 = "PROMPT_MESSAGE"
            java.lang.String r4 = r3.getStringExtra(r4)
            if (r4 == 0) goto L_0x0165
            r5.setStatusText(r4)
        L_0x0165:
            java.lang.String r4 = "SCAN_TYPE"
            int r4 = r3.getIntExtra(r4, r7)
            java.lang.String r6 = "CHARACTER_SET"
            java.lang.String r6 = r3.getStringExtra(r6)
            uc.e r8 = new uc.e
            r8.<init>()
            r8.d(r9)
            com.journeyapps.barcodescanner.BarcodeView r8 = r5.f7996a
            r8.setCameraSettings(r1)
            com.journeyapps.barcodescanner.BarcodeView r1 = r5.f7996a
            pd.f r5 = new pd.f
            r5.<init>(r11, r9, r6, r4)
            r1.setDecoderFactory(r5)
        L_0x0188:
            java.lang.String r1 = "BEEP_ENABLED"
            r4 = 1
            boolean r1 = r3.getBooleanExtra(r1, r4)
            if (r1 != 0) goto L_0x0195
            zc.e r1 = r2.f8021g
            r1.f17965b = r7
        L_0x0195:
            java.lang.String r1 = "TIMEOUT"
            boolean r4 = r3.hasExtra(r1)
            if (r4 == 0) goto L_0x01ad
            xd.d r4 = new xd.d
            r4.<init>(r2)
            android.os.Handler r5 = r2.f8022h
            r8 = 0
            long r8 = r3.getLongExtra(r1, r8)
            r5.postDelayed(r4, r8)
        L_0x01ad:
            java.lang.String r1 = "BARCODE_IMAGE_ENABLED"
            boolean r1 = r3.getBooleanExtra(r1, r7)
            if (r1 == 0) goto L_0x01b8
            r1 = 1
            r2.f8018d = r1
        L_0x01b8:
            com.journeyapps.barcodescanner.b r1 = r0.f7994a
            com.journeyapps.barcodescanner.DecoratedBarcodeView r2 = r1.f8016b
            com.journeyapps.barcodescanner.b$a r1 = r1.f8024j
            com.journeyapps.barcodescanner.BarcodeView r3 = r2.f7996a
            com.journeyapps.barcodescanner.DecoratedBarcodeView$b r4 = new com.journeyapps.barcodescanner.DecoratedBarcodeView$b
            r4.<init>(r1)
            r1 = 2
            r3.I = r1
            r3.J = r4
            r3.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        b bVar = this.f7994a;
        bVar.f8019e = true;
        bVar.f8020f.a();
        bVar.f8022h.removeCallbacksAndMessages((Object) null);
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f7995b.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent)) {
            return true;
        }
        return false;
    }

    public final void onPause() {
        super.onPause();
        b bVar = this.f7994a;
        bVar.f8020f.a();
        BarcodeView barcodeView = bVar.f8016b.f7996a;
        d cameraInstance = barcodeView.getCameraInstance();
        barcodeView.d();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f17683g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        b bVar = this.f7994a;
        bVar.getClass();
        if (i10 != 250) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            bVar.b();
        } else {
            bVar.f8016b.f7996a.f();
        }
    }

    public final void onResume() {
        super.onResume();
        b bVar = this.f7994a;
        if (a.checkSelfPermission(bVar.f8015a, "android.permission.CAMERA") == 0) {
            bVar.f8016b.f7996a.f();
        } else if (!bVar.f8025k) {
            i1.a.a(bVar.f8015a, new String[]{"android.permission.CAMERA"}, 250);
            bVar.f8025k = true;
        }
        h hVar = bVar.f8020f;
        if (!hVar.f17971c) {
            hVar.f17969a.registerReceiver(hVar.f17970b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            hVar.f17971c = true;
        }
        hVar.f17972d.removeCallbacksAndMessages((Object) null);
        if (hVar.f17974f) {
            hVar.f17972d.postDelayed(hVar.f17973e, 300000);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f7994a.f8017c);
    }
}
