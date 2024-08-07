package md;

import java.util.ArrayList;

/* compiled from: ExpandedRow */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f13262a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13263b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13264c = false;

    public b(int i10, ArrayList arrayList) {
        this.f13262a = new ArrayList(arrayList);
        this.f13263b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f13262a.equals(bVar.f13262a) || this.f13264c != bVar.f13264c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13262a.hashCode() ^ Boolean.valueOf(this.f13264c).hashCode();
    }

    public final String toString() {
        return "{ " + this.f13262a + " }";
    }
}
