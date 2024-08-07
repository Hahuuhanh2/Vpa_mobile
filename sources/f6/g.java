package f6;

import f0.b0;
import i6.f;
import sa.b;
import sa.c;
import va.a;
import va.d;

/* compiled from: AutoProtoEncoderDoNotUseEncoder */
public final class g implements c<f> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f9982a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final b f9983b = new b("startMs", b0.z(b0.x(d.class, new a(1))));

    /* renamed from: c  reason: collision with root package name */
    public static final b f9984c = new b("endMs", b0.z(b0.x(d.class, new a(2))));

    public final void encode(Object obj, Object obj2) {
        f fVar = (f) obj;
        sa.d dVar = (sa.d) obj2;
        dVar.add(f9983b, fVar.f11186a);
        dVar.add(f9984c, fVar.f11187b);
    }
}
