package xb;

import sa.b;
import sa.c;
import sa.d;

/* compiled from: AutoSessionEventEncoder */
public final class f implements c<r> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f17198a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final b f17199b = b.b("eventType");

    /* renamed from: c  reason: collision with root package name */
    public static final b f17200c = b.b("sessionData");

    /* renamed from: d  reason: collision with root package name */
    public static final b f17201d = b.b("applicationInfo");

    public final void encode(Object obj, Object obj2) {
        r rVar = (r) obj;
        d dVar = (d) obj2;
        dVar.add(f17199b, (Object) rVar.f17248a);
        dVar.add(f17200c, (Object) rVar.f17249b);
        dVar.add(f17201d, (Object) rVar.f17250c);
    }
}
