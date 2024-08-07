package md;

import java.util.Objects;
import ld.b;
import ld.c;

/* compiled from: ExpandedPair */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f13259a;

    /* renamed from: b  reason: collision with root package name */
    public final b f13260b;

    /* renamed from: c  reason: collision with root package name */
    public final c f13261c;

    public a(b bVar, b bVar2, c cVar) {
        this.f13259a = bVar;
        this.f13260b = bVar2;
        this.f13261c = cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Objects.equals(this.f13259a, aVar.f13259a) || !Objects.equals(this.f13260b, aVar.f13260b) || !Objects.equals(this.f13261c, aVar.f13261c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f13259a) ^ Objects.hashCode(this.f13260b)) ^ Objects.hashCode(this.f13261c);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f13259a);
        sb2.append(" , ");
        sb2.append(this.f13260b);
        sb2.append(" : ");
        c cVar = this.f13261c;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.f12961a);
        }
        sb2.append(obj);
        sb2.append(" ]");
        return sb2.toString();
    }
}
