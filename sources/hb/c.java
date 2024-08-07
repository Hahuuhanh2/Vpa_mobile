package hb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import c6.g;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import d.i;
import j$.util.concurrent.ConcurrentHashMap;
import lb.a;
import m9.d;
import sb.j;
import vb.h;
import za.b;

/* compiled from: FirebasePerformance */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10698e = a.d();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f10699a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b<h> f10700b;

    /* renamed from: c  reason: collision with root package name */
    public final ab.c f10701c;

    /* renamed from: d  reason: collision with root package name */
    public final b<g> f10702d;

    public c(d dVar, b<h> bVar, ab.c cVar, b<g> bVar2, RemoteConfigManager remoteConfigManager, jb.a aVar, SessionManager sessionManager) {
        Bundle bundle;
        sb.d dVar2;
        boolean z10;
        this.f10700b = bVar;
        this.f10701c = cVar;
        this.f10702d = bVar2;
        if (dVar == null) {
            new sb.d(new Bundle());
            return;
        }
        rb.d dVar3 = rb.d.f14546z;
        dVar3.f14550d = dVar;
        dVar.a();
        dVar3.f14562w = dVar.f13220c.f13237g;
        dVar3.f14552f = cVar;
        dVar3.f14553n = bVar2;
        dVar3.f14555p.execute(new i(dVar3, 23));
        dVar.a();
        Context context = dVar.f13218a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            e10.getMessage();
            bundle = null;
        }
        if (bundle == null) {
            dVar2 = new sb.d();
        }
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        aVar.f11840b = dVar2;
        jb.a.f11837d.f12901b = j.a(context);
        aVar.f11841c.b(context);
        sessionManager.setApplicationContext(context);
        Boolean g2 = aVar.g();
        a aVar2 = f10698e;
        if (aVar2.f12901b) {
            if (g2 != null) {
                z10 = g2.booleanValue();
            } else {
                z10 = d.d().j();
            }
            if (z10) {
                dVar.a();
                String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{String.format("%s/trends?utm_source=%s&utm_medium=%s", new Object[]{m9.b.D(dVar.f13220c.f13237g, context.getPackageName()), "perf-android-sdk", "android-ide"})});
                if (aVar2.f12901b) {
                    aVar2.f12900a.getClass();
                }
            }
        }
    }
}
