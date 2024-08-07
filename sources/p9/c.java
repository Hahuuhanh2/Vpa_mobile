package p9;

import android.os.Bundle;
import ea.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import m7.a;
import p9.a;
import q9.d;
import u8.f;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
public final class c implements a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f14104c;

    /* renamed from: a  reason: collision with root package name */
    public final a f14105a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f14106b = new ConcurrentHashMap();

    public c(a aVar) {
        j.f(aVar);
        this.f14105a = aVar;
    }

    public final Map<String, Object> a(boolean z10) {
        return this.f14105a.f13182a.zza((String) null, (String) null, z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r2 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A[Catch:{ IOException | ClassNotFoundException -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[Catch:{ IOException | ClassNotFoundException -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(p9.a.b r7) {
        /*
            r6 = this;
            u8.f<java.lang.String> r0 = q9.a.f14374a
            java.lang.String r0 = r7.f14089a
            if (r0 == 0) goto L_0x00af
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000e
            goto L_0x00af
        L_0x000e:
            java.lang.Object r1 = r7.f14091c
            if (r1 == 0) goto L_0x0055
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0043 }
            r3.<init>()     // Catch:{ all -> 0x0043 }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0043 }
            r4.<init>(r3)     // Catch:{ all -> 0x0043 }
            r4.writeObject(r1)     // Catch:{ all -> 0x003f }
            r4.flush()     // Catch:{ all -> 0x003f }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ all -> 0x003f }
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x003f }
            byte[] r3 = r3.toByteArray()     // Catch:{ all -> 0x003f }
            r5.<init>(r3)     // Catch:{ all -> 0x003f }
            r1.<init>(r5)     // Catch:{ all -> 0x003f }
            java.lang.Object r3 = r1.readObject()     // Catch:{ all -> 0x003d }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0052 }
            r1.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0052 }
            r2 = r3
            goto L_0x0052
        L_0x003d:
            r3 = move-exception
            goto L_0x0047
        L_0x003f:
            r1 = move-exception
            r3 = r1
            r1 = r2
            goto L_0x0047
        L_0x0043:
            r1 = move-exception
            r3 = r1
            r1 = r2
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x004c
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0052 }
        L_0x0051:
            throw r3     // Catch:{ IOException | ClassNotFoundException -> 0x0052 }
        L_0x0052:
            if (r2 != 0) goto L_0x0055
            goto L_0x00af
        L_0x0055:
            boolean r1 = q9.a.d(r0)
            if (r1 != 0) goto L_0x005c
            goto L_0x00af
        L_0x005c:
            java.lang.String r1 = r7.f14090b
            boolean r1 = q9.a.b(r0, r1)
            if (r1 != 0) goto L_0x0065
            goto L_0x00af
        L_0x0065:
            java.lang.String r1 = r7.f14099k
            if (r1 == 0) goto L_0x007d
            android.os.Bundle r2 = r7.f14100l
            boolean r1 = q9.a.a(r2, r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x00af
        L_0x0072:
            java.lang.String r1 = r7.f14099k
            android.os.Bundle r2 = r7.f14100l
            boolean r1 = q9.a.c(r0, r1, r2)
            if (r1 != 0) goto L_0x007d
            goto L_0x00af
        L_0x007d:
            java.lang.String r1 = r7.f14096h
            if (r1 == 0) goto L_0x0095
            android.os.Bundle r2 = r7.f14097i
            boolean r1 = q9.a.a(r2, r1)
            if (r1 != 0) goto L_0x008a
            goto L_0x00af
        L_0x008a:
            java.lang.String r1 = r7.f14096h
            android.os.Bundle r2 = r7.f14097i
            boolean r1 = q9.a.c(r0, r1, r2)
            if (r1 != 0) goto L_0x0095
            goto L_0x00af
        L_0x0095:
            java.lang.String r1 = r7.f14094f
            if (r1 == 0) goto L_0x00ad
            android.os.Bundle r2 = r7.f14095g
            boolean r1 = q9.a.a(r2, r1)
            if (r1 != 0) goto L_0x00a2
            goto L_0x00af
        L_0x00a2:
            java.lang.String r1 = r7.f14094f
            android.os.Bundle r2 = r7.f14095g
            boolean r0 = q9.a.c(r0, r1, r2)
            if (r0 != 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r0 = 1
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r0 != 0) goto L_0x00b3
            return
        L_0x00b3:
            m7.a r0 = r6.f14105a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r7.f14089a
            if (r2 == 0) goto L_0x00c3
            java.lang.String r3 = "origin"
            r1.putString(r3, r2)
        L_0x00c3:
            java.lang.String r2 = r7.f14090b
            if (r2 == 0) goto L_0x00cc
            java.lang.String r3 = "name"
            r1.putString(r3, r2)
        L_0x00cc:
            java.lang.Object r2 = r7.f14091c
            if (r2 == 0) goto L_0x00f5
            boolean r3 = r2 instanceof java.lang.Double
            java.lang.String r4 = "value"
            if (r3 == 0) goto L_0x00e0
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r1.putDouble(r4, r2)
            goto L_0x00f5
        L_0x00e0:
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L_0x00ee
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.putLong(r4, r2)
            goto L_0x00f5
        L_0x00ee:
            java.lang.String r2 = r2.toString()
            r1.putString(r4, r2)
        L_0x00f5:
            java.lang.String r2 = r7.f14092d
            if (r2 == 0) goto L_0x00fe
            java.lang.String r3 = "trigger_event_name"
            r1.putString(r3, r2)
        L_0x00fe:
            long r2 = r7.f14093e
            java.lang.String r4 = "trigger_timeout"
            r1.putLong(r4, r2)
            java.lang.String r2 = r7.f14094f
            if (r2 == 0) goto L_0x010e
            java.lang.String r3 = "timed_out_event_name"
            r1.putString(r3, r2)
        L_0x010e:
            android.os.Bundle r2 = r7.f14095g
            if (r2 == 0) goto L_0x0117
            java.lang.String r3 = "timed_out_event_params"
            r1.putBundle(r3, r2)
        L_0x0117:
            java.lang.String r2 = r7.f14096h
            if (r2 == 0) goto L_0x0120
            java.lang.String r3 = "triggered_event_name"
            r1.putString(r3, r2)
        L_0x0120:
            android.os.Bundle r2 = r7.f14097i
            if (r2 == 0) goto L_0x0129
            java.lang.String r3 = "triggered_event_params"
            r1.putBundle(r3, r2)
        L_0x0129:
            long r2 = r7.f14098j
            java.lang.String r4 = "time_to_live"
            r1.putLong(r4, r2)
            java.lang.String r2 = r7.f14099k
            if (r2 == 0) goto L_0x0139
            java.lang.String r3 = "expired_event_name"
            r1.putString(r3, r2)
        L_0x0139:
            android.os.Bundle r2 = r7.f14100l
            if (r2 == 0) goto L_0x0142
            java.lang.String r3 = "expired_event_params"
            r1.putBundle(r3, r2)
        L_0x0142:
            long r2 = r7.f14101m
            java.lang.String r4 = "creation_timestamp"
            r1.putLong(r4, r2)
            boolean r2 = r7.f14102n
            java.lang.String r3 = "active"
            r1.putBoolean(r3, r2)
            long r2 = r7.f14103o
            java.lang.String r7 = "triggered_timestamp"
            r1.putLong(r7, r2)
            com.google.android.gms.internal.measurement.zzdf r7 = r0.f13182a
            r7.zza((android.os.Bundle) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c.b(p9.a$b):void");
    }

    public final void c(String str, String str2, Bundle bundle) {
        if (q9.a.d(str) && q9.a.a(bundle, str2) && q9.a.c(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.f14105a.f13182a.zzb(str, str2, bundle);
        }
    }

    public final int d(String str) {
        return this.f14105a.f13182a.zza(str);
    }

    public final void e(String str) {
        this.f14105a.f13182a.zza(str, (String) null, (Bundle) null);
    }

    public final ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle next : this.f14105a.f13182a.zza(str, "")) {
            f<String> fVar = q9.a.f14374a;
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            j.f(next);
            a.b bVar = new a.b();
            String str2 = (String) j7.a.G0(next, "origin", cls2, (Object) null);
            j.f(str2);
            bVar.f14089a = str2;
            String str3 = (String) j7.a.G0(next, "name", cls2, (Object) null);
            j.f(str3);
            bVar.f14090b = str3;
            bVar.f14091c = j7.a.G0(next, "value", Object.class, (Object) null);
            bVar.f14092d = (String) j7.a.G0(next, "trigger_event_name", cls2, (Object) null);
            bVar.f14093e = ((Long) j7.a.G0(next, "trigger_timeout", cls, 0L)).longValue();
            bVar.f14094f = (String) j7.a.G0(next, "timed_out_event_name", cls2, (Object) null);
            bVar.f14095g = (Bundle) j7.a.G0(next, "timed_out_event_params", Bundle.class, (Object) null);
            bVar.f14096h = (String) j7.a.G0(next, "triggered_event_name", cls2, (Object) null);
            bVar.f14097i = (Bundle) j7.a.G0(next, "triggered_event_params", Bundle.class, (Object) null);
            bVar.f14098j = ((Long) j7.a.G0(next, "time_to_live", cls, 0L)).longValue();
            bVar.f14099k = (String) j7.a.G0(next, "expired_event_name", cls2, (Object) null);
            bVar.f14100l = (Bundle) j7.a.G0(next, "expired_event_params", Bundle.class, (Object) null);
            bVar.f14102n = ((Boolean) j7.a.G0(next, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            bVar.f14101m = ((Long) j7.a.G0(next, "creation_timestamp", cls, 0L)).longValue();
            bVar.f14103o = ((Long) j7.a.G0(next, "triggered_timestamp", cls, 0L)).longValue();
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void g(String str) {
        if (q9.a.d("fcm") && q9.a.b("fcm", "_ln")) {
            this.f14105a.f13182a.zza("fcm", "_ln", (Object) str, true);
        }
    }

    public final b h(String str, b bVar) {
        boolean z10;
        Object obj;
        if (!q9.a.d(str)) {
            return null;
        }
        if (str.isEmpty() || !this.f14106b.containsKey(str) || this.f14106b.get(str) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        m7.a aVar = this.f14105a;
        if ("fiam".equals(str)) {
            obj = new d(aVar, bVar);
        } else if ("clx".equals(str)) {
            obj = new q9.f(aVar, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f14106b.put(str, obj);
        return new b();
    }
}
