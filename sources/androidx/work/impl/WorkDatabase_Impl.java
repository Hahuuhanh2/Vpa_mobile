package androidx.work.impl;

import android.content.Context;
import c3.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3.c0;
import p3.d0;
import p3.e0;
import p3.f0;
import p3.g0;
import sk.j;
import x2.b;
import x2.h;
import x2.n;
import x2.o;
import x3.c;
import x3.e;
import x3.g;
import x3.k;
import x3.o;
import x3.q;
import x3.r;
import x3.t;
import x3.u;
import x3.w;
import x3.x;
import z2.a;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l  reason: collision with root package name */
    public volatile u f3763l;

    /* renamed from: m  reason: collision with root package name */
    public volatile c f3764m;

    /* renamed from: n  reason: collision with root package name */
    public volatile x f3765n;

    /* renamed from: o  reason: collision with root package name */
    public volatile k f3766o;

    /* renamed from: p  reason: collision with root package name */
    public volatile o f3767p;

    /* renamed from: q  reason: collision with root package name */
    public volatile r f3768q;

    /* renamed from: r  reason: collision with root package name */
    public volatile g f3769r;

    public class a extends o.a {
        public a() {
            super(20);
        }

        public final void a(d3.c cVar) {
            cVar.o("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.o("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            cVar.o("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            cVar.o("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            cVar.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            cVar.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            cVar.o("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.o("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            cVar.o("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.o("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.o("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            cVar.o("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            cVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        public final void b(d3.c cVar) {
            cVar.o("DROP TABLE IF EXISTS `Dependency`");
            cVar.o("DROP TABLE IF EXISTS `WorkSpec`");
            cVar.o("DROP TABLE IF EXISTS `WorkTag`");
            cVar.o("DROP TABLE IF EXISTS `SystemIdInfo`");
            cVar.o("DROP TABLE IF EXISTS `WorkName`");
            cVar.o("DROP TABLE IF EXISTS `WorkProgress`");
            cVar.o("DROP TABLE IF EXISTS `Preference`");
            List<? extends n.b> list = WorkDatabase_Impl.this.f16949f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n.b) WorkDatabase_Impl.this.f16949f.get(i10)).getClass();
                }
            }
        }

        public final void c(d3.c cVar) {
            List<? extends n.b> list = WorkDatabase_Impl.this.f16949f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n.b) WorkDatabase_Impl.this.f16949f.get(i10)).getClass();
                }
            }
        }

        public final void d(d3.c cVar) {
            WorkDatabase_Impl.this.f16944a = cVar;
            cVar.o("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.k(cVar);
            List<? extends n.b> list = WorkDatabase_Impl.this.f16949f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n.b) WorkDatabase_Impl.this.f16949f.get(i10)).a(cVar);
                }
            }
        }

        public final void e() {
        }

        public final void f(d3.c cVar) {
            j7.a.A(cVar);
        }

        public final o.b g(d3.c cVar) {
            d3.c cVar2 = cVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new a.C0244a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new a.C0244a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new a.d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new a.d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
            z2.a aVar = new z2.a("Dependency", hashMap, hashSet, hashSet2);
            z2.a a10 = z2.a.a(cVar2, "Dependency");
            if (!aVar.equals(a10)) {
                return new o.b("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + aVar + "\n Found:\n" + a10, false);
            }
            HashMap hashMap2 = new HashMap(30);
            hashMap2.put("id", new a.C0244a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new a.C0244a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new a.C0244a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new a.C0244a("input_merger_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input", new a.C0244a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new a.C0244a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new a.C0244a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new a.C0244a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new a.C0244a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new a.C0244a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new a.C0244a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new a.C0244a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_enqueue_time", new a.C0244a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            hashMap2.put("minimum_retention_duration", new a.C0244a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new a.C0244a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new a.C0244a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new a.C0244a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_count", new a.C0244a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new a.C0244a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("next_schedule_time_override", new a.C0244a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            hashMap2.put("next_schedule_time_override_generation", new a.C0244a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("stop_reason", new a.C0244a("stop_reason", "INTEGER", true, 0, "-256", 1));
            hashMap2.put("required_network_type", new a.C0244a("required_network_type", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_charging", new a.C0244a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new a.C0244a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new a.C0244a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new a.C0244a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new a.C0244a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new a.C0244a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new a.C0244a("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new a.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new a.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
            z2.a aVar2 = new z2.a("WorkSpec", hashMap2, hashSet3, hashSet4);
            z2.a a11 = z2.a.a(cVar2, "WorkSpec");
            if (!aVar2.equals(a11)) {
                return new o.b("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + aVar2 + "\n Found:\n" + a11, false);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new a.C0244a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new a.C0244a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new a.d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            z2.a aVar3 = new z2.a("WorkTag", hashMap3, hashSet5, hashSet6);
            z2.a a12 = z2.a.a(cVar2, "WorkTag");
            if (!aVar3.equals(a12)) {
                return new o.b("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + aVar3 + "\n Found:\n" + a12, false);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new a.C0244a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("generation", new a.C0244a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new a.C0244a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            z2.a aVar4 = new z2.a("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            z2.a a13 = z2.a.a(cVar2, "SystemIdInfo");
            if (!aVar4.equals(a13)) {
                return new o.b("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + aVar4 + "\n Found:\n" + a13, false);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new a.C0244a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new a.C0244a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new a.d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            z2.a aVar5 = new z2.a("WorkName", hashMap5, hashSet8, hashSet9);
            z2.a a14 = z2.a.a(cVar2, "WorkName");
            if (!aVar5.equals(a14)) {
                return new o.b("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + aVar5 + "\n Found:\n" + a14, false);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new a.C0244a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new a.C0244a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            z2.a aVar6 = new z2.a("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            z2.a a15 = z2.a.a(cVar2, "WorkProgress");
            if (!aVar6.equals(a15)) {
                return new o.b("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + aVar6 + "\n Found:\n" + a15, false);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new a.C0244a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new a.C0244a("long_value", "INTEGER", false, 0, (String) null, 1));
            z2.a aVar7 = new z2.a("Preference", hashMap7, new HashSet(0), new HashSet(0));
            z2.a a16 = z2.a.a(cVar2, "Preference");
            if (aVar7.equals(a16)) {
                return new o.b((String) null, true);
            }
            return new o.b("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + aVar7 + "\n Found:\n" + a16, false);
        }
    }

    public final h d() {
        return new h(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public final c3.c e(b bVar) {
        x2.o oVar = new x2.o(bVar, new a(), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032");
        Context context = bVar.f16884a;
        j.f(context, "context");
        return bVar.f16886c.c(new c.b(context, bVar.f16885b, oVar, false, false));
    }

    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new y2.b[]{new c0(0), new d0(), new e0(), new c0(1), new f0(), new g0()});
    }

    public final Set<Class<? extends y2.a>> h() {
        return new HashSet();
    }

    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap hashMap = new HashMap();
        hashMap.put(t.class, Collections.emptyList());
        hashMap.put(x3.b.class, Collections.emptyList());
        hashMap.put(w.class, Collections.emptyList());
        hashMap.put(x3.j.class, Collections.emptyList());
        hashMap.put(x3.n.class, Collections.emptyList());
        hashMap.put(q.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(x3.h.class, Collections.emptyList());
        return hashMap;
    }

    public final x3.b p() {
        x3.c cVar;
        if (this.f3764m != null) {
            return this.f3764m;
        }
        synchronized (this) {
            if (this.f3764m == null) {
                this.f3764m = new x3.c(this);
            }
            cVar = this.f3764m;
        }
        return cVar;
    }

    public final e q() {
        g gVar;
        if (this.f3769r != null) {
            return this.f3769r;
        }
        synchronized (this) {
            if (this.f3769r == null) {
                this.f3769r = new g(this);
            }
            gVar = this.f3769r;
        }
        return gVar;
    }

    public final x3.j r() {
        k kVar;
        if (this.f3766o != null) {
            return this.f3766o;
        }
        synchronized (this) {
            if (this.f3766o == null) {
                this.f3766o = new k(this);
            }
            kVar = this.f3766o;
        }
        return kVar;
    }

    public final x3.n s() {
        x3.o oVar;
        if (this.f3767p != null) {
            return this.f3767p;
        }
        synchronized (this) {
            if (this.f3767p == null) {
                this.f3767p = new x3.o(this);
            }
            oVar = this.f3767p;
        }
        return oVar;
    }

    public final q t() {
        r rVar;
        if (this.f3768q != null) {
            return this.f3768q;
        }
        synchronized (this) {
            if (this.f3768q == null) {
                this.f3768q = new r(this);
            }
            rVar = this.f3768q;
        }
        return rVar;
    }

    public final t u() {
        u uVar;
        if (this.f3763l != null) {
            return this.f3763l;
        }
        synchronized (this) {
            if (this.f3763l == null) {
                this.f3763l = new u(this);
            }
            uVar = this.f3763l;
        }
        return uVar;
    }

    public final w v() {
        x xVar;
        if (this.f3765n != null) {
            return this.f3765n;
        }
        synchronized (this) {
            if (this.f3765n == null) {
                this.f3765n = new x(this);
            }
            xVar = this.f3765n;
        }
        return xVar;
    }
}
