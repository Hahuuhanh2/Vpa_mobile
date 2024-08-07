package xa;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: HeartBeatInfoStorage */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f17171a;

    public f(Context context, String str) {
        this.f17171a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j10 = this.f17171a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f17171a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f17171a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f17171a.edit().putStringSet(str2, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    public final synchronized void b() {
        SharedPreferences.Editor edit = this.f17171a.edit();
        int i10 = 0;
        for (Map.Entry next : this.f17171a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                String d10 = d(System.currentTimeMillis());
                String str = (String) next.getKey();
                if (((Set) next.getValue()).contains(d10)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(d10);
                    i10++;
                    edit.putStringSet(str, hashSet);
                } else {
                    edit.remove(str);
                }
            }
        }
        if (i10 == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", (long) i10);
        }
        edit.commit();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized java.util.ArrayList c() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0072 }
            r0.<init>()     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences r1 = r6.f17171a     // Catch:{ all -> 0x0072 }
            java.util.Map r1 = r1.getAll()     // Catch:{ all -> 0x0072 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0072 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0072 }
        L_0x0014:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0072 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0072 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x0072 }
            boolean r3 = r3 instanceof java.util.Set     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0014
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0072 }
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x0072 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0072 }
            r3.<init>(r4)     // Catch:{ all -> 0x0072 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = r6.d(r4)     // Catch:{ all -> 0x0072 }
            r3.remove(r4)     // Catch:{ all -> 0x0072 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r4 != 0) goto L_0x0014
            java.lang.Object r2 = r2.getKey()     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0072 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0072 }
            r4.<init>(r3)     // Catch:{ all -> 0x0072 }
            xa.a r3 = new xa.a     // Catch:{ all -> 0x0072 }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0072 }
            r0.add(r3)     // Catch:{ all -> 0x0072 }
            goto L_0x0014
        L_0x0058:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0072 }
            monitor-enter(r6)     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences r3 = r6.f17171a     // Catch:{ all -> 0x006f }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "fire-global"
            android.content.SharedPreferences$Editor r1 = r3.putLong(r4, r1)     // Catch:{ all -> 0x006f }
            r1.commit()     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)
            return r0
        L_0x006f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.f.c():java.util.ArrayList");
    }

    public final synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized String e(String str) {
        for (Map.Entry next : this.f17171a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.e(r5)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r4.f17171a     // Catch:{ all -> 0x003f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x003f }
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            r1.remove(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0030
            android.content.SharedPreferences r5 = r4.f17171a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0030:
            android.content.SharedPreferences r5 = r4.f17171a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.f.f(java.lang.String):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized boolean g(long r6) {
        /*
            r5 = this;
            java.lang.String r0 = "fire-global"
            monitor-enter(r5)
            android.content.SharedPreferences r1 = r5.f17171a     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x0048 }
            r2 = 1
            if (r1 == 0) goto L_0x0039
            android.content.SharedPreferences r1 = r5.f17171a     // Catch:{ all -> 0x0048 }
            r3 = -1
            long r3 = r1.getLong(r0, r3)     // Catch:{ all -> 0x0048 }
            monitor-enter(r5)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r5.d(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = r5.d(r6)     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0036 }
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0033
            android.content.SharedPreferences r1 = r5.f17171a     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r6 = r1.putLong(r0, r6)     // Catch:{ all -> 0x0048 }
            r6.commit()     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            return r2
        L_0x0033:
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            throw r6     // Catch:{ all -> 0x0048 }
        L_0x0039:
            android.content.SharedPreferences r1 = r5.f17171a     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r6 = r1.putLong(r0, r6)     // Catch:{ all -> 0x0048 }
            r6.commit()     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            return r2
        L_0x0048:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.f.g(long):boolean");
    }

    public final synchronized void h(long j10, String str) {
        String d10 = d(j10);
        if (this.f17171a.getString("last-used-date", "").equals(d10)) {
            String e10 = e(d10);
            if (e10 != null) {
                if (!e10.equals(str)) {
                    i(str, d10);
                    return;
                }
                return;
            }
            return;
        }
        long j11 = this.f17171a.getLong("fire-count", 0);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f17171a.getLong("fire-count", 0);
        }
        HashSet hashSet = new HashSet(this.f17171a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f17171a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d10).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f17171a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f17171a.edit().putStringSet(str, hashSet).commit();
    }
}
