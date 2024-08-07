package j$.util.stream;

import j$.util.function.Consumer;

final class Z2 extends C0417a3 implements Consumer {

    /* renamed from: b  reason: collision with root package name */
    final Object[] f18746b = new Object[128];

    Z2() {
    }

    public final void accept(Object obj) {
        Object[] objArr = this.f18746b;
        int i10 = this.f18752a;
        this.f18752a = i10 + 1;
        objArr[i10] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
