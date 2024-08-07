package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import b0.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m6.k;
import vb.c;

/* compiled from: ConfigRealtimeHttpClient */
public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f7708p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f7709q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Set<c> f7710a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7711b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f7712c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7713d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7714e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f7715f;

    /* renamed from: g  reason: collision with root package name */
    public final b f7716g;

    /* renamed from: h  reason: collision with root package name */
    public final m9.d f7717h;

    /* renamed from: i  reason: collision with root package name */
    public final ab.c f7718i;

    /* renamed from: j  reason: collision with root package name */
    public wb.c f7719j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f7720k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7721l;

    /* renamed from: m  reason: collision with root package name */
    public final Random f7722m;

    /* renamed from: n  reason: collision with root package name */
    public final h7.d f7723n;

    /* renamed from: o  reason: collision with root package name */
    public final c f7724o;

    /* compiled from: ConfigRealtimeHttpClient */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            d dVar = d.this;
            if (dVar.a()) {
                c.b b10 = dVar.f7724o.b();
                dVar.f7723n.getClass();
                if (new Date(System.currentTimeMillis()).before(b10.f7707b)) {
                    dVar.g();
                    return;
                }
                Task a10 = dVar.f7718i.a();
                Task<String> id2 = dVar.f7718i.getId();
                Task<TContinuationResult> continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{a10, id2}).continueWithTask(dVar.f7715f, new k(4, dVar, a10, id2));
                Tasks.whenAllComplete((Task<?>[]) new Task[]{continueWithTask}).continueWith(dVar.f7715f, new e(7, dVar, continueWithTask));
            }
        }
    }

    /* compiled from: ConfigRealtimeHttpClient */
    public class b implements vb.c {
        public b() {
        }

        public final void a() {
        }

        public final void b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            d dVar = d.this;
            synchronized (dVar) {
                dVar.f7713d = true;
            }
            d.this.f(firebaseRemoteConfigException);
        }
    }

    public d(m9.d dVar, ab.c cVar, b bVar, wb.c cVar2, Context context, String str, LinkedHashSet linkedHashSet, c cVar3, ScheduledExecutorService scheduledExecutorService) {
        this.f7710a = linkedHashSet;
        this.f7715f = scheduledExecutorService;
        this.f7722m = new Random();
        this.f7712c = Math.max(8 - cVar3.b().f7706a, 1);
        this.f7723n = h7.d.f10614e;
        this.f7717h = dVar;
        this.f7716g = bVar;
        this.f7718i = cVar;
        this.f7719j = cVar2;
        this.f7720k = context;
        this.f7721l = str;
        this.f7724o = cVar3;
        this.f7713d = false;
        this.f7714e = false;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean c(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public static String e(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        boolean z10;
        if (this.f7710a.isEmpty() || this.f7711b || this.f7713d || this.f7714e) {
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.a()     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            int r0 = r3.f7712c     // Catch:{ all -> 0x002c }
            if (r0 <= 0) goto L_0x001e
            int r0 = r0 + -1
            r3.f7712c = r0     // Catch:{ all -> 0x002c }
            java.util.concurrent.ScheduledExecutorService r0 = r3.f7715f     // Catch:{ all -> 0x002c }
            com.google.firebase.remoteconfig.internal.d$a r1 = new com.google.firebase.remoteconfig.internal.d$a     // Catch:{ all -> 0x002c }
            r1.<init>()     // Catch:{ all -> 0x002c }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x002c }
            r0.schedule(r1, r4, r2)     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x001e:
            boolean r4 = r3.f7714e     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r4 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException     // Catch:{ all -> 0x002c }
            r4.<init>()     // Catch:{ all -> 0x002c }
            r3.f(r4)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r3)
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.d.d(long):void");
    }

    public final synchronized void f(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (vb.c b10 : this.f7710a) {
            b10.b(firebaseRemoteConfigException);
        }
    }

    @SuppressLint({"VisibleForTests"})
    public final synchronized void g() {
        this.f7723n.getClass();
        d(Math.max(0, this.f7724o.b().f7707b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x007a  */
    @android.annotation.SuppressLint({"VisibleForTests"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.net.HttpURLConnection r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r5.setRequestProperty(r0, r7)
            m9.d r7 = r4.f7717h
            r7.a()
            m9.e r7 = r7.f13220c
            java.lang.String r7 = r7.f13231a
            java.lang.String r0 = "X-Goog-Api-Key"
            r5.setRequestProperty(r0, r7)
            android.content.Context r7 = r4.f7720k
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r0 = "X-Android-Package"
            r5.setRequestProperty(r0, r7)
            r7 = 0
            android.content.Context r0 = r4.f7720k     // Catch:{ NameNotFoundException -> 0x003b }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x003b }
            byte[] r0 = h7.a.a(r0, r1)     // Catch:{ NameNotFoundException -> 0x003b }
            if (r0 != 0) goto L_0x0036
            android.content.Context r0 = r4.f7720k     // Catch:{ NameNotFoundException -> 0x003b }
            r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x003b }
            goto L_0x0040
        L_0x0036:
            java.lang.String r0 = h7.d.a(r0)     // Catch:{ NameNotFoundException -> 0x003b }
            goto L_0x0041
        L_0x003b:
            android.content.Context r0 = r4.f7720k
            r0.getPackageName()
        L_0x0040:
            r0 = r7
        L_0x0041:
            java.lang.String r1 = "X-Android-Cert"
            r5.setRequestProperty(r1, r0)
            java.lang.String r0 = "X-Google-GFE-Can-Retry"
            java.lang.String r1 = "yes"
            r5.setRequestProperty(r0, r1)
            java.lang.String r0 = "X-Accept-Response-Streaming"
            java.lang.String r1 = "true"
            r5.setRequestProperty(r0, r1)
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "Content-Type"
            r5.setRequestProperty(r1, r0)
            java.lang.String r1 = "Accept"
            r5.setRequestProperty(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            m9.d r1 = r4.f7717h
            r1.a()
            m9.e r1 = r1.f13220c
            java.lang.String r1 = r1.f13232b
            java.util.regex.Pattern r2 = f7709q
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L_0x007f
            r7 = 1
            java.lang.String r7 = r1.group(r7)
        L_0x007f:
            java.lang.String r1 = "project"
            r0.put(r1, r7)
            java.lang.String r7 = r4.f7721l
            java.lang.String r1 = "namespace"
            r0.put(r1, r7)
            com.google.firebase.remoteconfig.internal.b r7 = r4.f7716g
            com.google.firebase.remoteconfig.internal.c r7 = r7.f7693g
            android.content.SharedPreferences r7 = r7.f7700a
            r1 = 0
            java.lang.String r3 = "last_template_version"
            long r1 = r7.getLong(r3, r1)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r1 = "lastKnownVersionNumber"
            r0.put(r1, r7)
            m9.d r7 = r4.f7717h
            r7.a()
            m9.e r7 = r7.f13220c
            java.lang.String r7 = r7.f13232b
            java.lang.String r1 = "appId"
            r0.put(r1, r7)
            java.lang.String r7 = "sdkVersion"
            java.lang.String r1 = "21.4.1"
            r0.put(r7, r1)
            java.lang.String r7 = "appInstanceId"
            r0.put(r7, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "utf-8"
            byte[] r6 = r6.getBytes(r7)
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream
            java.io.OutputStream r5 = r5.getOutputStream()
            r7.<init>(r5)
            r7.write(r6)
            r7.flush()
            r7.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.d.h(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    @SuppressLint({"VisibleForTests"})
    public final synchronized a i(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        httpURLConnection2 = httpURLConnection;
        return new a(httpURLConnection2, this.f7716g, this.f7719j, this.f7710a, new b(), this.f7715f);
    }

    public final void j(Date date) {
        int i10 = this.f7724o.b().f7706a + 1;
        int[] iArr = f7708p;
        int i11 = 8;
        if (i10 < 8) {
            i11 = i10;
        }
        long millis = TimeUnit.MINUTES.toMillis((long) iArr[i11 - 1]);
        this.f7724o.d(i10, new Date(date.getTime() + (millis / 2) + ((long) this.f7722m.nextInt((int) millis))));
    }
}
