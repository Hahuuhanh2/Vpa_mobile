package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Store */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f7608a;

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* compiled from: Store */
    public static class C0070a {

        /* renamed from: d  reason: collision with root package name */
        public static final long f7609d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int f7610e = 0;

        /* renamed from: a  reason: collision with root package name */
        public final String f7611a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7612b;

        /* renamed from: c  reason: collision with root package name */
        public final long f7613c;

        public C0070a(long j10, String str, String str2) {
            this.f7611a = str;
            this.f7612b = str2;
            this.f7613c = j10;
        }

        public static C0070a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0070a(0, str, (String) null);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0070a(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e10) {
                e10.toString();
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        r4.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            r3.f7608a = r0
            java.lang.String r1 = "com.google.android.gms.appid-no-backup"
            java.io.File r4 = k1.a.getNoBackupFilesDir(r4)
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r1)
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x001e
            goto L_0x0051
        L_0x001e:
            boolean r4 = r2.createNewFile()     // Catch:{ IOException -> 0x0044 }
            if (r4 == 0) goto L_0x0051
            monitor-enter(r3)     // Catch:{ IOException -> 0x0044 }
            java.util.Map r4 = r0.getAll()     // Catch:{ all -> 0x0041 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0044 }
            if (r4 != 0) goto L_0x0051
            monitor-enter(r3)     // Catch:{ IOException -> 0x0044 }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x003e }
            android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch:{ all -> 0x003e }
            r4.commit()     // Catch:{ all -> 0x003e }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0044 }
            goto L_0x0051
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0044 }
            throw r4     // Catch:{ IOException -> 0x0044 }
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0044 }
            throw r4     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r4 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0051
            r4.getMessage()
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a.<init>(android.content.Context):void");
    }

    public static String a(String str, String str2) {
        return str + "|T|" + str2 + "|" + "*";
    }
}
