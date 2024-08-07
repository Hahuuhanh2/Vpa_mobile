package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;

public final /* synthetic */ class u implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18455a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18456b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f18457c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.f18455a = i10;
        this.f18456b = obj;
        this.f18457c = obj2;
    }

    public /* synthetic */ u(BiFunction biFunction, Function function) {
        this.f18455a = 2;
        this.f18457c = biFunction;
        this.f18456b = function;
    }

    public final BiFunction a(Function function) {
        function.getClass();
        return new u(this, function);
    }

    public final void accept(Object obj) {
        ((Consumer) this.f18456b).accept(obj);
        ((Consumer) this.f18457c).accept(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e A[LOOP:0: B:3:0x000e->B:6:0x001c, LOOP_START, PHI: r5 
      PHI: (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v3 java.lang.Object) binds: [B:2:0x0006, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f18455a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x001f
        L_0x0006:
            java.lang.Object r0 = r3.f18456b
            java.util.concurrent.ConcurrentMap r0 = (java.util.concurrent.ConcurrentMap) r0
            java.lang.Object r1 = r3.f18457c
            j$.util.function.BiFunction r1 = (j$.util.function.BiFunction) r1
        L_0x000e:
            java.lang.Object r2 = r1.apply(r4, r5)
            boolean r5 = r0.replace(r4, r5, r2)
            if (r5 != 0) goto L_0x001e
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L_0x000e
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r0 = r3.f18456b
            j$.util.function.BiConsumer r0 = (j$.util.function.BiConsumer) r0
            java.lang.Object r1 = r3.f18457c
            j$.util.function.BiConsumer r1 = (j$.util.function.BiConsumer) r1
            r0.accept(r4, r5)
            r1.accept(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.u.accept(java.lang.Object, java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f18456b).apply(((BiFunction) this.f18457c).apply(obj, obj2));
    }

    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.f18455a) {
            case 0:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
        }
    }
}
