package f6;

import f0.b0;
import sa.b;
import sa.c;
import va.d;

/* compiled from: AutoProtoEncoderDoNotUseEncoder */
public final class a implements c<i6.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9964a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f9965b = new b("window", b0.z(b0.x(d.class, new va.a(1))));

    /* renamed from: c  reason: collision with root package name */
    public static final b f9966c = new b("logSourceMetrics", b0.z(b0.x(d.class, new va.a(2))));

    /* renamed from: d  reason: collision with root package name */
    public static final b f9967d = new b("globalMetrics", b0.z(b0.x(d.class, new va.a(3))));

    /* renamed from: e  reason: collision with root package name */
    public static final b f9968e = new b("appNamespace", b0.z(b0.x(d.class, new va.a(4))));

    public final void encode(Object obj, Object obj2) {
        i6.a aVar = (i6.a) obj;
        sa.d dVar = (sa.d) obj2;
        dVar.add(f9965b, (Object) aVar.f11161a);
        dVar.add(f9966c, (Object) aVar.f11162b);
        dVar.add(f9967d, (Object) aVar.f11163c);
        dVar.add(f9968e, (Object) aVar.f11164d);
    }
}
