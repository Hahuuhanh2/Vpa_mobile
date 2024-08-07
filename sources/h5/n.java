package h5;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import h5.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o5.f;
import o5.g;
import o5.l;

/* compiled from: SingletonConnectivityReceiver */
public final class n {

    /* renamed from: d  reason: collision with root package name */
    public static volatile n f10579d;

    /* renamed from: a  reason: collision with root package name */
    public final c f10580a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f10581b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public boolean f10582c;

    /* compiled from: SingletonConnectivityReceiver */
    public class a implements g<ConnectivityManager> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10583a;

        public a(Context context) {
            this.f10583a = context;
        }

        public final Object get() {
            return (ConnectivityManager) this.f10583a.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver */
    public class b implements b.a {
        public b() {
        }

        public final void a(boolean z10) {
            ArrayList arrayList;
            synchronized (n.this) {
                arrayList = new ArrayList(n.this.f10581b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver */
    public interface c {
        boolean a();

        void b();
    }

    /* compiled from: SingletonConnectivityReceiver */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10585a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f10586b;

        /* renamed from: c  reason: collision with root package name */
        public final g<ConnectivityManager> f10587c;

        /* renamed from: d  reason: collision with root package name */
        public final a f10588d = new a();

        /* compiled from: SingletonConnectivityReceiver */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            public final void onAvailable(Network network) {
                l.f().post(new o(this, true));
            }

            public final void onLost(Network network) {
                l.f().post(new o(this, false));
            }
        }

        public d(f fVar, b bVar) {
            this.f10587c = fVar;
            this.f10586b = bVar;
        }

        @SuppressLint({"MissingPermission"})
        public final boolean a() {
            boolean z10;
            if (this.f10587c.get().getActiveNetwork() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10585a = z10;
            try {
                this.f10587c.get().registerDefaultNetworkCallback(this.f10588d);
                return true;
            } catch (RuntimeException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
                return false;
            }
        }

        public final void b() {
            this.f10587c.get().unregisterNetworkCallback(this.f10588d);
        }
    }

    /* compiled from: SingletonConnectivityReceiver */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Context f10590a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f10591b;

        /* renamed from: c  reason: collision with root package name */
        public final g<ConnectivityManager> f10592c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10593d;

        /* renamed from: e  reason: collision with root package name */
        public final a f10594e = new a();

        /* compiled from: SingletonConnectivityReceiver */
        public class a extends BroadcastReceiver {
            public a() {
            }

            public final void onReceive(Context context, Intent intent) {
                e eVar = e.this;
                boolean z10 = eVar.f10593d;
                eVar.f10593d = eVar.c();
                if (z10 != e.this.f10593d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        boolean z11 = e.this.f10593d;
                    }
                    e eVar2 = e.this;
                    eVar2.f10591b.a(eVar2.f10593d);
                }
            }
        }

        public e(Context context, f fVar, b bVar) {
            this.f10590a = context.getApplicationContext();
            this.f10592c = fVar;
            this.f10591b = bVar;
        }

        public final boolean a() {
            this.f10593d = c();
            try {
                this.f10590a.registerReceiver(this.f10594e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
                return false;
            }
        }

        public final void b() {
            this.f10590a.unregisterReceiver(this.f10594e);
        }

        @SuppressLint({"MissingPermission"})
        public final boolean c() {
            try {
                NetworkInfo activeNetworkInfo = this.f10592c.get().getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } catch (RuntimeException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
                return true;
            }
        }
    }

    public n(Context context) {
        c cVar;
        f fVar = new f(new a(context));
        b bVar = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new d(fVar, bVar);
        } else {
            cVar = new e(context, fVar, bVar);
        }
        this.f10580a = cVar;
    }

    public static n a(Context context) {
        if (f10579d == null) {
            synchronized (n.class) {
                if (f10579d == null) {
                    f10579d = new n(context.getApplicationContext());
                }
            }
        }
        return f10579d;
    }
}
