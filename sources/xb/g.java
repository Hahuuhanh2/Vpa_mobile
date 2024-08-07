package xb;

import sa.b;
import sa.c;
import sa.d;

/* compiled from: AutoSessionEventEncoder */
public final class g implements c<v> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f17202a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final b f17203b = b.b("sessionId");

    /* renamed from: c  reason: collision with root package name */
    public static final b f17204c = b.b("firstSessionId");

    /* renamed from: d  reason: collision with root package name */
    public static final b f17205d = b.b("sessionIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final b f17206e = b.b("eventTimestampUs");

    /* renamed from: f  reason: collision with root package name */
    public static final b f17207f = b.b("dataCollectionStatus");

    /* renamed from: g  reason: collision with root package name */
    public static final b f17208g = b.b("firebaseInstallationId");

    public final void encode(Object obj, Object obj2) {
        v vVar = (v) obj;
        d dVar = (d) obj2;
        dVar.add(f17203b, (Object) vVar.f17259a);
        dVar.add(f17204c, (Object) vVar.f17260b);
        dVar.add(f17205d, vVar.f17261c);
        dVar.add(f17206e, vVar.f17262d);
        dVar.add(f17207f, (Object) vVar.f17263e);
        dVar.add(f17208g, (Object) vVar.f17264f);
    }
}
