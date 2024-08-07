package ng;

import al.g0;
import android.content.SharedPreferences;
import bc.h;
import com.airbnb.lottie.c;
import com.vpa.daugia.data.local.auth.BaseServiceCacheDatabase;
import com.vpa.daugia.di.App;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.api.AuctionService;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.api.AuthService;
import com.vpa.daugia.module.cart.data.api.CartApiHelper;
import com.vpa.daugia.module.cart.data.api.CartService;
import com.vpa.daugia.module.common.data.api.CommonApiHelper;
import com.vpa.daugia.module.common.data.api.CommonService;
import com.vpa.daugia.module.history.data.api.HistoryApiHelper;
import com.vpa.daugia.module.history.data.api.HistoryService;
import com.vpa.daugia.module.home.data.api.HomeApiHelper;
import com.vpa.daugia.module.home.data.api.HomeService;
import com.vpa.daugia.module.notification.data.api.NotificationApiHelper;
import com.vpa.daugia.module.notification.data.api.NotificationService;
import com.vpa.daugia.module.payment.data.api.PaymentApiHelper;
import com.vpa.daugia.module.payment.data.api.PaymentService;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import com.vpa.daugia.module.setting.data.api.SettingService;
import com.vpa.daugia.module.support.data.api.SupportApiHelper;
import com.vpa.daugia.module.support.data.api.SupportService;
import lb.b;
import n0.l;
import og.d;
import og.e;
import og.f;
import okhttp3.OkHttpClient;
import ul.z;

/* compiled from: DaggerApp_HiltComponents_SingletonC */
public final class p extends f {
    public dk.a<SettingService> A;
    public dk.a<SettingApiHelper> B;
    public dk.a<CartService> C;
    public dk.a<CartApiHelper> D;
    public dk.a<HistoryService> E;
    public dk.a<HistoryApiHelper> F;
    public dk.a<HomeService> G;
    public dk.a<HomeApiHelper> H;
    public dk.a<AuthService> I;
    public dk.a<AuthApiHelper> J;
    public dk.a<NotificationService> K;
    public dk.a<NotificationApiHelper> L;
    public dk.a<PaymentService> M;
    public dk.a<PaymentApiHelper> N;
    public dk.a<SupportService> O;
    public dk.a<SupportApiHelper> P;

    /* renamed from: a  reason: collision with root package name */
    public final e f21587a;

    /* renamed from: b  reason: collision with root package name */
    public final c f21588b;

    /* renamed from: c  reason: collision with root package name */
    public final b f21589c;

    /* renamed from: d  reason: collision with root package name */
    public final d f21590d;

    /* renamed from: e  reason: collision with root package name */
    public final a.a f21591e;

    /* renamed from: f  reason: collision with root package name */
    public final f f21592f;

    /* renamed from: g  reason: collision with root package name */
    public final b f21593g;

    /* renamed from: h  reason: collision with root package name */
    public final b f21594h;

    /* renamed from: i  reason: collision with root package name */
    public final a.a f21595i;

    /* renamed from: j  reason: collision with root package name */
    public final b f21596j;

    /* renamed from: k  reason: collision with root package name */
    public final g0 f21597k;

    /* renamed from: l  reason: collision with root package name */
    public final a.a f21598l;

    /* renamed from: m  reason: collision with root package name */
    public final g0 f21599m;

    /* renamed from: n  reason: collision with root package name */
    public final b f21600n;

    /* renamed from: o  reason: collision with root package name */
    public final p f21601o = this;

    /* renamed from: p  reason: collision with root package name */
    public dk.a<SharedPreferences> f21602p;

    /* renamed from: q  reason: collision with root package name */
    public dk.a<lg.b> f21603q;

    /* renamed from: r  reason: collision with root package name */
    public dk.a<h> f21604r;

    /* renamed from: s  reason: collision with root package name */
    public dk.a<OkHttpClient> f21605s;

    /* renamed from: t  reason: collision with root package name */
    public dk.a<z> f21606t;

    /* renamed from: u  reason: collision with root package name */
    public dk.a<AuctionService> f21607u;

    /* renamed from: v  reason: collision with root package name */
    public dk.a<AuctionApiHelper> f21608v;

    /* renamed from: w  reason: collision with root package name */
    public dk.a<CommonService> f21609w;

    /* renamed from: x  reason: collision with root package name */
    public dk.a<CommonApiHelper> f21610x;

    /* renamed from: y  reason: collision with root package name */
    public dk.a<BaseServiceCacheDatabase> f21611y;

    /* renamed from: z  reason: collision with root package name */
    public dk.a<kg.c> f21612z;

    /* compiled from: DaggerApp_HiltComponents_SingletonC */
    public static final class a<T> implements dk.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final p f21613a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21614b;

        public a(p pVar, int i10) {
            this.f21613a = pVar;
            this.f21614b = i10;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:90|91) */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            r1 = new android.security.keystore.KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(new java.lang.String[]{"GCM"}).setEncryptionPaddings(new java.lang.String[]{"NoPadding"}).setKeySize(256).build();
            sk.j.e(r1, "build(...)");
            r5 = new b3.b.a(r3);
            r5.b(r1);
            r1 = r5.a();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0423 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T get() {
            /*
                r10 = this;
                int r0 = r10.f21614b
                r1 = 1
                r2 = 0
                java.lang.String r3 = "Cannot return null from a non-@Nullable @Provides method"
                java.lang.String r4 = "sharedPrefsHelper"
                java.lang.String r5 = "create(...)"
                java.lang.String r6 = "retrofit"
                switch(r0) {
                    case 0: goto L_0x0486;
                    case 1: goto L_0x03ee;
                    case 2: goto L_0x03d4;
                    case 3: goto L_0x03b6;
                    case 4: goto L_0x02d0;
                    case 5: goto L_0x02c3;
                    case 6: goto L_0x0267;
                    case 7: goto L_0x024d;
                    case 8: goto L_0x022f;
                    case 9: goto L_0x0209;
                    case 10: goto L_0x01e1;
                    case 11: goto L_0x01c7;
                    case 12: goto L_0x01a9;
                    case 13: goto L_0x018f;
                    case 14: goto L_0x0171;
                    case 15: goto L_0x0157;
                    case 16: goto L_0x0139;
                    case 17: goto L_0x011f;
                    case 18: goto L_0x0101;
                    case 19: goto L_0x00dd;
                    case 20: goto L_0x00bf;
                    case 21: goto L_0x00a5;
                    case 22: goto L_0x0087;
                    case 23: goto L_0x006d;
                    case 24: goto L_0x004f;
                    case 25: goto L_0x0035;
                    case 26: goto L_0x0017;
                    default: goto L_0x000f;
                }
            L_0x000f:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                int r1 = r10.f21614b
                r0.<init>(r1)
                throw r0
            L_0x0017:
                ng.p r0 = r10.f21613a
                lb.b r1 = r0.f21600n
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.support.data.api.SupportService> r1 = com.vpa.daugia.module.support.data.api.SupportService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.support.data.api.SupportService r0 = (com.vpa.daugia.module.support.data.api.SupportService) r0
                return r0
            L_0x0035:
                com.vpa.daugia.module.support.data.api.SupportApiHelper r0 = new com.vpa.daugia.module.support.data.api.SupportApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.support.data.api.SupportService> r1 = r1.O
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.support.data.api.SupportService r1 = (com.vpa.daugia.module.support.data.api.SupportService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x004f:
                ng.p r0 = r10.f21613a
                al.g0 r1 = r0.f21599m
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.payment.data.api.PaymentService> r1 = com.vpa.daugia.module.payment.data.api.PaymentService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.payment.data.api.PaymentService r0 = (com.vpa.daugia.module.payment.data.api.PaymentService) r0
                return r0
            L_0x006d:
                com.vpa.daugia.module.payment.data.api.PaymentApiHelper r0 = new com.vpa.daugia.module.payment.data.api.PaymentApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.payment.data.api.PaymentService> r1 = r1.M
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.payment.data.api.PaymentService r1 = (com.vpa.daugia.module.payment.data.api.PaymentService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x0087:
                ng.p r0 = r10.f21613a
                a.a r1 = r0.f21598l
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.notification.data.api.NotificationService> r1 = com.vpa.daugia.module.notification.data.api.NotificationService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.notification.data.api.NotificationService r0 = (com.vpa.daugia.module.notification.data.api.NotificationService) r0
                return r0
            L_0x00a5:
                com.vpa.daugia.module.notification.data.api.NotificationApiHelper r0 = new com.vpa.daugia.module.notification.data.api.NotificationApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.notification.data.api.NotificationService> r1 = r1.K
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.notification.data.api.NotificationService r1 = (com.vpa.daugia.module.notification.data.api.NotificationService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x00bf:
                ng.p r0 = r10.f21613a
                al.g0 r1 = r0.f21597k
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.auth.data.api.AuthService> r1 = com.vpa.daugia.module.auth.data.api.AuthService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.auth.data.api.AuthService r0 = (com.vpa.daugia.module.auth.data.api.AuthService) r0
                return r0
            L_0x00dd:
                com.vpa.daugia.module.auth.data.api.AuthApiHelper r0 = new com.vpa.daugia.module.auth.data.api.AuthApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.auth.data.api.AuthService> r1 = r1.I
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.auth.data.api.AuthService r1 = (com.vpa.daugia.module.auth.data.api.AuthService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                ng.p r3 = r10.f21613a
                dk.a<kg.c> r3 = r3.f21612z
                java.lang.Object r3 = r3.get()
                kg.c r3 = (kg.c) r3
                r0.<init>(r1, r2, r3)
                return r0
            L_0x0101:
                ng.p r0 = r10.f21613a
                lb.b r1 = r0.f21596j
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.home.data.api.HomeService> r1 = com.vpa.daugia.module.home.data.api.HomeService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.home.data.api.HomeService r0 = (com.vpa.daugia.module.home.data.api.HomeService) r0
                return r0
            L_0x011f:
                com.vpa.daugia.module.home.data.api.HomeApiHelper r0 = new com.vpa.daugia.module.home.data.api.HomeApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.home.data.api.HomeService> r1 = r1.G
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.home.data.api.HomeService r1 = (com.vpa.daugia.module.home.data.api.HomeService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x0139:
                ng.p r0 = r10.f21613a
                a.a r1 = r0.f21595i
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.history.data.api.HistoryService> r1 = com.vpa.daugia.module.history.data.api.HistoryService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.history.data.api.HistoryService r0 = (com.vpa.daugia.module.history.data.api.HistoryService) r0
                return r0
            L_0x0157:
                com.vpa.daugia.module.history.data.api.HistoryApiHelper r0 = new com.vpa.daugia.module.history.data.api.HistoryApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.history.data.api.HistoryService> r1 = r1.E
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.history.data.api.HistoryService r1 = (com.vpa.daugia.module.history.data.api.HistoryService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x0171:
                ng.p r0 = r10.f21613a
                lb.b r1 = r0.f21594h
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.cart.data.api.CartService> r1 = com.vpa.daugia.module.cart.data.api.CartService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.cart.data.api.CartService r0 = (com.vpa.daugia.module.cart.data.api.CartService) r0
                return r0
            L_0x018f:
                com.vpa.daugia.module.cart.data.api.CartApiHelper r0 = new com.vpa.daugia.module.cart.data.api.CartApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.cart.data.api.CartService> r1 = r1.C
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.cart.data.api.CartService r1 = (com.vpa.daugia.module.cart.data.api.CartService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x01a9:
                ng.p r0 = r10.f21613a
                lb.b r1 = r0.f21593g
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.setting.data.api.SettingService> r1 = com.vpa.daugia.module.setting.data.api.SettingService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.setting.data.api.SettingService r0 = (com.vpa.daugia.module.setting.data.api.SettingService) r0
                return r0
            L_0x01c7:
                com.vpa.daugia.module.setting.data.api.SettingApiHelper r0 = new com.vpa.daugia.module.setting.data.api.SettingApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.setting.data.api.SettingService> r1 = r1.A
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.setting.data.api.SettingService r1 = (com.vpa.daugia.module.setting.data.api.SettingService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x01e1:
                ng.p r0 = r10.f21613a
                og.f r4 = r0.f21592f
                com.airbnb.lottie.c r0 = r0.f21588b
                android.content.Context r0 = r0.f4771a
                if (r0 == 0) goto L_0x0203
                r4.getClass()
                java.lang.Class<com.vpa.daugia.data.local.auth.BaseServiceCacheDatabase> r3 = com.vpa.daugia.data.local.auth.BaseServiceCacheDatabase.class
                java.lang.String r4 = "base_service_database"
                x2.n$a r0 = m9.b.q(r0, r3, r4)
                r0.f16966l = r2
                r0.f16967m = r1
                r0.f16964j = r1
                x2.n r0 = r0.b()
                com.vpa.daugia.data.local.auth.BaseServiceCacheDatabase r0 = (com.vpa.daugia.data.local.auth.BaseServiceCacheDatabase) r0
                return r0
            L_0x0203:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r3)
                throw r0
            L_0x0209:
                kg.c r0 = new kg.c
                ng.p r1 = r10.f21613a
                og.f r2 = r1.f21592f
                dk.a<com.vpa.daugia.data.local.auth.BaseServiceCacheDatabase> r1 = r1.f21611y
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.data.local.auth.BaseServiceCacheDatabase r1 = (com.vpa.daugia.data.local.auth.BaseServiceCacheDatabase) r1
                r2.getClass()
                java.lang.String r2 = "userDatabase"
                sk.j.f(r1, r2)
                kg.a r1 = r1.p()
                if (r1 == 0) goto L_0x0229
                r0.<init>(r1)
                return r0
            L_0x0229:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r3)
                throw r0
            L_0x022f:
                ng.p r0 = r10.f21613a
                a.a r1 = r0.f21591e
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.common.data.api.CommonService> r1 = com.vpa.daugia.module.common.data.api.CommonService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.common.data.api.CommonService r0 = (com.vpa.daugia.module.common.data.api.CommonService) r0
                return r0
            L_0x024d:
                com.vpa.daugia.module.common.data.api.CommonApiHelper r0 = new com.vpa.daugia.module.common.data.api.CommonApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.common.data.api.CommonService> r1 = r1.f21609w
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.common.data.api.CommonService r1 = (com.vpa.daugia.module.common.data.api.CommonService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x0267:
                ng.p r0 = r10.f21613a
                og.d r1 = r0.f21590d
                com.airbnb.lottie.c r5 = r0.f21588b
                android.content.Context r5 = r5.f4771a
                if (r5 == 0) goto L_0x02bd
                dk.a<lg.b> r0 = r0.f21603q
                java.lang.Object r0 = r0.get()
                lg.b r0 = (lg.b) r0
                r1.getClass()
                sk.j.f(r0, r4)
                okhttp3.OkHttpClient$Builder r1 = new okhttp3.OkHttpClient$Builder     // Catch:{ Exception -> 0x02b3 }
                r1.<init>()     // Catch:{ Exception -> 0x02b3 }
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x02b3 }
                r6 = 60
                java.lang.String r4 = "unit"
                sk.j.f(r3, r4)     // Catch:{ Exception -> 0x02b3 }
                int r4 = okhttp3.internal.Util.b(r6, r3)     // Catch:{ Exception -> 0x02b3 }
                r1.f22093y = r4     // Catch:{ Exception -> 0x02b3 }
                int r3 = okhttp3.internal.Util.b(r6, r3)     // Catch:{ Exception -> 0x02b3 }
                r1.f22094z = r3     // Catch:{ Exception -> 0x02b3 }
                okhttp3.logging.HttpLoggingInterceptor r3 = new okhttp3.logging.HttpLoggingInterceptor     // Catch:{ Exception -> 0x02b3 }
                r3.<init>(r2)     // Catch:{ Exception -> 0x02b3 }
                java.util.ArrayList r2 = r1.f22071c     // Catch:{ Exception -> 0x02b3 }
                r2.add(r3)     // Catch:{ Exception -> 0x02b3 }
                og.c r2 = new og.c     // Catch:{ Exception -> 0x02b3 }
                r2.<init>(r5, r0)     // Catch:{ Exception -> 0x02b3 }
                java.util.ArrayList r0 = r1.f22071c     // Catch:{ Exception -> 0x02b3 }
                r0.add(r2)     // Catch:{ Exception -> 0x02b3 }
                okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient     // Catch:{ Exception -> 0x02b3 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x02b3 }
                return r0
            L_0x02b3:
                r0 = move-exception
                r0.printStackTrace()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x02bd:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r3)
                throw r0
            L_0x02c3:
                ng.p r0 = r10.f21613a
                og.e r0 = r0.f21587a
                r0.getClass()
                bc.h r0 = new bc.h
                r0.<init>()
                return r0
            L_0x02d0:
                ng.p r0 = r10.f21613a
                og.d r3 = r0.f21590d
                dk.a<bc.h> r0 = r0.f21604r
                java.lang.Object r0 = r0.get()
                bc.h r0 = (bc.h) r0
                ng.p r5 = r10.f21613a
                dk.a<okhttp3.OkHttpClient> r5 = r5.f21605s
                java.lang.Object r5 = r5.get()
                okhttp3.OkHttpClient r5 = (okhttp3.OkHttpClient) r5
                ng.p r6 = r10.f21613a
                dk.a<lg.b> r6 = r6.f21603q
                java.lang.Object r6 = r6.get()
                lg.a r6 = (lg.a) r6
                r3.getClass()
                java.lang.String r3 = "jsonParser"
                sk.j.f(r0, r3)
                java.lang.String r3 = "okHttpClient"
                sk.j.f(r5, r3)
                sk.j.f(r6, r4)
                java.lang.String r3 = j7.a.f11713u
                ul.v r4 = ul.v.f23191c
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.lang.String r8 = "baseUrl == null"
                java.util.Objects.requireNonNull(r3, r8)
                okhttp3.HttpUrl$Companion r8 = okhttp3.HttpUrl.f22005k
                r8.getClass()
                okhttp3.HttpUrl r3 = okhttp3.HttpUrl.Companion.c(r3)
                java.util.List<java.lang.String> r8 = r3.f22012f
                int r9 = r8.size()
                int r9 = r9 + -1
                java.lang.Object r8 = r8.get(r9)
                java.lang.String r9 = ""
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x039f
                wl.a r8 = new wl.a
                r8.<init>(r0)
                r6.add(r8)
                vl.g r0 = new vl.g
                r0.<init>()
                r7.add(r0)
                java.util.concurrent.Executor r0 = r4.a()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>(r7)
                ul.h r7 = new ul.h
                r7.<init>(r0)
                boolean r0 = r4.f23192a
                if (r0 == 0) goto L_0x0360
                r0 = 2
                ul.c$a[] r0 = new ul.c.a[r0]
                ul.e r9 = ul.e.f23101a
                r0[r2] = r9
                r0[r1] = r7
                java.util.List r0 = java.util.Arrays.asList(r0)
                goto L_0x0364
            L_0x0360:
                java.util.List r0 = java.util.Collections.singletonList(r7)
            L_0x0364:
                r8.addAll(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                int r2 = r6.size()
                int r2 = r2 + r1
                boolean r1 = r4.f23192a
                int r2 = r2 + r1
                r0.<init>(r2)
                ul.a r1 = new ul.a
                r1.<init>()
                r0.add(r1)
                r0.addAll(r6)
                boolean r1 = r4.f23192a
                if (r1 == 0) goto L_0x038a
                ul.r r1 = ul.r.f23148a
                java.util.List r1 = java.util.Collections.singletonList(r1)
                goto L_0x038e
            L_0x038a:
                java.util.List r1 = java.util.Collections.emptyList()
            L_0x038e:
                r0.addAll(r1)
                ul.z r1 = new ul.z
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                java.util.List r2 = java.util.Collections.unmodifiableList(r8)
                r1.<init>(r5, r3, r0, r2)
                return r1
            L_0x039f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "baseUrl must end in /: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x03b6:
                ng.p r0 = r10.f21613a
                lb.b r1 = r0.f21589c
                dk.a<ul.z> r0 = r0.f21606t
                java.lang.Object r0 = r0.get()
                ul.z r0 = (ul.z) r0
                r1.getClass()
                sk.j.f(r0, r6)
                java.lang.Class<com.vpa.daugia.module.auction.data.api.AuctionService> r1 = com.vpa.daugia.module.auction.data.api.AuctionService.class
                java.lang.Object r0 = r0.b(r1)
                sk.j.e(r0, r5)
                com.vpa.daugia.module.auction.data.api.AuctionService r0 = (com.vpa.daugia.module.auction.data.api.AuctionService) r0
                return r0
            L_0x03d4:
                com.vpa.daugia.module.auction.data.api.AuctionApiHelper r0 = new com.vpa.daugia.module.auction.data.api.AuctionApiHelper
                ng.p r1 = r10.f21613a
                dk.a<com.vpa.daugia.module.auction.data.api.AuctionService> r1 = r1.f21607u
                java.lang.Object r1 = r1.get()
                com.vpa.daugia.module.auction.data.api.AuctionService r1 = (com.vpa.daugia.module.auction.data.api.AuctionService) r1
                ng.p r2 = r10.f21613a
                dk.a<lg.b> r2 = r2.f21603q
                java.lang.Object r2 = r2.get()
                lg.b r2 = (lg.b) r2
                r0.<init>(r1, r2)
                return r0
            L_0x03ee:
                ng.p r0 = r10.f21613a
                og.e r1 = r0.f21587a
                com.airbnb.lottie.c r0 = r0.f21588b
                android.content.Context r0 = r0.f4771a
                if (r0 == 0) goto L_0x0480
                r1.getClass()
                java.lang.String r1 = "_androidx_security_master_key_"
                android.content.Context r3 = r0.getApplicationContext()     // Catch:{ Exception -> 0x045d }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x045d }
                r4.<init>()     // Catch:{ Exception -> 0x045d }
                java.lang.String r5 = r3.getPackageName()     // Catch:{ Exception -> 0x045d }
                r4.append(r5)     // Catch:{ Exception -> 0x045d }
                java.lang.String r5 = "_OTS.VN"
                r4.append(r5)     // Catch:{ Exception -> 0x045d }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x045d }
                b3.b$a r5 = new b3.b$a     // Catch:{ Exception -> 0x0423 }
                r5.<init>(r3)     // Catch:{ Exception -> 0x0423 }
                r5.c()     // Catch:{ Exception -> 0x0423 }
                b3.b r1 = r5.a()     // Catch:{ Exception -> 0x0423 }
                goto L_0x0458
            L_0x0423:
                android.security.keystore.KeyGenParameterSpec$Builder r5 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ Exception -> 0x045d }
                r6 = 3
                r5.<init>(r1, r6)     // Catch:{ Exception -> 0x045d }
                java.lang.String r1 = "GCM"
                java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch:{ Exception -> 0x045d }
                android.security.keystore.KeyGenParameterSpec$Builder r1 = r5.setBlockModes(r1)     // Catch:{ Exception -> 0x045d }
                java.lang.String r5 = "NoPadding"
                java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x045d }
                android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setEncryptionPaddings(r5)     // Catch:{ Exception -> 0x045d }
                r5 = 256(0x100, float:3.59E-43)
                android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setKeySize(r5)     // Catch:{ Exception -> 0x045d }
                android.security.keystore.KeyGenParameterSpec r1 = r1.build()     // Catch:{ Exception -> 0x045d }
                java.lang.String r5 = "build(...)"
                sk.j.e(r1, r5)     // Catch:{ Exception -> 0x045d }
                b3.b$a r5 = new b3.b$a     // Catch:{ Exception -> 0x045d }
                r5.<init>(r3)     // Catch:{ Exception -> 0x045d }
                r5.b(r1)     // Catch:{ Exception -> 0x045d }
                b3.b r1 = r5.a()     // Catch:{ Exception -> 0x045d }
            L_0x0458:
                b3.a r0 = b3.a.a(r3, r4, r1)     // Catch:{ Exception -> 0x045d }
                goto L_0x047f
            L_0x045d:
                android.content.Context r0 = r0.getApplicationContext()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r0.getPackageName()
                r1.append(r3)
                java.lang.String r3 = "_082024"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
                java.lang.String r1 = "getSharedPreferences(...)"
                sk.j.e(r0, r1)
            L_0x047f:
                return r0
            L_0x0480:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r3)
                throw r0
            L_0x0486:
                lg.b r0 = new lg.b
                ng.p r1 = r10.f21613a
                dk.a<android.content.SharedPreferences> r1 = r1.f21602p
                java.lang.Object r1 = r1.get()
                android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ng.p.a.get():java.lang.Object");
        }
    }

    public p(d dVar, e eVar, c cVar, b bVar, g0 g0Var, b bVar2, a.a aVar, f fVar, a.a aVar2, b bVar3, a.a aVar3, g0 g0Var2, b bVar4, b bVar5) {
        this.f21587a = eVar;
        this.f21588b = cVar;
        this.f21589c = bVar;
        this.f21590d = dVar;
        this.f21591e = aVar;
        this.f21592f = fVar;
        this.f21593g = bVar4;
        this.f21594h = bVar2;
        this.f21595i = aVar2;
        this.f21596j = bVar3;
        this.f21597k = g0Var;
        this.f21598l = aVar3;
        this.f21599m = g0Var2;
        this.f21600n = bVar5;
        this.f21602p = l.g(this, 1);
        this.f21603q = l.g(this, 0);
        this.f21604r = l.g(this, 5);
        this.f21605s = l.g(this, 6);
        this.f21606t = l.g(this, 4);
        this.f21607u = l.g(this, 3);
        this.f21608v = l.g(this, 2);
        this.f21609w = l.g(this, 8);
        this.f21610x = l.g(this, 7);
        this.f21611y = l.g(this, 10);
        this.f21612z = l.g(this, 9);
        this.A = l.g(this, 12);
        this.B = l.g(this, 11);
        this.C = l.g(this, 14);
        this.D = l.g(this, 13);
        this.E = l.g(this, 16);
        this.F = l.g(this, 15);
        this.G = l.g(this, 18);
        this.H = l.g(this, 17);
        this.I = l.g(this, 20);
        this.J = l.g(this, 19);
        this.K = l.g(this, 22);
        this.L = l.g(this, 21);
        this.M = l.g(this, 24);
        this.N = l.g(this, 23);
        this.O = l.g(this, 26);
        this.P = l.g(this, 25);
    }

    public final k a() {
        return new k(this.f21601o);
    }

    public final void b(App app) {
        app.f19369n = this.f21603q.get();
    }

    public final u8.l c() {
        int i10 = u8.f.f15326c;
        return u8.l.f15392q;
    }

    public final k d() {
        return new k(this.f21601o);
    }
}
