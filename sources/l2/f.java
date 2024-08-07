package l2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import m2.b;

/* compiled from: MetadataListReader */
public final class f {

    /* compiled from: MetadataListReader */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f12641a;

        public a(ByteBuffer byteBuffer) {
            this.f12641a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() {
            return ((long) this.f12641a.getInt()) & 4294967295L;
        }

        public final void b(int i10) {
            ByteBuffer byteBuffer = this.f12641a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    public static b a(MappedByteBuffer mappedByteBuffer) {
        long j10;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.b(4);
        short s10 = duplicate.getShort() & 65535;
        if (s10 <= 100) {
            aVar.b(6);
            int i10 = 0;
            while (true) {
                if (i10 >= s10) {
                    j10 = -1;
                    break;
                }
                int i11 = aVar.f12641a.getInt();
                aVar.b(4);
                j10 = aVar.a();
                aVar.b(4);
                if (1835365473 == i11) {
                    break;
                }
                i10++;
            }
            if (j10 != -1) {
                aVar.b((int) (j10 - ((long) aVar.f12641a.position())));
                aVar.b(12);
                long a10 = aVar.a();
                for (int i12 = 0; ((long) i12) < a10; i12++) {
                    int i13 = aVar.f12641a.getInt();
                    long a11 = aVar.a();
                    aVar.a();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (a11 + j10));
                        b bVar = new b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
