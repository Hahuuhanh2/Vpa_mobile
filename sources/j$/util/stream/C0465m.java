package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0372f;
import j$.util.function.Function;
import j$.util.function.K0;
import java.util.Set;

/* renamed from: j$.util.stream.m  reason: case insensitive filesystem */
final class C0465m implements Collector {

    /* renamed from: a  reason: collision with root package name */
    private final K0 f18828a;

    /* renamed from: b  reason: collision with root package name */
    private final BiConsumer f18829b;

    /* renamed from: c  reason: collision with root package name */
    private final C0372f f18830c;

    /* renamed from: d  reason: collision with root package name */
    private final Function f18831d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f18832e;

    C0465m(J0 j02, J0 j03, C0418b bVar, Set set) {
        Set set2 = Collectors.f18590a;
        C0418b bVar2 = new C0418b(1);
        this.f18828a = j02;
        this.f18829b = j03;
        this.f18830c = bVar;
        this.f18831d = bVar2;
        this.f18832e = set;
    }

    public final BiConsumer accumulator() {
        return this.f18829b;
    }

    public final Set characteristics() {
        return this.f18832e;
    }

    public final C0372f combiner() {
        return this.f18830c;
    }

    public final Function finisher() {
        return this.f18831d;
    }

    public final K0 supplier() {
        return this.f18828a;
    }
}
