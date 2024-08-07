package l8;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R$styleable;

/* compiled from: ShapeAppearanceModel */
public final class m {

    /* renamed from: m  reason: collision with root package name */
    public static final k f12824m = new k(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public lb.b f12825a;

    /* renamed from: b  reason: collision with root package name */
    public lb.b f12826b;

    /* renamed from: c  reason: collision with root package name */
    public lb.b f12827c;

    /* renamed from: d  reason: collision with root package name */
    public lb.b f12828d;

    /* renamed from: e  reason: collision with root package name */
    public d f12829e;

    /* renamed from: f  reason: collision with root package name */
    public d f12830f;

    /* renamed from: g  reason: collision with root package name */
    public d f12831g;

    /* renamed from: h  reason: collision with root package name */
    public d f12832h;

    /* renamed from: i  reason: collision with root package name */
    public f f12833i;

    /* renamed from: j  reason: collision with root package name */
    public f f12834j;

    /* renamed from: k  reason: collision with root package name */
    public f f12835k;

    /* renamed from: l  reason: collision with root package name */
    public f f12836l;

    /* compiled from: ShapeAppearanceModel */
    public interface b {
        d h(d dVar);
    }

    public m(a aVar) {
        this.f12825a = aVar.f12837a;
        this.f12826b = aVar.f12838b;
        this.f12827c = aVar.f12839c;
        this.f12828d = aVar.f12840d;
        this.f12829e = aVar.f12841e;
        this.f12830f = aVar.f12842f;
        this.f12831g = aVar.f12843g;
        this.f12832h = aVar.f12844h;
        this.f12833i = aVar.f12845i;
        this.f12834j = aVar.f12846j;
        this.f12835k = aVar.f12847k;
        this.f12836l = aVar.f12848l;
    }

    public static a a(Context context, int i10, int i11) {
        return b(context, i10, i11, new a((float) 0));
    }

    public static a b(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R$styleable.ShapeAppearance);
        try {
            int i12 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamily, 0);
            int i13 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomLeft, i12);
            d e10 = e(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSize, dVar);
            d e11 = e(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopLeft, e10);
            d e12 = e(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopRight, e10);
            d e13 = e(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomRight, e10);
            d e14 = e(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomLeft, e10);
            a aVar = new a();
            lb.b o10 = m9.b.o(i13);
            aVar.f12837a = o10;
            float a10 = a.a(o10);
            if (a10 != -1.0f) {
                aVar.e(a10);
            }
            aVar.f12841e = e11;
            lb.b o11 = m9.b.o(i14);
            aVar.f12838b = o11;
            float a11 = a.a(o11);
            if (a11 != -1.0f) {
                aVar.f(a11);
            }
            aVar.f12842f = e12;
            lb.b o12 = m9.b.o(i15);
            aVar.f12839c = o12;
            float a12 = a.a(o12);
            if (a12 != -1.0f) {
                aVar.d(a12);
            }
            aVar.f12843g = e13;
            lb.b o13 = m9.b.o(i16);
            aVar.f12840d = o13;
            float a13 = a.a(o13);
            if (a13 != -1.0f) {
                aVar.c(a13);
            }
            aVar.f12844h = e14;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a c(Context context, AttributeSet attributeSet, int i10, int i11) {
        return d(context, attributeSet, i10, i11, new a((float) 0));
    }

    public static a d(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, dVar);
    }

    public static d e(TypedArray typedArray, int i10, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return dVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new k(peekValue.getFraction(1.0f, 1.0f));
        }
        return dVar;
    }

    public final boolean f(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        Class<f> cls = f.class;
        if (!this.f12836l.getClass().equals(cls) || !this.f12834j.getClass().equals(cls) || !this.f12833i.getClass().equals(cls) || !this.f12835k.getClass().equals(cls)) {
            z10 = false;
        } else {
            z10 = true;
        }
        float a10 = this.f12829e.a(rectF);
        if (this.f12830f.a(rectF) == a10 && this.f12832h.a(rectF) == a10 && this.f12831g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(this.f12826b instanceof l) || !(this.f12825a instanceof l) || !(this.f12827c instanceof l) || !(this.f12828d instanceof l)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 || !z11 || !z12) {
            return false;
        }
        return true;
    }

    public final m g(float f10) {
        a aVar = new a(this);
        aVar.b(f10);
        return new m(aVar);
    }

    public final m h(b bVar) {
        a aVar = new a(this);
        aVar.f12841e = bVar.h(this.f12829e);
        aVar.f12842f = bVar.h(this.f12830f);
        aVar.f12844h = bVar.h(this.f12832h);
        aVar.f12843g = bVar.h(this.f12831g);
        return new m(aVar);
    }

    /* compiled from: ShapeAppearanceModel */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public lb.b f12837a = new l();

        /* renamed from: b  reason: collision with root package name */
        public lb.b f12838b = new l();

        /* renamed from: c  reason: collision with root package name */
        public lb.b f12839c = new l();

        /* renamed from: d  reason: collision with root package name */
        public lb.b f12840d = new l();

        /* renamed from: e  reason: collision with root package name */
        public d f12841e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public d f12842f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public d f12843g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public d f12844h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public f f12845i = new f();

        /* renamed from: j  reason: collision with root package name */
        public f f12846j = new f();

        /* renamed from: k  reason: collision with root package name */
        public f f12847k = new f();

        /* renamed from: l  reason: collision with root package name */
        public f f12848l = new f();

        public a() {
        }

        public static float a(lb.b bVar) {
            if (bVar instanceof l) {
                return ((l) bVar).f12823c;
            }
            if (bVar instanceof e) {
                return ((e) bVar).f12776c;
            }
            return -1.0f;
        }

        public final void b(float f10) {
            e(f10);
            f(f10);
            d(f10);
            c(f10);
        }

        public final void c(float f10) {
            this.f12844h = new a(f10);
        }

        public final void d(float f10) {
            this.f12843g = new a(f10);
        }

        public final void e(float f10) {
            this.f12841e = new a(f10);
        }

        public final void f(float f10) {
            this.f12842f = new a(f10);
        }

        public a(m mVar) {
            this.f12837a = mVar.f12825a;
            this.f12838b = mVar.f12826b;
            this.f12839c = mVar.f12827c;
            this.f12840d = mVar.f12828d;
            this.f12841e = mVar.f12829e;
            this.f12842f = mVar.f12830f;
            this.f12843g = mVar.f12831g;
            this.f12844h = mVar.f12832h;
            this.f12845i = mVar.f12833i;
            this.f12846j = mVar.f12834j;
            this.f12847k = mVar.f12835k;
            this.f12848l = mVar.f12836l;
        }
    }

    public m() {
        this.f12825a = new l();
        this.f12826b = new l();
        this.f12827c = new l();
        this.f12828d = new l();
        this.f12829e = new a(0.0f);
        this.f12830f = new a(0.0f);
        this.f12831g = new a(0.0f);
        this.f12832h = new a(0.0f);
        this.f12833i = new f();
        this.f12834j = new f();
        this.f12835k = new f();
        this.f12836l = new f();
    }
}
