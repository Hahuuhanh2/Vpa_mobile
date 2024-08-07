package kg;

import al.g0;
import bc.h;
import c3.f;
import com.vpa.daugia.data.model.BaseServiceCacheModel;
import com.vpa.daugia.data.model.ServiceCacheType;
import sk.j;
import x2.d;
import x2.n;

/* compiled from: ServiceCacheDao_Impl */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final n f20804a;

    /* renamed from: b  reason: collision with root package name */
    public final a f20805b;

    /* renamed from: c  reason: collision with root package name */
    public final g0 f20806c = new g0(12);

    /* compiled from: ServiceCacheDao_Impl */
    public class a extends d {
        public a(n nVar) {
            super(nVar, 1);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `api_cache_table` (`cache_key`,`model`,`data`,`type`,`service_name`) VALUES (?,?,?,?,?)";
        }

        public final void e(f fVar, Object obj) {
            String str;
            BaseServiceCacheModel baseServiceCacheModel = (BaseServiceCacheModel) obj;
            if (baseServiceCacheModel.getCacheKey() == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, baseServiceCacheModel.getCacheKey());
            }
            if (baseServiceCacheModel.getModel() == null) {
                fVar.m0(2);
            } else {
                fVar.p(2, baseServiceCacheModel.getModel());
            }
            g0 g0Var = b.this.f20806c;
            Object data = baseServiceCacheModel.getData();
            g0Var.getClass();
            j.f(data, "any");
            String str2 = new h().i(data).toString();
            if (str2 == null) {
                fVar.m0(3);
            } else {
                fVar.p(3, str2);
            }
            if (baseServiceCacheModel.getType() == null) {
                fVar.m0(4);
            } else {
                b bVar = b.this;
                ServiceCacheType type = baseServiceCacheModel.getType();
                bVar.getClass();
                if (type == null) {
                    str = null;
                } else {
                    int i10 = C0289b.f20808a[type.ordinal()];
                    if (i10 == 1) {
                        str = "GET";
                    } else if (i10 == 2) {
                        str = "POST";
                    } else if (i10 == 3) {
                        str = "UPDATE";
                    } else {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + type);
                    }
                }
                fVar.p(4, str);
            }
            if (baseServiceCacheModel.getServiceName() == null) {
                fVar.m0(5);
            } else {
                fVar.p(5, baseServiceCacheModel.getServiceName());
            }
        }
    }

    /* renamed from: kg.b$b  reason: collision with other inner class name */
    /* compiled from: ServiceCacheDao_Impl */
    public static /* synthetic */ class C0289b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20808a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.vpa.daugia.data.model.ServiceCacheType[] r0 = com.vpa.daugia.data.model.ServiceCacheType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20808a = r0
                com.vpa.daugia.data.model.ServiceCacheType r1 = com.vpa.daugia.data.model.ServiceCacheType.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20808a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.vpa.daugia.data.model.ServiceCacheType r1 = com.vpa.daugia.data.model.ServiceCacheType.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20808a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.vpa.daugia.data.model.ServiceCacheType r1 = com.vpa.daugia.data.model.ServiceCacheType.UPDATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kg.b.C0289b.<clinit>():void");
        }
    }

    public b(n nVar) {
        this.f20804a = nVar;
        this.f20805b = new a(nVar);
    }

    public final long a(BaseServiceCacheModel baseServiceCacheModel) {
        a aVar;
        f a10;
        this.f20804a.b();
        this.f20804a.c();
        try {
            aVar = this.f20805b;
            a10 = aVar.a();
            aVar.e(a10, baseServiceCacheModel);
            long L0 = a10.L0();
            aVar.d(a10);
            this.f20804a.n();
            this.f20804a.j();
            return L0;
        } catch (Throwable th2) {
            this.f20804a.j();
            throw th2;
        }
    }
}
