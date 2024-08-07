package dj;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import zi.a;

/* compiled from: RetainedLifecycleImpl */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f19950a = new HashSet();

    public final void a() {
        boolean z10;
        if (j7.a.f11702c == null) {
            j7.a.f11702c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == j7.a.f11702c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Iterator it = this.f19950a.iterator();
            while (it.hasNext()) {
                ((gj.a) it.next()).a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
