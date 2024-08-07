package o4;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.i;

/* compiled from: Keyframe */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i f13703a;

    /* renamed from: b  reason: collision with root package name */
    public final T f13704b;

    /* renamed from: c  reason: collision with root package name */
    public T f13705c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f13706d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f13707e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f13708f;

    /* renamed from: g  reason: collision with root package name */
    public final float f13709g;

    /* renamed from: h  reason: collision with root package name */
    public Float f13710h;

    /* renamed from: i  reason: collision with root package name */
    public float f13711i;

    /* renamed from: j  reason: collision with root package name */
    public float f13712j;

    /* renamed from: k  reason: collision with root package name */
    public int f13713k;

    /* renamed from: l  reason: collision with root package name */
    public int f13714l;

    /* renamed from: m  reason: collision with root package name */
    public float f13715m;

    /* renamed from: n  reason: collision with root package name */
    public float f13716n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f13717o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f13718p;

    public a(i iVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f13711i = -3987645.8f;
        this.f13712j = -3987645.8f;
        this.f13713k = 784923401;
        this.f13714l = 784923401;
        this.f13715m = Float.MIN_VALUE;
        this.f13716n = Float.MIN_VALUE;
        this.f13717o = null;
        this.f13718p = null;
        this.f13703a = iVar;
        this.f13704b = t10;
        this.f13705c = t11;
        this.f13706d = interpolator;
        this.f13707e = null;
        this.f13708f = null;
        this.f13709g = f10;
        this.f13710h = f11;
    }

    public final float a() {
        if (this.f13703a == null) {
            return 1.0f;
        }
        if (this.f13716n == Float.MIN_VALUE) {
            if (this.f13710h == null) {
                this.f13716n = 1.0f;
            } else {
                float b10 = b();
                float floatValue = this.f13710h.floatValue() - this.f13709g;
                i iVar = this.f13703a;
                this.f13716n = (floatValue / (iVar.f4843l - iVar.f4842k)) + b10;
            }
        }
        return this.f13716n;
    }

    public final float b() {
        i iVar = this.f13703a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f13715m == Float.MIN_VALUE) {
            float f10 = this.f13709g;
            float f11 = iVar.f4842k;
            this.f13715m = (f10 - f11) / (iVar.f4843l - f11);
        }
        return this.f13715m;
    }

    public final boolean c() {
        if (this.f13706d == null && this.f13707e == null && this.f13708f == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Keyframe{startValue=");
        q10.append(this.f13704b);
        q10.append(", endValue=");
        q10.append(this.f13705c);
        q10.append(", startFrame=");
        q10.append(this.f13709g);
        q10.append(", endFrame=");
        q10.append(this.f13710h);
        q10.append(", interpolator=");
        q10.append(this.f13706d);
        q10.append('}');
        return q10.toString();
    }

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.f13711i = -3987645.8f;
        this.f13712j = -3987645.8f;
        this.f13713k = 784923401;
        this.f13714l = 784923401;
        this.f13715m = Float.MIN_VALUE;
        this.f13716n = Float.MIN_VALUE;
        this.f13717o = null;
        this.f13718p = null;
        this.f13703a = iVar;
        this.f13704b = obj;
        this.f13705c = obj2;
        this.f13706d = null;
        this.f13707e = interpolator;
        this.f13708f = interpolator2;
        this.f13709g = f10;
        this.f13710h = null;
    }

    public a(i iVar, PointF pointF, PointF pointF2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f13711i = -3987645.8f;
        this.f13712j = -3987645.8f;
        this.f13713k = 784923401;
        this.f13714l = 784923401;
        this.f13715m = Float.MIN_VALUE;
        this.f13716n = Float.MIN_VALUE;
        this.f13717o = null;
        this.f13718p = null;
        this.f13703a = iVar;
        this.f13704b = pointF;
        this.f13705c = pointF2;
        this.f13706d = interpolator;
        this.f13707e = interpolator2;
        this.f13708f = interpolator3;
        this.f13709g = f10;
        this.f13710h = f11;
    }

    public a(T t10) {
        this.f13711i = -3987645.8f;
        this.f13712j = -3987645.8f;
        this.f13713k = 784923401;
        this.f13714l = 784923401;
        this.f13715m = Float.MIN_VALUE;
        this.f13716n = Float.MIN_VALUE;
        this.f13717o = null;
        this.f13718p = null;
        this.f13703a = null;
        this.f13704b = t10;
        this.f13705c = t10;
        this.f13706d = null;
        this.f13707e = null;
        this.f13708f = null;
        this.f13709g = Float.MIN_VALUE;
        this.f13710h = Float.valueOf(Float.MAX_VALUE);
    }
}
