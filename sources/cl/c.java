package cl;

import rk.p;
import sk.i;
import sk.j;

/* compiled from: BufferedChannel.kt */
public final /* synthetic */ class c extends i implements p<Long, j<Object>, j<Object>> {

    /* renamed from: p  reason: collision with root package name */
    public static final c f19231p = new c();

    public c() {
        super(2, d.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        j jVar = (j) obj2;
        j<Object> jVar2 = d.f19232a;
        a<E> aVar = jVar.f19258e;
        j.c(aVar);
        return new j(longValue, jVar, aVar, 0);
    }
}
