package bh;

import al.d0;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ik.d;
import kk.e;
import kk.i;
import rk.p;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$updateORGProfile$1", f = "LoginViewModel.kt", l = {497}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class s extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19162b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(LoginViewModel loginViewModel, d<? super s> dVar) {
        super(2, dVar);
        this.f19162b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new s(this.f19162b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01af A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b4 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c4 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c9 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d9 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01de A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ed A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01f9 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0249 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x024e A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x025e A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0263 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0273 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0278 A[Catch:{ Exception -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x028a A[Catch:{ Exception -> 0x000f }, RETURN] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r9.f19161a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p3.l0.Q0(r10)     // Catch:{ Exception -> 0x000f }
            goto L_0x028b
        L_0x000f:
            r10 = move-exception
            goto L_0x02c9
        L_0x0012:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001a:
            p3.l0.Q0(r10)
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            r2.p<ze.f<com.vpa.daugia.module.auth.data.model.User>> r10 = r10.f19561t     // Catch:{ Exception -> 0x000f }
            ze.f$b r1 = ze.f.b.f18005a     // Catch:{ Exception -> 0x000f }
            r10.k(r1)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r10 = r10.E     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x0052
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x0036:
            boolean r4 = r10.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r10.next()     // Catch:{ Exception -> 0x000f }
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
            java.lang.String r10 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x0053
        L_0x0052:
            r10 = r3
        L_0x0053:
            r1.setProvinceId(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r10 = r10.F     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x0082
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x0066:
            boolean r4 = r10.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x0078
            java.lang.Object r4 = r10.next()     // Catch:{ Exception -> 0x000f }
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
            java.lang.String r10 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x0083
        L_0x0082:
            r10 = r3
        L_0x0083:
            r1.setDistrictId(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r10 = r10.G     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x00b2
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x0096:
            boolean r4 = r10.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r4 = r10.next()     // Catch:{ Exception -> 0x000f }
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
            java.lang.String r10 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x00b3
        L_0x00b2:
            r10 = r3
        L_0x00b3:
            r1.setWardId(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.b>> r10 = r10.D     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x00e2
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x00c6:
            boolean r4 = r10.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x00d8
            java.lang.Object r4 = r10.next()     // Catch:{ Exception -> 0x000f }
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
            java.lang.String r10 = r4.b()     // Catch:{ Exception -> 0x000f }
            goto L_0x00e3
        L_0x00e2:
            r10 = r3
        L_0x00e3:
            r1.setBank(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x00f7
            java.lang.String r10 = r10.getAddress()     // Catch:{ Exception -> 0x000f }
            goto L_0x00f8
        L_0x00f7:
            r10 = r3
        L_0x00f8:
            r1.setAddress(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x010c
            java.lang.String r10 = r10.getEmail()     // Catch:{ Exception -> 0x000f }
            goto L_0x010d
        L_0x010c:
            r10 = r3
        L_0x010d:
            r1.setEmail(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x0121
            java.lang.String r10 = r10.getBankAccount()     // Catch:{ Exception -> 0x000f }
            goto L_0x0122
        L_0x0121:
            r10 = r3
        L_0x0122:
            r1.setBankAccount(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x0136
            java.lang.String r10 = r10.getBankAccountOwner()     // Catch:{ Exception -> 0x000f }
            goto L_0x0137
        L_0x0136:
            r10 = r3
        L_0x0137:
            r1.setBankAccountOwner(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x014b
            java.lang.String r10 = r10.getPhone()     // Catch:{ Exception -> 0x000f }
            goto L_0x014c
        L_0x014b:
            r10 = r3
        L_0x014c:
            r1.setPhone(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x0160
            java.lang.String r10 = r10.getCompanyName()     // Catch:{ Exception -> 0x000f }
            goto L_0x0161
        L_0x0160:
            r10 = r3
        L_0x0161:
            r1.setCompanyName(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x0175
            java.lang.String r10 = r10.getOrgIssuancePlace()     // Catch:{ Exception -> 0x000f }
            goto L_0x0176
        L_0x0175:
            r10 = r3
        L_0x0176:
            r1.setOrgIssuancePlace(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x018a
            java.lang.Long r10 = r10.getOrgIssuanceDate()     // Catch:{ Exception -> 0x000f }
            goto L_0x018b
        L_0x018a:
            r10 = r3
        L_0x018b:
            r1.setOrgIssuanceDate(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x019f
            java.lang.String r10 = r10.getContactPersonName()     // Catch:{ Exception -> 0x000f }
            goto L_0x01a0
        L_0x019f:
            r10 = r3
        L_0x01a0:
            r1.setContactPersonName(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x01b4
            java.lang.String r10 = r10.getTaxCode()     // Catch:{ Exception -> 0x000f }
            goto L_0x01b5
        L_0x01b4:
            r10 = r3
        L_0x01b5:
            r1.setTaxCode(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x01c9
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r10 = r10.getContactPersonIdentityCard()     // Catch:{ Exception -> 0x000f }
            goto L_0x01ca
        L_0x01c9:
            r10 = r3
        L_0x01ca:
            r1.setContactPersonIdentityCard(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x01de
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r10 = r10.getVneidPlaceOfResidence()     // Catch:{ Exception -> 0x000f }
            goto L_0x01df
        L_0x01de:
            r10 = r3
        L_0x01df:
            r1.setVneidPlaceOfResidence(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            d2.i<java.util.ArrayList<gf.a>> r10 = r10.I     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ Exception -> 0x000f }
            r1 = 0
            if (r10 == 0) goto L_0x01f6
            boolean r4 = r10.isEmpty()     // Catch:{ Exception -> 0x000f }
            if (r4 == 0) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r4 = r1
            goto L_0x01f7
        L_0x01f6:
            r4 = r2
        L_0x01f7:
            if (r4 != 0) goto L_0x023d
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r4 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x000f }
            r5.<init>()     // Catch:{ Exception -> 0x000f }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x000f }
        L_0x0204:
            boolean r6 = r10.hasNext()     // Catch:{ Exception -> 0x000f }
            if (r6 == 0) goto L_0x022c
            java.lang.Object r6 = r10.next()     // Catch:{ Exception -> 0x000f }
            r7 = r6
            gf.a r7 = (gf.a) r7     // Catch:{ Exception -> 0x000f }
            java.lang.String r8 = r7.a()     // Catch:{ Exception -> 0x000f }
            if (r8 == 0) goto L_0x0225
            java.lang.String r7 = r7.a()     // Catch:{ Exception -> 0x000f }
            java.lang.String r8 = ""
            boolean r7 = sk.j.a(r7, r8)     // Catch:{ Exception -> 0x000f }
            if (r7 != 0) goto L_0x0225
            r7 = r2
            goto L_0x0226
        L_0x0225:
            r7 = r1
        L_0x0226:
            if (r7 == 0) goto L_0x0204
            r5.add(r6)     // Catch:{ Exception -> 0x000f }
            goto L_0x0204
        L_0x022c:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x000f }
            r10.<init>(r5)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r4.K     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r1 = r1.getFrontOfIdentityCard()     // Catch:{ Exception -> 0x000f }
            if (r1 != 0) goto L_0x023a
            goto L_0x023d
        L_0x023a:
            r1.setFiles(r10)     // Catch:{ Exception -> 0x000f }
        L_0x023d:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x024e
            java.lang.String r10 = r10.getRepresentativeRole()     // Catch:{ Exception -> 0x000f }
            goto L_0x024f
        L_0x024e:
            r10 = r3
        L_0x024f:
            r1.setRepresentativeRole(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x0263
            java.lang.String r10 = r10.getContactPersonTitle()     // Catch:{ Exception -> 0x000f }
            goto L_0x0264
        L_0x0263:
            r10 = r3
        L_0x0264:
            r1.setContactPersonTitle(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r1 = r10.K     // Catch:{ Exception -> 0x000f }
            d2.i<com.vpa.daugia.module.auth.data.model.User> r10 = r10.L     // Catch:{ Exception -> 0x000f }
            T r10 = r10.f8545b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x0278
            java.lang.String r10 = r10.getOrgBusinessRegistration()     // Catch:{ Exception -> 0x000f }
            goto L_0x0279
        L_0x0278:
            r10 = r3
        L_0x0279:
            r1.setOrgBusinessRegistration(r10)     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r10 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.AuthApiHelper r1 = r10.f19546e     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.api.request.RegisterORG r10 = r10.K     // Catch:{ Exception -> 0x000f }
            r9.f19161a = r2     // Catch:{ Exception -> 0x000f }
            java.lang.Object r10 = r1.updateORGProfile(r10, r9)     // Catch:{ Exception -> 0x000f }
            if (r10 != r0) goto L_0x028b
            return r0
        L_0x028b:
            ef.k r10 = (ef.k) r10     // Catch:{ Exception -> 0x000f }
            boolean r0 = r10.e()     // Catch:{ Exception -> 0x000f }
            if (r0 == 0) goto L_0x02ad
            java.lang.Object r10 = r10.d()     // Catch:{ Exception -> 0x000f }
            com.vpa.daugia.module.auth.data.model.User r10 = (com.vpa.daugia.module.auth.data.model.User) r10     // Catch:{ Exception -> 0x000f }
            if (r10 == 0) goto L_0x030e
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            r2.p<ze.f<com.vpa.daugia.module.auth.data.model.User>> r1 = r0.f19561t     // Catch:{ Exception -> 0x000f }
            ze.f$c r2 = new ze.f$c     // Catch:{ Exception -> 0x000f }
            r2.<init>(r10)     // Catch:{ Exception -> 0x000f }
            r1.k(r2)     // Catch:{ Exception -> 0x000f }
            lg.b r0 = r0.f19545d     // Catch:{ Exception -> 0x000f }
            r0.g(r10)     // Catch:{ Exception -> 0x000f }
            goto L_0x030e
        L_0x02ad:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r9.f19162b     // Catch:{ Exception -> 0x000f }
            r2.p<ze.f<com.vpa.daugia.module.auth.data.model.User>> r0 = r0.f19561t     // Catch:{ Exception -> 0x000f }
            ze.f$a r1 = new ze.f$a     // Catch:{ Exception -> 0x000f }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x000f }
            java.util.List r10 = r10.c()     // Catch:{ Exception -> 0x000f }
            java.lang.Object r10 = fk.p.M0(r10)     // Catch:{ Exception -> 0x000f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x000f }
            r2.<init>(r10)     // Catch:{ Exception -> 0x000f }
            r1.<init>(r2)     // Catch:{ Exception -> 0x000f }
            r0.k(r1)     // Catch:{ Exception -> 0x000f }
            goto L_0x030e
        L_0x02c9:
            r10.printStackTrace()
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r9.f19162b
            r2.p<ze.f<com.vpa.daugia.module.auth.data.model.User>> r0 = r0.f19561t
            ze.f$a r1 = new ze.f$a
            boolean r2 = r10 instanceof retrofit2.HttpException     // Catch:{ Exception -> 0x0307 }
            if (r2 == 0) goto L_0x0308
            r2 = r10
            retrofit2.HttpException r2 = (retrofit2.HttpException) r2     // Catch:{ Exception -> 0x0307 }
            ul.y<?> r2 = r2.f22764a     // Catch:{ Exception -> 0x0307 }
            if (r2 == 0) goto L_0x02e5
            okhttp3.ResponseBody r2 = r2.f23248c     // Catch:{ Exception -> 0x0307 }
            if (r2 == 0) goto L_0x02e5
            java.lang.String r3 = r2.q()     // Catch:{ Exception -> 0x0307 }
        L_0x02e5:
            bc.h r2 = new bc.h     // Catch:{ Exception -> 0x0308 }
            r2.<init>()     // Catch:{ Exception -> 0x0308 }
            java.lang.Class<ef.k> r4 = ef.k.class
            java.lang.Object r2 = r2.d(r4, r3)     // Catch:{ Exception -> 0x0308 }
            ef.k r2 = (ef.k) r2     // Catch:{ Exception -> 0x0308 }
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ Exception -> 0x0308 }
            java.util.List r2 = r2.c()     // Catch:{ Exception -> 0x0308 }
            java.lang.Object r2 = fk.p.N0(r2)     // Catch:{ Exception -> 0x0308 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0308 }
            if (r2 != 0) goto L_0x0302
            java.lang.String r2 = "Error"
        L_0x0302:
            r3.<init>(r2)     // Catch:{ Exception -> 0x0308 }
            r10 = r3
            goto L_0x0308
        L_0x0307:
            r10 = move-exception
        L_0x0308:
            r1.<init>(r10)
            r0.k(r1)
        L_0x030e:
            ek.i r10 = ek.i.f20112a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
