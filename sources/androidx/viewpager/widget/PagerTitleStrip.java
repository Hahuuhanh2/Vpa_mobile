package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

@ViewPager.e
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f3525v = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f3526w = {16843660};

    /* renamed from: a  reason: collision with root package name */
    public ViewPager f3527a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f3528b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f3529c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f3530d;

    /* renamed from: e  reason: collision with root package name */
    public int f3531e;

    /* renamed from: f  reason: collision with root package name */
    public float f3532f;

    /* renamed from: n  reason: collision with root package name */
    public int f3533n;

    /* renamed from: o  reason: collision with root package name */
    public int f3534o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3535p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3536q;

    /* renamed from: r  reason: collision with root package name */
    public final a f3537r;

    /* renamed from: s  reason: collision with root package name */
    public WeakReference<l3.a> f3538s;

    /* renamed from: t  reason: collision with root package name */
    public int f3539t;

    /* renamed from: u  reason: collision with root package name */
    public int f3540u;

    public class a extends DataSetObserver implements ViewPager.i, ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public int f3541a;

        public a() {
        }

        public final void a(float f10, int i10) {
            if (f10 > 0.5f) {
                i10++;
            }
            PagerTitleStrip.this.c(i10, f10, false);
        }

        public final void b(int i10) {
            this.f3541a = i10;
        }

        public final void c(int i10) {
            if (this.f3541a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.b(pagerTitleStrip.f3527a.getCurrentItem(), PagerTitleStrip.this.f3527a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f10 = pagerTitleStrip2.f3532f;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                pagerTitleStrip2.c(pagerTitleStrip2.f3527a.getCurrentItem(), f10, true);
            }
        }

        public final void d(ViewPager viewPager, l3.a aVar, l3.a aVar2) {
            PagerTitleStrip.this.a(aVar, aVar2);
        }

        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.b(pagerTitleStrip.f3527a.getCurrentItem(), PagerTitleStrip.this.f3527a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f10 = pagerTitleStrip2.f3532f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            pagerTitleStrip2.c(pagerTitleStrip2.f3527a.getCurrentItem(), f10, true);
        }
    }

    public static class b extends SingleLineTransformationMethod {

        /* renamed from: a  reason: collision with root package name */
        public Locale f3543a;

        public b(Context context) {
            this.f3543a = context.getResources().getConfiguration().locale;
        }

        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f3543a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public final void a(l3.a aVar, l3.a aVar2) {
        if (aVar != null) {
            aVar.o(this.f3537r);
            this.f3538s = null;
        }
        if (aVar2 != null) {
            aVar2.i(this.f3537r);
            this.f3538s = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f3527a;
        if (viewPager != null) {
            this.f3531e = -1;
            this.f3532f = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public final void b(int i10, l3.a aVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (aVar != null) {
            aVar.c();
        }
        this.f3535p = true;
        CharSequence charSequence3 = null;
        if (i10 < 1 || aVar == null) {
            charSequence = null;
        } else {
            charSequence = aVar.e();
        }
        this.f3528b.setText(charSequence);
        TextView textView = this.f3529c;
        if (aVar == null || i10 >= 0) {
            charSequence2 = null;
        } else {
            charSequence2 = aVar.e();
        }
        textView.setText(charSequence2);
        if (i10 + 1 < 0 && aVar != null) {
            charSequence3 = aVar.e();
        }
        this.f3530d.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f3528b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3529c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3530d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3531e = i10;
        if (!this.f3536q) {
            c(i10, this.f3532f, false);
        }
        this.f3535p = false;
    }

    public void c(int i10, float f10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i10;
        float f11 = f10;
        if (i15 != this.f3531e) {
            b(i15, this.f3527a.getAdapter());
        } else if (!z10 && f11 == this.f3532f) {
            return;
        }
        this.f3536q = true;
        int measuredWidth = this.f3528b.getMeasuredWidth();
        int measuredWidth2 = this.f3529c.getMeasuredWidth();
        int measuredWidth3 = this.f3530d.getMeasuredWidth();
        int i16 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i17 = paddingRight + i16;
        int i18 = (width - (paddingLeft + i16)) - i17;
        float f12 = 0.5f + f11;
        if (f12 > 1.0f) {
            f12 -= 1.0f;
        }
        int i19 = ((width - i17) - ((int) (((float) i18) * f12))) - i16;
        int i20 = measuredWidth2 + i19;
        int baseline = this.f3528b.getBaseline();
        int baseline2 = this.f3529c.getBaseline();
        int baseline3 = this.f3530d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i21 = max - baseline;
        int i22 = max - baseline2;
        int i23 = max - baseline3;
        int i24 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f3528b.getMeasuredHeight() + i21, this.f3529c.getMeasuredHeight() + i22), this.f3530d.getMeasuredHeight() + i23);
        int i25 = this.f3534o & 112;
        if (i25 == 16) {
            i14 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i25 != 80) {
            i13 = i21 + paddingTop;
            i11 = i22 + paddingTop;
            i12 = paddingTop + i23;
            TextView textView = this.f3529c;
            textView.layout(i19, i11, i20, textView.getMeasuredHeight() + i11);
            int min = Math.min(paddingLeft, (i19 - this.f3533n) - measuredWidth);
            TextView textView2 = this.f3528b;
            textView2.layout(min, i13, measuredWidth + min, textView2.getMeasuredHeight() + i13);
            int max3 = Math.max((width - paddingRight) - i24, i20 + this.f3533n);
            TextView textView3 = this.f3530d;
            textView3.layout(max3, i12, max3 + i24, textView3.getMeasuredHeight() + i12);
            this.f3532f = f10;
            this.f3536q = false;
        } else {
            i14 = (height - paddingBottom) - max2;
        }
        i13 = i21 + i14;
        i11 = i22 + i14;
        i12 = i14 + i23;
        TextView textView4 = this.f3529c;
        textView4.layout(i19, i11, i20, textView4.getMeasuredHeight() + i11);
        int min2 = Math.min(paddingLeft, (i19 - this.f3533n) - measuredWidth);
        TextView textView22 = this.f3528b;
        textView22.layout(min2, i13, measuredWidth + min2, textView22.getMeasuredHeight() + i13);
        int max32 = Math.max((width - paddingRight) - i24, i20 + this.f3533n);
        TextView textView32 = this.f3530d;
        textView32.layout(max32, i12, max32 + i24, textView32.getMeasuredHeight() + i12);
        this.f3532f = f10;
        this.f3536q = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f3533n;
    }

    public final void onAttachedToWindow() {
        l3.a aVar;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            l3.a adapter = viewPager.getAdapter();
            a aVar2 = this.f3537r;
            viewPager.V = aVar2;
            if (viewPager.W == null) {
                viewPager.W = new ArrayList();
            }
            viewPager.W.add(aVar2);
            this.f3527a = viewPager;
            WeakReference<l3.a> weakReference = this.f3538s;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            a(aVar, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f3527a;
        if (viewPager != null) {
            a(viewPager.getAdapter(), (l3.a) null);
            ViewPager viewPager2 = this.f3527a;
            ViewPager.i iVar = viewPager2.V;
            viewPager2.V = null;
            a aVar = this.f3537r;
            ArrayList arrayList = viewPager2.W;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.f3527a = null;
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f3527a != null) {
            float f10 = this.f3532f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            c(this.f3531e, f10, true);
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int size = View.MeasureSpec.getSize(i10);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (((float) size) * 0.2f), -2);
            this.f3528b.measure(childMeasureSpec2, childMeasureSpec);
            this.f3529c.measure(childMeasureSpec2, childMeasureSpec);
            this.f3530d.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i11) == 1073741824) {
                i12 = View.MeasureSpec.getSize(i11);
            } else {
                i12 = Math.max(getMinHeight(), this.f3529c.getMeasuredHeight() + paddingBottom);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i12, i11, this.f3529c.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public final void requestLayout() {
        if (!this.f3535p) {
            super.requestLayout();
        }
    }

    public void setGravity(int i10) {
        this.f3534o = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f10) {
        int i10 = ((int) (f10 * 255.0f)) & 255;
        this.f3539t = i10;
        int i11 = (i10 << 24) | (this.f3540u & 16777215);
        this.f3528b.setTextColor(i11);
        this.f3530d.setTextColor(i11);
    }

    public void setTextColor(int i10) {
        this.f3540u = i10;
        this.f3529c.setTextColor(i10);
        int i11 = (this.f3539t << 24) | (this.f3540u & 16777215);
        this.f3528b.setTextColor(i11);
        this.f3530d.setTextColor(i11);
    }

    public void setTextSize(int i10, float f10) {
        this.f3528b.setTextSize(i10, f10);
        this.f3529c.setTextSize(i10, f10);
        this.f3530d.setTextSize(i10, f10);
    }

    public void setTextSpacing(int i10) {
        this.f3533n = i10;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3531e = -1;
        this.f3532f = -1.0f;
        this.f3537r = new a();
        TextView textView = new TextView(context);
        this.f3528b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f3529c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f3530d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3525v);
        boolean z10 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f3528b.setTextAppearance(resourceId);
            this.f3529c.setTextAppearance(resourceId);
            this.f3530d.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f3528b.setTextColor(color);
            this.f3529c.setTextColor(color);
            this.f3530d.setTextColor(color);
        }
        this.f3534o = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f3540u = this.f3529c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f3528b.setEllipsize(TextUtils.TruncateAt.END);
        this.f3529c.setEllipsize(TextUtils.TruncateAt.END);
        this.f3530d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f3526w);
            z10 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z10) {
            setSingleLineAllCaps(this.f3528b);
            setSingleLineAllCaps(this.f3529c);
            setSingleLineAllCaps(this.f3530d);
        } else {
            this.f3528b.setSingleLine();
            this.f3529c.setSingleLine();
            this.f3530d.setSingleLine();
        }
        this.f3533n = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
