package ib;

import ib.a;
import java.lang.ref.WeakReference;
import tb.d;

/* compiled from: AppStateUpdateHandler */
public abstract class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final a f11415a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<a.b> f11416b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11417c = false;

    /* renamed from: d  reason: collision with root package name */
    public d f11418d = d.APPLICATION_PROCESS_STATE_UNKNOWN;

    public b(a aVar) {
        this.f11415a = aVar;
        this.f11416b = new WeakReference<>(this);
    }

    public final void a(d dVar) {
        d dVar2 = this.f11418d;
        d dVar3 = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 == dVar3) {
            this.f11418d = dVar;
        } else if (dVar2 != dVar && dVar != dVar3) {
            this.f11418d = d.FOREGROUND_BACKGROUND;
        }
    }
}
