package b5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import j7.a;
import u4.r;
import u4.u;

/* compiled from: LazyBitmapDrawableResource */
public final class t implements u<BitmapDrawable>, r {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f4069a;

    /* renamed from: b  reason: collision with root package name */
    public final u<Bitmap> f4070b;

    public t(Resources resources, u<Bitmap> uVar) {
        a.r(resources);
        this.f4069a = resources;
        a.r(uVar);
        this.f4070b = uVar;
    }

    public final void a() {
        u<Bitmap> uVar = this.f4070b;
        if (uVar instanceof r) {
            ((r) uVar).a();
        }
    }

    public final void b() {
        this.f4070b.b();
    }

    public final Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    public final int g() {
        return this.f4070b.g();
    }

    public final Object get() {
        return new BitmapDrawable(this.f4069a, this.f4070b.get());
    }
}
