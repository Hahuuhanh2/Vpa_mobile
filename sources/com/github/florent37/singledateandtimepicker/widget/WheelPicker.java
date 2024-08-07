package com.github.florent37.singledateandtimepicker.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.github.florent37.singledateandtimepicker.R$dimen;
import com.github.florent37.singledateandtimepicker.R$string;
import com.github.florent37.singledateandtimepicker.R$styleable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public abstract class WheelPicker<V> extends View {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a  reason: collision with root package name */
    public a6.a f5156a;

    /* renamed from: a0  reason: collision with root package name */
    public int f5157a0;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5158b;

    /* renamed from: b0  reason: collision with root package name */
    public int f5159b0;

    /* renamed from: c  reason: collision with root package name */
    public V f5160c;

    /* renamed from: c0  reason: collision with root package name */
    public int f5161c0;

    /* renamed from: d  reason: collision with root package name */
    public int f5162d;

    /* renamed from: d0  reason: collision with root package name */
    public int f5163d0;

    /* renamed from: e  reason: collision with root package name */
    public d<V> f5164e;

    /* renamed from: e0  reason: collision with root package name */
    public int f5165e0;

    /* renamed from: f  reason: collision with root package name */
    public Locale f5166f;

    /* renamed from: f0  reason: collision with root package name */
    public int f5167f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f5168g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5169h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f5170i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f5171j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5172k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f5173l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5174m0;

    /* renamed from: n  reason: collision with root package name */
    public Paint f5175n;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f5176n0;

    /* renamed from: o  reason: collision with root package name */
    public Scroller f5177o;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5178o0;

    /* renamed from: p  reason: collision with root package name */
    public VelocityTracker f5179p;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5180p0;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f5181q;

    /* renamed from: q0  reason: collision with root package name */
    public a f5182q0;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f5183r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f5184s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f5185t;

    /* renamed from: u  reason: collision with root package name */
    public final Camera f5186u;

    /* renamed from: v  reason: collision with root package name */
    public final Matrix f5187v;

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f5188w;

    /* renamed from: x  reason: collision with root package name */
    public String f5189x;

    /* renamed from: y  reason: collision with root package name */
    public int f5190y;

    /* renamed from: z  reason: collision with root package name */
    public int f5191z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            int b10;
            d<V> dVar = WheelPicker.this.f5164e;
            if (dVar != null && (b10 = dVar.b()) != 0) {
                if (WheelPicker.this.f5177o.isFinished()) {
                    WheelPicker wheelPicker = WheelPicker.this;
                    if (!wheelPicker.f5180p0) {
                        int i10 = wheelPicker.M;
                        if (i10 != 0) {
                            int i11 = (((-wheelPicker.f5161c0) / i10) + wheelPicker.P) % b10;
                            if (i11 < 0) {
                                i11 += b10;
                            }
                            wheelPicker.Q = i11;
                            V a10 = wheelPicker.f5164e.a(i11);
                            wheelPicker.getClass();
                            wheelPicker.p(i11, a10);
                            WheelPicker.this.getClass();
                        } else {
                            return;
                        }
                    }
                }
                if (WheelPicker.this.f5177o.computeScrollOffset()) {
                    WheelPicker.this.getClass();
                    WheelPicker wheelPicker2 = WheelPicker.this;
                    wheelPicker2.f5161c0 = wheelPicker2.f5177o.getCurrY();
                    WheelPicker wheelPicker3 = WheelPicker.this;
                    int i12 = (((-wheelPicker3.f5161c0) / wheelPicker3.M) + wheelPicker3.P) % b10;
                    wheelPicker3.getClass();
                    WheelPicker wheelPicker4 = WheelPicker.this;
                    wheelPicker4.o(i12, wheelPicker4.f5164e.a(i12));
                    WheelPicker.this.postInvalidate();
                    WheelPicker.this.f5158b.postDelayed(this, 16);
                }
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WheelPicker.this.f5161c0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            WheelPicker.this.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5194a;

        public c(int i10) {
            this.f5194a = i10;
        }

        public final void onAnimationEnd(Animator animator) {
            WheelPicker wheelPicker = WheelPicker.this;
            int i10 = this.f5194a;
            wheelPicker.Q = i10;
            V a10 = wheelPicker.f5164e.a(i10);
            wheelPicker.getClass();
            wheelPicker.p(i10, a10);
        }
    }

    public static class d<V> {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList f5196a;

        public d() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            this.f5196a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        public final V a(int i10) {
            int b10 = b();
            if (b10 == 0) {
                return null;
            }
            return this.f5196a.get((i10 + b10) % b10);
        }

        public final int b() {
            return this.f5196a.size();
        }

        public final String c(int i10) {
            try {
                return String.valueOf(this.f5196a.get(i10));
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    public interface e<PICKER extends WheelPicker, V> {
        void a();

        void b();
    }

    public interface f {
        void a();

        void b();
    }

    public interface g {
        void a();

        void b();

        void c();
    }

    public WheelPicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
        if (this.f5171j0 || this.E != -1) {
            Rect rect = this.f5185t;
            Rect rect2 = this.f5181q;
            int i10 = rect2.left;
            int i11 = this.W;
            int i12 = this.N;
            rect.set(i10, i11 - i12, rect2.right, i11 + i12);
        }
    }

    public final int b(int i10) {
        int i11;
        if (Math.abs(i10) <= this.N) {
            return -i10;
        }
        if (this.f5161c0 < 0) {
            i11 = -this.M;
        } else {
            i11 = this.M;
        }
        return i11 - i10;
    }

    public final void c() {
        int i10 = this.L;
        if (i10 == 1) {
            this.f5157a0 = this.f5181q.left;
        } else if (i10 != 2) {
            this.f5157a0 = this.V;
        } else {
            this.f5157a0 = this.f5181q.right;
        }
        this.f5159b0 = (int) (((float) this.W) - ((this.f5175n.descent() + this.f5175n.ascent()) / 2.0f));
    }

    public final void d() {
        int i10;
        int i11 = this.P;
        int i12 = this.M;
        int i13 = i11 * i12;
        if (this.f5173l0) {
            i10 = Integer.MIN_VALUE;
        } else {
            i10 = ((this.f5164e.b() - 1) * (-i12)) + i13;
        }
        this.R = i10;
        if (this.f5173l0) {
            i13 = Integer.MAX_VALUE;
        }
        this.S = i13;
    }

    public final void e() {
        if (this.f5170i0) {
            int i10 = this.G / 2;
            int i11 = this.W;
            int i12 = this.N;
            int i13 = i11 + i12;
            int i14 = i11 - i12;
            Rect rect = this.f5183r;
            Rect rect2 = this.f5181q;
            rect.set(rect2.left, i13 - i10, rect2.right, i13 + i10);
            Rect rect3 = this.f5184s;
            Rect rect4 = this.f5181q;
            rect3.set(rect4.left, i14 - i10, rect4.right, i14 + i10);
        }
    }

    public final void f() {
        boolean z10;
        this.C = 0;
        this.B = 0;
        if (this.f5169h0) {
            this.B = (int) this.f5175n.measureText(this.f5164e.c(0));
        } else {
            int i10 = this.f5163d0;
            if (i10 < 0 || i10 >= this.f5164e.b()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.B = (int) this.f5175n.measureText(this.f5164e.c(this.f5163d0));
            } else if (!TextUtils.isEmpty(this.f5189x)) {
                this.B = (int) this.f5175n.measureText(this.f5189x);
            } else {
                int b10 = this.f5164e.b();
                for (int i11 = 0; i11 < b10; i11++) {
                    this.B = Math.max(this.B, (int) this.f5175n.measureText(this.f5164e.c(i11)));
                }
            }
        }
        Paint.FontMetrics fontMetrics = this.f5175n.getFontMetrics();
        this.C = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public int g(Date date) {
        int i10;
        String i11 = i(date);
        if (this instanceof WheelDayOfMonthPicker) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(this.f5156a.b());
            instance.setTime(date);
            return instance.get(5) - 1;
        } else if ((this instanceof WheelDayPicker) && i(new Date()).equals(i11)) {
            return getTodayItemPosition();
        } else {
            if (this instanceof WheelMonthPicker) {
                Calendar instance2 = Calendar.getInstance();
                instance2.setTimeZone(this.f5156a.b());
                instance2.setTime(date);
                return instance2.get(2);
            } else if (this instanceof WheelYearPicker) {
                Calendar instance3 = Calendar.getInstance();
                instance3.setTimeZone(this.f5156a.b());
                instance3.setTime(date);
                return instance3.get(1) - ((WheelYearPicker) this).f5198s0;
            } else {
                try {
                    i10 = Integer.parseInt(i11);
                } catch (NumberFormatException unused) {
                    i10 = Integer.MIN_VALUE;
                }
                int b10 = this.f5164e.b();
                int i12 = 0;
                for (int i13 = 0; i13 < b10; i13++) {
                    String c10 = this.f5164e.c(i13);
                    if (i10 != Integer.MIN_VALUE) {
                        int parseInt = Integer.parseInt(c10);
                        if ((this instanceof WheelHourPicker) && ((WheelHourPicker) this).f5146u0) {
                            parseInt %= 12;
                        }
                        if (parseInt <= i10) {
                            i12 = i13;
                        }
                    } else if (i11.equals(c10)) {
                        return i13;
                    }
                }
                return i12;
            }
        }
    }

    public int getCurrentItemPosition() {
        return this.Q;
    }

    @TargetApi(24)
    public Locale getCurrentLocale() {
        Locale locale = this.f5166f;
        if (locale != null) {
            return locale;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return getResources().getConfiguration().getLocales().get(0);
        }
        return getResources().getConfiguration().locale;
    }

    public int getCurtainColor() {
        return this.I;
    }

    public a6.a getDateHelper() {
        return this.f5156a;
    }

    public int getDefaultItemPosition() {
        return this.f5164e.f5196a.indexOf(this.f5160c);
    }

    public int getIndicatorColor() {
        return this.H;
    }

    public int getIndicatorSize() {
        return this.G;
    }

    public int getItemAlign() {
        return this.L;
    }

    public int getItemSpace() {
        return this.J;
    }

    public int getItemTextColor() {
        return this.D;
    }

    public int getItemTextSize() {
        return this.F;
    }

    public String getMaximumWidthText() {
        return this.f5189x;
    }

    public int getMaximumWidthTextPosition() {
        return this.f5163d0;
    }

    public int getSelectedItemPosition() {
        return this.P;
    }

    public int getSelectedItemTextColor() {
        return this.E;
    }

    public boolean getShowOnlyFutureDate() {
        return this.f5176n0;
    }

    public int getTodayItemPosition() {
        ArrayList arrayList = this.f5164e.f5196a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if ((arrayList.get(i10) instanceof b6.a) && ((b6.a) arrayList.get(i10)).f4090a.equals(j(R$string.picker_today))) {
                return i10;
            }
        }
        return 0;
    }

    public Typeface getTypeface() {
        Paint paint = this.f5175n;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f5190y;
    }

    public abstract List<V> h(boolean z10);

    public String i(Object obj) {
        return String.valueOf(obj);
    }

    public final String j(int i10) {
        Context context = getContext();
        Locale currentLocale = getCurrentLocale();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(currentLocale);
        return context.createConfigurationContext(configuration).getString(i10);
    }

    public abstract void k();

    public abstract V l();

    public final void m() {
        if (this.P > this.f5164e.b() - 1 || this.Q > this.f5164e.b() - 1) {
            int b10 = this.f5164e.b() - 1;
            this.Q = b10;
            this.P = b10;
        } else {
            this.P = this.Q;
        }
        this.f5161c0 = 0;
        f();
        d();
        requestLayout();
        postInvalidate();
    }

    public void n() {
    }

    public void o(int i10, V v2) {
        if (this.f5162d != i10) {
            this.f5162d = i10;
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAdapter(this.f5164e);
        setDefault(this.f5160c);
    }

    public final void onDraw(Canvas canvas) {
        String str;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        Canvas canvas2;
        int i13;
        int i14;
        boolean z10;
        Canvas canvas3 = canvas;
        int i15 = this.M;
        int i16 = this.A;
        if (i15 - i16 > 0) {
            int i17 = ((-this.f5161c0) / i15) - i16;
            int i18 = this.P + i17;
            int i19 = -i16;
            while (i18 < this.P + i17 + this.f5191z) {
                if (this.f5173l0) {
                    int b10 = this.f5164e.b();
                    int i20 = i18 % b10;
                    if (i20 < 0) {
                        i20 += b10;
                    }
                    str = this.f5164e.c(i20);
                } else {
                    if (i18 < 0 || i18 >= this.f5164e.b()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        str = this.f5164e.c(i18);
                    } else {
                        str = "";
                    }
                }
                this.f5175n.setColor(this.D);
                this.f5175n.setStyle(Paint.Style.FILL);
                int i21 = this.f5159b0;
                int i22 = this.M;
                int i23 = (this.f5161c0 % i22) + (i19 * i22) + i21;
                if (this.f5174m0) {
                    int abs = i21 - Math.abs(i21 - i23);
                    int i24 = this.f5181q.top;
                    int i25 = this.f5159b0;
                    float f12 = (((float) (abs - i24)) * 1.0f) / ((float) (i25 - i24));
                    if (i23 > i25) {
                        i13 = 1;
                    } else if (i23 < i25) {
                        i13 = -1;
                    } else {
                        i13 = 0;
                    }
                    int i26 = this.K;
                    float f13 = (float) i26;
                    float f14 = (-(1.0f - f12)) * f13 * ((float) i13);
                    float f15 = (float) (-i26);
                    if (f14 < f15) {
                        f13 = f15;
                    } else if (f14 <= f13) {
                        f13 = f14;
                    }
                    f10 = (((float) Math.sin(Math.toRadians((double) f13))) / ((float) Math.sin(Math.toRadians((double) ((float) this.K))))) * ((float) this.O);
                    float f16 = (float) this.V;
                    int i27 = this.L;
                    if (i27 != 1) {
                        if (i27 == 2) {
                            i14 = this.f5181q.right;
                        }
                        float f17 = ((float) this.W) - f10;
                        this.f5186u.save();
                        this.f5186u.rotateX(f13);
                        this.f5186u.getMatrix(this.f5187v);
                        this.f5186u.restore();
                        float f18 = -f16;
                        float f19 = -f17;
                        this.f5187v.preTranslate(f18, f19);
                        this.f5187v.postTranslate(f16, f17);
                        this.f5186u.save();
                        i11 = i19;
                        i12 = i17;
                        i10 = i18;
                        this.f5186u.translate(0.0f, 0.0f, (float) (((double) this.O) - (Math.cos(Math.toRadians((double) ((float) ((int) f13)))) * ((double) this.O))));
                        this.f5186u.getMatrix(this.f5188w);
                        this.f5186u.restore();
                        this.f5188w.preTranslate(f18, f19);
                        this.f5188w.postTranslate(f16, f17);
                        this.f5187v.postConcat(this.f5188w);
                    } else {
                        i14 = this.f5181q.left;
                    }
                    f16 = (float) i14;
                    float f172 = ((float) this.W) - f10;
                    this.f5186u.save();
                    this.f5186u.rotateX(f13);
                    this.f5186u.getMatrix(this.f5187v);
                    this.f5186u.restore();
                    float f182 = -f16;
                    float f192 = -f172;
                    this.f5187v.preTranslate(f182, f192);
                    this.f5187v.postTranslate(f16, f172);
                    this.f5186u.save();
                    i11 = i19;
                    i12 = i17;
                    i10 = i18;
                    this.f5186u.translate(0.0f, 0.0f, (float) (((double) this.O) - (Math.cos(Math.toRadians((double) ((float) ((int) f13)))) * ((double) this.O))));
                    this.f5186u.getMatrix(this.f5188w);
                    this.f5186u.restore();
                    this.f5188w.preTranslate(f182, f192);
                    this.f5188w.postTranslate(f16, f172);
                    this.f5187v.postConcat(this.f5188w);
                } else {
                    i10 = i18;
                    i11 = i19;
                    i12 = i17;
                    f10 = 0.0f;
                }
                if (this.f5172k0) {
                    int i28 = this.f5159b0;
                    int abs2 = (int) (((((float) (i28 - Math.abs(i28 - i23))) * 1.0f) / ((float) this.f5159b0)) * 255.0f);
                    if (abs2 < 0) {
                        abs2 = 0;
                    }
                    this.f5175n.setAlpha(abs2);
                }
                if (this.f5174m0) {
                    f11 = ((float) this.f5159b0) - f10;
                } else {
                    f11 = (float) i23;
                }
                if (this.E != -1) {
                    canvas.save();
                    if (this.f5174m0) {
                        canvas2 = canvas;
                        canvas2.concat(this.f5187v);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.clipRect(this.f5185t, Region.Op.DIFFERENCE);
                    canvas2.drawText(str, (float) this.f5157a0, f11, this.f5175n);
                    canvas.restore();
                    this.f5175n.setColor(this.E);
                    canvas.save();
                    if (this.f5174m0) {
                        canvas2.concat(this.f5187v);
                    }
                    canvas2.clipRect(this.f5185t);
                    canvas2.drawText(str, (float) this.f5157a0, f11, this.f5175n);
                    canvas.restore();
                } else {
                    canvas2 = canvas;
                    canvas.save();
                    canvas2.clipRect(this.f5181q);
                    if (this.f5174m0) {
                        canvas2.concat(this.f5187v);
                    }
                    canvas2.drawText(str, (float) this.f5157a0, f11, this.f5175n);
                    canvas.restore();
                }
                i18 = i10 + 1;
                i17 = i12;
                Canvas canvas4 = canvas2;
                i19 = i11 + 1;
                canvas3 = canvas4;
            }
            Canvas canvas5 = canvas3;
            if (this.f5171j0) {
                this.f5175n.setColor(this.I);
                this.f5175n.setStyle(Paint.Style.FILL);
                canvas5.drawRect(this.f5185t, this.f5175n);
            }
            if (this.f5170i0) {
                this.f5175n.setColor(this.H);
                this.f5175n.setStyle(Paint.Style.FILL);
                canvas5.drawRect(this.f5183r, this.f5175n);
                canvas5.drawRect(this.f5184s, this.f5175n);
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.B;
        int i13 = this.C;
        int i14 = this.f5190y;
        int i15 = ((i14 - 1) * this.J) + (i13 * i14);
        if (this.f5174m0) {
            i15 = (int) ((((double) (((float) Math.sin(Math.toRadians((double) ((float) this.K)))) * 2.0f)) / ((((double) this.K) * 3.141592653589793d) / 90.0d)) * ((double) i15));
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i15;
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(paddingRight, size);
            } else {
                size = paddingRight;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(paddingBottom, size2);
            } else {
                size2 = paddingBottom;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f5181q.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.V = this.f5181q.centerX();
        this.W = this.f5181q.centerY();
        c();
        this.O = this.f5181q.height() / 2;
        int height = this.f5181q.height() / this.f5190y;
        this.M = height;
        this.N = height / 2;
        d();
        e();
        a();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                VelocityTracker velocityTracker = this.f5179p;
                if (velocityTracker == null) {
                    this.f5179p = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f5179p.addMovement(motionEvent);
                if (!this.f5177o.isFinished()) {
                    this.f5177o.abortAnimation();
                    this.f5180p0 = true;
                }
                int y10 = (int) motionEvent.getY();
                this.f5165e0 = y10;
                this.f5167f0 = y10;
            } else if (action == 1) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (!this.f5178o0) {
                    this.f5179p.addMovement(motionEvent);
                    this.f5179p.computeCurrentVelocity(1000, (float) this.U);
                    this.f5180p0 = false;
                    int yVelocity = (int) this.f5179p.getYVelocity();
                    if (Math.abs(yVelocity) > this.T) {
                        this.f5177o.fling(0, this.f5161c0, 0, yVelocity, 0, 0, this.R, this.S);
                        Scroller scroller = this.f5177o;
                        scroller.setFinalY(b(this.f5177o.getFinalY() % this.M) + scroller.getFinalY());
                    } else {
                        Scroller scroller2 = this.f5177o;
                        int i10 = this.f5161c0;
                        scroller2.startScroll(0, i10, 0, b(i10 % this.M));
                    }
                    if (!this.f5173l0) {
                        int finalY = this.f5177o.getFinalY();
                        int i11 = this.S;
                        if (finalY > i11) {
                            this.f5177o.setFinalY(i11);
                        } else {
                            int finalY2 = this.f5177o.getFinalY();
                            int i12 = this.R;
                            if (finalY2 < i12) {
                                this.f5177o.setFinalY(i12);
                            }
                        }
                    }
                    this.f5158b.post(this.f5182q0);
                    VelocityTracker velocityTracker2 = this.f5179p;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f5179p = null;
                    }
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    VelocityTracker velocityTracker3 = this.f5179p;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.f5179p = null;
                    }
                }
            } else if (Math.abs(((float) this.f5167f0) - motionEvent.getY()) >= ((float) this.f5168g0) || b(this.f5177o.getFinalY() % this.M) <= 0) {
                this.f5178o0 = false;
                this.f5179p.addMovement(motionEvent);
                float y11 = motionEvent.getY() - ((float) this.f5165e0);
                if (Math.abs(y11) >= 1.0f) {
                    this.f5161c0 = (int) (((float) this.f5161c0) + y11);
                    this.f5165e0 = (int) motionEvent.getY();
                    invalidate();
                }
            } else {
                this.f5178o0 = true;
            }
        }
        return true;
    }

    public void p(int i10, V v2) {
    }

    public final void q(int i10) {
        int i11 = this.Q;
        if (i10 != i11) {
            int i12 = this.f5161c0;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i12, ((i11 - i10) * this.M) + i12});
            ofInt.setDuration(300);
            ofInt.addUpdateListener(new b());
            ofInt.addListener(new c(i10));
            ofInt.start();
        }
    }

    public final void r() {
        d<V> dVar = this.f5164e;
        List h10 = h(this.f5176n0);
        dVar.f5196a.clear();
        dVar.f5196a.addAll(h10);
        m();
    }

    public final void s() {
        int i10 = this.L;
        if (i10 == 1) {
            this.f5175n.setTextAlign(Paint.Align.LEFT);
        } else if (i10 != 2) {
            this.f5175n.setTextAlign(Paint.Align.CENTER);
        } else {
            this.f5175n.setTextAlign(Paint.Align.RIGHT);
        }
    }

    public void setAdapter(d dVar) {
        this.f5164e = dVar;
        s();
        f();
        m();
    }

    public void setAtmospheric(boolean z10) {
        this.f5172k0 = z10;
        postInvalidate();
    }

    public void setCurtain(boolean z10) {
        this.f5171j0 = z10;
        a();
        postInvalidate();
    }

    public void setCurtainColor(int i10) {
        this.I = i10;
        postInvalidate();
    }

    public void setCurved(boolean z10) {
        this.f5174m0 = z10;
        requestLayout();
        postInvalidate();
    }

    public void setCurvedMaxAngle(int i10) {
        this.K = i10;
        requestLayout();
        postInvalidate();
    }

    public void setCustomLocale(Locale locale) {
        this.f5166f = locale;
    }

    public void setCyclic(boolean z10) {
        this.f5173l0 = z10;
        d();
        invalidate();
    }

    public void setDateHelper(a6.a aVar) {
        this.f5156a = aVar;
    }

    public void setDefault(V v2) {
        this.f5160c = v2;
        setSelectedItemPosition(getDefaultItemPosition());
    }

    public void setDefaultDate(Date date) {
        int g2;
        d<V> dVar = this.f5164e;
        if (dVar != null && dVar.b() > 0 && (g2 = g(date)) >= 0) {
            this.f5160c = this.f5164e.f5196a.get(g2);
            setSelectedItemPosition(g2);
        }
    }

    public void setIndicator(boolean z10) {
        this.f5170i0 = z10;
        e();
        postInvalidate();
    }

    public void setIndicatorColor(int i10) {
        this.H = i10;
        postInvalidate();
    }

    public void setIndicatorSize(int i10) {
        this.G = i10;
        e();
        postInvalidate();
    }

    public void setItemAlign(int i10) {
        this.L = i10;
        s();
        c();
        postInvalidate();
    }

    public void setItemSpace(int i10) {
        this.J = i10;
        requestLayout();
        postInvalidate();
    }

    public void setItemTextColor(int i10) {
        this.D = i10;
        postInvalidate();
    }

    public void setItemTextSize(int i10) {
        if (this.F != i10) {
            this.F = i10;
            this.f5175n.setTextSize((float) i10);
            f();
            requestLayout();
            postInvalidate();
        }
    }

    public void setListener(e eVar) {
    }

    public void setMaximumWidthText(String str) {
        if (str != null) {
            this.f5189x = str;
            f();
            requestLayout();
            postInvalidate();
            return;
        }
        throw new NullPointerException("Maximum width text can not be null!");
    }

    public void setMaximumWidthTextPosition(int i10) {
        boolean z10;
        if (i10 < 0 || i10 >= this.f5164e.b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f5163d0 = i10;
            f();
            requestLayout();
            postInvalidate();
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Maximum width text Position must in [0, ");
        q10.append(this.f5164e.b());
        q10.append("), but current is ");
        q10.append(i10);
        throw new ArrayIndexOutOfBoundsException(q10.toString());
    }

    public void setOnItemSelectedListener(f fVar) {
    }

    public void setOnWheelChangeListener(g gVar) {
    }

    public void setSameWidth(boolean z10) {
        this.f5169h0 = z10;
        f();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i10) {
        int max = Math.max(Math.min(i10, this.f5164e.b() - 1), 0);
        this.P = max;
        this.Q = max;
        this.f5161c0 = 0;
        d();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemTextColor(int i10) {
        this.E = i10;
        a();
        postInvalidate();
    }

    public void setShowOnlyFutureDate(boolean z10) {
        this.f5176n0 = z10;
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f5175n;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        f();
        requestLayout();
        postInvalidate();
    }

    public void setVisibleItemCount(int i10) {
        this.f5190y = i10;
        t();
        requestLayout();
    }

    public final void t() {
        int i10 = this.f5190y;
        if (i10 >= 2) {
            if (i10 % 2 == 0) {
                this.f5190y = i10 + 1;
            }
            int i11 = this.f5190y + 2;
            this.f5191z = i11;
            this.A = i11 / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5156a = new a6.a();
        this.f5158b = new Handler();
        this.f5164e = new d<>();
        this.f5181q = new Rect();
        this.f5183r = new Rect();
        this.f5184s = new Rect();
        this.f5185t = new Rect();
        this.f5186u = new Camera();
        this.f5187v = new Matrix();
        this.f5188w = new Matrix();
        this.K = 90;
        this.T = 50;
        this.U = 8000;
        this.f5168g0 = 8;
        this.f5182q0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelPicker);
        this.F = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_item_text_size, getResources().getDimensionPixelSize(R$dimen.WheelItemTextSize));
        this.f5190y = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_visible_item_count, 7);
        this.P = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_selected_item_position, 0);
        this.f5169h0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_same_width, false);
        int i10 = -1;
        this.f5163d0 = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_maximum_width_text_position, -1);
        this.f5189x = obtainStyledAttributes.getString(R$styleable.WheelPicker_wheel_maximum_width_text);
        this.E = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_selected_item_text_color, -1);
        this.D = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_item_text_color, -7829368);
        this.J = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_item_space, getResources().getDimensionPixelSize(R$dimen.WheelItemSpace));
        this.f5173l0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_cyclic, false);
        this.f5170i0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_indicator, false);
        this.H = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_indicator_color, -1166541);
        this.G = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_indicator_size, getResources().getDimensionPixelSize(R$dimen.WheelIndicatorSize));
        this.f5171j0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_curtain, false);
        this.I = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_curtain_color, -1996488705);
        this.f5172k0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_atmospheric, false);
        this.f5174m0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_curved, false);
        this.L = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_item_align, 0);
        obtainStyledAttributes.recycle();
        t();
        Paint paint = new Paint(69);
        this.f5175n = paint;
        paint.setTextSize((float) this.F);
        this.f5177o = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5168g0 = viewConfiguration.getScaledTouchSlop();
        k();
        this.f5160c = l();
        d<V> dVar = this.f5164e;
        List h10 = h(this.f5176n0);
        dVar.f5196a.clear();
        dVar.f5196a.addAll(h10);
        d<V> dVar2 = this.f5164e;
        V v2 = this.f5160c;
        ArrayList arrayList = dVar2.f5196a;
        i10 = arrayList != null ? arrayList.indexOf(v2) : i10;
        this.Q = i10;
        this.P = i10;
    }
}
