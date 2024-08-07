package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.timepicker.ClockHandView;
import i8.c;
import java.util.Arrays;
import w1.d0;
import x1.f;

class ClockFaceView extends RadialViewGroup implements ClockHandView.a {
    public final ClockHandView A;
    public final Rect B;
    public final RectF C;
    public final Rect D;
    public final SparseArray<TextView> E;
    public final b F;
    public final int[] G;
    public final float[] H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public String[] M;
    public float N;
    public final ColorStateList O;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        public final boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView clockFaceView = ClockFaceView.this;
            int height = ((ClockFaceView.this.getHeight() / 2) - clockFaceView.A.f7132d) - clockFaceView.I;
            if (height != clockFaceView.f7143y) {
                clockFaceView.f7143y = height;
                clockFaceView.q();
                ClockHandView clockHandView = clockFaceView.A;
                clockHandView.f7140s = clockFaceView.f7143y;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    public class b extends w1.a {
        public b() {
        }

        public final void d(View view, f fVar) {
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            int intValue = ((Integer) view.getTag(R$id.material_value_index)).intValue();
            if (intValue > 0) {
                fVar.f16862a.setTraversalAfter(ClockFaceView.this.E.get(intValue - 1));
            }
            fVar.j(f.g.a(0, 1, intValue, 1, false, view.isSelected()));
            fVar.f16862a.setClickable(true);
            fVar.b(f.a.f16867g);
        }

        public final boolean g(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.g(view, i10, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.B);
            float centerX = (float) ClockFaceView.this.B.centerX();
            float centerY = (float) ClockFaceView.this.B.centerY();
            ClockFaceView.this.A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialClockStyle);
    }

    public final void a(float f10) {
        if (Math.abs(this.N - f10) > 0.001f) {
            this.N = f10;
            r();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.C0220f.a(1, this.M.length, 1).f16880a);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r();
    }

    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.L) / Math.max(Math.max(((float) this.J) / ((float) displayMetrics.heightPixels), ((float) this.K) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void q() {
        super.q();
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            this.E.get(i10).setVisibility(0);
        }
    }

    public final void r() {
        boolean z10;
        RadialGradient radialGradient;
        RectF rectF = this.A.f7135n;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            TextView textView2 = this.E.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.B);
                this.C.set(this.B);
                this.C.union(rectF);
                float height = this.C.height() * this.C.width();
                if (height < f10) {
                    textView = textView2;
                    f10 = height;
                }
            }
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            TextView textView3 = this.E.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(this.B);
                this.C.set(this.B);
                textView3.getLineBounds(0, this.D);
                RectF rectF2 = this.C;
                Rect rect = this.D;
                rectF2.inset((float) rect.left, (float) rect.top);
                if (!RectF.intersects(rectF, this.C)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.C.left, rectF.centerY() - this.C.top, 0.5f * rectF.width(), this.G, this.H, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.B = new Rect();
        this.C = new RectF();
        this.D = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.E = sparseArray;
        this.H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockFaceView, i10, R$style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, R$styleable.ClockFaceView_clockNumberTextColor);
        this.O = a10;
        LayoutInflater.from(context).inflate(R$layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R$id.material_clock_hand);
        this.A = clockHandView;
        this.I = resources.getDimensionPixelSize(R$dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.G = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f7131c.add(this);
        int defaultColor = k1.a.getColorStateList(context, R$color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, R$styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.M = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.M.length, size); i11++) {
            TextView textView = this.E.get(i11);
            if (i11 >= this.M.length) {
                removeView(textView);
                this.E.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R$layout.material_clockface_textview, this, false);
                    this.E.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.M[i11]);
                textView.setTag(R$id.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(R$id.material_clock_level, Integer.valueOf(i12));
                z10 = i12 > 1 ? true : z10;
                d0.o(textView, this.F);
                textView.setTextColor(this.O);
            }
        }
        ClockHandView clockHandView2 = this.A;
        if (clockHandView2.f7130b && !z10) {
            clockHandView2.f7141t = 1;
        }
        clockHandView2.f7130b = z10;
        clockHandView2.invalidate();
        this.J = resources.getDimensionPixelSize(R$dimen.material_time_picker_minimum_screen_height);
        this.K = resources.getDimensionPixelSize(R$dimen.material_time_picker_minimum_screen_width);
        this.L = resources.getDimensionPixelSize(R$dimen.material_clock_size);
    }
}
