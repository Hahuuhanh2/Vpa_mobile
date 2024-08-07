package s4;

import com.bumptech.glide.h;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import u4.u;

/* compiled from: MultiTransformation */
public final class f<T> implements l<T> {

    /* renamed from: b  reason: collision with root package name */
    public final List f14625b;

    @SafeVarargs
    public f(l<T>... lVarArr) {
        if (lVarArr.length != 0) {
            this.f14625b = Arrays.asList(lVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    public final void a(MessageDigest messageDigest) {
        for (l a10 : this.f14625b) {
            a10.a(messageDigest);
        }
    }

    public final u b(h hVar, u uVar, int i10, int i11) {
        u uVar2 = uVar;
        for (l b10 : this.f14625b) {
            u b11 = b10.b(hVar, uVar2, i10, i11);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(b11)) {
                uVar2.b();
            }
            uVar2 = b11;
        }
        return uVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f14625b.equals(((f) obj).f14625b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14625b.hashCode();
    }
}
