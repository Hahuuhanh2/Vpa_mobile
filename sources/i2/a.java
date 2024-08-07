package i2;

import fk.p;
import i2.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: Preferences.kt */
public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<e.a<?>, Object> f11016a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f11017b;

    /* renamed from: i2.a$a  reason: collision with other inner class name */
    /* compiled from: Preferences.kt */
    public static final class C0122a extends k implements l<Map.Entry<e.a<?>, Object>, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0122a f11018a = new C0122a();

        public C0122a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            j.f(entry, "entry");
            return "  " + ((e.a) entry.getKey()).f11024a + " = " + entry.getValue();
        }
    }

    public a() {
        this(false, 3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(boolean z10, int i10) {
        this((Map<e.a<?>, Object>) (i10 & 1) != 0 ? new LinkedHashMap() : null, (i10 & 2) != 0 ? true : z10);
    }

    public final Map<e.a<?>, Object> a() {
        Map<e.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f11016a);
        j.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    public final void b() {
        if (!(!this.f11017b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final <T> T c(e.a<T> aVar) {
        j.f(aVar, "key");
        return this.f11016a.get(aVar);
    }

    public final void d(e.a<?> aVar, Object obj) {
        j.f(aVar, "key");
        b();
        if (obj == null) {
            b();
            this.f11016a.remove(aVar);
        } else if (obj instanceof Set) {
            Map<e.a<?>, Object> map = this.f11016a;
            Set unmodifiableSet = Collections.unmodifiableSet(p.d1((Iterable) obj));
            j.e(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.f11016a.put(aVar, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return j.a(this.f11016a, ((a) obj).f11016a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11016a.hashCode();
    }

    public final String toString() {
        return p.Q0(this.f11016a.entrySet(), ",\n", "{\n", "\n}", C0122a.f11018a, 24);
    }

    public a(Map<e.a<?>, Object> map, boolean z10) {
        j.f(map, "preferencesMap");
        this.f11016a = map;
        this.f11017b = new AtomicBoolean(z10);
    }
}
