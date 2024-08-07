package z4;

import com.bumptech.glide.load.data.i;
import java.io.InputStream;
import java.util.ArrayDeque;
import s4.g;
import s4.h;
import y4.f;
import y4.m;
import y4.n;
import y4.o;
import y4.r;

/* compiled from: HttpGlideUrlLoader */
public final class a implements n<f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Integer> f17866b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final m<f, f> f17867a;

    /* renamed from: z4.a$a  reason: collision with other inner class name */
    /* compiled from: HttpGlideUrlLoader */
    public static class C0248a implements o<f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<f, f> f17868a = new m<>();

        public final n<f, InputStream> a(r rVar) {
            return new a(this.f17868a);
        }

        public final void b() {
        }
    }

    public a(m<f, f> mVar) {
        this.f17867a = mVar;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        f fVar = (f) obj;
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        f fVar = (f) obj;
        m<f, f> mVar = this.f17867a;
        if (mVar != null) {
            m.a a10 = m.a.a(fVar);
            Object a11 = mVar.f17480a.a(a10);
            ArrayDeque arrayDeque = m.a.f17481d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            f fVar2 = (f) a11;
            if (fVar2 == null) {
                m<f, f> mVar2 = this.f17867a;
                mVar2.getClass();
                mVar2.f17480a.d(m.a.a(fVar), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new n.a(fVar, new i(fVar, ((Integer) hVar.c(f17866b)).intValue()));
    }
}
