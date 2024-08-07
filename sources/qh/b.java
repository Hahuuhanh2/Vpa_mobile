package qh;

import android.support.v4.media.a;
import com.vpa.daugia.module.home.data.model.News;
import sk.j;

/* compiled from: NewsItemState.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final News f22755a;

    public b(News news) {
        j.f(news, "item");
        this.f22755a = news;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f22755a, ((b) obj).f22755a);
    }

    public final int hashCode() {
        return this.f22755a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("NewsItemState(item=");
        q10.append(this.f22755a);
        q10.append(')');
        return q10.toString();
    }
}
