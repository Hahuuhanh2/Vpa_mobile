package ui;

import android.support.v4.media.a;
import com.vpa.daugia.module.support.data.model.FAQ;
import sk.j;

/* compiled from: FAQItemState.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final FAQ f23081a;

    public h(FAQ faq) {
        j.f(faq, "item");
        this.f23081a = faq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && j.a(this.f23081a, ((h) obj).f23081a);
    }

    public final int hashCode() {
        return this.f23081a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("FAQItemState(item=");
        q10.append(this.f23081a);
        q10.append(')');
        return q10.toString();
    }
}
