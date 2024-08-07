package g0;

import g0.g;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExifData */
public final class h implements Enumeration<Map<String, f>> {

    /* renamed from: a  reason: collision with root package name */
    public final Enumeration<Map<String, f>> f10248a;

    public h(g.a aVar) {
        this.f10248a = Collections.enumeration(aVar.f10244a);
    }

    public final boolean hasMoreElements() {
        return this.f10248a.hasMoreElements();
    }

    public final Object nextElement() {
        return new HashMap(this.f10248a.nextElement());
    }
}
