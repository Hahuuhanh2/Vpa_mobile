package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.a;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f7667h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Context f7668a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7669b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7670c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7671d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7672e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7673f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7674g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        String str4;
        this.f7668a = context;
        this.f7669b = str;
        this.f7670c = str2;
        Matcher matcher = f7667h.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.f7671d = str4;
        this.f7672e = str3;
        this.f7673f = j10;
        this.f7674g = j11;
    }

    public static JSONObject c(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) read);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l10) {
        long j10;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f7669b);
            Locale locale = this.f7668a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i10));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f7668a.getPackageManager().getPackageInfo(this.f7668a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i10 >= 28) {
                        j10 = a.b(packageInfo);
                    } else {
                        j10 = (long) packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j10));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f7668a.getPackageName());
            hashMap.put("sdkVersion", "21.4.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l10 != null) {
                long longValue = l10.longValue();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(longValue)));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.f7671d, this.f7672e})).openConnection();
        } catch (IOException e10) {
            throw new FirebaseRemoteConfigException(e10.getMessage());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:23|24|25|(2:26|27)|(3:31|32|33)|34|(2:36|37)|(3:41|42|43)|44|(2:46|47)|(3:51|52|53)|54|55|(1:57)(1:58)|(1:60)|61|62|(3:63|64|65)|(2:69|70)(2:71|72)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x011e */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0080 A[LOOP:0: B:10:0x007a->B:12:0x0080, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b7 A[Catch:{ IOException | JSONException -> 0x0170, all -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0124 A[Catch:{ JSONException -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129 A[Catch:{ JSONException -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012c A[Catch:{ JSONException -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0166 A[SYNTHETIC, Splitter:B:76:0x0166] */
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.b.a fetch(java.net.HttpURLConnection r14, java.lang.String r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, java.lang.Long r20, java.util.Date r21) {
        /*
            r13 = this;
            r1 = r13
            r2 = r14
            r0 = r16
            r3 = 1
            r14.setDoOutput(r3)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = r1.f7673f
            long r5 = r4.toMillis(r5)
            int r5 = (int) r5
            r14.setConnectTimeout(r5)
            long r5 = r1.f7674g
            long r4 = r4.toMillis(r5)
            int r4 = (int) r4
            r14.setReadTimeout(r4)
            java.lang.String r4 = "If-None-Match"
            r5 = r18
            r14.setRequestProperty(r4, r5)
            java.lang.String r4 = r1.f7670c
            java.lang.String r5 = "X-Goog-Api-Key"
            r14.setRequestProperty(r5, r4)
            android.content.Context r4 = r1.f7668a
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "X-Android-Package"
            r14.setRequestProperty(r5, r4)
            r4 = 0
            android.content.Context r5 = r1.f7668a     // Catch:{ NameNotFoundException -> 0x004f }
            java.lang.String r6 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x004f }
            byte[] r5 = h7.a.a(r5, r6)     // Catch:{ NameNotFoundException -> 0x004f }
            if (r5 != 0) goto L_0x004a
            android.content.Context r5 = r1.f7668a     // Catch:{ NameNotFoundException -> 0x004f }
            r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x004f }
            goto L_0x0054
        L_0x004a:
            java.lang.String r5 = h7.d.a(r5)     // Catch:{ NameNotFoundException -> 0x004f }
            goto L_0x0055
        L_0x004f:
            android.content.Context r5 = r1.f7668a
            r5.getPackageName()
        L_0x0054:
            r5 = r4
        L_0x0055:
            java.lang.String r6 = "X-Android-Cert"
            r14.setRequestProperty(r6, r5)
            java.lang.String r5 = "X-Google-GFE-Can-Retry"
            java.lang.String r6 = "yes"
            r14.setRequestProperty(r5, r6)
            java.lang.String r5 = "X-Goog-Firebase-Installations-Auth"
            r14.setRequestProperty(r5, r0)
            java.lang.String r5 = "application/json"
            java.lang.String r6 = "Content-Type"
            r14.setRequestProperty(r6, r5)
            java.lang.String r6 = "Accept"
            r14.setRequestProperty(r6, r5)
            java.util.Set r5 = r19.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x007a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0096
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r14.setRequestProperty(r7, r6)
            goto L_0x007a
        L_0x0096:
            r6 = r15
            r7 = r17
            r8 = r20
            org.json.JSONObject r0 = r13.a(r15, r0, r7, r8)     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            java.lang.String r5 = "utf-8"
            byte[] r0 = r0.getBytes(r5)     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            d(r14, r0)     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            r14.connect()     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            int r0 = r14.getResponseCode()     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x0166
            java.lang.String r0 = "ETag"
            java.lang.String r0 = r14.getHeaderField(r0)     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            org.json.JSONObject r5 = c(r14)     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            r14.disconnect()
            java.io.InputStream r2 = r14.getInputStream()     // Catch:{ IOException -> 0x00cb }
            r2.close()     // Catch:{ IOException -> 0x00cb }
        L_0x00cb:
            java.lang.String r2 = "templateVersion"
            java.util.Date r6 = wb.d.f16764g     // Catch:{ JSONException -> 0x015d }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x015d }
            r6.<init>()     // Catch:{ JSONException -> 0x015d }
            java.util.Date r7 = wb.d.f16764g     // Catch:{ JSONException -> 0x015d }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x015d }
            r7.<init>()     // Catch:{ JSONException -> 0x015d }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x015d }
            r8.<init>()     // Catch:{ JSONException -> 0x015d }
            r9 = 0
            java.lang.String r11 = "entries"
            org.json.JSONObject r11 = r5.getJSONObject(r11)     // Catch:{ JSONException -> 0x00e9 }
            goto L_0x00ea
        L_0x00e9:
            r11 = r4
        L_0x00ea:
            if (r11 == 0) goto L_0x00f6
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f6 }
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x00f6 }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x00f6 }
            r6 = r12
        L_0x00f6:
            java.lang.String r11 = "experimentDescriptions"
            org.json.JSONArray r11 = r5.getJSONArray(r11)     // Catch:{ JSONException -> 0x00fd }
            goto L_0x00fe
        L_0x00fd:
            r11 = r4
        L_0x00fe:
            if (r11 == 0) goto L_0x010a
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x010a }
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x010a }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x010a }
            r7 = r12
        L_0x010a:
            java.lang.String r11 = "personalizationMetadata"
            org.json.JSONObject r11 = r5.getJSONObject(r11)     // Catch:{ JSONException -> 0x0111 }
            goto L_0x0112
        L_0x0111:
            r11 = r4
        L_0x0112:
            if (r11 == 0) goto L_0x011e
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011e }
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x011e }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x011e }
            r8 = r12
        L_0x011e:
            boolean r11 = r5.has(r2)     // Catch:{ JSONException -> 0x015d }
            if (r11 == 0) goto L_0x0129
            java.lang.String r2 = r5.getString(r2)     // Catch:{ JSONException -> 0x015d }
            goto L_0x012a
        L_0x0129:
            r2 = r4
        L_0x012a:
            if (r2 == 0) goto L_0x0130
            long r9 = java.lang.Long.parseLong(r2)     // Catch:{ JSONException -> 0x015d }
        L_0x0130:
            wb.d r2 = new wb.d     // Catch:{ JSONException -> 0x015d }
            r14 = r2
            r15 = r6
            r16 = r21
            r17 = r7
            r18 = r8
            r19 = r9
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r6 = "state"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ JSONException -> 0x014d }
            java.lang.String r6 = "NO_CHANGE"
            boolean r5 = r5.equals(r6)     // Catch:{ JSONException -> 0x014d }
            r5 = r5 ^ r3
            goto L_0x014e
        L_0x014d:
            r5 = r3
        L_0x014e:
            if (r5 != 0) goto L_0x0156
            com.google.firebase.remoteconfig.internal.b$a r0 = new com.google.firebase.remoteconfig.internal.b$a
            r0.<init>(r3, r2, r4)
            return r0
        L_0x0156:
            com.google.firebase.remoteconfig.internal.b$a r3 = new com.google.firebase.remoteconfig.internal.b$a
            r4 = 0
            r3.<init>(r4, r2, r0)
            return r3
        L_0x015d:
            r0 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r2 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.String r3 = "Fetch failed: fetch response could not be parsed."
            r2.<init>(r3, r0)
            throw r2
        L_0x0166:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r3 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            java.lang.String r4 = r14.getResponseMessage()     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            r3.<init>(r0, r4)     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
            throw r3     // Catch:{ IOException -> 0x0172, JSONException -> 0x0170 }
        L_0x0170:
            r0 = move-exception
            goto L_0x0173
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r3 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "The client had an error while calling the backend!"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x017b }
            throw r3     // Catch:{ all -> 0x017b }
        L_0x017b:
            r0 = move-exception
            r14.disconnect()
            java.io.InputStream r2 = r14.getInputStream()     // Catch:{ IOException -> 0x0186 }
            r2.close()     // Catch:{ IOException -> 0x0186 }
        L_0x0186:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):com.google.firebase.remoteconfig.internal.b$a");
    }
}
