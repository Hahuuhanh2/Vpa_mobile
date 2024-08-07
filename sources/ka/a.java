package ka;

import ka.b0;

/* compiled from: AutoCrashlyticsReportEncoder */
public final class a implements ta.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12110a = new a();

    /* renamed from: ka.a$a  reason: collision with other inner class name */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C0138a implements sa.c<b0.a.C0139a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0138a f12111a = new C0138a();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12112b = sa.b.b("arch");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12113c = sa.b.b("libraryName");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12114d = sa.b.b("buildId");

        public final void encode(Object obj, Object obj2) {
            b0.a.C0139a aVar = (b0.a.C0139a) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12112b, (Object) aVar.a());
            dVar.add(f12113c, (Object) aVar.c());
            dVar.add(f12114d, (Object) aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class b implements sa.c<b0.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12115a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12116b = sa.b.b("pid");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12117c = sa.b.b("processName");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12118d = sa.b.b("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12119e = sa.b.b("importance");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12120f = sa.b.b("pss");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f12121g = sa.b.b("rss");

        /* renamed from: h  reason: collision with root package name */
        public static final sa.b f12122h = sa.b.b("timestamp");

        /* renamed from: i  reason: collision with root package name */
        public static final sa.b f12123i = sa.b.b("traceFile");

        /* renamed from: j  reason: collision with root package name */
        public static final sa.b f12124j = sa.b.b("buildIdMappingForArch");

        public final void encode(Object obj, Object obj2) {
            b0.a aVar = (b0.a) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12116b, aVar.c());
            dVar.add(f12117c, (Object) aVar.d());
            dVar.add(f12118d, aVar.f());
            dVar.add(f12119e, aVar.b());
            dVar.add(f12120f, aVar.e());
            dVar.add(f12121g, aVar.g());
            dVar.add(f12122h, aVar.h());
            dVar.add(f12123i, (Object) aVar.i());
            dVar.add(f12124j, (Object) aVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class c implements sa.c<b0.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12125a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12126b = sa.b.b("key");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12127c = sa.b.b("value");

        public final void encode(Object obj, Object obj2) {
            b0.c cVar = (b0.c) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12126b, (Object) cVar.a());
            dVar.add(f12127c, (Object) cVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class d implements sa.c<b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f12128a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12129b = sa.b.b("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12130c = sa.b.b("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12131d = sa.b.b("platform");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12132e = sa.b.b("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12133f = sa.b.b("firebaseInstallationId");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f12134g = sa.b.b("appQualitySessionId");

        /* renamed from: h  reason: collision with root package name */
        public static final sa.b f12135h = sa.b.b("buildVersion");

        /* renamed from: i  reason: collision with root package name */
        public static final sa.b f12136i = sa.b.b("displayVersion");

        /* renamed from: j  reason: collision with root package name */
        public static final sa.b f12137j = sa.b.b("session");

        /* renamed from: k  reason: collision with root package name */
        public static final sa.b f12138k = sa.b.b("ndkPayload");

        /* renamed from: l  reason: collision with root package name */
        public static final sa.b f12139l = sa.b.b("appExitInfo");

        public final void encode(Object obj, Object obj2) {
            b0 b0Var = (b0) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12129b, (Object) b0Var.j());
            dVar.add(f12130c, (Object) b0Var.f());
            dVar.add(f12131d, b0Var.i());
            dVar.add(f12132e, (Object) b0Var.g());
            dVar.add(f12133f, (Object) b0Var.e());
            dVar.add(f12134g, (Object) b0Var.b());
            dVar.add(f12135h, (Object) b0Var.c());
            dVar.add(f12136i, (Object) b0Var.d());
            dVar.add(f12137j, (Object) b0Var.k());
            dVar.add(f12138k, (Object) b0Var.h());
            dVar.add(f12139l, (Object) b0Var.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class e implements sa.c<b0.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f12140a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12141b = sa.b.b("files");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12142c = sa.b.b("orgId");

        public final void encode(Object obj, Object obj2) {
            b0.d dVar = (b0.d) obj;
            sa.d dVar2 = (sa.d) obj2;
            dVar2.add(f12141b, (Object) dVar.a());
            dVar2.add(f12142c, (Object) dVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class f implements sa.c<b0.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f12143a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12144b = sa.b.b("filename");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12145c = sa.b.b("contents");

        public final void encode(Object obj, Object obj2) {
            b0.d.a aVar = (b0.d.a) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12144b, (Object) aVar.b());
            dVar.add(f12145c, (Object) aVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class g implements sa.c<b0.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f12146a = new g();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12147b = sa.b.b("identifier");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12148c = sa.b.b("version");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12149d = sa.b.b("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12150e = sa.b.b("organization");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12151f = sa.b.b("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f12152g = sa.b.b("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        public static final sa.b f12153h = sa.b.b("developmentPlatformVersion");

        public final void encode(Object obj, Object obj2) {
            b0.e.a aVar = (b0.e.a) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12147b, (Object) aVar.d());
            dVar.add(f12148c, (Object) aVar.g());
            dVar.add(f12149d, (Object) aVar.c());
            dVar.add(f12150e, (Object) aVar.f());
            dVar.add(f12151f, (Object) aVar.e());
            dVar.add(f12152g, (Object) aVar.a());
            dVar.add(f12153h, (Object) aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class h implements sa.c<b0.e.a.C0141a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f12154a = new h();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12155b = sa.b.b("clsId");

        public final void encode(Object obj, Object obj2) {
            sa.b bVar = f12155b;
            ((b0.e.a.C0141a) obj).a();
            ((sa.d) obj2).add(bVar, (Object) null);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class i implements sa.c<b0.e.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f12156a = new i();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12157b = sa.b.b("arch");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12158c = sa.b.b("model");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12159d = sa.b.b("cores");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12160e = sa.b.b("ram");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12161f = sa.b.b("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f12162g = sa.b.b("simulator");

        /* renamed from: h  reason: collision with root package name */
        public static final sa.b f12163h = sa.b.b("state");

        /* renamed from: i  reason: collision with root package name */
        public static final sa.b f12164i = sa.b.b("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        public static final sa.b f12165j = sa.b.b("modelClass");

        public final void encode(Object obj, Object obj2) {
            b0.e.c cVar = (b0.e.c) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12157b, cVar.a());
            dVar.add(f12158c, (Object) cVar.e());
            dVar.add(f12159d, cVar.b());
            dVar.add(f12160e, cVar.g());
            dVar.add(f12161f, cVar.c());
            dVar.add(f12162g, cVar.i());
            dVar.add(f12163h, cVar.h());
            dVar.add(f12164i, (Object) cVar.d());
            dVar.add(f12165j, (Object) cVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class j implements sa.c<b0.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f12166a = new j();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12167b = sa.b.b("generator");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12168c = sa.b.b("identifier");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12169d = sa.b.b("appQualitySessionId");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12170e = sa.b.b("startedAt");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12171f = sa.b.b("endedAt");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f12172g = sa.b.b("crashed");

        /* renamed from: h  reason: collision with root package name */
        public static final sa.b f12173h = sa.b.b("app");

        /* renamed from: i  reason: collision with root package name */
        public static final sa.b f12174i = sa.b.b("user");

        /* renamed from: j  reason: collision with root package name */
        public static final sa.b f12175j = sa.b.b("os");

        /* renamed from: k  reason: collision with root package name */
        public static final sa.b f12176k = sa.b.b("device");

        /* renamed from: l  reason: collision with root package name */
        public static final sa.b f12177l = sa.b.b("events");

        /* renamed from: m  reason: collision with root package name */
        public static final sa.b f12178m = sa.b.b("generatorType");

        public final void encode(Object obj, Object obj2) {
            b0.e eVar = (b0.e) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12167b, (Object) eVar.f());
            dVar.add(f12168c, (Object) eVar.h().getBytes(b0.f12263a));
            dVar.add(f12169d, (Object) eVar.b());
            dVar.add(f12170e, eVar.j());
            dVar.add(f12171f, (Object) eVar.d());
            dVar.add(f12172g, eVar.l());
            dVar.add(f12173h, (Object) eVar.a());
            dVar.add(f12174i, (Object) eVar.k());
            dVar.add(f12175j, (Object) eVar.i());
            dVar.add(f12176k, (Object) eVar.c());
            dVar.add(f12177l, (Object) eVar.e());
            dVar.add(f12178m, eVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class k implements sa.c<b0.e.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f12179a = new k();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12180b = sa.b.b("execution");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12181c = sa.b.b("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12182d = sa.b.b("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12183e = sa.b.b("background");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12184f = sa.b.b("uiOrientation");

        public final void encode(Object obj, Object obj2) {
            b0.e.d.a aVar = (b0.e.d.a) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12180b, (Object) aVar.c());
            dVar.add(f12181c, (Object) aVar.b());
            dVar.add(f12182d, (Object) aVar.d());
            dVar.add(f12183e, (Object) aVar.a());
            dVar.add(f12184f, aVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class l implements sa.c<b0.e.d.a.b.C0143a> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f12185a = new l();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12186b = sa.b.b("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12187c = sa.b.b("size");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12188d = sa.b.b("name");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12189e = sa.b.b("uuid");

        public final void encode(Object obj, Object obj2) {
            byte[] bArr;
            b0.e.d.a.b.C0143a aVar = (b0.e.d.a.b.C0143a) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12186b, aVar.a());
            dVar.add(f12187c, aVar.c());
            dVar.add(f12188d, (Object) aVar.b());
            sa.b bVar = f12189e;
            String d10 = aVar.d();
            if (d10 != null) {
                bArr = d10.getBytes(b0.f12263a);
            } else {
                bArr = null;
            }
            dVar.add(bVar, (Object) bArr);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class m implements sa.c<b0.e.d.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f12190a = new m();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12191b = sa.b.b("threads");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12192c = sa.b.b("exception");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12193d = sa.b.b("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12194e = sa.b.b("signal");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12195f = sa.b.b("binaries");

        public final void encode(Object obj, Object obj2) {
            b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12191b, (Object) bVar.e());
            dVar.add(f12192c, (Object) bVar.c());
            dVar.add(f12193d, (Object) bVar.a());
            dVar.add(f12194e, (Object) bVar.d());
            dVar.add(f12195f, (Object) bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class n implements sa.c<b0.e.d.a.b.C0145b> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f12196a = new n();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12197b = sa.b.b("type");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12198c = sa.b.b("reason");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12199d = sa.b.b("frames");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12200e = sa.b.b("causedBy");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12201f = sa.b.b("overflowCount");

        public final void encode(Object obj, Object obj2) {
            b0.e.d.a.b.C0145b bVar = (b0.e.d.a.b.C0145b) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12197b, (Object) bVar.e());
            dVar.add(f12198c, (Object) bVar.d());
            dVar.add(f12199d, (Object) bVar.b());
            dVar.add(f12200e, (Object) bVar.a());
            dVar.add(f12201f, bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class o implements sa.c<b0.e.d.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f12202a = new o();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12203b = sa.b.b("name");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12204c = sa.b.b("code");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12205d = sa.b.b("address");

        public final void encode(Object obj, Object obj2) {
            b0.e.d.a.b.c cVar = (b0.e.d.a.b.c) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12203b, (Object) cVar.c());
            dVar.add(f12204c, (Object) cVar.b());
            dVar.add(f12205d, cVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class p implements sa.c<b0.e.d.a.b.C0148d> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f12206a = new p();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12207b = sa.b.b("name");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12208c = sa.b.b("importance");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12209d = sa.b.b("frames");

        public final void encode(Object obj, Object obj2) {
            b0.e.d.a.b.C0148d dVar = (b0.e.d.a.b.C0148d) obj;
            sa.d dVar2 = (sa.d) obj2;
            dVar2.add(f12207b, (Object) dVar.c());
            dVar2.add(f12208c, dVar.b());
            dVar2.add(f12209d, (Object) dVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class q implements sa.c<b0.e.d.a.b.C0148d.C0150b> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f12210a = new q();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12211b = sa.b.b("pc");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12212c = sa.b.b("symbol");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12213d = sa.b.b("file");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12214e = sa.b.b("offset");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12215f = sa.b.b("importance");

        public final void encode(Object obj, Object obj2) {
            b0.e.d.a.b.C0148d.C0150b bVar = (b0.e.d.a.b.C0148d.C0150b) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12211b, bVar.d());
            dVar.add(f12212c, (Object) bVar.e());
            dVar.add(f12213d, (Object) bVar.a());
            dVar.add(f12214e, bVar.c());
            dVar.add(f12215f, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class r implements sa.c<b0.e.d.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f12216a = new r();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12217b = sa.b.b("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12218c = sa.b.b("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12219d = sa.b.b("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12220e = sa.b.b("orientation");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12221f = sa.b.b("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        public static final sa.b f12222g = sa.b.b("diskUsed");

        public final void encode(Object obj, Object obj2) {
            b0.e.d.c cVar = (b0.e.d.c) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12217b, (Object) cVar.a());
            dVar.add(f12218c, cVar.b());
            dVar.add(f12219d, cVar.f());
            dVar.add(f12220e, cVar.d());
            dVar.add(f12221f, cVar.e());
            dVar.add(f12222g, cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class s implements sa.c<b0.e.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f12223a = new s();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12224b = sa.b.b("timestamp");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12225c = sa.b.b("type");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12226d = sa.b.b("app");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12227e = sa.b.b("device");

        /* renamed from: f  reason: collision with root package name */
        public static final sa.b f12228f = sa.b.b("log");

        public final void encode(Object obj, Object obj2) {
            b0.e.d dVar = (b0.e.d) obj;
            sa.d dVar2 = (sa.d) obj2;
            dVar2.add(f12224b, dVar.d());
            dVar2.add(f12225c, (Object) dVar.e());
            dVar2.add(f12226d, (Object) dVar.a());
            dVar2.add(f12227e, (Object) dVar.b());
            dVar2.add(f12228f, (Object) dVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class t implements sa.c<b0.e.d.C0152d> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f12229a = new t();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12230b = sa.b.b("content");

        public final void encode(Object obj, Object obj2) {
            ((sa.d) obj2).add(f12230b, (Object) ((b0.e.d.C0152d) obj).a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class u implements sa.c<b0.e.C0153e> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f12231a = new u();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12232b = sa.b.b("platform");

        /* renamed from: c  reason: collision with root package name */
        public static final sa.b f12233c = sa.b.b("version");

        /* renamed from: d  reason: collision with root package name */
        public static final sa.b f12234d = sa.b.b("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final sa.b f12235e = sa.b.b("jailbroken");

        public final void encode(Object obj, Object obj2) {
            b0.e.C0153e eVar = (b0.e.C0153e) obj;
            sa.d dVar = (sa.d) obj2;
            dVar.add(f12232b, eVar.b());
            dVar.add(f12233c, (Object) eVar.c());
            dVar.add(f12234d, (Object) eVar.a());
            dVar.add(f12235e, eVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class v implements sa.c<b0.e.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f12236a = new v();

        /* renamed from: b  reason: collision with root package name */
        public static final sa.b f12237b = sa.b.b("identifier");

        public final void encode(Object obj, Object obj2) {
            ((sa.d) obj2).add(f12237b, (Object) ((b0.e.f) obj).a());
        }
    }

    public final void configure(ta.b<?> bVar) {
        d dVar = d.f12128a;
        bVar.registerEncoder(b0.class, dVar);
        bVar.registerEncoder(b.class, dVar);
        j jVar = j.f12166a;
        bVar.registerEncoder(b0.e.class, jVar);
        bVar.registerEncoder(h.class, jVar);
        g gVar = g.f12146a;
        bVar.registerEncoder(b0.e.a.class, gVar);
        bVar.registerEncoder(i.class, gVar);
        h hVar = h.f12154a;
        bVar.registerEncoder(b0.e.a.C0141a.class, hVar);
        bVar.registerEncoder(j.class, hVar);
        v vVar = v.f12236a;
        bVar.registerEncoder(b0.e.f.class, vVar);
        bVar.registerEncoder(w.class, vVar);
        u uVar = u.f12231a;
        bVar.registerEncoder(b0.e.C0153e.class, uVar);
        bVar.registerEncoder(v.class, uVar);
        i iVar = i.f12156a;
        bVar.registerEncoder(b0.e.c.class, iVar);
        bVar.registerEncoder(k.class, iVar);
        s sVar = s.f12223a;
        bVar.registerEncoder(b0.e.d.class, sVar);
        bVar.registerEncoder(l.class, sVar);
        k kVar = k.f12179a;
        bVar.registerEncoder(b0.e.d.a.class, kVar);
        bVar.registerEncoder(m.class, kVar);
        m mVar = m.f12190a;
        bVar.registerEncoder(b0.e.d.a.b.class, mVar);
        bVar.registerEncoder(n.class, mVar);
        p pVar = p.f12206a;
        bVar.registerEncoder(b0.e.d.a.b.C0148d.class, pVar);
        bVar.registerEncoder(r.class, pVar);
        q qVar = q.f12210a;
        bVar.registerEncoder(b0.e.d.a.b.C0148d.C0150b.class, qVar);
        bVar.registerEncoder(s.class, qVar);
        n nVar = n.f12196a;
        bVar.registerEncoder(b0.e.d.a.b.C0145b.class, nVar);
        bVar.registerEncoder(p.class, nVar);
        b bVar2 = b.f12115a;
        bVar.registerEncoder(b0.a.class, bVar2);
        bVar.registerEncoder(c.class, bVar2);
        C0138a aVar = C0138a.f12111a;
        bVar.registerEncoder(b0.a.C0139a.class, aVar);
        bVar.registerEncoder(d.class, aVar);
        o oVar = o.f12202a;
        bVar.registerEncoder(b0.e.d.a.b.c.class, oVar);
        bVar.registerEncoder(q.class, oVar);
        l lVar = l.f12185a;
        bVar.registerEncoder(b0.e.d.a.b.C0143a.class, lVar);
        bVar.registerEncoder(o.class, lVar);
        c cVar = c.f12125a;
        bVar.registerEncoder(b0.c.class, cVar);
        bVar.registerEncoder(e.class, cVar);
        r rVar = r.f12216a;
        bVar.registerEncoder(b0.e.d.c.class, rVar);
        bVar.registerEncoder(t.class, rVar);
        t tVar = t.f12229a;
        bVar.registerEncoder(b0.e.d.C0152d.class, tVar);
        bVar.registerEncoder(u.class, tVar);
        e eVar = e.f12140a;
        bVar.registerEncoder(b0.d.class, eVar);
        bVar.registerEncoder(f.class, eVar);
        f fVar = f.f12143a;
        bVar.registerEncoder(b0.d.a.class, fVar);
        bVar.registerEncoder(g.class, fVar);
    }
}
