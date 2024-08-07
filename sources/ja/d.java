package ja;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import na.c;
import org.json.JSONObject;

/* compiled from: MetaDataStore */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f11804b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final c f11805a;

    public d(c cVar) {
        this.f11805a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, (String) null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> b(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x000b
            na.c r6 = r4.f11805a
            java.lang.String r0 = "internal-keys"
            java.io.File r5 = r6.b(r5, r0)
            goto L_0x0013
        L_0x000b:
            na.c r6 = r4.f11805a
            java.lang.String r0 = "keys"
            java.io.File r5 = r6.b(r5, r0)
        L_0x0013:
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x004c
            long r0 = r5.length()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0024
            goto L_0x004c
        L_0x0024:
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x003c }
            java.lang.String r6 = ia.h.i(r0)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            java.util.HashMap r5 = a(r6)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            ia.h.b(r0)
            return r5
        L_0x0036:
            r5 = move-exception
            goto L_0x0048
        L_0x0038:
            r6 = r0
            goto L_0x003c
        L_0x003a:
            r5 = move-exception
            goto L_0x0047
        L_0x003c:
            d(r5)     // Catch:{ all -> 0x003a }
            ia.h.b(r6)
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L_0x0047:
            r0 = r6
        L_0x0048:
            ia.h.b(r0)
            throw r5
        L_0x004c:
            d(r5)
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.d.b(java.lang.String, boolean):java.util.Map");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        ia.h.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r9 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c(java.lang.String r9) {
        /*
            r8 = this;
            na.c r0 = r8.f11805a
            java.lang.String r1 = "user-data"
            java.io.File r9 = r0.b(r9, r1)
            boolean r0 = r9.exists()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 3
            if (r0 == 0) goto L_0x0052
            long r4 = r9.length()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            goto L_0x0052
        L_0x001d:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.lang.String r4 = ia.h.i(r0)     // Catch:{ Exception -> 0x0045 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0045 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = "userId"
            boolean r6 = r5.isNull(r4)     // Catch:{ Exception -> 0x0045 }
            if (r6 != 0) goto L_0x0038
            java.lang.String r4 = r5.optString(r4, r1)     // Catch:{ Exception -> 0x0045 }
            goto L_0x0039
        L_0x0038:
            r4 = r1
        L_0x0039:
            android.util.Log.isLoggable(r2, r3)     // Catch:{ Exception -> 0x0045 }
            ia.h.b(r0)
            return r4
        L_0x0040:
            r1 = r0
            goto L_0x004e
        L_0x0042:
            r9 = move-exception
            goto L_0x004e
        L_0x0044:
            r0 = r1
        L_0x0045:
            d(r9)     // Catch:{ all -> 0x004c }
            ia.h.b(r0)
            return r1
        L_0x004c:
            r9 = move-exception
            goto L_0x0040
        L_0x004e:
            ia.h.b(r1)
            throw r9
        L_0x0052:
            android.util.Log.isLoggable(r2, r3)
            d(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.d.c(java.lang.String):java.lang.String");
    }
}
