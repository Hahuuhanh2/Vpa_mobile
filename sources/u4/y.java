package u4;

import com.bumptech.glide.load.data.d;
import s4.e;
import u4.h;
import y4.n;

/* compiled from: SourceGenerator */
public final class y implements d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n.a f15272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f15273b;

    public y(z zVar, n.a aVar) {
        this.f15273b = zVar;
        this.f15272a = aVar;
    }

    public final void c(Exception exc) {
        boolean z10;
        z zVar = this.f15273b;
        n.a<?> aVar = this.f15272a;
        n.a<?> aVar2 = zVar.f15279f;
        if (aVar2 == null || aVar2 != aVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            z zVar2 = this.f15273b;
            n.a aVar3 = this.f15272a;
            h.a aVar4 = zVar2.f15275b;
            f fVar = zVar2.f15280n;
            d<Data> dVar = aVar3.f17487c;
            aVar4.c(fVar, exc, dVar, dVar.d());
        }
    }

    public final void f(Object obj) {
        boolean z10;
        z zVar = this.f15273b;
        n.a<?> aVar = this.f15272a;
        n.a<?> aVar2 = zVar.f15279f;
        if (aVar2 == null || aVar2 != aVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            z zVar2 = this.f15273b;
            n.a aVar3 = this.f15272a;
            l lVar = zVar2.f15274a.f15130p;
            if (obj == null || !lVar.c(aVar3.f17487c.d())) {
                h.a aVar4 = zVar2.f15275b;
                e eVar = aVar3.f17485a;
                d<Data> dVar = aVar3.f17487c;
                aVar4.i(eVar, obj, dVar, dVar.d(), zVar2.f15280n);
                return;
            }
            zVar2.f15278e = obj;
            zVar2.f15275b.b();
        }
    }
}
