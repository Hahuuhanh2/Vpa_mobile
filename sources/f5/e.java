package f5;

import android.graphics.Bitmap;
import b5.d;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import j7.a;
import java.security.MessageDigest;
import s4.l;
import u4.u;

/* compiled from: GifDrawableTransformation */
public final class e implements l<c> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f9936b;

    public e(l<Bitmap> lVar) {
        a.r(lVar);
        this.f9936b = lVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f9936b.a(messageDigest);
    }

    public final u b(h hVar, u uVar, int i10, int i11) {
        c cVar = (c) uVar.get();
        d dVar = new d(cVar.f9925a.f9935a.f9948l, b.b(hVar).f4916a);
        u b10 = this.f9936b.b(hVar, dVar, i10, i11);
        if (!dVar.equals(b10)) {
            dVar.b();
        }
        l<Bitmap> lVar = this.f9936b;
        cVar.f9925a.f9935a.c(lVar, (Bitmap) b10.get());
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f9936b.equals(((e) obj).f9936b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9936b.hashCode();
    }
}
