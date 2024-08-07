package e6;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class b implements ta.a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9153a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class a implements sa.c<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9154a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f9155b = sa.b.b("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f9156c = sa.b.b("model");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f9157d = sa.b.b("hardware");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f9158e = sa.b.b("device");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f9159f = sa.b.b("product");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f9160g = sa.b.b("osBuild");

        /* renamed from: h  reason: collision with root package name */
        public static final sa.b f9161h = sa.b.b("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        public static final sa.b f9162i = sa.b.b("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        public static final sa.b f9163j = sa.b.b("locale");

        /* renamed from: k  reason: collision with root package name */
        public static final sa.b f9164k = sa.b.b("country");

        /* renamed from: l  reason: collision with root package name */
        public static final sa.b f9165l = sa.b.b("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        public static final sa.b f9166m = sa.b.b("applicationBuild");

        public final void encode(Object obj, Object obj2) {
            a aVar = (a) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f9155b, (Object) aVar.l());
            dVar.add(f9156c, (Object) aVar.i());
            dVar.add(f9157d, (Object) aVar.e());
            dVar.add(f9158e, (Object) aVar.c());
            dVar.add(f9159f, (Object) aVar.k());
            dVar.add(f9160g, (Object) aVar.j());
            dVar.add(f9161h, (Object) aVar.g());
            dVar.add(f9162i, (Object) aVar.d());
            dVar.add(f9163j, (Object) aVar.f());
            dVar.add(f9164k, (Object) aVar.b());
            dVar.add(f9165l, (Object) aVar.h());
            dVar.add(f9166m, (Object) aVar.a());
        }
    }

    /* renamed from: e6.b$b  reason: collision with other inner class name */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C0098b implements sa.c<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0098b f9167a = new C0098b();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f9168b = sa.b.b("logRequest");

        public final void encode(Object obj, Object obj2) {
            ((sa.d) obj2).add(f9168b, (Object) ((j) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class c implements sa.c<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f9169a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f9170b = sa.b.b("clientType");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f9171c = sa.b.b("androidClientInfo");

        public final void encode(Object obj, Object obj2) {
            k kVar = (k) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f9170b, (Object) kVar.b());
            dVar.add(f9171c, (Object) kVar.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class d implements sa.c<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f9172a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f9173b = sa.b.b("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f9174c = sa.b.b("eventCode");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f9175d = sa.b.b("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f9176e = sa.b.b("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f9177f = sa.b.b("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f9178g = sa.b.b("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        public static final sa.b f9179h = sa.b.b("networkConnectionInfo");

        public final void encode(Object obj, Object obj2) {
            l lVar = (l) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f9173b, lVar.b());
            dVar.add(f9174c, (Object) lVar.a());
            dVar.add(f9175d, lVar.c());
            dVar.add(f9176e, (Object) lVar.e());
            dVar.add(f9177f, (Object) lVar.f());
            dVar.add(f9178g, lVar.g());
            dVar.add(f9179h, (Object) lVar.d());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class e implements sa.c<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f9180a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f9181b = sa.b.b("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f9182c = sa.b.b("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f9183d = sa.b.b("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f9184e = sa.b.b("logSource");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f9185f = sa.b.b("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f9186g = sa.b.b("logEvent");

        /* renamed from: h  reason: collision with root package name */
        public static final sa.b f9187h = sa.b.b("qosTier");

        public final void encode(Object obj, Object obj2) {
            m mVar = (m) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f9181b, mVar.f());
            dVar.add(f9182c, mVar.g());
            dVar.add(f9183d, (Object) mVar.a());
            dVar.add(f9184e, (Object) mVar.c());
            dVar.add(f9185f, (Object) mVar.d());
            dVar.add(f9186g, (Object) mVar.b());
            dVar.add(f9187h, (Object) mVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class f implements sa.c<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f9188a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f9189b = sa.b.b("networkType");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f9190c = sa.b.b("mobileSubtype");

        public final void encode(Object obj, Object obj2) {
            o oVar = (o) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f9189b, (Object) oVar.b());
            dVar.add(f9190c, (Object) oVar.a());
        }
    }

    public final void configure(ta.b<?> bVar) {
        C0098b bVar2 = C0098b.f9167a;
        bVar.registerEncoder(j.class, bVar2);
        bVar.registerEncoder(d.class, bVar2);
        e eVar = e.f9180a;
        bVar.registerEncoder(m.class, eVar);
        bVar.registerEncoder(g.class, eVar);
        c cVar = c.f9169a;
        bVar.registerEncoder(k.class, cVar);
        bVar.registerEncoder(e.class, cVar);
        a aVar = a.f9154a;
        bVar.registerEncoder(a.class, aVar);
        bVar.registerEncoder(c.class, aVar);
        d dVar = d.f9172a;
        bVar.registerEncoder(l.class, dVar);
        bVar.registerEncoder(f.class, dVar);
        f fVar = f.f9188a;
        bVar.registerEncoder(o.class, fVar);
        bVar.registerEncoder(i.class, fVar);
    }
}
