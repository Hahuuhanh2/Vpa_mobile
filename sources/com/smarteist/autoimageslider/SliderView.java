package com.smarteist.autoimageslider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.smarteist.autoimageslider.IndicatorView.PageIndicatorView;
import com.smarteist.autoimageslider.SliderPager;
import dg.d;
import dg.e;
import dg.g;
import dg.h;
import dg.i;
import dg.j;
import dg.k;
import dg.l;
import dg.m;
import dg.n;
import dg.o;
import dg.p;
import dg.q;
import dg.r;
import dg.s;
import dg.t;
import dg.u;
import dg.v;
import java.util.ArrayList;
import java.util.WeakHashMap;
import vf.f;
import w1.d0;
import w1.q0;
import xf.a;
import yf.c;

public class SliderView extends FrameLayout implements Runnable, View.OnTouchListener, SliderPager.i {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f19327a = new Handler();

    /* renamed from: b  reason: collision with root package name */
    public boolean f19328b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f19329c;

    /* renamed from: d  reason: collision with root package name */
    public int f19330d;

    /* renamed from: e  reason: collision with root package name */
    public int f19331e;

    /* renamed from: f  reason: collision with root package name */
    public PageIndicatorView f19332f;

    /* renamed from: n  reason: collision with root package name */
    public SliderPager f19333n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f19334o = true;

    /* renamed from: p  reason: collision with root package name */
    public int f19335p = -1;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            SliderView sliderView = SliderView.this;
            sliderView.f19327a.removeCallbacks(sliderView);
            sliderView.f19327a.postDelayed(sliderView, (long) sliderView.f19331e);
        }
    }

    public interface b {
        void a();
    }

    public SliderView(Context context) {
        super(context);
        setupSlideView(context);
    }

    private int getAdapterItemsCount() {
        try {
            getSliderAdapter().c();
        } catch (NullPointerException unused) {
        }
        return 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupSlideView(Context context) {
        SliderPager sliderPager = new SliderPager(context);
        this.f19333n = sliderPager;
        sliderPager.setOverScrollMode(1);
        SliderPager sliderPager2 = this.f19333n;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        sliderPager2.setId(d0.e.a());
        addView(this.f19333n, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f19333n.setOnTouchListener(this);
        SliderPager sliderPager3 = this.f19333n;
        if (sliderPager3.T == null) {
            sliderPager3.T = new ArrayList();
        }
        sliderPager3.T.add(this);
    }

    public final void a(float f10, int i10) {
    }

    public final void b(int i10) {
    }

    public final void c(int i10) {
    }

    public final void d() {
        if (this.f19332f == null) {
            this.f19332f = new PageIndicatorView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 81;
            layoutParams.setMargins(20, 20, 20, 20);
            addView(this.f19332f, 1, layoutParams);
        }
        this.f19332f.setViewPager(this.f19333n);
        this.f19332f.setDynamicCount(true);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SliderView, 0, 0);
        boolean z10 = obtainStyledAttributes.getBoolean(R$styleable.SliderView_sliderIndicatorEnabled, true);
        int i10 = obtainStyledAttributes.getInt(R$styleable.SliderView_sliderAnimationDuration, 250);
        int i11 = obtainStyledAttributes.getInt(R$styleable.SliderView_sliderScrollTimeInSec, 2);
        boolean z11 = obtainStyledAttributes.getBoolean(R$styleable.SliderView_sliderAutoCycleEnabled, true);
        boolean z12 = obtainStyledAttributes.getBoolean(R$styleable.SliderView_sliderStartAutoCycle, false);
        int i12 = obtainStyledAttributes.getInt(R$styleable.SliderView_sliderAutoCycleDirection, 0);
        setSliderAnimationDuration(i10);
        setScrollTimeInSec(i11);
        setAutoCycle(z11);
        setAutoCycleDirection(i12);
        setAutoCycle(z12);
        setIndicatorEnabled(z10);
        if (this.f19334o) {
            d();
            int i13 = R$styleable.SliderView_sliderIndicatorOrientation;
            yf.b bVar = yf.b.HORIZONTAL;
            if (obtainStyledAttributes.getInt(i13, 0) != 0) {
                bVar = yf.b.VERTICAL;
            }
            int dimension = (int) obtainStyledAttributes.getDimension(R$styleable.SliderView_sliderIndicatorRadius, (float) j7.a.z(2));
            int dimension2 = (int) obtainStyledAttributes.getDimension(R$styleable.SliderView_sliderIndicatorPadding, (float) j7.a.z(3));
            int dimension3 = (int) obtainStyledAttributes.getDimension(R$styleable.SliderView_sliderIndicatorMargin, (float) j7.a.z(12));
            int dimension4 = (int) obtainStyledAttributes.getDimension(R$styleable.SliderView_sliderIndicatorMarginLeft, (float) j7.a.z(12));
            int dimension5 = (int) obtainStyledAttributes.getDimension(R$styleable.SliderView_sliderIndicatorMarginTop, (float) j7.a.z(12));
            int dimension6 = (int) obtainStyledAttributes.getDimension(R$styleable.SliderView_sliderIndicatorMarginRight, (float) j7.a.z(12));
            int dimension7 = (int) obtainStyledAttributes.getDimension(R$styleable.SliderView_sliderIndicatorMarginBottom, (float) j7.a.z(12));
            int i14 = obtainStyledAttributes.getInt(R$styleable.SliderView_sliderIndicatorGravity, 81);
            int color = obtainStyledAttributes.getColor(R$styleable.SliderView_sliderIndicatorUnselectedColor, Color.parseColor("#33ffffff"));
            int color2 = obtainStyledAttributes.getColor(R$styleable.SliderView_sliderIndicatorSelectedColor, Color.parseColor("#ffffff"));
            int i15 = obtainStyledAttributes.getInt(R$styleable.SliderView_sliderIndicatorAnimationDuration, 350);
            int i16 = obtainStyledAttributes.getInt(R$styleable.SliderView_sliderIndicatorRtlMode, 1);
            c cVar = c.Auto;
            if (i16 == 0) {
                cVar = c.On;
            } else if (i16 == 1) {
                cVar = c.Off;
            }
            setIndicatorOrientation(bVar);
            setIndicatorRadius(dimension);
            setIndicatorPadding(dimension2);
            setIndicatorMargin(dimension3);
            setIndicatorMarginCustom(dimension4, dimension5, dimension6, dimension7);
            setIndicatorGravity(i14);
            setIndicatorMargins(dimension4, dimension5, dimension6, dimension7);
            setIndicatorUnselectedColor(color);
            setIndicatorSelectedColor(color2);
            setIndicatorAnimationDuration((long) i15);
            setIndicatorRtlMode(cVar);
        }
        obtainStyledAttributes.recycle();
    }

    public final void f() {
        int currentItem = this.f19333n.getCurrentItem();
        int adapterItemsCount = getAdapterItemsCount();
        if (adapterItemsCount > 1) {
            if (this.f19330d == 2) {
                if (!(currentItem % (adapterItemsCount - 1) != 0 || this.f19335p == getAdapterItemsCount() - 1 || this.f19335p == 0)) {
                    this.f19328b = !this.f19328b;
                }
                if (this.f19328b) {
                    this.f19333n.setCurrentItem(currentItem + 1, true);
                } else {
                    this.f19333n.setCurrentItem(currentItem - 1, true);
                }
            }
            if (this.f19330d == 1) {
                this.f19333n.setCurrentItem(currentItem - 1, true);
            }
            if (this.f19330d == 0) {
                this.f19333n.setCurrentItem(currentItem + 1, true);
            }
        }
        this.f19335p = currentItem;
    }

    public int getAutoCycleDirection() {
        return this.f19330d;
    }

    public int getCurrentPagePosition() {
        if (getSliderAdapter() != null) {
            return getSliderPager().getCurrentItem();
        }
        throw new NullPointerException("Adapter not set");
    }

    public int getIndicatorRadius() {
        return this.f19332f.getRadius();
    }

    public int getIndicatorSelectedColor() {
        return this.f19332f.getSelectedColor();
    }

    public int getIndicatorUnselectedColor() {
        return this.f19332f.getUnselectedColor();
    }

    public PageIndicatorView getPagerIndicator() {
        return this.f19332f;
    }

    public int getScrollTimeInMillis() {
        return this.f19331e;
    }

    public int getScrollTimeInSec() {
        return this.f19331e / 1000;
    }

    public l3.a getSliderAdapter() {
        return null;
    }

    public SliderPager getSliderPager() {
        return this.f19333n;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f19329c) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.f19327a.removeCallbacks(this);
            return false;
        } else if (motionEvent.getAction() != 1) {
            return false;
        } else {
            this.f19327a.postDelayed(new a(), 2000);
            return false;
        }
    }

    public final void run() {
        try {
            f();
        } finally {
            if (this.f19329c) {
                this.f19327a.postDelayed(this, (long) this.f19331e);
            }
        }
    }

    public void setAutoCycle(boolean z10) {
        this.f19329c = z10;
    }

    public void setAutoCycleDirection(int i10) {
        this.f19330d = i10;
    }

    public void setCurrentPageListener(b bVar) {
    }

    public void setCurrentPagePosition(int i10) {
        this.f19333n.setCurrentItem(i10, true);
    }

    public void setCustomSliderTransformAnimation(SliderPager.k kVar) {
        this.f19333n.setPageTransformer(false, kVar);
    }

    public void setIndicatorAnimation(f fVar) {
        this.f19332f.setAnimationType(fVar);
    }

    public void setIndicatorAnimationDuration(long j10) {
        this.f19332f.setAnimationDuration(j10);
    }

    public void setIndicatorEnabled(boolean z10) {
        this.f19334o = z10;
        if (this.f19332f == null && z10) {
            d();
        }
    }

    public void setIndicatorGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f19332f.getLayoutParams();
        layoutParams.gravity = i10;
        this.f19332f.setLayoutParams(layoutParams);
    }

    public void setIndicatorMargin(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f19332f.getLayoutParams();
        layoutParams.setMargins(i10, i10, i10, i10);
        this.f19332f.setLayoutParams(layoutParams);
    }

    public void setIndicatorMarginCustom(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f19332f.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.f19332f.setLayoutParams(layoutParams);
    }

    public void setIndicatorMargins(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f19332f.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.f19332f.setLayoutParams(layoutParams);
    }

    public void setIndicatorOrientation(yf.b bVar) {
        this.f19332f.setOrientation(bVar);
    }

    public void setIndicatorPadding(int i10) {
        this.f19332f.setPadding(i10);
    }

    public void setIndicatorRadius(int i10) {
        this.f19332f.setRadius(i10);
    }

    public void setIndicatorRtlMode(c cVar) {
        this.f19332f.setRtlMode(cVar);
    }

    public void setIndicatorSelectedColor(int i10) {
        this.f19332f.setSelectedColor(i10);
    }

    public void setIndicatorUnselectedColor(int i10) {
        this.f19332f.setUnselectedColor(i10);
    }

    public void setIndicatorVisibility(boolean z10) {
        if (z10) {
            this.f19332f.setVisibility(0);
        } else {
            this.f19332f.setVisibility(8);
        }
    }

    public void setInfiniteAdapterEnabled(boolean z10) {
    }

    public void setOffscreenPageLimit(int i10) {
        this.f19333n.setOffscreenPageLimit(i10);
    }

    public void setOnIndicatorClickListener(a.C0315a aVar) {
        this.f19332f.setClickListener(aVar);
    }

    public void setPageIndicatorView(PageIndicatorView pageIndicatorView) {
        this.f19332f = pageIndicatorView;
        d();
    }

    public void setScrollTimeInMillis(int i10) {
        this.f19331e = i10;
    }

    public void setScrollTimeInSec(int i10) {
        this.f19331e = i10 * 1000;
    }

    public void setSliderAdapter(pf.b bVar) {
        this.f19333n.setAdapter(new cg.a());
        throw null;
    }

    public void setSliderAnimationDuration(int i10) {
        this.f19333n.setScrollDuration(i10);
    }

    public void setSliderTransformAnimation(pf.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f19333n.setPageTransformer(false, new dg.a());
                return;
            case 1:
                this.f19333n.setPageTransformer(false, new dg.b());
                return;
            case 2:
                this.f19333n.setPageTransformer(false, new dg.c());
                return;
            case 3:
                this.f19333n.setPageTransformer(false, new d());
                return;
            case 4:
                this.f19333n.setPageTransformer(false, new e());
                return;
            case 5:
                this.f19333n.setPageTransformer(false, new dg.f());
                return;
            case 6:
                this.f19333n.setPageTransformer(false, new g());
                return;
            case 7:
                this.f19333n.setPageTransformer(false, new h());
                return;
            case 8:
                this.f19333n.setPageTransformer(false, new i());
                return;
            case 9:
                this.f19333n.setPageTransformer(false, new j());
                return;
            case 10:
                this.f19333n.setPageTransformer(false, new k());
                return;
            case 11:
                this.f19333n.setPageTransformer(false, new l());
                return;
            case 12:
                this.f19333n.setPageTransformer(false, new m());
                return;
            case 13:
                this.f19333n.setPageTransformer(false, new n());
                return;
            case 14:
                this.f19333n.setPageTransformer(false, new o());
                return;
            case 15:
                this.f19333n.setPageTransformer(false, new p());
                return;
            case 17:
                this.f19333n.setPageTransformer(false, new r());
                return;
            case 18:
                this.f19333n.setPageTransformer(false, new s());
                return;
            case 19:
                this.f19333n.setPageTransformer(false, new t());
                return;
            case 20:
                this.f19333n.setPageTransformer(false, new u());
                return;
            case 21:
                this.f19333n.setPageTransformer(false, new v());
                return;
            default:
                this.f19333n.setPageTransformer(false, new q());
                return;
        }
    }

    public void setSliderAnimationDuration(int i10, Interpolator interpolator) {
        this.f19333n.setScrollDuration(i10, interpolator);
    }

    public void setSliderAdapter(pf.b bVar, boolean z10) {
        if (!z10) {
            this.f19333n.setAdapter(bVar);
        } else {
            setSliderAdapter(bVar);
        }
    }

    public SliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupSlideView(context);
        e(context, attributeSet);
    }

    public SliderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setupSlideView(context);
        e(context, attributeSet);
    }
}
