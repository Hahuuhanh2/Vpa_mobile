package g6;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry */
public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final a f10387a;

    /* renamed from: b  reason: collision with root package name */
    public final i f10388b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f10389c = new HashMap();

    /* compiled from: MetadataBackendRegistry */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f10390a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f10391b = null;

        public a(Context context) {
            this.f10390a = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final g6.d a(java.lang.String r14) {
            /*
                r13 = this;
                java.lang.String r0 = "Could not instantiate %s"
                java.lang.String r1 = "Could not instantiate %s."
                java.util.Map<java.lang.String, java.lang.String> r2 = r13.f10391b
                r3 = 0
                r4 = 0
                if (r2 != 0) goto L_0x0080
                android.content.Context r2 = r13.f10390a
                android.content.pm.PackageManager r5 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0026 }
                if (r5 != 0) goto L_0x0013
                goto L_0x0026
            L_0x0013:
                android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0026 }
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r7 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r6.<init>(r2, r7)     // Catch:{ NameNotFoundException -> 0x0026 }
                r2 = 128(0x80, float:1.794E-43)
                android.content.pm.ServiceInfo r2 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0026 }
                if (r2 != 0) goto L_0x0023
                goto L_0x0026
            L_0x0023:
                android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0026 }
                goto L_0x0027
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != 0) goto L_0x002e
                java.util.Map r2 = java.util.Collections.emptyMap()
                goto L_0x007e
            L_0x002e:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Set r6 = r2.keySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x003b:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x007d
                java.lang.Object r7 = r6.next()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r2.get(r7)
                boolean r9 = r8 instanceof java.lang.String
                if (r9 == 0) goto L_0x003b
                java.lang.String r9 = "backend:"
                boolean r9 = r7.startsWith(r9)
                if (r9 == 0) goto L_0x003b
                java.lang.String r8 = (java.lang.String) r8
                r9 = -1
                java.lang.String r10 = ","
                java.lang.String[] r8 = r8.split(r10, r9)
                int r9 = r8.length
                r10 = r4
            L_0x0062:
                if (r10 >= r9) goto L_0x003b
                r11 = r8[r10]
                java.lang.String r11 = r11.trim()
                boolean r12 = r11.isEmpty()
                if (r12 == 0) goto L_0x0071
                goto L_0x007a
            L_0x0071:
                r12 = 8
                java.lang.String r12 = r7.substring(r12)
                r5.put(r11, r12)
            L_0x007a:
                int r10 = r10 + 1
                goto L_0x0062
            L_0x007d:
                r2 = r5
            L_0x007e:
                r13.f10391b = r2
            L_0x0080:
                java.util.Map<java.lang.String, java.lang.String> r2 = r13.f10391b
                java.lang.Object r14 = r2.get(r14)
                java.lang.String r14 = (java.lang.String) r14
                if (r14 != 0) goto L_0x008b
                return r3
            L_0x008b:
                r2 = 1
                java.lang.Class r5 = java.lang.Class.forName(r14)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.Class<g6.d> r6 = g6.d.class
                java.lang.Class r5 = r5.asSubclass(r6)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                g6.d r5 = (g6.d) r5     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                return r5
            L_0x00a5:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r4] = r14
                java.lang.String.format(r0, r1)
                goto L_0x00ce
            L_0x00ad:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r4] = r14
                java.lang.String.format(r0, r1)
                goto L_0x00ce
            L_0x00b5:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String.format(r1, r0)
                goto L_0x00ce
            L_0x00bd:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String.format(r1, r0)
                goto L_0x00ce
            L_0x00c5:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String r14 = "Class %s is not found."
                java.lang.String.format(r14, r0)
            L_0x00ce:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: g6.k.a.a(java.lang.String):g6.d");
        }
    }

    public k(Context context, i iVar) {
        a aVar = new a(context);
        this.f10387a = aVar;
        this.f10388b = iVar;
    }

    public final synchronized m a(String str) {
        if (this.f10389c.containsKey(str)) {
            return (m) this.f10389c.get(str);
        }
        d a10 = this.f10387a.a(str);
        if (a10 == null) {
            return null;
        }
        i iVar = this.f10388b;
        m create = a10.create(new c(iVar.f10381a, iVar.f10382b, iVar.f10383c, str));
        this.f10389c.put(str, create);
        return create;
    }
}
