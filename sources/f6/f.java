package f6;

import f0.b0;
import i6.e;
import sa.b;
import sa.c;
import va.a;
import va.d;

/* compiled from: AutoProtoEncoderDoNotUseEncoder */
public final class f implements c<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f9979a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final b f9980b = new b("currentCacheSizeBytes", b0.z(b0.x(d.class, new a(1))));

    /* renamed from: c  reason: collision with root package name */
    public static final b f9981c = new b("maxCacheSizeBytes", b0.z(b0.x(d.class, new a(2))));

    public final void encode(Object obj, Object obj2) {
        e eVar = (e) obj;
        sa.d dVar = (sa.d) obj2;
        dVar.add(f9980b, eVar.f11184a);
        dVar.add(f9981c, eVar.f11185b);
    }
}
