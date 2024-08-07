package f5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.util.ArrayList;
import k5.g;
import m5.d;
import q4.e;

/* compiled from: GifFrameLoader */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final q4.a f9937a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f9938b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9939c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final l f9940d;

    /* renamed from: e  reason: collision with root package name */
    public final v4.c f9941e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9942f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9943g;

    /* renamed from: h  reason: collision with root package name */
    public k<Bitmap> f9944h;

    /* renamed from: i  reason: collision with root package name */
    public a f9945i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9946j;

    /* renamed from: k  reason: collision with root package name */
    public a f9947k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f9948l;

    /* renamed from: m  reason: collision with root package name */
    public s4.l<Bitmap> f9949m;

    /* renamed from: n  reason: collision with root package name */
    public a f9950n;

    /* renamed from: o  reason: collision with root package name */
    public int f9951o;

    /* renamed from: p  reason: collision with root package name */
    public int f9952p;

    /* renamed from: q  reason: collision with root package name */
    public int f9953q;

    /* compiled from: GifFrameLoader */
    public static class a extends l5.c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        public final Handler f9954d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9955e;

        /* renamed from: f  reason: collision with root package name */
        public final long f9956f;

        /* renamed from: n  reason: collision with root package name */
        public Bitmap f9957n;

        public a(Handler handler, int i10, long j10) {
            this.f9954d = handler;
            this.f9955e = i10;
            this.f9956f = j10;
        }

        public final void g(Object obj, d dVar) {
            this.f9957n = (Bitmap) obj;
            this.f9954d.sendMessageAtTime(this.f9954d.obtainMessage(1, this), this.f9956f);
        }

        public final void j(Drawable drawable) {
            this.f9957n = null;
        }
    }

    /* compiled from: GifFrameLoader */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader */
    public class c implements Handler.Callback {
        public c() {
        }

        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                f.this.b((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f.this.f9940d.l((a) message.obj);
                return false;
            }
        }
    }

    public f(com.bumptech.glide.b bVar, e eVar, int i10, int i11, a5.b bVar2, Bitmap bitmap) {
        v4.c cVar = bVar.f4916a;
        Context baseContext = bVar.f4918c.getBaseContext();
        l f10 = com.bumptech.glide.b.c(baseContext).f(baseContext);
        Context baseContext2 = bVar.f4918c.getBaseContext();
        l f11 = com.bumptech.glide.b.c(baseContext2).f(baseContext2);
        f11.getClass();
        k<Bitmap> y10 = new k(f11.f4948a, f11, Bitmap.class, f11.f4949b).y(l.f4947r).y(((g) ((g) ((g) new g().e(u4.l.f15173b)).w()).r()).k(i10, i11));
        this.f9940d = f10;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f9941e = cVar;
        this.f9938b = handler;
        this.f9944h = y10;
        this.f9937a = eVar;
        c(bVar2, bitmap);
    }

    public final void a() {
        if (this.f9942f && !this.f9943g) {
            a aVar = this.f9950n;
            if (aVar != null) {
                this.f9950n = null;
                b(aVar);
                return;
            }
            this.f9943g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f9937a.e());
            this.f9937a.c();
            this.f9947k = new a(this.f9938b, this.f9937a.f(), uptimeMillis);
            k<Bitmap> E = this.f9944h.y((g) new g().q(new n5.d(Double.valueOf(Math.random())))).E(this.f9937a);
            E.C(this.f9947k, E);
        }
    }

    public final void b(a aVar) {
        this.f9943g = false;
        if (this.f9946j) {
            this.f9938b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f9942f) {
            this.f9950n = aVar;
        } else {
            if (aVar.f9957n != null) {
                Bitmap bitmap = this.f9948l;
                if (bitmap != null) {
                    this.f9941e.d(bitmap);
                    this.f9948l = null;
                }
                a aVar2 = this.f9945i;
                this.f9945i = aVar;
                int size = this.f9939c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) this.f9939c.get(size)).a();
                }
                if (aVar2 != null) {
                    this.f9938b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [s4.l<android.graphics.Bitmap>, java.lang.Object, s4.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(s4.l<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            j7.a.r(r4)
            r3.f9949m = r4
            j7.a.r(r5)
            r3.f9948l = r5
            com.bumptech.glide.k<android.graphics.Bitmap> r0 = r3.f9944h
            k5.g r1 = new k5.g
            r1.<init>()
            r2 = 1
            k5.a r4 = r1.u(r4, r2)
            com.bumptech.glide.k r4 = r0.y(r4)
            r3.f9944h = r4
            int r4 = o5.l.c(r5)
            r3.f9951o = r4
            int r4 = r5.getWidth()
            r3.f9952p = r4
            int r4 = r5.getHeight()
            r3.f9953q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.f.c(s4.l, android.graphics.Bitmap):void");
    }
}
