package j$.util;

import j$.util.function.Consumer;
import j$.util.function.I;
import j$.util.function.L;

/* renamed from: j$.util.q  reason: case insensitive filesystem */
public final /* synthetic */ class C0411q implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f18572a;

    public /* synthetic */ C0411q(Consumer consumer) {
        this.f18572a = consumer;
    }

    public final void accept(int i10) {
        this.f18572a.accept(Integer.valueOf(i10));
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
