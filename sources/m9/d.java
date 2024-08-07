package m9;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import ca.e;
import ca.k;
import ca.o;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import da.l;
import h7.h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import v0.g;
import w6.b;
import y6.i;
import y6.j;

/* compiled from: FirebaseApp */
public final class d {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f13216k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final v0.b f13217l = new v0.b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f13218a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13219b;

    /* renamed from: c  reason: collision with root package name */
    public final e f13220c;

    /* renamed from: d  reason: collision with root package name */
    public final k f13221d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f13222e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f13223f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final o<eb.a> f13224g;

    /* renamed from: h  reason: collision with root package name */
    public final za.b<xa.b> f13225h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f13226i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList f13227j;

    /* compiled from: FirebaseApp */
    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    /* compiled from: FirebaseApp */
    public static class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicReference<b> f13228a = new AtomicReference<>();

        public final void a(boolean z10) {
            synchronized (d.f13216k) {
                Iterator it = new ArrayList(d.f13217l.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f13222e.get()) {
                        Iterator it2 = dVar.f13226i.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).a(z10);
                        }
                    }
                }
            }
        }
    }

    @TargetApi(24)
    /* compiled from: FirebaseApp */
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference<c> f13229b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f13230a;

        public c(Context context) {
            this.f13230a = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (d.f13216k) {
                Iterator it = ((g.e) d.f13217l.values()).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).g();
                }
            }
            this.f13230a.unregisterReceiver(this);
        }
    }

    public d(Context context, e eVar, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f13222e = atomicBoolean;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f13226i = copyOnWriteArrayList;
        this.f13227j = new CopyOnWriteArrayList();
        this.f13218a = context;
        j.c(str);
        this.f13219b = str;
        this.f13220c = eVar;
        a aVar = FirebaseInitProvider.f7664a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList a10 = new e(context, new e.a(ComponentDiscoveryService.class)).a();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f8863a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(a10);
        arrayList.add(new ca.j(new FirebaseCommonRegistrar(), 0));
        arrayList.add(new ca.j(new ExecutorsRegistrar(), 0));
        arrayList2.add(ca.b.c(context, Context.class, new Class[0]));
        arrayList2.add(ca.b.c(this, d.class, new Class[0]));
        arrayList2.add(ca.b.c(eVar, e.class, new Class[0]));
        ac.a aVar2 = new ac.a();
        if (s1.o.a(context) && FirebaseInitProvider.f7665b.get()) {
            arrayList2.add(ca.b.c(aVar, f.class, new Class[0]));
        }
        k kVar = new k(lVar, arrayList, arrayList2, aVar2);
        this.f13221d = kVar;
        Trace.endSection();
        this.f13224g = new o<>(new v9.j(this, context));
        this.f13225h = kVar.c(xa.b.class);
        c cVar = new c(this);
        a();
        if (atomicBoolean.get() && w6.b.f16541e.f16542a.get()) {
            cVar.a(true);
        }
        copyOnWriteArrayList.add(cVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f13216k) {
            Iterator it = ((g.e) f13217l.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a();
                arrayList.add(dVar.f13219b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d d() {
        d dVar;
        synchronized (f13216k) {
            dVar = (d) f13217l.getOrDefault("[DEFAULT]", null);
            if (dVar != null) {
                dVar.f13225h.get().c();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + h.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    public static d e(String str) {
        d dVar;
        String str2;
        synchronized (f13216k) {
            dVar = (d) f13217l.getOrDefault(str.trim(), null);
            if (dVar != null) {
                dVar.f13225h.get().c();
            } else {
                ArrayList c10 = c();
                if (c10.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", c10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return dVar;
    }

    public static d h(Context context, e eVar) {
        d dVar;
        boolean z10;
        AtomicReference<b> atomicReference = b.f13228a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (b.f13228a.get() == null) {
                b bVar = new b();
                AtomicReference<b> atomicReference2 = b.f13228a;
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, bVar)) {
                        if (atomicReference2.get() != null) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    w6.b.b(application);
                    w6.b.f16541e.a(bVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f13216k) {
            v0.b bVar2 = f13217l;
            j.h("FirebaseApp name [DEFAULT] already exists!", true ^ bVar2.containsKey("[DEFAULT]"));
            j.g(context, "Application context cannot be null.");
            dVar = new d(context, eVar, "[DEFAULT]");
            bVar2.put("[DEFAULT]", dVar);
        }
        dVar.g();
        return dVar;
    }

    public static void i(Context context) {
        synchronized (f13216k) {
            if (f13217l.containsKey("[DEFAULT]")) {
                d();
                return;
            }
            e a10 = e.a(context);
            if (a10 != null) {
                h(context, a10);
            }
        }
    }

    public final void a() {
        j.h("FirebaseApp was deleted", !this.f13223f.get());
    }

    public final <T> T b(Class<T> cls) {
        a();
        return this.f13221d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        String str = this.f13219b;
        d dVar = (d) obj;
        dVar.a();
        return str.equals(dVar.f13219b);
    }

    public final String f() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f13219b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb2.append(str);
        sb2.append("+");
        a();
        byte[] bytes2 = this.f13220c.f13232b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void g() {
        boolean z10 = true;
        if (!s1.o.a(this.f13218a)) {
            a();
            Context context = this.f13218a;
            if (c.f13229b.get() == null) {
                c cVar = new c(context);
                AtomicReference<c> atomicReference = c.f13229b;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, cVar)) {
                        if (atomicReference.get() != null) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        a();
        k kVar = this.f13221d;
        a();
        kVar.h("[DEFAULT]".equals(this.f13219b));
        this.f13225h.get().c();
    }

    public final int hashCode() {
        return this.f13219b.hashCode();
    }

    public final boolean j() {
        boolean z10;
        a();
        eb.a aVar = this.f13224g.get();
        synchronized (aVar) {
            z10 = aVar.f9336b;
        }
        return z10;
    }

    public final String toString() {
        i.a aVar = new i.a(this);
        aVar.a(this.f13219b, "name");
        aVar.a(this.f13220c, "options");
        return aVar.toString();
    }
}
