package androidx.emoji2.text;

import al.g0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.d;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t1.e;
import t1.f;
import t1.l;
import t1.m;
import v.v;

/* compiled from: FontRequestEmojiCompatConfig */
public final class g extends d.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2408d = new a();

    /* compiled from: FontRequestEmojiCompatConfig */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig */
    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2409a;

        /* renamed from: b  reason: collision with root package name */
        public final f f2410b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2411c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f2412d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f2413e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f2414f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f2415g;

        /* renamed from: h  reason: collision with root package name */
        public d.h f2416h;

        public b(Context context, f fVar) {
            a aVar = g.f2408d;
            g0.D(context, "Context cannot be null");
            this.f2409a = context.getApplicationContext();
            this.f2410b = fVar;
            this.f2411c = aVar;
        }

        public final void a(d.h hVar) {
            synchronized (this.f2412d) {
                this.f2416h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f2412d) {
                this.f2416h = null;
                Handler handler = this.f2413e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f2413e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2415g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2414f = null;
                this.f2415g = null;
            }
        }

        public final void c() {
            synchronized (this.f2412d) {
                if (this.f2416h != null) {
                    if (this.f2414f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new l2.a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f2415g = threadPoolExecutor;
                        this.f2414f = threadPoolExecutor;
                    }
                    this.f2414f.execute(new d.d(this, 17));
                }
            }
        }

        public final m d() {
            try {
                a aVar = this.f2411c;
                Context context = this.f2409a;
                f fVar = this.f2410b;
                aVar.getClass();
                l a10 = e.a(context, fVar);
                if (a10.f14784a == 0) {
                    m[] mVarArr = a10.f14785b;
                    if (mVarArr != null && mVarArr.length != 0) {
                        return mVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(v.e(android.support.v4.media.a.q("fetchFonts failed ("), a10.f14784a, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public g(Context context, f fVar) {
        super(new b(context, fVar));
    }
}
