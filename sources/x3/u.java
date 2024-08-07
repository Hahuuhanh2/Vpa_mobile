package x3;

import al.g0;
import android.database.Cursor;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import o3.c;
import p3.l0;
import v.v;
import x2.r;
import x3.s;

/* compiled from: WorkSpecDao_Impl */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    public final x2.n f17044a;

    /* renamed from: b  reason: collision with root package name */
    public final i f17045b;

    /* renamed from: c  reason: collision with root package name */
    public final k f17046c;

    /* renamed from: d  reason: collision with root package name */
    public final l f17047d;

    /* renamed from: e  reason: collision with root package name */
    public final m f17048e;

    /* renamed from: f  reason: collision with root package name */
    public final n f17049f;

    /* renamed from: g  reason: collision with root package name */
    public final o f17050g;

    /* renamed from: h  reason: collision with root package name */
    public final p f17051h;

    /* renamed from: i  reason: collision with root package name */
    public final q f17052i;

    /* renamed from: j  reason: collision with root package name */
    public final a f17053j;

    /* renamed from: k  reason: collision with root package name */
    public final c f17054k;

    /* renamed from: l  reason: collision with root package name */
    public final d f17055l;

    /* renamed from: m  reason: collision with root package name */
    public final e f17056m;

    /* renamed from: n  reason: collision with root package name */
    public final h f17057n;

    /* compiled from: WorkSpecDao_Impl */
    public class a extends r {
        public a(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class b extends r {
        public b(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class c extends r {
        public c(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class d extends r {
        public d(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class e extends r {
        public e(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class f extends r {
        public f(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class g extends r {
        public g(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class h extends r {
        public h(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class i extends x2.d {
        public i(x2.n nVar) {
            super(nVar, 1);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        public final void e(c3.f fVar, Object obj) {
            int i10;
            int i11;
            byte[] bArr;
            Throwable th2;
            c3.f fVar2 = fVar;
            s sVar = (s) obj;
            String str = sVar.f17019a;
            int i12 = 1;
            if (str == null) {
                fVar2.m0(1);
            } else {
                fVar2.p(1, str);
            }
            fVar2.H(2, (long) y.f(sVar.f17020b));
            String str2 = sVar.f17021c;
            if (str2 == null) {
                fVar2.m0(3);
            } else {
                fVar2.p(3, str2);
            }
            String str3 = sVar.f17022d;
            if (str3 == null) {
                fVar2.m0(4);
            } else {
                fVar2.p(4, str3);
            }
            byte[] b10 = androidx.work.c.b(sVar.f17023e);
            if (b10 == null) {
                fVar2.m0(5);
            } else {
                fVar2.M(5, b10);
            }
            byte[] b11 = androidx.work.c.b(sVar.f17024f);
            if (b11 == null) {
                fVar2.m0(6);
            } else {
                fVar2.M(6, b11);
            }
            fVar2.H(7, sVar.f17025g);
            fVar2.H(8, sVar.f17026h);
            fVar2.H(9, sVar.f17027i);
            fVar2.H(10, (long) sVar.f17029k);
            int i13 = sVar.f17030l;
            n0.l.o(i13, "backoffPolicy");
            int g2 = v.g(i13);
            if (g2 == 0) {
                i10 = 0;
            } else if (g2 == 1) {
                i10 = 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            fVar2.H(11, (long) i10);
            fVar2.H(12, sVar.f17031m);
            fVar2.H(13, sVar.f17032n);
            fVar2.H(14, sVar.f17033o);
            fVar2.H(15, sVar.f17034p);
            fVar2.H(16, sVar.f17035q ? 1 : 0);
            int i14 = sVar.f17036r;
            n0.l.o(i14, "policy");
            int g10 = v.g(i14);
            if (g10 == 0) {
                i11 = 0;
            } else if (g10 == 1) {
                i11 = 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            fVar2.H(17, (long) i11);
            fVar2.H(18, (long) sVar.f17037s);
            fVar2.H(19, (long) sVar.f17038t);
            fVar2.H(20, sVar.f17039u);
            fVar2.H(21, (long) sVar.f17040v);
            fVar2.H(22, (long) sVar.f17041w);
            o3.c cVar = sVar.f17028j;
            if (cVar != null) {
                int i15 = cVar.f13666a;
                n0.l.o(i15, "networkType");
                int g11 = v.g(i15);
                if (g11 == 0) {
                    i12 = 0;
                } else if (g11 != 1) {
                    if (g11 == 2) {
                        i12 = 2;
                    } else if (g11 == 3) {
                        i12 = 3;
                    } else if (g11 == 4) {
                        i12 = 4;
                    } else if (Build.VERSION.SDK_INT < 30 || i15 != 6) {
                        StringBuilder q10 = android.support.v4.media.a.q("Could not convert ");
                        q10.append(n0.l.s(i15));
                        q10.append(" to int");
                        throw new IllegalArgumentException(q10.toString());
                    } else {
                        i12 = 5;
                    }
                }
                fVar2.H(23, (long) i12);
                fVar2.H(24, cVar.f13667b ? 1 : 0);
                fVar2.H(25, cVar.f13668c ? 1 : 0);
                fVar2.H(26, cVar.f13669d ? 1 : 0);
                fVar2.H(27, cVar.f13670e ? 1 : 0);
                fVar2.H(28, cVar.f13671f);
                fVar2.H(29, cVar.f13672g);
                Set<c.a> set = cVar.f13673h;
                sk.j.f(set, "triggers");
                if (set.isEmpty()) {
                    bArr = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(set.size());
                            for (c.a next : set) {
                                objectOutputStream.writeUTF(next.f13674a.toString());
                                objectOutputStream.writeBoolean(next.f13675b);
                            }
                            ek.i iVar = ek.i.f20112a;
                            l0.u(objectOutputStream, (Throwable) null);
                            l0.u(byteArrayOutputStream, (Throwable) null);
                            bArr = byteArrayOutputStream.toByteArray();
                            sk.j.e(bArr, "outputStream.toByteArray()");
                        } catch (Throwable th3) {
                            Throwable th4 = th3;
                            l0.u(objectOutputStream, th2);
                            throw th4;
                        }
                    } finally {
                        th2 = th;
                        try {
                        } catch (Throwable th5) {
                            Throwable th6 = th5;
                            l0.u(byteArrayOutputStream, th2);
                            throw th6;
                        }
                    }
                }
                fVar2.M(30, bArr);
                return;
            }
            fVar2.m0(23);
            fVar2.m0(24);
            fVar2.m0(25);
            fVar2.m0(26);
            fVar2.m0(27);
            fVar2.m0(28);
            fVar2.m0(29);
            fVar2.m0(30);
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class j extends x2.d {
        public j(x2.n nVar) {
            super(nVar, 0);
        }

        public final String c() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class k extends r {
        public k(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class l extends r {
        public l(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class m extends r {
        public m(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class n extends r {
        public n(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class o extends r {
        public o(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class p extends r {
        public p(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class q extends r {
        public q(x2.n nVar) {
            super(nVar);
        }

        public final String c() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public u(x2.n nVar) {
        this.f17044a = nVar;
        this.f17045b = new i(nVar);
        new j(nVar);
        this.f17046c = new k(nVar);
        this.f17047d = new l(nVar);
        this.f17048e = new m(nVar);
        this.f17049f = new n(nVar);
        this.f17050g = new o(nVar);
        this.f17051h = new p(nVar);
        this.f17052i = new q(nVar);
        this.f17053j = new a(nVar);
        new b(nVar);
        this.f17054k = new c(nVar);
        this.f17055l = new d(nVar);
        this.f17056m = new e(nVar);
        new f(nVar);
        new g(nVar);
        this.f17057n = new h(nVar);
    }

    public final void a(String str) {
        this.f17044a.b();
        c3.f a10 = this.f17046c.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f17044a.c();
        try {
            a10.t();
            this.f17044a.n();
        } finally {
            this.f17044a.j();
            this.f17046c.d(a10);
        }
    }

    public final void b(s sVar) {
        this.f17044a.b();
        this.f17044a.c();
        try {
            this.f17045b.f(sVar);
            this.f17044a.n();
        } finally {
            this.f17044a.j();
        }
    }

    public final ArrayList c() {
        x2.p pVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        x2.p i15 = x2.p.i(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        i15.H(1, (long) 200);
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i15);
        try {
            int R = g0.R(m02, "id");
            int R2 = g0.R(m02, "state");
            int R3 = g0.R(m02, "worker_class_name");
            int R4 = g0.R(m02, "input_merger_class_name");
            int R5 = g0.R(m02, "input");
            int R6 = g0.R(m02, "output");
            int R7 = g0.R(m02, "initial_delay");
            int R8 = g0.R(m02, "interval_duration");
            int R9 = g0.R(m02, "flex_duration");
            int R10 = g0.R(m02, "run_attempt_count");
            int R11 = g0.R(m02, "backoff_policy");
            int R12 = g0.R(m02, "backoff_delay_duration");
            int R13 = g0.R(m02, "last_enqueue_time");
            int R14 = g0.R(m02, "minimum_retention_duration");
            pVar = i15;
            try {
                int R15 = g0.R(m02, "schedule_requested_at");
                int R16 = g0.R(m02, "run_in_foreground");
                int R17 = g0.R(m02, "out_of_quota_policy");
                int R18 = g0.R(m02, "period_count");
                int R19 = g0.R(m02, "generation");
                int R20 = g0.R(m02, "next_schedule_time_override");
                int R21 = g0.R(m02, "next_schedule_time_override_generation");
                int R22 = g0.R(m02, "stop_reason");
                int R23 = g0.R(m02, "required_network_type");
                int R24 = g0.R(m02, "requires_charging");
                int R25 = g0.R(m02, "requires_device_idle");
                int R26 = g0.R(m02, "requires_battery_not_low");
                int R27 = g0.R(m02, "requires_storage_not_low");
                int R28 = g0.R(m02, "trigger_content_update_delay");
                int R29 = g0.R(m02, "trigger_max_content_delay");
                int R30 = g0.R(m02, "content_uri_triggers");
                int i16 = R14;
                ArrayList arrayList = new ArrayList(m02.getCount());
                while (m02.moveToNext()) {
                    byte[] bArr3 = null;
                    if (m02.isNull(R)) {
                        str = null;
                    } else {
                        str = m02.getString(R);
                    }
                    o3.o e10 = y.e(m02.getInt(R2));
                    if (m02.isNull(R3)) {
                        str2 = null;
                    } else {
                        str2 = m02.getString(R3);
                    }
                    if (m02.isNull(R4)) {
                        str3 = null;
                    } else {
                        str3 = m02.getString(R4);
                    }
                    if (m02.isNull(R5)) {
                        bArr = null;
                    } else {
                        bArr = m02.getBlob(R5);
                    }
                    androidx.work.c a10 = androidx.work.c.a(bArr);
                    if (m02.isNull(R6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = m02.getBlob(R6);
                    }
                    androidx.work.c a11 = androidx.work.c.a(bArr2);
                    long j10 = m02.getLong(R7);
                    long j11 = m02.getLong(R8);
                    long j12 = m02.getLong(R9);
                    int i17 = m02.getInt(R10);
                    int b10 = y.b(m02.getInt(R11));
                    long j13 = m02.getLong(R12);
                    long j14 = m02.getLong(R13);
                    int i18 = i16;
                    long j15 = m02.getLong(i18);
                    int i19 = R13;
                    int i20 = R15;
                    long j16 = m02.getLong(i20);
                    R15 = i20;
                    int i21 = R16;
                    if (m02.getInt(i21) != 0) {
                        R16 = i21;
                        i10 = R17;
                        z10 = true;
                    } else {
                        R16 = i21;
                        i10 = R17;
                        z10 = false;
                    }
                    int d10 = y.d(m02.getInt(i10));
                    R17 = i10;
                    int i22 = R18;
                    int i23 = m02.getInt(i22);
                    R18 = i22;
                    int i24 = R19;
                    int i25 = m02.getInt(i24);
                    R19 = i24;
                    int i26 = R20;
                    long j17 = m02.getLong(i26);
                    R20 = i26;
                    int i27 = R21;
                    int i28 = m02.getInt(i27);
                    R21 = i27;
                    int i29 = R22;
                    int i30 = m02.getInt(i29);
                    R22 = i29;
                    int i31 = R23;
                    int c10 = y.c(m02.getInt(i31));
                    R23 = i31;
                    int i32 = R24;
                    if (m02.getInt(i32) != 0) {
                        R24 = i32;
                        i11 = R25;
                        z11 = true;
                    } else {
                        R24 = i32;
                        i11 = R25;
                        z11 = false;
                    }
                    if (m02.getInt(i11) != 0) {
                        R25 = i11;
                        i12 = R26;
                        z12 = true;
                    } else {
                        R25 = i11;
                        i12 = R26;
                        z12 = false;
                    }
                    if (m02.getInt(i12) != 0) {
                        R26 = i12;
                        i13 = R27;
                        z13 = true;
                    } else {
                        R26 = i12;
                        i13 = R27;
                        z13 = false;
                    }
                    if (m02.getInt(i13) != 0) {
                        R27 = i13;
                        i14 = R28;
                        z14 = true;
                    } else {
                        R27 = i13;
                        i14 = R28;
                        z14 = false;
                    }
                    long j18 = m02.getLong(i14);
                    R28 = i14;
                    int i33 = R29;
                    long j19 = m02.getLong(i33);
                    R29 = i33;
                    int i34 = R30;
                    if (!m02.isNull(i34)) {
                        bArr3 = m02.getBlob(i34);
                    }
                    R30 = i34;
                    arrayList.add(new s(str, e10, str2, str3, a10, a11, j10, j11, j12, new o3.c(c10, z11, z12, z13, z14, j18, j19, y.a(bArr3)), i17, b10, j13, j14, j15, j16, z10, d10, i23, i25, j17, i28, i30));
                    R13 = i19;
                    i16 = i18;
                }
                m02.close();
                pVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m02.close();
                pVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = i15;
            m02.close();
            pVar.q();
            throw th;
        }
    }

    public final void d(String str) {
        this.f17044a.b();
        c3.f a10 = this.f17049f.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f17044a.c();
        try {
            a10.t();
            this.f17044a.n();
        } finally {
            this.f17044a.j();
            this.f17049f.d(a10);
        }
    }

    public final int e(long j10, String str) {
        this.f17044a.b();
        c3.f a10 = this.f17055l.a();
        a10.H(1, j10);
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f17044a.c();
        try {
            int t10 = a10.t();
            this.f17044a.n();
            return t10;
        } finally {
            this.f17044a.j();
            this.f17055l.d(a10);
        }
    }

    public final ArrayList f(String str) {
        String str2;
        x2.p i10 = x2.p.i(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i10);
        try {
            ArrayList arrayList = new ArrayList(m02.getCount());
            while (m02.moveToNext()) {
                if (m02.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = m02.getString(0);
                }
                arrayList.add(new s.a(y.e(m02.getInt(1)), str2));
            }
            return arrayList;
        } finally {
            m02.close();
            i10.q();
        }
    }

    public final ArrayList g(long j10) {
        x2.p pVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        boolean z14;
        int i13;
        x2.p i14 = x2.p.i(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        i14.H(1, j10);
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i14);
        try {
            int R = g0.R(m02, "id");
            int R2 = g0.R(m02, "state");
            int R3 = g0.R(m02, "worker_class_name");
            int R4 = g0.R(m02, "input_merger_class_name");
            int R5 = g0.R(m02, "input");
            int R6 = g0.R(m02, "output");
            int R7 = g0.R(m02, "initial_delay");
            int R8 = g0.R(m02, "interval_duration");
            int R9 = g0.R(m02, "flex_duration");
            int R10 = g0.R(m02, "run_attempt_count");
            int R11 = g0.R(m02, "backoff_policy");
            int R12 = g0.R(m02, "backoff_delay_duration");
            int R13 = g0.R(m02, "last_enqueue_time");
            int R14 = g0.R(m02, "minimum_retention_duration");
            pVar = i14;
            try {
                int R15 = g0.R(m02, "schedule_requested_at");
                int R16 = g0.R(m02, "run_in_foreground");
                int R17 = g0.R(m02, "out_of_quota_policy");
                int R18 = g0.R(m02, "period_count");
                int R19 = g0.R(m02, "generation");
                int R20 = g0.R(m02, "next_schedule_time_override");
                int R21 = g0.R(m02, "next_schedule_time_override_generation");
                int R22 = g0.R(m02, "stop_reason");
                int R23 = g0.R(m02, "required_network_type");
                int R24 = g0.R(m02, "requires_charging");
                int R25 = g0.R(m02, "requires_device_idle");
                int R26 = g0.R(m02, "requires_battery_not_low");
                int R27 = g0.R(m02, "requires_storage_not_low");
                int R28 = g0.R(m02, "trigger_content_update_delay");
                int R29 = g0.R(m02, "trigger_max_content_delay");
                int R30 = g0.R(m02, "content_uri_triggers");
                int i15 = R14;
                ArrayList arrayList = new ArrayList(m02.getCount());
                while (m02.moveToNext()) {
                    byte[] bArr3 = null;
                    if (m02.isNull(R)) {
                        str = null;
                    } else {
                        str = m02.getString(R);
                    }
                    o3.o e10 = y.e(m02.getInt(R2));
                    if (m02.isNull(R3)) {
                        str2 = null;
                    } else {
                        str2 = m02.getString(R3);
                    }
                    if (m02.isNull(R4)) {
                        str3 = null;
                    } else {
                        str3 = m02.getString(R4);
                    }
                    if (m02.isNull(R5)) {
                        bArr = null;
                    } else {
                        bArr = m02.getBlob(R5);
                    }
                    androidx.work.c a10 = androidx.work.c.a(bArr);
                    if (m02.isNull(R6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = m02.getBlob(R6);
                    }
                    androidx.work.c a11 = androidx.work.c.a(bArr2);
                    long j11 = m02.getLong(R7);
                    long j12 = m02.getLong(R8);
                    long j13 = m02.getLong(R9);
                    int i16 = m02.getInt(R10);
                    int b10 = y.b(m02.getInt(R11));
                    long j14 = m02.getLong(R12);
                    long j15 = m02.getLong(R13);
                    int i17 = i15;
                    long j16 = m02.getLong(i17);
                    int i18 = R13;
                    int i19 = R15;
                    long j17 = m02.getLong(i19);
                    R15 = i19;
                    int i20 = R16;
                    int i21 = m02.getInt(i20);
                    R16 = i20;
                    int i22 = R17;
                    if (i21 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int d10 = y.d(m02.getInt(i22));
                    R17 = i22;
                    int i23 = R18;
                    int i24 = m02.getInt(i23);
                    R18 = i23;
                    int i25 = R19;
                    int i26 = m02.getInt(i25);
                    R19 = i25;
                    int i27 = R20;
                    long j18 = m02.getLong(i27);
                    R20 = i27;
                    int i28 = R21;
                    int i29 = m02.getInt(i28);
                    R21 = i28;
                    int i30 = R22;
                    int i31 = m02.getInt(i30);
                    R22 = i30;
                    int i32 = R23;
                    int c10 = y.c(m02.getInt(i32));
                    R23 = i32;
                    int i33 = R24;
                    if (m02.getInt(i33) != 0) {
                        R24 = i33;
                        i10 = R25;
                        z11 = true;
                    } else {
                        R24 = i33;
                        i10 = R25;
                        z11 = false;
                    }
                    if (m02.getInt(i10) != 0) {
                        R25 = i10;
                        i11 = R26;
                        z12 = true;
                    } else {
                        R25 = i10;
                        i11 = R26;
                        z12 = false;
                    }
                    if (m02.getInt(i11) != 0) {
                        R26 = i11;
                        i12 = R27;
                        z13 = true;
                    } else {
                        R26 = i11;
                        i12 = R27;
                        z13 = false;
                    }
                    if (m02.getInt(i12) != 0) {
                        R27 = i12;
                        i13 = R28;
                        z14 = true;
                    } else {
                        R27 = i12;
                        i13 = R28;
                        z14 = false;
                    }
                    long j19 = m02.getLong(i13);
                    R28 = i13;
                    int i34 = R29;
                    long j20 = m02.getLong(i34);
                    R29 = i34;
                    int i35 = R30;
                    if (!m02.isNull(i35)) {
                        bArr3 = m02.getBlob(i35);
                    }
                    R30 = i35;
                    arrayList.add(new s(str, e10, str2, str3, a10, a11, j11, j12, j13, new o3.c(c10, z11, z12, z13, z14, j19, j20, y.a(bArr3)), i16, b10, j14, j15, j16, j17, z10, d10, i24, i26, j18, i29, i31));
                    R13 = i18;
                    i15 = i17;
                }
                m02.close();
                pVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m02.close();
                pVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = i14;
            m02.close();
            pVar.q();
            throw th;
        }
    }

    public final ArrayList h(int i10) {
        x2.p pVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        x2.p i16 = x2.p.i(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        i16.H(1, (long) i10);
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i16);
        try {
            int R = g0.R(m02, "id");
            int R2 = g0.R(m02, "state");
            int R3 = g0.R(m02, "worker_class_name");
            int R4 = g0.R(m02, "input_merger_class_name");
            int R5 = g0.R(m02, "input");
            int R6 = g0.R(m02, "output");
            int R7 = g0.R(m02, "initial_delay");
            int R8 = g0.R(m02, "interval_duration");
            int R9 = g0.R(m02, "flex_duration");
            int R10 = g0.R(m02, "run_attempt_count");
            int R11 = g0.R(m02, "backoff_policy");
            int R12 = g0.R(m02, "backoff_delay_duration");
            int R13 = g0.R(m02, "last_enqueue_time");
            int R14 = g0.R(m02, "minimum_retention_duration");
            pVar = i16;
            try {
                int R15 = g0.R(m02, "schedule_requested_at");
                int R16 = g0.R(m02, "run_in_foreground");
                int R17 = g0.R(m02, "out_of_quota_policy");
                int R18 = g0.R(m02, "period_count");
                int R19 = g0.R(m02, "generation");
                int R20 = g0.R(m02, "next_schedule_time_override");
                int R21 = g0.R(m02, "next_schedule_time_override_generation");
                int R22 = g0.R(m02, "stop_reason");
                int R23 = g0.R(m02, "required_network_type");
                int R24 = g0.R(m02, "requires_charging");
                int R25 = g0.R(m02, "requires_device_idle");
                int R26 = g0.R(m02, "requires_battery_not_low");
                int R27 = g0.R(m02, "requires_storage_not_low");
                int R28 = g0.R(m02, "trigger_content_update_delay");
                int R29 = g0.R(m02, "trigger_max_content_delay");
                int R30 = g0.R(m02, "content_uri_triggers");
                int i17 = R14;
                ArrayList arrayList = new ArrayList(m02.getCount());
                while (m02.moveToNext()) {
                    byte[] bArr3 = null;
                    if (m02.isNull(R)) {
                        str = null;
                    } else {
                        str = m02.getString(R);
                    }
                    o3.o e10 = y.e(m02.getInt(R2));
                    if (m02.isNull(R3)) {
                        str2 = null;
                    } else {
                        str2 = m02.getString(R3);
                    }
                    if (m02.isNull(R4)) {
                        str3 = null;
                    } else {
                        str3 = m02.getString(R4);
                    }
                    if (m02.isNull(R5)) {
                        bArr = null;
                    } else {
                        bArr = m02.getBlob(R5);
                    }
                    androidx.work.c a10 = androidx.work.c.a(bArr);
                    if (m02.isNull(R6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = m02.getBlob(R6);
                    }
                    androidx.work.c a11 = androidx.work.c.a(bArr2);
                    long j10 = m02.getLong(R7);
                    long j11 = m02.getLong(R8);
                    long j12 = m02.getLong(R9);
                    int i18 = m02.getInt(R10);
                    int b10 = y.b(m02.getInt(R11));
                    long j13 = m02.getLong(R12);
                    long j14 = m02.getLong(R13);
                    int i19 = i17;
                    long j15 = m02.getLong(i19);
                    int i20 = R13;
                    int i21 = R15;
                    long j16 = m02.getLong(i21);
                    R15 = i21;
                    int i22 = R16;
                    if (m02.getInt(i22) != 0) {
                        R16 = i22;
                        i11 = R17;
                        z10 = true;
                    } else {
                        R16 = i22;
                        i11 = R17;
                        z10 = false;
                    }
                    int d10 = y.d(m02.getInt(i11));
                    R17 = i11;
                    int i23 = R18;
                    int i24 = m02.getInt(i23);
                    R18 = i23;
                    int i25 = R19;
                    int i26 = m02.getInt(i25);
                    R19 = i25;
                    int i27 = R20;
                    long j17 = m02.getLong(i27);
                    R20 = i27;
                    int i28 = R21;
                    int i29 = m02.getInt(i28);
                    R21 = i28;
                    int i30 = R22;
                    int i31 = m02.getInt(i30);
                    R22 = i30;
                    int i32 = R23;
                    int c10 = y.c(m02.getInt(i32));
                    R23 = i32;
                    int i33 = R24;
                    if (m02.getInt(i33) != 0) {
                        R24 = i33;
                        i12 = R25;
                        z11 = true;
                    } else {
                        R24 = i33;
                        i12 = R25;
                        z11 = false;
                    }
                    if (m02.getInt(i12) != 0) {
                        R25 = i12;
                        i13 = R26;
                        z12 = true;
                    } else {
                        R25 = i12;
                        i13 = R26;
                        z12 = false;
                    }
                    if (m02.getInt(i13) != 0) {
                        R26 = i13;
                        i14 = R27;
                        z13 = true;
                    } else {
                        R26 = i13;
                        i14 = R27;
                        z13 = false;
                    }
                    if (m02.getInt(i14) != 0) {
                        R27 = i14;
                        i15 = R28;
                        z14 = true;
                    } else {
                        R27 = i14;
                        i15 = R28;
                        z14 = false;
                    }
                    long j18 = m02.getLong(i15);
                    R28 = i15;
                    int i34 = R29;
                    long j19 = m02.getLong(i34);
                    R29 = i34;
                    int i35 = R30;
                    if (!m02.isNull(i35)) {
                        bArr3 = m02.getBlob(i35);
                    }
                    R30 = i35;
                    arrayList.add(new s(str, e10, str2, str3, a10, a11, j10, j11, j12, new o3.c(c10, z11, z12, z13, z14, j18, j19, y.a(bArr3)), i18, b10, j13, j14, j15, j16, z10, d10, i24, i26, j17, i29, i31));
                    R13 = i20;
                    i17 = i19;
                }
                m02.close();
                pVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m02.close();
                pVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = i16;
            m02.close();
            pVar.q();
            throw th;
        }
    }

    public final void i(long j10, String str) {
        this.f17044a.b();
        c3.f a10 = this.f17051h.a();
        a10.H(1, j10);
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f17044a.c();
        try {
            a10.t();
            this.f17044a.n();
        } finally {
            this.f17044a.j();
            this.f17051h.d(a10);
        }
    }

    public final void j(int i10, String str) {
        this.f17044a.b();
        c3.f a10 = this.f17054k.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        a10.H(2, (long) i10);
        this.f17044a.c();
        try {
            a10.t();
            this.f17044a.n();
        } finally {
            this.f17044a.j();
            this.f17054k.d(a10);
        }
    }

    public final ArrayList k() {
        x2.p pVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        x2.p i15 = x2.p.i(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i15);
        try {
            int R = g0.R(m02, "id");
            int R2 = g0.R(m02, "state");
            int R3 = g0.R(m02, "worker_class_name");
            int R4 = g0.R(m02, "input_merger_class_name");
            int R5 = g0.R(m02, "input");
            int R6 = g0.R(m02, "output");
            int R7 = g0.R(m02, "initial_delay");
            int R8 = g0.R(m02, "interval_duration");
            int R9 = g0.R(m02, "flex_duration");
            int R10 = g0.R(m02, "run_attempt_count");
            int R11 = g0.R(m02, "backoff_policy");
            int R12 = g0.R(m02, "backoff_delay_duration");
            int R13 = g0.R(m02, "last_enqueue_time");
            int R14 = g0.R(m02, "minimum_retention_duration");
            pVar = i15;
            try {
                int R15 = g0.R(m02, "schedule_requested_at");
                int R16 = g0.R(m02, "run_in_foreground");
                int R17 = g0.R(m02, "out_of_quota_policy");
                int R18 = g0.R(m02, "period_count");
                int R19 = g0.R(m02, "generation");
                int R20 = g0.R(m02, "next_schedule_time_override");
                int R21 = g0.R(m02, "next_schedule_time_override_generation");
                int R22 = g0.R(m02, "stop_reason");
                int R23 = g0.R(m02, "required_network_type");
                int R24 = g0.R(m02, "requires_charging");
                int R25 = g0.R(m02, "requires_device_idle");
                int R26 = g0.R(m02, "requires_battery_not_low");
                int R27 = g0.R(m02, "requires_storage_not_low");
                int R28 = g0.R(m02, "trigger_content_update_delay");
                int R29 = g0.R(m02, "trigger_max_content_delay");
                int R30 = g0.R(m02, "content_uri_triggers");
                int i16 = R14;
                ArrayList arrayList = new ArrayList(m02.getCount());
                while (m02.moveToNext()) {
                    byte[] bArr3 = null;
                    if (m02.isNull(R)) {
                        str = null;
                    } else {
                        str = m02.getString(R);
                    }
                    o3.o e10 = y.e(m02.getInt(R2));
                    if (m02.isNull(R3)) {
                        str2 = null;
                    } else {
                        str2 = m02.getString(R3);
                    }
                    if (m02.isNull(R4)) {
                        str3 = null;
                    } else {
                        str3 = m02.getString(R4);
                    }
                    if (m02.isNull(R5)) {
                        bArr = null;
                    } else {
                        bArr = m02.getBlob(R5);
                    }
                    androidx.work.c a10 = androidx.work.c.a(bArr);
                    if (m02.isNull(R6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = m02.getBlob(R6);
                    }
                    androidx.work.c a11 = androidx.work.c.a(bArr2);
                    long j10 = m02.getLong(R7);
                    long j11 = m02.getLong(R8);
                    long j12 = m02.getLong(R9);
                    int i17 = m02.getInt(R10);
                    int b10 = y.b(m02.getInt(R11));
                    long j13 = m02.getLong(R12);
                    long j14 = m02.getLong(R13);
                    int i18 = i16;
                    long j15 = m02.getLong(i18);
                    int i19 = R13;
                    int i20 = R15;
                    long j16 = m02.getLong(i20);
                    R15 = i20;
                    int i21 = R16;
                    if (m02.getInt(i21) != 0) {
                        R16 = i21;
                        i10 = R17;
                        z10 = true;
                    } else {
                        R16 = i21;
                        i10 = R17;
                        z10 = false;
                    }
                    int d10 = y.d(m02.getInt(i10));
                    R17 = i10;
                    int i22 = R18;
                    int i23 = m02.getInt(i22);
                    R18 = i22;
                    int i24 = R19;
                    int i25 = m02.getInt(i24);
                    R19 = i24;
                    int i26 = R20;
                    long j17 = m02.getLong(i26);
                    R20 = i26;
                    int i27 = R21;
                    int i28 = m02.getInt(i27);
                    R21 = i27;
                    int i29 = R22;
                    int i30 = m02.getInt(i29);
                    R22 = i29;
                    int i31 = R23;
                    int c10 = y.c(m02.getInt(i31));
                    R23 = i31;
                    int i32 = R24;
                    if (m02.getInt(i32) != 0) {
                        R24 = i32;
                        i11 = R25;
                        z11 = true;
                    } else {
                        R24 = i32;
                        i11 = R25;
                        z11 = false;
                    }
                    if (m02.getInt(i11) != 0) {
                        R25 = i11;
                        i12 = R26;
                        z12 = true;
                    } else {
                        R25 = i11;
                        i12 = R26;
                        z12 = false;
                    }
                    if (m02.getInt(i12) != 0) {
                        R26 = i12;
                        i13 = R27;
                        z13 = true;
                    } else {
                        R26 = i12;
                        i13 = R27;
                        z13 = false;
                    }
                    if (m02.getInt(i13) != 0) {
                        R27 = i13;
                        i14 = R28;
                        z14 = true;
                    } else {
                        R27 = i13;
                        i14 = R28;
                        z14 = false;
                    }
                    long j18 = m02.getLong(i14);
                    R28 = i14;
                    int i33 = R29;
                    long j19 = m02.getLong(i33);
                    R29 = i33;
                    int i34 = R30;
                    if (!m02.isNull(i34)) {
                        bArr3 = m02.getBlob(i34);
                    }
                    R30 = i34;
                    arrayList.add(new s(str, e10, str2, str3, a10, a11, j10, j11, j12, new o3.c(c10, z11, z12, z13, z14, j18, j19, y.a(bArr3)), i17, b10, j13, j14, j15, j16, z10, d10, i23, i25, j17, i28, i30));
                    R13 = i19;
                    i16 = i18;
                }
                m02.close();
                pVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m02.close();
                pVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = i15;
            m02.close();
            pVar.q();
            throw th;
        }
    }

    public final void l(String str, androidx.work.c cVar) {
        this.f17044a.b();
        c3.f a10 = this.f17050g.a();
        byte[] b10 = androidx.work.c.b(cVar);
        if (b10 == null) {
            a10.m0(1);
        } else {
            a10.M(1, b10);
        }
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f17044a.c();
        try {
            a10.t();
            this.f17044a.n();
        } finally {
            this.f17044a.j();
            this.f17050g.d(a10);
        }
    }

    public final int m(o3.o oVar, String str) {
        this.f17044a.b();
        c3.f a10 = this.f17047d.a();
        a10.H(1, (long) y.f(oVar));
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f17044a.c();
        try {
            int t10 = a10.t();
            this.f17044a.n();
            return t10;
        } finally {
            this.f17044a.j();
            this.f17047d.d(a10);
        }
    }

    public final ArrayList n() {
        x2.p pVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        x2.p i15 = x2.p.i(0, "SELECT * FROM workspec WHERE state=1");
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i15);
        try {
            int R = g0.R(m02, "id");
            int R2 = g0.R(m02, "state");
            int R3 = g0.R(m02, "worker_class_name");
            int R4 = g0.R(m02, "input_merger_class_name");
            int R5 = g0.R(m02, "input");
            int R6 = g0.R(m02, "output");
            int R7 = g0.R(m02, "initial_delay");
            int R8 = g0.R(m02, "interval_duration");
            int R9 = g0.R(m02, "flex_duration");
            int R10 = g0.R(m02, "run_attempt_count");
            int R11 = g0.R(m02, "backoff_policy");
            int R12 = g0.R(m02, "backoff_delay_duration");
            int R13 = g0.R(m02, "last_enqueue_time");
            int R14 = g0.R(m02, "minimum_retention_duration");
            pVar = i15;
            try {
                int R15 = g0.R(m02, "schedule_requested_at");
                int R16 = g0.R(m02, "run_in_foreground");
                int R17 = g0.R(m02, "out_of_quota_policy");
                int R18 = g0.R(m02, "period_count");
                int R19 = g0.R(m02, "generation");
                int R20 = g0.R(m02, "next_schedule_time_override");
                int R21 = g0.R(m02, "next_schedule_time_override_generation");
                int R22 = g0.R(m02, "stop_reason");
                int R23 = g0.R(m02, "required_network_type");
                int R24 = g0.R(m02, "requires_charging");
                int R25 = g0.R(m02, "requires_device_idle");
                int R26 = g0.R(m02, "requires_battery_not_low");
                int R27 = g0.R(m02, "requires_storage_not_low");
                int R28 = g0.R(m02, "trigger_content_update_delay");
                int R29 = g0.R(m02, "trigger_max_content_delay");
                int R30 = g0.R(m02, "content_uri_triggers");
                int i16 = R14;
                ArrayList arrayList = new ArrayList(m02.getCount());
                while (m02.moveToNext()) {
                    byte[] bArr3 = null;
                    if (m02.isNull(R)) {
                        str = null;
                    } else {
                        str = m02.getString(R);
                    }
                    o3.o e10 = y.e(m02.getInt(R2));
                    if (m02.isNull(R3)) {
                        str2 = null;
                    } else {
                        str2 = m02.getString(R3);
                    }
                    if (m02.isNull(R4)) {
                        str3 = null;
                    } else {
                        str3 = m02.getString(R4);
                    }
                    if (m02.isNull(R5)) {
                        bArr = null;
                    } else {
                        bArr = m02.getBlob(R5);
                    }
                    androidx.work.c a10 = androidx.work.c.a(bArr);
                    if (m02.isNull(R6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = m02.getBlob(R6);
                    }
                    androidx.work.c a11 = androidx.work.c.a(bArr2);
                    long j10 = m02.getLong(R7);
                    long j11 = m02.getLong(R8);
                    long j12 = m02.getLong(R9);
                    int i17 = m02.getInt(R10);
                    int b10 = y.b(m02.getInt(R11));
                    long j13 = m02.getLong(R12);
                    long j14 = m02.getLong(R13);
                    int i18 = i16;
                    long j15 = m02.getLong(i18);
                    int i19 = R13;
                    int i20 = R15;
                    long j16 = m02.getLong(i20);
                    R15 = i20;
                    int i21 = R16;
                    if (m02.getInt(i21) != 0) {
                        R16 = i21;
                        i10 = R17;
                        z10 = true;
                    } else {
                        R16 = i21;
                        i10 = R17;
                        z10 = false;
                    }
                    int d10 = y.d(m02.getInt(i10));
                    R17 = i10;
                    int i22 = R18;
                    int i23 = m02.getInt(i22);
                    R18 = i22;
                    int i24 = R19;
                    int i25 = m02.getInt(i24);
                    R19 = i24;
                    int i26 = R20;
                    long j17 = m02.getLong(i26);
                    R20 = i26;
                    int i27 = R21;
                    int i28 = m02.getInt(i27);
                    R21 = i27;
                    int i29 = R22;
                    int i30 = m02.getInt(i29);
                    R22 = i29;
                    int i31 = R23;
                    int c10 = y.c(m02.getInt(i31));
                    R23 = i31;
                    int i32 = R24;
                    if (m02.getInt(i32) != 0) {
                        R24 = i32;
                        i11 = R25;
                        z11 = true;
                    } else {
                        R24 = i32;
                        i11 = R25;
                        z11 = false;
                    }
                    if (m02.getInt(i11) != 0) {
                        R25 = i11;
                        i12 = R26;
                        z12 = true;
                    } else {
                        R25 = i11;
                        i12 = R26;
                        z12 = false;
                    }
                    if (m02.getInt(i12) != 0) {
                        R26 = i12;
                        i13 = R27;
                        z13 = true;
                    } else {
                        R26 = i12;
                        i13 = R27;
                        z13 = false;
                    }
                    if (m02.getInt(i13) != 0) {
                        R27 = i13;
                        i14 = R28;
                        z14 = true;
                    } else {
                        R27 = i13;
                        i14 = R28;
                        z14 = false;
                    }
                    long j18 = m02.getLong(i14);
                    R28 = i14;
                    int i33 = R29;
                    long j19 = m02.getLong(i33);
                    R29 = i33;
                    int i34 = R30;
                    if (!m02.isNull(i34)) {
                        bArr3 = m02.getBlob(i34);
                    }
                    R30 = i34;
                    arrayList.add(new s(str, e10, str2, str3, a10, a11, j10, j11, j12, new o3.c(c10, z11, z12, z13, z14, j18, j19, y.a(bArr3)), i17, b10, j13, j14, j15, j16, z10, d10, i23, i25, j17, i28, i30));
                    R13 = i19;
                    i16 = i18;
                }
                m02.close();
                pVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m02.close();
                pVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = i15;
            m02.close();
            pVar.q();
            throw th;
        }
    }

    public final void o(int i10, String str) {
        this.f17044a.b();
        c3.f a10 = this.f17057n.a();
        a10.H(1, (long) i10);
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f17044a.c();
        try {
            a10.t();
            this.f17044a.n();
        } finally {
            this.f17044a.j();
            this.f17057n.d(a10);
        }
    }

    public final boolean p() {
        boolean z10 = false;
        x2.p i10 = x2.p.i(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i10);
        try {
            if (m02.moveToFirst() && m02.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            m02.close();
            i10.q();
        }
    }

    public final ArrayList q(String str) {
        String str2;
        x2.p i10 = x2.p.i(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i10);
        try {
            ArrayList arrayList = new ArrayList(m02.getCount());
            while (m02.moveToNext()) {
                if (m02.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = m02.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            m02.close();
            i10.q();
        }
    }

    public final ArrayList r() {
        x2.p pVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        x2.p i15 = x2.p.i(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i15);
        try {
            int R = g0.R(m02, "id");
            int R2 = g0.R(m02, "state");
            int R3 = g0.R(m02, "worker_class_name");
            int R4 = g0.R(m02, "input_merger_class_name");
            int R5 = g0.R(m02, "input");
            int R6 = g0.R(m02, "output");
            int R7 = g0.R(m02, "initial_delay");
            int R8 = g0.R(m02, "interval_duration");
            int R9 = g0.R(m02, "flex_duration");
            int R10 = g0.R(m02, "run_attempt_count");
            int R11 = g0.R(m02, "backoff_policy");
            int R12 = g0.R(m02, "backoff_delay_duration");
            int R13 = g0.R(m02, "last_enqueue_time");
            int R14 = g0.R(m02, "minimum_retention_duration");
            pVar = i15;
            try {
                int R15 = g0.R(m02, "schedule_requested_at");
                int R16 = g0.R(m02, "run_in_foreground");
                int R17 = g0.R(m02, "out_of_quota_policy");
                int R18 = g0.R(m02, "period_count");
                int R19 = g0.R(m02, "generation");
                int R20 = g0.R(m02, "next_schedule_time_override");
                int R21 = g0.R(m02, "next_schedule_time_override_generation");
                int R22 = g0.R(m02, "stop_reason");
                int R23 = g0.R(m02, "required_network_type");
                int R24 = g0.R(m02, "requires_charging");
                int R25 = g0.R(m02, "requires_device_idle");
                int R26 = g0.R(m02, "requires_battery_not_low");
                int R27 = g0.R(m02, "requires_storage_not_low");
                int R28 = g0.R(m02, "trigger_content_update_delay");
                int R29 = g0.R(m02, "trigger_max_content_delay");
                int R30 = g0.R(m02, "content_uri_triggers");
                int i16 = R14;
                ArrayList arrayList = new ArrayList(m02.getCount());
                while (m02.moveToNext()) {
                    byte[] bArr3 = null;
                    if (m02.isNull(R)) {
                        str = null;
                    } else {
                        str = m02.getString(R);
                    }
                    o3.o e10 = y.e(m02.getInt(R2));
                    if (m02.isNull(R3)) {
                        str2 = null;
                    } else {
                        str2 = m02.getString(R3);
                    }
                    if (m02.isNull(R4)) {
                        str3 = null;
                    } else {
                        str3 = m02.getString(R4);
                    }
                    if (m02.isNull(R5)) {
                        bArr = null;
                    } else {
                        bArr = m02.getBlob(R5);
                    }
                    androidx.work.c a10 = androidx.work.c.a(bArr);
                    if (m02.isNull(R6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = m02.getBlob(R6);
                    }
                    androidx.work.c a11 = androidx.work.c.a(bArr2);
                    long j10 = m02.getLong(R7);
                    long j11 = m02.getLong(R8);
                    long j12 = m02.getLong(R9);
                    int i17 = m02.getInt(R10);
                    int b10 = y.b(m02.getInt(R11));
                    long j13 = m02.getLong(R12);
                    long j14 = m02.getLong(R13);
                    int i18 = i16;
                    long j15 = m02.getLong(i18);
                    int i19 = R13;
                    int i20 = R15;
                    long j16 = m02.getLong(i20);
                    R15 = i20;
                    int i21 = R16;
                    if (m02.getInt(i21) != 0) {
                        R16 = i21;
                        i10 = R17;
                        z10 = true;
                    } else {
                        R16 = i21;
                        i10 = R17;
                        z10 = false;
                    }
                    int d10 = y.d(m02.getInt(i10));
                    R17 = i10;
                    int i22 = R18;
                    int i23 = m02.getInt(i22);
                    R18 = i22;
                    int i24 = R19;
                    int i25 = m02.getInt(i24);
                    R19 = i24;
                    int i26 = R20;
                    long j17 = m02.getLong(i26);
                    R20 = i26;
                    int i27 = R21;
                    int i28 = m02.getInt(i27);
                    R21 = i27;
                    int i29 = R22;
                    int i30 = m02.getInt(i29);
                    R22 = i29;
                    int i31 = R23;
                    int c10 = y.c(m02.getInt(i31));
                    R23 = i31;
                    int i32 = R24;
                    if (m02.getInt(i32) != 0) {
                        R24 = i32;
                        i11 = R25;
                        z11 = true;
                    } else {
                        R24 = i32;
                        i11 = R25;
                        z11 = false;
                    }
                    if (m02.getInt(i11) != 0) {
                        R25 = i11;
                        i12 = R26;
                        z12 = true;
                    } else {
                        R25 = i11;
                        i12 = R26;
                        z12 = false;
                    }
                    if (m02.getInt(i12) != 0) {
                        R26 = i12;
                        i13 = R27;
                        z13 = true;
                    } else {
                        R26 = i12;
                        i13 = R27;
                        z13 = false;
                    }
                    if (m02.getInt(i13) != 0) {
                        R27 = i13;
                        i14 = R28;
                        z14 = true;
                    } else {
                        R27 = i13;
                        i14 = R28;
                        z14 = false;
                    }
                    long j18 = m02.getLong(i14);
                    R28 = i14;
                    int i33 = R29;
                    long j19 = m02.getLong(i33);
                    R29 = i33;
                    int i34 = R30;
                    if (!m02.isNull(i34)) {
                        bArr3 = m02.getBlob(i34);
                    }
                    R30 = i34;
                    arrayList.add(new s(str, e10, str2, str3, a10, a11, j10, j11, j12, new o3.c(c10, z11, z12, z13, z14, j18, j19, y.a(bArr3)), i17, b10, j13, j14, j15, j16, z10, d10, i23, i25, j17, i28, i30));
                    R13 = i19;
                    i16 = i18;
                }
                m02.close();
                pVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m02.close();
                pVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = i15;
            m02.close();
            pVar.q();
            throw th;
        }
    }

    public final o3.o s(String str) {
        Integer num;
        x2.p i10 = x2.p.i(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f17044a.b();
        o3.o oVar = null;
        Cursor m02 = j7.a.m0(this.f17044a, i10);
        try {
            if (m02.moveToFirst()) {
                if (m02.isNull(0)) {
                    num = null;
                } else {
                    num = Integer.valueOf(m02.getInt(0));
                }
                if (num != null) {
                    oVar = y.e(num.intValue());
                }
            }
            return oVar;
        } finally {
            m02.close();
            i10.q();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: x3.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r32v0 */
    /* JADX WARNING: type inference failed for: r33v1, types: [x3.s] */
    /* JADX WARNING: type inference failed for: r32v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x3.s t(java.lang.String r66) {
        /*
            r65 = this;
            r1 = r65
            r0 = r66
            r2 = 1
            java.lang.String r3 = "SELECT * FROM workspec WHERE id=?"
            x2.p r3 = x2.p.i(r2, r3)
            if (r0 != 0) goto L_0x0011
            r3.m0(r2)
            goto L_0x0014
        L_0x0011:
            r3.p(r2, r0)
        L_0x0014:
            x2.n r0 = r1.f17044a
            r0.b()
            x2.n r0 = r1.f17044a
            android.database.Cursor r4 = j7.a.m0(r0, r3)
            java.lang.String r0 = "id"
            int r0 = al.g0.R(r4, r0)     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "state"
            int r5 = al.g0.R(r4, r5)     // Catch:{ all -> 0x0224 }
            java.lang.String r6 = "worker_class_name"
            int r6 = al.g0.R(r4, r6)     // Catch:{ all -> 0x0224 }
            java.lang.String r7 = "input_merger_class_name"
            int r7 = al.g0.R(r4, r7)     // Catch:{ all -> 0x0224 }
            java.lang.String r8 = "input"
            int r8 = al.g0.R(r4, r8)     // Catch:{ all -> 0x0224 }
            java.lang.String r9 = "output"
            int r9 = al.g0.R(r4, r9)     // Catch:{ all -> 0x0224 }
            java.lang.String r10 = "initial_delay"
            int r10 = al.g0.R(r4, r10)     // Catch:{ all -> 0x0224 }
            java.lang.String r11 = "interval_duration"
            int r11 = al.g0.R(r4, r11)     // Catch:{ all -> 0x0224 }
            java.lang.String r12 = "flex_duration"
            int r12 = al.g0.R(r4, r12)     // Catch:{ all -> 0x0224 }
            java.lang.String r13 = "run_attempt_count"
            int r13 = al.g0.R(r4, r13)     // Catch:{ all -> 0x0224 }
            java.lang.String r14 = "backoff_policy"
            int r14 = al.g0.R(r4, r14)     // Catch:{ all -> 0x0224 }
            java.lang.String r15 = "backoff_delay_duration"
            int r15 = al.g0.R(r4, r15)     // Catch:{ all -> 0x0224 }
            java.lang.String r2 = "last_enqueue_time"
            int r2 = al.g0.R(r4, r2)     // Catch:{ all -> 0x0224 }
            java.lang.String r1 = "minimum_retention_duration"
            int r1 = al.g0.R(r4, r1)     // Catch:{ all -> 0x0224 }
            r16 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r66 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r17 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r18 = r3
            java.lang.String r3 = "period_count"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r19 = r3
            java.lang.String r3 = "generation"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r20 = r3
            java.lang.String r3 = "next_schedule_time_override"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r21 = r3
            java.lang.String r3 = "next_schedule_time_override_generation"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r22 = r3
            java.lang.String r3 = "stop_reason"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r23 = r3
            java.lang.String r3 = "required_network_type"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r24 = r3
            java.lang.String r3 = "requires_charging"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r25 = r3
            java.lang.String r3 = "requires_device_idle"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r26 = r3
            java.lang.String r3 = "requires_battery_not_low"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r27 = r3
            java.lang.String r3 = "requires_storage_not_low"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r28 = r3
            java.lang.String r3 = "trigger_content_update_delay"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r29 = r3
            java.lang.String r3 = "trigger_max_content_delay"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            r30 = r3
            java.lang.String r3 = "content_uri_triggers"
            int r3 = al.g0.R(r4, r3)     // Catch:{ all -> 0x0222 }
            boolean r31 = r4.moveToFirst()     // Catch:{ all -> 0x0222 }
            r32 = 0
            if (r31 == 0) goto L_0x021b
            boolean r31 = r4.isNull(r0)     // Catch:{ all -> 0x0222 }
            if (r31 == 0) goto L_0x0104
            r34 = r32
            goto L_0x010a
        L_0x0104:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0222 }
            r34 = r0
        L_0x010a:
            int r0 = r4.getInt(r5)     // Catch:{ all -> 0x0222 }
            o3.o r35 = x3.y.e(r0)     // Catch:{ all -> 0x0222 }
            boolean r0 = r4.isNull(r6)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x011b
            r36 = r32
            goto L_0x0121
        L_0x011b:
            java.lang.String r0 = r4.getString(r6)     // Catch:{ all -> 0x0222 }
            r36 = r0
        L_0x0121:
            boolean r0 = r4.isNull(r7)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x012a
            r37 = r32
            goto L_0x0130
        L_0x012a:
            java.lang.String r0 = r4.getString(r7)     // Catch:{ all -> 0x0222 }
            r37 = r0
        L_0x0130:
            boolean r0 = r4.isNull(r8)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x0139
            r0 = r32
            goto L_0x013d
        L_0x0139:
            byte[] r0 = r4.getBlob(r8)     // Catch:{ all -> 0x0222 }
        L_0x013d:
            androidx.work.c r38 = androidx.work.c.a(r0)     // Catch:{ all -> 0x0222 }
            boolean r0 = r4.isNull(r9)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x014a
            r0 = r32
            goto L_0x014e
        L_0x014a:
            byte[] r0 = r4.getBlob(r9)     // Catch:{ all -> 0x0222 }
        L_0x014e:
            androidx.work.c r39 = androidx.work.c.a(r0)     // Catch:{ all -> 0x0222 }
            long r40 = r4.getLong(r10)     // Catch:{ all -> 0x0222 }
            long r42 = r4.getLong(r11)     // Catch:{ all -> 0x0222 }
            long r44 = r4.getLong(r12)     // Catch:{ all -> 0x0222 }
            int r47 = r4.getInt(r13)     // Catch:{ all -> 0x0222 }
            int r0 = r4.getInt(r14)     // Catch:{ all -> 0x0222 }
            int r48 = x3.y.b(r0)     // Catch:{ all -> 0x0222 }
            long r49 = r4.getLong(r15)     // Catch:{ all -> 0x0222 }
            long r51 = r4.getLong(r2)     // Catch:{ all -> 0x0222 }
            long r53 = r4.getLong(r1)     // Catch:{ all -> 0x0222 }
            r0 = r66
            long r55 = r4.getLong(r0)     // Catch:{ all -> 0x0222 }
            r0 = r17
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            r1 = 0
            if (r0 == 0) goto L_0x018a
            r0 = r18
            r57 = 1
            goto L_0x018e
        L_0x018a:
            r57 = r1
            r0 = r18
        L_0x018e:
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            int r58 = x3.y.d(r0)     // Catch:{ all -> 0x0222 }
            r0 = r19
            int r59 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            r0 = r20
            int r60 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            r0 = r21
            long r61 = r4.getLong(r0)     // Catch:{ all -> 0x0222 }
            r0 = r22
            int r63 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            r0 = r23
            int r64 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            r0 = r24
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            int r6 = x3.y.c(r0)     // Catch:{ all -> 0x0222 }
            r0 = r25
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x01ca
            r0 = r26
            r7 = 1
            goto L_0x01cd
        L_0x01ca:
            r7 = r1
            r0 = r26
        L_0x01cd:
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x01d7
            r0 = r27
            r8 = 1
            goto L_0x01da
        L_0x01d7:
            r8 = r1
            r0 = r27
        L_0x01da:
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x01e4
            r0 = r28
            r9 = 1
            goto L_0x01e7
        L_0x01e4:
            r9 = r1
            r0 = r28
        L_0x01e7:
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x01f1
            r0 = r29
            r10 = 1
            goto L_0x01f4
        L_0x01f1:
            r10 = r1
            r0 = r29
        L_0x01f4:
            long r11 = r4.getLong(r0)     // Catch:{ all -> 0x0222 }
            r0 = r30
            long r13 = r4.getLong(r0)     // Catch:{ all -> 0x0222 }
            boolean r0 = r4.isNull(r3)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x0205
            goto L_0x0209
        L_0x0205:
            byte[] r32 = r4.getBlob(r3)     // Catch:{ all -> 0x0222 }
        L_0x0209:
            java.util.LinkedHashSet r15 = x3.y.a(r32)     // Catch:{ all -> 0x0222 }
            o3.c r46 = new o3.c     // Catch:{ all -> 0x0222 }
            r5 = r46
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x0222 }
            x3.s r32 = new x3.s     // Catch:{ all -> 0x0222 }
            r33 = r32
            r33.<init>((java.lang.String) r34, (o3.o) r35, (java.lang.String) r36, (java.lang.String) r37, (androidx.work.c) r38, (androidx.work.c) r39, (long) r40, (long) r42, (long) r44, (o3.c) r46, (int) r47, (int) r48, (long) r49, (long) r51, (long) r53, (long) r55, (boolean) r57, (int) r58, (int) r59, (int) r60, (long) r61, (int) r63, (int) r64)     // Catch:{ all -> 0x0222 }
        L_0x021b:
            r4.close()
            r16.q()
            return r32
        L_0x0222:
            r0 = move-exception
            goto L_0x0227
        L_0x0224:
            r0 = move-exception
            r16 = r3
        L_0x0227:
            r4.close()
            r16.q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.u.t(java.lang.String):x3.s");
    }

    public final int u(String str) {
        this.f17044a.b();
        c3.f a10 = this.f17053j.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f17044a.c();
        try {
            int t10 = a10.t();
            this.f17044a.n();
            return t10;
        } finally {
            this.f17044a.j();
            this.f17053j.d(a10);
        }
    }

    public final int v(String str) {
        this.f17044a.b();
        c3.f a10 = this.f17048e.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f17044a.c();
        try {
            int t10 = a10.t();
            this.f17044a.n();
            return t10;
        } finally {
            this.f17044a.j();
            this.f17048e.d(a10);
        }
    }

    public final ArrayList w(String str) {
        byte[] bArr;
        x2.p i10 = x2.p.i(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i10);
        try {
            ArrayList arrayList = new ArrayList(m02.getCount());
            while (m02.moveToNext()) {
                if (m02.isNull(0)) {
                    bArr = null;
                } else {
                    bArr = m02.getBlob(0);
                }
                arrayList.add(androidx.work.c.a(bArr));
            }
            return arrayList;
        } finally {
            m02.close();
            i10.q();
        }
    }

    public final int x(String str) {
        this.f17044a.b();
        c3.f a10 = this.f17052i.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f17044a.c();
        try {
            int t10 = a10.t();
            this.f17044a.n();
            return t10;
        } finally {
            this.f17044a.j();
            this.f17052i.d(a10);
        }
    }

    public final int y() {
        int i10 = 0;
        x2.p i11 = x2.p.i(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        this.f17044a.b();
        Cursor m02 = j7.a.m0(this.f17044a, i11);
        try {
            if (m02.moveToFirst()) {
                i10 = m02.getInt(0);
            }
            return i10;
        } finally {
            m02.close();
            i11.q();
        }
    }

    public final int z() {
        this.f17044a.b();
        c3.f a10 = this.f17056m.a();
        this.f17044a.c();
        try {
            int t10 = a10.t();
            this.f17044a.n();
            return t10;
        } finally {
            this.f17044a.j();
            this.f17056m.d(a10);
        }
    }
}
