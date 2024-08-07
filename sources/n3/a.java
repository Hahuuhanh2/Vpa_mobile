package n3;

import android.graphics.Rect;
import sk.j;
import v.v;

/* compiled from: Bounds.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f13477a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13478b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13479c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13480d;

    public a(Rect rect) {
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        this.f13477a = i10;
        this.f13478b = i11;
        this.f13479c = i12;
        this.f13480d = i13;
    }

    public final Rect a() {
        return new Rect(this.f13477a, this.f13478b, this.f13479c, this.f13480d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<a> cls2 = a.class;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!j.a(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            a aVar = (a) obj;
            if (this.f13477a == aVar.f13477a && this.f13478b == aVar.f13478b && this.f13479c == aVar.f13479c && this.f13480d == aVar.f13480d) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    public final int hashCode() {
        return (((((this.f13477a * 31) + this.f13478b) * 31) + this.f13479c) * 31) + this.f13480d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f13477a);
        sb2.append(',');
        sb2.append(this.f13478b);
        sb2.append(',');
        sb2.append(this.f13479c);
        sb2.append(',');
        return v.e(sb2, this.f13480d, "] }");
    }
}
