package f6;

import f0.b0;
import sa.b;
import sa.c;
import va.a;

/* compiled from: AutoProtoEncoderDoNotUseEncoder */
public final class d implements c<i6.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f9974a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final b f9975b = new b("logSource", b0.z(b0.x(va.d.class, new a(1))));

    /* renamed from: c  reason: collision with root package name */
    public static final b f9976c = new b("logEventDropped", b0.z(b0.x(va.d.class, new a(2))));

    public final void encode(Object obj, Object obj2) {
        i6.d dVar = (i6.d) obj;
        sa.d dVar2 = (sa.d) obj2;
        dVar2.add(f9975b, (Object) dVar.f11182a);
        dVar2.add(f9976c, (Object) dVar.f11183b);
    }
}
