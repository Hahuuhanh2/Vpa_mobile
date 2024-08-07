package androidx.datastore.preferences.protobuf;

import h2.f;
import j2.z;

/* compiled from: MapEntryLite */
public final class v<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f2330a;

    /* renamed from: b  reason: collision with root package name */
    public final K f2331b = "";

    /* renamed from: c  reason: collision with root package name */
    public final V f2332c;

    /* compiled from: MapEntryLite */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final z f2333a;

        /* renamed from: b  reason: collision with root package name */
        public final K f2334b = "";

        /* renamed from: c  reason: collision with root package name */
        public final z f2335c;

        /* renamed from: d  reason: collision with root package name */
        public final V f2336d;

        public a(z.a aVar, z.c cVar, f fVar) {
            this.f2333a = aVar;
            this.f2335c = cVar;
            this.f2336d = fVar;
        }
    }

    public v(z.a aVar, z.c cVar, f fVar) {
        this.f2330a = new a<>(aVar, cVar, fVar);
        this.f2332c = fVar;
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v2) {
        return l.b(aVar.f2335c, 2, v2) + l.b(aVar.f2333a, 1, k10);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v2) {
        l.o(codedOutputStream, aVar.f2333a, 1, k10);
        l.o(codedOutputStream, aVar.f2335c, 2, v2);
    }
}
