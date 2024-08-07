package v9;

import android.content.Context;
import com.google.firebase.FirebaseException;
import h7.i;
import java.net.URL;
import m9.e;
import org.json.JSONObject;
import xa.d;
import y6.j;
import za.b;

/* compiled from: NetworkClient */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16104a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16105b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16106c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16107d;

    /* renamed from: e  reason: collision with root package name */
    public final b<d> f16108e;

    public h(m9.d dVar) {
        dVar.a();
        Context context = dVar.f13218a;
        dVar.a();
        e eVar = dVar.f13220c;
        b<d> bVar = ((e) ((s9.b) dVar.b(s9.b.class))).f16095a;
        j.f(context);
        j.f(eVar);
        j.f(bVar);
        this.f16104a = context;
        this.f16105b = eVar.f13231a;
        this.f16106c = eVar.f13232b;
        String str = eVar.f13237g;
        this.f16107d = str;
        if (str != null) {
            this.f16108e = bVar;
            return;
        }
        throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
    }

    public final a a(byte[] bArr, int i10, i iVar) {
        boolean z10;
        String str;
        long j10 = iVar.f16111c;
        iVar.f16109a.getClass();
        if (j10 <= System.currentTimeMillis()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 1) {
                str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeSafetyNetToken?key=%s";
            } else if (i10 == 2) {
                str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
            } else if (i10 == 3) {
                str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
            } else {
                throw new IllegalArgumentException("Unknown token type.");
            }
            JSONObject jSONObject = new JSONObject(b(new URL(String.format(str, new Object[]{this.f16107d, this.f16106c, this.f16105b})), bArr, iVar, true));
            String a10 = i.a(jSONObject.optString("token"));
            String a11 = i.a(jSONObject.optString("ttl"));
            if (a10 != null && a11 != null) {
                return new a(a10, a11);
            }
            throw new FirebaseException("Unexpected server response.");
        }
        throw new FirebaseException("Too many attempts.");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9.f16104a.getPackageName();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0057 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ NameNotFoundException -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[Catch:{ NameNotFoundException -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[Catch:{ all -> 0x010b, all -> 0x0110, all -> 0x0101, all -> 0x0106, all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ all -> 0x010b, all -> 0x0110, all -> 0x0101, all -> 0x0106, all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ all -> 0x010b, all -> 0x0110, all -> 0x0101, all -> 0x0106, all -> 0x0115 }, LOOP:0: B:34:0x009c->B:37:0x00a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6 A[EDGE_INSN: B:38:0x00a6->B:39:? ?: BREAK  , SYNTHETIC, Splitter:B:38:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5 A[Catch:{ all -> 0x010b, all -> 0x0110, all -> 0x0101, all -> 0x0106, all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3 A[SYNTHETIC, Splitter:B:49:0x00c3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.net.URL r10, byte[] r11, v9.i r12, boolean r13) {
        /*
            r9 = this;
            java.net.URLConnection r10 = r10.openConnection()
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10
            r0 = 1
            r10.setDoOutput(r0)     // Catch:{ all -> 0x0115 }
            int r1 = r11.length     // Catch:{ all -> 0x0115 }
            r10.setFixedLengthStreamingMode(r1)     // Catch:{ all -> 0x0115 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r10.setRequestProperty(r1, r2)     // Catch:{ all -> 0x0115 }
            za.b<xa.d> r1 = r9.f16108e     // Catch:{ all -> 0x0115 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0115 }
            xa.d r1 = (xa.d) r1     // Catch:{ all -> 0x0115 }
            r2 = 0
            if (r1 == 0) goto L_0x002b
            com.google.android.gms.tasks.Task r1 = r1.a()     // Catch:{ Exception -> 0x002b }
            java.lang.Object r1 = com.google.android.gms.tasks.Tasks.await(r1)     // Catch:{ Exception -> 0x002b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 == 0) goto L_0x0033
            java.lang.String r3 = "X-Firebase-Client"
            r10.setRequestProperty(r3, r1)     // Catch:{ all -> 0x0115 }
        L_0x0033:
            java.lang.String r1 = "X-Android-Package"
            android.content.Context r3 = r9.f16104a     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x0115 }
            r10.setRequestProperty(r1, r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r1 = "X-Android-Cert"
            android.content.Context r3 = r9.f16104a     // Catch:{ NameNotFoundException -> 0x0057 }
            java.lang.String r4 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0057 }
            byte[] r3 = h7.a.a(r3, r4)     // Catch:{ NameNotFoundException -> 0x0057 }
            if (r3 != 0) goto L_0x0052
            android.content.Context r3 = r9.f16104a     // Catch:{ NameNotFoundException -> 0x0057 }
            r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0057 }
            goto L_0x005c
        L_0x0052:
            java.lang.String r2 = h7.d.a(r3)     // Catch:{ NameNotFoundException -> 0x0057 }
            goto L_0x005c
        L_0x0057:
            android.content.Context r3 = r9.f16104a     // Catch:{ all -> 0x0115 }
            r3.getPackageName()     // Catch:{ all -> 0x0115 }
        L_0x005c:
            r10.setRequestProperty(r1, r2)     // Catch:{ all -> 0x0115 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0115 }
            java.io.OutputStream r2 = r10.getOutputStream()     // Catch:{ all -> 0x0115 }
            int r3 = r11.length     // Catch:{ all -> 0x0115 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0115 }
            int r2 = r11.length     // Catch:{ all -> 0x010b }
            r3 = 0
            r1.write(r11, r3, r2)     // Catch:{ all -> 0x010b }
            r1.close()     // Catch:{ all -> 0x0115 }
            int r11 = r10.getResponseCode()     // Catch:{ all -> 0x0115 }
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 200(0xc8, float:2.8E-43)
            if (r11 < r2) goto L_0x007f
            if (r11 >= r1) goto L_0x007f
            r4 = r0
            goto L_0x0080
        L_0x007f:
            r4 = r3
        L_0x0080:
            if (r4 == 0) goto L_0x0087
            java.io.InputStream r4 = r10.getInputStream()     // Catch:{ all -> 0x0115 }
            goto L_0x008b
        L_0x0087:
            java.io.InputStream r4 = r10.getErrorStream()     // Catch:{ all -> 0x0115 }
        L_0x008b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r5.<init>()     // Catch:{ all -> 0x0115 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0115 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = "UTF-8"
            r7.<init>(r4, r8)     // Catch:{ all -> 0x0115 }
            r6.<init>(r7)     // Catch:{ all -> 0x0115 }
        L_0x009c:
            java.lang.String r4 = r6.readLine()     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x00a6
            r5.append(r4)     // Catch:{ all -> 0x0101 }
            goto L_0x009c
        L_0x00a6:
            r6.close()     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0115 }
            if (r11 < r2) goto L_0x00b2
            if (r11 >= r1) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r0 = r3
        L_0x00b3:
            if (r0 == 0) goto L_0x00c3
            if (r13 == 0) goto L_0x00bf
            r0 = 0
            r12.f16110b = r0     // Catch:{ all -> 0x0115 }
            r0 = -1
            r12.f16111c = r0     // Catch:{ all -> 0x0115 }
        L_0x00bf:
            r10.disconnect()
            return r4
        L_0x00c3:
            r12.a(r11)     // Catch:{ all -> 0x0115 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x0115 }
            r11.<init>(r4)     // Catch:{ all -> 0x0115 }
            java.lang.String r12 = "error"
            java.lang.String r11 = r11.optString(r12)     // Catch:{ all -> 0x0115 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x0115 }
            r12.<init>(r11)     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "code"
            int r11 = r12.optInt(r11)     // Catch:{ all -> 0x0115 }
            java.lang.String r13 = "message"
            java.lang.String r12 = r12.optString(r13)     // Catch:{ all -> 0x0115 }
            com.google.firebase.FirebaseException r13 = new com.google.firebase.FirebaseException     // Catch:{ all -> 0x0115 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r0.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r1 = "Error returned from API. code: "
            r0.append(r1)     // Catch:{ all -> 0x0115 }
            r0.append(r11)     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = " body: "
            r0.append(r11)     // Catch:{ all -> 0x0115 }
            r0.append(r12)     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x0115 }
            r13.<init>(r11)     // Catch:{ all -> 0x0115 }
            throw r13     // Catch:{ all -> 0x0115 }
        L_0x0101:
            r11 = move-exception
            r6.close()     // Catch:{ all -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch:{ all -> 0x0115 }
        L_0x010a:
            throw r11     // Catch:{ all -> 0x0115 }
        L_0x010b:
            r11 = move-exception
            r1.close()     // Catch:{ all -> 0x0110 }
            goto L_0x0114
        L_0x0110:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch:{ all -> 0x0115 }
        L_0x0114:
            throw r11     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r11 = move-exception
            r10.disconnect()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.h.b(java.net.URL, byte[], v9.i, boolean):java.lang.String");
    }
}
