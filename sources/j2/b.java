package j2;

import j2.c;

/* compiled from: ByteString */
public final class b extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public int f11481a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f11482b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f11483c;

    public b(c cVar) {
        this.f11483c = cVar;
        this.f11482b = cVar.size();
    }

    public final boolean hasNext() {
        if (this.f11481a < this.f11482b) {
            return true;
        }
        return false;
    }
}
