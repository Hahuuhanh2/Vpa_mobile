package h5;

import android.content.Context;
import com.bumptech.glide.l;
import h5.b;

/* compiled from: DefaultConnectivityMonitor */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10564a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f10565b;

    public d(Context context, l.b bVar) {
        this.f10564a = context.getApplicationContext();
        this.f10565b = bVar;
    }

    public final void a() {
    }

    public final void b() {
        n a10 = n.a(this.f10564a);
        b.a aVar = this.f10565b;
        synchronized (a10) {
            a10.f10581b.add(aVar);
            if (!a10.f10582c) {
                if (!a10.f10581b.isEmpty()) {
                    a10.f10582c = a10.f10580a.a();
                }
            }
        }
    }

    public final void f() {
        n a10 = n.a(this.f10564a);
        b.a aVar = this.f10565b;
        synchronized (a10) {
            a10.f10581b.remove(aVar);
            if (a10.f10582c) {
                if (a10.f10581b.isEmpty()) {
                    a10.f10580a.b();
                    a10.f10582c = false;
                }
            }
        }
    }
}
