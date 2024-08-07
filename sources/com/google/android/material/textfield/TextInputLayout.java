package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import c0.i0;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.x;
import com.google.android.material.textfield.g;
import f8.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l8.h;
import l8.m;
import o1.a;
import v.v;
import w1.d0;
import w1.q0;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int I0 = R$style.Widget_Design_TextInputLayout;
    public static final int[][] J0 = {new int[]{16842919}, new int[0]};
    public AppCompatTextView A;
    public boolean A0;
    public ColorStateList B;
    public final com.google.android.material.internal.c B0;
    public int C;
    public boolean C0;
    public Fade D;
    public boolean D0;
    public Fade E;
    public ValueAnimator E0;
    public ColorStateList F;
    public boolean F0;
    public ColorStateList G;
    public boolean G0;
    public ColorStateList H;
    public boolean H0;
    public ColorStateList I;
    public boolean J;
    public CharSequence K;
    public boolean L;
    public h M;
    public h N;
    public StateListDrawable O;
    public boolean P;
    public h Q;
    public h R;
    public m S;
    public boolean T;
    public final int U;
    public int V;
    public int W;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f6965a;

    /* renamed from: a0  reason: collision with root package name */
    public int f6966a0;

    /* renamed from: b  reason: collision with root package name */
    public final t f6967b;

    /* renamed from: b0  reason: collision with root package name */
    public int f6968b0;

    /* renamed from: c  reason: collision with root package name */
    public final l f6969c;

    /* renamed from: c0  reason: collision with root package name */
    public int f6970c0;

    /* renamed from: d  reason: collision with root package name */
    public EditText f6971d;

    /* renamed from: d0  reason: collision with root package name */
    public int f6972d0;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f6973e;

    /* renamed from: e0  reason: collision with root package name */
    public int f6974e0;

    /* renamed from: f  reason: collision with root package name */
    public int f6975f;

    /* renamed from: f0  reason: collision with root package name */
    public final Rect f6976f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Rect f6977g0;

    /* renamed from: h0  reason: collision with root package name */
    public final RectF f6978h0;

    /* renamed from: i0  reason: collision with root package name */
    public Typeface f6979i0;

    /* renamed from: j0  reason: collision with root package name */
    public ColorDrawable f6980j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f6981k0;

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet<f> f6982l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorDrawable f6983m0;

    /* renamed from: n  reason: collision with root package name */
    public int f6984n;

    /* renamed from: n0  reason: collision with root package name */
    public int f6985n0;

    /* renamed from: o  reason: collision with root package name */
    public int f6986o;

    /* renamed from: o0  reason: collision with root package name */
    public Drawable f6987o0;

    /* renamed from: p  reason: collision with root package name */
    public int f6988p;

    /* renamed from: p0  reason: collision with root package name */
    public ColorStateList f6989p0;

    /* renamed from: q  reason: collision with root package name */
    public final q f6990q;

    /* renamed from: q0  reason: collision with root package name */
    public ColorStateList f6991q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6992r;

    /* renamed from: r0  reason: collision with root package name */
    public int f6993r0;

    /* renamed from: s  reason: collision with root package name */
    public int f6994s;

    /* renamed from: s0  reason: collision with root package name */
    public int f6995s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6996t;

    /* renamed from: t0  reason: collision with root package name */
    public int f6997t0;

    /* renamed from: u  reason: collision with root package name */
    public e f6998u;

    /* renamed from: u0  reason: collision with root package name */
    public ColorStateList f6999u0;

    /* renamed from: v  reason: collision with root package name */
    public AppCompatTextView f7000v;

    /* renamed from: v0  reason: collision with root package name */
    public int f7001v0;

    /* renamed from: w  reason: collision with root package name */
    public int f7002w;

    /* renamed from: w0  reason: collision with root package name */
    public int f7003w0;

    /* renamed from: x  reason: collision with root package name */
    public int f7004x;

    /* renamed from: x0  reason: collision with root package name */
    public int f7005x0;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f7006y;

    /* renamed from: y0  reason: collision with root package name */
    public int f7007y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7008z;

    /* renamed from: z0  reason: collision with root package name */
    public int f7009z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f7010c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f7011d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("TextInputLayout.SavedState{");
            q10.append(Integer.toHexString(System.identityHashCode(this)));
            q10.append(" error=");
            q10.append(this.f7010c);
            q10.append("}");
            return q10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            TextUtils.writeToParcel(this.f7010c, parcel, i10);
            parcel.writeInt(this.f7011d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7010c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7011d = parcel.readInt() != 1 ? false : true;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u(!textInputLayout.G0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f6992r) {
                textInputLayout2.n(editable);
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f7008z) {
                textInputLayout3.v(editable);
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            l lVar = TextInputLayout.this.f6969c;
            lVar.f7054n.performClick();
            lVar.f7054n.jumpDrawablesToCurrentState();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.B0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends w1.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f7015d;

        public d(TextInputLayout textInputLayout) {
            this.f7015d = textInputLayout;
        }

        public final void d(View view, x1.f fVar) {
            Editable editable;
            boolean z10;
            String str;
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            EditText editText = this.f7015d.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f7015d.getHint();
            CharSequence error = this.f7015d.getError();
            CharSequence placeholderText = this.f7015d.getPlaceholderText();
            int counterMaxLength = this.f7015d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f7015d.getCounterOverflowDescription();
            boolean z11 = !TextUtils.isEmpty(editable);
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !this.f7015d.A0;
            boolean z14 = !TextUtils.isEmpty(error);
            if (z14 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12) {
                str = hint.toString();
            } else {
                str = "";
            }
            t tVar = this.f7015d.f6967b;
            if (tVar.f7114b.getVisibility() == 0) {
                fVar.f16862a.setLabelFor(tVar.f7114b);
                fVar.f16862a.setTraversalAfter(tVar.f7114b);
            } else {
                fVar.f16862a.setTraversalAfter(tVar.f7116d);
            }
            if (z11) {
                fVar.n(editable);
            } else if (!TextUtils.isEmpty(str)) {
                fVar.n(str);
                if (z13 && placeholderText != null) {
                    fVar.n(str + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                fVar.n(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    fVar.l(str);
                } else {
                    if (z11) {
                        str = editable + ", " + str;
                    }
                    fVar.n(str);
                }
                boolean z15 = !z11;
                if (i10 >= 26) {
                    fVar.f16862a.setShowingHintText(z15);
                } else {
                    fVar.h(4, z15);
                }
            }
            if (editable == null || editable.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            fVar.f16862a.setMaxTextLength(counterMaxLength);
            if (z10) {
                if (!z14) {
                    error = counterOverflowDescription;
                }
                fVar.f16862a.setError(error);
            }
            AppCompatTextView appCompatTextView = this.f7015d.f6990q.f7108y;
            if (appCompatTextView != null) {
                fVar.f16862a.setLabelFor(appCompatTextView);
            }
            this.f7015d.f6969c.b().n(fVar);
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f7015d.f6969c.b().o(accessibilityEvent);
        }
    }

    public interface e {
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a();
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private Drawable getEditTextBoxBackground() {
        boolean z10;
        int i10;
        EditText editText = this.f6971d;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int A2 = m9.b.A(R$attr.colorControlHighlight, this.f6971d);
                int i11 = this.V;
                if (i11 == 2) {
                    Context context = getContext();
                    h hVar = this.M;
                    int[][] iArr = J0;
                    TypedValue c10 = i8.b.c(R$attr.colorSurface, context, "TextInputLayout");
                    int i12 = c10.resourceId;
                    if (i12 != 0) {
                        i10 = k1.a.getColor(context, i12);
                    } else {
                        i10 = c10.data;
                    }
                    h hVar2 = new h(hVar.f12778a.f12798a);
                    int K2 = m9.b.K(0.1f, A2, i10);
                    hVar2.n(new ColorStateList(iArr, new int[]{K2, 0}));
                    hVar2.setTint(i10);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{K2, i10});
                    h hVar3 = new h(hVar.f12778a.f12798a);
                    hVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
                } else if (i11 != 1) {
                    return null;
                } else {
                    h hVar4 = this.M;
                    int i13 = this.f6974e0;
                    return new RippleDrawable(new ColorStateList(J0, new int[]{m9.b.K(0.1f, A2, i13), i13}), hVar4, hVar4);
                }
            }
        }
        return this.M;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.O == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.O = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.O.addState(new int[0], f(false));
        }
        return this.O;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.N == null) {
            this.N = f(true);
        }
        return this.N;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f6971d == null) {
            if (getEndIconMode() != 3) {
                boolean z10 = editText instanceof TextInputEditText;
            }
            this.f6971d = editText;
            int i10 = this.f6975f;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f6986o);
            }
            int i11 = this.f6984n;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f6988p);
            }
            this.P = false;
            i();
            setTextInputAccessibilityDelegate(new d(this));
            com.google.android.material.internal.c cVar = this.B0;
            Typeface typeface = this.f6971d.getTypeface();
            boolean m10 = cVar.m(typeface);
            boolean o10 = cVar.o(typeface);
            if (m10 || o10) {
                cVar.i(false);
            }
            com.google.android.material.internal.c cVar2 = this.B0;
            float textSize = this.f6971d.getTextSize();
            if (cVar2.f6410l != textSize) {
                cVar2.f6410l = textSize;
                cVar2.i(false);
            }
            int i12 = Build.VERSION.SDK_INT;
            com.google.android.material.internal.c cVar3 = this.B0;
            float letterSpacing = this.f6971d.getLetterSpacing();
            if (cVar3.f6401g0 != letterSpacing) {
                cVar3.f6401g0 = letterSpacing;
                cVar3.i(false);
            }
            int gravity = this.f6971d.getGravity();
            this.B0.l((gravity & -113) | 48);
            com.google.android.material.internal.c cVar4 = this.B0;
            if (cVar4.f6406j != gravity) {
                cVar4.f6406j = gravity;
                cVar4.i(false);
            }
            this.f6971d.addTextChangedListener(new a());
            if (this.f6989p0 == null) {
                this.f6989p0 = this.f6971d.getHintTextColors();
            }
            if (this.J) {
                if (TextUtils.isEmpty(this.K)) {
                    CharSequence hint = this.f6971d.getHint();
                    this.f6973e = hint;
                    setHint(hint);
                    this.f6971d.setHint((CharSequence) null);
                }
                this.L = true;
            }
            if (i12 >= 29) {
                p();
            }
            if (this.f7000v != null) {
                n(this.f6971d.getText());
            }
            r();
            this.f6990q.b();
            this.f6967b.bringToFront();
            this.f6969c.bringToFront();
            Iterator<f> it = this.f6982l0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            this.f6969c.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.K)) {
            this.K = charSequence;
            com.google.android.material.internal.c cVar = this.B0;
            if (charSequence == null || !TextUtils.equals(cVar.G, charSequence)) {
                cVar.G = charSequence;
                cVar.H = null;
                Bitmap bitmap = cVar.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.K = null;
                }
                cVar.i(false);
            }
            if (!this.A0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f7008z != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = this.A;
                if (appCompatTextView != null) {
                    this.f6965a.addView(appCompatTextView);
                    this.A.setVisibility(0);
                }
            } else {
                AppCompatTextView appCompatTextView2 = this.A;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setVisibility(8);
                }
                this.A = null;
            }
            this.f7008z = z10;
        }
    }

    public final void a(float f10) {
        if (this.B0.f6390b != f10) {
            if (this.E0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.E0 = valueAnimator;
                valueAnimator.setInterpolator(j.d(getContext(), R$attr.motionEasingEmphasizedInterpolator, t7.b.f14886b));
                this.E0.setDuration((long) j.c(getContext(), R$attr.motionDurationMedium4, 167));
                this.E0.addUpdateListener(new c());
            }
            this.E0.setFloatValues(new float[]{this.B0.f6390b, f10});
            this.E0.start();
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f6965a.addView(view, layoutParams2);
            this.f6965a.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            l8.h r0 = r6.M
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            l8.h$b r1 = r0.f12778a
            l8.m r1 = r1.f12798a
            l8.m r2 = r6.S
            if (r1 == r2) goto L_0x0010
            r0.setShapeAppearanceModel(r2)
        L_0x0010:
            int r0 = r6.V
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0027
            int r0 = r6.f6966a0
            if (r0 <= r2) goto L_0x0022
            int r0 = r6.f6972d0
            if (r0 == 0) goto L_0x0022
            r0 = r4
            goto L_0x0023
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 == 0) goto L_0x0027
            r0 = r4
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            if (r0 == 0) goto L_0x003b
            l8.h r0 = r6.M
            int r1 = r6.f6966a0
            float r1 = (float) r1
            int r5 = r6.f6972d0
            r0.t(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            r0.s(r1)
        L_0x003b:
            int r0 = r6.f6974e0
            int r1 = r6.V
            if (r1 != r4) goto L_0x0051
            int r0 = com.google.android.material.R$attr.colorSurface
            android.content.Context r1 = r6.getContext()
            int r0 = m9.b.B(r1, r0, r3)
            int r1 = r6.f6974e0
            int r0 = n1.d.c(r1, r0)
        L_0x0051:
            r6.f6974e0 = r0
            l8.h r1 = r6.M
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.n(r0)
            l8.h r0 = r6.Q
            if (r0 == 0) goto L_0x0096
            l8.h r1 = r6.R
            if (r1 != 0) goto L_0x0065
            goto L_0x0096
        L_0x0065:
            int r1 = r6.f6966a0
            if (r1 <= r2) goto L_0x006e
            int r1 = r6.f6972d0
            if (r1 == 0) goto L_0x006e
            r3 = r4
        L_0x006e:
            if (r3 == 0) goto L_0x0093
            android.widget.EditText r1 = r6.f6971d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x007f
            int r1 = r6.f6993r0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L_0x0085
        L_0x007f:
            int r1 = r6.f6972d0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L_0x0085:
            r0.n(r1)
            l8.h r0 = r6.R
            int r1 = r6.f6972d0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.n(r1)
        L_0x0093:
            r6.invalidate()
        L_0x0096:
            r6.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float e10;
        if (!this.J) {
            return 0;
        }
        int i10 = this.V;
        if (i10 == 0) {
            e10 = this.B0.e();
        } else if (i10 != 2) {
            return 0;
        } else {
            e10 = this.B0.e() / 2.0f;
        }
        return (int) e10;
    }

    public final Fade d() {
        Fade fade = new Fade();
        fade.f3433c = (long) j.c(getContext(), R$attr.motionDurationShort2, 87);
        fade.f3434d = j.d(getContext(), R$attr.motionEasingLinearInterpolator, t7.b.f14885a);
        return fade;
    }

    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f6971d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f6973e != null) {
            boolean z10 = this.L;
            this.L = false;
            CharSequence hint = editText.getHint();
            this.f6971d.setHint(this.f6973e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.f6971d.setHint(hint);
                this.L = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.f6965a.getChildCount());
            for (int i11 = 0; i11 < this.f6965a.getChildCount(); i11++) {
                View childAt = this.f6965a.getChildAt(i11);
                ViewStructure newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.f6971d) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.G0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.G0 = false;
    }

    public final void draw(Canvas canvas) {
        h hVar;
        super.draw(canvas);
        if (this.J) {
            this.B0.d(canvas);
        }
        if (this.R != null && (hVar = this.Q) != null) {
            hVar.draw(canvas);
            if (this.f6971d.isFocused()) {
                Rect bounds = this.R.getBounds();
                Rect bounds2 = this.Q.getBounds();
                float f10 = this.B0.f6390b;
                int centerX = bounds2.centerX();
                bounds.left = t7.b.b(f10, centerX, bounds2.left);
                bounds.right = t7.b.b(f10, centerX, bounds2.right);
                this.R.draw(canvas);
            }
        }
    }

    public final void drawableStateChanged() {
        boolean z10;
        if (!this.F0) {
            boolean z11 = true;
            this.F0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.c cVar = this.B0;
            if (cVar != null) {
                z10 = cVar.r(drawableState) | false;
            } else {
                z10 = false;
            }
            if (this.f6971d != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (!d0.g.c(this) || !isEnabled()) {
                    z11 = false;
                }
                u(z11, false);
            }
            r();
            x();
            if (z10) {
                invalidate();
            }
            this.F0 = false;
        }
    }

    public final boolean e() {
        if (!this.J || TextUtils.isEmpty(this.K) || !(this.M instanceof g)) {
            return false;
        }
        return true;
    }

    public final h f(boolean z10) {
        float f10;
        float f11;
        int i10;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R$dimen.mtrl_shape_corner_size_small_component);
        if (z10) {
            f10 = dimensionPixelOffset;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f6971d;
        if (editText instanceof MaterialAutoCompleteTextView) {
            f11 = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            f11 = (float) getResources().getDimensionPixelOffset(R$dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        m.a aVar = new m.a();
        aVar.e(f10);
        aVar.f(f10);
        aVar.c(dimensionPixelOffset);
        aVar.d(dimensionPixelOffset);
        m mVar = new m(aVar);
        ColorStateList colorStateList = null;
        EditText editText2 = this.f6971d;
        if (editText2 instanceof MaterialAutoCompleteTextView) {
            colorStateList = ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList();
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = h.E;
            TypedValue c10 = i8.b.c(R$attr.colorSurface, context, h.class.getSimpleName());
            int i11 = c10.resourceId;
            if (i11 != 0) {
                i10 = k1.a.getColor(context, i11);
            } else {
                i10 = c10.data;
            }
            colorStateList = ColorStateList.valueOf(i10);
        }
        h hVar = new h();
        hVar.k(context);
        hVar.n(colorStateList);
        hVar.m(f11);
        hVar.setShapeAppearanceModel(mVar);
        h.b bVar = hVar.f12778a;
        if (bVar.f12805h == null) {
            bVar.f12805h = new Rect();
        }
        hVar.f12778a.f12805h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        hVar.invalidateSelf();
        return hVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (!z10 && getPrefixText() != null) {
            compoundPaddingLeft = this.f6967b.a();
        } else if (!z10 || getSuffixText() == null) {
            compoundPaddingLeft = this.f6971d.getCompoundPaddingLeft();
        } else {
            compoundPaddingLeft = this.f6969c.c();
        }
        return compoundPaddingLeft + i10;
    }

    public int getBaseline() {
        EditText editText = this.f6971d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public h getBoxBackground() {
        int i10 = this.V;
        if (i10 == 1 || i10 == 2) {
            return this.M;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6974e0;
    }

    public int getBoxBackgroundMode() {
        return this.V;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.W;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (x.g(this)) {
            return this.S.f12832h.a(this.f6978h0);
        }
        return this.S.f12831g.a(this.f6978h0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (x.g(this)) {
            return this.S.f12831g.a(this.f6978h0);
        }
        return this.S.f12832h.a(this.f6978h0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (x.g(this)) {
            return this.S.f12829e.a(this.f6978h0);
        }
        return this.S.f12830f.a(this.f6978h0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (x.g(this)) {
            return this.S.f12830f.a(this.f6978h0);
        }
        return this.S.f12829e.a(this.f6978h0);
    }

    public int getBoxStrokeColor() {
        return this.f6997t0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f6999u0;
    }

    public int getBoxStrokeWidth() {
        return this.f6968b0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f6970c0;
    }

    public int getCounterMaxLength() {
        return this.f6994s;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (!this.f6992r || !this.f6996t || (appCompatTextView = this.f7000v) == null) {
            return null;
        }
        return appCompatTextView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.G;
    }

    public ColorStateList getCounterTextColor() {
        return this.F;
    }

    public ColorStateList getCursorColor() {
        return this.H;
    }

    public ColorStateList getCursorErrorColor() {
        return this.I;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f6989p0;
    }

    public EditText getEditText() {
        return this.f6971d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f6969c.f7054n.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f6969c.f7054n.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f6969c.f7060t;
    }

    public int getEndIconMode() {
        return this.f6969c.f7056p;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f6969c.f7061u;
    }

    public CheckableImageButton getEndIconView() {
        return this.f6969c.f7054n;
    }

    public CharSequence getError() {
        q qVar = this.f6990q;
        if (qVar.f7100q) {
            return qVar.f7099p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f6990q.f7103t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f6990q.f7102s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f6990q.f7101r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f6969c.f7050c.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.f6990q;
        if (qVar.f7107x) {
            return qVar.f7106w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f6990q.f7108y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.J) {
            return this.K;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.B0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.c cVar = this.B0;
        return cVar.f(cVar.f6416o);
    }

    public ColorStateList getHintTextColor() {
        return this.f6991q0;
    }

    public e getLengthCounter() {
        return this.f6998u;
    }

    public int getMaxEms() {
        return this.f6984n;
    }

    public int getMaxWidth() {
        return this.f6988p;
    }

    public int getMinEms() {
        return this.f6975f;
    }

    public int getMinWidth() {
        return this.f6986o;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f6969c.f7054n.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f6969c.f7054n.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f7008z) {
            return this.f7006y;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.C;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.B;
    }

    public CharSequence getPrefixText() {
        return this.f6967b.f7115c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6967b.f7114b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f6967b.f7114b;
    }

    public m getShapeAppearanceModel() {
        return this.S;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6967b.f7116d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f6967b.f7116d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f6967b.f7119n;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f6967b.f7120o;
    }

    public CharSequence getSuffixText() {
        return this.f6969c.f7063w;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f6969c.f7064x.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f6969c.f7064x;
    }

    public Typeface getTypeface() {
        return this.f6979i0;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight;
        if (!z10 && getSuffixText() != null) {
            compoundPaddingRight = this.f6969c.c();
        } else if (!z10 || getPrefixText() == null) {
            compoundPaddingRight = this.f6971d.getCompoundPaddingRight();
        } else {
            compoundPaddingRight = this.f6967b.a();
        }
        return i10 - compoundPaddingRight;
    }

    public final void i() {
        boolean z10;
        int i10 = this.V;
        if (i10 == 0) {
            this.M = null;
            this.Q = null;
            this.R = null;
        } else if (i10 == 1) {
            this.M = new h(this.S);
            this.Q = new h();
            this.R = new h();
        } else if (i10 == 2) {
            if (!this.J || (this.M instanceof g)) {
                this.M = new h(this.S);
            } else {
                m mVar = this.S;
                int i11 = g.G;
                if (mVar == null) {
                    mVar = new m();
                }
                this.M = new g.b(new g.a(mVar, new RectF()));
            }
            this.Q = null;
            this.R = null;
        } else {
            throw new IllegalArgumentException(v.e(new StringBuilder(), this.V, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        s();
        x();
        boolean z11 = false;
        if (this.V == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.W = getResources().getDimensionPixelSize(R$dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (i8.c.e(getContext())) {
                this.W = getResources().getDimensionPixelSize(R$dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f6971d != null && this.V == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z11 = true;
            }
            if (z11) {
                EditText editText = this.f6971d;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.e.k(editText, d0.e.f(editText), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_2_0_padding_top), d0.e.e(this.f6971d), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (i8.c.e(getContext())) {
                EditText editText2 = this.f6971d;
                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                d0.e.k(editText2, d0.e.f(editText2), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_top), d0.e.e(this.f6971d), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.V != 0) {
            t();
        }
        EditText editText3 = this.f6971d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.V;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r12.f6978h0
            com.google.android.material.internal.c r1 = r12.B0
            android.widget.EditText r2 = r12.f6971d
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r12.f6971d
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.G
            boolean r4 = r1.b(r4)
            r1.I = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 17
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 5
            if (r3 == r7) goto L_0x0057
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x0057
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x0047
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x0047
        L_0x0038:
            if (r4 == 0) goto L_0x0042
            android.graphics.Rect r4 = r1.f6402h
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.f6407j0
            goto L_0x005c
        L_0x0042:
            android.graphics.Rect r4 = r1.f6402h
            int r4 = r4.left
            goto L_0x004d
        L_0x0047:
            if (r4 == 0) goto L_0x004f
            android.graphics.Rect r4 = r1.f6402h
            int r4 = r4.left
        L_0x004d:
            float r4 = (float) r4
            goto L_0x005d
        L_0x004f:
            android.graphics.Rect r4 = r1.f6402h
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.f6407j0
            goto L_0x005c
        L_0x0057:
            float r4 = (float) r2
            float r4 = r4 / r8
            float r10 = r1.f6407j0
            float r10 = r10 / r8
        L_0x005c:
            float r4 = r4 - r10
        L_0x005d:
            android.graphics.Rect r10 = r1.f6402h
            int r10 = r10.left
            float r10 = (float) r10
            float r4 = java.lang.Math.max(r4, r10)
            r0.left = r4
            android.graphics.Rect r10 = r1.f6402h
            int r11 = r10.top
            float r11 = (float) r11
            r0.top = r11
            if (r3 == r7) goto L_0x0096
            r7 = r3 & 7
            if (r7 != r6) goto L_0x0076
            goto L_0x0096
        L_0x0076:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x008a
            r2 = r3 & 5
            if (r2 != r9) goto L_0x007f
            goto L_0x008a
        L_0x007f:
            boolean r2 = r1.I
            if (r2 == 0) goto L_0x0086
            int r2 = r10.right
            goto L_0x0094
        L_0x0086:
            float r2 = r1.f6407j0
            float r2 = r2 + r4
            goto L_0x009c
        L_0x008a:
            boolean r2 = r1.I
            if (r2 == 0) goto L_0x0092
            float r2 = r1.f6407j0
            float r2 = r2 + r4
            goto L_0x009c
        L_0x0092:
            int r2 = r10.right
        L_0x0094:
            float r2 = (float) r2
            goto L_0x009c
        L_0x0096:
            float r2 = (float) r2
            float r2 = r2 / r8
            float r3 = r1.f6407j0
            float r3 = r3 / r8
            float r2 = r2 + r3
        L_0x009c:
            int r3 = r10.right
            float r3 = (float) r3
            float r2 = java.lang.Math.min(r2, r3)
            r0.right = r2
            android.graphics.Rect r2 = r1.f6402h
            int r2 = r2.top
            float r2 = (float) r2
            float r1 = r1.e()
            float r1 = r1 + r2
            r0.bottom = r1
            float r1 = r0.width()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00fb
            float r1 = r0.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00c3
            goto L_0x00fb
        L_0x00c3:
            float r1 = r0.left
            int r2 = r12.U
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r12.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r12.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            float r3 = r3 / r8
            float r2 = r2 - r3
            int r3 = r12.f6966a0
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            l8.h r1 = r12.M
            com.google.android.material.textfield.g r1 = (com.google.android.material.textfield.g) r1
            r1.getClass()
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.x(r2, r3, r4, r0)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i10) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(R$style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(k1.a.getColor(getContext(), R$color.design_error));
        }
    }

    public final boolean m() {
        q qVar = this.f6990q;
        if (qVar.f7098o != 1 || qVar.f7101r == null || TextUtils.isEmpty(qVar.f7099p)) {
            return false;
        }
        return true;
    }

    public final void n(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        ((i0) this.f6998u).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z11 = this.f6996t;
        int i12 = this.f6994s;
        String str = null;
        if (i12 == -1) {
            this.f7000v.setText(String.valueOf(i10));
            this.f7000v.setContentDescription((CharSequence) null);
            this.f6996t = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6996t = z10;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f7000v;
            int i13 = this.f6994s;
            if (this.f6996t) {
                i11 = R$string.character_counter_overflowed_content_description;
            } else {
                i11 = R$string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i11, new Object[]{Integer.valueOf(i10), Integer.valueOf(i13)}));
            if (z11 != this.f6996t) {
                o();
            }
            u1.a c10 = u1.a.c();
            AppCompatTextView appCompatTextView2 = this.f7000v;
            String string = getContext().getString(R$string.character_counter_pattern, new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f6994s)});
            u1.e eVar = c10.f15045c;
            if (string != null) {
                str = c10.d(string, eVar).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f6971d != null && z11 != this.f6996t) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f7000v;
        if (appCompatTextView != null) {
            if (this.f6996t) {
                i10 = this.f7002w;
            } else {
                i10 = this.f7004x;
            }
            l(appCompatTextView, i10);
            if (!this.f6996t && (colorStateList2 = this.F) != null) {
                this.f7000v.setTextColor(colorStateList2);
            }
            if (this.f6996t && (colorStateList = this.G) != null) {
                this.f7000v.setTextColor(colorStateList);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.h(configuration);
    }

    public final void onGlobalLayout() {
        int max;
        this.f6969c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.H0 = false;
        if (this.f6971d != null && this.f6971d.getMeasuredHeight() < (max = Math.max(this.f6969c.getMeasuredHeight(), this.f6967b.getMeasuredHeight()))) {
            this.f6971d.setMinimumHeight(max);
            z10 = true;
        }
        boolean q10 = q();
        if (z10 || q10) {
            this.f6971d.post(new d.d(this, 27));
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f6971d;
        if (editText != null) {
            Rect rect = this.f6976f0;
            com.google.android.material.internal.d.a(this, editText, rect);
            h hVar = this.Q;
            if (hVar != null) {
                int i16 = rect.bottom;
                hVar.setBounds(rect.left, i16 - this.f6968b0, rect.right, i16);
            }
            h hVar2 = this.R;
            if (hVar2 != null) {
                int i17 = rect.bottom;
                hVar2.setBounds(rect.left, i17 - this.f6970c0, rect.right, i17);
            }
            if (this.J) {
                com.google.android.material.internal.c cVar = this.B0;
                float textSize = this.f6971d.getTextSize();
                if (cVar.f6410l != textSize) {
                    cVar.f6410l = textSize;
                    cVar.i(false);
                }
                int gravity = this.f6971d.getGravity();
                this.B0.l((gravity & -113) | 48);
                com.google.android.material.internal.c cVar2 = this.B0;
                if (cVar2.f6406j != gravity) {
                    cVar2.f6406j = gravity;
                    cVar2.i(false);
                }
                com.google.android.material.internal.c cVar3 = this.B0;
                if (this.f6971d != null) {
                    Rect rect2 = this.f6977g0;
                    boolean g2 = x.g(this);
                    rect2.bottom = rect.bottom;
                    int i18 = this.V;
                    if (i18 == 1) {
                        rect2.left = g(rect.left, g2);
                        rect2.top = rect.top + this.W;
                        rect2.right = h(rect.right, g2);
                    } else if (i18 != 2) {
                        rect2.left = g(rect.left, g2);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, g2);
                    } else {
                        rect2.left = this.f6971d.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.f6971d.getPaddingRight();
                    }
                    cVar3.getClass();
                    int i19 = rect2.left;
                    int i20 = rect2.top;
                    int i21 = rect2.right;
                    int i22 = rect2.bottom;
                    Rect rect3 = cVar3.f6402h;
                    if (rect3.left == i19 && rect3.top == i20 && rect3.right == i21 && rect3.bottom == i22) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        rect3.set(i19, i20, i21, i22);
                        cVar3.S = true;
                    }
                    com.google.android.material.internal.c cVar4 = this.B0;
                    if (this.f6971d != null) {
                        Rect rect4 = this.f6977g0;
                        TextPaint textPaint = cVar4.U;
                        textPaint.setTextSize(cVar4.f6410l);
                        textPaint.setTypeface(cVar4.f6430z);
                        textPaint.setLetterSpacing(cVar4.f6401g0);
                        float f10 = -cVar4.U.ascent();
                        rect4.left = this.f6971d.getCompoundPaddingLeft() + rect.left;
                        if (this.V != 1 || this.f6971d.getMinLines() > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            i14 = (int) (((float) rect.centerY()) - (f10 / 2.0f));
                        } else {
                            i14 = rect.top + this.f6971d.getCompoundPaddingTop();
                        }
                        rect4.top = i14;
                        rect4.right = rect.right - this.f6971d.getCompoundPaddingRight();
                        if (this.V != 1 || this.f6971d.getMinLines() > 1) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                            i15 = (int) (((float) rect4.top) + f10);
                        } else {
                            i15 = rect.bottom - this.f6971d.getCompoundPaddingBottom();
                        }
                        rect4.bottom = i15;
                        int i23 = rect4.left;
                        int i24 = rect4.top;
                        int i25 = rect4.right;
                        Rect rect5 = cVar4.f6400g;
                        if (rect5.left == i23 && rect5.top == i24 && rect5.right == i25 && rect5.bottom == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            rect5.set(i23, i24, i25, i15);
                            cVar4.S = true;
                        }
                        this.B0.i(false);
                        if (e() && !this.A0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        EditText editText;
        super.onMeasure(i10, i11);
        if (!this.H0) {
            this.f6969c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (!(this.A == null || (editText = this.f6971d) == null)) {
            this.A.setGravity(editText.getGravity());
            this.A.setPadding(this.f6971d.getCompoundPaddingLeft(), this.f6971d.getCompoundPaddingTop(), this.f6971d.getCompoundPaddingRight(), this.f6971d.getCompoundPaddingBottom());
        }
        this.f6969c.m();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        setError(savedState.f7010c);
        if (savedState.f7011d) {
            post(new b());
        }
        requestLayout();
    }

    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.T) {
            float a10 = this.S.f12829e.a(this.f6978h0);
            float a11 = this.S.f12830f.a(this.f6978h0);
            float a12 = this.S.f12832h.a(this.f6978h0);
            float a13 = this.S.f12831g.a(this.f6978h0);
            m mVar = this.S;
            lb.b bVar = mVar.f12825a;
            lb.b bVar2 = mVar.f12826b;
            lb.b bVar3 = mVar.f12828d;
            lb.b bVar4 = mVar.f12827c;
            m.a aVar = new m.a();
            aVar.f12837a = bVar2;
            float a14 = m.a.a(bVar2);
            if (a14 != -1.0f) {
                aVar.e(a14);
            }
            aVar.f12838b = bVar;
            float a15 = m.a.a(bVar);
            if (a15 != -1.0f) {
                aVar.f(a15);
            }
            aVar.f12840d = bVar4;
            float a16 = m.a.a(bVar4);
            if (a16 != -1.0f) {
                aVar.c(a16);
            }
            aVar.f12839c = bVar3;
            float a17 = m.a.a(bVar3);
            if (a17 != -1.0f) {
                aVar.d(a17);
            }
            aVar.e(a11);
            aVar.f(a10);
            aVar.c(a13);
            aVar.d(a12);
            m mVar2 = new m(aVar);
            this.T = z10;
            setShapeAppearanceModel(mVar2);
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.f7010c = getError();
        }
        l lVar = this.f6969c;
        boolean z11 = true;
        if (lVar.f7056p != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !lVar.f7054n.isChecked()) {
            z11 = false;
        }
        savedState.f7011d = z11;
        return savedState;
    }

    public final void p() {
        boolean z10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.H;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue a10 = i8.b.a(context, R$attr.colorControlActivated);
            if (a10 != null) {
                int i10 = a10.resourceId;
                if (i10 != 0) {
                    colorStateList2 = k1.a.getColorStateList(context, i10);
                } else {
                    int i11 = a10.data;
                    if (i11 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i11);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f6971d;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = this.f6971d.getTextCursorDrawable().mutate();
            if (m() || (this.f7000v != null && this.f6996t)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (colorStateList = this.I) != null) {
                colorStateList2 = colorStateList;
            }
            a.b.h(mutate, colorStateList2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        if (r6.d() != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        if (r10.f6969c.f7063w != null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f6971d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x001d
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x0027
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
        L_0x001d:
            com.google.android.material.textfield.t r0 = r10.f6967b
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0027
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r3 = 2
            r4 = 0
            r5 = 3
            if (r0 == 0) goto L_0x0066
            com.google.android.material.textfield.t r0 = r10.f6967b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f6971d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f6980j0
            if (r6 == 0) goto L_0x0042
            int r6 = r10.f6981k0
            if (r6 == r0) goto L_0x004e
        L_0x0042:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f6980j0 = r6
            r10.f6981k0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x004e:
            android.widget.EditText r0 = r10.f6971d
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.k.b.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f6980j0
            if (r6 == r7) goto L_0x007f
            android.widget.EditText r6 = r10.f6971d
            r8 = r0[r2]
            r9 = r0[r3]
            r0 = r0[r5]
            androidx.core.widget.k.b.e(r6, r7, r8, r9, r0)
            goto L_0x007d
        L_0x0066:
            android.graphics.drawable.ColorDrawable r0 = r10.f6980j0
            if (r0 == 0) goto L_0x007f
            android.widget.EditText r0 = r10.f6971d
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.k.b.a(r0)
            android.widget.EditText r6 = r10.f6971d
            r7 = r0[r2]
            r8 = r0[r3]
            r0 = r0[r5]
            androidx.core.widget.k.b.e(r6, r4, r7, r8, r0)
            r10.f6980j0 = r4
        L_0x007d:
            r0 = r2
            goto L_0x0080
        L_0x007f:
            r0 = r1
        L_0x0080:
            com.google.android.material.textfield.l r6 = r10.f6969c
            boolean r6 = r6.e()
            if (r6 != 0) goto L_0x009f
            com.google.android.material.textfield.l r6 = r10.f6969c
            int r7 = r6.f7056p
            if (r7 == 0) goto L_0x0090
            r7 = r2
            goto L_0x0091
        L_0x0090:
            r7 = r1
        L_0x0091:
            if (r7 == 0) goto L_0x0099
            boolean r6 = r6.d()
            if (r6 != 0) goto L_0x009f
        L_0x0099:
            com.google.android.material.textfield.l r6 = r10.f6969c
            java.lang.CharSequence r6 = r6.f7063w
            if (r6 == 0) goto L_0x00a9
        L_0x009f:
            com.google.android.material.textfield.l r6 = r10.f6969c
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x00a9
            r6 = r2
            goto L_0x00aa
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            if (r6 == 0) goto L_0x012f
            com.google.android.material.textfield.l r6 = r10.f6969c
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f7064x
            int r6 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f6971d
            int r7 = r7.getPaddingRight()
            int r6 = r6 - r7
            com.google.android.material.textfield.l r7 = r10.f6969c
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x00c6
            com.google.android.material.internal.CheckableImageButton r4 = r7.f7050c
            goto L_0x00d7
        L_0x00c6:
            int r8 = r7.f7056p
            if (r8 == 0) goto L_0x00cc
            r8 = r2
            goto L_0x00cd
        L_0x00cc:
            r8 = r1
        L_0x00cd:
            if (r8 == 0) goto L_0x00d7
            boolean r8 = r7.d()
            if (r8 == 0) goto L_0x00d7
            com.google.android.material.internal.CheckableImageButton r4 = r7.f7054n
        L_0x00d7:
            if (r4 == 0) goto L_0x00ea
            int r7 = r4.getMeasuredWidth()
            int r7 = r7 + r6
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r4 = w1.g.c(r4)
            int r6 = r4 + r7
        L_0x00ea:
            android.widget.EditText r4 = r10.f6971d
            android.graphics.drawable.Drawable[] r4 = androidx.core.widget.k.b.a(r4)
            android.graphics.drawable.ColorDrawable r7 = r10.f6983m0
            if (r7 == 0) goto L_0x010b
            int r8 = r10.f6985n0
            if (r8 == r6) goto L_0x010b
            r10.f6985n0 = r6
            r7.setBounds(r1, r1, r6, r2)
            android.widget.EditText r0 = r10.f6971d
            r1 = r4[r1]
            r3 = r4[r2]
            android.graphics.drawable.ColorDrawable r6 = r10.f6983m0
            r4 = r4[r5]
            androidx.core.widget.k.b.e(r0, r1, r3, r6, r4)
            goto L_0x0150
        L_0x010b:
            if (r7 != 0) goto L_0x0119
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f6983m0 = r7
            r10.f6985n0 = r6
            r7.setBounds(r1, r1, r6, r2)
        L_0x0119:
            r3 = r4[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f6983m0
            if (r3 == r6) goto L_0x012d
            r10.f6987o0 = r3
            android.widget.EditText r0 = r10.f6971d
            r1 = r4[r1]
            r3 = r4[r2]
            r4 = r4[r5]
            androidx.core.widget.k.b.e(r0, r1, r3, r6, r4)
            goto L_0x0150
        L_0x012d:
            r2 = r0
            goto L_0x0150
        L_0x012f:
            android.graphics.drawable.ColorDrawable r6 = r10.f6983m0
            if (r6 == 0) goto L_0x0151
            android.widget.EditText r6 = r10.f6971d
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.k.b.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f6983m0
            if (r3 != r7) goto L_0x014d
            android.widget.EditText r0 = r10.f6971d
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f6987o0
            r5 = r6[r5]
            androidx.core.widget.k.b.e(r0, r1, r3, r7, r5)
            goto L_0x014e
        L_0x014d:
            r2 = r0
        L_0x014e:
            r10.f6983m0 = r4
        L_0x0150:
            r0 = r2
        L_0x0151:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f6971d;
        if (editText != null && this.V == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = androidx.appcompat.widget.x.f1237a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(androidx.appcompat.widget.g.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f6996t || (appCompatTextView = this.f7000v) == null) {
                mutate.clearColorFilter();
                this.f6971d.refreshDrawableState();
            } else {
                mutate.setColorFilter(androidx.appcompat.widget.g.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void s() {
        EditText editText = this.f6971d;
        if (editText != null && this.M != null) {
            if ((this.P || editText.getBackground() == null) && this.V != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.f6971d;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.q(editText2, editTextBoxBackground);
                this.P = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f6974e0 != i10) {
            this.f6974e0 = i10;
            this.f7001v0 = i10;
            this.f7005x0 = i10;
            this.f7007y0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(k1.a.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f7001v0 = defaultColor;
        this.f6974e0 = defaultColor;
        this.f7003w0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f7005x0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f7007y0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.V) {
            this.V = i10;
            if (this.f6971d != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.W = i10;
    }

    public void setBoxCornerFamily(int i10) {
        m mVar = this.S;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        l8.d dVar = this.S.f12829e;
        lb.b o10 = m9.b.o(i10);
        aVar.f12837a = o10;
        float a10 = m.a.a(o10);
        if (a10 != -1.0f) {
            aVar.e(a10);
        }
        aVar.f12841e = dVar;
        l8.d dVar2 = this.S.f12830f;
        lb.b o11 = m9.b.o(i10);
        aVar.f12838b = o11;
        float a11 = m.a.a(o11);
        if (a11 != -1.0f) {
            aVar.f(a11);
        }
        aVar.f12842f = dVar2;
        l8.d dVar3 = this.S.f12832h;
        lb.b o12 = m9.b.o(i10);
        aVar.f12840d = o12;
        float a12 = m.a.a(o12);
        if (a12 != -1.0f) {
            aVar.c(a12);
        }
        aVar.f12844h = dVar3;
        l8.d dVar4 = this.S.f12831g;
        lb.b o13 = m9.b.o(i10);
        aVar.f12839c = o13;
        float a13 = m.a.a(o13);
        if (a13 != -1.0f) {
            aVar.d(a13);
        }
        aVar.f12843g = dVar4;
        this.S = new m(aVar);
        b();
    }

    public void setBoxCornerRadii(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        boolean g2 = x.g(this);
        this.T = g2;
        if (g2) {
            f14 = f11;
        } else {
            f14 = f10;
        }
        if (!g2) {
            f10 = f11;
        }
        if (g2) {
            f15 = f13;
        } else {
            f15 = f12;
        }
        if (!g2) {
            f12 = f13;
        }
        h hVar = this.M;
        if (hVar != null && hVar.j() == f14) {
            h hVar2 = this.M;
            if (hVar2.f12778a.f12798a.f12830f.a(hVar2.h()) == f10) {
                h hVar3 = this.M;
                if (hVar3.f12778a.f12798a.f12832h.a(hVar3.h()) == f15) {
                    h hVar4 = this.M;
                    if (hVar4.f12778a.f12798a.f12831g.a(hVar4.h()) == f12) {
                        return;
                    }
                }
            }
        }
        m mVar = this.S;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        aVar.e(f14);
        aVar.f(f10);
        aVar.c(f15);
        aVar.d(f12);
        this.S = new m(aVar);
        b();
    }

    public void setBoxCornerRadiiResources(int i10, int i11, int i12, int i13) {
        setBoxCornerRadii(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f6997t0 != i10) {
            this.f6997t0 = i10;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f6993r0 = colorStateList.getDefaultColor();
            this.f7009z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f6995s0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f6997t0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f6997t0 != colorStateList.getDefaultColor()) {
            this.f6997t0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f6999u0 != colorStateList) {
            this.f6999u0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f6968b0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f6970c0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f6992r != z10) {
            Editable editable = null;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f7000v = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_counter);
                Typeface typeface = this.f6979i0;
                if (typeface != null) {
                    this.f7000v.setTypeface(typeface);
                }
                this.f7000v.setMaxLines(1);
                this.f6990q.a(this.f7000v, 2);
                w1.g.h((ViewGroup.MarginLayoutParams) this.f7000v.getLayoutParams(), getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f7000v != null) {
                    EditText editText = this.f6971d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                this.f6990q.g(this.f7000v, 2);
                this.f7000v = null;
            }
            this.f6992r = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable editable;
        if (this.f6994s != i10) {
            if (i10 > 0) {
                this.f6994s = i10;
            } else {
                this.f6994s = -1;
            }
            if (this.f6992r && this.f7000v != null) {
                EditText editText = this.f6971d;
                if (editText == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                n(editable);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f7002w != i10) {
            this.f7002w = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f7004x != i10) {
            this.f7004x = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        boolean z10;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (m() || (this.f7000v != null && this.f6996t)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f6989p0 = colorStateList;
        this.f6991q0 = colorStateList;
        if (this.f6971d != null) {
            u(false, false);
        }
    }

    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f6969c.f7054n.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f6969c.f7054n.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        l lVar = this.f6969c;
        CharSequence text = i10 != 0 ? lVar.getResources().getText(i10) : null;
        if (lVar.f7054n.getContentDescription() != text) {
            lVar.f7054n.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        l lVar = this.f6969c;
        Drawable a10 = i10 != 0 ? h.a.a(lVar.getContext(), i10) : null;
        lVar.f7054n.setImageDrawable(a10);
        if (a10 != null) {
            n.a(lVar.f7048a, lVar.f7054n, lVar.f7058r, lVar.f7059s);
            n.c(lVar.f7048a, lVar.f7054n, lVar.f7058r);
        }
    }

    public void setEndIconMinSize(int i10) {
        l lVar = this.f6969c;
        if (i10 < 0) {
            lVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i10 != lVar.f7060t) {
            lVar.f7060t = i10;
            CheckableImageButton checkableImageButton = lVar.f7054n;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = lVar.f7050c;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f6969c.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f6969c;
        CheckableImageButton checkableImageButton = lVar.f7054n;
        View.OnLongClickListener onLongClickListener = lVar.f7062v;
        checkableImageButton.setOnClickListener(onClickListener);
        n.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f6969c;
        lVar.f7062v = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f7054n;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        n.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        l lVar = this.f6969c;
        lVar.f7061u = scaleType;
        lVar.f7054n.setScaleType(scaleType);
        lVar.f7050c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        l lVar = this.f6969c;
        if (lVar.f7058r != colorStateList) {
            lVar.f7058r = colorStateList;
            n.a(lVar.f7048a, lVar.f7054n, colorStateList, lVar.f7059s);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f6969c;
        if (lVar.f7059s != mode) {
            lVar.f7059s = mode;
            n.a(lVar.f7048a, lVar.f7054n, lVar.f7058r, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f6969c.h(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f6990q.f7100q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            q qVar = this.f6990q;
            qVar.c();
            qVar.f7099p = charSequence;
            qVar.f7101r.setText(charSequence);
            int i10 = qVar.f7097n;
            if (i10 != 1) {
                qVar.f7098o = 1;
            }
            qVar.i(qVar.h(qVar.f7101r, charSequence), i10, qVar.f7098o);
            return;
        }
        this.f6990q.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        q qVar = this.f6990q;
        qVar.f7103t = i10;
        AppCompatTextView appCompatTextView = qVar.f7101r;
        if (appCompatTextView != null) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.g.f(appCompatTextView, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f6990q;
        qVar.f7102s = charSequence;
        AppCompatTextView appCompatTextView = qVar.f7101r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        q qVar = this.f6990q;
        if (qVar.f7100q != z10) {
            qVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.f7090g);
                qVar.f7101r = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_error);
                qVar.f7101r.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f7101r.setTypeface(typeface);
                }
                int i10 = qVar.f7104u;
                qVar.f7104u = i10;
                AppCompatTextView appCompatTextView2 = qVar.f7101r;
                if (appCompatTextView2 != null) {
                    qVar.f7091h.l(appCompatTextView2, i10);
                }
                ColorStateList colorStateList = qVar.f7105v;
                qVar.f7105v = colorStateList;
                AppCompatTextView appCompatTextView3 = qVar.f7101r;
                if (!(appCompatTextView3 == null || colorStateList == null)) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = qVar.f7102s;
                qVar.f7102s = charSequence;
                AppCompatTextView appCompatTextView4 = qVar.f7101r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i11 = qVar.f7103t;
                qVar.f7103t = i11;
                AppCompatTextView appCompatTextView5 = qVar.f7101r;
                if (appCompatTextView5 != null) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.g.f(appCompatTextView5, i11);
                }
                qVar.f7101r.setVisibility(4);
                qVar.a(qVar.f7101r, 0);
            } else {
                qVar.f();
                qVar.g(qVar.f7101r, 0);
                qVar.f7101r = null;
                qVar.f7091h.r();
                qVar.f7091h.x();
            }
            qVar.f7100q = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        l lVar = this.f6969c;
        lVar.i(i10 != 0 ? h.a.a(lVar.getContext(), i10) : null);
        n.c(lVar.f7048a, lVar.f7050c, lVar.f7051d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f6969c;
        CheckableImageButton checkableImageButton = lVar.f7050c;
        View.OnLongClickListener onLongClickListener = lVar.f7053f;
        checkableImageButton.setOnClickListener(onClickListener);
        n.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f6969c;
        lVar.f7053f = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f7050c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        n.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        l lVar = this.f6969c;
        if (lVar.f7051d != colorStateList) {
            lVar.f7051d = colorStateList;
            n.a(lVar.f7048a, lVar.f7050c, colorStateList, lVar.f7052e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f6969c;
        if (lVar.f7052e != mode) {
            lVar.f7052e = mode;
            n.a(lVar.f7048a, lVar.f7050c, lVar.f7051d, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        q qVar = this.f6990q;
        qVar.f7104u = i10;
        AppCompatTextView appCompatTextView = qVar.f7101r;
        if (appCompatTextView != null) {
            qVar.f7091h.l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f6990q;
        qVar.f7105v = colorStateList;
        AppCompatTextView appCompatTextView = qVar.f7101r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.C0 != z10) {
            this.C0 = z10;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f6990q.f7107x) {
                setHelperTextEnabled(true);
            }
            q qVar = this.f6990q;
            qVar.c();
            qVar.f7106w = charSequence;
            qVar.f7108y.setText(charSequence);
            int i10 = qVar.f7097n;
            if (i10 != 2) {
                qVar.f7098o = 2;
            }
            qVar.i(qVar.h(qVar.f7108y, charSequence), i10, qVar.f7098o);
        } else if (this.f6990q.f7107x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f6990q;
        qVar.A = colorStateList;
        AppCompatTextView appCompatTextView = qVar.f7108y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        q qVar = this.f6990q;
        if (qVar.f7107x != z10) {
            qVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.f7090g);
                qVar.f7108y = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_helper_text);
                qVar.f7108y.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f7108y.setTypeface(typeface);
                }
                qVar.f7108y.setVisibility(4);
                AppCompatTextView appCompatTextView2 = qVar.f7108y;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.g.f(appCompatTextView2, 1);
                int i10 = qVar.f7109z;
                qVar.f7109z = i10;
                AppCompatTextView appCompatTextView3 = qVar.f7108y;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i10);
                }
                ColorStateList colorStateList = qVar.A;
                qVar.A = colorStateList;
                AppCompatTextView appCompatTextView4 = qVar.f7108y;
                if (!(appCompatTextView4 == null || colorStateList == null)) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                qVar.a(qVar.f7108y, 1);
                qVar.f7108y.setAccessibilityDelegate(new p(qVar));
            } else {
                qVar.c();
                int i11 = qVar.f7097n;
                if (i11 == 2) {
                    qVar.f7098o = 0;
                }
                qVar.i(qVar.h(qVar.f7108y, ""), i11, qVar.f7098o);
                qVar.g(qVar.f7108y, 1);
                qVar.f7108y = null;
                qVar.f7091h.r();
                qVar.f7091h.x();
            }
            qVar.f7107x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        q qVar = this.f6990q;
        qVar.f7109z = i10;
        AppCompatTextView appCompatTextView = qVar.f7108y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.J) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.D0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.J) {
            this.J = z10;
            if (!z10) {
                this.L = false;
                if (!TextUtils.isEmpty(this.K) && TextUtils.isEmpty(this.f6971d.getHint())) {
                    this.f6971d.setHint(this.K);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f6971d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.K)) {
                        setHint(hint);
                    }
                    this.f6971d.setHint((CharSequence) null);
                }
                this.L = true;
            }
            if (this.f6971d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.B0.k(i10);
        this.f6991q0 = this.B0.f6416o;
        if (this.f6971d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f6991q0 != colorStateList) {
            if (this.f6989p0 == null) {
                com.google.android.material.internal.c cVar = this.B0;
                if (cVar.f6416o != colorStateList) {
                    cVar.f6416o = colorStateList;
                    cVar.i(false);
                }
            }
            this.f6991q0 = colorStateList;
            if (this.f6971d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f6998u = eVar;
    }

    public void setMaxEms(int i10) {
        this.f6984n = i10;
        EditText editText = this.f6971d;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f6988p = i10;
        EditText editText = this.f6971d;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f6975f = i10;
        EditText editText = this.f6971d;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f6986o = i10;
        EditText editText = this.f6971d;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        l lVar = this.f6969c;
        lVar.f7054n.setContentDescription(i10 != 0 ? lVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        l lVar = this.f6969c;
        lVar.f7054n.setImageDrawable(i10 != 0 ? h.a.a(lVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        l lVar = this.f6969c;
        if (z10 && lVar.f7056p != 1) {
            lVar.g(1);
        } else if (!z10) {
            lVar.g(0);
        } else {
            lVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        l lVar = this.f6969c;
        lVar.f7058r = colorStateList;
        n.a(lVar.f7048a, lVar.f7054n, colorStateList, lVar.f7059s);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        l lVar = this.f6969c;
        lVar.f7059s = mode;
        n.a(lVar.f7048a, lVar.f7054n, lVar.f7058r, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable;
        if (this.A == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.A = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.A;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.s(appCompatTextView2, 2);
            Fade d10 = d();
            this.D = d10;
            d10.f3432b = 67;
            this.E = d();
            setPlaceholderTextAppearance(this.C);
            setPlaceholderTextColor(this.B);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f7008z) {
                setPlaceholderTextEnabled(true);
            }
            this.f7006y = charSequence;
        }
        EditText editText = this.f6971d;
        if (editText == null) {
            editable = null;
        } else {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.C = i10;
        AppCompatTextView appCompatTextView = this.A;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            AppCompatTextView appCompatTextView = this.A;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        t tVar = this.f6967b;
        tVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        tVar.f7115c = charSequence2;
        tVar.f7114b.setText(charSequence);
        tVar.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f6967b.f7114b.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6967b.f7114b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(m mVar) {
        h hVar = this.M;
        if (hVar != null && hVar.f12778a.f12798a != mVar) {
            this.S = mVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f6967b.f7116d.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? h.a.a(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        t tVar = this.f6967b;
        if (i10 < 0) {
            tVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i10 != tVar.f7119n) {
            tVar.f7119n = i10;
            CheckableImageButton checkableImageButton = tVar.f7116d;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f6967b;
        CheckableImageButton checkableImageButton = tVar.f7116d;
        View.OnLongClickListener onLongClickListener = tVar.f7121p;
        checkableImageButton.setOnClickListener(onClickListener);
        n.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f6967b;
        tVar.f7121p = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.f7116d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        n.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        t tVar = this.f6967b;
        tVar.f7120o = scaleType;
        tVar.f7116d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f6967b;
        if (tVar.f7117e != colorStateList) {
            tVar.f7117e = colorStateList;
            n.a(tVar.f7113a, tVar.f7116d, colorStateList, tVar.f7118f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f6967b;
        if (tVar.f7118f != mode) {
            tVar.f7118f = mode;
            n.a(tVar.f7113a, tVar.f7116d, tVar.f7117e, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f6967b.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        l lVar = this.f6969c;
        lVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        lVar.f7063w = charSequence2;
        lVar.f7064x.setText(charSequence);
        lVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f6969c.f7064x.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f6969c.f7064x.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f6971d;
        if (editText != null) {
            d0.o(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f6979i0) {
            this.f6979i0 = typeface;
            com.google.android.material.internal.c cVar = this.B0;
            boolean m10 = cVar.m(typeface);
            boolean o10 = cVar.o(typeface);
            if (m10 || o10) {
                cVar.i(false);
            }
            q qVar = this.f6990q;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                AppCompatTextView appCompatTextView = qVar.f7101r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = qVar.f7108y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f7000v;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.V != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6965a.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                this.f6965a.requestLayout();
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f6971d;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z12 = false;
        } else {
            z12 = true;
        }
        EditText editText2 = this.f6971d;
        if (editText2 == null || !editText2.hasFocus()) {
            z13 = false;
        } else {
            z13 = true;
        }
        ColorStateList colorStateList3 = this.f6989p0;
        if (colorStateList3 != null) {
            this.B0.j(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f6989p0;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, this.f7009z0);
            } else {
                i10 = this.f7009z0;
            }
            this.B0.j(ColorStateList.valueOf(i10));
        } else if (m()) {
            com.google.android.material.internal.c cVar = this.B0;
            AppCompatTextView appCompatTextView2 = this.f6990q.f7101r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            cVar.j(colorStateList2);
        } else if (this.f6996t && (appCompatTextView = this.f7000v) != null) {
            this.B0.j(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.f6991q0) != null) {
            com.google.android.material.internal.c cVar2 = this.B0;
            if (cVar2.f6416o != colorStateList) {
                cVar2.f6416o = colorStateList;
                cVar2.i(false);
            }
        }
        if (z12 || !this.C0 || (isEnabled() && z13)) {
            if (z11 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (!z10 || !this.D0) {
                    this.B0.p(1.0f);
                } else {
                    a(1.0f);
                }
                this.A0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f6971d;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                v(editable);
                t tVar = this.f6967b;
                tVar.f7122q = false;
                tVar.e();
                l lVar = this.f6969c;
                lVar.f7065y = false;
                lVar.n();
            }
        } else if (z11 || !this.A0) {
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.E0.cancel();
            }
            if (!z10 || !this.D0) {
                this.B0.p(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && (!((g) this.M).F.f7030v.isEmpty()) && e()) {
                ((g) this.M).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            AppCompatTextView appCompatTextView3 = this.A;
            if (appCompatTextView3 != null && this.f7008z) {
                appCompatTextView3.setText((CharSequence) null);
                androidx.transition.h.a(this.f6965a, this.E);
                this.A.setVisibility(4);
            }
            t tVar2 = this.f6967b;
            tVar2.f7122q = true;
            tVar2.e();
            l lVar2 = this.f6969c;
            lVar2.f7065y = true;
            lVar2.n();
        }
    }

    public final void v(Editable editable) {
        int i10;
        ((i0) this.f6998u).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        if (i10 != 0 || this.A0) {
            AppCompatTextView appCompatTextView = this.A;
            if (appCompatTextView != null && this.f7008z) {
                appCompatTextView.setText((CharSequence) null);
                androidx.transition.h.a(this.f6965a, this.E);
                this.A.setVisibility(4);
            }
        } else if (this.A != null && this.f7008z && !TextUtils.isEmpty(this.f7006y)) {
            this.A.setText(this.f7006y);
            androidx.transition.h.a(this.f6965a, this.D);
            this.A.setVisibility(0);
            this.A.bringToFront();
            announceForAccessibility(this.f7006y);
        }
    }

    public final void w(boolean z10, boolean z11) {
        int defaultColor = this.f6999u0.getDefaultColor();
        int colorForState = this.f6999u0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f6999u0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f6972d0 = colorForState2;
        } else if (z11) {
            this.f6972d0 = colorForState;
        } else {
            this.f6972d0 = defaultColor;
        }
    }

    public final void x() {
        boolean z10;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.M != null && this.V != 0) {
            boolean z11 = false;
            if (isFocused() || ((editText2 = this.f6971d) != null && editText2.hasFocus())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isHovered() || ((editText = this.f6971d) != null && editText.isHovered())) {
                z11 = true;
            }
            if (!isEnabled()) {
                this.f6972d0 = this.f7009z0;
            } else if (m()) {
                if (this.f6999u0 != null) {
                    w(z10, z11);
                } else {
                    this.f6972d0 = getErrorCurrentTextColors();
                }
            } else if (!this.f6996t || (appCompatTextView = this.f7000v) == null) {
                if (z10) {
                    this.f6972d0 = this.f6997t0;
                } else if (z11) {
                    this.f6972d0 = this.f6995s0;
                } else {
                    this.f6972d0 = this.f6993r0;
                }
            } else if (this.f6999u0 != null) {
                w(z10, z11);
            } else {
                this.f6972d0 = appCompatTextView.getCurrentTextColor();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            l lVar = this.f6969c;
            lVar.l();
            n.c(lVar.f7048a, lVar.f7050c, lVar.f7051d);
            n.c(lVar.f7048a, lVar.f7054n, lVar.f7058r);
            if (lVar.b() instanceof k) {
                if (!lVar.f7048a.m() || lVar.f7054n.getDrawable() == null) {
                    n.a(lVar.f7048a, lVar.f7054n, lVar.f7058r, lVar.f7059s);
                } else {
                    Drawable mutate = lVar.f7054n.getDrawable().mutate();
                    a.b.g(mutate, lVar.f7048a.getErrorCurrentTextColors());
                    lVar.f7054n.setImageDrawable(mutate);
                }
            }
            t tVar = this.f6967b;
            n.c(tVar.f7113a, tVar.f7116d, tVar.f7117e);
            if (this.V == 2) {
                int i10 = this.f6966a0;
                if (!z10 || !isEnabled()) {
                    this.f6966a0 = this.f6968b0;
                } else {
                    this.f6966a0 = this.f6970c0;
                }
                if (this.f6966a0 != i10 && e() && !this.A0) {
                    if (e()) {
                        ((g) this.M).x(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.V == 1) {
                if (!isEnabled()) {
                    this.f6974e0 = this.f7003w0;
                } else if (z11 && !z10) {
                    this.f6974e0 = this.f7007y0;
                } else if (z10) {
                    this.f6974e0 = this.f7005x0;
                } else {
                    this.f6974e0 = this.f7001v0;
                }
            }
            b();
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.textInputStyle);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        t tVar = this.f6967b;
        if (tVar.f7116d.getContentDescription() != charSequence) {
            tVar.f7116d.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6967b.b(drawable);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r9 = I0
            r1 = r21
            android.content.Context r1 = p8.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f6975f = r10
            r0.f6984n = r10
            r0.f6986o = r10
            r0.f6988p = r10
            com.google.android.material.textfield.q r1 = new com.google.android.material.textfield.q
            r1.<init>(r0)
            r0.f6990q = r1
            c0.i0 r1 = new c0.i0
            r2 = 9
            r1.<init>(r2)
            r0.f6998u = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6976f0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6977g0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f6978h0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f6982l0 = r1
            com.google.android.material.internal.c r1 = new com.google.android.material.internal.c
            r1.<init>(r0)
            r0.B0 = r1
            r11 = 0
            r0.H0 = r11
            android.content.Context r12 = r20.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f6965a = r14
            r14.setAddStatesFromChildren(r13)
            android.view.animation.LinearInterpolator r2 = t7.b.f14885a
            r1.W = r2
            r1.i(r11)
            r1.V = r2
            r1.i(r11)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.l(r2)
            int[] r3 = com.google.android.material.R$styleable.TextInputLayout
            r1 = 5
            int[] r6 = new int[r1]
            int r15 = com.google.android.material.R$styleable.TextInputLayout_counterTextAppearance
            r6[r11] = r15
            int r5 = com.google.android.material.R$styleable.TextInputLayout_counterOverflowTextAppearance
            r6[r13] = r5
            int r4 = com.google.android.material.R$styleable.TextInputLayout_errorTextAppearance
            r2 = 2
            r6[r2] = r4
            int r1 = com.google.android.material.R$styleable.TextInputLayout_helperTextTextAppearance
            r16 = 3
            r6[r16] = r1
            int r11 = com.google.android.material.R$styleable.TextInputLayout_hintTextAppearance
            r16 = 4
            r6[r16] = r11
            r17 = r1
            r1 = r12
            r2 = r22
            r18 = r4
            r4 = r23
            r19 = r5
            r5 = r9
            androidx.appcompat.widget.n0 r1 = com.google.android.material.internal.u.e(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.t r2 = new com.google.android.material.textfield.t
            r2.<init>(r0, r1)
            r0.f6967b = r2
            int r3 = com.google.android.material.R$styleable.TextInputLayout_hintEnabled
            boolean r3 = r1.a(r3, r13)
            r0.J = r3
            int r3 = com.google.android.material.R$styleable.TextInputLayout_android_hint
            java.lang.CharSequence r3 = r1.k(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = com.google.android.material.R$styleable.TextInputLayout_hintAnimationEnabled
            boolean r3 = r1.a(r3, r13)
            r0.D0 = r3
            int r3 = com.google.android.material.R$styleable.TextInputLayout_expandedHintEnabled
            boolean r3 = r1.a(r3, r13)
            r0.C0 = r3
            int r3 = com.google.android.material.R$styleable.TextInputLayout_android_minEms
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x00e0
            int r3 = r1.h(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00ef
        L_0x00e0:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_android_minWidth
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x00ef
            int r3 = r1.d(r3, r10)
            r0.setMinWidth(r3)
        L_0x00ef:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_android_maxEms
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x00ff
            int r3 = r1.h(r3, r10)
            r0.setMaxEms(r3)
            goto L_0x010e
        L_0x00ff:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_android_maxWidth
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x010e
            int r3 = r1.d(r3, r10)
            r0.setMaxWidth(r3)
        L_0x010e:
            l8.m$a r3 = l8.m.c(r12, r7, r8, r9)
            l8.m r4 = new l8.m
            r4.<init>(r3)
            r0.S = r4
            android.content.res.Resources r3 = r12.getResources()
            int r4 = com.google.android.material.R$dimen.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.U = r3
            int r3 = com.google.android.material.R$styleable.TextInputLayout_boxCollapsedPaddingTop
            r4 = 0
            int r3 = r1.c(r3, r4)
            r0.W = r3
            int r3 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r4 = r12.getResources()
            int r5 = com.google.android.material.R$dimen.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.d(r3, r4)
            r0.f6968b0 = r3
            int r3 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r4 = r12.getResources()
            int r5 = com.google.android.material.R$dimen.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.d(r3, r4)
            r0.f6970c0 = r3
            int r3 = r0.f6968b0
            r0.f6966a0 = r3
            int r3 = com.google.android.material.R$styleable.TextInputLayout_boxCornerRadiusTopStart
            android.content.res.TypedArray r4 = r1.f1157b
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r4.getDimension(r3, r5)
            int r4 = com.google.android.material.R$styleable.TextInputLayout_boxCornerRadiusTopEnd
            android.content.res.TypedArray r6 = r1.f1157b
            float r4 = r6.getDimension(r4, r5)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_boxCornerRadiusBottomEnd
            android.content.res.TypedArray r7 = r1.f1157b
            float r6 = r7.getDimension(r6, r5)
            int r7 = com.google.android.material.R$styleable.TextInputLayout_boxCornerRadiusBottomStart
            android.content.res.TypedArray r8 = r1.f1157b
            float r5 = r8.getDimension(r7, r5)
            l8.m r7 = r0.S
            r7.getClass()
            l8.m$a r8 = new l8.m$a
            r8.<init>(r7)
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x018a
            r8.e(r3)
        L_0x018a:
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0191
            r8.f(r4)
        L_0x0191:
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0198
            r8.d(r6)
        L_0x0198:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x019f
            r8.c(r5)
        L_0x019f:
            l8.m r3 = new l8.m
            r3.<init>(r8)
            r0.S = r3
            int r3 = com.google.android.material.R$styleable.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r3 = i8.c.b(r12, r1, r3)
            if (r3 == 0) goto L_0x0206
            int r4 = r3.getDefaultColor()
            r0.f7001v0 = r4
            r0.f6974e0 = r4
            boolean r4 = r3.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01e2
            int[] r4 = new int[r13]
            r6 = 0
            r4[r6] = r5
            int r4 = r3.getColorForState(r4, r10)
            r0.f7003w0 = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r3.getColorForState(r5, r10)
            r0.f7005x0 = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r5, r10)
            r0.f7007y0 = r3
            goto L_0x0212
        L_0x01e2:
            r4 = 2
            int r3 = r0.f7001v0
            r0.f7005x0 = r3
            int r3 = com.google.android.material.R$color.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = k1.a.getColorStateList(r12, r3)
            int[] r6 = new int[r13]
            r7 = 0
            r6[r7] = r5
            int r5 = r3.getColorForState(r6, r10)
            r0.f7003w0 = r5
            int[] r5 = new int[r13]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r5[r7] = r6
            int r3 = r3.getColorForState(r5, r10)
            r0.f7007y0 = r3
            goto L_0x0212
        L_0x0206:
            r4 = 2
            r7 = 0
            r0.f6974e0 = r7
            r0.f7001v0 = r7
            r0.f7003w0 = r7
            r0.f7005x0 = r7
            r0.f7007y0 = r7
        L_0x0212:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_android_textColorHint
            boolean r5 = r1.l(r3)
            if (r5 == 0) goto L_0x0222
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.f6991q0 = r3
            r0.f6989p0 = r3
        L_0x0222:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r5 = i8.c.b(r12, r1, r3)
            android.content.res.TypedArray r6 = r1.f1157b
            r7 = 0
            int r3 = r6.getColor(r3, r7)
            r0.f6997t0 = r3
            int r3 = com.google.android.material.R$color.mtrl_textinput_default_box_stroke_color
            int r3 = k1.a.getColor(r12, r3)
            r0.f6993r0 = r3
            int r3 = com.google.android.material.R$color.mtrl_textinput_disabled_color
            int r3 = k1.a.getColor(r12, r3)
            r0.f7009z0 = r3
            int r3 = com.google.android.material.R$color.mtrl_textinput_hovered_box_stroke_color
            int r3 = k1.a.getColor(r12, r3)
            r0.f6995s0 = r3
            if (r5 == 0) goto L_0x024e
            r0.setBoxStrokeColorStateList(r5)
        L_0x024e:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeErrorColor
            boolean r5 = r1.l(r3)
            if (r5 == 0) goto L_0x025d
            android.content.res.ColorStateList r3 = i8.c.b(r12, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x025d:
            int r3 = r1.i(r11, r10)
            if (r3 == r10) goto L_0x026c
            r3 = 0
            int r5 = r1.i(r11, r3)
            r0.setHintTextAppearance(r5)
            goto L_0x026d
        L_0x026c:
            r3 = 0
        L_0x026d:
            int r5 = com.google.android.material.R$styleable.TextInputLayout_cursorColor
            android.content.res.ColorStateList r5 = r1.b(r5)
            r0.H = r5
            int r5 = com.google.android.material.R$styleable.TextInputLayout_cursorErrorColor
            android.content.res.ColorStateList r5 = r1.b(r5)
            r0.I = r5
            r5 = r18
            int r5 = r1.i(r5, r3)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_errorContentDescription
            java.lang.CharSequence r6 = r1.k(r6)
            int r7 = com.google.android.material.R$styleable.TextInputLayout_errorAccessibilityLiveRegion
            int r7 = r1.h(r7, r13)
            int r8 = com.google.android.material.R$styleable.TextInputLayout_errorEnabled
            boolean r8 = r1.a(r8, r3)
            r9 = r17
            int r9 = r1.i(r9, r3)
            int r11 = com.google.android.material.R$styleable.TextInputLayout_helperTextEnabled
            boolean r11 = r1.a(r11, r3)
            int r12 = com.google.android.material.R$styleable.TextInputLayout_helperText
            java.lang.CharSequence r12 = r1.k(r12)
            int r4 = com.google.android.material.R$styleable.TextInputLayout_placeholderTextAppearance
            int r4 = r1.i(r4, r3)
            int r13 = com.google.android.material.R$styleable.TextInputLayout_placeholderText
            java.lang.CharSequence r13 = r1.k(r13)
            int r10 = com.google.android.material.R$styleable.TextInputLayout_counterEnabled
            boolean r10 = r1.a(r10, r3)
            int r3 = com.google.android.material.R$styleable.TextInputLayout_counterMaxLength
            r22 = r12
            r12 = -1
            int r3 = r1.h(r3, r12)
            r0.setCounterMaxLength(r3)
            r3 = 0
            int r12 = r1.i(r15, r3)
            r0.f7004x = r12
            r12 = r19
            int r12 = r1.i(r12, r3)
            r0.f7002w = r12
            int r12 = com.google.android.material.R$styleable.TextInputLayout_boxBackgroundMode
            int r3 = r1.h(r12, r3)
            r0.setBoxBackgroundMode(r3)
            r0.setErrorContentDescription(r6)
            r0.setErrorAccessibilityLiveRegion(r7)
            int r3 = r0.f7002w
            r0.setCounterOverflowTextAppearance(r3)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorTextAppearance(r5)
            int r3 = r0.f7004x
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r4)
            int r3 = com.google.android.material.R$styleable.TextInputLayout_errorTextColor
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0308
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setErrorTextColor(r3)
        L_0x0308:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_helperTextTextColor
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0317
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setHelperTextColor(r3)
        L_0x0317:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_hintTextColor
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0326
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setHintTextColor(r3)
        L_0x0326:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_counterTextColor
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0335
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setCounterTextColor(r3)
        L_0x0335:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_counterOverflowTextColor
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0344
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x0344:
            int r3 = com.google.android.material.R$styleable.TextInputLayout_placeholderTextColor
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0353
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x0353:
            com.google.android.material.textfield.l r3 = new com.google.android.material.textfield.l
            r3.<init>(r0, r1)
            r0.f6969c = r3
            int r4 = com.google.android.material.R$styleable.TextInputLayout_android_enabled
            r5 = 1
            boolean r4 = r1.a(r4, r5)
            r1.n()
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            r1 = 2
            w1.d0.d.s(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r1 < r6) goto L_0x0375
            if (r1 < r6) goto L_0x0375
            w1.d0.l.m(r0, r5)
        L_0x0375:
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r11)
            r0.setErrorEnabled(r8)
            r0.setCounterEnabled(r10)
            r1 = r22
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f6969c.f7054n.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f6969c.f7054n.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f6969c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        l lVar = this.f6969c;
        if (lVar.f7054n.getContentDescription() != charSequence) {
            lVar.f7054n.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        l lVar = this.f6969c;
        lVar.f7054n.setImageDrawable(drawable);
        if (drawable != null) {
            n.a(lVar.f7048a, lVar.f7054n, lVar.f7058r, lVar.f7059s);
            n.c(lVar.f7048a, lVar.f7054n, lVar.f7058r);
        }
    }
}
