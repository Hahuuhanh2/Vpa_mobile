package j$.util.function;

import j$.util.function.BiConsumer;
import java.util.function.BiConsumer;

/* renamed from: j$.util.function.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0362a implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BiConsumer f18518a;

    private /* synthetic */ C0362a(BiConsumer biConsumer) {
        this.f18518a = biConsumer;
    }

    public static /* synthetic */ BiConsumer a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).f18478a : new C0362a(biConsumer);
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.f18518a.accept(obj, obj2);
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return a(this.f18518a.c(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }
}
