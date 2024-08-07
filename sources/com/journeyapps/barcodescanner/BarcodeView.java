package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import uc.b;
import xd.e;
import xd.f;
import xd.g;
import xd.h;
import xd.i;
import xd.j;
import yd.c;
import yd.d;

public class BarcodeView extends CameraPreview {
    public int I = 1;
    public xd.a J = null;
    public h K;
    public f L;
    public Handler M;
    public final a N = new a();

    public class a implements Handler.Callback {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            r0 = r3.f7970a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r0 = r4.what
                int r1 = com.google.zxing.client.android.R$id.zxing_decode_succeeded
                r2 = 1
                if (r0 != r1) goto L_0x002a
                java.lang.Object r4 = r4.obj
                xd.b r4 = (xd.b) r4
                if (r4 == 0) goto L_0x0029
                com.journeyapps.barcodescanner.BarcodeView r0 = com.journeyapps.barcodescanner.BarcodeView.this
                xd.a r1 = r0.J
                if (r1 == 0) goto L_0x0029
                int r0 = r0.I
                if (r0 == r2) goto L_0x0029
                r1.a(r4)
                com.journeyapps.barcodescanner.BarcodeView r4 = com.journeyapps.barcodescanner.BarcodeView.this
                int r0 = r4.I
                r1 = 2
                if (r0 != r1) goto L_0x0029
                r4.I = r2
                r0 = 0
                r4.J = r0
                r4.l()
            L_0x0029:
                return r2
            L_0x002a:
                int r1 = com.google.zxing.client.android.R$id.zxing_decode_failed
                if (r0 != r1) goto L_0x002f
                return r2
            L_0x002f:
                int r1 = com.google.zxing.client.android.R$id.zxing_possible_result_points
                if (r0 != r1) goto L_0x0045
                java.lang.Object r4 = r4.obj
                java.util.List r4 = (java.util.List) r4
                com.journeyapps.barcodescanner.BarcodeView r0 = com.journeyapps.barcodescanner.BarcodeView.this
                xd.a r1 = r0.J
                if (r1 == 0) goto L_0x0044
                int r0 = r0.I
                if (r0 == r2) goto L_0x0044
                r1.b(r4)
            L_0x0044:
                return r2
            L_0x0045:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.BarcodeView.a.handleMessage(android.os.Message):boolean");
        }
    }

    public BarcodeView(Context context) {
        super(context);
        j();
    }

    public final void d() {
        l();
        super.d();
    }

    public final void e() {
        k();
    }

    public f getDecoderFactory() {
        return this.L;
    }

    public final e i() {
        e eVar;
        if (this.L == null) {
            this.L = new pd.f();
        }
        g gVar = new g();
        HashMap hashMap = new HashMap();
        hashMap.put(b.NEED_RESULT_POINT_CALLBACK, gVar);
        pd.f fVar = (pd.f) this.L;
        fVar.getClass();
        EnumMap enumMap = new EnumMap(b.class);
        enumMap.putAll(hashMap);
        Map map = (Map) fVar.f14166d;
        if (map != null) {
            enumMap.putAll(map);
        }
        Collection collection = (Collection) fVar.f14165c;
        if (collection != null) {
            enumMap.put(b.POSSIBLE_FORMATS, collection);
        }
        String str = (String) fVar.f14167e;
        if (str != null) {
            enumMap.put(b.CHARACTER_SET, str);
        }
        uc.e eVar2 = new uc.e();
        eVar2.d(enumMap);
        int i10 = fVar.f14164b;
        if (i10 == 0) {
            eVar = new e(eVar2);
        } else if (i10 == 1) {
            eVar = new i(eVar2);
        } else if (i10 != 2) {
            eVar = new e(eVar2);
        } else {
            eVar = new j(eVar2);
        }
        gVar.f17291a = eVar;
        return eVar;
    }

    public final void j() {
        this.L = new pd.f();
        this.M = new Handler(this.N);
    }

    public final void k() {
        l();
        if (this.I != 1 && this.f7977n) {
            h hVar = new h(getCameraInstance(), i(), this.M);
            this.K = hVar;
            hVar.f17297f = getPreviewFramingRect();
            h hVar2 = this.K;
            hVar2.getClass();
            j7.a.F0();
            HandlerThread handlerThread = new HandlerThread("h");
            hVar2.f17293b = handlerThread;
            handlerThread.start();
            hVar2.f17294c = new Handler(hVar2.f17293b.getLooper(), hVar2.f17300i);
            hVar2.f17298g = true;
            d dVar = hVar2.f17292a;
            dVar.f17684h.post(new c(dVar, hVar2.f17301j));
        }
    }

    public final void l() {
        h hVar = this.K;
        if (hVar != null) {
            hVar.getClass();
            j7.a.F0();
            synchronized (hVar.f17299h) {
                hVar.f17298g = false;
                hVar.f17294c.removeCallbacksAndMessages((Object) null);
                hVar.f17293b.quit();
            }
            this.K = null;
        }
    }

    public void setDecoderFactory(f fVar) {
        j7.a.F0();
        this.L = fVar;
        h hVar = this.K;
        if (hVar != null) {
            hVar.f17295d = i();
        }
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j();
    }
}
