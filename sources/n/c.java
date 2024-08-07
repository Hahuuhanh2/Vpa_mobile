package n;

import android.os.Looper;
import androidx.fragment.app.o;

/* compiled from: ArchTaskExecutor */
public final class c extends o {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f13296c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f13297d = new b(0);

    /* renamed from: b  reason: collision with root package name */
    public d f13298b = new d();

    public static c J() {
        if (f13296c != null) {
            return f13296c;
        }
        synchronized (c.class) {
            if (f13296c == null) {
                f13296c = new c();
            }
        }
        return f13296c;
    }

    public final void K(Runnable runnable) {
        d dVar = this.f13298b;
        if (dVar.f13301d == null) {
            synchronized (dVar.f13299b) {
                if (dVar.f13301d == null) {
                    dVar.f13301d = d.J(Looper.getMainLooper());
                }
            }
        }
        dVar.f13301d.post(runnable);
    }
}
