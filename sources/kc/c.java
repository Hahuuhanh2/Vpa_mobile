package kc;

import java.util.HashMap;
import java.util.Set;
import za.b;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12460a = new HashMap();

    /* compiled from: com.google.mlkit:common@@18.7.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Class f12461a = a.class;

        /* renamed from: b  reason: collision with root package name */
        public final b f12462b;

        public a(b bVar) {
            this.f12462b = bVar;
        }
    }

    public c(Set<a> set) {
        for (a next : set) {
            this.f12460a.put(next.f12461a, next.f12462b);
        }
    }
}
