package v3;

import a4.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import sk.j;
import t3.c;
import y3.l;

/* compiled from: NetworkStateTracker.kt */
public final class h extends f<c> {

    /* renamed from: f  reason: collision with root package name */
    public final ConnectivityManager f16025f;

    /* renamed from: g  reason: collision with root package name */
    public final a f16026g = new a(this);

    /* compiled from: NetworkStateTracker.kt */
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f16027a;

        public a(h hVar) {
            this.f16027a = hVar;
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.f(network, "network");
            j.f(networkCapabilities, "capabilities");
            o3.j a10 = o3.j.a();
            int i10 = i.f16028a;
            networkCapabilities.toString();
            a10.getClass();
            h hVar = this.f16027a;
            hVar.b(i.a(hVar.f16025f));
        }

        public final void onLost(Network network) {
            j.f(network, "network");
            o3.j a10 = o3.j.a();
            int i10 = i.f16028a;
            a10.getClass();
            h hVar = this.f16027a;
            hVar.b(i.a(hVar.f16025f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, b bVar) {
        super(context, bVar);
        j.f(bVar, "taskExecutor");
        Object systemService = this.f16020b.getSystemService("connectivity");
        j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f16025f = (ConnectivityManager) systemService;
    }

    public final Object a() {
        return i.a(this.f16025f);
    }

    public final void c() {
        try {
            o3.j a10 = o3.j.a();
            int i10 = i.f16028a;
            a10.getClass();
            l.a(this.f16025f, this.f16026g);
        } catch (IllegalArgumentException unused) {
            o3.j a11 = o3.j.a();
            int i11 = i.f16028a;
            a11.getClass();
        } catch (SecurityException unused2) {
            o3.j a12 = o3.j.a();
            int i12 = i.f16028a;
            a12.getClass();
        }
    }

    public final void d() {
        try {
            o3.j a10 = o3.j.a();
            int i10 = i.f16028a;
            a10.getClass();
            y3.j.c(this.f16025f, this.f16026g);
        } catch (IllegalArgumentException unused) {
            o3.j a11 = o3.j.a();
            int i11 = i.f16028a;
            a11.getClass();
        } catch (SecurityException unused2) {
            o3.j a12 = o3.j.a();
            int i12 = i.f16028a;
            a12.getClass();
        }
    }
}
