package f6;

import f0.b0;
import sa.b;
import va.a;
import va.d;

/* compiled from: AutoProtoEncoderDoNotUseEncoder */
public final class c implements sa.c<i6.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9971a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final b f9972b = new b("eventsDroppedCount", b0.z(b0.x(d.class, new a(1))));

    /* renamed from: c  reason: collision with root package name */
    public static final b f9973c = new b("reason", b0.z(b0.x(d.class, new a(3))));

    public final void encode(Object obj, Object obj2) {
        i6.c cVar = (i6.c) obj;
        sa.d dVar = (sa.d) obj2;
        dVar.add(f9972b, cVar.f11170a);
        dVar.add(f9973c, (Object) cVar.f11171b);
    }
}
