package i8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.fragment.app.o;
import com.google.android.material.R$styleable;
import m1.e;

/* compiled from: TextAppearance */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f11196a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11197b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11198c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11199d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11200e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11201f;

    /* renamed from: g  reason: collision with root package name */
    public final float f11202g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11203h;

    /* renamed from: i  reason: collision with root package name */
    public final float f11204i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f11205j;

    /* renamed from: k  reason: collision with root package name */
    public float f11206k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11207l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11208m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f11209n;

    /* compiled from: TextAppearance */
    public class a extends e.C0160e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f11210a;

        public a(o oVar) {
            this.f11210a = oVar;
        }

        public final void c(int i10) {
            d.this.f11208m = true;
            this.f11210a.D(i10);
        }

        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f11209n = Typeface.create(typeface, dVar.f11198c);
            d dVar2 = d.this;
            dVar2.f11208m = true;
            this.f11210a.E(dVar2.f11209n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R$styleable.TextAppearance);
        this.f11206k = obtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, 0.0f);
        this.f11205j = c.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
        c.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
        c.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
        this.f11198c = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        this.f11199d = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
        int i11 = R$styleable.TextAppearance_fontFamily;
        i11 = !obtainStyledAttributes.hasValue(i11) ? R$styleable.TextAppearance_android_fontFamily : i11;
        this.f11207l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f11197b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        this.f11196a = c.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
        this.f11200e = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f11201f = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f11202g = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, R$styleable.MaterialTextAppearance);
        int i12 = R$styleable.MaterialTextAppearance_android_letterSpacing;
        this.f11203h = obtainStyledAttributes2.hasValue(i12);
        this.f11204i = obtainStyledAttributes2.getFloat(i12, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f11209n == null && (str = this.f11197b) != null) {
            this.f11209n = Typeface.create(str, this.f11198c);
        }
        if (this.f11209n == null) {
            int i10 = this.f11199d;
            if (i10 == 1) {
                this.f11209n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f11209n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f11209n = Typeface.DEFAULT;
            } else {
                this.f11209n = Typeface.MONOSPACE;
            }
            this.f11209n = Typeface.create(this.f11209n, this.f11198c);
        }
    }

    public final Typeface b(Context context) {
        if (this.f11208m) {
            return this.f11209n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = e.a(context, this.f11207l);
                this.f11209n = a10;
                if (a10 != null) {
                    this.f11209n = Typeface.create(a10, this.f11198c);
                }
            } catch (Resources.NotFoundException | Exception | UnsupportedOperationException unused) {
            }
        }
        a();
        this.f11208m = true;
        return this.f11209n;
    }

    public final void c(Context context, o oVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f11207l;
        if (i10 == 0) {
            this.f11208m = true;
        }
        if (this.f11208m) {
            oVar.E(this.f11209n, true);
            return;
        }
        try {
            a aVar = new a(oVar);
            ThreadLocal<TypedValue> threadLocal = e.f13062a;
            if (context.isRestricted()) {
                aVar.a(-4);
                return;
            }
            e.b(context, i10, new TypedValue(), 0, aVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f11208m = true;
            oVar.D(1);
        } catch (Exception unused2) {
            this.f11208m = true;
            oVar.D(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f11207l
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = m1.e.f13062a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = m1.e.b(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 == 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, o oVar) {
        int i10;
        int i11;
        f(context, textPaint, oVar);
        ColorStateList colorStateList = this.f11205j;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        float f10 = this.f11202g;
        float f11 = this.f11200e;
        float f12 = this.f11201f;
        ColorStateList colorStateList2 = this.f11196a;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(f10, f11, f12, i11);
    }

    public final void f(Context context, TextPaint textPaint, o oVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f11209n);
        c(context, new e(this, context, textPaint, oVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface a10 = f.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f11198c & (~typeface.getStyle());
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f11206k);
        if (this.f11203h) {
            textPaint.setLetterSpacing(this.f11204i);
        }
    }
}
