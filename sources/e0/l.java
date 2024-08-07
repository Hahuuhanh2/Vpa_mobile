package e0;

import al.g0;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.d;
import androidx.camera.core.f;
import c0.n0;
import c0.p0;
import e0.i0;
import f0.e0;
import g0.m;
import i0.f;
import java.util.HashSet;
import java.util.Objects;
import n0.k;
import v.n;

/* compiled from: CaptureNode */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f9018a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public w f9019b = null;

    /* renamed from: c  reason: collision with root package name */
    public f f9020c;

    /* renamed from: d  reason: collision with root package name */
    public c f9021d;

    /* renamed from: e  reason: collision with root package name */
    public b f9022e;

    /* compiled from: CaptureNode */
    public class a implements i0.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w f9023a;

        public a(w wVar) {
            this.f9023a = wVar;
        }

        public final void a(Throwable th2) {
            m.a();
            w wVar = this.f9023a;
            l lVar = l.this;
            if (wVar == lVar.f9019b) {
                lVar.f9019b = null;
            }
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* compiled from: CaptureNode */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public f0.f f9025a = new a();

        /* renamed from: b  reason: collision with root package name */
        public e0 f9026b;

        /* compiled from: CaptureNode */
        public class a extends f0.f {
        }

        public abstract k<ImageCaptureException> a();

        public abstract n0 b();

        public abstract int c();

        public abstract int d();

        public abstract k<w> e();

        public abstract Size f();

        public abstract boolean g();
    }

    /* compiled from: CaptureNode */
    public static abstract class c {
        public abstract k<d> a();

        public abstract int b();

        public abstract int c();

        public abstract k<w> d();
    }

    public final int a() {
        boolean z10;
        int h10;
        m.a();
        if (this.f9020c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E("The ImageReader is not initialized.", z10);
        f fVar = this.f9020c;
        synchronized (fVar.f1301a) {
            h10 = fVar.f1304d.h() - fVar.f1302b;
        }
        return h10;
    }

    public final void b(d dVar) {
        m.a();
        if (this.f9019b == null) {
            dVar.toString();
            p0.a("CaptureNode");
            dVar.close();
            return;
        }
        Object a10 = dVar.f0().a().a(this.f9019b.f9056f);
        Objects.requireNonNull(a10);
        int intValue = ((Integer) a10).intValue();
        boolean contains = this.f9018a.contains(Integer.valueOf(intValue));
        g0.E("Received an unexpected stage id" + intValue, contains);
        this.f9018a.remove(Integer.valueOf(intValue));
        c cVar = this.f9021d;
        Objects.requireNonNull(cVar);
        cVar.f8985a.accept(dVar);
        if (this.f9018a.isEmpty()) {
            w wVar = this.f9019b;
            this.f9019b = null;
            x xVar = (x) wVar.f9055e;
            xVar.getClass();
            m.a();
            if (!xVar.f9065g) {
                xVar.f9063e.a(null);
            }
        }
    }

    public final void c(w wVar) {
        boolean z10;
        m.a();
        boolean z11 = true;
        if (a() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E("Too many acquire images. Close image to be able to process next.", z10);
        if (this.f9019b != null && !this.f9018a.isEmpty()) {
            z11 = false;
        }
        g0.E("The previous request is not complete", z11);
        this.f9019b = wVar;
        this.f9018a.addAll(wVar.f9057g);
        c cVar = this.f9021d;
        Objects.requireNonNull(cVar);
        cVar.f8986b.accept(wVar);
        v8.a<Void> aVar = wVar.f9058h;
        aVar.b(new f.b(aVar, new a(wVar)), j7.a.x());
    }

    public final void d(ImageCaptureException imageCaptureException) {
        boolean z10;
        m.a();
        w wVar = this.f9019b;
        if (wVar != null) {
            x xVar = (x) wVar.f9055e;
            xVar.getClass();
            m.a();
            if (!xVar.f9065g) {
                i0 i0Var = xVar.f9059a;
                i0Var.getClass();
                m.a();
                int i10 = i0Var.f9013a;
                if (i10 > 0) {
                    z10 = true;
                    i0Var.f9013a = i10 - 1;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    m.a();
                    i0 i0Var2 = xVar.f9059a;
                    i0Var2.a().execute(new n(12, i0Var2, imageCaptureException));
                }
                xVar.a();
                xVar.f9063e.b(imageCaptureException);
                if (z10) {
                    i0.a aVar = xVar.f9060b;
                    i0 i0Var3 = xVar.f9059a;
                    h0 h0Var = (h0) aVar;
                    h0Var.getClass();
                    m.a();
                    p0.a("TakePictureManager");
                    h0Var.f9005a.addFirst(i0Var3);
                    h0Var.c();
                }
            }
        }
    }
}
