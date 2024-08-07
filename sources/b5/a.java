package b5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d5.e;
import s4.h;
import s4.j;
import u4.u;
import v4.c;

/* compiled from: BitmapDrawableDecoder */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4002a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final j f4003b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4004c;

    public a(e eVar, c cVar) {
        this.f4003b = eVar;
        this.f4004c = cVar;
    }

    public final u a(Object obj, int i10, int i11, h hVar) {
        switch (this.f4002a) {
            case 0:
                u a10 = this.f4003b.a(obj, i10, i11, hVar);
                Resources resources = (Resources) this.f4004c;
                if (a10 == null) {
                    return null;
                }
                return new t(resources, a10);
            default:
                u c10 = ((e) this.f4003b).c((Uri) obj);
                if (c10 == null) {
                    return null;
                }
                return m.a((c) this.f4004c, (Drawable) ((d5.c) c10).get(), i10, i11);
        }
    }

    public final boolean b(Object obj, h hVar) {
        switch (this.f4002a) {
            case 0:
                return this.f4003b.b(obj, hVar);
            default:
                return "android.resource".equals(((Uri) obj).getScheme());
        }
    }

    public a(Resources resources, j jVar) {
        this.f4004c = resources;
        this.f4003b = jVar;
    }
}
