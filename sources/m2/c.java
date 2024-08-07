package m2;

import al.g0;
import java.nio.ByteBuffer;

/* compiled from: Table */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f13086a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f13087b;

    /* renamed from: c  reason: collision with root package name */
    public int f13088c;

    /* renamed from: d  reason: collision with root package name */
    public int f13089d;

    public c() {
        if (g0.f19029s == null) {
            g0.f19029s = new g0();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f13089d) {
            return this.f13087b.getShort(this.f13088c + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        this.f13087b = byteBuffer;
        if (byteBuffer != null) {
            this.f13086a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f13088c = i11;
            this.f13089d = this.f13087b.getShort(i11);
            return;
        }
        this.f13086a = 0;
        this.f13088c = 0;
        this.f13089d = 0;
    }
}
