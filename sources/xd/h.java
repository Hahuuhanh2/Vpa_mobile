package xd;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import yd.d;
import yd.l;

/* compiled from: DecoderThread */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public d f17292a;

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f17293b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f17294c;

    /* renamed from: d  reason: collision with root package name */
    public e f17295d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f17296e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f17297f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17298g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Object f17299h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final a f17300i = new a();

    /* renamed from: j  reason: collision with root package name */
    public final b f17301j = new b();

    /* compiled from: DecoderThread */
    public class a implements Handler.Callback {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r21) {
            /*
                r20 = this;
                r1 = r20
                r0 = r21
                int r2 = r0.what
                int r3 = com.google.zxing.client.android.R$id.zxing_decode
                r4 = 1
                if (r2 != r3) goto L_0x0152
                xd.h r2 = xd.h.this
                java.lang.Object r0 = r0.obj
                xd.o r0 = (xd.o) r0
                r2.getClass()
                java.lang.System.currentTimeMillis()
                android.graphics.Rect r3 = r2.f17297f
                r0.f17317f = r3
                r5 = 0
                if (r3 != 0) goto L_0x0021
                r3 = r5
                goto L_0x00c8
            L_0x0021:
                int r3 = r0.f17316e
                byte[] r6 = r0.f17312a
                int r7 = r0.f17313b
                int r8 = r0.f17314c
                r9 = 90
                r10 = 180(0xb4, float:2.52E-43)
                r11 = 0
                if (r3 == r9) goto L_0x0066
                if (r3 == r10) goto L_0x0055
                r9 = 270(0x10e, float:3.78E-43)
                if (r3 == r9) goto L_0x0037
                goto L_0x0082
            L_0x0037:
                int r3 = r7 * r8
                byte[] r9 = new byte[r3]
                int r3 = r3 + -1
                r12 = r11
            L_0x003e:
                if (r12 >= r7) goto L_0x0053
                int r13 = r8 + -1
            L_0x0042:
                if (r13 < 0) goto L_0x0050
                int r14 = r13 * r7
                int r14 = r14 + r12
                byte r14 = r6[r14]
                r9[r3] = r14
                int r3 = r3 + -1
                int r13 = r13 + -1
                goto L_0x0042
            L_0x0050:
                int r12 = r12 + 1
                goto L_0x003e
            L_0x0053:
                r13 = r9
                goto L_0x0083
            L_0x0055:
                int r7 = r7 * r8
                byte[] r3 = new byte[r7]
                int r8 = r7 + -1
                r9 = r11
            L_0x005b:
                if (r9 >= r7) goto L_0x0081
                byte r12 = r6[r9]
                r3[r8] = r12
                int r8 = r8 + -1
                int r9 = r9 + 1
                goto L_0x005b
            L_0x0066:
                int r3 = r7 * r8
                byte[] r3 = new byte[r3]
                r9 = r11
                r12 = r9
            L_0x006c:
                if (r9 >= r7) goto L_0x0081
                int r13 = r8 + -1
            L_0x0070:
                if (r13 < 0) goto L_0x007e
                int r14 = r13 * r7
                int r14 = r14 + r9
                byte r14 = r6[r14]
                r3[r12] = r14
                int r12 = r12 + 1
                int r13 = r13 + -1
                goto L_0x0070
            L_0x007e:
                int r9 = r9 + 1
                goto L_0x006c
            L_0x0081:
                r6 = r3
            L_0x0082:
                r13 = r6
            L_0x0083:
                int r3 = r0.f17316e
                int r3 = r3 % r10
                if (r3 == 0) goto L_0x0089
                r11 = r4
            L_0x0089:
                if (r11 == 0) goto L_0x00aa
                uc.f r3 = new uc.f
                int r14 = r0.f17314c
                int r15 = r0.f17313b
                android.graphics.Rect r6 = r0.f17317f
                int r7 = r6.left
                int r8 = r6.top
                int r18 = r6.width()
                android.graphics.Rect r6 = r0.f17317f
                int r19 = r6.height()
                r12 = r3
                r16 = r7
                r17 = r8
                r12.<init>(r13, r14, r15, r16, r17, r18, r19)
                goto L_0x00c8
            L_0x00aa:
                uc.f r3 = new uc.f
                int r14 = r0.f17313b
                int r15 = r0.f17314c
                android.graphics.Rect r6 = r0.f17317f
                int r7 = r6.left
                int r8 = r6.top
                int r18 = r6.width()
                android.graphics.Rect r6 = r0.f17317f
                int r19 = r6.height()
                r12 = r3
                r16 = r7
                r17 = r8
                r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            L_0x00c8:
                if (r3 == 0) goto L_0x00fb
                xd.e r6 = r2.f17295d
                vl.d r3 = r6.b(r3)
                java.util.ArrayList r7 = r6.f17290b
                r7.clear()
                uc.g r7 = r6.f17289a     // Catch:{ Exception -> 0x00f6, all -> 0x00ef }
                boolean r8 = r7 instanceof uc.e     // Catch:{ Exception -> 0x00f6, all -> 0x00ef }
                if (r8 == 0) goto L_0x00e9
                uc.e r7 = (uc.e) r7     // Catch:{ Exception -> 0x00f6, all -> 0x00ef }
                uc.g[] r8 = r7.f15466b     // Catch:{ Exception -> 0x00f6, all -> 0x00ef }
                if (r8 != 0) goto L_0x00e4
                r7.d(r5)     // Catch:{ Exception -> 0x00f6, all -> 0x00ef }
            L_0x00e4:
                uc.h r3 = r7.c(r3)     // Catch:{ Exception -> 0x00f6, all -> 0x00ef }
                goto L_0x00ed
            L_0x00e9:
                uc.h r3 = r7.a(r3)     // Catch:{ Exception -> 0x00f6, all -> 0x00ef }
            L_0x00ed:
                r5 = r3
                goto L_0x00f6
            L_0x00ef:
                r0 = move-exception
                uc.g r2 = r6.f17289a
                r2.reset()
                throw r0
            L_0x00f6:
                uc.g r3 = r6.f17289a
                r3.reset()
            L_0x00fb:
                if (r5 == 0) goto L_0x011b
                java.lang.System.currentTimeMillis()
                android.os.Handler r3 = r2.f17296e
                if (r3 == 0) goto L_0x0128
                xd.b r6 = new xd.b
                r6.<init>(r5, r0)
                int r0 = com.google.zxing.client.android.R$id.zxing_decode_succeeded
                android.os.Message r0 = android.os.Message.obtain(r3, r0, r6)
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r0.setData(r3)
                r0.sendToTarget()
                goto L_0x0128
            L_0x011b:
                android.os.Handler r0 = r2.f17296e
                if (r0 == 0) goto L_0x0128
                int r3 = com.google.zxing.client.android.R$id.zxing_decode_failed
                android.os.Message r0 = android.os.Message.obtain(r0, r3)
                r0.sendToTarget()
            L_0x0128:
                android.os.Handler r0 = r2.f17296e
                if (r0 == 0) goto L_0x0143
                xd.e r0 = r2.f17295d
                r0.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.ArrayList r0 = r0.f17290b
                r3.<init>(r0)
                android.os.Handler r0 = r2.f17296e
                int r5 = com.google.zxing.client.android.R$id.zxing_possible_result_points
                android.os.Message r0 = android.os.Message.obtain(r0, r5, r3)
                r0.sendToTarget()
            L_0x0143:
                yd.d r0 = r2.f17292a
                xd.h$b r2 = r2.f17301j
                android.os.Handler r3 = r0.f17684h
                yd.c r5 = new yd.c
                r5.<init>(r0, r2)
                r3.post(r5)
                goto L_0x0166
            L_0x0152:
                int r0 = com.google.zxing.client.android.R$id.zxing_preview_failed
                if (r2 != r0) goto L_0x0166
                xd.h r0 = xd.h.this
                yd.d r2 = r0.f17292a
                xd.h$b r0 = r0.f17301j
                android.os.Handler r3 = r2.f17684h
                yd.c r5 = new yd.c
                r5.<init>(r2, r0)
                r3.post(r5)
            L_0x0166:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: xd.h.a.handleMessage(android.os.Message):boolean");
        }
    }

    /* compiled from: DecoderThread */
    public class b implements l {
        public b() {
        }
    }

    public h(d dVar, e eVar, Handler handler) {
        j7.a.F0();
        this.f17292a = dVar;
        this.f17295d = eVar;
        this.f17296e = handler;
    }
}
