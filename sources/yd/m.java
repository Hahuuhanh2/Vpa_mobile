package yd;

import java.util.Comparator;
import xd.n;

/* compiled from: PreviewScalingStrategy */
public final class m implements Comparator<n> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f17720a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f17721b;

    public m(n nVar, n nVar2) {
        this.f17721b = nVar;
        this.f17720a = nVar2;
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(this.f17721b.a((n) obj2, this.f17720a), this.f17721b.a((n) obj, this.f17720a));
    }
}
