package z4;

import java.io.InputStream;
import java.net.URL;
import s4.h;
import y4.f;
import y4.n;
import y4.o;
import y4.r;

/* compiled from: UrlLoader */
public final class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<f, InputStream> f17890a;

    /* compiled from: UrlLoader */
    public static class a implements o<URL, InputStream> {
        public final n<URL, InputStream> a(r rVar) {
            return new e(rVar.b(f.class, InputStream.class));
        }

        public final void b() {
        }
    }

    public e(n<f, InputStream> nVar) {
        this.f17890a = nVar;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        URL url = (URL) obj;
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        return this.f17890a.b(new f((URL) obj), i10, i11, hVar);
    }
}
