package al;

import android.support.v4.media.a;
import ek.i;
import rk.l;
import sk.j;

/* compiled from: CompletionState.kt */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f19096a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, i> f19097b;

    public v(Object obj, l<? super Throwable, i> lVar) {
        this.f19096a = obj;
        this.f19097b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return j.a(this.f19096a, vVar.f19096a) && j.a(this.f19097b, vVar.f19097b);
    }

    public final int hashCode() {
        Object obj = this.f19096a;
        return this.f19097b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("CompletedWithCancellation(result=");
        q10.append(this.f19096a);
        q10.append(", onCancellation=");
        q10.append(this.f19097b);
        q10.append(')');
        return q10.toString();
    }
}
