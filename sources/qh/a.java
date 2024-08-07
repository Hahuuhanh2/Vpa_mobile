package qh;

import android.content.Context;
import com.vpa.daugia.module.home.data.model.Item;
import sk.j;

/* compiled from: ActionItemState.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22752a;

    /* renamed from: b  reason: collision with root package name */
    public final Item f22753b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22754c = true;

    public a(Context context, Item item) {
        j.f(item, "item");
        this.f22752a = context;
        this.f22753b = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f22752a, aVar.f22752a) && j.a(this.f22753b, aVar.f22753b) && this.f22754c == aVar.f22754c;
    }

    public final int hashCode() {
        int hashCode = (this.f22753b.hashCode() + (this.f22752a.hashCode() * 31)) * 31;
        boolean z10 = this.f22754c;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ActionItemState(context=");
        q10.append(this.f22752a);
        q10.append(", item=");
        q10.append(this.f22753b);
        q10.append(", onClick=");
        q10.append(this.f22754c);
        q10.append(')');
        return q10.toString();
    }
}
