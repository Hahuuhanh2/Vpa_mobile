package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import i8.d;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import l8.h;
import l8.m;
import t7.b;
import w1.d0;
import w1.q0;

/* compiled from: BadgeDrawable */
public final class a extends Drawable implements r.b {

    /* renamed from: u  reason: collision with root package name */
    public static final int f5705u = R$style.Widget_MaterialComponents_Badge;

    /* renamed from: v  reason: collision with root package name */
    public static final int f5706v = R$attr.badgeStyle;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f5707a;

    /* renamed from: b  reason: collision with root package name */
    public final h f5708b;

    /* renamed from: c  reason: collision with root package name */
    public final r f5709c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f5710d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final BadgeState f5711e;

    /* renamed from: f  reason: collision with root package name */
    public float f5712f;

    /* renamed from: n  reason: collision with root package name */
    public float f5713n;

    /* renamed from: o  reason: collision with root package name */
    public int f5714o;

    /* renamed from: p  reason: collision with root package name */
    public float f5715p;

    /* renamed from: q  reason: collision with root package name */
    public float f5716q;

    /* renamed from: r  reason: collision with root package name */
    public float f5717r;

    /* renamed from: s  reason: collision with root package name */
    public WeakReference<View> f5718s;

    /* renamed from: t  reason: collision with root package name */
    public WeakReference<FrameLayout> f5719t;

    public a(Context context, BadgeState.State state) {
        int i10;
        int i11;
        FrameLayout frameLayout;
        d dVar;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f5707a = weakReference;
        u.c(context, u.f6504b, "Theme.MaterialComponents");
        r rVar = new r(this);
        this.f5709c = rVar;
        rVar.f6494a.setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, state);
        this.f5711e = badgeState;
        if (f()) {
            i10 = badgeState.f5676b.f5692n.intValue();
        } else {
            i10 = badgeState.f5676b.f5690e.intValue();
        }
        if (f()) {
            i11 = badgeState.f5676b.f5693o.intValue();
        } else {
            i11 = badgeState.f5676b.f5691f.intValue();
        }
        h hVar = new h(new m(m.a(context, i10, i11)));
        this.f5708b = hVar;
        h();
        Context context2 = weakReference.get();
        if (!(context2 == null || rVar.f6500g == (dVar = new d(context2, badgeState.f5676b.f5689d.intValue())))) {
            rVar.c(dVar, context2);
            rVar.f6494a.setColor(badgeState.f5676b.f5688c.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        BadgeState.State state2 = badgeState.f5676b;
        int i12 = state2.f5697s;
        if (i12 != -2) {
            this.f5714o = ((int) Math.pow(10.0d, ((double) i12) - 1.0d)) - 1;
        } else {
            this.f5714o = state2.f5698t;
        }
        rVar.f6498e = true;
        j();
        invalidateSelf();
        rVar.f6498e = true;
        h();
        j();
        invalidateSelf();
        rVar.f6494a.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(badgeState.f5676b.f5687b.intValue());
        if (hVar.f12778a.f12800c != valueOf) {
            hVar.n(valueOf);
            invalidateSelf();
        }
        rVar.f6494a.setColor(badgeState.f5676b.f5688c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f5718s;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = this.f5718s.get();
            WeakReference<FrameLayout> weakReference3 = this.f5719t;
            if (weakReference3 != null) {
                frameLayout = weakReference3.get();
            } else {
                frameLayout = null;
            }
            i(view, frameLayout);
        }
        j();
        setVisible(badgeState.f5676b.A.booleanValue(), false);
    }

    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        boolean z10;
        BadgeState.State state = this.f5711e.f5676b;
        String str = state.f5695q;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = state.f5697s;
            if (!(i10 == -2 || str == null || str.length() <= i10)) {
                Context context = this.f5707a.get();
                if (context == null) {
                    return "";
                }
                str = String.format(context.getString(R$string.m3_exceed_max_badge_text_suffix), new Object[]{str.substring(0, i10 - 1), "…"});
            }
            return str;
        } else if (!g()) {
            return null;
        } else {
            if (this.f5714o == -2 || e() <= this.f5714o) {
                return NumberFormat.getInstance(this.f5711e.f5676b.f5699u).format((long) e());
            }
            Context context2 = this.f5707a.get();
            if (context2 == null) {
                return "";
            }
            return String.format(this.f5711e.f5676b.f5699u, context2.getString(R$string.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.f5714o), "+"});
        }
    }

    public final CharSequence c() {
        boolean z10;
        Context context;
        int i10;
        if (!isVisible()) {
            return null;
        }
        BadgeState.State state = this.f5711e.f5676b;
        String str = state.f5695q;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            CharSequence charSequence = state.f5700v;
            if (charSequence != null) {
                return charSequence;
            }
            return str;
        } else if (!g()) {
            return this.f5711e.f5676b.f5701w;
        } else {
            if (this.f5711e.f5676b.f5702x == 0 || (context = this.f5707a.get()) == null) {
                return null;
            }
            if (this.f5714o == -2 || e() <= (i10 = this.f5714o)) {
                return context.getResources().getQuantityString(this.f5711e.f5676b.f5702x, e(), new Object[]{Integer.valueOf(e())});
            }
            return context.getString(this.f5711e.f5676b.f5703y, new Object[]{Integer.valueOf(i10)});
        }
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.f5719t;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void draw(Canvas canvas) {
        String b10;
        int i10;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f5708b.draw(canvas);
            if (f() && (b10 = b()) != null) {
                Rect rect = new Rect();
                this.f5709c.f6494a.getTextBounds(b10, 0, b10.length(), rect);
                float exactCenterY = this.f5713n - rect.exactCenterY();
                float f10 = this.f5712f;
                if (rect.bottom <= 0) {
                    i10 = (int) exactCenterY;
                } else {
                    i10 = Math.round(exactCenterY);
                }
                canvas.drawText(b10, f10, (float) i10, this.f5709c.f6494a);
            }
        }
    }

    public final int e() {
        boolean z10;
        int i10 = this.f5711e.f5676b.f5696r;
        if (i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i10;
        }
        return 0;
    }

    public final boolean f() {
        boolean z10;
        if (this.f5711e.f5676b.f5695q != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || g()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        boolean z10;
        boolean z11;
        BadgeState.State state = this.f5711e.f5676b;
        if (state.f5695q != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (state.f5696r != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public final int getAlpha() {
        return this.f5711e.f5676b.f5694p;
    }

    public final int getIntrinsicHeight() {
        return this.f5710d.height();
    }

    public final int getIntrinsicWidth() {
        return this.f5710d.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        int i10;
        int i11;
        Context context = this.f5707a.get();
        if (context != null) {
            h hVar = this.f5708b;
            if (f()) {
                i10 = this.f5711e.f5676b.f5692n.intValue();
            } else {
                i10 = this.f5711e.f5676b.f5690e.intValue();
            }
            if (f()) {
                i11 = this.f5711e.f5676b.f5693o.intValue();
            } else {
                i11 = this.f5711e.f5676b.f5691f.intValue();
            }
            hVar.setShapeAppearanceModel(new m(m.a(context, i10, i11)));
            invalidateSelf();
        }
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f5718s = new WeakReference<>(view);
        this.f5719t = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    public final boolean isStateful() {
        return false;
    }

    public final void j() {
        View view;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        float f17;
        float f18;
        float f19;
        Context context = this.f5707a.get();
        WeakReference<View> weakReference = this.f5718s;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f5710d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f5719t;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            if (f()) {
                f10 = this.f5711e.f5678d;
            } else {
                f10 = this.f5711e.f5677c;
            }
            this.f5715p = f10;
            if (f10 != -1.0f) {
                this.f5716q = f10;
                this.f5717r = f10;
            } else {
                if (f()) {
                    f18 = this.f5711e.f5681g;
                } else {
                    f18 = this.f5711e.f5679e;
                }
                this.f5716q = (float) Math.round(f18 / 2.0f);
                if (f()) {
                    f19 = this.f5711e.f5682h;
                } else {
                    f19 = this.f5711e.f5680f;
                }
                this.f5717r = (float) Math.round(f19 / 2.0f);
            }
            if (f()) {
                String b10 = b();
                this.f5716q = Math.max(this.f5716q, (this.f5709c.a(b10) / 2.0f) + ((float) this.f5711e.f5676b.B.intValue()));
                float f20 = this.f5717r;
                r rVar = this.f5709c;
                if (!rVar.f6498e) {
                    f17 = rVar.f6497d;
                } else {
                    rVar.b(b10);
                    f17 = rVar.f6497d;
                }
                float max = Math.max(f20, (f17 / 2.0f) + ((float) this.f5711e.f5676b.C.intValue()));
                this.f5717r = max;
                this.f5716q = Math.max(this.f5716q, max);
            }
            int intValue = this.f5711e.f5676b.E.intValue();
            if (f()) {
                intValue = this.f5711e.f5676b.G.intValue();
                Context context2 = this.f5707a.get();
                if (context2 != null) {
                    intValue = b.b(b.a(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue, intValue - this.f5711e.f5676b.J.intValue());
                }
            }
            if (this.f5711e.f5685k == 0) {
                intValue -= Math.round(this.f5717r);
            }
            int intValue2 = this.f5711e.f5676b.I.intValue() + intValue;
            int intValue3 = this.f5711e.f5676b.f5704z.intValue();
            if (intValue3 == 8388691 || intValue3 == 8388693) {
                this.f5713n = (float) (rect2.bottom - intValue2);
            } else {
                this.f5713n = (float) (rect2.top + intValue2);
            }
            if (f()) {
                i10 = this.f5711e.f5676b.F.intValue();
            } else {
                i10 = this.f5711e.f5676b.D.intValue();
            }
            boolean z10 = true;
            if (this.f5711e.f5685k == 1) {
                if (f()) {
                    i11 = this.f5711e.f5684j;
                } else {
                    i11 = this.f5711e.f5683i;
                }
                i10 += i11;
            }
            int intValue4 = this.f5711e.f5676b.H.intValue() + i10;
            int intValue5 = this.f5711e.f5676b.f5704z.intValue();
            if (intValue5 == 8388659 || intValue5 == 8388691) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.e.d(view) == 0) {
                    f15 = (((float) rect2.left) - this.f5716q) + ((float) intValue4);
                } else {
                    f15 = (((float) rect2.right) + this.f5716q) - ((float) intValue4);
                }
                this.f5712f = f15;
            } else {
                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                if (d0.e.d(view) == 0) {
                    f16 = (((float) rect2.right) + this.f5716q) - ((float) intValue4);
                } else {
                    f16 = (((float) rect2.left) - this.f5716q) + ((float) intValue4);
                }
                this.f5712f = f16;
            }
            if (this.f5711e.f5676b.K.booleanValue()) {
                View d10 = d();
                if (d10 != null) {
                    FrameLayout d11 = d();
                    if (d11 == null || d11.getId() != R$id.mtrl_anchor_parent) {
                        z10 = false;
                    }
                    if (!z10) {
                        f12 = 0.0f;
                        f11 = 0.0f;
                    } else if (d10.getParent() instanceof View) {
                        f12 = d10.getY();
                        f11 = d10.getX();
                        d10 = (View) d10.getParent();
                    }
                } else if (view.getParent() instanceof View) {
                    float y10 = view.getY();
                    f11 = view.getX();
                    float f21 = y10;
                    d10 = (View) view.getParent();
                    f12 = f21;
                }
                float y11 = d10.getY() + (this.f5713n - this.f5717r) + f12;
                float x10 = d10.getX() + (this.f5712f - this.f5716q) + f11;
                if (d10.getParent() instanceof View) {
                    f13 = ((this.f5713n + this.f5717r) - (((float) ((View) d10.getParent()).getHeight()) - d10.getY())) + f12;
                } else {
                    f13 = 0.0f;
                }
                if (d10.getParent() instanceof View) {
                    f14 = ((this.f5712f + this.f5716q) - (((float) ((View) d10.getParent()).getWidth()) - d10.getX())) + f11;
                } else {
                    f14 = 0.0f;
                }
                if (y11 < 0.0f) {
                    this.f5713n = Math.abs(y11) + this.f5713n;
                }
                if (x10 < 0.0f) {
                    this.f5712f = Math.abs(x10) + this.f5712f;
                }
                if (f13 > 0.0f) {
                    this.f5713n -= Math.abs(f13);
                }
                if (f14 > 0.0f) {
                    this.f5712f -= Math.abs(f14);
                }
            }
            Rect rect3 = this.f5710d;
            float f22 = this.f5712f;
            float f23 = this.f5713n;
            float f24 = this.f5716q;
            float f25 = this.f5717r;
            rect3.set((int) (f22 - f24), (int) (f23 - f25), (int) (f22 + f24), (int) (f23 + f25));
            float f26 = this.f5715p;
            if (f26 != -1.0f) {
                h hVar = this.f5708b;
                hVar.setShapeAppearanceModel(hVar.f12778a.f12798a.g(f26));
            }
            if (!rect.equals(this.f5710d)) {
                this.f5708b.setBounds(this.f5710d);
            }
        }
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i10) {
        BadgeState badgeState = this.f5711e;
        badgeState.f5675a.f5694p = i10;
        badgeState.f5676b.f5694p = i10;
        this.f5709c.f6494a.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
