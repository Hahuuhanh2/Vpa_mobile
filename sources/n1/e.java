package n1;

import android.graphics.Insets;

/* compiled from: Insets */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final e f13426e = new e(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f13427a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13428b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13429c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13430d;

    /* compiled from: Insets */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f13427a = i10;
        this.f13428b = i11;
        this.f13429c = i12;
        this.f13430d = i13;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f13427a, eVar2.f13427a), Math.max(eVar.f13428b, eVar2.f13428b), Math.max(eVar.f13429c, eVar2.f13429c), Math.max(eVar.f13430d, eVar2.f13430d));
    }

    public static e b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f13426e;
        }
        return new e(i10, i11, i12, i13);
    }

    public static e c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a.a(this.f13427a, this.f13428b, this.f13429c, this.f13430d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13430d == eVar.f13430d && this.f13427a == eVar.f13427a && this.f13429c == eVar.f13429c && this.f13428b == eVar.f13428b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f13427a * 31) + this.f13428b) * 31) + this.f13429c) * 31) + this.f13430d;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Insets{left=");
        q10.append(this.f13427a);
        q10.append(", top=");
        q10.append(this.f13428b);
        q10.append(", right=");
        q10.append(this.f13429c);
        q10.append(", bottom=");
        q10.append(this.f13430d);
        q10.append('}');
        return q10.toString();
    }
}
