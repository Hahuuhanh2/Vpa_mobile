package com.luck.picture.lib.magical;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.luck.picture.lib.basic.PictureSelectorSupporterActivity;
import com.luck.picture.lib.basic.PictureSelectorTransparentActivity;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.widget.TitleBar;
import ee.p;
import ee.t;
import ge.h;
import se.d;
import se.e;
import se.f;
import se.g;
import xe.c;

public class MagicalView extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final ke.a A;
    public int B;
    public int C;
    public g D;

    /* renamed from: a  reason: collision with root package name */
    public float f8100a;

    /* renamed from: b  reason: collision with root package name */
    public int f8101b;

    /* renamed from: c  reason: collision with root package name */
    public int f8102c;

    /* renamed from: d  reason: collision with root package name */
    public int f8103d;

    /* renamed from: e  reason: collision with root package name */
    public int f8104e;

    /* renamed from: f  reason: collision with root package name */
    public int f8105f;

    /* renamed from: n  reason: collision with root package name */
    public int f8106n;

    /* renamed from: o  reason: collision with root package name */
    public final int f8107o;

    /* renamed from: p  reason: collision with root package name */
    public int f8108p;

    /* renamed from: q  reason: collision with root package name */
    public int f8109q;

    /* renamed from: r  reason: collision with root package name */
    public int f8110r;

    /* renamed from: s  reason: collision with root package name */
    public int f8111s;

    /* renamed from: t  reason: collision with root package name */
    public int f8112t;

    /* renamed from: u  reason: collision with root package name */
    public int f8113u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8114v;

    /* renamed from: w  reason: collision with root package name */
    public final FrameLayout f8115w;

    /* renamed from: x  reason: collision with root package name */
    public final View f8116x;

    /* renamed from: y  reason: collision with root package name */
    public final f f8117y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f8118z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MagicalView magicalView = MagicalView.this;
            magicalView.f8114v = true;
            magicalView.f8100a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView magicalView2 = MagicalView.this;
            magicalView2.f8116x.setAlpha(magicalView2.f8100a);
            MagicalView magicalView3 = MagicalView.this;
            g gVar = magicalView3.D;
            if (gVar != null) {
                float f10 = magicalView3.f8100a;
                t tVar = ((p) gVar).f9402a;
                for (int i10 = 0; i10 < tVar.L0.size(); i10++) {
                    if (!(tVar.L0.get(i10) instanceof TitleBar)) {
                        ((View) tVar.L0.get(i10)).setAlpha(f10);
                    }
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8120a;

        public b(boolean z10) {
            this.f8120a = z10;
        }

        public final void onAnimationEnd(Animator animator) {
            g gVar;
            MagicalView magicalView = MagicalView.this;
            boolean z10 = false;
            magicalView.f8114v = false;
            if (this.f8120a && (gVar = magicalView.D) != null) {
                t tVar = ((p) gVar).f9402a;
                if (tVar.A0) {
                    if ((tVar.m() instanceof PictureSelectorSupporterActivity) || (tVar.m() instanceof PictureSelectorTransparentActivity)) {
                        z10 = true;
                    }
                    if (z10 && tVar.T0()) {
                        tVar.z0();
                        return;
                    }
                }
                tVar.v0();
            }
        }
    }

    public MagicalView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void getScreenSize() {
        this.f8105f = c.e(getContext());
        if (this.f8118z) {
            this.f8106n = c.d(getContext());
        } else {
            this.f8106n = c.f(getContext());
        }
    }

    public final void a() {
        if (!this.f8114v) {
            if (this.f8104e == 0 || this.f8103d == 0) {
                this.f8115w.animate().alpha(0.0f).setDuration(250).setListener(new e(this)).start();
                this.f8116x.animate().alpha(0.0f).setDuration(250).start();
                return;
            }
            g gVar = this.D;
            if (gVar != null) {
                t tVar = ((p) gVar).f9402a;
                ge.b u10 = tVar.f9411r0.u(tVar.f9410q0.getCurrentItem());
                if (u10 != null) {
                    if (u10.f10459z.getVisibility() == 8) {
                        u10.f10459z.setVisibility(0);
                    }
                    if (u10 instanceof h) {
                        h hVar = (h) u10;
                        if (hVar.B.getVisibility() == 0) {
                            hVar.B.setVisibility(8);
                        }
                    }
                }
            }
            this.f8115w.post(new d(this));
        }
    }

    public final void b(boolean z10) {
        float f10;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f8100a, f10});
        ofFloat.addUpdateListener(new a());
        ofFloat.addListener(new b(z10));
        ofFloat.setDuration(250);
        ofFloat.start();
    }

    public final void c(boolean z10, int i10, int i11) {
        int i12;
        int i13;
        if (!this.f8118z && (i12 = this.f8105f) <= (i13 = this.f8106n)) {
            if (((int) (((float) i12) / (((float) i10) / ((float) i11)))) > i13) {
                this.f8106n = this.f8107o;
                if (z10) {
                    this.f8117y.b((float) i12);
                    this.f8117y.a((float) this.f8106n);
                }
            }
        }
    }

    public final void d() {
        getScreenSize();
        i(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 != 3) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = r5.f8115w
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto L_0x000e
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            int r1 = r6.getAction()
            r2 = 1
            if (r1 == 0) goto L_0x0053
            if (r1 == r2) goto L_0x004d
            r3 = 2
            if (r1 == r3) goto L_0x001f
            r3 = 3
            if (r1 == r3) goto L_0x004d
            goto L_0x0066
        L_0x001f:
            float r1 = r6.getX()
            int r1 = (int) r1
            float r3 = r6.getY()
            int r3 = (int) r3
            int r4 = r5.B
            int r1 = r1 - r4
            int r1 = java.lang.Math.abs(r1)
            int r4 = r5.C
            int r4 = r3 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r1 <= r4) goto L_0x0040
            if (r0 == 0) goto L_0x0066
            r0.setUserInputEnabled(r2)
            goto L_0x0066
        L_0x0040:
            if (r0 == 0) goto L_0x0066
            int r1 = r5.C
            int r1 = r1 - r3
            boolean r1 = r5.canScrollVertically(r1)
            r0.setUserInputEnabled(r1)
            goto L_0x0066
        L_0x004d:
            if (r0 == 0) goto L_0x0066
            r0.setUserInputEnabled(r2)
            goto L_0x0066
        L_0x0053:
            float r1 = r6.getX()
            int r1 = (int) r1
            r5.B = r1
            float r1 = r6.getY()
            int r1 = (int) r1
            r5.C = r1
            if (r0 == 0) goto L_0x0066
            r0.setUserInputEnabled(r2)
        L_0x0066:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.magical.MagicalView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e(int i10, int i11) {
        getScreenSize();
        j(i10, i11);
    }

    public final void f() {
        this.f8115w.getLocationOnScreen(new int[2]);
        this.f8111s = 0;
        int i10 = this.f8105f;
        float f10 = (float) i10;
        int i11 = this.f8106n;
        float f11 = (float) i11;
        float f12 = (float) this.f8112t;
        float f13 = (float) this.f8113u;
        float f14 = f12 / f13;
        if (f10 / f11 < f14) {
            this.f8109q = i10;
            int i12 = (int) ((f13 / f12) * f10);
            this.f8110r = i12;
            this.f8108p = (i11 - i12) / 2;
        } else {
            this.f8110r = i11;
            int i13 = (int) (f14 * f11);
            this.f8109q = i13;
            this.f8108p = 0;
            this.f8111s = (i10 - i13) / 2;
        }
        this.f8117y.b((float) this.f8104e);
        this.f8117y.a((float) this.f8103d);
        f fVar = this.f8117y;
        int i14 = this.f8101b;
        ViewGroup.MarginLayoutParams marginLayoutParams = fVar.f14753a;
        marginLayoutParams.leftMargin = i14;
        fVar.f14754b.setLayoutParams(marginLayoutParams);
        f fVar2 = this.f8117y;
        int i15 = this.f8102c;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = fVar2.f14753a;
        marginLayoutParams2.topMargin = i15;
        fVar2.f14754b.setLayoutParams(marginLayoutParams2);
    }

    public final void g() {
        int i10;
        int i11;
        boolean z10;
        this.f8114v = false;
        int i12 = this.f8106n;
        this.f8110r = i12;
        this.f8109q = this.f8105f;
        this.f8108p = 0;
        this.f8117y.a((float) i12);
        this.f8117y.b((float) this.f8105f);
        f fVar = this.f8117y;
        ViewGroup.MarginLayoutParams marginLayoutParams = fVar.f14753a;
        marginLayoutParams.topMargin = 0;
        fVar.f14754b.setLayoutParams(marginLayoutParams);
        f fVar2 = this.f8117y;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = fVar2.f14753a;
        marginLayoutParams2.leftMargin = 0;
        fVar2.f14754b.setLayoutParams(marginLayoutParams2);
        g gVar = this.D;
        if (gVar != null) {
            t tVar = ((p) gVar).f9402a;
            ge.b u10 = tVar.f9411r0.u(tVar.f9410q0.getCurrentItem());
            if (u10 != null) {
                LocalMedia localMedia = tVar.f9408o0.get(tVar.f9410q0.getCurrentItem());
                if (!localMedia.d() || (i11 = localMedia.B) <= 0 || (i10 = localMedia.C) <= 0) {
                    i11 = localMedia.f8090z;
                    i10 = localMedia.A;
                }
                if (i11 <= 0 || i10 <= 0 || i10 <= i11 * 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    u10.f10459z.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else {
                    u10.f10459z.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                if (u10 instanceof h) {
                    h hVar = (h) u10;
                    tVar.f11878i0.getClass();
                    if (hVar.B.getVisibility() == 8 && !tVar.U0()) {
                        hVar.B.setVisibility(0);
                    }
                }
            }
        }
    }

    public final void h(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (z10) {
            this.f8117y.b(f16);
            this.f8117y.a(f18);
            f fVar = this.f8117y;
            ViewGroup.MarginLayoutParams marginLayoutParams = fVar.f14753a;
            marginLayoutParams.leftMargin = (int) f14;
            fVar.f14754b.setLayoutParams(marginLayoutParams);
            f fVar2 = this.f8117y;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = fVar2.f14753a;
            marginLayoutParams2.topMargin = (int) f12;
            fVar2.f14754b.setLayoutParams(marginLayoutParams2);
            return;
        }
        float f19 = (f12 - f11) * f10;
        this.f8117y.b(f15 + ((f16 - f15) * f10));
        this.f8117y.a(f17 + ((f18 - f17) * f10));
        f fVar3 = this.f8117y;
        int i10 = (int) (f13 + ((f14 - f13) * f10));
        ViewGroup.MarginLayoutParams marginLayoutParams3 = fVar3.f14753a;
        marginLayoutParams3.leftMargin = i10;
        fVar3.f14754b.setLayoutParams(marginLayoutParams3);
        f fVar4 = this.f8117y;
        int i11 = (int) (f11 + f19);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = fVar4.f14753a;
        marginLayoutParams4.topMargin = i11;
        fVar4.f14754b.setLayoutParams(marginLayoutParams4);
    }

    public final void i(boolean z10) {
        float f10;
        if (z10) {
            this.f8100a = 1.0f;
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f8100a = f10;
        this.f8116x.setAlpha(f10);
        setVisibility(0);
        f();
        if (z10) {
            this.f8100a = 1.0f;
            this.f8116x.setAlpha(1.0f);
            h(true, 0.0f, 0.0f, (float) this.f8108p, 0.0f, (float) this.f8111s, 0.0f, (float) this.f8109q, 0.0f, (float) this.f8110r);
            g();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new se.b(this));
        ofFloat.addListener(new se.c(this));
        this.A.getClass();
        ofFloat.setDuration(250).start();
        b(false);
    }

    public final void j(int i10, int i11) {
        this.f8112t = i10;
        this.f8113u = i11;
        this.f8101b = 0;
        this.f8102c = 0;
        this.f8104e = 0;
        this.f8103d = 0;
        setVisibility(0);
        f();
        h(true, 0.0f, 0.0f, (float) this.f8108p, 0.0f, (float) this.f8111s, 0.0f, (float) this.f8109q, 0.0f, (float) this.f8110r);
        this.f8100a = 0.0f;
        this.f8116x.setAlpha(0.0f);
        this.f8115w.setAlpha(0.0f);
        this.f8115w.animate().alpha(1.0f).setDuration(250).start();
        this.f8116x.animate().alpha(1.0f).setDuration(250).start();
        g();
    }

    public void setBackgroundAlpha(float f10) {
        this.f8100a = f10;
        this.f8116x.setAlpha(f10);
    }

    public void setBackgroundColor(int i10) {
        this.f8116x.setBackgroundColor(i10);
    }

    public void setMagicalContent(View view) {
        this.f8115w.addView(view);
    }

    public void setOnMojitoViewCallback(g gVar) {
        this.D = gVar;
    }

    public void setViewParams(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f8112t = i14;
        this.f8113u = i15;
        this.f8101b = i10;
        this.f8102c = i11;
        this.f8104e = i12;
        this.f8103d = i13;
    }

    public MagicalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MagicalView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8100a = 0.0f;
        this.f8114v = false;
        ke.a b10 = ke.b.a().b();
        this.A = b10;
        this.f8118z = b10.f12538u;
        this.f8107o = c.d(getContext());
        getScreenSize();
        View view = new View(context);
        this.f8116x = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setAlpha(this.f8100a);
        addView(view);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8115w = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f8117y = new f(frameLayout);
    }
}
