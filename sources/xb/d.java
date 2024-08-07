package xb;

import sa.b;
import sa.c;

/* compiled from: AutoSessionEventEncoder */
public final class d implements c<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17187a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final b f17188b = b.b("appId");

    /* renamed from: c  reason: collision with root package name */
    public static final b f17189c = b.b("deviceModel");

    /* renamed from: d  reason: collision with root package name */
    public static final b f17190d = b.b("sessionSdkVersion");

    /* renamed from: e  reason: collision with root package name */
    public static final b f17191e = b.b("osVersion");

    /* renamed from: f  reason: collision with root package name */
    public static final b f17192f = b.b("logEnvironment");

    /* renamed from: g  reason: collision with root package name */
    public static final b f17193g = b.b("androidAppInfo");

    public final void encode(Object obj, Object obj2) {
        b bVar = (b) obj;
        sa.d dVar = (sa.d) obj2;
        dVar.add(f17188b, (Object) bVar.f17176a);
        dVar.add(f17189c, (Object) bVar.f17177b);
        dVar.add(f17190d, (Object) bVar.f17178c);
        dVar.add(f17191e, (Object) bVar.f17179d);
        dVar.add(f17192f, (Object) bVar.f17180e);
        dVar.add(f17193g, (Object) bVar.f17181f);
    }
}
