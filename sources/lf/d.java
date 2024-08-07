package lf;

import al.d0;
import al.m0;
import al.q1;
import al.r0;
import com.ots.core.base.BaseApp;
import fl.m;
import gl.c;
import kk.e;
import kk.i;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import p3.l0;
import rk.l;
import rk.p;
import yk.h;

@e(c = "com.ots.core.utils.commom.ConnectionCheckerKt$checkConnection$6", f = "ConnectionChecker.kt", l = {101, 115}, m = "invokeSuspend")
/* compiled from: ConnectionChecker.kt */
public final class d extends i implements p<d0, ik.d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12987a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12988b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ OkHttpClient f12989c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l<f, ek.i> f12990d;

    @e(c = "com.ots.core.utils.commom.ConnectionCheckerKt$checkConnection$6$1", f = "ConnectionChecker.kt", l = {}, m = "invokeSuspend")
    /* compiled from: ConnectionChecker.kt */
    public static final class a extends i implements p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12991a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f12992b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l<f, ek.i> f12993c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, long j10, l<? super f, ek.i> lVar, ik.d<? super a> dVar) {
            super(2, dVar);
            this.f12991a = i10;
            this.f12992b = j10;
            this.f12993c = lVar;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new a(this.f12991a, this.f12992b, this.f12993c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            f fVar;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            l0.Q0(obj);
            if (!h.L0(String.valueOf(this.f12991a), "2", false)) {
                fVar = f.DISCONNECTED;
            } else if (this.f12992b > 2000) {
                fVar = f.SLOW;
            } else {
                fVar = f.CONNECTED;
            }
            if (fVar != BaseApp.f8337a) {
                this.f12993c.invoke(fVar);
                BaseApp.f8337a = fVar;
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, OkHttpClient okHttpClient, l<? super f, ek.i> lVar, ik.d<? super d> dVar) {
        super(2, dVar);
        this.f12988b = str;
        this.f12989c = okHttpClient;
        this.f12990d = lVar;
    }

    public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
        return new d(this.f12988b, this.f12989c, this.f12990d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        int i10;
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i11 = this.f12987a;
        if (i11 == 0) {
            l0.Q0(obj);
            long currentTimeMillis = System.currentTimeMillis();
            Request.Builder builder = new Request.Builder();
            builder.e(this.f12988b);
            Response response = null;
            builder.c("GET", (RequestBody) null);
            try {
                response = this.f12989c.a(builder.a()).d();
            } catch (Exception unused) {
            }
            if (response != null) {
                i10 = response.f22127d;
            } else {
                i10 = 500;
            }
            int i12 = i10;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (response != null) {
                response.close();
            }
            c cVar = r0.f19084a;
            q1 q1Var = m.f20254a;
            a aVar2 = new a(i12, currentTimeMillis2, this.f12990d, (ik.d<? super a>) null);
            this.f12987a = 1;
            if (l0.V0(this, q1Var, aVar2) == aVar) {
                return aVar;
            }
        } else if (i11 == 1) {
            l0.Q0(obj);
        } else if (i11 == 2) {
            l0.Q0(obj);
            return ek.i.f20112a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f12987a = 2;
        if (m0.a(10000, this) == aVar) {
            return aVar;
        }
        return ek.i.f20112a;
    }
}
