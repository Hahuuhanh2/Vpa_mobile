package bc;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: JsonArray */
public final class j extends l implements Iterable<l> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<l> f4159a = new ArrayList<>();

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof j) && ((j) obj).f4159a.equals(this.f4159a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4159a.hashCode();
    }

    public final Iterator<l> iterator() {
        return this.f4159a.iterator();
    }

    public final String l() {
        int size = this.f4159a.size();
        if (size == 1) {
            return this.f4159a.get(0).l();
        }
        throw new IllegalStateException(a.m("Array must have size 1, but has size ", size));
    }
}
