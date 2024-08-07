package l8;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ShapeableDelegateV22 */
public final class s extends r {

    /* renamed from: f  reason: collision with root package name */
    public boolean f12893f = false;

    /* renamed from: g  reason: collision with root package name */
    public float f12894g = 0.0f;

    /* compiled from: ShapeableDelegateV22 */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        public final void getOutline(View view, Outline outline) {
            s sVar = s.this;
            if (sVar.f12890c != null && !sVar.f12891d.isEmpty()) {
                s sVar2 = s.this;
                RectF rectF = sVar2.f12891d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, sVar2.f12894g);
            }
        }
    }

    public s(View view) {
        d(view);
    }

    private void d(View view) {
        view.setOutlineProvider(new a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
        if (r0 == false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r10) {
        /*
            r9 = this;
            l8.m r0 = r9.f12890c
            r1 = 0
            if (r0 == 0) goto L_0x0011
            android.graphics.RectF r2 = r9.f12891d
            if (r2 != 0) goto L_0x000a
            goto L_0x0011
        L_0x000a:
            l8.d r0 = r0.f12830f
            float r0 = r0.a(r2)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            r9.f12894g = r0
            android.graphics.RectF r0 = r9.f12891d
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0029
            l8.m r0 = r9.f12890c
            if (r0 != 0) goto L_0x0022
            goto L_0x0029
        L_0x0022:
            android.graphics.RectF r3 = r9.f12891d
            boolean r0 = r0.f(r3)
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            r3 = 1
            if (r0 != 0) goto L_0x0102
            android.graphics.RectF r0 = r9.f12891d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ff
            l8.m r0 = r9.f12890c
            if (r0 == 0) goto L_0x00ff
            boolean r4 = r9.f12889b
            if (r4 == 0) goto L_0x00ff
            android.graphics.RectF r4 = r9.f12891d
            boolean r0 = r0.f(r4)
            if (r0 != 0) goto L_0x00ff
            l8.m r0 = r9.f12890c
            lb.b r4 = r0.f12825a
            boolean r4 = r4 instanceof l8.l
            if (r4 == 0) goto L_0x0061
            lb.b r4 = r0.f12826b
            boolean r4 = r4 instanceof l8.l
            if (r4 == 0) goto L_0x0061
            lb.b r4 = r0.f12828d
            boolean r4 = r4 instanceof l8.l
            if (r4 == 0) goto L_0x0061
            lb.b r4 = r0.f12827c
            boolean r4 = r4 instanceof l8.l
            if (r4 == 0) goto L_0x0061
            r4 = r3
            goto L_0x0062
        L_0x0061:
            r4 = r2
        L_0x0062:
            if (r4 != 0) goto L_0x0066
            goto L_0x00ff
        L_0x0066:
            l8.d r0 = r0.f12829e
            android.graphics.RectF r4 = r9.f12891d
            float r0 = r0.a(r4)
            l8.m r4 = r9.f12890c
            l8.d r4 = r4.f12830f
            android.graphics.RectF r5 = r9.f12891d
            float r4 = r4.a(r5)
            l8.m r5 = r9.f12890c
            l8.d r5 = r5.f12832h
            android.graphics.RectF r6 = r9.f12891d
            float r5 = r5.a(r6)
            l8.m r6 = r9.f12890c
            l8.d r6 = r6.f12831g
            android.graphics.RectF r7 = r9.f12891d
            float r6 = r6.a(r7)
            int r7 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x00a9
            int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x00a9
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00a9
            android.graphics.RectF r0 = r9.f12891d
            float r1 = r0.left
            float r1 = r1 - r4
            float r5 = r0.top
            float r6 = r0.right
            float r7 = r0.bottom
            r0.set(r1, r5, r6, r7)
            r9.f12894g = r4
            goto L_0x00fd
        L_0x00a9:
            if (r7 != 0) goto L_0x00c4
            int r7 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x00c4
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 != 0) goto L_0x00c4
            android.graphics.RectF r0 = r9.f12891d
            float r1 = r0.left
            float r4 = r0.top
            float r4 = r4 - r5
            float r6 = r0.right
            float r7 = r0.bottom
            r0.set(r1, r4, r6, r7)
            r9.f12894g = r5
            goto L_0x00fd
        L_0x00c4:
            int r7 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x00e1
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x00e1
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00e1
            android.graphics.RectF r1 = r9.f12891d
            float r4 = r1.left
            float r5 = r1.top
            float r6 = r1.right
            float r6 = r6 + r0
            float r7 = r1.bottom
            r1.set(r4, r5, r6, r7)
            r9.f12894g = r0
            goto L_0x00fd
        L_0x00e1:
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x00ff
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00ff
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x00ff
            android.graphics.RectF r1 = r9.f12891d
            float r4 = r1.left
            float r5 = r1.top
            float r6 = r1.right
            float r7 = r1.bottom
            float r7 = r7 + r0
            r1.set(r4, r5, r6, r7)
            r9.f12894g = r0
        L_0x00fd:
            r0 = r3
            goto L_0x0100
        L_0x00ff:
            r0 = r2
        L_0x0100:
            if (r0 == 0) goto L_0x0103
        L_0x0102:
            r2 = r3
        L_0x0103:
            r9.f12893f = r2
            boolean r0 = r9.b()
            r0 = r0 ^ r3
            r10.setClipToOutline(r0)
            boolean r0 = r9.b()
            if (r0 == 0) goto L_0x0117
            r10.invalidate()
            goto L_0x011a
        L_0x0117:
            r10.invalidateOutline()
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.s.a(android.view.View):void");
    }

    public final boolean b() {
        if (!this.f12893f || this.f12888a) {
            return true;
        }
        return false;
    }
}
