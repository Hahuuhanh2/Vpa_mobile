package y4;

import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import s4.e;
import s4.h;

/* compiled from: ModelLoader */
public interface n<Model, Data> {

    /* compiled from: ModelLoader */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final e f17485a;

        /* renamed from: b  reason: collision with root package name */
        public final List<e> f17486b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f17487c;

        public a() {
            throw null;
        }

        public a(e eVar, d<Data> dVar) {
            List<e> emptyList = Collections.emptyList();
            j7.a.r(eVar);
            this.f17485a = eVar;
            j7.a.r(emptyList);
            this.f17486b = emptyList;
            j7.a.r(dVar);
            this.f17487c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, h hVar);
}
