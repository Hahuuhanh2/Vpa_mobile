package d;

import android.support.v4.media.a;
import android.window.BackEvent;
import sk.j;

/* compiled from: BackEventCompat.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f8418a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8419b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8420c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8421d;

    public b(BackEvent backEvent) {
        j.f(backEvent, "backEvent");
        a aVar = a.f8417a;
        float d10 = aVar.d(backEvent);
        float e10 = aVar.e(backEvent);
        float b10 = aVar.b(backEvent);
        int c10 = aVar.c(backEvent);
        this.f8418a = d10;
        this.f8419b = e10;
        this.f8420c = b10;
        this.f8421d = c10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("BackEventCompat{touchX=");
        q10.append(this.f8418a);
        q10.append(", touchY=");
        q10.append(this.f8419b);
        q10.append(", progress=");
        q10.append(this.f8420c);
        q10.append(", swipeEdge=");
        q10.append(this.f8421d);
        q10.append('}');
        return q10.toString();
    }
}
