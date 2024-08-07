package com.google.android.material.slider;

import al.g0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.u;
import com.google.android.material.internal.x;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import i8.d;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import l8.h;
import l8.m;
import o1.a;
import w1.d0;
import w1.q0;
import x1.f;
import z.j;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends a<S>, T extends b<S>> extends View {

    /* renamed from: p0  reason: collision with root package name */
    public static final int f6751p0 = R$style.Widget_MaterialComponents_Slider;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f6752q0 = R$attr.motionDurationMedium4;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f6753r0 = R$attr.motionDurationShort3;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f6754s0 = R$attr.motionEasingEmphasizedInterpolator;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f6755t0 = R$attr.motionEasingEmphasizedAccelerateInterpolator;
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
    public float M;
    public MotionEvent N;
    public boolean O;
    public float P;
    public float Q;
    public ArrayList<Float> R;
    public int S;
    public int T;
    public float U;
    public float[] V;
    public boolean W;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f6756a;

    /* renamed from: a0  reason: collision with root package name */
    public int f6757a0;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f6758b;

    /* renamed from: b0  reason: collision with root package name */
    public int f6759b0;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f6760c;

    /* renamed from: c0  reason: collision with root package name */
    public int f6761c0;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f6762d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f6763d0;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f6764e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f6765e0;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f6766f;

    /* renamed from: f0  reason: collision with root package name */
    public ColorStateList f6767f0;

    /* renamed from: g0  reason: collision with root package name */
    public ColorStateList f6768g0;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f6769h0;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f6770i0;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f6771j0;

    /* renamed from: k0  reason: collision with root package name */
    public final h f6772k0;

    /* renamed from: l0  reason: collision with root package name */
    public Drawable f6773l0;

    /* renamed from: m0  reason: collision with root package name */
    public List<Drawable> f6774m0;

    /* renamed from: n  reason: collision with root package name */
    public final c f6775n;

    /* renamed from: n0  reason: collision with root package name */
    public float f6776n0;

    /* renamed from: o  reason: collision with root package name */
    public final AccessibilityManager f6777o;

    /* renamed from: o0  reason: collision with root package name */
    public int f6778o0;

    /* renamed from: p  reason: collision with root package name */
    public BaseSlider<S, L, T>.b f6779p;

    /* renamed from: q  reason: collision with root package name */
    public int f6780q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f6781r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f6782s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f6783t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6784u;

    /* renamed from: v  reason: collision with root package name */
    public ValueAnimator f6785v;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f6786w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6787x;

    /* renamed from: y  reason: collision with root package name */
    public int f6788y;

    /* renamed from: z  reason: collision with root package name */
    public int f6789z;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public float f6790a;

        /* renamed from: b  reason: collision with root package name */
        public float f6791b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Float> f6792c;

        /* renamed from: d  reason: collision with root package name */
        public float f6793d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6794e;

        public class a implements Parcelable.Creator<SliderState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SliderState[i10];
            }
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f6790a);
            parcel.writeFloat(this.f6791b);
            parcel.writeList(this.f6792c);
            parcel.writeFloat(this.f6793d);
            parcel.writeBooleanArray(new boolean[]{this.f6794e});
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f6790a = parcel.readFloat();
            this.f6791b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f6792c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f6793d = parcel.readFloat();
            this.f6794e = parcel.createBooleanArray()[0];
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f6781r.iterator();
            while (it.hasNext()) {
                q8.a aVar = (q8.a) it.next();
                aVar.T = 1.2f;
                aVar.R = floatValue;
                aVar.S = floatValue;
                aVar.U = t7.b.a(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                aVar.invalidateSelf();
            }
            BaseSlider baseSlider = BaseSlider.this;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(baseSlider);
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f6796a = -1;

        public b() {
        }

        public final void run() {
            BaseSlider.this.f6775n.x(this.f6796a, 4);
        }
    }

    public static class c extends c2.a {

        /* renamed from: q  reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f6798q;

        /* renamed from: r  reason: collision with root package name */
        public final Rect f6799r = new Rect();

        public c(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f6798q = baseSlider;
        }

        public final int n(float f10, float f11) {
            for (int i10 = 0; i10 < this.f6798q.getValues().size(); i10++) {
                this.f6798q.r(i10, this.f6799r);
                if (this.f6799r.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        public final void o(ArrayList arrayList) {
            for (int i10 = 0; i10 < this.f6798q.getValues().size(); i10++) {
                arrayList.add(Integer.valueOf(i10));
            }
        }

        public final boolean s(int i10, int i11, Bundle bundle) {
            if (!this.f6798q.isEnabled()) {
                return false;
            }
            if (i11 == 4096 || i11 == 8192) {
                BaseSlider<?, ?, ?> baseSlider = this.f6798q;
                int i12 = BaseSlider.f6751p0;
                float f10 = baseSlider.U;
                if (f10 == 0.0f) {
                    f10 = 1.0f;
                }
                float f11 = (baseSlider.Q - baseSlider.P) / f10;
                float f12 = (float) 20;
                if (f11 > f12) {
                    f10 *= (float) Math.round(f11 / f12);
                }
                if (i11 == 8192) {
                    f10 = -f10;
                }
                if (this.f6798q.i()) {
                    f10 = -f10;
                }
                if (!this.f6798q.q(i10, g0.F(this.f6798q.getValues().get(i10).floatValue() + f10, this.f6798q.getValueFrom(), this.f6798q.getValueTo()))) {
                    return false;
                }
                this.f6798q.s();
                this.f6798q.postInvalidate();
                p(i10);
                return true;
            }
            if (i11 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                float f13 = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                BaseSlider<?, ?, ?> baseSlider2 = this.f6798q;
                int i13 = BaseSlider.f6751p0;
                if (baseSlider2.q(i10, f13)) {
                    this.f6798q.s();
                    this.f6798q.postInvalidate();
                    p(i10);
                    return true;
                }
            }
            return false;
        }

        public final void u(int i10, f fVar) {
            String str;
            fVar.b(f.a.f16875o);
            List<Float> values = this.f6798q.getValues();
            float floatValue = values.get(i10).floatValue();
            float valueFrom = this.f6798q.getValueFrom();
            float valueTo = this.f6798q.getValueTo();
            if (this.f6798q.isEnabled()) {
                if (floatValue > valueFrom) {
                    fVar.a(8192);
                }
                if (floatValue < valueTo) {
                    fVar.a(4096);
                }
            }
            fVar.f16862a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
            fVar.i(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f6798q.getContentDescription() != null) {
                sb2.append(this.f6798q.getContentDescription());
                sb2.append(",");
            }
            String e10 = this.f6798q.e(floatValue);
            String string = this.f6798q.getContext().getString(R$string.material_slider_value);
            if (values.size() > 1) {
                if (i10 == this.f6798q.getValues().size() - 1) {
                    str = this.f6798q.getContext().getString(R$string.material_slider_range_end);
                } else if (i10 == 0) {
                    str = this.f6798q.getContext().getString(R$string.material_slider_range_start);
                } else {
                    str = "";
                }
                string = str;
            }
            sb2.append(String.format(Locale.US, "%s, %s", new Object[]{string, e10}));
            fVar.k(sb2.toString());
            this.f6798q.r(i10, this.f6799r);
            fVar.f16862a.setBoundsInParent(this.f6799r);
        }
    }

    static {
        Class<BaseSlider> cls = BaseSlider.class;
    }

    public BaseSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.R.size() == 1) {
            floatValue2 = this.P;
        }
        float m10 = m(floatValue2);
        float m11 = m(floatValue);
        if (i()) {
            return new float[]{m11, m10};
        }
        return new float[]{m10, m11};
    }

    private float getValueOfTouchPosition() {
        double d10;
        float f10 = this.f6776n0;
        float f11 = this.U;
        if (f11 > 0.0f) {
            int i10 = (int) ((this.Q - this.P) / f11);
            d10 = ((double) Math.round(f10 * ((float) i10))) / ((double) i10);
        } else {
            d10 = (double) f10;
        }
        if (i()) {
            d10 = 1.0d - d10;
        }
        float f12 = this.Q;
        float f13 = this.P;
        return (float) ((d10 * ((double) (f12 - f13))) + ((double) f13));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f10 = this.f6776n0;
        if (i()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.Q;
        float f12 = this.P;
        return android.support.v4.media.a.e(f11, f12, f10, f12);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        d dVar;
        int i10;
        int i11;
        int i12;
        ViewGroup d10;
        int resourceId;
        j e10;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.R.size() != arrayList.size() || !this.R.equals(arrayList)) {
                this.R = arrayList;
                int i13 = 1;
                this.f6765e0 = true;
                this.T = 0;
                s();
                if (this.f6781r.size() > this.R.size()) {
                    List<q8.a> subList = this.f6781r.subList(this.R.size(), this.f6781r.size());
                    for (q8.a aVar : subList) {
                        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                        if (d0.g.b(this) && (e10 = x.e(this)) != null) {
                            ((ViewOverlay) e10.f17753b).remove(aVar);
                            ViewGroup d11 = x.d(this);
                            if (d11 == null) {
                                aVar.getClass();
                            } else {
                                d11.removeOnLayoutChangeListener(aVar.J);
                            }
                        }
                    }
                    subList.clear();
                }
                while (this.f6781r.size() < this.R.size()) {
                    Context context = getContext();
                    int i14 = this.f6780q;
                    q8.a aVar2 = new q8.a(context, i14);
                    TypedArray d12 = u.d(aVar2.G, (AttributeSet) null, R$styleable.Tooltip, 0, i14, new int[0]);
                    aVar2.P = aVar2.G.getResources().getDimensionPixelSize(R$dimen.mtrl_tooltip_arrowSize);
                    m mVar = aVar2.f12778a.f12798a;
                    mVar.getClass();
                    m.a aVar3 = new m.a(mVar);
                    aVar3.f12847k = aVar2.y();
                    aVar2.setShapeAppearanceModel(new m(aVar3));
                    CharSequence text = d12.getText(R$styleable.Tooltip_android_text);
                    if (!TextUtils.equals(aVar2.F, text)) {
                        aVar2.F = text;
                        aVar2.I.f6498e = true;
                        aVar2.invalidateSelf();
                    }
                    Context context2 = aVar2.G;
                    int i15 = R$styleable.Tooltip_android_textAppearance;
                    if (!d12.hasValue(i15) || (resourceId = d12.getResourceId(i15, 0)) == 0) {
                        dVar = null;
                    } else {
                        dVar = new d(context2, resourceId);
                    }
                    if (dVar != null) {
                        int i16 = R$styleable.Tooltip_android_textColor;
                        if (d12.hasValue(i16)) {
                            dVar.f11205j = i8.c.a(aVar2.G, d12, i16);
                        }
                    }
                    aVar2.I.c(dVar, aVar2.G);
                    Context context3 = aVar2.G;
                    TypedValue c10 = i8.b.c(R$attr.colorOnBackground, context3, q8.a.class.getCanonicalName());
                    int i17 = c10.resourceId;
                    if (i17 != 0) {
                        i10 = k1.a.getColor(context3, i17);
                    } else {
                        i10 = c10.data;
                    }
                    Context context4 = aVar2.G;
                    TypedValue c11 = i8.b.c(16842801, context4, q8.a.class.getCanonicalName());
                    int i18 = c11.resourceId;
                    if (i18 != 0) {
                        i11 = k1.a.getColor(context4, i18);
                    } else {
                        i11 = c11.data;
                    }
                    aVar2.n(ColorStateList.valueOf(d12.getColor(R$styleable.Tooltip_backgroundTint, n1.d.c(n1.d.d(i10, 153), n1.d.d(i11, 229)))));
                    Context context5 = aVar2.G;
                    TypedValue c12 = i8.b.c(R$attr.colorSurface, context5, q8.a.class.getCanonicalName());
                    int i19 = c12.resourceId;
                    if (i19 != 0) {
                        i12 = k1.a.getColor(context5, i19);
                    } else {
                        i12 = c12.data;
                    }
                    aVar2.s(ColorStateList.valueOf(i12));
                    aVar2.L = d12.getDimensionPixelSize(R$styleable.Tooltip_android_padding, 0);
                    aVar2.M = d12.getDimensionPixelSize(R$styleable.Tooltip_android_minWidth, 0);
                    aVar2.N = d12.getDimensionPixelSize(R$styleable.Tooltip_android_minHeight, 0);
                    aVar2.O = d12.getDimensionPixelSize(R$styleable.Tooltip_android_layout_margin, 0);
                    d12.recycle();
                    this.f6781r.add(aVar2);
                    WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                    if (d0.g.b(this) && (d10 = x.d(this)) != null) {
                        int[] iArr = new int[2];
                        d10.getLocationOnScreen(iArr);
                        aVar2.Q = iArr[0];
                        d10.getWindowVisibleDisplayFrame(aVar2.K);
                        d10.addOnLayoutChangeListener(aVar2.J);
                    }
                }
                if (this.f6781r.size() == 1) {
                    i13 = 0;
                }
                Iterator it = this.f6781r.iterator();
                while (it.hasNext()) {
                    ((q8.a) it.next()).t((float) i13);
                }
                Iterator it2 = this.f6782s.iterator();
                while (it2.hasNext()) {
                    a aVar4 = (a) it2.next();
                    Iterator<Float> it3 = this.R.iterator();
                    while (it3.hasNext()) {
                        it3.next().floatValue();
                        aVar4.a();
                    }
                }
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public final void a(Drawable drawable) {
        int i10 = this.J * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i10, i10);
            return;
        }
        float max = ((float) i10) / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        drawable.setBounds(0, 0, (int) (((float) intrinsicWidth) * max), (int) (((float) intrinsicHeight) * max));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2 != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r5 = this;
            int r0 = r5.F
            int r0 = r0 / 2
            int r1 = r5.G
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0011
            r4 = 3
            if (r1 != r4) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = r3
        L_0x000f:
            if (r2 == 0) goto L_0x001d
        L_0x0011:
            java.util.ArrayList r1 = r5.f6781r
            java.lang.Object r1 = r1.get(r3)
            q8.a r1 = (q8.a) r1
            int r3 = r1.getIntrinsicHeight()
        L_0x001d:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.b():int");
    }

    public final ValueAnimator c(boolean z10) {
        float f10;
        ValueAnimator valueAnimator;
        int i10;
        TimeInterpolator timeInterpolator;
        float f11 = 0.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            valueAnimator = this.f6786w;
        } else {
            valueAnimator = this.f6785v;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, f11});
        if (z10) {
            i10 = f8.j.c(getContext(), f6752q0, 83);
            timeInterpolator = f8.j.d(getContext(), f6754s0, t7.b.f14889e);
        } else {
            i10 = f8.j.c(getContext(), f6753r0, 117);
            timeInterpolator = f8.j.d(getContext(), f6755t0, t7.b.f14887c);
        }
        ofFloat.setDuration((long) i10);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new a());
        return ofFloat;
    }

    public final void d(Canvas canvas, int i10, int i11, float f10, Drawable drawable) {
        canvas.save();
        canvas.translate(((float) (this.I + ((int) (m(f10) * ((float) i10))))) - (((float) drawable.getBounds().width()) / 2.0f), ((float) i11) - (((float) drawable.getBounds().height()) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f6775n.m(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f6756a.setColor(f(this.f6771j0));
        this.f6758b.setColor(f(this.f6770i0));
        this.f6764e.setColor(f(this.f6769h0));
        this.f6766f.setColor(f(this.f6768g0));
        Iterator it = this.f6781r.iterator();
        while (it.hasNext()) {
            q8.a aVar = (q8.a) it.next();
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.f6772k0.isStateful()) {
            this.f6772k0.setState(getDrawableState());
        }
        this.f6762d.setColor(f(this.f6767f0));
        this.f6762d.setAlpha(63);
    }

    public final String e(float f10) {
        String str;
        if (((float) ((int) f10)) == f10) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, new Object[]{Float.valueOf(f10)});
    }

    public final int f(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean g(float f10) {
        double doubleValue = new BigDecimal(Float.toString(f10)).divide(new BigDecimal(Float.toString(this.U)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f6775n.f4521k;
    }

    public int getActiveThumbIndex() {
        return this.S;
    }

    public int getFocusedThumbIndex() {
        return this.T;
    }

    public int getHaloRadius() {
        return this.K;
    }

    public ColorStateList getHaloTintList() {
        return this.f6767f0;
    }

    public int getLabelBehavior() {
        return this.G;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.U;
    }

    public float getThumbElevation() {
        return this.f6772k0.f12778a.f12811n;
    }

    public int getThumbRadius() {
        return this.J;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f6772k0.f12778a.f12801d;
    }

    public float getThumbStrokeWidth() {
        return this.f6772k0.f12778a.f12808k;
    }

    public ColorStateList getThumbTintList() {
        return this.f6772k0.f12778a.f12800c;
    }

    public int getTickActiveRadius() {
        return this.f6757a0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f6768g0;
    }

    public int getTickInactiveRadius() {
        return this.f6759b0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f6769h0;
    }

    public ColorStateList getTickTintList() {
        if (this.f6769h0.equals(this.f6768g0)) {
            return this.f6768g0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f6770i0;
    }

    public int getTrackHeight() {
        return this.H;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f6771j0;
    }

    public int getTrackSidePadding() {
        return this.I;
    }

    public ColorStateList getTrackTintList() {
        if (this.f6771j0.equals(this.f6770i0)) {
            return this.f6770i0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f6761c0;
    }

    public float getValueFrom() {
        return this.P;
    }

    public float getValueTo() {
        return this.Q;
    }

    public List<Float> getValues() {
        return new ArrayList(this.R);
    }

    public final boolean h(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (motionEvent.getToolType(0) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                z11 = false;
                break;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && viewGroup.shouldDelayChildPressedState()) {
                z11 = true;
                break;
            }
            parent = parent.getParent();
        }
        if (z11) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(this) == 1) {
            return true;
        }
        return false;
    }

    public final void j() {
        if (this.U > 0.0f) {
            u();
            int min = Math.min((int) (((this.Q - this.P) / this.U) + 1.0f), (this.f6761c0 / (this.H * 2)) + 1);
            float[] fArr = this.V;
            if (fArr == null || fArr.length != min * 2) {
                this.V = new float[(min * 2)];
            }
            float f10 = ((float) this.f6761c0) / ((float) (min - 1));
            for (int i10 = 0; i10 < min * 2; i10 += 2) {
                float[] fArr2 = this.V;
                fArr2[i10] = ((((float) i10) / 2.0f) * f10) + ((float) this.I);
                fArr2[i10 + 1] = (float) b();
            }
        }
    }

    public final boolean k(int i10) {
        int i11 = this.T;
        long j10 = ((long) i11) + ((long) i10);
        long size = (long) (this.R.size() - 1);
        if (j10 < 0) {
            j10 = 0;
        } else if (j10 > size) {
            j10 = size;
        }
        int i12 = (int) j10;
        this.T = i12;
        if (i12 == i11) {
            return false;
        }
        if (this.S != -1) {
            this.S = i12;
        }
        s();
        postInvalidate();
        return true;
    }

    public final void l(int i10) {
        if (i()) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = -i10;
            }
        }
        k(i10);
    }

    public final float m(float f10) {
        float f11 = this.P;
        float f12 = (f10 - f11) / (this.Q - f11);
        if (i()) {
            return 1.0f - f12;
        }
        return f12;
    }

    public final void n() {
        Iterator it = this.f6783t.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
    }

    public boolean o() {
        boolean z10;
        if (this.S != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float m10 = (m(valueOfTouchPositionAbsolute) * ((float) this.f6761c0)) + ((float) this.I);
        this.S = 0;
        float abs = Math.abs(this.R.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.R.size(); i10++) {
            float abs2 = Math.abs(this.R.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float m11 = (m(this.R.get(i10).floatValue()) * ((float) this.f6761c0)) + ((float) this.I);
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!i() ? m11 - m10 >= 0.0f : m11 - m10 <= 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.S = i10;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(m11 - m10) < ((float) this.f6787x)) {
                    this.S = -1;
                    return false;
                } else if (z10) {
                    this.S = i10;
                }
            }
            abs = abs2;
        }
        if (this.S != -1) {
            return true;
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f6781r.iterator();
        while (it.hasNext()) {
            q8.a aVar = (q8.a) it.next();
            ViewGroup d10 = x.d(this);
            if (d10 == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                d10.getLocationOnScreen(iArr);
                aVar.Q = iArr[0];
                d10.getWindowVisibleDisplayFrame(aVar.K);
                d10.addOnLayoutChangeListener(aVar.J);
            }
        }
    }

    public final void onDetachedFromWindow() {
        BaseSlider<S, L, T>.b bVar = this.f6779p;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.f6784u = false;
        Iterator it = this.f6781r.iterator();
        while (it.hasNext()) {
            q8.a aVar = (q8.a) it.next();
            j e10 = x.e(this);
            if (e10 != null) {
                ((ViewOverlay) e10.f17753b).remove(aVar);
                ViewGroup d10 = x.d(this);
                if (d10 == null) {
                    aVar.getClass();
                } else {
                    d10.removeOnLayoutChangeListener(aVar.J);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011f, code lost:
        if (r2 != false) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            boolean r0 = r14.f6765e0
            if (r0 == 0) goto L_0x000a
            r14.u()
            r14.j()
        L_0x000a:
            super.onDraw(r15)
            int r0 = r14.b()
            int r1 = r14.f6761c0
            float[] r2 = r14.getActiveRange()
            int r3 = r14.I
            float r4 = (float) r3
            r5 = 1
            r6 = r2[r5]
            float r7 = (float) r1
            float r6 = r6 * r7
            float r9 = r6 + r4
            int r3 = r3 + r1
            float r11 = (float) r3
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x002f
            float r12 = (float) r0
            android.graphics.Paint r13 = r14.f6756a
            r8 = r15
            r10 = r12
            r8.drawLine(r9, r10, r11, r12, r13)
        L_0x002f:
            int r1 = r14.I
            float r9 = (float) r1
            r1 = 0
            r2 = r2[r1]
            float r2 = r2 * r7
            float r11 = r2 + r9
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0044
            float r12 = (float) r0
            android.graphics.Paint r13 = r14.f6756a
            r8 = r15
            r10 = r12
            r8.drawLine(r9, r10, r11, r12, r13)
        L_0x0044:
            java.util.List r2 = r14.getValues()
            java.lang.Object r2 = java.util.Collections.max(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r3 = r14.P
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0074
            int r2 = r14.f6761c0
            float[] r3 = r14.getActiveRange()
            int r4 = r14.I
            float r4 = (float) r4
            r6 = r3[r5]
            float r2 = (float) r2
            float r6 = r6 * r2
            float r10 = r6 + r4
            r3 = r3[r1]
            float r3 = r3 * r2
            float r8 = r3 + r4
            float r11 = (float) r0
            android.graphics.Paint r12 = r14.f6758b
            r7 = r15
            r9 = r11
            r7.drawLine(r8, r9, r10, r11, r12)
        L_0x0074:
            boolean r2 = r14.W
            r3 = -1
            r4 = 2
            if (r2 == 0) goto L_0x00bb
            float r2 = r14.U
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0082
            goto L_0x00bb
        L_0x0082:
            float[] r2 = r14.getActiveRange()
            float[] r6 = r14.V
            r7 = r2[r1]
            int r6 = r6.length
            int r6 = r6 / r4
            int r6 = r6 + r3
            float r6 = (float) r6
            float r7 = r7 * r6
            int r6 = java.lang.Math.round(r7)
            float[] r7 = r14.V
            r2 = r2[r5]
            int r7 = r7.length
            int r7 = r7 / r4
            int r7 = r7 + r3
            float r7 = (float) r7
            float r2 = r2 * r7
            int r2 = java.lang.Math.round(r2)
            float[] r7 = r14.V
            int r6 = r6 * r4
            android.graphics.Paint r8 = r14.f6764e
            r15.drawPoints(r7, r1, r6, r8)
            float[] r7 = r14.V
            int r2 = r2 * r4
            int r8 = r2 - r6
            android.graphics.Paint r9 = r14.f6766f
            r15.drawPoints(r7, r6, r8, r9)
            float[] r6 = r14.V
            int r7 = r6.length
            int r7 = r7 - r2
            android.graphics.Paint r8 = r14.f6764e
            r15.drawPoints(r6, r2, r7, r8)
        L_0x00bb:
            boolean r2 = r14.O
            if (r2 != 0) goto L_0x00c5
            boolean r2 = r14.isFocused()
            if (r2 == 0) goto L_0x0112
        L_0x00c5:
            boolean r2 = r14.isEnabled()
            if (r2 == 0) goto L_0x0112
            int r2 = r14.f6761c0
            android.graphics.drawable.Drawable r6 = r14.getBackground()
            boolean r6 = r6 instanceof android.graphics.drawable.RippleDrawable
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x0112
            int r6 = r14.I
            float r6 = (float) r6
            java.util.ArrayList<java.lang.Float> r7 = r14.R
            int r8 = r14.T
            java.lang.Object r7 = r7.get(r8)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            float r7 = r14.m(r7)
            float r2 = (float) r2
            float r7 = r7 * r2
            float r7 = r7 + r6
            int r2 = (int) r7
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r6 >= r7) goto L_0x0108
            int r6 = r14.K
            int r7 = r2 - r6
            float r9 = (float) r7
            int r7 = r0 - r6
            float r10 = (float) r7
            int r7 = r2 + r6
            float r11 = (float) r7
            int r6 = r6 + r0
            float r12 = (float) r6
            android.graphics.Region$Op r13 = android.graphics.Region.Op.UNION
            r8 = r15
            r8.clipRect(r9, r10, r11, r12, r13)
        L_0x0108:
            float r2 = (float) r2
            float r6 = (float) r0
            int r7 = r14.K
            float r7 = (float) r7
            android.graphics.Paint r8 = r14.f6762d
            r15.drawCircle(r2, r6, r7, r8)
        L_0x0112:
            int r2 = r14.S
            r6 = 0
            if (r2 != r3) goto L_0x0121
            int r2 = r14.G
            r3 = 3
            if (r2 != r3) goto L_0x011e
            r2 = r5
            goto L_0x011f
        L_0x011e:
            r2 = r1
        L_0x011f:
            if (r2 == 0) goto L_0x01b4
        L_0x0121:
            boolean r2 = r14.isEnabled()
            if (r2 == 0) goto L_0x01b4
            int r2 = r14.G
            if (r2 != r4) goto L_0x012d
            goto L_0x01cf
        L_0x012d:
            boolean r2 = r14.f6784u
            if (r2 != 0) goto L_0x013e
            r14.f6784u = r5
            android.animation.ValueAnimator r2 = r14.c(r5)
            r14.f6785v = r2
            r14.f6786w = r6
            r2.start()
        L_0x013e:
            java.util.ArrayList r2 = r14.f6781r
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L_0x0145:
            java.util.ArrayList<java.lang.Float> r6 = r14.R
            int r6 = r6.size()
            if (r3 >= r6) goto L_0x0170
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0170
            int r6 = r14.T
            if (r3 != r6) goto L_0x0158
            goto L_0x016d
        L_0x0158:
            java.lang.Object r6 = r2.next()
            q8.a r6 = (q8.a) r6
            java.util.ArrayList<java.lang.Float> r7 = r14.R
            java.lang.Object r7 = r7.get(r3)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r14.p(r6, r7)
        L_0x016d:
            int r3 = r3 + 1
            goto L_0x0145
        L_0x0170:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018e
            java.lang.Object r2 = r2.next()
            q8.a r2 = (q8.a) r2
            java.util.ArrayList<java.lang.Float> r3 = r14.R
            int r4 = r14.T
            java.lang.Object r3 = r3.get(r4)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r14.p(r2, r3)
            goto L_0x01cf
        L_0x018e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.util.ArrayList r2 = r14.f6781r
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.util.ArrayList<java.lang.Float> r1 = r14.R
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r5] = r1
            java.lang.String r1 = "Not enough labels(%d) to display all the values(%d)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x01b4:
            boolean r2 = r14.f6784u
            if (r2 == 0) goto L_0x01cf
            r14.f6784u = r1
            android.animation.ValueAnimator r2 = r14.c(r1)
            r14.f6786w = r2
            r14.f6785v = r6
            com.google.android.material.slider.c r3 = new com.google.android.material.slider.c
            r3.<init>(r14)
            r2.addListener(r3)
            android.animation.ValueAnimator r2 = r14.f6786w
            r2.start()
        L_0x01cf:
            int r7 = r14.f6761c0
            r8 = r1
        L_0x01d2:
            java.util.ArrayList<java.lang.Float> r1 = r14.R
            int r1 = r1.size()
            if (r8 >= r1) goto L_0x0230
            java.util.ArrayList<java.lang.Float> r1 = r14.R
            java.lang.Object r1 = r1.get(r8)
            java.lang.Float r1 = (java.lang.Float) r1
            float r5 = r1.floatValue()
            android.graphics.drawable.Drawable r6 = r14.f6773l0
            if (r6 == 0) goto L_0x01f2
            r1 = r14
            r2 = r15
            r3 = r7
            r4 = r0
            r1.d(r2, r3, r4, r5, r6)
            goto L_0x022d
        L_0x01f2:
            java.util.List<android.graphics.drawable.Drawable> r1 = r14.f6774m0
            int r1 = r1.size()
            if (r8 >= r1) goto L_0x020b
            java.util.List<android.graphics.drawable.Drawable> r1 = r14.f6774m0
            java.lang.Object r1 = r1.get(r8)
            r6 = r1
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r1 = r14
            r2 = r15
            r3 = r7
            r4 = r0
            r1.d(r2, r3, r4, r5, r6)
            goto L_0x022d
        L_0x020b:
            boolean r1 = r14.isEnabled()
            if (r1 != 0) goto L_0x0224
            int r1 = r14.I
            float r1 = (float) r1
            float r2 = r14.m(r5)
            float r3 = (float) r7
            float r2 = r2 * r3
            float r2 = r2 + r1
            float r1 = (float) r0
            int r3 = r14.J
            float r3 = (float) r3
            android.graphics.Paint r4 = r14.f6760c
            r15.drawCircle(r2, r1, r3, r4)
        L_0x0224:
            l8.h r6 = r14.f6772k0
            r1 = r14
            r2 = r15
            r3 = r7
            r4 = r0
            r1.d(r2, r3, r4, r5, r6)
        L_0x022d:
            int r8 = r8 + 1
            goto L_0x01d2
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onDraw(android.graphics.Canvas):void");
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!z10) {
            this.S = -1;
            this.f6775n.j(this.T);
            return;
        }
        if (i10 == 1) {
            k(Integer.MAX_VALUE);
        } else if (i10 == 2) {
            k(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            l(Integer.MAX_VALUE);
        } else if (i10 == 66) {
            l(Integer.MIN_VALUE);
        }
        this.f6775n.w(this.T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r13.isEnabled()
            if (r0 != 0) goto L_0x000b
            boolean r14 = super.onKeyDown(r14, r15)
            return r14
        L_0x000b:
            java.util.ArrayList<java.lang.Float> r0 = r13.R
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0017
            r13.S = r1
        L_0x0017:
            int r0 = r13.S
            r3 = 66
            r4 = 61
            r5 = 0
            r6 = 81
            r7 = 70
            r8 = 69
            r9 = -1
            if (r0 != r9) goto L_0x0083
            if (r14 == r4) goto L_0x0057
            if (r14 == r3) goto L_0x004d
            if (r14 == r6) goto L_0x0047
            if (r14 == r8) goto L_0x0041
            if (r14 == r7) goto L_0x0047
            switch(r14) {
                case 21: goto L_0x003b;
                case 22: goto L_0x0035;
                case 23: goto L_0x004d;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0077
        L_0x0035:
            r13.l(r2)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x003b:
            r13.l(r9)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0041:
            r13.k(r9)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0047:
            r13.k(r2)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x004d:
            int r0 = r13.T
            r13.S = r0
            r13.postInvalidate()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0057:
            boolean r0 = r15.hasNoModifiers()
            if (r0 == 0) goto L_0x0066
            boolean r0 = r13.k(r2)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            goto L_0x0077
        L_0x0066:
            boolean r0 = r15.isShiftPressed()
            if (r0 == 0) goto L_0x0075
            boolean r0 = r13.k(r9)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            goto L_0x0077
        L_0x0075:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L_0x0077:
            if (r5 == 0) goto L_0x007e
            boolean r14 = r5.booleanValue()
            goto L_0x0082
        L_0x007e:
            boolean r14 = super.onKeyDown(r14, r15)
        L_0x0082:
            return r14
        L_0x0083:
            boolean r0 = r13.f6763d0
            boolean r10 = r15.isLongPress()
            r0 = r0 | r10
            r13.f6763d0 = r0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r0 == 0) goto L_0x00af
            float r0 = r13.U
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r10 = r0
        L_0x0099:
            float r0 = r13.Q
            float r11 = r13.P
            float r0 = r0 - r11
            float r0 = r0 / r10
            r11 = 20
            float r11 = (float) r11
            int r12 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r12 > 0) goto L_0x00a7
            goto L_0x00b7
        L_0x00a7:
            float r0 = r0 / r11
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r10 = r10 * r0
            goto L_0x00b7
        L_0x00af:
            float r0 = r13.U
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r10 = r0
        L_0x00b7:
            r0 = 21
            if (r14 == r0) goto L_0x00dd
            r0 = 22
            if (r14 == r0) goto L_0x00d1
            if (r14 == r8) goto L_0x00cb
            if (r14 == r7) goto L_0x00c6
            if (r14 == r6) goto L_0x00c6
            goto L_0x00e9
        L_0x00c6:
            java.lang.Float r5 = java.lang.Float.valueOf(r10)
            goto L_0x00e9
        L_0x00cb:
            float r0 = -r10
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            goto L_0x00e9
        L_0x00d1:
            boolean r0 = r13.i()
            if (r0 == 0) goto L_0x00d8
            float r10 = -r10
        L_0x00d8:
            java.lang.Float r5 = java.lang.Float.valueOf(r10)
            goto L_0x00e9
        L_0x00dd:
            boolean r0 = r13.i()
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            float r10 = -r10
        L_0x00e5:
            java.lang.Float r5 = java.lang.Float.valueOf(r10)
        L_0x00e9:
            if (r5 == 0) goto L_0x010d
            java.util.ArrayList<java.lang.Float> r14 = r13.R
            int r15 = r13.S
            java.lang.Object r14 = r14.get(r15)
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            float r15 = r5.floatValue()
            float r15 = r15 + r14
            int r14 = r13.S
            boolean r14 = r13.q(r14, r15)
            if (r14 == 0) goto L_0x010c
            r13.s()
            r13.postInvalidate()
        L_0x010c:
            return r2
        L_0x010d:
            r0 = 23
            if (r14 == r0) goto L_0x0131
            if (r14 == r4) goto L_0x011a
            if (r14 == r3) goto L_0x0131
            boolean r14 = super.onKeyDown(r14, r15)
            return r14
        L_0x011a:
            boolean r14 = r15.hasNoModifiers()
            if (r14 == 0) goto L_0x0125
            boolean r14 = r13.k(r2)
            return r14
        L_0x0125:
            boolean r14 = r15.isShiftPressed()
            if (r14 == 0) goto L_0x0130
            boolean r14 = r13.k(r9)
            return r14
        L_0x0130:
            return r1
        L_0x0131:
            r13.S = r9
            r13.postInvalidate()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.f6763d0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r6 = r4.F
            int r0 = r4.G
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x000f
            r3 = 3
            if (r0 != r3) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            if (r1 == 0) goto L_0x001b
        L_0x000f:
            java.util.ArrayList r0 = r4.f6781r
            java.lang.Object r0 = r0.get(r2)
            q8.a r0 = (q8.a) r0
            int r2 = r0.getIntrinsicHeight()
        L_0x001b:
            int r6 = r6 + r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.P = sliderState.f6790a;
        this.Q = sliderState.f6791b;
        setValuesInternal(sliderState.f6792c);
        this.U = sliderState.f6793d;
        if (sliderState.f6794e) {
            requestFocus();
        }
    }

    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f6790a = this.P;
        sliderState.f6791b = this.Q;
        sliderState.f6792c = new ArrayList<>(this.R);
        sliderState.f6793d = this.U;
        sliderState.f6794e = hasFocus();
        return sliderState;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f6761c0 = Math.max(i10 - (this.I * 2), 0);
        j();
        s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r2 != 3) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            float r0 = r6.getX()
            int r2 = r5.I
            float r2 = (float) r2
            float r2 = r0 - r2
            int r3 = r5.f6761c0
            float r3 = (float) r3
            float r2 = r2 / r3
            r5.f6776n0 = r2
            r3 = 0
            float r2 = java.lang.Math.max(r3, r2)
            r5.f6776n0 = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            r5.f6776n0 = r2
            int r2 = r6.getActionMasked()
            r3 = 1
            if (r2 == 0) goto L_0x00e3
            if (r2 == r3) goto L_0x0075
            r4 = 2
            if (r2 == r4) goto L_0x0037
            r0 = 3
            if (r2 == r0) goto L_0x0075
            goto L_0x0111
        L_0x0037:
            boolean r2 = r5.O
            if (r2 != 0) goto L_0x005a
            boolean r2 = r5.h(r6)
            if (r2 == 0) goto L_0x0050
            float r2 = r5.M
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r5.f6787x
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0050
            return r1
        L_0x0050:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            r5.n()
        L_0x005a:
            boolean r0 = r5.o()
            if (r0 != 0) goto L_0x0062
            goto L_0x0111
        L_0x0062:
            r5.O = r3
            float r0 = r5.getValueOfTouchPosition()
            int r1 = r5.S
            r5.q(r1, r0)
            r5.s()
            r5.invalidate()
            goto L_0x0111
        L_0x0075:
            r5.O = r1
            android.view.MotionEvent r0 = r5.N
            if (r0 == 0) goto L_0x00b6
            int r0 = r0.getActionMasked()
            if (r0 != 0) goto L_0x00b6
            android.view.MotionEvent r0 = r5.N
            float r0 = r0.getX()
            float r1 = r6.getX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r5.f6787x
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b6
            android.view.MotionEvent r0 = r5.N
            float r0 = r0.getY()
            float r1 = r6.getY()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r5.f6787x
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b6
            boolean r0 = r5.o()
            if (r0 == 0) goto L_0x00b6
            r5.n()
        L_0x00b6:
            int r0 = r5.S
            r1 = -1
            if (r0 == r1) goto L_0x00df
            float r0 = r5.getValueOfTouchPosition()
            int r2 = r5.S
            r5.q(r2, r0)
            r5.s()
            r5.S = r1
            java.util.ArrayList r0 = r5.f6783t
            java.util.Iterator r0 = r0.iterator()
        L_0x00cf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00df
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.b r1 = (com.google.android.material.slider.b) r1
            r1.a()
            goto L_0x00cf
        L_0x00df:
            r5.invalidate()
            goto L_0x0111
        L_0x00e3:
            r5.M = r0
            boolean r0 = r5.h(r6)
            if (r0 == 0) goto L_0x00ec
            goto L_0x0111
        L_0x00ec:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            boolean r0 = r5.o()
            if (r0 != 0) goto L_0x00fa
            goto L_0x0111
        L_0x00fa:
            r5.requestFocus()
            r5.O = r3
            float r0 = r5.getValueOfTouchPosition()
            int r1 = r5.S
            r5.q(r1, r0)
            r5.s()
            r5.invalidate()
            r5.n()
        L_0x0111:
            boolean r0 = r5.O
            r5.setPressed(r0)
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r6)
            r5.N = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onVisibilityChanged(View view, int i10) {
        j e10;
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 && (e10 = x.e(this)) != null) {
            Iterator it = this.f6781r.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) e10.f17753b).remove((q8.a) it.next());
            }
        }
    }

    public final void p(q8.a aVar, float f10) {
        String e10 = e(f10);
        if (!TextUtils.equals(aVar.F, e10)) {
            aVar.F = e10;
            aVar.I.f6498e = true;
            aVar.invalidateSelf();
        }
        int m10 = (this.I + ((int) (m(f10) * ((float) this.f6761c0)))) - (aVar.getIntrinsicWidth() / 2);
        int b10 = b() - (this.L + this.J);
        aVar.setBounds(m10, b10 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + m10, b10);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.d.c(x.d(this), this, rect);
        aVar.setBounds(rect);
        ((ViewOverlay) x.e(this).f17753b).add(aVar);
    }

    public final boolean q(int i10, float f10) {
        float f11;
        float f12;
        this.T = i10;
        if (((double) Math.abs(f10 - this.R.get(i10).floatValue())) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f6778o0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f13 = (minSeparation - ((float) this.I)) / ((float) this.f6761c0);
                float f14 = this.P;
                minSeparation = android.support.v4.media.a.e(f14, this.Q, f13, f14);
            }
        }
        if (i()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        if (i11 >= this.R.size()) {
            f11 = this.Q;
        } else {
            f11 = this.R.get(i11).floatValue() - minSeparation;
        }
        int i12 = i10 - 1;
        if (i12 < 0) {
            f12 = this.P;
        } else {
            f12 = minSeparation + this.R.get(i12).floatValue();
        }
        this.R.set(i10, Float.valueOf(g0.F(f10, f12, f11)));
        Iterator it = this.f6782s.iterator();
        while (it.hasNext()) {
            this.R.get(i10).floatValue();
            ((a) it.next()).a();
        }
        AccessibilityManager accessibilityManager = this.f6777o;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        BaseSlider<S, L, T>.b bVar = this.f6779p;
        if (bVar == null) {
            this.f6779p = new b();
        } else {
            removeCallbacks(bVar);
        }
        BaseSlider<S, L, T>.b bVar2 = this.f6779p;
        bVar2.f6796a = i10;
        postDelayed(bVar2, 200);
        return true;
    }

    public final void r(int i10, Rect rect) {
        int m10 = this.I + ((int) (m(getValues().get(i10).floatValue()) * ((float) this.f6761c0)));
        int b10 = b();
        int i11 = this.J;
        int i12 = this.D;
        if (i11 <= i12) {
            i11 = i12;
        }
        int i13 = i11 / 2;
        rect.set(m10 - i13, b10 - i13, m10 + i13, b10 + i13);
    }

    public final void s() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int m10 = (int) ((m(this.R.get(this.T).floatValue()) * ((float) this.f6761c0)) + ((float) this.I));
                int b10 = b();
                int i10 = this.K;
                a.b.f(background, m10 - i10, b10 - i10, m10 + i10, b10 + i10);
            }
        }
    }

    public void setActiveThumbIndex(int i10) {
        this.S = i10;
    }

    public void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setEnabled(boolean z10) {
        int i10;
        super.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        setLayerType(i10, (Paint) null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.R.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.T = i10;
        this.f6775n.w(i10);
        postInvalidate();
    }

    public void setHaloRadius(int i10) {
        if (i10 != this.K) {
            this.K = i10;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                ((RippleDrawable) background).setRadius(this.K);
            }
        }
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f6767f0)) {
            this.f6767f0 = colorStateList;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                this.f6762d.setColor(f(colorStateList));
                this.f6762d.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i10) {
        if (this.G != i10) {
            this.G = i10;
            requestLayout();
        }
    }

    public void setLabelFormatter(d dVar) {
    }

    public void setSeparationUnit(int i10) {
        this.f6778o0 = i10;
        this.f6765e0 = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(f10), Float.valueOf(this.P), Float.valueOf(this.Q)}));
        } else if (this.U != f10) {
            this.U = f10;
            this.f6765e0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        this.f6772k0.m(f10);
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbRadius(int i10) {
        if (i10 != this.J) {
            this.J = i10;
            h hVar = this.f6772k0;
            m.a aVar = new m.a();
            float f10 = (float) this.J;
            lb.b o10 = m9.b.o(0);
            aVar.f12837a = o10;
            float a10 = m.a.a(o10);
            if (a10 != -1.0f) {
                aVar.e(a10);
            }
            aVar.f12838b = o10;
            float a11 = m.a.a(o10);
            if (a11 != -1.0f) {
                aVar.f(a11);
            }
            aVar.f12839c = o10;
            float a12 = m.a.a(o10);
            if (a12 != -1.0f) {
                aVar.d(a12);
            }
            aVar.f12840d = o10;
            float a13 = m.a.a(o10);
            if (a13 != -1.0f) {
                aVar.c(a13);
            }
            aVar.b(f10);
            hVar.setShapeAppearanceModel(new m(aVar));
            h hVar2 = this.f6772k0;
            int i11 = this.J * 2;
            hVar2.setBounds(0, 0, i11, i11);
            Drawable drawable = this.f6773l0;
            if (drawable != null) {
                a(drawable);
            }
            for (Drawable a14 : this.f6774m0) {
                a(a14);
            }
            t();
        }
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f6772k0.s(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(k1.a.getColorStateList(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.f6772k0.t(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f6772k0.f12778a.f12800c)) {
            this.f6772k0.n(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveRadius(int i10) {
        if (this.f6757a0 != i10) {
            this.f6757a0 = i10;
            this.f6766f.setStrokeWidth((float) (i10 * 2));
            t();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f6768g0)) {
            this.f6768g0 = colorStateList;
            this.f6766f.setColor(f(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveRadius(int i10) {
        if (this.f6759b0 != i10) {
            this.f6759b0 = i10;
            this.f6764e.setStrokeWidth((float) (i10 * 2));
            t();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f6769h0)) {
            this.f6769h0 = colorStateList;
            this.f6764e.setColor(f(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f6770i0)) {
            this.f6770i0 = colorStateList;
            this.f6758b.setColor(f(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i10) {
        if (this.H != i10) {
            this.H = i10;
            this.f6756a.setStrokeWidth((float) i10);
            this.f6758b.setStrokeWidth((float) this.H);
            t();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f6771j0)) {
            this.f6771j0 = colorStateList;
            this.f6756a.setColor(f(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.P = f10;
        this.f6765e0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.Q = f10;
        this.f6765e0 = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public final void t() {
        boolean z10;
        int max = Math.max(this.E, Math.max(this.H + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.J * 2)));
        boolean z11 = false;
        if (max == this.F) {
            z10 = false;
        } else {
            this.F = max;
            z10 = true;
        }
        int max2 = Math.max(Math.max(Math.max(this.J - this.f6789z, 0), Math.max((this.H - this.A) / 2, 0)), Math.max(Math.max(this.f6757a0 - this.B, 0), Math.max(this.f6759b0 - this.C, 0))) + this.f6788y;
        if (this.I != max2) {
            this.I = max2;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.g.c(this)) {
                this.f6761c0 = Math.max(getWidth() - (this.I * 2), 0);
                j();
            }
            z11 = true;
        }
        if (z10) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public final void u() {
        if (this.f6765e0) {
            float f10 = this.P;
            float f11 = this.Q;
            if (f10 >= f11) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.valueOf(this.P), Float.valueOf(this.Q)}));
            } else if (f11 <= f10) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.valueOf(this.Q), Float.valueOf(this.P)}));
            } else if (this.U <= 0.0f || g(f11 - f10)) {
                Iterator<Float> it = this.R.iterator();
                while (it.hasNext()) {
                    Float next = it.next();
                    if (next.floatValue() < this.P || next.floatValue() > this.Q) {
                        throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{next, Float.valueOf(this.P), Float.valueOf(this.Q)}));
                    } else if (this.U > 0.0f && !g(next.floatValue() - this.P)) {
                        throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{next, Float.valueOf(this.P), Float.valueOf(this.U), Float.valueOf(this.U)}));
                    }
                }
                float minSeparation = getMinSeparation();
                if (minSeparation >= 0.0f) {
                    float f12 = this.U;
                    if (f12 > 0.0f && minSeparation > 0.0f) {
                        if (this.f6778o0 != 1) {
                            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.U)}));
                        } else if (minSeparation < f12 || !g(minSeparation)) {
                            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.U), Float.valueOf(this.U)}));
                        }
                    }
                    float f13 = this.U;
                    if (f13 != 0.0f) {
                        if (((float) ((int) f13)) != f13) {
                            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"stepSize", Float.valueOf(f13)});
                        }
                        float f14 = this.P;
                        if (((float) ((int) f14)) != f14) {
                            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"valueFrom", Float.valueOf(f14)});
                        }
                        float f15 = this.Q;
                        if (((float) ((int) f15)) != f15) {
                            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"valueTo", Float.valueOf(f15)});
                        }
                    }
                    this.f6765e0 = false;
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", new Object[]{Float.valueOf(minSeparation)}));
            } else {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(this.U), Float.valueOf(this.P), Float.valueOf(this.Q)}));
            }
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.sliderStyle);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable);
        this.f6773l0 = newDrawable;
        this.f6774m0.clear();
        postInvalidate();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BaseSlider(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f6751p0
            android.content.Context r11 = p8.a.a(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f6781r = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f6782s = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f6783t = r11
            r11 = 0
            r10.f6784u = r11
            r10.O = r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.R = r0
            r0 = -1
            r10.S = r0
            r10.T = r0
            r6 = 0
            r10.U = r6
            r7 = 1
            r10.W = r7
            r10.f6763d0 = r11
            l8.h r8 = new l8.h
            r8.<init>()
            r10.f6772k0 = r8
            java.util.List r0 = java.util.Collections.emptyList()
            r10.f6774m0 = r0
            r10.f6778o0 = r11
            android.content.Context r9 = r10.getContext()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f6756a = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f6758b = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r7)
            r10.f6760c = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r1.<init>(r2)
            r0.setXfermode(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r7)
            r10.f6762d = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f6764e = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f6766f = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.content.res.Resources r0 = r9.getResources()
            int r1 = com.google.android.material.R$dimen.mtrl_slider_widget_height
            int r1 = r0.getDimensionPixelSize(r1)
            r10.E = r1
            int r1 = com.google.android.material.R$dimen.mtrl_slider_track_side_padding
            int r1 = r0.getDimensionPixelOffset(r1)
            r10.f6788y = r1
            r10.I = r1
            int r1 = com.google.android.material.R$dimen.mtrl_slider_thumb_radius
            int r1 = r0.getDimensionPixelSize(r1)
            r10.f6789z = r1
            int r1 = com.google.android.material.R$dimen.mtrl_slider_track_height
            int r1 = r0.getDimensionPixelSize(r1)
            r10.A = r1
            int r1 = com.google.android.material.R$dimen.mtrl_slider_tick_radius
            int r2 = r0.getDimensionPixelSize(r1)
            r10.B = r2
            int r1 = r0.getDimensionPixelSize(r1)
            r10.C = r1
            int r1 = com.google.android.material.R$dimen.mtrl_slider_label_padding
            int r0 = r0.getDimensionPixelSize(r1)
            r10.L = r0
            int[] r2 = com.google.android.material.R$styleable.Slider
            int[] r5 = new int[r11]
            r0 = r9
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r13 = com.google.android.material.R$styleable.Slider_labelStyle
            int r0 = com.google.android.material.R$style.Widget_MaterialComponents_Tooltip
            int r13 = r12.getResourceId(r13, r0)
            r10.f6780q = r13
            int r13 = com.google.android.material.R$styleable.Slider_android_valueFrom
            float r13 = r12.getFloat(r13, r6)
            r10.P = r13
            int r13 = com.google.android.material.R$styleable.Slider_android_valueTo
            r0 = 1065353216(0x3f800000, float:1.0)
            float r13 = r12.getFloat(r13, r0)
            r10.Q = r13
            java.lang.Float[] r13 = new java.lang.Float[r7]
            float r0 = r10.P
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r13[r11] = r0
            r10.setValues((java.lang.Float[]) r13)
            int r13 = com.google.android.material.R$styleable.Slider_android_stepSize
            float r13 = r12.getFloat(r13, r6)
            r10.U = r13
            android.content.Context r13 = r10.getContext()
            r0 = 48
            float r13 = com.google.android.material.internal.x.c(r13, r0)
            double r0 = (double) r13
            double r0 = java.lang.Math.ceil(r0)
            float r13 = (float) r0
            int r0 = com.google.android.material.R$styleable.Slider_minTouchTargetSize
            float r13 = r12.getDimension(r0, r13)
            double r0 = (double) r13
            double r0 = java.lang.Math.ceil(r0)
            int r13 = (int) r0
            r10.D = r13
            int r13 = com.google.android.material.R$styleable.Slider_trackColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0150
            r1 = r13
            goto L_0x0152
        L_0x0150:
            int r1 = com.google.android.material.R$styleable.Slider_trackColorInactive
        L_0x0152:
            if (r0 == 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            int r13 = com.google.android.material.R$styleable.Slider_trackColorActive
        L_0x0157:
            android.content.res.ColorStateList r0 = i8.c.a(r9, r12, r1)
            if (r0 == 0) goto L_0x015e
            goto L_0x0164
        L_0x015e:
            int r0 = com.google.android.material.R$color.material_slider_inactive_track_color
            android.content.res.ColorStateList r0 = k1.a.getColorStateList(r9, r0)
        L_0x0164:
            r10.setTrackInactiveTintList(r0)
            android.content.res.ColorStateList r13 = i8.c.a(r9, r12, r13)
            if (r13 == 0) goto L_0x016e
            goto L_0x0174
        L_0x016e:
            int r13 = com.google.android.material.R$color.material_slider_active_track_color
            android.content.res.ColorStateList r13 = k1.a.getColorStateList(r9, r13)
        L_0x0174:
            r10.setTrackActiveTintList(r13)
            int r13 = com.google.android.material.R$styleable.Slider_thumbColor
            android.content.res.ColorStateList r13 = i8.c.a(r9, r12, r13)
            r8.n(r13)
            int r13 = com.google.android.material.R$styleable.Slider_thumbStrokeColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x018f
            android.content.res.ColorStateList r13 = i8.c.a(r9, r12, r13)
            r10.setThumbStrokeColor(r13)
        L_0x018f:
            int r13 = com.google.android.material.R$styleable.Slider_thumbStrokeWidth
            float r13 = r12.getDimension(r13, r6)
            r10.setThumbStrokeWidth(r13)
            int r13 = com.google.android.material.R$styleable.Slider_haloColor
            android.content.res.ColorStateList r13 = i8.c.a(r9, r12, r13)
            if (r13 == 0) goto L_0x01a1
            goto L_0x01a7
        L_0x01a1:
            int r13 = com.google.android.material.R$color.material_slider_halo_color
            android.content.res.ColorStateList r13 = k1.a.getColorStateList(r9, r13)
        L_0x01a7:
            r10.setHaloTintList(r13)
            int r13 = com.google.android.material.R$styleable.Slider_tickVisible
            boolean r13 = r12.getBoolean(r13, r7)
            r10.W = r13
            int r13 = com.google.android.material.R$styleable.Slider_tickColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x01bc
            r1 = r13
            goto L_0x01be
        L_0x01bc:
            int r1 = com.google.android.material.R$styleable.Slider_tickColorInactive
        L_0x01be:
            if (r0 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            int r13 = com.google.android.material.R$styleable.Slider_tickColorActive
        L_0x01c3:
            android.content.res.ColorStateList r0 = i8.c.a(r9, r12, r1)
            if (r0 == 0) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            int r0 = com.google.android.material.R$color.material_slider_inactive_tick_marks_color
            android.content.res.ColorStateList r0 = k1.a.getColorStateList(r9, r0)
        L_0x01d0:
            r10.setTickInactiveTintList(r0)
            android.content.res.ColorStateList r13 = i8.c.a(r9, r12, r13)
            if (r13 == 0) goto L_0x01da
            goto L_0x01e0
        L_0x01da:
            int r13 = com.google.android.material.R$color.material_slider_active_tick_marks_color
            android.content.res.ColorStateList r13 = k1.a.getColorStateList(r9, r13)
        L_0x01e0:
            r10.setTickActiveTintList(r13)
            int r13 = com.google.android.material.R$styleable.Slider_thumbRadius
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.setThumbRadius(r13)
            int r13 = com.google.android.material.R$styleable.Slider_haloRadius
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.setHaloRadius(r13)
            int r13 = com.google.android.material.R$styleable.Slider_thumbElevation
            float r13 = r12.getDimension(r13, r6)
            r10.setThumbElevation(r13)
            int r13 = com.google.android.material.R$styleable.Slider_trackHeight
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.setTrackHeight(r13)
            int r13 = com.google.android.material.R$styleable.Slider_tickRadiusActive
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.setTickActiveRadius(r13)
            int r13 = com.google.android.material.R$styleable.Slider_tickRadiusInactive
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.setTickInactiveRadius(r13)
            int r13 = com.google.android.material.R$styleable.Slider_labelBehavior
            int r13 = r12.getInt(r13, r11)
            r10.setLabelBehavior(r13)
            int r13 = com.google.android.material.R$styleable.Slider_android_enabled
            boolean r13 = r12.getBoolean(r13, r7)
            if (r13 != 0) goto L_0x022d
            r10.setEnabled(r11)
        L_0x022d:
            r12.recycle()
            r10.setFocusable(r7)
            r10.setClickable(r7)
            r11 = 2
            r8.r(r11)
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r9)
            int r11 = r11.getScaledTouchSlop()
            r10.f6787x = r11
            com.google.android.material.slider.BaseSlider$c r11 = new com.google.android.material.slider.BaseSlider$c
            r11.<init>(r10)
            r10.f6775n = r11
            w1.d0.o(r10, r11)
            android.content.Context r11 = r10.getContext()
            java.lang.String r12 = "accessibility"
            java.lang.Object r11 = r11.getSystemService(r12)
            android.view.accessibility.AccessibilityManager r11 = (android.view.accessibility.AccessibilityManager) r11
            r10.f6777o = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f6773l0 = null;
        this.f6774m0 = new ArrayList();
        for (Drawable mutate : drawableArr) {
            List<Drawable> list = this.f6774m0;
            Drawable newDrawable = mutate.mutate().getConstantState().newDrawable();
            a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
