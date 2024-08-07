package xb;

import sa.b;
import sa.d;

/* compiled from: AutoSessionEventEncoder */
public final class c implements sa.c<a> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f17182a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final b f17183b = b.b("packageName");

    /* renamed from: c  reason: collision with root package name */
    public static final b f17184c = b.b("versionName");

    /* renamed from: d  reason: collision with root package name */
    public static final b f17185d = b.b("appBuildVersion");

    /* renamed from: e  reason: collision with root package name */
    public static final b f17186e = b.b("deviceManufacturer");

    public final void encode(Object obj, Object obj2) {
        a aVar = (a) obj;
        d dVar = (d) obj2;
        dVar.add(f17183b, (Object) aVar.f17172a);
        dVar.add(f17184c, (Object) aVar.f17173b);
        dVar.add(f17185d, (Object) aVar.f17174c);
        dVar.add(f17186e, (Object) aVar.f17175d);
    }
}
