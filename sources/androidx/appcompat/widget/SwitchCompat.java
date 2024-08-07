package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.core.R$id;
import androidx.core.widget.k;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o1.a;
import w1.b0;
import w1.d0;
import w1.q0;

public class SwitchCompat extends CompoundButton {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f983b0 = new a();

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f984c0 = {16842912};
    public int A;
    public int B;
    public float C;
    public float D;
    public VelocityTracker E;
    public int F;
    public float G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public final TextPaint P;
    public ColorStateList Q;
    public StaticLayout R;
    public StaticLayout S;
    public k.a T;
    public ObjectAnimator U;
    public h V;
    public c W;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f985a;

    /* renamed from: a0  reason: collision with root package name */
    public final Rect f986a0;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f987b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f988c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f989d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f990e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f991f;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f992n;

    /* renamed from: o  reason: collision with root package name */
    public PorterDuff.Mode f993o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f994p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f995q;

    /* renamed from: r  reason: collision with root package name */
    public int f996r;

    /* renamed from: s  reason: collision with root package name */
    public int f997s;

    /* renamed from: t  reason: collision with root package name */
    public int f998t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f999u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f1000v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f1001w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f1002x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f1003y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1004z;

    public class a extends Property<SwitchCompat, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).G);
        }

        public final void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    }

    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    public static class c extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f1005a;

        public c(SwitchCompat switchCompat) {
            this.f1005a = new WeakReference(switchCompat);
        }

        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1005a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }

        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1005a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    private h getEmojiTextViewHelper() {
        if (this.V == null) {
            this.V = new h(this);
        }
        return this.V;
    }

    private boolean getTargetCheckedState() {
        if (this.G > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f10;
        if (u0.a(this)) {
            f10 = 1.0f - this.G;
        } else {
            f10 = this.G;
        }
        return (int) ((f10 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f991f;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f986a0;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f985a;
        if (drawable2 != null) {
            rect = x.b(drawable2);
        } else {
            rect = x.f1239c;
        }
        return ((((this.H - this.J) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1002x = charSequence;
        h emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f1115b.f13466a.e(this.T);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.f1003y = charSequence;
        this.S = null;
        if (this.f1004z) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1000v = charSequence;
        h emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f1115b.f13466a.e(this.T);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.f1001w = charSequence;
        this.R = null;
        if (this.f1004z) {
            e();
        }
    }

    public final void a() {
        Drawable drawable = this.f985a;
        if (drawable == null) {
            return;
        }
        if (this.f989d || this.f990e) {
            Drawable mutate = drawable.mutate();
            this.f985a = mutate;
            if (this.f989d) {
                a.b.h(mutate, this.f987b);
            }
            if (this.f990e) {
                a.b.i(this.f985a, this.f988c);
            }
            if (this.f985a.isStateful()) {
                this.f985a.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f991f;
        if (drawable == null) {
            return;
        }
        if (this.f994p || this.f995q) {
            Drawable mutate = drawable.mutate();
            this.f991f = mutate;
            if (this.f994p) {
                a.b.h(mutate, this.f992n);
            }
            if (this.f995q) {
                a.b.i(this.f991f, this.f993o);
            }
            if (this.f991f.isStateful()) {
                this.f991f.setState(getDrawableState());
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        int i10;
        TextPaint textPaint = this.P;
        if (charSequence != null) {
            i10 = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i10 = 0;
        }
        return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        setTextOnInternal(this.f1000v);
        setTextOffInternal(this.f1002x);
        requestLayout();
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        Rect rect2 = this.f986a0;
        int i12 = this.K;
        int i13 = this.L;
        int i14 = this.M;
        int i15 = this.N;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f985a;
        if (drawable != null) {
            rect = x.b(drawable);
        } else {
            rect = x.f1239c;
        }
        Drawable drawable2 = this.f991f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                if (i18 > i19) {
                    i10 = (i18 - i19) + i13;
                } else {
                    i10 = i13;
                }
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f991f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f991f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f985a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.J + rect2.right;
            this.f985a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                a.b.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f985a;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f991f;
        if (drawable2 != null) {
            a.b.e(drawable2, f10, f11);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f985a;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f991f;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        boolean z10;
        if (this.W == null && this.V.f1115b.f13466a.b()) {
            if (d.f2380j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d a10 = d.a();
                int b10 = a10.b();
                if (b10 == 3 || b10 == 0) {
                    c cVar = new c(this);
                    this.W = cVar;
                    a10.g(cVar);
                }
            }
        }
    }

    public int getCompoundPaddingLeft() {
        if (!u0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.H;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f998t;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (u0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.H;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f998t;
        }
        return compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.e(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1004z;
    }

    public boolean getSplitTrack() {
        return this.f999u;
    }

    public int getSwitchMinWidth() {
        return this.f997s;
    }

    public int getSwitchPadding() {
        return this.f998t;
    }

    public CharSequence getTextOff() {
        return this.f1002x;
    }

    public CharSequence getTextOn() {
        return this.f1000v;
    }

    public Drawable getThumbDrawable() {
        return this.f985a;
    }

    public final float getThumbPosition() {
        return this.G;
    }

    public int getThumbTextPadding() {
        return this.f996r;
    }

    public ColorStateList getThumbTintList() {
        return this.f987b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f988c;
    }

    public Drawable getTrackDrawable() {
        return this.f991f;
    }

    public ColorStateList getTrackTintList() {
        return this.f992n;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f993o;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f985a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f991f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.U;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.U.end();
            this.U = null;
        }
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f984c0);
        }
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int i10;
        super.onDraw(canvas);
        Rect rect = this.f986a0;
        Drawable drawable = this.f991f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.L;
        int i12 = this.N;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f985a;
        if (drawable != null) {
            if (!this.f999u || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b10 = x.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b10.left;
                rect.right -= b10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.R;
        } else {
            staticLayout = this.S;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.Q;
            if (colorStateList != null) {
                this.P.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.P.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i10 = bounds.left + bounds.right;
            } else {
                i10 = getWidth();
            }
            canvas.translate((float) ((i10 / 2) - (staticLayout.getWidth() / 2)), (float) (((i13 + i14) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f1000v;
            } else {
                charSequence = this.f1002x;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        super.onLayout(z10, i10, i11, i12, i13);
        int i19 = 0;
        if (this.f985a != null) {
            Rect rect = this.f986a0;
            Drawable drawable = this.f991f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b10 = x.b(this.f985a);
            i14 = Math.max(0, b10.left - rect.left);
            i19 = Math.max(0, b10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (u0.a(this)) {
            i16 = getPaddingLeft() + i14;
            i15 = ((this.H + i16) - i14) - i19;
        } else {
            i15 = (getWidth() - getPaddingRight()) - i19;
            i16 = (i15 - this.H) + i14 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i20 = this.I;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i20 / 2);
            int i21 = height;
            i17 = i20 + height;
            i18 = i21;
        } else if (gravity != 80) {
            i18 = getPaddingTop();
            i17 = this.I + i18;
        } else {
            i17 = getHeight() - getPaddingBottom();
            i18 = i17 - this.I;
        }
        this.K = i16;
        this.L = i18;
        this.N = i17;
        this.M = i15;
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f1004z) {
            if (this.R == null) {
                this.R = c(this.f1001w);
            }
            if (this.S == null) {
                this.S = c(this.f1003y);
            }
        }
        Rect rect = this.f986a0;
        Drawable drawable = this.f985a;
        int i16 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f985a.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f985a.getIntrinsicHeight();
        } else {
            i13 = 0;
            i12 = 0;
        }
        if (this.f1004z) {
            i14 = (this.f996r * 2) + Math.max(this.R.getWidth(), this.S.getWidth());
        } else {
            i14 = 0;
        }
        this.J = Math.max(i14, i13);
        Drawable drawable2 = this.f991f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i16 = this.f991f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i17 = rect.left;
        int i18 = rect.right;
        Drawable drawable3 = this.f985a;
        if (drawable3 != null) {
            Rect b10 = x.b(drawable3);
            i17 = Math.max(i17, b10.left);
            i18 = Math.max(i18, b10.right);
        }
        if (this.O) {
            i15 = Math.max(this.f997s, (this.J * 2) + i17 + i18);
        } else {
            i15 = this.f997s;
        }
        int max = Math.max(i16, i12);
        this.H = i15;
        this.I = max;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f1000v;
        } else {
            charSequence = this.f1002x;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.E
            r0.addMovement(r11)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00fd
            r3 = 3
            r4 = 0
            r5 = 2
            if (r0 == r2) goto L_0x0090
            if (r0 == r5) goto L_0x0018
            if (r0 == r3) goto L_0x0090
            goto L_0x0150
        L_0x0018:
            int r0 = r10.A
            if (r0 == r2) goto L_0x005c
            if (r0 == r5) goto L_0x0020
            goto L_0x0150
        L_0x0020:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.C
            float r1 = r11 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003c
        L_0x0033:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r1 = r3
            goto L_0x003c
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L_0x003c:
            boolean r0 = androidx.appcompat.widget.u0.a(r10)
            if (r0 == 0) goto L_0x0043
            float r1 = -r1
        L_0x0043:
            float r0 = r10.G
            float r1 = r1 + r0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            r4 = r3
            goto L_0x0052
        L_0x0051:
            r4 = r1
        L_0x0052:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            r10.C = r11
            r10.setThumbPosition(r4)
        L_0x005b:
            return r2
        L_0x005c:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.C
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.B
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0082
            float r3 = r10.D
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.B
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0150
        L_0x0082:
            r10.A = r5
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            r10.C = r0
            r10.D = r1
            return r2
        L_0x0090:
            int r0 = r10.A
            if (r0 != r5) goto L_0x00f5
            r10.A = r1
            int r0 = r11.getAction()
            if (r0 != r2) goto L_0x00a4
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x00a4
            r0 = r2
            goto L_0x00a5
        L_0x00a4:
            r0 = r1
        L_0x00a5:
            boolean r5 = r10.isChecked()
            if (r0 == 0) goto L_0x00db
            android.view.VelocityTracker r0 = r10.E
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r10.E
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r10.F
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            boolean r6 = androidx.appcompat.widget.u0.a(r10)
            if (r6 == 0) goto L_0x00ce
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d4
            goto L_0x00d2
        L_0x00ce:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d4
        L_0x00d2:
            r0 = r2
            goto L_0x00dc
        L_0x00d4:
            r0 = r1
            goto L_0x00dc
        L_0x00d6:
            boolean r0 = r10.getTargetCheckedState()
            goto L_0x00dc
        L_0x00db:
            r0 = r5
        L_0x00dc:
            if (r0 == r5) goto L_0x00e1
            r10.playSoundEffect(r1)
        L_0x00e1:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r2
        L_0x00f5:
            r10.A = r1
            android.view.VelocityTracker r0 = r10.E
            r0.clear()
            goto L_0x0150
        L_0x00fd:
            float r0 = r11.getX()
            float r3 = r11.getY()
            boolean r4 = r10.isEnabled()
            if (r4 == 0) goto L_0x0150
            android.graphics.drawable.Drawable r4 = r10.f985a
            if (r4 != 0) goto L_0x0110
            goto L_0x0148
        L_0x0110:
            int r4 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r10.f985a
            android.graphics.Rect r6 = r10.f986a0
            r5.getPadding(r6)
            int r5 = r10.L
            int r6 = r10.B
            int r5 = r5 - r6
            int r7 = r10.K
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r10.J
            int r4 = r4 + r7
            android.graphics.Rect r8 = r10.f986a0
            int r9 = r8.left
            int r4 = r4 + r9
            int r8 = r8.right
            int r4 = r4 + r8
            int r4 = r4 + r6
            int r8 = r10.N
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0148
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0148
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0148
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0148
            r1 = r2
        L_0x0148:
            if (r1 == 0) goto L_0x0150
            r10.A = r2
            r10.C = r0
            r10.D = r3
        L_0x0150:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f1000v;
                if (obj == null) {
                    obj = getResources().getString(R$string.abc_capital_on);
                }
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                new b0(R$id.tag_state_description, CharSequence.class).e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f1002x;
            if (obj2 == null) {
                obj2 = getResources().getString(R$string.abc_capital_off);
            }
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            new b0(R$id.tag_state_description, CharSequence.class).e(this, obj2);
        }
        float f10 = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, q0> weakHashMap3 = d0.f16298a;
            if (d0.g.c(this)) {
                if (!isChecked) {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f983b0, new float[]{f10});
                this.U = ofFloat;
                ofFloat.setDuration(250);
                b.a(this.U, true);
                this.U.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.U;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f10 = 0.0f;
        }
        setThumbPosition(f10);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f1000v);
        setTextOffInternal(this.f1002x);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1004z != z10) {
            this.f1004z = z10;
            requestLayout();
            if (z10) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f999u = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f997s = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f998t = i10;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i10) {
        ColorStateList colorStateList;
        Typeface typeface;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R$styleable.TextAppearance);
        int i11 = R$styleable.TextAppearance_android_textColor;
        if (!obtainStyledAttributes.hasValue(i11) || (resourceId = obtainStyledAttributes.getResourceId(i11, 0)) == 0 || (colorStateList = k1.a.getColorStateList(context, resourceId)) == null) {
            colorStateList = obtainStyledAttributes.getColorStateList(i11);
        }
        if (colorStateList != null) {
            this.Q = colorStateList;
        } else {
            this.Q = getTextColors();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f10 = (float) dimensionPixelSize;
            if (f10 != this.P.getTextSize()) {
                this.P.setTextSize(f10);
                requestLayout();
            }
        }
        int i12 = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, -1);
        int i13 = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, -1);
        if (i12 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i12 == 2) {
            typeface = Typeface.SERIF;
        } else if (i12 != 3) {
            typeface = null;
        } else {
            typeface = Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i13);
        if (obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false)) {
            this.T = new k.a(getContext());
        } else {
            this.T = null;
        }
        setTextOnInternal(this.f1000v);
        setTextOffInternal(this.f1002x);
        obtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        float f10 = 0.0f;
        boolean z10 = false;
        if (i10 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i10);
            } else {
                typeface2 = Typeface.create(typeface, i10);
            }
            setSwitchTypeface(typeface2);
            int i11 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i10;
            TextPaint textPaint = this.P;
            if ((i11 & 1) != 0) {
                z10 = true;
            }
            textPaint.setFakeBoldText(z10);
            TextPaint textPaint2 = this.P;
            if ((i11 & 2) != 0) {
                f10 = -0.25f;
            }
            textPaint2.setTextSkewX(f10);
            return;
        }
        this.P.setFakeBoldText(false);
        this.P.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1002x;
            if (obj == null) {
                obj = getResources().getString(R$string.abc_capital_off);
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            new b0(R$id.tag_state_description, CharSequence.class).e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1000v;
            if (obj == null) {
                obj = getResources().getString(R$string.abc_capital_on);
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            new b0(R$id.tag_state_description, CharSequence.class).e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f985a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f985a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.G = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(h.a.a(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f996r = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f987b = colorStateList;
        this.f989d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f988c = mode;
        this.f990e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f991f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f991f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(h.a.a(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f992n = colorStateList;
        this.f994p = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f993o = mode;
        this.f995q = true;
        b();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f985a || drawable == this.f991f) {
            return true;
        }
        return false;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f987b = null;
        this.f988c = null;
        this.f989d = false;
        this.f990e = false;
        this.f992n = null;
        this.f993o = null;
        this.f994p = false;
        this.f995q = false;
        this.E = VelocityTracker.obtain();
        this.O = true;
        this.f986a0 = new Rect();
        i0.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.P = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = R$styleable.SwitchCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        n0 n0Var = new n0(context, obtainStyledAttributes);
        d0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        Drawable e10 = n0Var.e(R$styleable.SwitchCompat_android_thumb);
        this.f985a = e10;
        if (e10 != null) {
            e10.setCallback(this);
        }
        Drawable e11 = n0Var.e(R$styleable.SwitchCompat_track);
        this.f991f = e11;
        if (e11 != null) {
            e11.setCallback(this);
        }
        setTextOnInternal(n0Var.k(R$styleable.SwitchCompat_android_textOn));
        setTextOffInternal(n0Var.k(R$styleable.SwitchCompat_android_textOff));
        this.f1004z = n0Var.a(R$styleable.SwitchCompat_showText, true);
        this.f996r = n0Var.d(R$styleable.SwitchCompat_thumbTextPadding, 0);
        this.f997s = n0Var.d(R$styleable.SwitchCompat_switchMinWidth, 0);
        this.f998t = n0Var.d(R$styleable.SwitchCompat_switchPadding, 0);
        this.f999u = n0Var.a(R$styleable.SwitchCompat_splitTrack, false);
        ColorStateList b10 = n0Var.b(R$styleable.SwitchCompat_thumbTint);
        if (b10 != null) {
            this.f987b = b10;
            this.f989d = true;
        }
        PorterDuff.Mode c10 = x.c(n0Var.h(R$styleable.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f988c != c10) {
            this.f988c = c10;
            this.f990e = true;
        }
        if (this.f989d || this.f990e) {
            a();
        }
        ColorStateList b11 = n0Var.b(R$styleable.SwitchCompat_trackTint);
        if (b11 != null) {
            this.f992n = b11;
            this.f994p = true;
        }
        PorterDuff.Mode c11 = x.c(n0Var.h(R$styleable.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f993o != c11) {
            this.f993o = c11;
            this.f995q = true;
        }
        if (this.f994p || this.f995q) {
            b();
        }
        int i11 = n0Var.i(R$styleable.SwitchCompat_switchTextAppearance, 0);
        if (i11 != 0) {
            setSwitchTextAppearance(context, i11);
        }
        new p(this).f(attributeSet, i10);
        n0Var.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.B = viewConfiguration.getScaledTouchSlop();
        this.F = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.P.getTypeface() != null && !this.P.getTypeface().equals(typeface)) || (this.P.getTypeface() == null && typeface != null)) {
            this.P.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }
}
