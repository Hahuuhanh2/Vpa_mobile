package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.g;
import sk.j;

/* compiled from: HardwareFoldingFeature.kt */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final n3.a f3682a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3683b;

    /* renamed from: c  reason: collision with root package name */
    public final g.b f3684c;

    /* compiled from: HardwareFoldingFeature.kt */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f3685b = new a("FOLD");

        /* renamed from: c  reason: collision with root package name */
        public static final a f3686c = new a("HINGE");

        /* renamed from: a  reason: collision with root package name */
        public final String f3687a;

        public a(String str) {
            this.f3687a = str;
        }

        public final String toString() {
            return this.f3687a;
        }
    }

    public h(n3.a aVar, a aVar2, g.b bVar) {
        boolean z10;
        this.f3682a = aVar;
        this.f3683b = aVar2;
        this.f3684c = bVar;
        int i10 = aVar.f13479c;
        int i11 = aVar.f13477a;
        boolean z11 = false;
        if (i10 - i11 == 0 && aVar.f13480d - aVar.f13478b == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (!((i11 == 0 || aVar.f13478b == 0) ? true : z11)) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Bounds must be non zero".toString());
    }

    public final boolean a() {
        if (j.a(this.f3683b, a.f3686c)) {
            return true;
        }
        if (!j.a(this.f3683b, a.f3685b) || !j.a(this.f3684c, g.b.f3680c)) {
            return false;
        }
        return true;
    }

    public final g.a b() {
        n3.a aVar = this.f3682a;
        if (aVar.f13479c - aVar.f13477a > aVar.f13480d - aVar.f13478b) {
            return g.a.f3677c;
        }
        return g.a.f3676b;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<h> cls2 = h.class;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!j.a(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            h hVar = (h) obj;
            if (j.a(this.f3682a, hVar.f3682a) && j.a(this.f3683b, hVar.f3683b) && j.a(this.f3684c, hVar.f3684c)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    public final Rect getBounds() {
        return this.f3682a.a();
    }

    public final int hashCode() {
        int hashCode = this.f3683b.hashCode();
        return this.f3684c.hashCode() + ((hashCode + (this.f3682a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return h.class.getSimpleName() + " { " + this.f3682a + ", type=" + this.f3683b + ", state=" + this.f3684c + " }";
    }
}
