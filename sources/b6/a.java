package b6;

import java.util.Date;

/* compiled from: DateWithLabel */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4090a;

    /* renamed from: b  reason: collision with root package name */
    public final Date f4091b;

    public a(String str, Date date) {
        this.f4090a = str;
        this.f4091b = date;
        if (date == null) {
            throw new IllegalArgumentException("null value provided. label=[" + str + "], date=[" + date + "]");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f4090a.equals(aVar.f4090a)) {
            return false;
        }
        if (a6.a.c(this.f4091b).compareTo(a6.a.c(aVar.f4091b)) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        throw new IllegalStateException("Not implemented");
    }

    public final String toString() {
        return this.f4090a;
    }
}
