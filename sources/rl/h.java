package rl;

import nl.j;
import nl.k;

/* compiled from: TemporalQueries */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22839a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f22840b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f22841c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final d f22842d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final e f22843e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final f f22844f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final g f22845g = new g();

    /* compiled from: TemporalQueries */
    public class a implements i<j> {
        public final Object a(e eVar) {
            return (j) eVar.o(this);
        }
    }

    /* compiled from: TemporalQueries */
    public class b implements i<ol.f> {
        public final Object a(e eVar) {
            return (ol.f) eVar.o(this);
        }
    }

    /* compiled from: TemporalQueries */
    public class c implements i<j> {
        public final Object a(e eVar) {
            return (j) eVar.o(this);
        }
    }

    /* compiled from: TemporalQueries */
    public class d implements i<j> {
        public final Object a(e eVar) {
            j jVar = (j) eVar.o(h.f22839a);
            if (jVar != null) {
                return jVar;
            }
            return (j) eVar.o(h.f22843e);
        }
    }

    /* compiled from: TemporalQueries */
    public class e implements i<k> {
        public final Object a(e eVar) {
            a aVar = a.OFFSET_SECONDS;
            if (eVar.n(aVar)) {
                return k.w(eVar.k(aVar));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries */
    public class f implements i<nl.e> {
        public final Object a(e eVar) {
            a aVar = a.EPOCH_DAY;
            if (eVar.n(aVar)) {
                return nl.e.G(eVar.c(aVar));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries */
    public class g implements i<nl.g> {
        public final Object a(e eVar) {
            a aVar = a.NANO_OF_DAY;
            if (eVar.n(aVar)) {
                return nl.g.w(eVar.c(aVar));
            }
            return null;
        }
    }
}
