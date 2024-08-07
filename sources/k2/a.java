package k2;

import android.view.Choreographer;
import java.util.ArrayList;
import v0.h;

/* compiled from: AnimationHandler */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<a> f11909g = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final h<b, Long> f11910a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f11911b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final C0132a f11912c = new C0132a();

    /* renamed from: d  reason: collision with root package name */
    public d f11913d;

    /* renamed from: e  reason: collision with root package name */
    public long f11914e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11915f = false;

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    /* compiled from: AnimationHandler */
    public class C0132a {
        public C0132a() {
        }
    }

    /* compiled from: AnimationHandler */
    public interface b {
        boolean a(long j10);
    }

    /* compiled from: AnimationHandler */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final C0132a f11917a;

        public c(C0132a aVar) {
            this.f11917a = aVar;
        }
    }

    /* compiled from: AnimationHandler */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Choreographer f11918b = Choreographer.getInstance();

        /* renamed from: c  reason: collision with root package name */
        public final C0133a f11919c = new C0133a();

        /* renamed from: k2.a$d$a  reason: collision with other inner class name */
        /* compiled from: AnimationHandler */
        public class C0133a implements Choreographer.FrameCallback {
            public C0133a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void doFrame(long r10) {
                /*
                    r9 = this;
                    k2.a$d r10 = k2.a.d.this
                    k2.a$a r10 = r10.f11917a
                    k2.a r11 = k2.a.this
                    long r0 = android.os.SystemClock.uptimeMillis()
                    r11.f11914e = r0
                    k2.a r11 = k2.a.this
                    long r0 = r11.f11914e
                    long r2 = android.os.SystemClock.uptimeMillis()
                    r4 = 0
                    r5 = r4
                L_0x0016:
                    java.util.ArrayList<k2.a$b> r6 = r11.f11911b
                    int r6 = r6.size()
                    if (r5 >= r6) goto L_0x004d
                    java.util.ArrayList<k2.a$b> r6 = r11.f11911b
                    java.lang.Object r6 = r6.get(r5)
                    k2.a$b r6 = (k2.a.b) r6
                    if (r6 != 0) goto L_0x0029
                    goto L_0x004a
                L_0x0029:
                    v0.h<k2.a$b, java.lang.Long> r7 = r11.f11910a
                    r8 = 0
                    java.lang.Object r7 = r7.getOrDefault(r6, r8)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L_0x0035
                    goto L_0x0042
                L_0x0035:
                    long r7 = r7.longValue()
                    int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r7 >= 0) goto L_0x0044
                    v0.h<k2.a$b, java.lang.Long> r7 = r11.f11910a
                    r7.remove(r6)
                L_0x0042:
                    r7 = 1
                    goto L_0x0045
                L_0x0044:
                    r7 = r4
                L_0x0045:
                    if (r7 == 0) goto L_0x004a
                    r6.a(r0)
                L_0x004a:
                    int r5 = r5 + 1
                    goto L_0x0016
                L_0x004d:
                    boolean r0 = r11.f11915f
                    if (r0 == 0) goto L_0x006b
                    java.util.ArrayList<k2.a$b> r0 = r11.f11911b
                    int r0 = r0.size()
                L_0x0057:
                    int r0 = r0 + -1
                    if (r0 < 0) goto L_0x0069
                    java.util.ArrayList<k2.a$b> r1 = r11.f11911b
                    java.lang.Object r1 = r1.get(r0)
                    if (r1 != 0) goto L_0x0057
                    java.util.ArrayList<k2.a$b> r1 = r11.f11911b
                    r1.remove(r0)
                    goto L_0x0057
                L_0x0069:
                    r11.f11915f = r4
                L_0x006b:
                    k2.a r11 = k2.a.this
                    java.util.ArrayList<k2.a$b> r11 = r11.f11911b
                    int r11 = r11.size()
                    if (r11 <= 0) goto L_0x008d
                    k2.a r10 = k2.a.this
                    k2.a$d r11 = r10.f11913d
                    if (r11 != 0) goto L_0x0084
                    k2.a$d r11 = new k2.a$d
                    k2.a$a r0 = r10.f11912c
                    r11.<init>(r0)
                    r10.f11913d = r11
                L_0x0084:
                    k2.a$d r10 = r10.f11913d
                    android.view.Choreographer r11 = r10.f11918b
                    k2.a$d$a r10 = r10.f11919c
                    r11.postFrameCallback(r10)
                L_0x008d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: k2.a.d.C0133a.doFrame(long):void");
            }
        }

        public d(C0132a aVar) {
            super(aVar);
        }
    }
}
