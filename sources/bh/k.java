package bh;

import al.d0;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ik.d;
import kk.e;
import kk.i;
import rk.p;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$recoverWithPhone$1", f = "LoginViewModel.kt", l = {563}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class k extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19145b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(LoginViewModel loginViewModel, d<? super k> dVar) {
        super(2, dVar);
        this.f19145b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new k(this.f19145b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: com.vpa.daugia.module.auth.data.model.Auth} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: com.vpa.daugia.module.auth.data.model.Auth} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r2 = r1.f19144a
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001d
            if (r2 != r3) goto L_0x0015
            p3.l0.Q0(r19)     // Catch:{ Exception -> 0x0012 }
            r2 = r19
            goto L_0x0073
        L_0x0012:
            r0 = move-exception
            goto L_0x00be
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001d:
            p3.l0.Q0(r19)
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19145b     // Catch:{ Exception -> 0x0012 }
            r2.p<ze.f<java.lang.Object>> r2 = r2.B     // Catch:{ Exception -> 0x0012 }
            ze.f$b r5 = ze.f.b.f18005a     // Catch:{ Exception -> 0x0012 }
            r2.k(r5)     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19145b     // Catch:{ Exception -> 0x0012 }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r2 = r2.L     // Catch:{ Exception -> 0x0012 }
            T r2 = r2.f8545b     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.data.model.User r2 = (com.vpa.daugia.module.auth.data.model.User) r2     // Catch:{ Exception -> 0x0012 }
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = r2.getPhoneVerificationCode()     // Catch:{ Exception -> 0x0012 }
            r8 = r2
            goto L_0x003a
        L_0x0039:
            r8 = r4
        L_0x003a:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19145b     // Catch:{ Exception -> 0x0012 }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r2 = r2.L     // Catch:{ Exception -> 0x0012 }
            T r2 = r2.f8545b     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.data.model.User r2 = (com.vpa.daugia.module.auth.data.model.User) r2     // Catch:{ Exception -> 0x0012 }
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = r2.getPhone()     // Catch:{ Exception -> 0x0012 }
            r7 = r2
            goto L_0x004b
        L_0x004a:
            r7 = r4
        L_0x004b:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19145b     // Catch:{ Exception -> 0x0012 }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r2 = r2.L     // Catch:{ Exception -> 0x0012 }
            T r2 = r2.f8545b     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.data.model.User r2 = (com.vpa.daugia.module.auth.data.model.User) r2     // Catch:{ Exception -> 0x0012 }
            if (r2 == 0) goto L_0x005b
            java.lang.String r2 = r2.getNewPassword()     // Catch:{ Exception -> 0x0012 }
            r6 = r2
            goto L_0x005c
        L_0x005b:
            r6 = r4
        L_0x005c:
            com.vpa.daugia.module.auth.data.api.request.RecoverOtpRequest r2 = new com.vpa.daugia.module.auth.data.api.request.RecoverOtpRequest     // Catch:{ Exception -> 0x0012 }
            r9 = 0
            r10 = 8
            r11 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r5 = r1.f19145b     // Catch:{ Exception -> 0x0012 }
            com.vpa.daugia.module.auth.data.api.AuthApiHelper r5 = r5.f19546e     // Catch:{ Exception -> 0x0012 }
            r1.f19144a = r3     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r2 = r5.recoverWithPhone(r2, r1)     // Catch:{ Exception -> 0x0012 }
            if (r2 != r0) goto L_0x0073
            return r0
        L_0x0073:
            ef.k r2 = (ef.k) r2     // Catch:{ Exception -> 0x0012 }
            boolean r0 = r2.e()     // Catch:{ Exception -> 0x0012 }
            if (r0 == 0) goto L_0x00a2
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r1.f19145b     // Catch:{ Exception -> 0x0012 }
            r2.p<ze.f<java.lang.Object>> r0 = r0.B     // Catch:{ Exception -> 0x0012 }
            ze.f$c r3 = new ze.f$c     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r2 = r2.d()     // Catch:{ Exception -> 0x0012 }
            if (r2 != 0) goto L_0x009b
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
        L_0x009b:
            r3.<init>(r2)     // Catch:{ Exception -> 0x0012 }
            r0.k(r3)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0100
        L_0x00a2:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r1.f19145b     // Catch:{ Exception -> 0x0012 }
            r2.p<ze.f<java.lang.Object>> r0 = r0.B     // Catch:{ Exception -> 0x0012 }
            ze.f$a r3 = new ze.f$a     // Catch:{ Exception -> 0x0012 }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0012 }
            java.util.List r2 = r2.c()     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r2 = fk.p.M0(r2)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0012 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0012 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0012 }
            r0.k(r3)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0100
        L_0x00be:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r2 = r1.f19145b
            r2.p<ze.f<java.lang.Object>> r2 = r2.B
            ze.f$a r3 = new ze.f$a
            boolean r5 = r0 instanceof retrofit2.HttpException     // Catch:{ Exception -> 0x00f9 }
            if (r5 == 0) goto L_0x00fa
            r5 = r0
            retrofit2.HttpException r5 = (retrofit2.HttpException) r5     // Catch:{ Exception -> 0x00f9 }
            ul.y<?> r5 = r5.f22764a     // Catch:{ Exception -> 0x00f9 }
            if (r5 == 0) goto L_0x00d7
            okhttp3.ResponseBody r5 = r5.f23248c     // Catch:{ Exception -> 0x00f9 }
            if (r5 == 0) goto L_0x00d7
            java.lang.String r4 = r5.q()     // Catch:{ Exception -> 0x00f9 }
        L_0x00d7:
            bc.h r5 = new bc.h     // Catch:{ Exception -> 0x00fa }
            r5.<init>()     // Catch:{ Exception -> 0x00fa }
            java.lang.Class<ef.k> r6 = ef.k.class
            java.lang.Object r4 = r5.d(r6, r4)     // Catch:{ Exception -> 0x00fa }
            ef.k r4 = (ef.k) r4     // Catch:{ Exception -> 0x00fa }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x00fa }
            java.util.List r4 = r4.c()     // Catch:{ Exception -> 0x00fa }
            java.lang.Object r4 = fk.p.N0(r4)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00fa }
            if (r4 != 0) goto L_0x00f4
            java.lang.String r4 = "Error"
        L_0x00f4:
            r5.<init>(r4)     // Catch:{ Exception -> 0x00fa }
            r0 = r5
            goto L_0x00fa
        L_0x00f9:
            r0 = move-exception
        L_0x00fa:
            r3.<init>(r0)
            r2.k(r3)
        L_0x0100:
            ek.i r0 = ek.i.f20112a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
