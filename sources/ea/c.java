package ea;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import android.view.View;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.r;
import androidx.fragment.app.l0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c0.d1;
import c0.u;
import ca.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.internal.x;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.vpa.daugia.module.menu.ui.fragment.MenuFragment;
import d6.b;
import e6.n;
import fb.b0;
import ia.e0;
import ia.m0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import mg.c3;
import mg.k3;
import n0.v;
import n0.x;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;
import p.a;
import s1.e;
import sk.j;
import v.c0;
import v.j1;
import v.k1;
import v.n0;
import w.t;
import w1.q;
import w1.w0;
import x1.d;
import z0.b;
import za.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements f, z.c, b.c, n0.a, d1.e, a, e.b, d, x.b, SuccessContinuation, OnFailureListener, a.C0251a, Continuation, OnSuccessListener, SwipeRefreshLayout.f, q, EventListener.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9329a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9330b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f9329a = i10;
        this.f9330b = obj;
    }

    public w0 a(View view, w0 w0Var, x.c cVar) {
        int i10;
        int i11;
        SearchView searchView = (SearchView) this.f9330b;
        boolean g2 = x.g(searchView.f6667n);
        if (g2) {
            i10 = cVar.f6514c;
        } else {
            i10 = cVar.f6512a;
        }
        if (g2) {
            i11 = cVar.f6512a;
        } else {
            i11 = cVar.f6514c;
        }
        searchView.f6667n.setPadding(w0Var.c() + i10, cVar.f6513b, w0Var.d() + i11, cVar.f6515d);
        return w0Var;
    }

    public Object apply(Object obj) {
        GZIPOutputStream gZIPOutputStream;
        InputStream inputStream;
        switch (this.f9329a) {
            case 9:
                q0.f fVar = q0.f.f14279f;
                fVar.f14284e = (u) obj;
                g0.d.a((Context) this.f9330b);
                fVar.getClass();
                return fVar;
            default:
                d6.b bVar = (d6.b) this.f9330b;
                b.a aVar = (b.a) obj;
                bVar.getClass();
                URL url = aVar.f8763a;
                if (Log.isLoggable(j6.a.b("CctTransportBackend"), 4)) {
                    String.format("Making request to: %s", new Object[]{url});
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f8763a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(bVar.f8762g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.9"}));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = aVar.f8765c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(outputStream);
                        bVar.f8756a.a(aVar.f8764b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Integer valueOf = Integer.valueOf(responseCode);
                        if (Log.isLoggable(j6.a.b("CctTransportBackend"), 4)) {
                            String.format("Status Code: %d", new Object[]{valueOf});
                        }
                        j6.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                        j6.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                        if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                            return new b.C0089b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                        }
                        if (responseCode != 200) {
                            return new b.C0089b(responseCode, (URL) null, 0);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            b.C0089b bVar2 = new b.C0089b(responseCode, (URL) null, n.a(new BufferedReader(new InputStreamReader(inputStream))).f9227a);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            return bVar2;
                        } catch (Throwable th2) {
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th4;
                    }
                } catch (ConnectException | UnknownHostException unused) {
                    Log.isLoggable(j6.a.b("CctTransportBackend"), 6);
                    return new b.C0089b(500, (URL) null, 0);
                } catch (EncodingException | IOException unused2) {
                    Log.isLoggable(j6.a.b("CctTransportBackend"), 6);
                    return new b.C0089b(400, (URL) null, 0);
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                break;
        }
        throw th;
        throw th;
    }

    public EventListener b(Call call) {
        EventListener eventListener = (EventListener) this.f9330b;
        byte[] bArr = Util.f22171a;
        j.f(eventListener, "$this_asFactory");
        j.f(call, "it");
        return eventListener;
    }

    public void c(d1.d dVar) {
        for (Map.Entry entry : ((Map) this.f9330b).entrySet()) {
            int c10 = dVar.c() - ((x.d) entry.getKey()).d();
            if (((x.d) entry.getKey()).c()) {
                c10 = -c10;
            }
            RectF rectF = g0.n.f10263a;
            ((n0.u) entry.getValue()).f(((c10 % 360) + 360) % 360, -1);
        }
    }

    public Object d(CameraCharacteristics.Key key) {
        return ((t) this.f9330b).a(key);
    }

    public String e(b.a aVar) {
        switch (this.f9329a) {
            case 1:
                c0.a aVar2 = (c0.a) this.f9330b;
                k1 k1Var = aVar2.f15613a.f15762h;
                if (!k1Var.f15725b) {
                    aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
                } else {
                    g.a aVar3 = new g.a();
                    aVar3.f1367c = k1Var.f15726c;
                    aVar3.f1370f = true;
                    androidx.camera.core.impl.q L = androidx.camera.core.impl.q.L();
                    L.O(u.a.K(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
                    aVar3.c(new u.a(r.K(L)));
                    aVar3.b(new j1(aVar));
                    k1Var.f15724a.r(Collections.singletonList(aVar3.d()));
                }
                aVar2.f15614b.f17758b = true;
                return "AePreCapture";
            case 2:
                ((c0.e) this.f9330b).f15631a = aVar;
                return "waitFor3AResult";
            case 4:
                b0.c cVar = (b0.c) this.f9330b;
                cVar.f3865d.execute(new v.f(4, cVar, aVar));
                return "addCaptureRequestOptions";
            case 5:
                ((e0.x) this.f9330b).f9064f = aVar;
                return "RequestCompleteFuture";
            case 6:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f9330b;
                synchronized (deferrableSurface.f1313a) {
                    deferrableSurface.f1318f = aVar;
                }
                return "DeferrableSurface-close(" + deferrableSurface + ")";
            case 7:
                ((v) this.f9330b).f13417r = aVar;
                return "SurfaceOutputImpl close future complete";
            default:
                ((androidx.camera.view.f) this.f9330b).f1518k.set(aVar);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    public void f(za.b bVar) {
        a aVar = (a) this.f9330b;
        aVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        p9.a aVar2 = (p9.a) bVar.get();
        z.j jVar = new z.j(aVar2, 12);
        b bVar2 = new b();
        p9.b h10 = aVar2.h("clx", bVar2);
        if (h10 == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            h10 = aVar2.h("crash", bVar2);
        }
        if (h10 != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            k4.d dVar = new k4.d(4);
            ga.c cVar = new ga.c(jVar, TimeUnit.MILLISECONDS);
            synchronized (aVar) {
                Iterator it = aVar.f9326c.iterator();
                while (it.hasNext()) {
                    dVar.c((ha.a) it.next());
                }
                bVar2.f9328b = dVar;
                bVar2.f9327a = cVar;
                aVar.f9325b = dVar;
                aVar.f9324a = cVar;
            }
        }
    }

    public w0 g(View view, w0 w0Var) {
        switch (this.f9329a) {
            case 26:
                wg.b bVar = (wg.b) this.f9330b;
                int i10 = wg.b.f23380q0;
                j.f(bVar, "this$0");
                j.f(view, "v");
                n1.e a10 = w0Var.a(7);
                j.e(a10, "getInsets(...)");
                ((c3) bVar.i0()).f21006y.setPadding(a10.f13427a, a10.f13428b, a10.f13429c, a10.f13430d);
                return w0Var;
            default:
                MenuFragment menuFragment = (MenuFragment) this.f9330b;
                int i11 = MenuFragment.f19755o0;
                j.f(menuFragment, "this$0");
                j.f(view, "v");
                n1.e a11 = w0Var.a(7);
                j.e(a11, "getInsets(...)");
                ((k3) menuFragment.i0()).E.setPadding(a11.f13427a, a11.f13428b, a11.f13429c, a11.f13430d);
                return w0Var;
        }
    }

    public void h(Canvas canvas) {
        c.super.dispatchDraw(canvas);
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0493 A[Catch:{ Exception -> 0x04b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0384  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object k(ca.s r41) {
        /*
            r40 = this;
            r1 = r40
            r0 = r41
            int r2 = r1.f9329a
            switch(r2) {
                case 0: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = r40
            goto L_0x04df
        L_0x000d:
            java.lang.Object r2 = r1.f9330b
            com.google.firebase.crashlytics.CrashlyticsRegistrar r2 = (com.google.firebase.crashlytics.CrashlyticsRegistrar) r2
            int r3 = com.google.firebase.crashlytics.CrashlyticsRegistrar.f7570a
            r2.getClass()
            java.lang.Class<m9.d> r2 = m9.d.class
            java.lang.Object r2 = r0.a(r2)
            m9.d r2 = (m9.d) r2
            java.lang.Class<fa.a> r3 = fa.a.class
            za.a r3 = r0.g(r3)
            java.lang.Class<p9.a> r4 = p9.a.class
            za.a r4 = r0.g(r4)
            java.lang.Class<ab.c> r5 = ab.c.class
            java.lang.Object r5 = r0.a(r5)
            ab.c r5 = (ab.c) r5
            java.lang.Class<xb.n> r6 = xb.n.class
            java.lang.Object r0 = r0.a(r6)
            xb.n r0 = (xb.n) r0
            r2.a()
            android.content.Context r13 = r2.f13218a
            java.lang.String r6 = r13.getPackageName()
            na.c r14 = new na.c
            r14.<init>(r13)
            ia.g0 r15 = new ia.g0
            r15.<init>(r2)
            ia.k0 r12 = new ia.k0
            r12.<init>(r13, r6, r5, r15)
            fa.c r6 = new fa.c
            r6.<init>(r3)
            ea.a r3 = new ea.a
            r3.<init>(r4)
            java.lang.String r4 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r11 = ia.j0.a(r4)
            ia.k r10 = new ia.k
            r10.<init>(r15, r14)
            r0.b(r10)
            ia.b0 r0 = new ia.b0
            c0.q0 r8 = new c0.q0
            r4 = 12
            r8.<init>(r3, r4)
            ca.a r9 = new ca.a
            r4 = 15
            r9.<init>(r3, r4)
            r3 = r0
            r4 = r2
            r5 = r12
            r7 = r15
            r16 = r10
            r10 = r14
            r21 = r12
            r12 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.a()
            m9.e r2 = r2.f13220c
            java.lang.String r2 = r2.f13232b
            java.lang.String r5 = ia.h.d(r13)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r3 = "array"
            java.lang.String r4 = "com.google.firebase.crashlytics.build_ids_lib"
            int r4 = ia.h.e(r13, r4, r3)
            java.lang.String r7 = "com.google.firebase.crashlytics.build_ids_arch"
            int r7 = ia.h.e(r13, r7, r3)
            java.lang.String r8 = "com.google.firebase.crashlytics.build_ids_build_id"
            int r3 = ia.h.e(r13, r8, r3)
            java.lang.String r12 = "FirebaseCrashlytics"
            if (r4 == 0) goto L_0x0114
            if (r7 == 0) goto L_0x0114
            if (r3 != 0) goto L_0x00b5
            goto L_0x0114
        L_0x00b5:
            android.content.res.Resources r11 = r13.getResources()
            java.lang.String[] r4 = r11.getStringArray(r4)
            android.content.res.Resources r11 = r13.getResources()
            java.lang.String[] r7 = r11.getStringArray(r7)
            android.content.res.Resources r11 = r13.getResources()
            java.lang.String[] r3 = r11.getStringArray(r3)
            int r11 = r4.length
            int r8 = r3.length
            if (r11 != r8) goto L_0x00ef
            int r8 = r7.length
            int r11 = r3.length
            if (r8 == r11) goto L_0x00d6
            goto L_0x00ef
        L_0x00d6:
            r8 = 0
        L_0x00d7:
            int r11 = r3.length
            if (r8 >= r11) goto L_0x00ed
            ia.f r11 = new ia.f
            r9 = r4[r8]
            r10 = r7[r8]
            r1 = r3[r8]
            r11.<init>(r9, r10, r1)
            r6.add(r11)
            int r8 = r8 + 1
            r1 = r40
            goto L_0x00d7
        L_0x00ed:
            r1 = 3
            goto L_0x0134
        L_0x00ef:
            r1 = 3
            java.lang.Object[] r8 = new java.lang.Object[r1]
            int r1 = r4.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r8[r4] = r1
            int r1 = r7.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r8[r4] = r1
            int r1 = r3.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            r8[r3] = r1
            java.lang.String r1 = "Lengths did not match: %d %d %d"
            java.lang.String.format(r1, r8)
            r1 = 3
            android.util.Log.isLoggable(r12, r1)
            goto L_0x0134
        L_0x0114:
            r1 = 3
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r8[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r7 = 1
            r8[r7] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r8[r4] = r3
            java.lang.String r3 = "Could not find resources: %d %d %d"
            java.lang.String.format(r3, r8)
            android.util.Log.isLoggable(r12, r1)
        L_0x0134:
            android.util.Log.isLoggable(r12, r1)
            java.util.Iterator r3 = r6.iterator()
        L_0x013b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0161
            java.lang.Object r4 = r3.next()
            ia.f r4 = (ia.f) r4
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = r4.f11289a
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = r4.f11290b
            r9 = 1
            r7[r9] = r8
            java.lang.String r4 = r4.f11291c
            r11 = 2
            r7[r11] = r4
            java.lang.String r4 = "Build id for %s on %s: %s"
            java.lang.String.format(r4, r7)
            android.util.Log.isLoggable(r12, r1)
            goto L_0x013b
        L_0x0161:
            r9 = 1
            r11 = 2
            fa.d r10 = new fa.d
            r10.<init>(r13)
            r8 = 0
            java.lang.String r7 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x04dc }
            java.lang.String r16 = r21.c()     // Catch:{ NameNotFoundException -> 0x04dc }
            android.content.pm.PackageManager r3 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x04dc }
            r4 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x04dc }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x04dc }
            r4 = 28
            if (r1 < r4) goto L_0x0189
            long r19 = r3.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x04dc }
            java.lang.String r1 = java.lang.Long.toString(r19)     // Catch:{ NameNotFoundException -> 0x04dc }
            goto L_0x018f
        L_0x0189:
            int r1 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x04dc }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ NameNotFoundException -> 0x04dc }
        L_0x018f:
            r24 = r1
            java.lang.String r1 = r3.versionName     // Catch:{ NameNotFoundException -> 0x04dc }
            if (r1 != 0) goto L_0x0197
            java.lang.String r1 = "0.0"
        L_0x0197:
            r23 = r1
            ia.a r1 = new ia.a     // Catch:{ NameNotFoundException -> 0x04dc }
            r3 = r1
            r17 = 0
            r4 = r2
            r19 = r7
            r7 = r16
            r41 = r1
            r1 = r9
            r9 = r8
            r8 = r19
            r39 = r9
            r9 = r24
            r16 = r10
            r10 = r23
            r1 = r11
            r11 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NameNotFoundException -> 0x04d9 }
            android.util.Log.isLoggable(r12, r1)
            java.lang.String r3 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r3 = ia.j0.a(r3)
            a.a r4 = new a.a
            r4.<init>()
            java.lang.String r5 = r21.c()
            a.a r9 = new a.a
            r9.<init>()
            z.j r10 = new z.j
            r6 = 13
            r10.<init>(r9, r6)
            k4.d r11 = new k4.d
            r11.<init>((na.c) r14)
            java.util.Locale r6 = java.util.Locale.US
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r14 = 0
            r8[r14] = r2
            java.lang.String r7 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r7 = java.lang.String.format(r6, r7, r8)
            pa.b r8 = new pa.b
            r8.<init>(r7, r4)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r7 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ia.k0.f11325h
            java.lang.String r14 = ""
            java.lang.String r7 = r7.replaceAll(r1, r14)
            r14 = 0
            r4[r14] = r7
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r14 = ""
            java.lang.String r7 = r7.replaceAll(r1, r14)
            r14 = 1
            r4[r14] = r7
            java.lang.String r7 = "%s/%s"
            java.lang.String r18 = java.lang.String.format(r6, r7, r4)
            java.lang.String r4 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r6 = ""
            java.lang.String r19 = r4.replaceAll(r1, r6)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r6 = ""
            java.lang.String r20 = r4.replaceAll(r1, r6)
            r1 = 4
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r6 = ia.h.d(r13)
            r7 = 0
            r4[r7] = r6
            r6 = 1
            r4[r6] = r2
            r6 = 2
            r4[r6] = r23
            r14 = 3
            r4[r14] = r24
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L_0x0236:
            java.lang.String r14 = ""
            if (r7 >= r1) goto L_0x0255
            r1 = r4[r7]
            r17 = r4
            if (r1 == 0) goto L_0x024f
            java.lang.String r4 = "-"
            java.lang.String r1 = r1.replace(r4, r14)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r4)
            r6.add(r1)
        L_0x024f:
            int r7 = r7 + 1
            r4 = r17
            r1 = 4
            goto L_0x0236
        L_0x0255:
            java.util.Collections.sort(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r4 = r6.iterator()
        L_0x0261:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0271
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            r1.append(r6)
            goto L_0x0261
        L_0x0271:
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x0296
            java.lang.String r4 = "SHA-1"
            byte[] r1 = r1.getBytes()
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0291 }
            r4.update(r1)
            byte[] r1 = r4.digest()
            java.lang.String r1 = ia.h.f(r1)
            goto L_0x0293
        L_0x0291:
            java.lang.String r1 = ""
        L_0x0293:
            r22 = r1
            goto L_0x0298
        L_0x0296:
            r22 = r39
        L_0x0298:
            if (r5 == 0) goto L_0x029d
            r16 = 4
            goto L_0x029f
        L_0x029d:
            r16 = 1
        L_0x029f:
            int r25 = f0.b0.l(r16)
            pa.h r1 = new pa.h
            r16 = r1
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            pa.e r2 = new pa.e
            r6 = r2
            r7 = r13
            r4 = r8
            r8 = r1
            r1 = r12
            r12 = r4
            r13 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            android.content.Context r4 = r2.f14122a
            java.lang.String r5 = "com.google.firebase.crashlytics"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)
            java.lang.String r5 = "existing_instance_identifier"
            java.lang.String r4 = r4.getString(r5, r14)
            pa.h r5 = r2.f14123b
            java.lang.String r5 = r5.f14136f
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 != 0) goto L_0x02ee
            pa.c r4 = r2.a(r5)
            if (r4 == 0) goto L_0x02ee
            java.util.concurrent.atomic.AtomicReference<pa.c> r5 = r2.f14129h
            r5.set(r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<pa.c>> r5 = r2.f14130i
            java.lang.Object r5 = r5.get()
            com.google.android.gms.tasks.TaskCompletionSource r5 = (com.google.android.gms.tasks.TaskCompletionSource) r5
            r5.trySetResult(r4)
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forResult(r39)
            goto L_0x0337
        L_0x02ee:
            r4 = 3
            pa.c r5 = r2.a(r4)
            if (r5 == 0) goto L_0x0305
            java.util.concurrent.atomic.AtomicReference<pa.c> r4 = r2.f14129h
            r4.set(r5)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<pa.c>> r4 = r2.f14130i
            java.lang.Object r4 = r4.get()
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4
            r4.trySetResult(r5)
        L_0x0305:
            ia.g0 r4 = r2.f14128g
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r5 = r4.f11304f
            com.google.android.gms.tasks.Task r5 = r5.getTask()
            java.lang.Object r6 = r4.f11300b
            monitor-enter(r6)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r4 = r4.f11301c     // Catch:{ all -> 0x04d6 }
            com.google.android.gms.tasks.Task r4 = r4.getTask()     // Catch:{ all -> 0x04d6 }
            monitor-exit(r6)     // Catch:{ all -> 0x04d6 }
            java.util.concurrent.ExecutorService r6 = ia.o0.f11348a
            com.google.android.gms.tasks.TaskCompletionSource r6 = new com.google.android.gms.tasks.TaskCompletionSource
            r6.<init>()
            ia.n0 r7 = new ia.n0
            r8 = 0
            r7.<init>(r8, r6)
            r5.continueWith(r3, r7)
            r4.continueWith(r3, r7)
            com.google.android.gms.tasks.Task r4 = r6.getTask()
            pa.d r5 = new pa.d
            r5.<init>(r2)
            com.google.android.gms.tasks.Task r4 = r4.onSuccessTask(r3, r5)
        L_0x0337:
            al.g0 r5 = new al.g0
            r5.<init>()
            r4.continueWith(r3, r5)
            android.content.Context r4 = r0.f11261a
            if (r4 == 0) goto L_0x036d
            android.content.res.Resources r5 = r4.getResources()
            if (r5 == 0) goto L_0x036d
            java.lang.String r6 = "com.crashlytics.RequireBuildId"
            java.lang.String r7 = "bool"
            int r7 = ia.h.e(r4, r6, r7)
            if (r7 <= 0) goto L_0x0359
            boolean r4 = r5.getBoolean(r7)
        L_0x0357:
            r8 = r4
            goto L_0x036a
        L_0x0359:
            java.lang.String r5 = "string"
            int r5 = ia.h.e(r4, r6, r5)
            if (r5 <= 0) goto L_0x036d
            java.lang.String r4 = r4.getString(r5)
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            goto L_0x0357
        L_0x036a:
            r4 = r41
            goto L_0x0370
        L_0x036d:
            r4 = r41
            r8 = 1
        L_0x0370:
            java.lang.String r5 = r4.f11249b
            if (r8 != 0) goto L_0x0379
            r6 = 2
            android.util.Log.isLoggable(r1, r6)
            goto L_0x037f
        L_0x0379:
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0381
        L_0x037f:
            r9 = 1
            goto L_0x0382
        L_0x0381:
            r9 = 0
        L_0x0382:
            if (r9 == 0) goto L_0x04ce
            ia.g r5 = new ia.g
            ia.k0 r6 = r0.f11268h
            r5.<init>(r6)
            java.lang.String r5 = ia.g.f11298b
            vl.d r6 = new vl.d     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r7 = "crash_marker"
            na.c r8 = r0.f11269i     // Catch:{ Exception -> 0x04b7 }
            r9 = 7
            r6.<init>(r9, r7, r8)     // Catch:{ Exception -> 0x04b7 }
            r0.f11266f = r6     // Catch:{ Exception -> 0x04b7 }
            vl.d r6 = new vl.d     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r7 = "initialization_marker"
            r6.<init>(r9, r7, r8)     // Catch:{ Exception -> 0x04b7 }
            r0.f11265e = r6     // Catch:{ Exception -> 0x04b7 }
            ja.h r6 = new ja.h     // Catch:{ Exception -> 0x04b7 }
            ia.l r7 = r0.f11273m     // Catch:{ Exception -> 0x04b7 }
            r6.<init>(r5, r8, r7)     // Catch:{ Exception -> 0x04b7 }
            ja.c r7 = new ja.c     // Catch:{ Exception -> 0x04b7 }
            na.c r8 = r0.f11269i     // Catch:{ Exception -> 0x04b7 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x04b7 }
            qa.a r8 = new qa.a     // Catch:{ Exception -> 0x04b7 }
            r9 = 1
            qa.b[] r10 = new qa.b[r9]     // Catch:{ Exception -> 0x04b7 }
            al.g0 r11 = new al.g0     // Catch:{ Exception -> 0x04b7 }
            r11.<init>()     // Catch:{ Exception -> 0x04b7 }
            r12 = 0
            r10[r12] = r11     // Catch:{ Exception -> 0x04b7 }
            r8.<init>(r10)     // Catch:{ Exception -> 0x04b7 }
            android.content.Context r10 = r0.f11261a     // Catch:{ Exception -> 0x04b7 }
            ia.k0 r11 = r0.f11268h     // Catch:{ Exception -> 0x04b7 }
            na.c r13 = r0.f11269i     // Catch:{ Exception -> 0x04b7 }
            vl.d r14 = r0.f11263c     // Catch:{ Exception -> 0x04b7 }
            ia.k r15 = r0.f11274n     // Catch:{ Exception -> 0x04b7 }
            r25 = r10
            r26 = r11
            r27 = r13
            r28 = r4
            r29 = r7
            r30 = r6
            r31 = r8
            r32 = r2
            r33 = r14
            r34 = r15
            ia.m0 r35 = ia.m0.b(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x04b7 }
            ia.t r8 = new ia.t     // Catch:{ Exception -> 0x04b7 }
            android.content.Context r10 = r0.f11261a     // Catch:{ Exception -> 0x04b7 }
            ia.l r11 = r0.f11273m     // Catch:{ Exception -> 0x04b7 }
            ia.k0 r13 = r0.f11268h     // Catch:{ Exception -> 0x04b7 }
            ia.g0 r14 = r0.f11262b     // Catch:{ Exception -> 0x04b7 }
            na.c r15 = r0.f11269i     // Catch:{ Exception -> 0x04b7 }
            vl.d r9 = r0.f11266f     // Catch:{ Exception -> 0x04b7 }
            fa.a r12 = r0.f11275o     // Catch:{ Exception -> 0x04b7 }
            r41 = r3
            ga.a r3 = r0.f11271k     // Catch:{ Exception -> 0x04b9 }
            r17 = r1
            ia.k r1 = r0.f11274n     // Catch:{ Exception -> 0x04b9 }
            r25 = r8
            r26 = r10
            r27 = r11
            r28 = r13
            r29 = r14
            r30 = r15
            r31 = r9
            r32 = r4
            r33 = r6
            r34 = r7
            r36 = r12
            r37 = r3
            r38 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ Exception -> 0x04b9 }
            r0.f11267g = r8     // Catch:{ Exception -> 0x04b9 }
            vl.d r1 = r0.f11265e     // Catch:{ Exception -> 0x04b9 }
            java.lang.Object r3 = r1.f23363c     // Catch:{ Exception -> 0x04b9 }
            na.c r3 = (na.c) r3     // Catch:{ Exception -> 0x04b9 }
            java.lang.Object r1 = r1.f23362b     // Catch:{ Exception -> 0x04b9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04b9 }
            r3.getClass()     // Catch:{ Exception -> 0x04b9 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x04b9 }
            java.io.File r3 = r3.f13552b     // Catch:{ Exception -> 0x04b9 }
            r4.<init>(r3, r1)     // Catch:{ Exception -> 0x04b9 }
            boolean r1 = r4.exists()     // Catch:{ Exception -> 0x04b9 }
            ia.l r3 = r0.f11273m     // Catch:{ Exception -> 0x04b9 }
            ia.c0 r4 = new ia.c0     // Catch:{ Exception -> 0x04b9 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x04b9 }
            com.google.android.gms.tasks.Task r3 = r3.a(r4)     // Catch:{ Exception -> 0x04b9 }
            java.lang.Object r3 = ia.o0.a(r3)     // Catch:{ Exception -> 0x0447 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0447 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x04b9 }
            r4.equals(r3)     // Catch:{ Exception -> 0x04b9 }
        L_0x0447:
            ia.t r3 = r0.f11267g     // Catch:{ Exception -> 0x04b9 }
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x04b9 }
            ia.l r6 = r3.f11367e     // Catch:{ Exception -> 0x04b9 }
            ia.w r7 = new ia.w     // Catch:{ Exception -> 0x04b9 }
            r7.<init>(r3, r5)     // Catch:{ Exception -> 0x04b9 }
            r6.a(r7)     // Catch:{ Exception -> 0x04b9 }
            ia.o r5 = new ia.o     // Catch:{ Exception -> 0x04b9 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x04b9 }
            ia.f0 r6 = new ia.f0     // Catch:{ Exception -> 0x04b9 }
            fa.a r7 = r3.f11372j     // Catch:{ Exception -> 0x04b9 }
            r6.<init>(r5, r2, r4, r7)     // Catch:{ Exception -> 0x04b9 }
            r3.f11376n = r6     // Catch:{ Exception -> 0x04b9 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch:{ Exception -> 0x04b9 }
            if (r1 == 0) goto L_0x04af
            android.content.Context r1 = r0.f11261a     // Catch:{ Exception -> 0x04b9 }
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            int r3 = r1.checkCallingOrSelfPermission(r3)     // Catch:{ Exception -> 0x04b9 }
            if (r3 != 0) goto L_0x0476
            r9 = 1
            goto L_0x0477
        L_0x0476:
            r9 = 0
        L_0x0477:
            if (r9 == 0) goto L_0x0490
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x04b9 }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ Exception -> 0x04b9 }
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x04b9 }
            if (r1 == 0) goto L_0x048e
            boolean r1 = r1.isConnectedOrConnecting()     // Catch:{ Exception -> 0x04b9 }
            if (r1 == 0) goto L_0x048e
            goto L_0x0490
        L_0x048e:
            r9 = 0
            goto L_0x0491
        L_0x0490:
            r9 = 1
        L_0x0491:
            if (r9 == 0) goto L_0x04af
            r1 = r17
            r3 = 3
            android.util.Log.isLoggable(r1, r3)     // Catch:{ Exception -> 0x04b9 }
            ia.a0 r4 = new ia.a0     // Catch:{ Exception -> 0x04b9 }
            r4.<init>(r0, r2)     // Catch:{ Exception -> 0x04b9 }
            java.util.concurrent.ExecutorService r5 = r0.f11272l     // Catch:{ Exception -> 0x04b9 }
            java.util.concurrent.Future r4 = r5.submit(r4)     // Catch:{ Exception -> 0x04b9 }
            android.util.Log.isLoggable(r1, r3)     // Catch:{ Exception -> 0x04b9 }
            r5 = 3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x04bd }
            r4.get(r5, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x04bd }
            goto L_0x04bd
        L_0x04af:
            r1 = r17
            r3 = 3
            android.util.Log.isLoggable(r1, r3)
            r9 = 1
            goto L_0x04be
        L_0x04b7:
            r41 = r3
        L_0x04b9:
            r1 = r39
            r0.f11267g = r1
        L_0x04bd:
            r9 = 0
        L_0x04be:
            ea.d r1 = new ea.d
            r1.<init>(r9, r0, r2)
            r2 = r41
            com.google.android.gms.tasks.Tasks.call(r2, r1)
            ea.e r8 = new ea.e
            r8.<init>(r0)
            goto L_0x04de
        L_0x04ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"
            r0.<init>(r1)
            throw r0
        L_0x04d6:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x04d6 }
            throw r0
        L_0x04d9:
            r1 = r39
            goto L_0x04dd
        L_0x04dc:
            r1 = r8
        L_0x04dd:
            r8 = r1
        L_0x04de:
            return r8
        L_0x04df:
            java.lang.Object r2 = r1.f9330b
            ca.r r2 = (ca.r) r2
            hb.b r0 = com.google.firebase.perf.FirebasePerfRegistrar.lambda$getComponents$0(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.c.k(ca.s):java.lang.Object");
    }

    public void onCancel() {
        l0.b bVar = (l0.b) this.f9330b;
        j.f(bVar, "this$0");
        bVar.a();
    }

    public void onFailure(Exception exc) {
        switch (this.f9329a) {
            case 23:
                ((RemoteConfigManager) this.f9330b).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
                return;
            default:
                mj.d dVar = (mj.d) this.f9330b;
                j.f(dVar, "this$0");
                j.f(exc, "it");
                dVar.f21555f = true;
                dVar.f21556g = System.currentTimeMillis();
                dVar.f21552c.invoke(exc);
                return;
        }
    }

    public void onSuccess(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        b0 b0Var = (b0) obj;
        com.google.firebase.messaging.a aVar = FirebaseMessaging.f7583m;
        FirebaseMessaging.a aVar2 = ((FirebaseMessaging) this.f9330b).f7592g;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.f7599c;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = FirebaseMessaging.this.f7586a.j();
            }
        }
        if (z10) {
            if (b0Var.f10111h.a() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                synchronized (b0Var) {
                    z12 = b0Var.f10110g;
                }
                if (!z12) {
                    b0Var.f(0);
                }
            }
        }
    }

    public void onTouchExplorationStateChanged(boolean z10) {
        int i10 = SearchBar.f6643t0;
        ((SearchBar) this.f9330b).setFocusableInTouchMode(z10);
    }

    public Task then(Object obj) {
        vb.e eVar = (vb.e) this.f9330b;
        Void voidR = (Void) obj;
        Task<wb.d> b10 = eVar.f16145d.b();
        Task<wb.d> b11 = eVar.f16146e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{b10, b11}).continueWithTask(eVar.f16144c, new n0.f(4, eVar, b10, b11));
    }

    public Object then(Task task) {
        boolean z10;
        ((m0) this.f9330b).getClass();
        if (task.isSuccessful()) {
            e0 e0Var = (e0) task.getResult();
            e0Var.c();
            Log.isLoggable("FirebaseCrashlytics", 3);
            File b10 = e0Var.b();
            if (b10.delete()) {
                b10.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
            } else {
                b10.getPath();
            }
            z10 = true;
        } else {
            task.getException();
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
