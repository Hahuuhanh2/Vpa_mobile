package tc;

import tc.c;

/* compiled from: ByteString */
public final class b extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public int f14949a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f14950b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f14951c;

    public b(c cVar) {
        this.f14951c = cVar;
        this.f14950b = cVar.size();
    }

    public final boolean hasNext() {
        if (this.f14949a < this.f14950b) {
            return true;
        }
        return false;
    }
}
