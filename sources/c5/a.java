package c5;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder */
public final class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f4561a;

    /* renamed from: c5.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferRewinder */
    public static class C0051a implements e.a<ByteBuffer> {
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final e b(Object obj) {
            return new a((ByteBuffer) obj);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f4561a = byteBuffer;
    }

    public final Object a() {
        this.f4561a.position(0);
        return this.f4561a;
    }

    public final void b() {
    }
}
