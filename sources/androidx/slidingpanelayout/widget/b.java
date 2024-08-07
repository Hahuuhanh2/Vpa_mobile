package androidx.slidingpanelayout.widget;

import al.d0;
import android.app.Activity;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.slidingpanelayout.widget.a;
import androidx.transition.ChangeBounds;
import androidx.transition.h;
import androidx.window.layout.g;
import androidx.window.layout.z;
import dl.f;
import ik.d;
import kk.c;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
/* compiled from: FoldingFeatureObserver.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3355a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f3356b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f3357c;

    /* compiled from: Collect.kt */
    public static final class a implements f<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f3358a;

        public a(a aVar) {
            this.f3358a = aVar;
        }

        public final Object e(g gVar, d<? super ek.i> dVar) {
            ek.i iVar;
            g gVar2 = gVar;
            a.C0031a aVar = this.f3358a.f3354d;
            if (aVar == null) {
                iVar = null;
            } else {
                SlidingPaneLayout.a aVar2 = (SlidingPaneLayout.a) aVar;
                SlidingPaneLayout.this.C = gVar2;
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.f3433c = 300;
                changeBounds.f3434d = y1.a.b(0.2f, 0.0f, 0.0f, 1.0f);
                h.a(SlidingPaneLayout.this, changeBounds);
                SlidingPaneLayout.this.requestLayout();
                iVar = ek.i.f20112a;
            }
            if (iVar == jk.a.COROUTINE_SUSPENDED) {
                return iVar;
            }
            return ek.i.f20112a;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: SafeCollector.common.kt */
    public static final class C0032b implements dl.e<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dl.e f3359a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f3360b;

        /* renamed from: androidx.slidingpanelayout.widget.b$b$a */
        /* compiled from: Collect.kt */
        public static final class a implements f<z> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f f3361a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a f3362b;

            @e(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", l = {138}, m = "emit")
            /* renamed from: androidx.slidingpanelayout.widget.b$b$a$a  reason: collision with other inner class name */
            public static final class C0033a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f3363a;

                /* renamed from: b  reason: collision with root package name */
                public int f3364b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f3365c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0033a(a aVar, d dVar) {
                    super(dVar);
                    this.f3365c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f3363a = obj;
                    this.f3364b |= Integer.MIN_VALUE;
                    return this.f3365c.e((Object) null, this);
                }
            }

            public a(f fVar, a aVar) {
                this.f3361a = fVar;
                this.f3362b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object e(java.lang.Object r7, ik.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.slidingpanelayout.widget.b.C0032b.a.C0033a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    androidx.slidingpanelayout.widget.b$b$a$a r0 = (androidx.slidingpanelayout.widget.b.C0032b.a.C0033a) r0
                    int r1 = r0.f3364b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f3364b = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.slidingpanelayout.widget.b$b$a$a r0 = new androidx.slidingpanelayout.widget.b$b$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f3363a
                    jk.a r1 = jk.a.COROUTINE_SUSPENDED
                    int r2 = r0.f3364b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    p3.l0.Q0(r8)
                    goto L_0x0068
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    p3.l0.Q0(r8)
                    dl.f r8 = r6.f3361a
                    androidx.window.layout.z r7 = (androidx.window.layout.z) r7
                    androidx.slidingpanelayout.widget.a r2 = r6.f3362b
                    r2.getClass()
                    java.util.List<androidx.window.layout.c> r7 = r7.f3722a
                    java.util.Iterator r7 = r7.iterator()
                L_0x0041:
                    boolean r2 = r7.hasNext()
                    r4 = 0
                    if (r2 == 0) goto L_0x0054
                    java.lang.Object r2 = r7.next()
                    r5 = r2
                    androidx.window.layout.c r5 = (androidx.window.layout.c) r5
                    boolean r5 = r5 instanceof androidx.window.layout.g
                    if (r5 == 0) goto L_0x0041
                    goto L_0x0055
                L_0x0054:
                    r2 = r4
                L_0x0055:
                    boolean r7 = r2 instanceof androidx.window.layout.g
                    if (r7 == 0) goto L_0x005c
                    r4 = r2
                    androidx.window.layout.g r4 = (androidx.window.layout.g) r4
                L_0x005c:
                    if (r4 != 0) goto L_0x005f
                    goto L_0x0068
                L_0x005f:
                    r0.f3364b = r3
                    java.lang.Object r7 = r8.e(r4, r0)
                    if (r7 != r1) goto L_0x0068
                    return r1
                L_0x0068:
                    ek.i r7 = ek.i.f20112a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.b.C0032b.a.e(java.lang.Object, ik.d):java.lang.Object");
            }
        }

        public C0032b(dl.e eVar, a aVar) {
            this.f3359a = eVar;
            this.f3360b = aVar;
        }

        public final Object a(f fVar, d dVar) {
            Object a10 = this.f3359a.a(new a(fVar, this.f3360b), dVar);
            if (a10 == jk.a.COROUTINE_SUSPENDED) {
                return a10;
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, Activity activity, d<? super b> dVar) {
        super(2, dVar);
        this.f3356b = aVar;
        this.f3357c = activity;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f3356b, this.f3357c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f3355a;
        if (i10 == 0) {
            l0.Q0(obj);
            dl.e y10 = j7.a.y(new C0032b(this.f3356b.f3351a.a(this.f3357c), this.f3356b));
            a aVar2 = new a(this.f3356b);
            this.f3355a = 1;
            if (y10.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ek.i.f20112a;
    }
}
