package c2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: ViewDragHelper */
public final class c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f4529x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f4530a;

    /* renamed from: b  reason: collision with root package name */
    public int f4531b;

    /* renamed from: c  reason: collision with root package name */
    public int f4532c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f4533d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f4534e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f4535f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f4536g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f4537h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f4538i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f4539j;

    /* renamed from: k  reason: collision with root package name */
    public int f4540k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f4541l;

    /* renamed from: m  reason: collision with root package name */
    public float f4542m;

    /* renamed from: n  reason: collision with root package name */
    public float f4543n;

    /* renamed from: o  reason: collision with root package name */
    public int f4544o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4545p;

    /* renamed from: q  reason: collision with root package name */
    public int f4546q;

    /* renamed from: r  reason: collision with root package name */
    public OverScroller f4547r;

    /* renamed from: s  reason: collision with root package name */
    public final C0048c f4548s;

    /* renamed from: t  reason: collision with root package name */
    public View f4549t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4550u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f4551v;

    /* renamed from: w  reason: collision with root package name */
    public final b f4552w = new b();

    /* compiled from: ViewDragHelper */
    public class a implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper */
    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c.this.r(0);
        }
    }

    /* renamed from: c2.c$c  reason: collision with other inner class name */
    /* compiled from: ViewDragHelper */
    public static abstract class C0048c {
        public abstract int a(View view, int i10);

        public abstract int b(View view, int i10);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(int i10, int i11) {
        }

        public void f(int i10) {
        }

        public void g(int i10, View view) {
        }

        public abstract void h(int i10);

        public abstract void i(View view, int i10, int i11);

        public abstract void j(View view, float f10, float f11);

        public abstract boolean k(int i10, View view);
    }

    public c(Context context, ViewGroup viewGroup, C0048c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f4551v = viewGroup;
            this.f4548s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f4545p = i10;
            this.f4544o = i10;
            this.f4531b = viewConfiguration.getScaledTouchSlop();
            this.f4542m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f4543n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f4547r = new OverScroller(context, f4529x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static c i(ViewGroup viewGroup, float f10, C0048c cVar) {
        c cVar2 = new c(viewGroup.getContext(), viewGroup, cVar);
        cVar2.f4531b = (int) ((1.0f / f10) * ((float) cVar2.f4531b));
        return cVar2;
    }

    public static boolean l(View view, int i10, int i11) {
        if (view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom()) {
            return true;
        }
        return false;
    }

    public final void a() {
        b();
        if (this.f4530a == 2) {
            this.f4547r.getCurrX();
            this.f4547r.getCurrY();
            this.f4547r.abortAnimation();
            this.f4548s.i(this.f4549t, this.f4547r.getCurrX(), this.f4547r.getCurrY());
        }
        r(0);
    }

    public final void b() {
        this.f4532c = -1;
        float[] fArr = this.f4533d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4534e, 0.0f);
            Arrays.fill(this.f4535f, 0.0f);
            Arrays.fill(this.f4536g, 0.0f);
            Arrays.fill(this.f4537h, 0);
            Arrays.fill(this.f4538i, 0);
            Arrays.fill(this.f4539j, 0);
            this.f4540k = 0;
        }
        VelocityTracker velocityTracker = this.f4541l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4541l = null;
        }
    }

    public final void c(int i10, View view) {
        if (view.getParent() == this.f4551v) {
            this.f4549t = view;
            this.f4532c = i10;
            this.f4548s.g(i10, view);
            r(1);
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        q10.append(this.f4551v);
        q10.append(")");
        throw new IllegalArgumentException(q10.toString());
    }

    public final boolean d(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f4537h[i10] & i11) != i11 || (this.f4546q & i11) == 0 || (this.f4539j[i10] & i11) == i11 || (this.f4538i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f4531b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f4548s.getClass();
        }
        if ((this.f4538i[i10] & i11) != 0 || abs <= ((float) this.f4531b)) {
            return false;
        }
        return true;
    }

    public final boolean e(View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        if (this.f4548s.c(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f4548s.d() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f12 = f11 * f11;
            int i10 = this.f4531b;
            if (f12 + (f10 * f10) > ((float) (i10 * i10))) {
                return true;
            }
            return false;
        } else if (z10) {
            if (Math.abs(f10) > ((float) this.f4531b)) {
                return true;
            }
            return false;
        } else if (!z11 || Math.abs(f11) <= ((float) this.f4531b)) {
            return false;
        } else {
            return true;
        }
    }

    public final void f(int i10) {
        float[] fArr = this.f4533d;
        if (fArr != null) {
            int i11 = this.f4540k;
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z10 = false;
            }
            if (z10) {
                fArr[i10] = 0.0f;
                this.f4534e[i10] = 0.0f;
                this.f4535f[i10] = 0.0f;
                this.f4536g[i10] = 0.0f;
                this.f4537h[i10] = 0;
                this.f4538i[i10] = 0;
                this.f4539j[i10] = 0;
                this.f4540k = (~i12) & i11;
            }
        }
    }

    public final int g(int i10, int i11, int i12) {
        int i13;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f4551v.getWidth();
        float f10 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width)) - 0.5f) * 0.47123894f))) * f10) + f10;
        int abs = Math.abs(i11);
        if (abs > 0) {
            i13 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i13 = (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f);
        }
        return Math.min(i13, 600);
    }

    public final boolean h() {
        if (this.f4530a == 2) {
            boolean computeScrollOffset = this.f4547r.computeScrollOffset();
            int currX = this.f4547r.getCurrX();
            int currY = this.f4547r.getCurrY();
            int left = currX - this.f4549t.getLeft();
            int top = currY - this.f4549t.getTop();
            if (left != 0) {
                View view = this.f4549t;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f4549t;
                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f4548s.i(this.f4549t, currX, currY);
            }
            if (computeScrollOffset && currX == this.f4547r.getFinalX() && currY == this.f4547r.getFinalY()) {
                this.f4547r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f4551v.post(this.f4552w);
            }
        }
        if (this.f4530a == 2) {
            return true;
        }
        return false;
    }

    public final View j(int i10, int i11) {
        for (int childCount = this.f4551v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f4551v;
            this.f4548s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            android.view.View r0 = r9.f4549t
            int r2 = r0.getLeft()
            android.view.View r0 = r9.f4549t
            int r3 = r0.getTop()
            int r4 = r10 - r2
            int r5 = r11 - r3
            r10 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            android.widget.OverScroller r11 = r9.f4547r
            r11.abortAnimation()
            r9.r(r10)
            return r10
        L_0x001e:
            android.view.View r11 = r9.f4549t
            float r0 = r9.f4543n
            int r0 = (int) r0
            float r1 = r9.f4542m
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r12)
            if (r6 >= r0) goto L_0x002e
            r12 = r10
            goto L_0x0035
        L_0x002e:
            if (r6 <= r1) goto L_0x0035
            if (r12 <= 0) goto L_0x0034
            r12 = r1
            goto L_0x0035
        L_0x0034:
            int r12 = -r1
        L_0x0035:
            float r0 = r9.f4543n
            int r0 = (int) r0
            float r1 = r9.f4542m
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r13)
            if (r6 >= r0) goto L_0x0042
            goto L_0x0049
        L_0x0042:
            if (r6 <= r1) goto L_0x004a
            if (r13 <= 0) goto L_0x0048
            r13 = r1
            goto L_0x004a
        L_0x0048:
            int r10 = -r1
        L_0x0049:
            r13 = r10
        L_0x004a:
            int r10 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r1 = java.lang.Math.abs(r12)
            int r6 = java.lang.Math.abs(r13)
            int r7 = r1 + r6
            int r8 = r10 + r0
            if (r12 == 0) goto L_0x0063
            float r10 = (float) r1
            float r1 = (float) r7
            goto L_0x0065
        L_0x0063:
            float r10 = (float) r10
            float r1 = (float) r8
        L_0x0065:
            float r10 = r10 / r1
            if (r13 == 0) goto L_0x006b
            float r0 = (float) r6
            float r1 = (float) r7
            goto L_0x006d
        L_0x006b:
            float r0 = (float) r0
            float r1 = (float) r8
        L_0x006d:
            float r0 = r0 / r1
            c2.c$c r1 = r9.f4548s
            int r11 = r1.c(r11)
            int r11 = r9.g(r4, r12, r11)
            c2.c$c r12 = r9.f4548s
            int r12 = r12.d()
            int r12 = r9.g(r5, r13, r12)
            float r11 = (float) r11
            float r11 = r11 * r10
            float r10 = (float) r12
            float r10 = r10 * r0
            float r10 = r10 + r11
            int r6 = (int) r10
            android.widget.OverScroller r1 = r9.f4547r
            r1.startScroll(r2, r3, r4, r5, r6)
            r10 = 2
            r9.r(r10)
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.c.k(int, int, int, int):boolean");
    }

    public final void m(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f4541l == null) {
            this.f4541l = VelocityTracker.obtain();
        }
        this.f4541l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View j10 = j((int) x10, (int) y10);
            p(x10, y10, pointerId);
            v(pointerId, j10);
            if ((this.f4537h[pointerId] & this.f4546q) != 0) {
                this.f4548s.f(pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f4530a == 1) {
                n();
            }
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f4530a == 1) {
                    this.f4550u = true;
                    this.f4548s.j(this.f4549t, 0.0f, 0.0f);
                    this.f4550u = false;
                    if (this.f4530a == 1) {
                        r(0);
                    }
                }
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                p(x11, y11, pointerId2);
                if (this.f4530a == 0) {
                    v(pointerId2, j((int) x11, (int) y11));
                    if ((this.f4537h[pointerId2] & this.f4546q) != 0) {
                        this.f4548s.f(pointerId2);
                        return;
                    }
                    return;
                }
                if (l(this.f4549t, (int) x11, (int) y11)) {
                    v(pointerId2, this.f4549t);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f4530a == 1 && pointerId3 == this.f4532c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount) {
                            i10 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (pointerId4 != this.f4532c) {
                            View j11 = j((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view = this.f4549t;
                            if (j11 == view && v(pointerId4, view)) {
                                i10 = this.f4532c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        n();
                    }
                }
                f(pointerId3);
            }
        } else if (this.f4530a == 1) {
            int i12 = this.f4532c;
            if ((this.f4540k & (1 << i12)) != 0) {
                i11 = 1;
            }
            if (i11 != 0) {
                int findPointerIndex = motionEvent.findPointerIndex(i12);
                float x12 = motionEvent.getX(findPointerIndex);
                float y12 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f4535f;
                int i13 = this.f4532c;
                int i14 = (int) (x12 - fArr[i13]);
                int i15 = (int) (y12 - this.f4536g[i13]);
                int left = this.f4549t.getLeft() + i14;
                int top = this.f4549t.getTop() + i15;
                int left2 = this.f4549t.getLeft();
                int top2 = this.f4549t.getTop();
                if (i14 != 0) {
                    left = this.f4548s.a(this.f4549t, left);
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    this.f4549t.offsetLeftAndRight(left - left2);
                }
                if (i15 != 0) {
                    top = this.f4548s.b(this.f4549t, top);
                    WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                    this.f4549t.offsetTopAndBottom(top - top2);
                }
                if (!(i14 == 0 && i15 == 0)) {
                    this.f4548s.i(this.f4549t, left, top);
                }
                q(motionEvent);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i16 = 0; i16 < pointerCount2; i16++) {
                int pointerId5 = motionEvent.getPointerId(i16);
                if ((this.f4540k & (1 << pointerId5)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    float x13 = motionEvent.getX(i16);
                    float y13 = motionEvent.getY(i16);
                    float f10 = x13 - this.f4533d[pointerId5];
                    float f11 = y13 - this.f4534e[pointerId5];
                    o(f10, f11, pointerId5);
                    if (this.f4530a != 1) {
                        View j12 = j((int) x13, (int) y13);
                        if (e(j12, f10, f11) && v(pointerId5, j12)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            q(motionEvent);
        }
    }

    public final void n() {
        this.f4541l.computeCurrentVelocity(1000, this.f4542m);
        float xVelocity = this.f4541l.getXVelocity(this.f4532c);
        float f10 = this.f4543n;
        float f11 = this.f4542m;
        float abs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f11) {
            if (xVelocity > 0.0f) {
                xVelocity = f11;
            } else {
                xVelocity = -f11;
            }
        }
        float yVelocity = this.f4541l.getYVelocity(this.f4532c);
        float f13 = this.f4543n;
        float f14 = this.f4542m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f13) {
            if (abs2 > f14) {
                if (yVelocity > 0.0f) {
                    f12 = f14;
                } else {
                    yVelocity = -f14;
                }
            }
            f12 = yVelocity;
        }
        this.f4550u = true;
        this.f4548s.j(this.f4549t, xVelocity, f12);
        this.f4550u = false;
        if (this.f4530a == 1) {
            r(0);
        }
    }

    public final void o(float f10, float f11, int i10) {
        boolean d10 = d(f10, f11, i10, 1);
        if (d(f11, f10, i10, 4)) {
            d10 |= true;
        }
        if (d(f10, f11, i10, 2)) {
            d10 |= true;
        }
        if (d(f11, f10, i10, 8)) {
            d10 |= true;
        }
        if (d10) {
            int[] iArr = this.f4538i;
            iArr[i10] = iArr[i10] | d10;
            this.f4548s.e(d10 ? 1 : 0, i10);
        }
    }

    public final void p(float f10, float f11, int i10) {
        float[] fArr = this.f4533d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4534e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4535f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4536g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4537h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4538i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4539j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4533d = fArr2;
            this.f4534e = fArr3;
            this.f4535f = fArr4;
            this.f4536g = fArr5;
            this.f4537h = iArr;
            this.f4538i = iArr2;
            this.f4539j = iArr3;
        }
        float[] fArr9 = this.f4533d;
        this.f4535f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f4534e;
        this.f4536g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f4537h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        if (i13 < this.f4551v.getLeft() + this.f4544o) {
            i11 = 1;
        }
        if (i14 < this.f4551v.getTop() + this.f4544o) {
            i11 |= 4;
        }
        if (i13 > this.f4551v.getRight() - this.f4544o) {
            i11 |= 2;
        }
        if (i14 > this.f4551v.getBottom() - this.f4544o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f4540k |= 1 << i10;
    }

    public final void q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            boolean z10 = true;
            if ((this.f4540k & (1 << pointerId)) == 0) {
                z10 = false;
            }
            if (z10) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f4535f[pointerId] = x10;
                this.f4536g[pointerId] = y10;
            }
        }
    }

    public final void r(int i10) {
        this.f4551v.removeCallbacks(this.f4552w);
        if (this.f4530a != i10) {
            this.f4530a = i10;
            this.f4548s.h(i10);
            if (this.f4530a == 0) {
                this.f4549t = null;
            }
        }
    }

    public final boolean s(int i10, int i11) {
        if (this.f4550u) {
            return k(i10, i11, (int) this.f4541l.getXVelocity(this.f4532c), (int) this.f4541l.getYVelocity(this.f4532c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        if (r12 != r11) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f4541l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f4541l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f4541l
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0108
            if (r2 == r5) goto L_0x0103
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x0103
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x0106
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.f(r1)
            goto L_0x0106
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.p(r7, r1, r2)
            int r3 = r0.f4530a
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.f4537h
            r1 = r1[r2]
            int r3 = r0.f4546q
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0106
            c2.c$c r1 = r0.f4548s
            r1.f(r2)
            goto L_0x0106
        L_0x005f:
            if (r3 != r4) goto L_0x0106
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.j(r3, r1)
            android.view.View r3 = r0.f4549t
            if (r1 != r3) goto L_0x0106
            r0.v(r2, r1)
            goto L_0x0106
        L_0x0070:
            float[] r2 = r0.f4533d
            if (r2 == 0) goto L_0x0106
            float[] r2 = r0.f4534e
            if (r2 != 0) goto L_0x007a
            goto L_0x0106
        L_0x007a:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x00ff
            int r4 = r1.getPointerId(r3)
            int r7 = r0.f4540k
            int r8 = r5 << r4
            r7 = r7 & r8
            if (r7 == 0) goto L_0x008e
            r7 = r5
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            if (r7 != 0) goto L_0x0093
            goto L_0x00fc
        L_0x0093:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f4533d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f4534e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.j(r7, r8)
            if (r7 == 0) goto L_0x00b7
            boolean r8 = r0.e(r7, r9, r10)
            if (r8 == 0) goto L_0x00b7
            r8 = r5
            goto L_0x00b8
        L_0x00b7:
            r8 = 0
        L_0x00b8:
            if (r8 == 0) goto L_0x00eb
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            c2.c$c r13 = r0.f4548s
            int r12 = r13.a(r7, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r14 = r14 + r13
            c2.c$c r15 = r0.f4548s
            int r14 = r15.b(r7, r14)
            c2.c$c r15 = r0.f4548s
            int r15 = r15.c(r7)
            c2.c$c r6 = r0.f4548s
            int r6 = r6.d()
            if (r15 == 0) goto L_0x00e4
            if (r15 <= 0) goto L_0x00eb
            if (r12 != r11) goto L_0x00eb
        L_0x00e4:
            if (r6 == 0) goto L_0x00ff
            if (r6 <= 0) goto L_0x00eb
            if (r14 != r13) goto L_0x00eb
            goto L_0x00ff
        L_0x00eb:
            r0.o(r9, r10, r4)
            int r6 = r0.f4530a
            if (r6 != r5) goto L_0x00f3
            goto L_0x00ff
        L_0x00f3:
            if (r8 == 0) goto L_0x00fc
            boolean r4 = r0.v(r4, r7)
            if (r4 == 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x00ff:
            r16.q(r17)
            goto L_0x0106
        L_0x0103:
            r16.b()
        L_0x0106:
            r6 = 0
            goto L_0x0137
        L_0x0108:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.p(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.j(r2, r3)
            android.view.View r3 = r0.f4549t
            if (r2 != r3) goto L_0x0129
            int r3 = r0.f4530a
            if (r3 != r4) goto L_0x0129
            r0.v(r1, r2)
        L_0x0129:
            int[] r2 = r0.f4537h
            r2 = r2[r1]
            int r3 = r0.f4546q
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0137
            c2.c$c r2 = r0.f4548s
            r2.f(r1)
        L_0x0137:
            int r1 = r0.f4530a
            if (r1 != r5) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r5 = r6
        L_0x013d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.c.t(android.view.MotionEvent):boolean");
    }

    public final boolean u(View view, int i10, int i11) {
        this.f4549t = view;
        this.f4532c = -1;
        boolean k10 = k(i10, i11, 0, 0);
        if (!k10 && this.f4530a == 0 && this.f4549t != null) {
            this.f4549t = null;
        }
        return k10;
    }

    public final boolean v(int i10, View view) {
        if (view == this.f4549t && this.f4532c == i10) {
            return true;
        }
        if (view == null || !this.f4548s.k(i10, view)) {
            return false;
        }
        this.f4532c = i10;
        c(i10, view);
        return true;
    }
}
