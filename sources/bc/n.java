package bc;

import dc.p;

/* compiled from: JsonObject */
public final class n extends l {

    /* renamed from: a  reason: collision with root package name */
    public final p<String, l> f4161a = new p<>(false);

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof n) && ((n) obj).f4161a.equals(this.f4161a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4161a.hashCode();
    }
}
