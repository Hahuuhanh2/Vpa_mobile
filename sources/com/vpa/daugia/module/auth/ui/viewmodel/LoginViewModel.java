package com.vpa.daugia.module.auth.ui.viewmodel;

import al.d0;
import al.q1;
import al.r0;
import bc.h;
import bh.r;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.api.request.RegisterORG;
import com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile;
import com.vpa.daugia.module.auth.data.api.response.CheckRecover;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.common.data.api.CommonApiHelper;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import com.vpa.daugia.module.setting.data.model.SelectAddress;
import d2.i;
import ef.k;
import fl.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.e;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import p3.l0;
import r2.p;
import r2.v;
import retrofit2.HttpException;
import sk.j;
import ul.y;
import ze.f;

/* compiled from: LoginViewModel.kt */
public final class LoginViewModel extends v {
    public final p A;
    public final p<f<Object>> B;
    public final p C;
    public final i<ArrayList<gf.b>> D;
    public i<ArrayList<gf.b>> E;
    public i<ArrayList<gf.b>> F;
    public i<ArrayList<gf.b>> G;
    public i<ArrayList<gf.b>> H;
    public final i<ArrayList<gf.a>> I;
    public UpdatePersonProfile J;
    public RegisterORG K;
    public i<User> L;
    public p<ContactPersonIdentityCard> M;
    public final p<User> N;

    /* renamed from: d  reason: collision with root package name */
    public final lg.b f19545d;

    /* renamed from: e  reason: collision with root package name */
    public final AuthApiHelper f19546e;

    /* renamed from: f  reason: collision with root package name */
    public final SettingApiHelper f19547f;

    /* renamed from: g  reason: collision with root package name */
    public final CommonApiHelper f19548g;

    /* renamed from: h  reason: collision with root package name */
    public final kg.c f19549h;

    /* renamed from: i  reason: collision with root package name */
    public final i<String> f19550i;

    /* renamed from: j  reason: collision with root package name */
    public final i<String> f19551j;

    /* renamed from: k  reason: collision with root package name */
    public final i<String> f19552k;

    /* renamed from: l  reason: collision with root package name */
    public final i<String> f19553l;

    /* renamed from: m  reason: collision with root package name */
    public final i<String> f19554m;

    /* renamed from: n  reason: collision with root package name */
    public final p<f<Auth>> f19555n;

    /* renamed from: o  reason: collision with root package name */
    public final p f19556o;

    /* renamed from: p  reason: collision with root package name */
    public final p<f<Auth>> f19557p;

    /* renamed from: q  reason: collision with root package name */
    public final p f19558q;

    /* renamed from: r  reason: collision with root package name */
    public final p<f<Auth>> f19559r;

    /* renamed from: s  reason: collision with root package name */
    public final p f19560s;

    /* renamed from: t  reason: collision with root package name */
    public final p<f<User>> f19561t;

    /* renamed from: u  reason: collision with root package name */
    public final p f19562u;

    /* renamed from: v  reason: collision with root package name */
    public final p<f<Object>> f19563v;

    /* renamed from: w  reason: collision with root package name */
    public final p f19564w;

    /* renamed from: x  reason: collision with root package name */
    public final p<f<gf.a>> f19565x;

    /* renamed from: y  reason: collision with root package name */
    public final p f19566y;

    /* renamed from: z  reason: collision with root package name */
    public final p<f<CheckRecover>> f19567z;

    @e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getDistrict$1", f = "LoginViewModel.kt", l = {379}, m = "invokeSuspend")
    /* compiled from: LoginViewModel.kt */
    public static final class a extends kk.i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19568a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LoginViewModel f19569b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f19570c;

        @e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getDistrict$1$1", f = "LoginViewModel.kt", l = {381}, m = "invokeSuspend")
        /* renamed from: com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$a$a  reason: collision with other inner class name */
        /* compiled from: LoginViewModel.kt */
        public static final class C0272a extends kk.i implements rk.p<d0, ik.d<? super ek.i>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f19571a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ LoginViewModel f19572b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ String f19573c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0272a(LoginViewModel loginViewModel, String str, ik.d<? super C0272a> dVar) {
                super(2, dVar);
                this.f19572b = loginViewModel;
                this.f19573c = str;
            }

            public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
                return new C0272a(this.f19572b, this.f19573c, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0272a) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
            }

            public final Object invokeSuspend(Object obj) {
                ArrayList arrayList;
                String str;
                jk.a aVar = jk.a.COROUTINE_SUSPENDED;
                int i10 = this.f19571a;
                if (i10 == 0) {
                    l0.Q0(obj);
                    SettingApiHelper settingApiHelper = this.f19572b.f19547f;
                    String str2 = this.f19573c;
                    this.f19571a = 1;
                    obj = settingApiHelper.getDistrict(str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i10 == 1) {
                    try {
                        l0.Q0(obj);
                    } catch (Exception unused) {
                        this.f19572b.F.g(new ArrayList());
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k kVar = (k) obj;
                if (kVar.e()) {
                    i<ArrayList<gf.b>> iVar = this.f19572b.F;
                    ArrayList arrayList2 = (ArrayList) kVar.d();
                    if (arrayList2 != null) {
                        arrayList = LoginViewModel.e(this.f19572b, arrayList2);
                    } else {
                        arrayList = null;
                    }
                    iVar.g(arrayList);
                    LoginViewModel loginViewModel = this.f19572b;
                    ArrayList<gf.b> arrayList3 = (ArrayList) loginViewModel.F.f8545b;
                    if (arrayList3 != null) {
                        for (gf.b bVar : arrayList3) {
                            String b10 = bVar.b();
                            User user = (User) loginViewModel.L.f8545b;
                            if (user != null) {
                                str = user.getDistrictId();
                            } else {
                                str = null;
                            }
                            if (j.a(b10, str)) {
                                bVar.f10499c = true;
                            }
                        }
                    }
                }
                return ek.i.f20112a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(LoginViewModel loginViewModel, String str, ik.d<? super a> dVar) {
            super(2, dVar);
            this.f19569b = loginViewModel;
            this.f19570c = str;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new a(this.f19569b, this.f19570c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19568a;
            if (i10 == 0) {
                l0.Q0(obj);
                gl.c cVar = r0.f19084a;
                q1 q1Var = m.f20254a;
                C0272a aVar2 = new C0272a(this.f19569b, this.f19570c, (ik.d<? super C0272a>) null);
                this.f19568a = 1;
                if (l0.V0(this, q1Var, aVar2) == aVar) {
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

    @e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getProfile$1", f = "LoginViewModel.kt", l = {235, 250}, m = "invokeSuspend")
    /* compiled from: LoginViewModel.kt */
    public static final class b extends kk.i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public LoginViewModel f19574a;

        /* renamed from: b  reason: collision with root package name */
        public Auth f19575b;

        /* renamed from: c  reason: collision with root package name */
        public User f19576c;

        /* renamed from: d  reason: collision with root package name */
        public User f19577d;

        /* renamed from: e  reason: collision with root package name */
        public int f19578e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ LoginViewModel f19579f;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ Auth f19580n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(LoginViewModel loginViewModel, Auth auth, ik.d<? super b> dVar) {
            super(2, dVar);
            this.f19579f = loginViewModel;
            this.f19580n = auth;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new b(this.f19579f, this.f19580n, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:107:0x00de A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0073 A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6 A[Catch:{ Exception -> 0x016f }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c7 A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0108 A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0137 A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0151 A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0152 A[Catch:{ Exception -> 0x016f }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0164 A[Catch:{ Exception -> 0x016f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                jk.a r0 = jk.a.COROUTINE_SUSPENDED
                int r1 = r13.f19578e
                java.lang.String r2 = "pref_user_name"
                r3 = 0
                r4 = 2
                java.lang.String r5 = ""
                r6 = 0
                r7 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r7) goto L_0x0027
                if (r1 != r4) goto L_0x001f
                com.vpa.daugia.module.auth.data.model.User r0 = r13.f19577d
                com.vpa.daugia.module.auth.data.model.User r1 = r13.f19576c
                com.vpa.daugia.module.auth.data.model.Auth r4 = r13.f19575b
                com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r8 = r13.f19574a
                p3.l0.Q0(r14)     // Catch:{ Exception -> 0x016f }
                goto L_0x00a9
            L_0x001f:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0027:
                p3.l0.Q0(r14)     // Catch:{ Exception -> 0x016f }
                goto L_0x003b
            L_0x002b:
                p3.l0.Q0(r14)
                com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r14 = r13.f19579f     // Catch:{ Exception -> 0x016f }
                com.vpa.daugia.module.auth.data.api.AuthApiHelper r14 = r14.f19546e     // Catch:{ Exception -> 0x016f }
                r13.f19578e = r7     // Catch:{ Exception -> 0x016f }
                java.lang.Object r14 = r14.getProfile(r13)     // Catch:{ Exception -> 0x016f }
                if (r14 != r0) goto L_0x003b
                return r0
            L_0x003b:
                ef.k r14 = (ef.k) r14     // Catch:{ Exception -> 0x016f }
                java.lang.Object r1 = r14.d()     // Catch:{ Exception -> 0x016f }
                com.vpa.daugia.module.auth.data.model.User r1 = (com.vpa.daugia.module.auth.data.model.User) r1     // Catch:{ Exception -> 0x016f }
                if (r1 == 0) goto L_0x01b2
                com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r8 = r13.f19579f     // Catch:{ Exception -> 0x016f }
                com.vpa.daugia.module.auth.data.model.Auth r9 = r13.f19580n     // Catch:{ Exception -> 0x016f }
                boolean r14 = r14.e()     // Catch:{ Exception -> 0x016f }
                if (r14 == 0) goto L_0x01b2
                java.lang.String r14 = r1.getPersonIssuancePlace()     // Catch:{ Exception -> 0x016f }
                if (r14 == 0) goto L_0x005e
                int r14 = r14.length()     // Catch:{ Exception -> 0x016f }
                if (r14 != 0) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r14 = r6
                goto L_0x005f
            L_0x005e:
                r14 = r7
            L_0x005f:
                if (r14 == 0) goto L_0x0066
                java.lang.String r14 = "Cục Cảnh sát quản lý hành chính về trật tự xã hội"
                r1.setPersonIssuancePlace(r14)     // Catch:{ Exception -> 0x016f }
            L_0x0066:
                d2.i<com.vpa.daugia.module.auth.data.model.User> r14 = r8.L     // Catch:{ Exception -> 0x016f }
                r14.g(r1)     // Catch:{ Exception -> 0x016f }
                lg.b r14 = r8.f19545d     // Catch:{ Exception -> 0x016f }
                java.lang.String r10 = r1.getUsername()     // Catch:{ Exception -> 0x016f }
                if (r10 != 0) goto L_0x0074
                r10 = r5
            L_0x0074:
                android.content.SharedPreferences r14 = r14.f20850a     // Catch:{ Exception -> 0x016f }
                android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch:{ Exception -> 0x016f }
                android.content.SharedPreferences$Editor r14 = r14.putString(r2, r10)     // Catch:{ Exception -> 0x016f }
                r14.apply()     // Catch:{ Exception -> 0x016f }
                lg.b r14 = r8.f19545d     // Catch:{ Exception -> 0x016f }
                r14.l(r7)     // Catch:{ Exception -> 0x016f }
                r2.p<com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard> r14 = r8.M     // Catch:{ Exception -> 0x016f }
                com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r10 = r1.getFrontOfIdentityCard()     // Catch:{ Exception -> 0x016f }
                if (r10 != 0) goto L_0x0093
                com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r10 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard     // Catch:{ Exception -> 0x016f }
                r10.<init>(r3, r7, r3)     // Catch:{ Exception -> 0x016f }
            L_0x0093:
                r14.k(r10)     // Catch:{ Exception -> 0x016f }
                r13.f19574a = r8     // Catch:{ Exception -> 0x016f }
                r13.f19575b = r9     // Catch:{ Exception -> 0x016f }
                r13.f19576c = r1     // Catch:{ Exception -> 0x016f }
                r13.f19577d = r1     // Catch:{ Exception -> 0x016f }
                r13.f19578e = r4     // Catch:{ Exception -> 0x016f }
                java.lang.Object r14 = com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel.d(r8, r13)     // Catch:{ Exception -> 0x016f }
                if (r14 != r0) goto L_0x00a7
                return r0
            L_0x00a7:
                r0 = r1
                r4 = r9
            L_0x00a9:
                lg.b r14 = r8.f19545d     // Catch:{ Exception -> 0x016f }
                r14.g(r0)     // Catch:{ Exception -> 0x016f }
                r2.p<com.vpa.daugia.module.auth.data.model.User> r14 = r8.N     // Catch:{ Exception -> 0x016f }
                r14.k(r1)     // Catch:{ Exception -> 0x016f }
                com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r14 = r1.getFrontOfIdentityCard()     // Catch:{ Exception -> 0x016f }
                if (r14 == 0) goto L_0x0149
                java.util.ArrayList r14 = r14.getFiles()     // Catch:{ Exception -> 0x016f }
                if (r14 == 0) goto L_0x0149
                boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x016f }
                r14 = r14 ^ r7
                r0 = 7
                if (r14 == 0) goto L_0x0137
                d2.i<java.util.ArrayList<gf.a>> r14 = r8.I     // Catch:{ Exception -> 0x016f }
                com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r1 = r1.getFrontOfIdentityCard()     // Catch:{ Exception -> 0x016f }
                if (r1 == 0) goto L_0x010c
                java.util.ArrayList r1 = r1.getFiles()     // Catch:{ Exception -> 0x016f }
                if (r1 == 0) goto L_0x010c
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x016f }
                r9.<init>()     // Catch:{ Exception -> 0x016f }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x016f }
            L_0x00de:
                boolean r10 = r1.hasNext()     // Catch:{ Exception -> 0x016f }
                if (r10 == 0) goto L_0x010d
                java.lang.Object r10 = r1.next()     // Catch:{ Exception -> 0x016f }
                r11 = r10
                gf.a r11 = (gf.a) r11     // Catch:{ Exception -> 0x016f }
                java.lang.String r12 = r11.a()     // Catch:{ Exception -> 0x016f }
                if (r12 == 0) goto L_0x0105
                java.lang.String r11 = r11.a()     // Catch:{ Exception -> 0x016f }
                if (r11 != 0) goto L_0x00f8
                r11 = r5
            L_0x00f8:
                int r11 = r11.length()     // Catch:{ Exception -> 0x016f }
                if (r11 <= 0) goto L_0x0100
                r11 = r7
                goto L_0x0101
            L_0x0100:
                r11 = r6
            L_0x0101:
                if (r11 == 0) goto L_0x0105
                r11 = r7
                goto L_0x0106
            L_0x0105:
                r11 = r6
            L_0x0106:
                if (r11 == 0) goto L_0x00de
                r9.add(r10)     // Catch:{ Exception -> 0x016f }
                goto L_0x00de
            L_0x010c:
                r9 = r3
            L_0x010d:
                java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<com.ots.core.base.model.File>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ots.core.base.model.File> }"
                sk.j.d(r9, r1)     // Catch:{ Exception -> 0x016f }
                r14.g(r9)     // Catch:{ Exception -> 0x016f }
                d2.i<com.vpa.daugia.module.auth.data.model.User> r14 = r8.L     // Catch:{ Exception -> 0x016f }
                T r14 = r14.f8545b     // Catch:{ Exception -> 0x016f }
                com.vpa.daugia.module.auth.data.model.User r14 = (com.vpa.daugia.module.auth.data.model.User) r14     // Catch:{ Exception -> 0x016f }
                if (r14 == 0) goto L_0x0124
                boolean r14 = r14.getIsEdit()     // Catch:{ Exception -> 0x016f }
                if (r14 != r7) goto L_0x0124
                r6 = r7
            L_0x0124:
                if (r6 == 0) goto L_0x0149
                d2.i<java.util.ArrayList<gf.a>> r14 = r8.I     // Catch:{ Exception -> 0x016f }
                T r14 = r14.f8545b     // Catch:{ Exception -> 0x016f }
                java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch:{ Exception -> 0x016f }
                if (r14 == 0) goto L_0x0149
                gf.a r1 = new gf.a     // Catch:{ Exception -> 0x016f }
                r1.<init>(r3, r3, r0)     // Catch:{ Exception -> 0x016f }
                r14.add(r1)     // Catch:{ Exception -> 0x016f }
                goto L_0x0149
            L_0x0137:
                d2.i<java.util.ArrayList<gf.a>> r14 = r8.I     // Catch:{ Exception -> 0x016f }
                gf.a[] r1 = new gf.a[r7]     // Catch:{ Exception -> 0x016f }
                gf.a r7 = new gf.a     // Catch:{ Exception -> 0x016f }
                r7.<init>(r3, r3, r0)     // Catch:{ Exception -> 0x016f }
                r1[r6] = r7     // Catch:{ Exception -> 0x016f }
                java.util.ArrayList r0 = j7.a.e(r1)     // Catch:{ Exception -> 0x016f }
                r14.g(r0)     // Catch:{ Exception -> 0x016f }
            L_0x0149:
                d2.i<java.lang.String> r14 = r8.f19550i     // Catch:{ Exception -> 0x016f }
                T r14 = r14.f8545b     // Catch:{ Exception -> 0x016f }
                java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x016f }
                if (r14 != 0) goto L_0x0152
                goto L_0x0153
            L_0x0152:
                r5 = r14
            L_0x0153:
                lg.b r14 = r8.f19545d     // Catch:{ Exception -> 0x016f }
                android.content.SharedPreferences r14 = r14.f20850a     // Catch:{ Exception -> 0x016f }
                android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch:{ Exception -> 0x016f }
                android.content.SharedPreferences$Editor r14 = r14.putString(r2, r5)     // Catch:{ Exception -> 0x016f }
                r14.apply()     // Catch:{ Exception -> 0x016f }
                if (r4 == 0) goto L_0x01b2
                r2.p<ze.f<com.vpa.daugia.module.auth.data.model.Auth>> r14 = r8.f19555n     // Catch:{ Exception -> 0x016f }
                ze.f$c r0 = new ze.f$c     // Catch:{ Exception -> 0x016f }
                r0.<init>(r4)     // Catch:{ Exception -> 0x016f }
                r14.k(r0)     // Catch:{ Exception -> 0x016f }
                goto L_0x01b2
            L_0x016f:
                r14 = move-exception
                com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r13.f19579f
                r2.p<ze.f<com.vpa.daugia.module.auth.data.model.Auth>> r0 = r0.f19555n
                ze.f$a r1 = new ze.f$a
                boolean r2 = r14 instanceof retrofit2.HttpException     // Catch:{ Exception -> 0x01ab }
                if (r2 == 0) goto L_0x01ac
                r2 = r14
                retrofit2.HttpException r2 = (retrofit2.HttpException) r2     // Catch:{ Exception -> 0x01ab }
                ul.y<?> r2 = r2.f22764a     // Catch:{ Exception -> 0x01ab }
                if (r2 == 0) goto L_0x0189
                okhttp3.ResponseBody r2 = r2.f23248c     // Catch:{ Exception -> 0x01ab }
                if (r2 == 0) goto L_0x0189
                java.lang.String r3 = r2.q()     // Catch:{ Exception -> 0x01ab }
            L_0x0189:
                bc.h r2 = new bc.h     // Catch:{ Exception -> 0x01ac }
                r2.<init>()     // Catch:{ Exception -> 0x01ac }
                java.lang.Class<ef.k> r4 = ef.k.class
                java.lang.Object r2 = r2.d(r4, r3)     // Catch:{ Exception -> 0x01ac }
                ef.k r2 = (ef.k) r2     // Catch:{ Exception -> 0x01ac }
                java.lang.Exception r3 = new java.lang.Exception     // Catch:{ Exception -> 0x01ac }
                java.util.List r2 = r2.c()     // Catch:{ Exception -> 0x01ac }
                java.lang.Object r2 = fk.p.N0(r2)     // Catch:{ Exception -> 0x01ac }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x01ac }
                if (r2 != 0) goto L_0x01a6
                java.lang.String r2 = "Error"
            L_0x01a6:
                r3.<init>(r2)     // Catch:{ Exception -> 0x01ac }
                r14 = r3
                goto L_0x01ac
            L_0x01ab:
                r14 = move-exception
            L_0x01ac:
                r1.<init>(r14)
                r0.k(r1)
            L_0x01b2:
                ek.i r14 = ek.i.f20112a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getWard$1", f = "LoginViewModel.kt", l = {401}, m = "invokeSuspend")
    /* compiled from: LoginViewModel.kt */
    public static final class c extends kk.i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19581a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LoginViewModel f19582b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f19583c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(LoginViewModel loginViewModel, String str, ik.d<? super c> dVar) {
            super(2, dVar);
            this.f19582b = loginViewModel;
            this.f19583c = str;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new c(this.f19582b, this.f19583c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            String str;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19581a;
            if (i10 == 0) {
                l0.Q0(obj);
                SettingApiHelper settingApiHelper = this.f19582b.f19547f;
                String str2 = this.f19583c;
                this.f19581a = 1;
                obj = settingApiHelper.getWard(str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception unused) {
                    this.f19582b.G.g(new ArrayList());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                i<ArrayList<gf.b>> iVar = this.f19582b.G;
                ArrayList arrayList2 = (ArrayList) kVar.d();
                if (arrayList2 != null) {
                    arrayList = LoginViewModel.e(this.f19582b, arrayList2);
                } else {
                    arrayList = null;
                }
                iVar.g(arrayList);
                LoginViewModel loginViewModel = this.f19582b;
                ArrayList<gf.b> arrayList3 = (ArrayList) loginViewModel.G.f8545b;
                if (arrayList3 != null) {
                    for (gf.b bVar : arrayList3) {
                        String b10 = bVar.b();
                        User user = (User) loginViewModel.L.f8545b;
                        if (user != null) {
                            str = user.getWardId();
                        } else {
                            str = null;
                        }
                        if (j.a(b10, str)) {
                            bVar.f10499c = true;
                        }
                    }
                }
            } else {
                this.f19582b.G.g(new ArrayList());
            }
            return ek.i.f20112a;
        }
    }

    @e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$upload$1", f = "LoginViewModel.kt", l = {683}, m = "invokeSuspend")
    /* compiled from: LoginViewModel.kt */
    public static final class d extends kk.i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19584a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LoginViewModel f19585b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List<MultipartBody.Part> f19586c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(LoginViewModel loginViewModel, List<MultipartBody.Part> list, ik.d<? super d> dVar) {
            super(2, dVar);
            this.f19585b = loginViewModel;
            this.f19586c = list;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new d(this.f19585b, this.f19586c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            gf.a aVar;
            String str;
            ResponseBody responseBody;
            jk.a aVar2 = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19584a;
            if (i10 == 0) {
                l0.Q0(obj);
                this.f19585b.f19565x.k(f.b.f18005a);
                CommonApiHelper commonApiHelper = this.f19585b.f19548g;
                List<MultipartBody.Part> list = this.f19586c;
                this.f19584a = 1;
                obj = commonApiHelper.uploadImage(list, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    e = e10;
                    p<f<gf.a>> pVar = this.f19585b.f19565x;
                    try {
                        if (e instanceof HttpException) {
                            y<?> yVar = ((HttpException) e).f22764a;
                            if (yVar == null || (responseBody = yVar.f23248c) == null) {
                                str = null;
                            } else {
                                str = responseBody.q();
                            }
                            try {
                                String str2 = (String) fk.p.N0(((k) new h().d(k.class, str)).c());
                                if (str2 == null) {
                                    str2 = "Error";
                                }
                                e = new Exception(str2);
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                    pVar.k(new f.a(e));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e() && (aVar = (gf.a) kVar.d()) != null) {
                this.f19585b.f19565x.k(new f.c(aVar));
            }
            return ek.i.f20112a;
        }
    }

    public LoginViewModel(lg.b bVar, h hVar, AuthApiHelper authApiHelper, SettingApiHelper settingApiHelper, CommonApiHelper commonApiHelper, kg.c cVar) {
        lg.b bVar2 = bVar;
        AuthApiHelper authApiHelper2 = authApiHelper;
        SettingApiHelper settingApiHelper2 = settingApiHelper;
        CommonApiHelper commonApiHelper2 = commonApiHelper;
        kg.c cVar2 = cVar;
        j.f(bVar2, "sharedPrefsHelper");
        j.f(hVar, "jsonParser");
        j.f(authApiHelper2, "authApiHelper");
        j.f(settingApiHelper2, "settingApiHelper");
        j.f(commonApiHelper2, "commonApiHelper");
        j.f(cVar2, "serviceCache");
        this.f19545d = bVar2;
        this.f19546e = authApiHelper2;
        this.f19547f = settingApiHelper2;
        this.f19548g = commonApiHelper2;
        this.f19549h = cVar2;
        new i("");
        new i("");
        new i("");
        new i("");
        new i("");
        String string = bVar2.f20850a.getString("pref_user_name", "");
        this.f19550i = new i<>(string == null ? "" : string);
        this.f19551j = new i<>("");
        this.f19552k = new i<>("");
        this.f19553l = new i<>("");
        this.f19554m = new i<>("");
        p<f<Auth>> pVar = new p<>();
        this.f19555n = pVar;
        this.f19556o = pVar;
        p<f<Auth>> pVar2 = new p<>();
        this.f19557p = pVar2;
        this.f19558q = pVar2;
        p<f<Auth>> pVar3 = new p<>();
        this.f19559r = pVar3;
        this.f19560s = pVar3;
        p<f<User>> pVar4 = new p<>();
        this.f19561t = pVar4;
        this.f19562u = pVar4;
        p<f<Object>> pVar5 = new p<>();
        this.f19563v = pVar5;
        this.f19564w = pVar5;
        p<f<gf.a>> pVar6 = new p<>();
        this.f19565x = pVar6;
        this.f19566y = pVar6;
        p<f<CheckRecover>> pVar7 = new p<>();
        this.f19567z = pVar7;
        this.A = pVar7;
        p<f<Object>> pVar8 = new p<>();
        this.B = pVar8;
        this.C = pVar8;
        this.D = new i<>(new ArrayList());
        this.E = new i<>(new ArrayList());
        this.F = new i<>(new ArrayList());
        this.G = new i<>(new ArrayList());
        this.H = new i<>(j7.a.e(new gf.b("Cục Cảnh sát quản lý hành chính về trật tự xã hội", false, "Cục Cảnh sát quản lý hành chính về trật tự xã hội", (Integer) null, 54), new gf.b("Cục Cảnh sát ĐKQL cư trú và DLQG về dân cư", false, "Cục Cảnh sát ĐKQL cư trú và DLQG về dân cư", (Integer) null, 54)));
        this.I = new i<>(j7.a.e(new gf.a((String) null, (String) null, 7)));
        this.J = new UpdatePersonProfile((String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1048575, (sk.e) null);
        this.K = new RegisterORG((String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16777215, (sk.e) null);
        this.L = new i<>(new User((Integer) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (Object) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Object) null, (String) null, (Integer) null, (Object) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (sk.e) null));
        this.M = new p<>();
        this.N = new p<>();
        this.L.g(new User((Integer) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (Object) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Object) null, (String) null, (Integer) null, (Object) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (sk.e) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7, ik.d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof bh.p
            if (r0 == 0) goto L_0x0016
            r0 = r8
            bh.p r0 = (bh.p) r0
            int r1 = r0.f19157d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f19157d = r1
            goto L_0x001b
        L_0x0016:
            bh.p r0 = new bh.p
            r0.<init>(r7, r8)
        L_0x001b:
            java.lang.Object r8 = r0.f19155b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19157d
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r7 = r0.f19154a
            p3.l0.Q0(r8)
            goto L_0x0065
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            p3.l0.Q0(r8)
            al.d0 r8 = p3.l0.d0(r7)
            gl.b r2 = al.r0.f19085b
            bh.e r4 = new bh.e
            r5 = 0
            r4.<init>(r7, r5)
            r6 = 2
            p3.l0.j0(r8, r2, r4, r6)
            al.d0 r8 = p3.l0.d0(r7)
            bh.d r4 = new bh.d
            r4.<init>(r7, r5)
            p3.l0.j0(r8, r2, r4, r6)
            al.q1 r8 = fl.m.f20254a
            bh.q r2 = new bh.q
            r2.<init>(r7, r5)
            r0.f19154a = r7
            r0.f19157d = r3
            java.lang.Object r8 = p3.l0.V0(r0, r8, r2)
            if (r8 != r1) goto L_0x0065
            goto L_0x007a
        L_0x0065:
            com.vpa.daugia.di.App$a r8 = com.vpa.daugia.di.App.f19364o
            com.vpa.daugia.di.App r8 = r8.a()
            lg.b r7 = r7.f19545d
            java.lang.String r7 = r7.a()
            java.lang.String r0 = "<set-?>"
            sk.j.f(r7, r0)
            r8.f19366d = r7
            ek.i r1 = ek.i.f20112a
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel.d(com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel, ik.d):java.lang.Object");
    }

    public static final ArrayList e(LoginViewModel loginViewModel, ArrayList arrayList) {
        loginViewModel.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SelectAddress selectAddress = (SelectAddress) it.next();
            j.c(selectAddress);
            arrayList2.add(new gf.b(selectAddress.getFullName(), false, selectAddress.getCode(), (Integer) null, 54));
        }
        return arrayList2;
    }

    public static final void f(LoginViewModel loginViewModel) {
        l0.j0(l0.d0(loginViewModel), r0.f19085b, new r(loginViewModel, (ik.d<? super r>) null), 2);
    }

    public final void g(String str) {
        j.f(str, "provinceId");
        l0.j0(l0.d0(this), r0.f19085b, new a(this, str, (ik.d<? super a>) null), 2);
    }

    public final void h(Auth auth) {
        l0.j0(l0.d0(this), r0.f19085b, new b(this, auth, (ik.d<? super b>) null), 2);
    }

    public final void i(String str) {
        j.f(str, "districtId");
        l0.j0(l0.d0(this), r0.f19085b, new c(this, str, (ik.d<? super c>) null), 2);
    }

    public final void j(List<MultipartBody.Part> list) {
        j.f(list, "multipart");
        l0.j0(l0.d0(this), r0.f19085b, new d(this, list, (ik.d<? super d>) null), 2);
    }
}
