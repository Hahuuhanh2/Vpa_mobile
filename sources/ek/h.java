package ek;

import android.support.v4.media.a;
import android.util.Size;
import android.view.Surface;
import java.io.Serializable;
import sk.j;

/* compiled from: Tuples.kt */
public final class h<A, B, C> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final A f20109a;

    /* renamed from: b  reason: collision with root package name */
    public final B f20110b;

    /* renamed from: c  reason: collision with root package name */
    public final C f20111c;

    public h(Surface surface, Size size, Object obj) {
        this.f20109a = surface;
        this.f20110b = size;
        this.f20111c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return j.a(this.f20109a, hVar.f20109a) && j.a(this.f20110b, hVar.f20110b) && j.a(this.f20111c, hVar.f20111c);
    }

    public final int hashCode() {
        A a10 = this.f20109a;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f20110b;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f20111c;
        if (c10 != null) {
            i10 = c10.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        StringBuilder p10 = a.p('(');
        p10.append(this.f20109a);
        p10.append(", ");
        p10.append(this.f20110b);
        p10.append(", ");
        p10.append(this.f20111c);
        p10.append(')');
        return p10.toString();
    }
}
