package bh;

import al.d0;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ik.d;
import kk.e;
import kk.i;
import rk.p;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$changePassword$1", f = "LoginViewModel.kt", l = {666}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19121b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(LoginViewModel loginViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f19121b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f19121b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.vpa.daugia.module.auth.data.model.Auth} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: com.vpa.daugia.module.auth.data.model.Auth} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r2 = r1.f19120a
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001d
            if (r2 != r3) goto L_0x0015
            p3.l0.Q0(r19)     // Catch:{ Exception -> 0x0012 }
            r2 = r19
            goto L_0x005b
        L_0x0012:
            r0 = move-exception
            goto L_0x00a6
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001d:
            p3.l0.Q0(r19)
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19121b     // Catch:{ Exception -> 0x0012 }
            r2.p<ze.f<java.lang.Object>> r2 = r2.B     // Catch:{ Exception -> 0x0012 }
            ze.f$b r5 = ze.f.b.f18005a     // Catch:{ Exception -> 0x0012 }
            r2.k(r5)     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19121b     // Catch:{ Exception -> 0x0012 }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r2 = r2.L     // Catch:{ Exception -> 0x0012 }
            T r2 = r2.f8545b     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.data.model.User r2 = (com.vpa.daugia.module.auth.data.model.User) r2     // Catch:{ Exception -> 0x0012 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = r2.getNewPassword()     // Catch:{ Exception -> 0x0012 }
            goto L_0x0039
        L_0x0038:
            r2 = r4
        L_0x0039:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r5 = r1.f19121b     // Catch:{ Exception -> 0x0012 }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r5 = r5.L     // Catch:{ Exception -> 0x0012 }
            T r5 = r5.f8545b     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.data.model.User r5 = (com.vpa.daugia.module.auth.data.model.User) r5     // Catch:{ Exception -> 0x0012 }
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = r5.getOldPassword()     // Catch:{ Exception -> 0x0012 }
            goto L_0x0049
        L_0x0048:
            r5 = r4
        L_0x0049:
            com.vpa.daugia.module.auth.data.api.request.ChangePasswordRequest r6 = new com.vpa.daugia.module.auth.data.api.request.ChangePasswordRequest     // Catch:{ Exception -> 0x0012 }
            r6.<init>(r5, r2)     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19121b     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.data.api.AuthApiHelper r2 = r2.f19546e     // Catch:{ Exception -> 0x0012 }
            r1.f19120a = r3     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r2 = r2.changePassword(r6, r1)     // Catch:{ Exception -> 0x0012 }
            if (r2 != r0) goto L_0x005b
            return r0
        L_0x005b:
            ef.k r2 = (ef.k) r2     // Catch:{ Exception -> 0x0012 }
            boolean r0 = r2.e()     // Catch:{ Exception -> 0x0012 }
            if (r0 == 0) goto L_0x008a
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r1.f19121b     // Catch:{ Exception -> 0x0012 }
            r2.p<ze.f<java.lang.Object>> r0 = r0.B     // Catch:{ Exception -> 0x0012 }
            ze.f$c r3 = new ze.f$c     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r2 = r2.d()     // Catch:{ Exception -> 0x0012 }
            if (r2 != 0) goto L_0x0083
            com.vpa.daugia.module.auth.data.model.Auth r2 = new com.vpa.daugia.module.auth.data.model.Auth     // Catch:{ Exception -> 0x0012 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1023(0x3ff, float:1.434E-42)
            r17 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0012 }
        L_0x0083:
            r3.<init>(r2)     // Catch:{ Exception -> 0x0012 }
            r0.k(r3)     // Catch:{ Exception -> 0x0012 }
            goto L_0x00e8
        L_0x008a:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r1.f19121b     // Catch:{ Exception -> 0x0012 }
            r2.p<ze.f<java.lang.Object>> r0 = r0.B     // Catch:{ Exception -> 0x0012 }
            ze.f$a r3 = new ze.f$a     // Catch:{ Exception -> 0x0012 }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0012 }
            java.util.List r2 = r2.c()     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r2 = fk.p.M0(r2)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0012 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0012 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0012 }
            r0.k(r3)     // Catch:{ Exception -> 0x0012 }
            goto L_0x00e8
        L_0x00a6:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19121b
            r2.p<ze.f<java.lang.Object>> r2 = r2.B
            ze.f$a r3 = new ze.f$a
            boolean r5 = r0 instanceof retrofit2.HttpException     // Catch:{ Exception -> 0x00e1 }
            if (r5 == 0) goto L_0x00e2
            r5 = r0
            retrofit2.HttpException r5 = (retrofit2.HttpException) r5     // Catch:{ Exception -> 0x00e1 }
            ul.y<?> r5 = r5.f22764a     // Catch:{ Exception -> 0x00e1 }
            if (r5 == 0) goto L_0x00bf
            okhttp3.ResponseBody r5 = r5.f23248c     // Catch:{ Exception -> 0x00e1 }
            if (r5 == 0) goto L_0x00bf
            java.lang.String r4 = r5.q()     // Catch:{ Exception -> 0x00e1 }
        L_0x00bf:
            bc.h r5 = new bc.h     // Catch:{ Exception -> 0x00e2 }
            r5.<init>()     // Catch:{ Exception -> 0x00e2 }
            java.lang.Class<ef.k> r6 = ef.k.class
            java.lang.Object r4 = r5.d(r6, r4)     // Catch:{ Exception -> 0x00e2 }
            ef.k r4 = (ef.k) r4     // Catch:{ Exception -> 0x00e2 }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x00e2 }
            java.util.List r4 = r4.c()     // Catch:{ Exception -> 0x00e2 }
            java.lang.Object r4 = fk.p.N0(r4)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00e2 }
            if (r4 != 0) goto L_0x00dc
            java.lang.String r4 = "Error"
        L_0x00dc:
            r5.<init>(r4)     // Catch:{ Exception -> 0x00e2 }
            r0 = r5
            goto L_0x00e2
        L_0x00e1:
            r0 = move-exception
        L_0x00e2:
            r3.<init>(r0)
            r2.k(r3)
        L_0x00e8:
            ek.i r0 = ek.i.f20112a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
