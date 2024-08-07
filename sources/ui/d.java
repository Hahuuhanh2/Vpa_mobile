package ui;

import android.support.v4.media.a;
import com.vpa.daugia.module.support.data.model.Categories;
import sk.j;

/* compiled from: CategoryItemState.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Categories f23072a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23073b;

    public d(Categories categories, int i10) {
        j.f(categories, "item");
        this.f23072a = categories;
        this.f23073b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f23072a, dVar.f23072a) && this.f23073b == dVar.f23073b;
    }

    public final int hashCode() {
        return (this.f23072a.hashCode() * 31) + this.f23073b;
    }

    public final String toString() {
        StringBuilder q10 = a.q("CategoryItemState(item=");
        q10.append(this.f23072a);
        q10.append(", position=");
        q10.append(this.f23073b);
        q10.append(')');
        return q10.toString();
    }
}
