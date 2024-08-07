package f1;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.a;
import e1.c;
import g1.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import v.v;

/* compiled from: MotionConstrainedPoint */
public final class l implements Comparable<l> {

    /* renamed from: a  reason: collision with root package name */
    public float f9711a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public int f9712b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f9713c;

    /* renamed from: d  reason: collision with root package name */
    public float f9714d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f9715e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f9716f = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f9717n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f9718o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f9719p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public float f9720q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f9721r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f9722s = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    public float f9723t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f9724u = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    public float f9725v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f9726w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    public LinkedHashMap<String, a> f9727x = new LinkedHashMap<>();

    public static boolean i(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            if (Float.isNaN(f10) != Float.isNaN(f11)) {
                return true;
            }
            return false;
        } else if (Math.abs(f10 - f11) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    public final void b(HashMap<String, c> hashMap, int i10) {
        for (String next : hashMap.keySet()) {
            c cVar = hashMap.get(next);
            next.getClass();
            char c10 = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c10 = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c10 = 13;
                        break;
                    }
                    break;
            }
            float f10 = 1.0f;
            float f11 = 0.0f;
            switch (c10) {
                case 0:
                    if (!Float.isNaN(this.f9716f)) {
                        f11 = this.f9716f;
                    }
                    cVar.b(i10, f11);
                    break;
                case 1:
                    if (!Float.isNaN(this.f9717n)) {
                        f11 = this.f9717n;
                    }
                    cVar.b(i10, f11);
                    break;
                case 2:
                    if (!Float.isNaN(this.f9722s)) {
                        f11 = this.f9722s;
                    }
                    cVar.b(i10, f11);
                    break;
                case 3:
                    if (!Float.isNaN(this.f9723t)) {
                        f11 = this.f9723t;
                    }
                    cVar.b(i10, f11);
                    break;
                case 4:
                    if (!Float.isNaN(this.f9724u)) {
                        f11 = this.f9724u;
                    }
                    cVar.b(i10, f11);
                    break;
                case 5:
                    if (!Float.isNaN(this.f9726w)) {
                        f11 = this.f9726w;
                    }
                    cVar.b(i10, f11);
                    break;
                case 6:
                    if (!Float.isNaN(this.f9718o)) {
                        f10 = this.f9718o;
                    }
                    cVar.b(i10, f10);
                    break;
                case 7:
                    if (!Float.isNaN(this.f9719p)) {
                        f10 = this.f9719p;
                    }
                    cVar.b(i10, f10);
                    break;
                case 8:
                    if (!Float.isNaN(this.f9720q)) {
                        f11 = this.f9720q;
                    }
                    cVar.b(i10, f11);
                    break;
                case 9:
                    if (!Float.isNaN(this.f9721r)) {
                        f11 = this.f9721r;
                    }
                    cVar.b(i10, f11);
                    break;
                case 10:
                    if (!Float.isNaN(this.f9715e)) {
                        f11 = this.f9715e;
                    }
                    cVar.b(i10, f11);
                    break;
                case 11:
                    if (!Float.isNaN(this.f9714d)) {
                        f11 = this.f9714d;
                    }
                    cVar.b(i10, f11);
                    break;
                case 12:
                    if (!Float.isNaN(this.f9725v)) {
                        f11 = this.f9725v;
                    }
                    cVar.b(i10, f11);
                    break;
                case 13:
                    if (!Float.isNaN(this.f9711a)) {
                        f10 = this.f9711a;
                    }
                    cVar.b(i10, f10);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.f9727x.containsKey(str)) {
                            break;
                        } else {
                            a aVar = this.f9727x.get(str);
                            if (!(cVar instanceof c.b)) {
                                aVar.a();
                                Objects.toString(cVar);
                                break;
                            } else {
                                ((c.b) cVar).f9078f.append(i10, aVar);
                                break;
                            }
                        }
                    }
            }
        }
    }

    public final void c(View view) {
        float f10;
        this.f9713c = view.getVisibility();
        if (view.getVisibility() != 0) {
            f10 = 0.0f;
        } else {
            f10 = view.getAlpha();
        }
        this.f9711a = f10;
        this.f9714d = view.getElevation();
        this.f9715e = view.getRotation();
        this.f9716f = view.getRotationX();
        this.f9717n = view.getRotationY();
        this.f9718o = view.getScaleX();
        this.f9719p = view.getScaleY();
        this.f9720q = view.getPivotX();
        this.f9721r = view.getPivotY();
        this.f9722s = view.getTranslationX();
        this.f9723t = view.getTranslationY();
        this.f9724u = view.getTranslationZ();
    }

    public final int compareTo(Object obj) {
        ((l) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void j(Rect rect, androidx.constraintlayout.widget.a aVar, int i10, int i11) {
        float f10;
        rect.width();
        rect.height();
        a.C0016a h10 = aVar.h(i11);
        a.d dVar = h10.f1949c;
        int i12 = dVar.f2026c;
        this.f9712b = i12;
        int i13 = dVar.f2025b;
        this.f9713c = i13;
        if (i13 == 0 || i12 != 0) {
            f10 = dVar.f2027d;
        } else {
            f10 = 0.0f;
        }
        this.f9711a = f10;
        a.e eVar = h10.f1952f;
        boolean z10 = eVar.f2042m;
        this.f9714d = eVar.f2043n;
        this.f9715e = eVar.f2031b;
        this.f9716f = eVar.f2032c;
        this.f9717n = eVar.f2033d;
        this.f9718o = eVar.f2034e;
        this.f9719p = eVar.f2035f;
        this.f9720q = eVar.f2036g;
        this.f9721r = eVar.f2037h;
        this.f9722s = eVar.f2039j;
        this.f9723t = eVar.f2040k;
        this.f9724u = eVar.f2041l;
        b1.c.c(h10.f1950d.f2014d);
        this.f9725v = h10.f1950d.f2018h;
        this.f9726w = h10.f1949c.f2028e;
        Iterator<String> it = h10.f1953g.keySet().iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            g1.a aVar2 = h10.f1953g.get(next);
            int g2 = v.g(aVar2.f10266c);
            if (g2 == 4 || g2 == 5 || g2 == 7) {
                z11 = false;
            }
            if (z11) {
                this.f9727x.put(next, aVar2);
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f11 = this.f9715e + 90.0f;
            this.f9715e = f11;
            if (f11 > 180.0f) {
                this.f9715e = f11 - 360.0f;
                return;
            }
            return;
        }
        this.f9715e -= 90.0f;
    }
}
