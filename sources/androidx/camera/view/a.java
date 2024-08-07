package androidx.camera.view;

import androidx.camera.view.PreviewView;
import c0.p0;
import f0.j0;
import f0.q;
import f0.r;
import i0.d;
import r2.p;

/* compiled from: PreviewStreamStateObserver */
public final class a implements j0.a<r.a> {

    /* renamed from: a  reason: collision with root package name */
    public final q f1481a;

    /* renamed from: b  reason: collision with root package name */
    public final p<PreviewView.g> f1482b;

    /* renamed from: c  reason: collision with root package name */
    public PreviewView.g f1483c;

    /* renamed from: d  reason: collision with root package name */
    public final c f1484d;

    /* renamed from: e  reason: collision with root package name */
    public d f1485e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1486f = false;

    public a(q qVar, p<PreviewView.g> pVar, c cVar) {
        this.f1481a = qVar;
        this.f1482b = pVar;
        this.f1484d = cVar;
        synchronized (this) {
            this.f1483c = pVar.d();
        }
    }

    public final void a(PreviewView.g gVar) {
        synchronized (this) {
            if (!this.f1483c.equals(gVar)) {
                this.f1483c = gVar;
                gVar.toString();
                p0.a("StreamStateObserver");
                this.f1482b.k(gVar);
            }
        }
    }
}
