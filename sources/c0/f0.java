package c0;

import androidx.camera.core.d;
import f0.d0;
import i0.c;
import i0.f;

/* compiled from: ImageAnalysisBlockingAnalyzer */
public final class f0 extends e0 {

    /* compiled from: ImageAnalysisBlockingAnalyzer */
    public class a implements c<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4253a;

        public a(d dVar) {
            this.f4253a = dVar;
        }

        public final void a(Throwable th2) {
            this.f4253a.close();
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    public final d a(d0 d0Var) {
        return d0Var.i();
    }

    public final void c() {
    }

    public final void e(d dVar) {
        v8.a<Void> b10 = b(dVar);
        a aVar = new a(dVar);
        b10.b(new f.b(b10, aVar), j7.a.x());
    }
}
