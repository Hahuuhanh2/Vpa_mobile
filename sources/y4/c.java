package y4;

import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import s4.h;
import y4.n;

/* compiled from: ByteBufferFileLoader */
public final class c implements n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader */
    public static final class a implements d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        public final File f17451a;

        public a(File file) {
            this.f17451a = file;
        }

        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final s4.a d() {
            return s4.a.LOCAL;
        }

        public final void e(j jVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(o5.a.a(this.f17451a));
            } catch (IOException e10) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.c(e10);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader */
    public static class b implements o<File, ByteBuffer> {
        public final n<File, ByteBuffer> a(r rVar) {
            return new c();
        }

        public final void b() {
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        File file = (File) obj;
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        File file = (File) obj;
        return new n.a(new n5.d(file), new a(file));
    }
}
