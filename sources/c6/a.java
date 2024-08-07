package c6;

/* compiled from: AutoValue_Event */
public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f4563a = null;

    /* renamed from: b  reason: collision with root package name */
    public final T f4564b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4565c;

    public a(Object obj, d dVar) {
        if (obj != null) {
            this.f4564b = obj;
            this.f4565c = dVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final Integer a() {
        return this.f4563a;
    }

    public final T b() {
        return this.f4564b;
    }

    public final d c() {
        return this.f4565c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f4563a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f4564b.equals(cVar.b()) && this.f4565c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Integer num = this.f4563a;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        return ((((i10 ^ 1000003) * 1000003) ^ this.f4564b.hashCode()) * 1000003) ^ this.f4565c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Event{code=");
        q10.append(this.f4563a);
        q10.append(", payload=");
        q10.append(this.f4564b);
        q10.append(", priority=");
        q10.append(this.f4565c);
        q10.append("}");
        return q10.toString();
    }
}
