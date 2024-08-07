package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.b;

/* compiled from: CircularRevealWidget */
public interface c extends b.a {

    /* compiled from: CircularRevealWidget */
    public static class a implements TypeEvaluator<d> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f6067b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final d f6068a = new d();

        public final Object evaluate(float f10, Object obj, Object obj2) {
            d dVar = (d) obj;
            d dVar2 = (d) obj2;
            d dVar3 = this.f6068a;
            float f11 = dVar.f6071a;
            float f12 = 1.0f - f10;
            float f13 = (dVar2.f6071a * f10) + (f11 * f12);
            float f14 = dVar.f6072b;
            float f15 = dVar2.f6072b * f10;
            float f16 = dVar.f6073c;
            float f17 = f10 * dVar2.f6073c;
            dVar3.f6071a = f13;
            dVar3.f6072b = f15 + (f14 * f12);
            dVar3.f6073c = f17 + (f12 * f16);
            return dVar3;
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class b extends Property<c, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f6069a = new b();

        public b() {
            super(d.class, "circularReveal");
        }

        public final Object get(Object obj) {
            return ((c) obj).getRevealInfo();
        }

        public final void set(Object obj, Object obj2) {
            ((c) obj).setRevealInfo((d) obj2);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c  reason: collision with other inner class name */
    /* compiled from: CircularRevealWidget */
    public static class C0064c extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0064c f6070a = new C0064c();

        public C0064c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((c) obj).getCircularRevealScrimColor());
        }

        public final void set(Object obj, Object obj2) {
            ((c) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(d dVar);

    /* compiled from: CircularRevealWidget */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public float f6071a;

        /* renamed from: b  reason: collision with root package name */
        public float f6072b;

        /* renamed from: c  reason: collision with root package name */
        public float f6073c;

        public d() {
        }

        public d(float f10, float f11, float f12) {
            this.f6071a = f10;
            this.f6072b = f11;
            this.f6073c = f12;
        }

        public d(d dVar) {
            this(dVar.f6071a, dVar.f6072b, dVar.f6073c);
        }
    }
}
