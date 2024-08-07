package bh;

import al.d0;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ik.d;
import kk.e;
import kk.i;
import rk.p;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$updatePersonProfile$1", f = "LoginViewModel.kt", l = {443}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class t extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19163a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19164b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(LoginViewModel loginViewModel, d<? super t> dVar) {
        super(2, dVar);
        this.f19164b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new t(this.f19164b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01af A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b4 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c4 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f4 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01f9 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x020b A[Catch:{ Exception -> 0x000f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c2 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f2 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f7 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0107 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011c A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0121 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0131 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0136 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0146 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014b A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015b A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0160 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0170 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0175 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0185 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018a A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019a A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019f A[Catch:{ Exception -> 0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r6.f19163a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p3.l0.Q0(r7)     // Catch:{ Exception -> 0x000f }
            goto L_0x020c
        L_0x000f:
            r7 = move-exception
            goto L_0x024a
        L_0x0012:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001a:
            p3.l0.Q0(r7)
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            r2.p<ze.f<com.vpa.daugia.module.auth.data.model.User>> r7 = r7.f19561t     // Catch:{ Exception -> 0x000f }
            ze.f$b r1 = ze.f.b.f18005a     // Catch:{ Exception -> 0x000f }
            r7.k(r1)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r7 = r7.E     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x0052
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x0036:
            boolean r4 = r7.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r7.next()     // Catch:{ Exception -> 0x000f }
            r5 = r4
            gf.b r5 = (gf.b) r5     // Catch:{ Exception -> 0x000f }
            boolean r5 = r5.f10499c     // Catch:{ Exception -> 0x000f }
            if (r5 == 0) goto L_0x0036
            goto L_0x0049
        L_0x0048:
            r4 = r3
        L_0x0049:
            gf.b r4 = (gf.b) r4     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x0052
            java.lang.String r7 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x0053
        L_0x0052:
            r7 = r3
        L_0x0053:
            r1.setProvinceId(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r7 = r7.F     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x0082
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x0066:
            boolean r4 = r7.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x0078
            java.lang.Object r4 = r7.next()     // Catch:{ Exception -> 0x000f }
            r5 = r4
            gf.b r5 = (gf.b) r5     // Catch:{ Exception -> 0x000f }
            boolean r5 = r5.f10499c     // Catch:{ Exception -> 0x000f }
            if (r5 == 0) goto L_0x0066
            goto L_0x0079
        L_0x0078:
            r4 = r3
        L_0x0079:
            gf.b r4 = (gf.b) r4     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x0082
            java.lang.String r7 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x0083
        L_0x0082:
            r7 = r3
        L_0x0083:
            r1.setDistrictId(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r7 = r7.G     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x00b2
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x0096:
            boolean r4 = r7.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r4 = r7.next()     // Catch:{ Exception -> 0x000f }
            r5 = r4
            gf.b r5 = (gf.b) r5     // Catch:{ Exception -> 0x000f }
            boolean r5 = r5.f10499c     // Catch:{ Exception -> 0x000f }
            if (r5 == 0) goto L_0x0096
            goto L_0x00a9
        L_0x00a8:
            r4 = r3
        L_0x00a9:
            gf.b r4 = (gf.b) r4     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x00b2
            java.lang.String r7 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x00b3
        L_0x00b2:
            r7 = r3
        L_0x00b3:
            r1.setWardId(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r7 = r7.D     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x00e2
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x00c6:
            boolean r4 = r7.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x00d8
            java.lang.Object r4 = r7.next()     // Catch:{ Exception -> 0x000f }
            r5 = r4
            gf.b r5 = (gf.b) r5     // Catch:{ Exception -> 0x000f }
            boolean r5 = r5.f10499c     // Catch:{ Exception -> 0x000f }
            if (r5 == 0) goto L_0x00c6
            goto L_0x00d9
        L_0x00d8:
            r4 = r3
        L_0x00d9:
            gf.b r4 = (gf.b) r4     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x00e2
            java.lang.String r7 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x00e3
        L_0x00e2:
            r7 = r3
        L_0x00e3:
            r1.setBank(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x00f7
            java.lang.String r7 = r7.getEmail()     // Catch:{ Exception -> 0x000f }
            goto L_0x00f8
        L_0x00f7:
            r7 = r3
        L_0x00f8:
            r1.setEmail(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x010c
            java.lang.String r7 = r7.getBankAccount()     // Catch:{ Exception -> 0x000f }
            goto L_0x010d
        L_0x010c:
            r7 = r3
        L_0x010d:
            r1.setBankAccount(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x0121
            java.lang.String r7 = r7.getBankAccountOwner()     // Catch:{ Exception -> 0x000f }
            goto L_0x0122
        L_0x0121:
            r7 = r3
        L_0x0122:
            r1.setBankAccountOwner(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x0136
            java.lang.String r7 = r7.getPhone()     // Catch:{ Exception -> 0x000f }
            goto L_0x0137
        L_0x0136:
            r7 = r3
        L_0x0137:
            r1.setPhone(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x014b
            java.lang.String r7 = r7.getFullname()     // Catch:{ Exception -> 0x000f }
            goto L_0x014c
        L_0x014b:
            r7 = r3
        L_0x014c:
            r1.setFullname(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x0160
            java.lang.String r7 = r7.getIdentityNumber()     // Catch:{ Exception -> 0x000f }
            goto L_0x0161
        L_0x0160:
            r7 = r3
        L_0x0161:
            r1.setIdentityNumber(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x0175
            java.lang.String r7 = r7.getPersonIssuancePlace()     // Catch:{ Exception -> 0x000f }
            goto L_0x0176
        L_0x0175:
            r7 = r3
        L_0x0176:
            r1.setPersonIssuancePlace(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x018a
            java.lang.Long r7 = r7.getPersonIssuanceDate()     // Catch:{ Exception -> 0x000f }
            goto L_0x018b
        L_0x018a:
            r7 = r3
        L_0x018b:
            r1.setPersonIssuanceDate(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x019f
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r7 = r7.getFrontOfIdentityCard()     // Catch:{ Exception -> 0x000f }
            goto L_0x01a0
        L_0x019f:
            r7 = r3
        L_0x01a0:
            r1.setFrontOfIdentityCard(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x01b4
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r7 = r7.getVneidPlaceOfResidence()     // Catch:{ Exception -> 0x000f }
            goto L_0x01b5
        L_0x01b4:
            r7 = r3
        L_0x01b5:
            r1.setVneidPlaceOfResidence(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r7 = r7.H     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x01e4
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x01c8:
            boolean r4 = r7.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x01da
            java.lang.Object r4 = r7.next()     // Catch:{ Exception -> 0x000f }
            r5 = r4
            gf.b r5 = (gf.b) r5     // Catch:{ Exception -> 0x000f }
            boolean r5 = r5.f10499c     // Catch:{ Exception -> 0x000f }
            if (r5 == 0) goto L_0x01c8
            goto L_0x01db
        L_0x01da:
            r4 = r3
        L_0x01db:
            gf.b r4 = (gf.b) r4     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x01e4
            java.lang.String r7 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x01e5
        L_0x01e4:
            r7 = r3
        L_0x01e5:
            r1.setPersonIssuancePlace(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r1 = r7.J     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r7.L     // Catch:{ Exception -> 0x000f }
            T r7 = r7.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x01f9
            java.lang.String r7 = r7.getAddress()     // Catch:{ Exception -> 0x000f }
            goto L_0x01fa
        L_0x01f9:
            r7 = r3
        L_0x01fa:
            r1.setAddress(r7)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.AuthApiHelper r1 = r7.f19546e     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile r7 = r7.J     // Catch:{ Exception -> 0x000f }
            r6.f19163a = r2     // Catch:{ Exception -> 0x000f }
            java.lang.Object r7 = r1.updatePersonProfile(r7, r6)     // Catch:{ Exception -> 0x000f }
            if (r7 != r0) goto L_0x020c
            return r0
        L_0x020c:
            ef.k r7 = (ef.k) r7     // Catch:{ Exception -> 0x000f }
            boolean r0 = r7.e()     // Catch:{ Exception -> 0x000f }
            if (r0 == 0) goto L_0x022e
            java.lang.Object r7 = r7.d()     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7     // Catch:{ Exception -> 0x000f }
            if (r7 == 0) goto L_0x028c
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            r2.p<ze.f<com.vpa.daugia.module.auth.data.model.User>> r1 = r0.f19561t     // Catch:{ Exception -> 0x000f }
            ze.f$c r2 = new ze.f$c     // Catch:{ Exception -> 0x000f }
            r2.<init>(r7)     // Catch:{ Exception -> 0x000f }
            r1.k(r2)     // Catch:{ Exception -> 0x000f }
            lg.b r0 = r0.f19545d     // Catch:{ Exception -> 0x000f }
            r0.g(r7)     // Catch:{ Exception -> 0x000f }
            goto L_0x028c
        L_0x022e:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r6.f19164b     // Catch:{ Exception -> 0x000f }
            r2.p<ze.f<com.vpa.daugia.module.auth.data.model.User>> r0 = r0.f19561t     // Catch:{ Exception -> 0x000f }
            ze.f$a r1 = new ze.f$a     // Catch:{ Exception -> 0x000f }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x000f }
            java.util.List r7 = r7.c()     // Catch:{ Exception -> 0x000f }
            java.lang.Object r7 = fk.p.M0(r7)     // Catch:{ Exception -> 0x000f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x000f }
            r2.<init>(r7)     // Catch:{ Exception -> 0x000f }
            r1.<init>(r2)     // Catch:{ Exception -> 0x000f }
            r0.k(r1)     // Catch:{ Exception -> 0x000f }
            goto L_0x028c
        L_0x024a:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r6.f19164b
            r2.p<ze.f<com.vpa.daugia.module.auth.data.model.User>> r0 = r0.f19561t
            ze.f$a r1 = new ze.f$a
            boolean r2 = r7 instanceof retrofit2.HttpException     // Catch:{ Exception -> 0x0285 }
            if (r2 == 0) goto L_0x0286
            r2 = r7
            retrofit2.HttpException r2 = (retrofit2.HttpException) r2     // Catch:{ Exception -> 0x0285 }
            ul.y<?> r2 = r2.f22764a     // Catch:{ Exception -> 0x0285 }
            if (r2 == 0) goto L_0x0263
            okhttp3.ResponseBody r2 = r2.f23248c     // Catch:{ Exception -> 0x0285 }
            if (r2 == 0) goto L_0x0263
            java.lang.String r3 = r2.q()     // Catch:{ Exception -> 0x0285 }
        L_0x0263:
            bc.h r2 = new bc.h     // Catch:{ Exception -> 0x0286 }
            r2.<init>()     // Catch:{ Exception -> 0x0286 }
            java.lang.Class<ef.k> r4 = ef.k.class
            java.lang.Object r2 = r2.d(r4, r3)     // Catch:{ Exception -> 0x0286 }
            ef.k r2 = (ef.k) r2     // Catch:{ Exception -> 0x0286 }
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ Exception -> 0x0286 }
            java.util.List r2 = r2.c()     // Catch:{ Exception -> 0x0286 }
            java.lang.Object r2 = fk.p.N0(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0286 }
            if (r2 != 0) goto L_0x0280
            java.lang.String r2 = "Error"
        L_0x0280:
            r3.<init>(r2)     // Catch:{ Exception -> 0x0286 }
            r7 = r3
            goto L_0x0286
        L_0x0285:
            r7 = move-exception
        L_0x0286:
            r1.<init>(r7)
            r0.k(r1)
        L_0x028c:
            ek.i r7 = ek.i.f20112a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
