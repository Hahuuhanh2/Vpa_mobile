package j9;

import j9.c;

/* compiled from: ByteString */
public final class b extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public int f11729a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f11730b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f11731c;

    public b(c cVar) {
        this.f11731c = cVar;
        this.f11730b = cVar.size();
    }

    public final boolean hasNext() {
        if (this.f11729a < this.f11730b) {
            return true;
        }
        return false;
    }
}
