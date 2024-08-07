package xb;

import sa.b;
import sa.c;
import sa.d;

/* compiled from: AutoSessionEventEncoder */
public final class e implements c<i> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f17194a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final b f17195b = b.b("performance");

    /* renamed from: c  reason: collision with root package name */
    public static final b f17196c = b.b("crashlytics");

    /* renamed from: d  reason: collision with root package name */
    public static final b f17197d = b.b("sessionSamplingRate");

    public final void encode(Object obj, Object obj2) {
        i iVar = (i) obj;
        d dVar = (d) obj2;
        dVar.add(f17195b, (Object) iVar.f17214a);
        dVar.add(f17196c, (Object) iVar.f17215b);
        dVar.add(f17197d, iVar.f17216c);
    }
}
