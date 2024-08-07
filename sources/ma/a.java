package ma;

import f0.b0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: HttpGetRequest */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f13238a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f13239b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f13240c = new HashMap();

    public a(String str, HashMap hashMap) {
        this.f13238a = str;
        this.f13239b = hashMap;
    }

    public static String a(String str, Map map) {
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() != null) {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        } else {
            str2 = "";
        }
        sb2.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            if (entry2.getValue() != null) {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            } else {
                str3 = "";
            }
            sb2.append(str3);
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return b0.s(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = b0.r("&", sb3);
        }
        return b0.r(str, sb3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v9.g b() {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = r8.f13238a     // Catch:{ all -> 0x0094 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.f13239b     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = a(r1, r2)     // Catch:{ all -> 0x0094 }
            r2 = 2
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.isLoggable(r3, r2)     // Catch:{ all -> 0x0094 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0094 }
            r2.<init>(r1)     // Catch:{ all -> 0x0094 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0094 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x0094 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x0092 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x0092 }
            java.util.HashMap r2 = r8.f13240c     // Catch:{ all -> 0x0092 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0092 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0092 }
        L_0x0031:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x004d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0092 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0092 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0092 }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x0092 }
            goto L_0x0031
        L_0x004d:
            r1.connect()     // Catch:{ all -> 0x0092 }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x0092 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x0084
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0080 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0080 }
            r0.<init>(r4)     // Catch:{ all -> 0x0080 }
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r5.<init>()     // Catch:{ all -> 0x0080 }
        L_0x006f:
            int r6 = r0.read(r4)     // Catch:{ all -> 0x0080 }
            r7 = -1
            if (r6 == r7) goto L_0x007b
            r7 = 0
            r5.append(r4, r7, r6)     // Catch:{ all -> 0x0080 }
            goto L_0x006f
        L_0x007b:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r0 = move-exception
            r2 = r0
            r0 = r3
            goto L_0x0097
        L_0x0084:
            if (r3 == 0) goto L_0x0089
            r3.close()
        L_0x0089:
            r1.disconnect()
            v9.g r1 = new v9.g
            r1.<init>(r2, r0)
            return r1
        L_0x0092:
            r2 = move-exception
            goto L_0x0097
        L_0x0094:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x0097:
            if (r0 == 0) goto L_0x009c
            r0.close()
        L_0x009c:
            if (r1 == 0) goto L_0x00a1
            r1.disconnect()
        L_0x00a1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.a.b():v9.g");
    }
}
