package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m1.e;
import w1.d0;
import w1.q0;

/* compiled from: AppCompatTextHelper */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1163a;

    /* renamed from: b  reason: collision with root package name */
    public l0 f1164b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f1165c;

    /* renamed from: d  reason: collision with root package name */
    public l0 f1166d;

    /* renamed from: e  reason: collision with root package name */
    public l0 f1167e;

    /* renamed from: f  reason: collision with root package name */
    public l0 f1168f;

    /* renamed from: g  reason: collision with root package name */
    public l0 f1169g;

    /* renamed from: h  reason: collision with root package name */
    public l0 f1170h;

    /* renamed from: i  reason: collision with root package name */
    public final t f1171i;

    /* renamed from: j  reason: collision with root package name */
    public int f1172j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1173k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1174l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1175m;

    /* compiled from: AppCompatTextHelper */
    public class a extends e.C0160e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1176a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1177b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1178c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f1176a = i10;
            this.f1177b = i11;
            this.f1178c = weakReference;
        }

        public final void c(int i10) {
        }

        public final void d(Typeface typeface) {
            int i10;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1176a) != -1) {
                if ((this.f1177b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = f.a(typeface, i10, z10);
            }
            p pVar = p.this;
            WeakReference weakReference = this.f1178c;
            if (pVar.f1175m) {
                pVar.f1174l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    if (d0.g.b(textView)) {
                        textView.post(new q(textView, typeface, pVar.f1172j));
                    } else {
                        textView.setTypeface(typeface, pVar.f1172j);
                    }
                }
            }
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class f {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public p(TextView textView) {
        this.f1163a = textView;
        this.f1171i = new t(textView);
    }

    public static l0 c(Context context, g gVar, int i10) {
        ColorStateList i11;
        synchronized (gVar) {
            i11 = gVar.f1105a.i(context, i10);
        }
        if (i11 == null) {
            return null;
        }
        l0 l0Var = new l0();
        l0Var.f1147d = true;
        l0Var.f1144a = i11;
        return l0Var;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        CharSequence charSequence;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i14 = editorInfo.initialSelStart;
            int i15 = editorInfo.initialSelEnd;
            if (i14 > i15) {
                i10 = i15 + 0;
            } else {
                i10 = i14 + 0;
            }
            if (i14 > i15) {
                i11 = i14 - 0;
            } else {
                i11 = i15 + 0;
            }
            int length = text.length();
            if (i10 < 0 || i11 > length) {
                z1.a.c(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i16 = editorInfo.inputType & 4095;
            if (i16 == 129 || i16 == 225 || i16 == 18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z1.a.c(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                z1.a.c(editorInfo, text, i10, i11);
            } else {
                int i17 = i11 - i10;
                if (i17 > 1024) {
                    i12 = 0;
                } else {
                    i12 = i17;
                }
                int i18 = 2048 - i12;
                int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (((double) i18) * 0.8d)));
                int min2 = Math.min(i10, i18 - min);
                int i19 = i10 - min2;
                if (Character.isLowSurrogate(text.charAt(i19))) {
                    i19++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                    min--;
                }
                int i20 = min2 + i12 + min;
                if (i12 != i17) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11)});
                } else {
                    charSequence = text.subSequence(i19, i20 + i19);
                }
                int i21 = min2 + 0;
                z1.a.c(editorInfo, charSequence, i21, i12 + i21);
            }
        }
    }

    public final void a(Drawable drawable, l0 l0Var) {
        if (drawable != null && l0Var != null) {
            g.e(drawable, l0Var, this.f1163a.getDrawableState());
        }
    }

    public final void b() {
        if (!(this.f1164b == null && this.f1165c == null && this.f1166d == null && this.f1167e == null)) {
            Drawable[] compoundDrawables = this.f1163a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1164b);
            a(compoundDrawables[1], this.f1165c);
            a(compoundDrawables[2], this.f1166d);
            a(compoundDrawables[3], this.f1167e);
        }
        if (this.f1168f != null || this.f1169g != null) {
            Drawable[] a10 = b.a(this.f1163a);
            a(a10[0], this.f1168f);
            a(a10[2], this.f1169g);
        }
    }

    public final ColorStateList d() {
        l0 l0Var = this.f1170h;
        if (l0Var != null) {
            return l0Var.f1144a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        l0 l0Var = this.f1170h;
        if (l0Var != null) {
            return l0Var.f1145b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.util.AttributeSet r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r7 = r21
            r8 = r22
            android.widget.TextView r1 = r0.f1163a
            android.content.Context r9 = r1.getContext()
            androidx.appcompat.widget.g r10 = androidx.appcompat.widget.g.a()
            int[] r3 = androidx.appcompat.R$styleable.AppCompatTextHelper
            androidx.appcompat.widget.n0 r11 = androidx.appcompat.widget.n0.m(r9, r7, r3, r8)
            android.widget.TextView r1 = r0.f1163a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r11.f1157b
            r4 = r21
            r6 = r22
            w1.d0.n(r1, r2, r3, r4, r5, r6)
            int r1 = androidx.appcompat.R$styleable.AppCompatTextHelper_android_textAppearance
            r12 = -1
            int r1 = r11.i(r1, r12)
            int r2 = androidx.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft
            boolean r3 = r11.l(r2)
            r13 = 0
            if (r3 == 0) goto L_0x003f
            int r2 = r11.i(r2, r13)
            androidx.appcompat.widget.l0 r2 = c(r9, r10, r2)
            r0.f1164b = r2
        L_0x003f:
            int r2 = androidx.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop
            boolean r3 = r11.l(r2)
            if (r3 == 0) goto L_0x0051
            int r2 = r11.i(r2, r13)
            androidx.appcompat.widget.l0 r2 = c(r9, r10, r2)
            r0.f1165c = r2
        L_0x0051:
            int r2 = androidx.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight
            boolean r3 = r11.l(r2)
            if (r3 == 0) goto L_0x0063
            int r2 = r11.i(r2, r13)
            androidx.appcompat.widget.l0 r2 = c(r9, r10, r2)
            r0.f1166d = r2
        L_0x0063:
            int r2 = androidx.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom
            boolean r3 = r11.l(r2)
            if (r3 == 0) goto L_0x0075
            int r2 = r11.i(r2, r13)
            androidx.appcompat.widget.l0 r2 = c(r9, r10, r2)
            r0.f1167e = r2
        L_0x0075:
            int r2 = android.os.Build.VERSION.SDK_INT
            int r3 = androidx.appcompat.R$styleable.AppCompatTextHelper_android_drawableStart
            boolean r4 = r11.l(r3)
            if (r4 == 0) goto L_0x0089
            int r3 = r11.i(r3, r13)
            androidx.appcompat.widget.l0 r3 = c(r9, r10, r3)
            r0.f1168f = r3
        L_0x0089:
            int r3 = androidx.appcompat.R$styleable.AppCompatTextHelper_android_drawableEnd
            boolean r4 = r11.l(r3)
            if (r4 == 0) goto L_0x009b
            int r3 = r11.i(r3, r13)
            androidx.appcompat.widget.l0 r3 = c(r9, r10, r3)
            r0.f1169g = r3
        L_0x009b:
            r11.n()
            android.widget.TextView r3 = r0.f1163a
            android.text.method.TransformationMethod r3 = r3.getTransformationMethod()
            boolean r3 = r3 instanceof android.text.method.PasswordTransformationMethod
            r4 = 26
            if (r1 == r12) goto L_0x00ec
            int[] r5 = androidx.appcompat.R$styleable.TextAppearance
            androidx.appcompat.widget.n0 r6 = new androidx.appcompat.widget.n0
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r1, r5)
            r6.<init>(r9, r1)
            if (r3 != 0) goto L_0x00c5
            int r1 = androidx.appcompat.R$styleable.TextAppearance_textAllCaps
            boolean r5 = r6.l(r1)
            if (r5 == 0) goto L_0x00c5
            boolean r1 = r6.a(r1, r13)
            r5 = 1
            goto L_0x00c7
        L_0x00c5:
            r1 = r13
            r5 = r1
        L_0x00c7:
            r0.n(r9, r6)
            int r15 = androidx.appcompat.R$styleable.TextAppearance_textLocale
            boolean r16 = r6.l(r15)
            if (r16 == 0) goto L_0x00d7
            java.lang.String r15 = r6.j(r15)
            goto L_0x00d8
        L_0x00d7:
            r15 = 0
        L_0x00d8:
            if (r2 < r4) goto L_0x00e7
            int r14 = androidx.appcompat.R$styleable.TextAppearance_fontVariationSettings
            boolean r17 = r6.l(r14)
            if (r17 == 0) goto L_0x00e7
            java.lang.String r14 = r6.j(r14)
            goto L_0x00e8
        L_0x00e7:
            r14 = 0
        L_0x00e8:
            r6.n()
            goto L_0x00f0
        L_0x00ec:
            r1 = r13
            r5 = r1
            r14 = 0
            r15 = 0
        L_0x00f0:
            int[] r6 = androidx.appcompat.R$styleable.TextAppearance
            androidx.appcompat.widget.n0 r11 = new androidx.appcompat.widget.n0
            android.content.res.TypedArray r6 = r9.obtainStyledAttributes(r7, r6, r8, r13)
            r11.<init>(r9, r6)
            if (r3 != 0) goto L_0x010a
            int r6 = androidx.appcompat.R$styleable.TextAppearance_textAllCaps
            boolean r18 = r11.l(r6)
            if (r18 == 0) goto L_0x010a
            boolean r1 = r11.a(r6, r13)
            r5 = 1
        L_0x010a:
            int r6 = androidx.appcompat.R$styleable.TextAppearance_textLocale
            boolean r18 = r11.l(r6)
            if (r18 == 0) goto L_0x0116
            java.lang.String r15 = r11.j(r6)
        L_0x0116:
            if (r2 < r4) goto L_0x0124
            int r4 = androidx.appcompat.R$styleable.TextAppearance_fontVariationSettings
            boolean r6 = r11.l(r4)
            if (r6 == 0) goto L_0x0124
            java.lang.String r14 = r11.j(r4)
        L_0x0124:
            r4 = 28
            if (r2 < r4) goto L_0x013c
            int r4 = androidx.appcompat.R$styleable.TextAppearance_android_textSize
            boolean r6 = r11.l(r4)
            if (r6 == 0) goto L_0x013c
            int r4 = r11.d(r4, r12)
            if (r4 != 0) goto L_0x013c
            android.widget.TextView r4 = r0.f1163a
            r6 = 0
            r4.setTextSize(r13, r6)
        L_0x013c:
            r0.n(r9, r11)
            r11.n()
            if (r3 != 0) goto L_0x014b
            if (r5 == 0) goto L_0x014b
            android.widget.TextView r3 = r0.f1163a
            r3.setAllCaps(r1)
        L_0x014b:
            android.graphics.Typeface r1 = r0.f1174l
            if (r1 == 0) goto L_0x0160
            int r3 = r0.f1173k
            if (r3 != r12) goto L_0x015b
            android.widget.TextView r3 = r0.f1163a
            int r4 = r0.f1172j
            r3.setTypeface(r1, r4)
            goto L_0x0160
        L_0x015b:
            android.widget.TextView r3 = r0.f1163a
            r3.setTypeface(r1)
        L_0x0160:
            if (r14 == 0) goto L_0x0167
            android.widget.TextView r1 = r0.f1163a
            androidx.appcompat.widget.p.e.d(r1, r14)
        L_0x0167:
            r11 = 24
            if (r15 == 0) goto L_0x0188
            if (r2 < r11) goto L_0x0177
            android.widget.TextView r1 = r0.f1163a
            android.os.LocaleList r2 = androidx.appcompat.widget.p.d.a(r15)
            androidx.appcompat.widget.p.d.b(r1, r2)
            goto L_0x0188
        L_0x0177:
            java.lang.String r1 = ","
            java.lang.String[] r1 = r15.split(r1)
            r1 = r1[r13]
            android.widget.TextView r2 = r0.f1163a
            java.util.Locale r1 = androidx.appcompat.widget.p.c.a(r1)
            androidx.appcompat.widget.p.b.c(r2, r1)
        L_0x0188:
            androidx.appcompat.widget.t r14 = r0.f1171i
            android.content.Context r1 = r14.f1232j
            int[] r3 = androidx.appcompat.R$styleable.AppCompatTextView
            android.content.res.TypedArray r15 = r1.obtainStyledAttributes(r7, r3, r8, r13)
            android.widget.TextView r1 = r14.f1231i
            android.content.Context r2 = r1.getContext()
            r4 = r21
            r5 = r15
            r6 = r22
            w1.d0.n(r1, r2, r3, r4, r5, r6)
            int r1 = androidx.appcompat.R$styleable.AppCompatTextView_autoSizeTextType
            boolean r2 = r15.hasValue(r1)
            if (r2 == 0) goto L_0x01ae
            int r1 = r15.getInt(r1, r13)
            r14.f1223a = r1
        L_0x01ae:
            int r1 = androidx.appcompat.R$styleable.AppCompatTextView_autoSizeStepGranularity
            boolean r2 = r15.hasValue(r1)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x01bd
            float r1 = r15.getDimension(r1, r3)
            goto L_0x01be
        L_0x01bd:
            r1 = r3
        L_0x01be:
            int r2 = androidx.appcompat.R$styleable.AppCompatTextView_autoSizeMinTextSize
            boolean r4 = r15.hasValue(r2)
            if (r4 == 0) goto L_0x01cb
            float r2 = r15.getDimension(r2, r3)
            goto L_0x01cc
        L_0x01cb:
            r2 = r3
        L_0x01cc:
            int r4 = androidx.appcompat.R$styleable.AppCompatTextView_autoSizeMaxTextSize
            boolean r5 = r15.hasValue(r4)
            if (r5 == 0) goto L_0x01d9
            float r4 = r15.getDimension(r4, r3)
            goto L_0x01da
        L_0x01d9:
            r4 = r3
        L_0x01da:
            int r5 = androidx.appcompat.R$styleable.AppCompatTextView_autoSizePresetSizes
            boolean r6 = r15.hasValue(r5)
            if (r6 == 0) goto L_0x0210
            int r5 = r15.getResourceId(r5, r13)
            if (r5 <= 0) goto L_0x0210
            android.content.res.Resources r6 = r15.getResources()
            android.content.res.TypedArray r5 = r6.obtainTypedArray(r5)
            int r6 = r5.length()
            int[] r8 = new int[r6]
            if (r6 <= 0) goto L_0x020d
            r11 = r13
        L_0x01f9:
            if (r11 >= r6) goto L_0x0204
            int r19 = r5.getDimensionPixelSize(r11, r12)
            r8[r11] = r19
            int r11 = r11 + 1
            goto L_0x01f9
        L_0x0204:
            int[] r6 = androidx.appcompat.widget.t.b(r8)
            r14.f1228f = r6
            r14.g()
        L_0x020d:
            r5.recycle()
        L_0x0210:
            r15.recycle()
            boolean r5 = r14.h()
            r6 = 2
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x024f
            int r5 = r14.f1223a
            r11 = 1
            if (r5 != r11) goto L_0x0251
            boolean r5 = r14.f1229g
            if (r5 != 0) goto L_0x024b
            android.content.Context r5 = r14.f1232j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r11 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0239
            r2 = 1094713344(0x41400000, float:12.0)
            float r2 = android.util.TypedValue.applyDimension(r6, r2, r5)
        L_0x0239:
            int r11 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0243
            r4 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r5)
        L_0x0243:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0248
            r1 = r8
        L_0x0248:
            r14.i(r2, r4, r1)
        L_0x024b:
            r14.f()
            goto L_0x0251
        L_0x024f:
            r14.f1223a = r13
        L_0x0251:
            boolean r1 = androidx.appcompat.widget.u0.f1236b
            if (r1 == 0) goto L_0x028e
            androidx.appcompat.widget.t r1 = r0.f1171i
            int r2 = r1.f1223a
            if (r2 == 0) goto L_0x028e
            int[] r1 = r1.f1228f
            int r2 = r1.length
            if (r2 <= 0) goto L_0x028e
            android.widget.TextView r2 = r0.f1163a
            int r2 = androidx.appcompat.widget.p.e.a(r2)
            float r2 = (float) r2
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0289
            android.widget.TextView r1 = r0.f1163a
            androidx.appcompat.widget.t r2 = r0.f1171i
            float r2 = r2.f1226d
            int r2 = java.lang.Math.round(r2)
            androidx.appcompat.widget.t r3 = r0.f1171i
            float r3 = r3.f1227e
            int r3 = java.lang.Math.round(r3)
            androidx.appcompat.widget.t r4 = r0.f1171i
            float r4 = r4.f1225c
            int r4 = java.lang.Math.round(r4)
            androidx.appcompat.widget.p.e.b(r1, r2, r3, r4, r13)
            goto L_0x028e
        L_0x0289:
            android.widget.TextView r2 = r0.f1163a
            androidx.appcompat.widget.p.e.c(r2, r1, r13)
        L_0x028e:
            int[] r1 = androidx.appcompat.R$styleable.AppCompatTextView
            androidx.appcompat.widget.n0 r2 = new androidx.appcompat.widget.n0
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r7, r1)
            r2.<init>(r9, r1)
            int r1 = androidx.appcompat.R$styleable.AppCompatTextView_drawableLeftCompat
            int r1 = r2.i(r1, r12)
            if (r1 == r12) goto L_0x02a6
            android.graphics.drawable.Drawable r1 = r10.b(r9, r1)
            goto L_0x02a7
        L_0x02a6:
            r1 = 0
        L_0x02a7:
            int r3 = androidx.appcompat.R$styleable.AppCompatTextView_drawableTopCompat
            int r3 = r2.i(r3, r12)
            if (r3 == r12) goto L_0x02b4
            android.graphics.drawable.Drawable r3 = r10.b(r9, r3)
            goto L_0x02b5
        L_0x02b4:
            r3 = 0
        L_0x02b5:
            int r4 = androidx.appcompat.R$styleable.AppCompatTextView_drawableRightCompat
            int r4 = r2.i(r4, r12)
            if (r4 == r12) goto L_0x02c2
            android.graphics.drawable.Drawable r4 = r10.b(r9, r4)
            goto L_0x02c3
        L_0x02c2:
            r4 = 0
        L_0x02c3:
            int r5 = androidx.appcompat.R$styleable.AppCompatTextView_drawableBottomCompat
            int r5 = r2.i(r5, r12)
            if (r5 == r12) goto L_0x02d0
            android.graphics.drawable.Drawable r5 = r10.b(r9, r5)
            goto L_0x02d1
        L_0x02d0:
            r5 = 0
        L_0x02d1:
            int r7 = androidx.appcompat.R$styleable.AppCompatTextView_drawableStartCompat
            int r7 = r2.i(r7, r12)
            if (r7 == r12) goto L_0x02de
            android.graphics.drawable.Drawable r7 = r10.b(r9, r7)
            goto L_0x02df
        L_0x02de:
            r7 = 0
        L_0x02df:
            int r11 = androidx.appcompat.R$styleable.AppCompatTextView_drawableEndCompat
            int r11 = r2.i(r11, r12)
            if (r11 == r12) goto L_0x02ec
            android.graphics.drawable.Drawable r9 = r10.b(r9, r11)
            goto L_0x02ed
        L_0x02ec:
            r9 = 0
        L_0x02ed:
            r10 = 3
            if (r7 != 0) goto L_0x033e
            if (r9 == 0) goto L_0x02f3
            goto L_0x033e
        L_0x02f3:
            if (r1 != 0) goto L_0x02fb
            if (r3 != 0) goto L_0x02fb
            if (r4 != 0) goto L_0x02fb
            if (r5 == 0) goto L_0x035e
        L_0x02fb:
            android.widget.TextView r7 = r0.f1163a
            android.graphics.drawable.Drawable[] r7 = androidx.appcompat.widget.p.b.a(r7)
            r9 = r7[r13]
            if (r9 != 0) goto L_0x032b
            r11 = r7[r6]
            if (r11 == 0) goto L_0x030a
            goto L_0x032b
        L_0x030a:
            android.widget.TextView r7 = r0.f1163a
            android.graphics.drawable.Drawable[] r7 = r7.getCompoundDrawables()
            android.widget.TextView r9 = r0.f1163a
            if (r1 == 0) goto L_0x0315
            goto L_0x0317
        L_0x0315:
            r1 = r7[r13]
        L_0x0317:
            if (r3 == 0) goto L_0x031a
            goto L_0x031d
        L_0x031a:
            r3 = 1
            r3 = r7[r3]
        L_0x031d:
            if (r4 == 0) goto L_0x0320
            goto L_0x0322
        L_0x0320:
            r4 = r7[r6]
        L_0x0322:
            if (r5 == 0) goto L_0x0325
            goto L_0x0327
        L_0x0325:
            r5 = r7[r10]
        L_0x0327:
            r9.setCompoundDrawablesWithIntrinsicBounds(r1, r3, r4, r5)
            goto L_0x035e
        L_0x032b:
            android.widget.TextView r1 = r0.f1163a
            if (r3 == 0) goto L_0x0330
            goto L_0x0333
        L_0x0330:
            r3 = 1
            r3 = r7[r3]
        L_0x0333:
            r4 = r7[r6]
            if (r5 == 0) goto L_0x0338
            goto L_0x033a
        L_0x0338:
            r5 = r7[r10]
        L_0x033a:
            androidx.appcompat.widget.p.b.b(r1, r9, r3, r4, r5)
            goto L_0x035e
        L_0x033e:
            android.widget.TextView r1 = r0.f1163a
            android.graphics.drawable.Drawable[] r1 = androidx.appcompat.widget.p.b.a(r1)
            android.widget.TextView r4 = r0.f1163a
            if (r7 == 0) goto L_0x0349
            goto L_0x034b
        L_0x0349:
            r7 = r1[r13]
        L_0x034b:
            if (r3 == 0) goto L_0x034e
            goto L_0x0351
        L_0x034e:
            r3 = 1
            r3 = r1[r3]
        L_0x0351:
            if (r9 == 0) goto L_0x0354
            goto L_0x0356
        L_0x0354:
            r9 = r1[r6]
        L_0x0356:
            if (r5 == 0) goto L_0x0359
            goto L_0x035b
        L_0x0359:
            r5 = r1[r10]
        L_0x035b:
            androidx.appcompat.widget.p.b.b(r4, r7, r3, r9, r5)
        L_0x035e:
            int r1 = androidx.appcompat.R$styleable.AppCompatTextView_drawableTint
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0382
            android.content.res.ColorStateList r1 = r2.b(r1)
            android.widget.TextView r3 = r0.f1163a
            r3.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x0379
            androidx.core.widget.k.c.f(r3, r1)
            goto L_0x0382
        L_0x0379:
            boolean r4 = r3 instanceof androidx.core.widget.n
            if (r4 == 0) goto L_0x0382
            androidx.core.widget.n r3 = (androidx.core.widget.n) r3
            r3.setSupportCompoundDrawablesTintList(r1)
        L_0x0382:
            int r1 = androidx.appcompat.R$styleable.AppCompatTextView_drawableTintMode
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x03ab
            int r1 = r2.h(r1, r12)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.x.c(r1, r3)
            android.widget.TextView r3 = r0.f1163a
            r3.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x03a2
            androidx.core.widget.k.c.g(r3, r1)
            goto L_0x03ab
        L_0x03a2:
            boolean r4 = r3 instanceof androidx.core.widget.n
            if (r4 == 0) goto L_0x03ab
            androidx.core.widget.n r3 = (androidx.core.widget.n) r3
            r3.setSupportCompoundDrawablesTintMode(r1)
        L_0x03ab:
            int r1 = androidx.appcompat.R$styleable.AppCompatTextView_firstBaselineToTopHeight
            int r1 = r2.d(r1, r12)
            int r3 = androidx.appcompat.R$styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r3 = r2.d(r3, r12)
            int r4 = androidx.appcompat.R$styleable.AppCompatTextView_lineHeight
            int r4 = r2.d(r4, r12)
            r2.n()
            if (r1 == r12) goto L_0x03c7
            android.widget.TextView r2 = r0.f1163a
            androidx.core.widget.k.b(r2, r1)
        L_0x03c7:
            if (r3 == r12) goto L_0x03ce
            android.widget.TextView r1 = r0.f1163a
            androidx.core.widget.k.c(r1, r3)
        L_0x03ce:
            if (r4 == r12) goto L_0x03e5
            android.widget.TextView r1 = r0.f1163a
            al.g0.B(r4)
            android.text.TextPaint r2 = r1.getPaint()
            r3 = 0
            int r2 = r2.getFontMetricsInt(r3)
            if (r4 == r2) goto L_0x03e5
            int r4 = r4 - r2
            float r2 = (float) r4
            r1.setLineSpacing(r2, r8)
        L_0x03e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i10) {
        String j10;
        n0 n0Var = new n0(context, context.obtainStyledAttributes(i10, R$styleable.TextAppearance));
        int i11 = R$styleable.TextAppearance_textAllCaps;
        if (n0Var.l(i11)) {
            this.f1163a.setAllCaps(n0Var.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = R$styleable.TextAppearance_android_textSize;
        if (n0Var.l(i13) && n0Var.d(i13, -1) == 0) {
            this.f1163a.setTextSize(0, 0.0f);
        }
        n(context, n0Var);
        if (i12 >= 26) {
            int i14 = R$styleable.TextAppearance_fontVariationSettings;
            if (n0Var.l(i14) && (j10 = n0Var.j(i14)) != null) {
                e.d(this.f1163a, j10);
            }
        }
        n0Var.n();
        Typeface typeface = this.f1174l;
        if (typeface != null) {
            this.f1163a.setTypeface(typeface, this.f1172j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        t tVar = this.f1171i;
        if (tVar.h()) {
            DisplayMetrics displayMetrics = tVar.f1232j.getResources().getDisplayMetrics();
            tVar.i(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (tVar.f()) {
                tVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        t tVar = this.f1171i;
        if (tVar.h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = tVar.f1232j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                tVar.f1228f = t.b(iArr2);
                if (!tVar.g()) {
                    StringBuilder q10 = android.support.v4.media.a.q("None of the preset sizes is valid: ");
                    q10.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(q10.toString());
                }
            } else {
                tVar.f1229g = false;
            }
            if (tVar.f()) {
                tVar.a();
            }
        }
    }

    public final void k(int i10) {
        t tVar = this.f1171i;
        if (!tVar.h()) {
            return;
        }
        if (i10 == 0) {
            tVar.f1223a = 0;
            tVar.f1226d = -1.0f;
            tVar.f1227e = -1.0f;
            tVar.f1225c = -1.0f;
            tVar.f1228f = new int[0];
            tVar.f1224b = false;
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = tVar.f1232j.getResources().getDisplayMetrics();
            tVar.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (tVar.f()) {
                tVar.a();
            }
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.m("Unknown auto-size text type: ", i10));
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.f1170h == null) {
            this.f1170h = new l0();
        }
        l0 l0Var = this.f1170h;
        l0Var.f1144a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var.f1147d = z10;
        this.f1164b = l0Var;
        this.f1165c = l0Var;
        this.f1166d = l0Var;
        this.f1167e = l0Var;
        this.f1168f = l0Var;
        this.f1169g = l0Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f1170h == null) {
            this.f1170h = new l0();
        }
        l0 l0Var = this.f1170h;
        l0Var.f1145b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var.f1146c = z10;
        this.f1164b = l0Var;
        this.f1165c = l0Var;
        this.f1166d = l0Var;
        this.f1167e = l0Var;
        this.f1168f = l0Var;
        this.f1169g = l0Var;
    }

    public final void n(Context context, n0 n0Var) {
        String j10;
        boolean z10;
        boolean z11;
        this.f1172j = n0Var.h(R$styleable.TextAppearance_android_textStyle, this.f1172j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i10 >= 28) {
            int h10 = n0Var.h(R$styleable.TextAppearance_android_textFontWeight, -1);
            this.f1173k = h10;
            if (h10 != -1) {
                this.f1172j = (this.f1172j & 2) | 0;
            }
        }
        int i11 = R$styleable.TextAppearance_android_fontFamily;
        if (n0Var.l(i11) || n0Var.l(R$styleable.TextAppearance_fontFamily)) {
            this.f1174l = null;
            int i12 = R$styleable.TextAppearance_fontFamily;
            if (n0Var.l(i12)) {
                i11 = i12;
            }
            int i13 = this.f1173k;
            int i14 = this.f1172j;
            if (!context.isRestricted()) {
                try {
                    Typeface g2 = n0Var.g(i11, this.f1172j, new a(i13, i14, new WeakReference(this.f1163a)));
                    if (g2 != null) {
                        if (i10 < 28 || this.f1173k == -1) {
                            this.f1174l = g2;
                        } else {
                            Typeface create = Typeface.create(g2, 0);
                            int i15 = this.f1173k;
                            if ((this.f1172j & 2) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f1174l = f.a(create, i15, z11);
                        }
                    }
                    if (this.f1174l == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f1175m = z10;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1174l == null && (j10 = n0Var.j(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1173k == -1) {
                    this.f1174l = Typeface.create(j10, this.f1172j);
                    return;
                }
                Typeface create2 = Typeface.create(j10, 0);
                int i16 = this.f1173k;
                if ((this.f1172j & 2) != 0) {
                    z12 = true;
                }
                this.f1174l = f.a(create2, i16, z12);
                return;
            }
            return;
        }
        int i17 = R$styleable.TextAppearance_android_typeface;
        if (n0Var.l(i17)) {
            this.f1175m = false;
            int h11 = n0Var.h(i17, 1);
            if (h11 == 1) {
                this.f1174l = Typeface.SANS_SERIF;
            } else if (h11 == 2) {
                this.f1174l = Typeface.SERIF;
            } else if (h11 == 3) {
                this.f1174l = Typeface.MONOSPACE;
            }
        }
    }
}
