package nh;

import al.d0;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ik.d;
import kk.e;
import kk.i;
import rk.p;

@e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$addWishlistItem$1", f = "HomeViewModel.kt", l = {321, 323}, m = "invokeSuspend")
/* compiled from: HomeViewModel.kt */
public final class t0 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f21686a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f21687b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f21688c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f21689d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t0(boolean z10, HomeViewModel homeViewModel, String str, d<? super t0> dVar) {
        super(2, dVar);
        this.f21687b = z10;
        this.f21688c = homeViewModel;
        this.f21689d = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new t0(this.f21687b, this.f21688c, this.f21689d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[Catch:{ Exception -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d A[Catch:{ Exception -> 0x001c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r5.f21686a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            p3.l0.Q0(r6)     // Catch:{ Exception -> 0x001c }
            goto L_0x0046
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            p3.l0.Q0(r6)     // Catch:{ Exception -> 0x001c }
            goto L_0x0034
        L_0x001c:
            r6 = move-exception
            goto L_0x0079
        L_0x001e:
            p3.l0.Q0(r6)
            boolean r6 = r5.f21687b     // Catch:{ Exception -> 0x001c }
            if (r6 == 0) goto L_0x0037
            com.vpa.daugia.module.home.ui.HomeViewModel r6 = r5.f21688c     // Catch:{ Exception -> 0x001c }
            com.vpa.daugia.module.common.data.api.CommonApiHelper r6 = r6.f19708f     // Catch:{ Exception -> 0x001c }
            java.lang.String r1 = r5.f21689d     // Catch:{ Exception -> 0x001c }
            r5.f21686a = r3     // Catch:{ Exception -> 0x001c }
            java.lang.Object r6 = r6.addWishlistItem(r1, r5)     // Catch:{ Exception -> 0x001c }
            if (r6 != r0) goto L_0x0034
            return r0
        L_0x0034:
            ef.k r6 = (ef.k) r6     // Catch:{ Exception -> 0x001c }
            goto L_0x0048
        L_0x0037:
            com.vpa.daugia.module.home.ui.HomeViewModel r6 = r5.f21688c     // Catch:{ Exception -> 0x001c }
            com.vpa.daugia.module.common.data.api.CommonApiHelper r6 = r6.f19708f     // Catch:{ Exception -> 0x001c }
            java.lang.String r1 = r5.f21689d     // Catch:{ Exception -> 0x001c }
            r5.f21686a = r2     // Catch:{ Exception -> 0x001c }
            java.lang.Object r6 = r6.removeWishlistItem(r1, r5)     // Catch:{ Exception -> 0x001c }
            if (r6 != r0) goto L_0x0046
            return r0
        L_0x0046:
            ef.k r6 = (ef.k) r6     // Catch:{ Exception -> 0x001c }
        L_0x0048:
            boolean r0 = r6.e()     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x005d
            com.vpa.daugia.module.home.ui.HomeViewModel r6 = r5.f21688c     // Catch:{ Exception -> 0x001c }
            r2.p<ze.f<java.lang.Object>> r6 = r6.D     // Catch:{ Exception -> 0x001c }
            ze.f$c r0 = new ze.f$c     // Catch:{ Exception -> 0x001c }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x001c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x001c }
            r6.k(r0)     // Catch:{ Exception -> 0x001c }
            goto L_0x00bd
        L_0x005d:
            com.vpa.daugia.module.home.ui.HomeViewModel r0 = r5.f21688c     // Catch:{ Exception -> 0x001c }
            r2.p<ze.f<java.lang.Object>> r0 = r0.D     // Catch:{ Exception -> 0x001c }
            ze.f$a r1 = new ze.f$a     // Catch:{ Exception -> 0x001c }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ Exception -> 0x001c }
            java.util.List r6 = r6.c()     // Catch:{ Exception -> 0x001c }
            java.lang.Object r6 = fk.p.N0(r6)     // Catch:{ Exception -> 0x001c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x001c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x001c }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001c }
            r0.k(r1)     // Catch:{ Exception -> 0x001c }
            goto L_0x00bd
        L_0x0079:
            com.vpa.daugia.module.home.ui.HomeViewModel r0 = r5.f21688c
            r2.p<ze.f<java.lang.Object>> r0 = r0.D
            ze.f$a r1 = new ze.f$a
            boolean r2 = r6 instanceof retrofit2.HttpException     // Catch:{ Exception -> 0x00b6 }
            if (r2 == 0) goto L_0x00b7
            r2 = r6
            retrofit2.HttpException r2 = (retrofit2.HttpException) r2     // Catch:{ Exception -> 0x00b6 }
            ul.y<?> r2 = r2.f22764a     // Catch:{ Exception -> 0x00b6 }
            if (r2 == 0) goto L_0x0093
            okhttp3.ResponseBody r2 = r2.f23248c     // Catch:{ Exception -> 0x00b6 }
            if (r2 == 0) goto L_0x0093
            java.lang.String r2 = r2.q()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            bc.h r3 = new bc.h     // Catch:{ Exception -> 0x00b7 }
            r3.<init>()     // Catch:{ Exception -> 0x00b7 }
            java.lang.Class<ef.k> r4 = ef.k.class
            java.lang.Object r2 = r3.d(r4, r2)     // Catch:{ Exception -> 0x00b7 }
            ef.k r2 = (ef.k) r2     // Catch:{ Exception -> 0x00b7 }
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ Exception -> 0x00b7 }
            java.util.List r2 = r2.c()     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object r2 = fk.p.N0(r2)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b7 }
            if (r2 != 0) goto L_0x00b1
            java.lang.String r2 = "Error"
        L_0x00b1:
            r3.<init>(r2)     // Catch:{ Exception -> 0x00b7 }
            r6 = r3
            goto L_0x00b7
        L_0x00b6:
            r6 = move-exception
        L_0x00b7:
            r1.<init>(r6)
            r0.k(r1)
        L_0x00bd:
            ek.i r6 = ek.i.f20112a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
