package x2;

import al.g0;
import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteException;
import c3.f;
import ek.i;
import f0.b0;
import fk.p;
import fk.t;
import fk.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sk.j;

/* compiled from: InvalidationTracker.kt */
public final class h {

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f16906n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final n f16907a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f16908b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Set<String>> f16909c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f16910d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f16911e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f16912f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f16913g;

    /* renamed from: h  reason: collision with root package name */
    public volatile f f16914h;

    /* renamed from: i  reason: collision with root package name */
    public final b f16915i;

    /* renamed from: j  reason: collision with root package name */
    public final o.b<c, d> f16916j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f16917k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f16918l;

    /* renamed from: m  reason: collision with root package name */
    public final i f16919m;

    /* compiled from: InvalidationTracker.kt */
    public static final class a {
        public static String a(String str, String str2) {
            j.f(str, "tableName");
            j.f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* compiled from: InvalidationTracker.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f16920a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f16921b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f16922c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16923d;

        public b(int i10) {
            this.f16920a = new long[i10];
            this.f16921b = new boolean[i10];
            this.f16922c = new int[i10];
        }

        public final int[] a() {
            boolean z10;
            synchronized (this) {
                if (!this.f16923d) {
                    return null;
                }
                long[] jArr = this.f16920a;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    if (jArr[i10] > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean[] zArr = this.f16921b;
                    if (z10 != zArr[i11]) {
                        int[] iArr = this.f16922c;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        this.f16922c[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.f16923d = false;
                int[] iArr2 = (int[]) this.f16922c.clone();
                return iArr2;
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f16924a;

        public c(String[] strArr) {
            this.f16924a = strArr;
        }

        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker.kt */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final c f16925a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f16926b;

        /* renamed from: c  reason: collision with root package name */
        public final String[] f16927c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f16928d;

        public d(c cVar, int[] iArr, String[] strArr) {
            boolean z10;
            Set<String> set;
            this.f16925a = cVar;
            this.f16926b = iArr;
            this.f16927c = strArr;
            boolean z11 = true;
            if (strArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                set = Collections.singleton(strArr[0]);
                j.e(set, "singleton(element)");
            } else {
                set = t.f20215a;
            }
            this.f16928d = set;
            if (!(iArr.length != strArr.length ? false : z11)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final void a(Set<Integer> set) {
            Set set2;
            j.f(set, "invalidatedTablesIds");
            int[] iArr = this.f16926b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    gk.f fVar = new gk.f();
                    int[] iArr2 = this.f16926b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i10]))) {
                            fVar.add(this.f16927c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    set2 = g0.v(fVar);
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    set2 = this.f16928d;
                } else {
                    set2 = t.f20215a;
                }
            } else {
                set2 = t.f20215a;
            }
            if (!set2.isEmpty()) {
                this.f16925a.a(set2);
            }
        }

        public final void b(String[] strArr) {
            Set set;
            int length = this.f16927c.length;
            if (length != 0) {
                boolean z10 = false;
                if (length != 1) {
                    gk.f fVar = new gk.f();
                    for (String str : strArr) {
                        for (String str2 : this.f16927c) {
                            if (yk.h.G0(str2, str)) {
                                fVar.add(str2);
                            }
                        }
                    }
                    set = g0.v(fVar);
                } else {
                    int length2 = strArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            break;
                        } else if (yk.h.G0(strArr[i10], this.f16927c[0])) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (z10) {
                        set = this.f16928d;
                    } else {
                        set = t.f20215a;
                    }
                }
            } else {
                set = t.f20215a;
            }
            if (!set.isEmpty()) {
                this.f16925a.a(set);
            }
        }
    }

    public h(n nVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        Object obj;
        String str;
        j.f(nVar, "database");
        this.f16907a = nVar;
        this.f16908b = hashMap;
        this.f16909c = hashMap2;
        this.f16915i = new b(strArr.length);
        j.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f16916j = new o.b<>();
        this.f16917k = new Object();
        this.f16918l = new Object();
        this.f16910d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f16910d.put(lowerCase, Integer.valueOf(i10));
            String str3 = this.f16908b.get(strArr[i10]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                j.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f16911e = strArr2;
        for (Map.Entry next : this.f16908b.entrySet()) {
            Locale locale2 = Locale.US;
            j.e(locale2, "US");
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            j.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f16910d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                j.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f16910d;
                j.f(linkedHashMap, "<this>");
                if (linkedHashMap instanceof z) {
                    obj = ((z) linkedHashMap).a();
                } else {
                    Object obj2 = linkedHashMap.get(lowerCase2);
                    if (obj2 != null || linkedHashMap.containsKey(lowerCase2)) {
                        obj = obj2;
                    } else {
                        throw new NoSuchElementException("Key " + lowerCase2 + " is missing in the map.");
                    }
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f16919m = new i(this);
    }

    @SuppressLint({"RestrictedApi"})
    public final void a(c cVar) {
        d i10;
        boolean z10;
        String[] strArr = cVar.f16924a;
        gk.f fVar = new gk.f();
        boolean z11 = false;
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f16909c;
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f16909c;
                String lowerCase2 = str.toLowerCase(locale);
                j.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                j.c(set);
                fVar.addAll(set);
            } else {
                fVar.add(str);
            }
        }
        Object[] array = g0.v(fVar).toArray(new String[0]);
        j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr2 = (String[]) array;
        ArrayList arrayList = new ArrayList(strArr2.length);
        int length = strArr2.length;
        int i11 = 0;
        while (i11 < length) {
            String str2 = strArr2[i11];
            LinkedHashMap linkedHashMap = this.f16910d;
            Locale locale2 = Locale.US;
            j.e(locale2, "US");
            String lowerCase3 = str2.toLowerCase(locale2);
            j.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase3);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
                i11++;
            } else {
                throw new IllegalArgumentException(b0.r("There is no table with name ", str2));
            }
        }
        int[] Y0 = p.Y0(arrayList);
        d dVar = new d(cVar, Y0, strArr2);
        synchronized (this.f16916j) {
            i10 = this.f16916j.i(cVar, dVar);
        }
        if (i10 == null) {
            b bVar = this.f16915i;
            int[] copyOf = Arrays.copyOf(Y0, Y0.length);
            bVar.getClass();
            j.f(copyOf, "tableIds");
            synchronized (bVar) {
                z10 = false;
                for (int i12 : copyOf) {
                    long[] jArr = bVar.f16920a;
                    long j10 = jArr[i12];
                    jArr[i12] = 1 + j10;
                    if (j10 == 0) {
                        bVar.f16923d = true;
                        z10 = true;
                    }
                }
                i iVar = i.f20112a;
            }
            if (z10) {
                c3.b bVar2 = this.f16907a.f16944a;
                if (bVar2 != null && bVar2.isOpen()) {
                    z11 = true;
                }
                if (z11) {
                    e(this.f16907a.g().P());
                }
            }
        }
    }

    public final boolean b() {
        boolean z10;
        c3.b bVar = this.f16907a.f16944a;
        if (bVar == null || !bVar.isOpen()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (!this.f16913g) {
            this.f16907a.g().P();
        }
        if (!this.f16913g) {
            return false;
        }
        return true;
    }

    public final void c(c3.b bVar, int i10) {
        bVar.o("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f16911e[i10];
        String[] strArr = f16906n;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            StringBuilder q10 = android.support.v4.media.a.q("CREATE TEMP TRIGGER IF NOT EXISTS ");
            q10.append(a.a(str, str2));
            q10.append(" AFTER ");
            q10.append(str2);
            q10.append(" ON `");
            q10.append(str);
            q10.append("` BEGIN UPDATE ");
            q10.append("room_table_modification_log");
            q10.append(" SET ");
            q10.append("invalidated");
            q10.append(" = 1");
            q10.append(" WHERE ");
            q10.append("table_id");
            q10.append(" = ");
            q10.append(i10);
            q10.append(" AND ");
            q10.append("invalidated");
            q10.append(" = 0");
            q10.append("; END");
            String sb2 = q10.toString();
            j.e(sb2, "StringBuilder().apply(builderAction).toString()");
            bVar.o(sb2);
        }
    }

    public final void d(c3.b bVar, int i10) {
        String str = this.f16911e[i10];
        String[] strArr = f16906n;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            StringBuilder q10 = android.support.v4.media.a.q("DROP TRIGGER IF EXISTS ");
            q10.append(a.a(str, str2));
            String sb2 = q10.toString();
            j.e(sb2, "StringBuilder().apply(builderAction).toString()");
            bVar.o(sb2);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(c3.b bVar) {
        j.f(bVar, "database");
        if (!bVar.q0()) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f16907a.f16951h.readLock();
                j.e(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    synchronized (this.f16917k) {
                        int[] a10 = this.f16915i.a();
                        if (a10 != null) {
                            if (bVar.y0()) {
                                bVar.J();
                            } else {
                                bVar.k();
                            }
                            try {
                                int length = a10.length;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length) {
                                    int i12 = a10[i10];
                                    int i13 = i11 + 1;
                                    if (i12 == 1) {
                                        c(bVar, i11);
                                    } else if (i12 == 2) {
                                        d(bVar, i11);
                                    }
                                    i10++;
                                    i11 = i13;
                                }
                                bVar.I();
                                bVar.X();
                                i iVar = i.f20112a;
                                readLock.unlock();
                            } catch (Throwable th2) {
                                bVar.X();
                                throw th2;
                            }
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException unused) {
            }
        }
    }
}
