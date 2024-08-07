package com.vpa.daugia.data.local.auth;

import android.content.Context;
import c3.c;
import d3.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.b;
import sk.j;
import x2.h;
import x2.n;
import x2.o;
import z2.a;

public final class BaseServiceCacheDatabase_Impl extends BaseServiceCacheDatabase {

    /* renamed from: l  reason: collision with root package name */
    public volatile b f19362l;

    public class a extends o.a {
        public a() {
            super(4);
        }

        public final void a(c cVar) {
            cVar.o("CREATE TABLE IF NOT EXISTS `api_cache_table` (`cache_key` TEXT NOT NULL, `model` TEXT, `data` TEXT, `type` TEXT NOT NULL, `service_name` TEXT, PRIMARY KEY(`cache_key`))");
            cVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '430e0871ba203c0305d11940b93625dc')");
        }

        public final void b(c cVar) {
            cVar.o("DROP TABLE IF EXISTS `api_cache_table`");
            List<? extends n.b> list = BaseServiceCacheDatabase_Impl.this.f16949f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n.b) BaseServiceCacheDatabase_Impl.this.f16949f.get(i10)).getClass();
                }
            }
        }

        public final void c(c cVar) {
            List<? extends n.b> list = BaseServiceCacheDatabase_Impl.this.f16949f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n.b) BaseServiceCacheDatabase_Impl.this.f16949f.get(i10)).getClass();
                }
            }
        }

        public final void d(c cVar) {
            BaseServiceCacheDatabase_Impl.this.f16944a = cVar;
            BaseServiceCacheDatabase_Impl.this.k(cVar);
            List<? extends n.b> list = BaseServiceCacheDatabase_Impl.this.f16949f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n.b) BaseServiceCacheDatabase_Impl.this.f16949f.get(i10)).a(cVar);
                }
            }
        }

        public final void e() {
        }

        public final void f(c cVar) {
            j7.a.A(cVar);
        }

        public final o.b g(c cVar) {
            HashMap hashMap = new HashMap(5);
            hashMap.put("cache_key", new a.C0244a("cache_key", "TEXT", true, 1, (String) null, 1));
            hashMap.put("model", new a.C0244a("model", "TEXT", false, 0, (String) null, 1));
            hashMap.put("data", new a.C0244a("data", "TEXT", false, 0, (String) null, 1));
            hashMap.put("type", new a.C0244a("type", "TEXT", true, 0, (String) null, 1));
            hashMap.put("service_name", new a.C0244a("service_name", "TEXT", false, 0, (String) null, 1));
            z2.a aVar = new z2.a("api_cache_table", hashMap, new HashSet(0), new HashSet(0));
            z2.a a10 = z2.a.a(cVar, "api_cache_table");
            if (aVar.equals(a10)) {
                return new o.b((String) null, true);
            }
            return new o.b("api_cache_table(com.vpa.daugia.data.model.BaseServiceCacheModel).\n Expected:\n" + aVar + "\n Found:\n" + a10, false);
        }
    }

    public final h d() {
        return new h(this, new HashMap(0), new HashMap(0), "api_cache_table");
    }

    public final c3.c e(x2.b bVar) {
        o oVar = new o(bVar, new a(), "430e0871ba203c0305d11940b93625dc", "79baaf856a173deb97d5b40559057880");
        Context context = bVar.f16884a;
        j.f(context, "context");
        return bVar.f16886c.c(new c.b(context, bVar.f16885b, oVar, false, false));
    }

    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new y2.b[0]);
    }

    public final Set<Class<? extends y2.a>> h() {
        return new HashSet();
    }

    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap hashMap = new HashMap();
        hashMap.put(kg.a.class, Collections.emptyList());
        return hashMap;
    }

    public final kg.a p() {
        b bVar;
        if (this.f19362l != null) {
            return this.f19362l;
        }
        synchronized (this) {
            if (this.f19362l == null) {
                this.f19362l = new b(this);
            }
            bVar = this.f19362l;
        }
        return bVar;
    }
}
