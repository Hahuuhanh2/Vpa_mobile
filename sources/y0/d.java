package y0;

import ek.i;
import rk.l;

/* compiled from: Snapshot.kt */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public f f17360a = f.f17367e;

    /* renamed from: b  reason: collision with root package name */
    public int f17361b;

    public d(int i10) {
        this.f17361b = i10;
        if (i10 != 0) {
            synchronized (g.f17379b) {
                g.f17382e.a(i10);
            }
        }
    }

    public abstract l<Object, i> a();
}
