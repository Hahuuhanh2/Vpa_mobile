package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import vb.c;
import wb.d;

/* compiled from: ConfigAutoFetch */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Set<c> f7675a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpURLConnection f7676b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7677c;

    /* renamed from: d  reason: collision with root package name */
    public final wb.c f7678d;

    /* renamed from: e  reason: collision with root package name */
    public final c f7679e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f7680f;

    /* renamed from: g  reason: collision with root package name */
    public final Random f7681g = new Random();

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a  reason: collision with other inner class name */
    /* compiled from: ConfigAutoFetch */
    public class C0071a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7682a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f7683b;

        public C0071a(int i10, long j10) {
            this.f7682a = i10;
            this.f7683b = j10;
        }

        public final void run() {
            a aVar = a.this;
            int i10 = this.f7682a;
            long j10 = this.f7683b;
            synchronized (aVar) {
                int i11 = i10 - 1;
                Task c10 = aVar.f7677c.c(3 - i11);
                Task<d> b10 = aVar.f7678d.b();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{c10, b10}).continueWithTask(aVar.f7680f, new wb.a(aVar, c10, b10, j10, i11));
            }
        }
    }

    public a(HttpURLConnection httpURLConnection, b bVar, wb.c cVar, Set set, d.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        this.f7676b = httpURLConnection;
        this.f7677c = bVar;
        this.f7678d = cVar;
        this.f7675a = set;
        this.f7679e = bVar2;
        this.f7680f = scheduledExecutorService;
    }

    public final void a(int i10, long j10) {
        if (i10 == 0) {
            FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.");
            synchronized (this) {
                for (c b10 : this.f7675a) {
                    b10.b(firebaseRemoteConfigServerException);
                }
            }
            return;
        }
        this.f7680f.schedule(new C0071a(i10, j10), (long) this.f7681g.nextInt(4), TimeUnit.SECONDS);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void b(java.io.InputStream r7) {
        /*
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "utf-8"
            r1.<init>(r7, r2)
            r0.<init>(r1)
            java.lang.String r1 = ""
        L_0x000e:
            java.lang.String r2 = r0.readLine()
            if (r2 == 0) goto L_0x00c3
            java.lang.String r1 = f0.b0.r(r1, r2)
            java.lang.String r3 = "}"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x000e
            r2 = 123(0x7b, float:1.72E-43)
            int r2 = r1.indexOf(r2)
            r3 = 125(0x7d, float:1.75E-43)
            int r3 = r1.lastIndexOf(r3)
            java.lang.String r4 = ""
            if (r2 < 0) goto L_0x003d
            if (r3 >= 0) goto L_0x0033
            goto L_0x003d
        L_0x0033:
            if (r2 < r3) goto L_0x0036
            goto L_0x003d
        L_0x0036:
            int r3 = r3 + 1
            java.lang.String r1 = r1.substring(r2, r3)
            goto L_0x003e
        L_0x003d:
            r1 = r4
        L_0x003e:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0045
            goto L_0x000e
        L_0x0045:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r1 = "featureDisabled"
            boolean r1 = r2.has(r1)     // Catch:{ JSONException -> 0x009a }
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "featureDisabled"
            boolean r1 = r2.getBoolean(r1)     // Catch:{ JSONException -> 0x009a }
            if (r1 == 0) goto L_0x0067
            vb.c r1 = r6.f7679e     // Catch:{ JSONException -> 0x009a }
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r2 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch:{ JSONException -> 0x009a }
            java.lang.String r3 = "The server is temporarily unavailable. Try again in a few minutes."
            r2.<init>(r3)     // Catch:{ JSONException -> 0x009a }
            r1.b(r2)     // Catch:{ JSONException -> 0x009a }
            goto L_0x00c3
        L_0x0067:
            monitor-enter(r6)     // Catch:{ JSONException -> 0x009a }
            java.util.Set<vb.c> r1 = r6.f7675a     // Catch:{ all -> 0x0097 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0097 }
            monitor-exit(r6)     // Catch:{ JSONException -> 0x009a }
            if (r1 == 0) goto L_0x0072
            goto L_0x00c3
        L_0x0072:
            java.lang.String r1 = "latestTemplateVersionNumber"
            boolean r1 = r2.has(r1)     // Catch:{ JSONException -> 0x009a }
            if (r1 == 0) goto L_0x00bc
            com.google.firebase.remoteconfig.internal.b r1 = r6.f7677c     // Catch:{ JSONException -> 0x009a }
            com.google.firebase.remoteconfig.internal.c r1 = r1.f7693g     // Catch:{ JSONException -> 0x009a }
            android.content.SharedPreferences r1 = r1.f7700a     // Catch:{ JSONException -> 0x009a }
            r3 = 0
            java.lang.String r5 = "last_template_version"
            long r3 = r1.getLong(r5, r3)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r1 = "latestTemplateVersionNumber"
            long r1 = r2.getLong(r1)     // Catch:{ JSONException -> 0x009a }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00bc
            r3 = 3
            r6.a(r3, r1)     // Catch:{ JSONException -> 0x009a }
            goto L_0x00bc
        L_0x0097:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ JSONException -> 0x009a }
            throw r1     // Catch:{ JSONException -> 0x009a }
        L_0x009a:
            r1 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r2 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r1 = r1.getCause()
            r2.<init>((java.lang.Throwable) r1)
            monitor-enter(r6)
            java.util.Set<vb.c> r1 = r6.f7675a     // Catch:{ all -> 0x00c0 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c0 }
        L_0x00ab:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00c0 }
            vb.c r3 = (vb.c) r3     // Catch:{ all -> 0x00c0 }
            r3.b(r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x00ab
        L_0x00bb:
            monitor-exit(r6)
        L_0x00bc:
            java.lang.String r1 = ""
            goto L_0x000e
        L_0x00c0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00c3:
            r0.close()
            r7.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.a.b(java.io.InputStream):void");
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f7676b;
        if (httpURLConnection != null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                b(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                this.f7676b.disconnect();
                throw th2;
            }
            this.f7676b.disconnect();
        }
    }
}
