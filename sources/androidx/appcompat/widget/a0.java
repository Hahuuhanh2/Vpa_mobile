package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import m.f;

/* compiled from: ForwardingListener */
public abstract class a0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f1054a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1055b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1056c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1057d;

    /* renamed from: e  reason: collision with root package name */
    public a f1058e;

    /* renamed from: f  reason: collision with root package name */
    public b f1059f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1060n;

    /* renamed from: o  reason: collision with root package name */
    public int f1061o;

    /* renamed from: p  reason: collision with root package name */
    public final int[] f1062p = new int[2];

    /* compiled from: ForwardingListener */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            ViewParent parent = a0.this.f1057d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener */
    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            a0 a0Var = a0.this;
            a0Var.a();
            View view = a0Var.f1057d;
            if (view.isEnabled() && !view.isLongClickable() && a0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                a0Var.f1060n = true;
            }
        }
    }

    public a0(View view) {
        this.f1057d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1054a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1055b = tapTimeout;
        this.f1056c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f1059f;
        if (bVar != null) {
            this.f1057d.removeCallbacks(bVar);
        }
        a aVar = this.f1058e;
        if (aVar != null) {
            this.f1057d.removeCallbacks(aVar);
        }
    }

    public abstract f b();

    public abstract boolean c();

    public boolean d() {
        f b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r4 != 3) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f1060n
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x006f
            android.view.View r3 = r11.f1057d
            m.f r4 = r11.b()
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.a()
            if (r5 != 0) goto L_0x0016
            goto L_0x005f
        L_0x0016:
            androidx.appcompat.widget.y r4 = r4.j()
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0023
            goto L_0x005f
        L_0x0023:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f1062p
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f1062p
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f1061o
            boolean r3 = r4.b(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r1) goto L_0x0058
            if (r13 == r0) goto L_0x0058
            r13 = r1
            goto L_0x0059
        L_0x0058:
            r13 = r2
        L_0x0059:
            if (r3 == 0) goto L_0x005f
            if (r13 == 0) goto L_0x005f
            r13 = r1
            goto L_0x0060
        L_0x005f:
            r13 = r2
        L_0x0060:
            if (r13 != 0) goto L_0x006c
            boolean r13 = r11.d()
            if (r13 != 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r13 = r2
            goto L_0x0125
        L_0x006c:
            r13 = r1
            goto L_0x0125
        L_0x006f:
            android.view.View r3 = r11.f1057d
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x0079
            goto L_0x0102
        L_0x0079:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d6
            if (r4 == r1) goto L_0x00d2
            r5 = 2
            if (r4 == r5) goto L_0x0088
            if (r4 == r0) goto L_0x00d2
            goto L_0x0102
        L_0x0088:
            int r0 = r11.f1061o
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0102
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f1054a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c3
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c3
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c3
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c3
            r13 = r1
            goto L_0x00c4
        L_0x00c3:
            r13 = r2
        L_0x00c4:
            if (r13 != 0) goto L_0x0102
            r11.a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            r13 = r1
            goto L_0x0103
        L_0x00d2:
            r11.a()
            goto L_0x0102
        L_0x00d6:
            int r13 = r13.getPointerId(r2)
            r11.f1061o = r13
            androidx.appcompat.widget.a0$a r13 = r11.f1058e
            if (r13 != 0) goto L_0x00e7
            androidx.appcompat.widget.a0$a r13 = new androidx.appcompat.widget.a0$a
            r13.<init>()
            r11.f1058e = r13
        L_0x00e7:
            androidx.appcompat.widget.a0$a r13 = r11.f1058e
            int r0 = r11.f1055b
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            androidx.appcompat.widget.a0$b r13 = r11.f1059f
            if (r13 != 0) goto L_0x00fa
            androidx.appcompat.widget.a0$b r13 = new androidx.appcompat.widget.a0$b
            r13.<init>()
            r11.f1059f = r13
        L_0x00fa:
            androidx.appcompat.widget.a0$b r13 = r11.f1059f
            int r0 = r11.f1056c
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
        L_0x0102:
            r13 = r2
        L_0x0103:
            if (r13 == 0) goto L_0x010d
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x010d
            r13 = r1
            goto L_0x010e
        L_0x010d:
            r13 = r2
        L_0x010e:
            if (r13 == 0) goto L_0x0125
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f1057d
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0125:
            r11.f1060n = r13
            if (r13 != 0) goto L_0x012d
            if (r12 == 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r1 = r2
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f1060n = false;
        this.f1061o = -1;
        a aVar = this.f1058e;
        if (aVar != null) {
            this.f1057d.removeCallbacks(aVar);
        }
    }
}
