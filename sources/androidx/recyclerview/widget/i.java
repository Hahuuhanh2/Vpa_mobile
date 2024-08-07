package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: FastScroller */
public final class i extends RecyclerView.l implements RecyclerView.p {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a  reason: collision with root package name */
    public final int f3224a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3225b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f3226c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f3227d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3228e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3229f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f3230g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f3231h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3232i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3233j;

    /* renamed from: k  reason: collision with root package name */
    public int f3234k;

    /* renamed from: l  reason: collision with root package name */
    public int f3235l;

    /* renamed from: m  reason: collision with root package name */
    public float f3236m;

    /* renamed from: n  reason: collision with root package name */
    public int f3237n;

    /* renamed from: o  reason: collision with root package name */
    public int f3238o;

    /* renamed from: p  reason: collision with root package name */
    public float f3239p;

    /* renamed from: q  reason: collision with root package name */
    public int f3240q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3241r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f3242s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3243t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3244u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f3245v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f3246w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f3247x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f3248y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f3249z;

    /* compiled from: FastScroller */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            i iVar = i.this;
            int i10 = iVar.A;
            if (i10 == 1) {
                iVar.f3249z.cancel();
            } else if (i10 != 2) {
                return;
            }
            iVar.A = 3;
            ValueAnimator valueAnimator = iVar.f3249z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            iVar.f3249z.setDuration((long) 500);
            iVar.f3249z.start();
        }
    }

    /* compiled from: FastScroller */
    public class b extends RecyclerView.q {
        public b() {
        }

        public final void b(RecyclerView recyclerView, int i10, int i11) {
            boolean z10;
            boolean z11;
            i iVar = i.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = iVar.f3242s.computeVerticalScrollRange();
            int i12 = iVar.f3241r;
            if (computeVerticalScrollRange - i12 <= 0 || i12 < iVar.f3224a) {
                z10 = false;
            } else {
                z10 = true;
            }
            iVar.f3243t = z10;
            int computeHorizontalScrollRange = iVar.f3242s.computeHorizontalScrollRange();
            int i13 = iVar.f3240q;
            if (computeHorizontalScrollRange - i13 <= 0 || i13 < iVar.f3224a) {
                z11 = false;
            } else {
                z11 = true;
            }
            iVar.f3244u = z11;
            boolean z12 = iVar.f3243t;
            if (z12 || z11) {
                if (z12) {
                    float f10 = (float) i12;
                    iVar.f3235l = (int) ((((f10 / 2.0f) + ((float) computeVerticalScrollOffset)) * f10) / ((float) computeVerticalScrollRange));
                    iVar.f3234k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
                }
                if (iVar.f3244u) {
                    float f11 = (float) computeHorizontalScrollOffset;
                    float f12 = (float) i13;
                    iVar.f3238o = (int) ((((f12 / 2.0f) + f11) * f12) / ((float) computeHorizontalScrollRange));
                    iVar.f3237n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
                }
                int i14 = iVar.f3245v;
                if (i14 == 0 || i14 == 1) {
                    iVar.i(1);
                }
            } else if (iVar.f3245v != 0) {
                iVar.i(0);
            }
        }
    }

    /* compiled from: FastScroller */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3252a = false;

        public c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f3252a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f3252a) {
                this.f3252a = false;
            } else if (((Float) i.this.f3249z.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.A = 0;
                iVar.i(0);
            } else {
                i iVar2 = i.this;
                iVar2.A = 2;
                iVar2.f3242s.invalidate();
            }
        }
    }

    /* compiled from: FastScroller */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f3226c.setAlpha(floatValue);
            i.this.f3227d.setAlpha(floatValue);
            i.this.f3242s.invalidate();
        }
    }

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        boolean z10 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3249z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f3226c = stateListDrawable;
        this.f3227d = drawable;
        this.f3230g = stateListDrawable2;
        this.f3231h = drawable2;
        this.f3228e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3229f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3232i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3233j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3224a = i11;
        this.f3225b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f3242s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.m mVar = recyclerView2.f2994u;
                if (mVar != null) {
                    mVar.m("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.f3000x.remove(this);
                if (recyclerView2.f3000x.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z10);
                }
                recyclerView2.S();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f3242s;
                recyclerView3.f3002y.remove(this);
                if (recyclerView3.f3004z == this) {
                    recyclerView3.f3004z = null;
                }
                ArrayList arrayList = this.f3242s.f2989r0;
                if (arrayList != null) {
                    arrayList.remove(bVar);
                }
                this.f3242s.removeCallbacks(aVar);
            }
            this.f3242s = recyclerView;
            if (recyclerView != null) {
                recyclerView.i(this);
                this.f3242s.f3002y.add(this);
                this.f3242s.j(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r7 >= 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        if (r4 >= 0) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            int r11 = r10.f3245v
            if (r11 != 0) goto L_0x0005
            return
        L_0x0005:
            int r11 = r12.getAction()
            r0 = 2
            r1 = 1
            if (r11 != 0) goto L_0x0047
            float r11 = r12.getX()
            float r2 = r12.getY()
            boolean r11 = r10.h(r11, r2)
            float r2 = r12.getX()
            float r3 = r12.getY()
            boolean r2 = r10.g(r2, r3)
            if (r11 != 0) goto L_0x0029
            if (r2 == 0) goto L_0x011f
        L_0x0029:
            if (r2 == 0) goto L_0x0036
            r10.f3246w = r1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r11 = (float) r11
            r10.f3239p = r11
            goto L_0x0042
        L_0x0036:
            if (r11 == 0) goto L_0x0042
            r10.f3246w = r0
            float r11 = r12.getY()
            int r11 = (int) r11
            float r11 = (float) r11
            r10.f3236m = r11
        L_0x0042:
            r10.i(r0)
            goto L_0x011f
        L_0x0047:
            int r11 = r12.getAction()
            r2 = 0
            if (r11 != r1) goto L_0x005e
            int r11 = r10.f3245v
            if (r11 != r0) goto L_0x005e
            r11 = 0
            r10.f3236m = r11
            r10.f3239p = r11
            r10.i(r1)
            r10.f3246w = r2
            goto L_0x011f
        L_0x005e:
            int r11 = r12.getAction()
            if (r11 != r0) goto L_0x011f
            int r11 = r10.f3245v
            if (r11 != r0) goto L_0x011f
            r10.j()
            int r11 = r10.f3246w
            r3 = 1073741824(0x40000000, float:2.0)
            if (r11 != r1) goto L_0x00c6
            float r11 = r12.getX()
            int[] r4 = r10.f3248y
            int r5 = r10.f3225b
            r4[r2] = r5
            int r6 = r10.f3240q
            int r6 = r6 - r5
            r4[r1] = r6
            float r5 = (float) r5
            float r6 = (float) r6
            float r11 = java.lang.Math.min(r6, r11)
            float r11 = java.lang.Math.max(r5, r11)
            int r5 = r10.f3238o
            float r5 = (float) r5
            float r5 = r5 - r11
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0097
            goto L_0x00c6
        L_0x0097:
            float r5 = r10.f3239p
            androidx.recyclerview.widget.RecyclerView r6 = r10.f3242s
            int r6 = r6.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r7 = r10.f3242s
            int r7 = r7.computeHorizontalScrollOffset()
            int r8 = r10.f3240q
            r9 = r4[r1]
            r4 = r4[r2]
            int r9 = r9 - r4
            if (r9 != 0) goto L_0x00b0
        L_0x00ae:
            r4 = r2
            goto L_0x00bd
        L_0x00b0:
            float r4 = r11 - r5
            float r5 = (float) r9
            float r4 = r4 / r5
            int r6 = r6 - r8
            float r5 = (float) r6
            float r4 = r4 * r5
            int r4 = (int) r4
            int r7 = r7 + r4
            if (r7 >= r6) goto L_0x00ae
            if (r7 < 0) goto L_0x00ae
        L_0x00bd:
            if (r4 == 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView r5 = r10.f3242s
            r5.scrollBy(r4, r2)
        L_0x00c4:
            r10.f3239p = r11
        L_0x00c6:
            int r11 = r10.f3246w
            if (r11 != r0) goto L_0x011f
            float r11 = r12.getY()
            int[] r12 = r10.f3247x
            int r0 = r10.f3225b
            r12[r2] = r0
            int r4 = r10.f3241r
            int r4 = r4 - r0
            r12[r1] = r4
            float r0 = (float) r0
            float r4 = (float) r4
            float r11 = java.lang.Math.min(r4, r11)
            float r11 = java.lang.Math.max(r0, r11)
            int r0 = r10.f3235l
            float r0 = (float) r0
            float r0 = r0 - r11
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f0
            goto L_0x011f
        L_0x00f0:
            float r0 = r10.f3236m
            androidx.recyclerview.widget.RecyclerView r3 = r10.f3242s
            int r3 = r3.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r4 = r10.f3242s
            int r4 = r4.computeVerticalScrollOffset()
            int r5 = r10.f3241r
            r1 = r12[r1]
            r12 = r12[r2]
            int r1 = r1 - r12
            if (r1 != 0) goto L_0x0109
        L_0x0107:
            r12 = r2
            goto L_0x0116
        L_0x0109:
            float r12 = r11 - r0
            float r0 = (float) r1
            float r12 = r12 / r0
            int r3 = r3 - r5
            float r0 = (float) r3
            float r12 = r12 * r0
            int r12 = (int) r12
            int r4 = r4 + r12
            if (r4 >= r3) goto L_0x0107
            if (r4 < 0) goto L_0x0107
        L_0x0116:
            if (r12 == 0) goto L_0x011d
            androidx.recyclerview.widget.RecyclerView r0 = r10.f3242s
            r0.scrollBy(r2, r12)
        L_0x011d:
            r10.f3236m = r11
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.a(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3245v;
        if (i10 == 1) {
            boolean h10 = h(motionEvent.getX(), motionEvent.getY());
            boolean g2 = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (h10 || g2)) {
                if (g2) {
                    this.f3246w = 1;
                    this.f3239p = (float) ((int) motionEvent.getX());
                } else if (h10) {
                    this.f3246w = 2;
                    this.f3236m = (float) ((int) motionEvent.getY());
                }
                i(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
    }

    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (this.f3240q != this.f3242s.getWidth() || this.f3241r != this.f3242s.getHeight()) {
            this.f3240q = this.f3242s.getWidth();
            this.f3241r = this.f3242s.getHeight();
            i(0);
        } else if (this.A != 0) {
            if (this.f3243t) {
                int i10 = this.f3240q;
                int i11 = this.f3228e;
                int i12 = i10 - i11;
                int i13 = this.f3235l;
                int i14 = this.f3234k;
                int i15 = i13 - (i14 / 2);
                this.f3226c.setBounds(0, 0, i11, i14);
                this.f3227d.setBounds(0, 0, this.f3229f, this.f3241r);
                RecyclerView recyclerView2 = this.f3242s;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                boolean z10 = true;
                if (d0.e.d(recyclerView2) != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f3227d.draw(canvas);
                    canvas.translate((float) this.f3228e, (float) i15);
                    canvas.scale(-1.0f, 1.0f);
                    this.f3226c.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f3228e), (float) (-i15));
                } else {
                    canvas.translate((float) i12, 0.0f);
                    this.f3227d.draw(canvas);
                    canvas.translate(0.0f, (float) i15);
                    this.f3226c.draw(canvas);
                    canvas.translate((float) (-i12), (float) (-i15));
                }
            }
            if (this.f3244u) {
                int i16 = this.f3241r;
                int i17 = this.f3232i;
                int i18 = i16 - i17;
                int i19 = this.f3238o;
                int i20 = this.f3237n;
                int i21 = i19 - (i20 / 2);
                this.f3230g.setBounds(0, 0, i20, i17);
                this.f3231h.setBounds(0, 0, this.f3240q, this.f3233j);
                canvas.translate(0.0f, (float) i18);
                this.f3231h.draw(canvas);
                canvas.translate((float) i21, 0.0f);
                this.f3230g.draw(canvas);
                canvas.translate((float) (-i21), (float) (-i18));
            }
        }
    }

    public final boolean g(float f10, float f11) {
        if (f11 >= ((float) (this.f3241r - this.f3232i))) {
            int i10 = this.f3238o;
            int i11 = this.f3237n;
            if (f10 < ((float) (i10 - (i11 / 2))) || f10 > ((float) ((i11 / 2) + i10))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean h(float f10, float f11) {
        boolean z10;
        RecyclerView recyclerView = this.f3242s;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (f10 > ((float) this.f3228e)) {
                return false;
            }
        } else if (f10 < ((float) (this.f3240q - this.f3228e))) {
            return false;
        }
        int i10 = this.f3235l;
        int i11 = this.f3234k / 2;
        if (f11 < ((float) (i10 - i11)) || f11 > ((float) (i11 + i10))) {
            return false;
        }
        return true;
    }

    public final void i(int i10) {
        if (i10 == 2 && this.f3245v != 2) {
            this.f3226c.setState(C);
            this.f3242s.removeCallbacks(this.B);
        }
        if (i10 == 0) {
            this.f3242s.invalidate();
        } else {
            j();
        }
        if (this.f3245v == 2 && i10 != 2) {
            this.f3226c.setState(D);
            this.f3242s.removeCallbacks(this.B);
            this.f3242s.postDelayed(this.B, (long) 1200);
        } else if (i10 == 1) {
            this.f3242s.removeCallbacks(this.B);
            this.f3242s.postDelayed(this.B, (long) 1500);
        }
        this.f3245v = i10;
    }

    public final void j() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f3249z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3249z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3249z.setDuration(500);
        this.f3249z.setStartDelay(0);
        this.f3249z.start();
    }
}
