package f3;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.R$string;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: AppInitializer */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f9901d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f9902e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f9903a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f9904b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f9905c;

    public a(Context context) {
        this.f9905c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f9901d == null) {
            synchronized (f9902e) {
                if (f9901d == null) {
                    f9901d = new a(context);
                }
            }
        }
        return f9901d;
    }

    public final void a(Bundle bundle) {
        String string = this.f9905c.getString(R$string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f9904b.add(cls);
                        }
                    }
                }
                Iterator it = this.f9904b.iterator();
                while (it.hasNext()) {
                    b((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (h3.a.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!this.f9903a.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class next : a10) {
                        if (!this.f9903a.containsKey(next)) {
                            b(next, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f9905c);
                hashSet.remove(cls);
                this.f9903a.put(cls, obj);
            } else {
                obj = this.f9903a.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
