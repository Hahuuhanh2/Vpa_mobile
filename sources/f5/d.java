package f5;

import android.graphics.Bitmap;
import d5.c;
import f5.f;

/* compiled from: GifDrawableResource */
public final class d extends c<c> {
    public d(c cVar) {
        super(cVar);
    }

    public final void a() {
        ((c) this.f8748a).f9925a.f9935a.f9948l.prepareToDraw();
    }

    public final void b() {
        ((c) this.f8748a).stop();
        c cVar = (c) this.f8748a;
        cVar.f9928d = true;
        f fVar = cVar.f9925a.f9935a;
        fVar.f9939c.clear();
        Bitmap bitmap = fVar.f9948l;
        if (bitmap != null) {
            fVar.f9941e.d(bitmap);
            fVar.f9948l = null;
        }
        fVar.f9942f = false;
        f.a aVar = fVar.f9945i;
        if (aVar != null) {
            fVar.f9940d.l(aVar);
            fVar.f9945i = null;
        }
        f.a aVar2 = fVar.f9947k;
        if (aVar2 != null) {
            fVar.f9940d.l(aVar2);
            fVar.f9947k = null;
        }
        f.a aVar3 = fVar.f9950n;
        if (aVar3 != null) {
            fVar.f9940d.l(aVar3);
            fVar.f9950n = null;
        }
        fVar.f9937a.clear();
        fVar.f9946j = true;
    }

    public final Class<c> c() {
        return c.class;
    }

    public final int g() {
        f fVar = ((c) this.f8748a).f9925a.f9935a;
        return fVar.f9937a.g() + fVar.f9951o;
    }
}
