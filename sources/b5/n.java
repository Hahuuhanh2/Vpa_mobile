package b5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import java.security.MessageDigest;
import s4.l;
import u4.u;
import v4.c;

/* compiled from: DrawableTransformation */
public final class n implements l<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f4045b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4046c;

    public n(l<Bitmap> lVar, boolean z10) {
        this.f4045b = lVar;
        this.f4046c = z10;
    }

    public final void a(MessageDigest messageDigest) {
        this.f4045b.a(messageDigest);
    }

    public final u b(h hVar, u uVar, int i10, int i11) {
        c cVar = b.b(hVar).f4916a;
        Drawable drawable = (Drawable) uVar.get();
        d a10 = m.a(cVar, drawable, i10, i11);
        if (a10 != null) {
            u b10 = this.f4045b.b(hVar, a10, i10, i11);
            if (!b10.equals(a10)) {
                return new t(hVar.getResources(), b10);
            }
            b10.b();
            return uVar;
        } else if (!this.f4046c) {
            return uVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f4045b.equals(((n) obj).f4045b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4045b.hashCode();
    }
}
