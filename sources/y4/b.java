package y4;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import s4.h;
import y4.n;

/* compiled from: ByteArrayLoader */
public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final C0231b<Data> f17448a;

    /* compiled from: ByteArrayLoader */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: y4.b$a$a  reason: collision with other inner class name */
        /* compiled from: ByteArrayLoader */
        public class C0230a implements C0231b<ByteBuffer> {
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public final Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public final n<byte[], ByteBuffer> a(r rVar) {
            return new b(new C0230a());
        }

        public final void b() {
        }
    }

    /* renamed from: y4.b$b  reason: collision with other inner class name */
    /* compiled from: ByteArrayLoader */
    public interface C0231b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f17449a;

        /* renamed from: b  reason: collision with root package name */
        public final C0231b<Data> f17450b;

        public c(byte[] bArr, C0231b<Data> bVar) {
            this.f17449a = bArr;
            this.f17450b = bVar;
        }

        public final Class<Data> a() {
            return this.f17450b.a();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final s4.a d() {
            return s4.a.LOCAL;
        }

        public final void e(j jVar, d.a<? super Data> aVar) {
            aVar.f(this.f17450b.b(this.f17449a));
        }
    }

    /* compiled from: ByteArrayLoader */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader */
        public class a implements C0231b<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public final n<byte[], InputStream> a(r rVar) {
            return new b(new a());
        }

        public final void b() {
        }
    }

    public b(C0231b<Data> bVar) {
        this.f17448a = bVar;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        byte[] bArr = (byte[]) obj;
        return new n.a(new n5.d(bArr), new c(bArr, this.f17448a));
    }
}
