package ng;

import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.module.auth.ui.viewmodel.RegisterViewModel;
import com.vpa.daugia.module.cart.ui.CartViewModel;
import com.vpa.daugia.module.common.ui.CommonViewModel;
import com.vpa.daugia.module.history.HistoryViewModel;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import com.vpa.daugia.module.menu.ui.MenuViewModel;
import com.vpa.daugia.module.notification.ui.NotificationViewModel;
import com.vpa.daugia.module.payment.ui.PaymentViewModel;
import com.vpa.daugia.module.profile.ui.ProfileViewModel;
import com.vpa.daugia.module.searching.ui.viewmodel.FilterViewModel;
import com.vpa.daugia.module.searching.ui.viewmodel.SearchViewModel;
import com.vpa.daugia.module.support.ui.SupportViewModel;
import com.vpa.daugia.ui.splash.SplashViewModel;

/* compiled from: DaggerApp_HiltComponents_SingletonC */
public final class r extends h {

    /* renamed from: a  reason: collision with root package name */
    public a f21616a;

    /* renamed from: b  reason: collision with root package name */
    public a f21617b;

    /* renamed from: c  reason: collision with root package name */
    public a f21618c;

    /* renamed from: d  reason: collision with root package name */
    public a f21619d;

    /* renamed from: e  reason: collision with root package name */
    public a f21620e;

    /* renamed from: f  reason: collision with root package name */
    public a f21621f;

    /* renamed from: g  reason: collision with root package name */
    public a f21622g;

    /* renamed from: h  reason: collision with root package name */
    public a f21623h;

    /* renamed from: i  reason: collision with root package name */
    public a f21624i;

    /* renamed from: j  reason: collision with root package name */
    public a f21625j;

    /* renamed from: k  reason: collision with root package name */
    public a f21626k;

    /* renamed from: l  reason: collision with root package name */
    public a f21627l;

    /* renamed from: m  reason: collision with root package name */
    public a f21628m;

    /* renamed from: n  reason: collision with root package name */
    public a f21629n;

    /* renamed from: o  reason: collision with root package name */
    public a f21630o;

    /* renamed from: p  reason: collision with root package name */
    public a f21631p;

    /* compiled from: DaggerApp_HiltComponents_SingletonC */
    public static final class a<T> implements dk.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final p f21632a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21633b;

        public a(p pVar, int i10) {
            this.f21632a = pVar;
            this.f21633b = i10;
        }

        public final T get() {
            switch (this.f21633b) {
                case 0:
                    return new AuctionRoomViewModel(this.f21632a.f21608v.get(), this.f21632a.f21603q.get());
                case 1:
                    return new AuctionViewModel(this.f21632a.f21608v.get(), this.f21632a.f21610x.get(), this.f21632a.f21603q.get(), this.f21632a.f21612z.get(), this.f21632a.B.get());
                case 2:
                    return new CartViewModel(this.f21632a.D.get(), this.f21632a.f21603q.get());
                case 3:
                    return new CommonViewModel(this.f21632a.B.get(), this.f21632a.f21603q.get());
                case 4:
                    return new FilterViewModel(this.f21632a.B.get());
                case 5:
                    return new HistoryViewModel(this.f21632a.F.get(), this.f21632a.f21603q.get());
                case 6:
                    return new HomeViewModel(this.f21632a.H.get(), this.f21632a.f21608v.get(), this.f21632a.f21610x.get());
                case 7:
                    return new LoginViewModel(this.f21632a.f21603q.get(), this.f21632a.f21604r.get(), this.f21632a.J.get(), this.f21632a.B.get(), this.f21632a.f21610x.get(), this.f21632a.f21612z.get());
                case 8:
                    return new MenuViewModel(this.f21632a.f21603q.get(), this.f21632a.J.get());
                case 9:
                    return new NotificationViewModel(this.f21632a.L.get());
                case 10:
                    return new PaymentViewModel(this.f21632a.N.get(), this.f21632a.f21603q.get(), this.f21632a.B.get());
                case 11:
                    return new ProfileViewModel(this.f21632a.f21603q.get(), this.f21632a.f21610x.get());
                case 12:
                    return new RegisterViewModel();
                case 13:
                    return new SearchViewModel();
                case 14:
                    return new SplashViewModel(this.f21632a.f21603q.get(), this.f21632a.J.get());
                case 15:
                    return new SupportViewModel(this.f21632a.P.get(), this.f21632a.f21603q.get());
                default:
                    throw new AssertionError(this.f21633b);
            }
        }
    }

    public r(p pVar, l lVar) {
        this.f21616a = new a(pVar, 0);
        this.f21617b = new a(pVar, 1);
        this.f21618c = new a(pVar, 2);
        this.f21619d = new a(pVar, 3);
        this.f21620e = new a(pVar, 4);
        this.f21621f = new a(pVar, 5);
        this.f21622g = new a(pVar, 6);
        this.f21623h = new a(pVar, 7);
        this.f21624i = new a(pVar, 8);
        this.f21625j = new a(pVar, 9);
        this.f21626k = new a(pVar, 10);
        this.f21627l = new a(pVar, 11);
        this.f21628m = new a(pVar, 12);
        this.f21629n = new a(pVar, 13);
        this.f21630o = new a(pVar, 14);
        this.f21631p = new a(pVar, 15);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0216  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u8.k a() {
        /*
            r18 = this;
            r0 = r18
            r1 = 16
            java.lang.String r2 = "expectedSize"
            j7.a.q(r1, r2)
            u8.e$a r1 = new u8.e$a
            r1.<init>()
            ng.r$a r2 = r0.f21616a
            java.lang.String r3 = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21617b
            java.lang.String r3 = "com.vpa.daugia.module.auction.ui.AuctionViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21618c
            java.lang.String r3 = "com.vpa.daugia.module.cart.ui.CartViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21619d
            java.lang.String r3 = "com.vpa.daugia.module.common.ui.CommonViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21620e
            java.lang.String r3 = "com.vpa.daugia.module.searching.ui.viewmodel.FilterViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21621f
            java.lang.String r3 = "com.vpa.daugia.module.history.HistoryViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21622g
            java.lang.String r3 = "com.vpa.daugia.module.home.ui.HomeViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21623h
            java.lang.String r3 = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21624i
            java.lang.String r3 = "com.vpa.daugia.module.menu.ui.MenuViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21625j
            java.lang.String r3 = "com.vpa.daugia.module.notification.ui.NotificationViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21626k
            java.lang.String r3 = "com.vpa.daugia.module.payment.ui.PaymentViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21627l
            java.lang.String r3 = "com.vpa.daugia.module.profile.ui.ProfileViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21628m
            java.lang.String r3 = "com.vpa.daugia.module.auth.ui.viewmodel.RegisterViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21629n
            java.lang.String r3 = "com.vpa.daugia.module.searching.ui.viewmodel.SearchViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21630o
            java.lang.String r3 = "com.vpa.daugia.ui.splash.SplashViewModel"
            r1.a(r3, r2)
            ng.r$a r2 = r0.f21631p
            java.lang.String r3 = "com.vpa.daugia.module.support.ui.SupportViewModel"
            r1.a(r3, r2)
            u8.e$a$a r2 = r1.f15322c
            if (r2 != 0) goto L_0x0243
            int r2 = r1.f15321b
            java.lang.Object[] r3 = r1.f15320a
            if (r2 != 0) goto L_0x008c
            u8.k r2 = u8.k.f15377n
            goto L_0x0239
        L_0x008c:
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 != r6) goto L_0x00a2
            r2 = r3[r5]
            java.util.Objects.requireNonNull(r2)
            r2 = r3[r6]
            java.util.Objects.requireNonNull(r2)
            u8.k r2 = new u8.k
            r2.<init>(r4, r3, r6)
            goto L_0x0239
        L_0x00a2:
            int r7 = r3.length
            int r7 = r7 >> r6
            m9.b.j(r2, r7)
            int r7 = u8.f.p(r2)
            if (r2 != r6) goto L_0x00b9
            r7 = r3[r5]
            java.util.Objects.requireNonNull(r7)
            r7 = r3[r6]
            java.util.Objects.requireNonNull(r7)
            goto L_0x01fd
        L_0x00b9:
            int r9 = r7 + -1
            r10 = 128(0x80, float:1.794E-43)
            r11 = 3
            r12 = -1
            if (r7 > r10) goto L_0x012e
            byte[] r7 = new byte[r7]
            java.util.Arrays.fill(r7, r12)
            r10 = r5
            r12 = r10
        L_0x00c8:
            if (r10 >= r2) goto L_0x0118
            int r13 = r10 * 2
            int r13 = r13 + r5
            int r14 = r12 * 2
            int r14 = r14 + r5
            r15 = r3[r13]
            java.util.Objects.requireNonNull(r15)
            r13 = r13 ^ r6
            r13 = r3[r13]
            java.util.Objects.requireNonNull(r13)
            int r16 = r15.hashCode()
            int r16 = m9.b.Y(r16)
        L_0x00e3:
            r16 = r16 & r9
            byte r8 = r7[r16]
            r6 = 255(0xff, float:3.57E-43)
            r8 = r8 & r6
            if (r8 != r6) goto L_0x00fa
            byte r6 = (byte) r14
            r7[r16] = r6
            if (r12 >= r10) goto L_0x00f7
            r3[r14] = r15
            r6 = r14 ^ 1
            r3[r6] = r13
        L_0x00f7:
            int r12 = r12 + 1
            goto L_0x0110
        L_0x00fa:
            r6 = r3[r8]
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x0114
            u8.e$a$a r4 = new u8.e$a$a
            r6 = r8 ^ 1
            r8 = r3[r6]
            java.util.Objects.requireNonNull(r8)
            r4.<init>(r15, r13, r8)
            r3[r6] = r13
        L_0x0110:
            int r10 = r10 + 1
            r6 = 1
            goto L_0x00c8
        L_0x0114:
            int r16 = r16 + 1
            r6 = 1
            goto L_0x00e3
        L_0x0118:
            if (r12 != r2) goto L_0x011d
            r4 = r7
            goto L_0x01fd
        L_0x011d:
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r6[r5] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r8 = 1
            r6[r8] = r7
            r7 = 2
            r6[r7] = r4
        L_0x012b:
            r4 = r6
            goto L_0x01fd
        L_0x012e:
            r6 = 32768(0x8000, float:4.5918E-41)
            if (r7 > r6) goto L_0x01a0
            short[] r6 = new short[r7]
            java.util.Arrays.fill(r6, r12)
            r7 = r5
            r8 = r7
        L_0x013a:
            if (r7 >= r2) goto L_0x018b
            int r10 = r7 * 2
            int r10 = r10 + r5
            int r12 = r8 * 2
            int r12 = r12 + r5
            r13 = r3[r10]
            java.util.Objects.requireNonNull(r13)
            r14 = 1
            r10 = r10 ^ r14
            r10 = r3[r10]
            java.util.Objects.requireNonNull(r10)
            int r14 = r13.hashCode()
            int r14 = m9.b.Y(r14)
        L_0x0156:
            r14 = r14 & r9
            short r15 = r6[r14]
            r5 = 65535(0xffff, float:9.1834E-41)
            r15 = r15 & r5
            if (r15 != r5) goto L_0x016d
            short r5 = (short) r12
            r6[r14] = r5
            if (r8 >= r7) goto L_0x016a
            r3[r12] = r13
            r5 = r12 ^ 1
            r3[r5] = r10
        L_0x016a:
            int r8 = r8 + 1
            goto L_0x0183
        L_0x016d:
            r5 = r3[r15]
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L_0x0187
            u8.e$a$a r4 = new u8.e$a$a
            r5 = r15 ^ 1
            r12 = r3[r5]
            java.util.Objects.requireNonNull(r12)
            r4.<init>(r13, r10, r12)
            r3[r5] = r10
        L_0x0183:
            int r7 = r7 + 1
            r5 = 0
            goto L_0x013a
        L_0x0187:
            int r14 = r14 + 1
            r5 = 0
            goto L_0x0156
        L_0x018b:
            if (r8 != r2) goto L_0x018e
            goto L_0x012b
        L_0x018e:
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r16 = 0
            r5[r16] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r4
        L_0x019e:
            r4 = r5
            goto L_0x01fd
        L_0x01a0:
            r16 = r5
            int[] r5 = new int[r7]
            java.util.Arrays.fill(r5, r12)
            r6 = r16
            r7 = r6
        L_0x01aa:
            if (r6 >= r2) goto L_0x01fa
            int r8 = r6 * 2
            int r8 = r8 + 0
            int r10 = r7 * 2
            int r10 = r10 + 0
            r13 = r3[r8]
            java.util.Objects.requireNonNull(r13)
            r14 = 1
            r8 = r8 ^ r14
            r8 = r3[r8]
            java.util.Objects.requireNonNull(r8)
            int r14 = r13.hashCode()
            int r14 = m9.b.Y(r14)
        L_0x01c8:
            r14 = r14 & r9
            r15 = r5[r14]
            if (r15 != r12) goto L_0x01da
            r5[r14] = r10
            if (r7 >= r6) goto L_0x01d7
            r3[r10] = r13
            r10 = r10 ^ 1
            r3[r10] = r8
        L_0x01d7:
            int r7 = r7 + 1
            goto L_0x01f0
        L_0x01da:
            r12 = r3[r15]
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x01f6
            u8.e$a$a r4 = new u8.e$a$a
            r10 = r15 ^ 1
            r12 = r3[r10]
            java.util.Objects.requireNonNull(r12)
            r4.<init>(r13, r8, r12)
            r3[r10] = r8
        L_0x01f0:
            int r6 = r6 + 1
            r12 = -1
            r16 = 0
            goto L_0x01aa
        L_0x01f6:
            int r14 = r14 + 1
            r12 = -1
            goto L_0x01c8
        L_0x01fa:
            if (r7 != r2) goto L_0x0201
            goto L_0x019e
        L_0x01fd:
            r5 = 2
            r7 = 1
            r8 = 0
            goto L_0x0211
        L_0x0201:
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r8 = 0
            r6[r8] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r4
            r4 = r6
        L_0x0211:
            boolean r6 = r4 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x0233
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r2 = r4[r5]
            u8.e$a$a r2 = (u8.e.a.C0205a) r2
            r1.f15322c = r2
            r2 = r4[r8]
            r4 = r4[r7]
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r5 = r4 * 2
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r5)
            r17 = r4
            r4 = r2
            r2 = r17
        L_0x0233:
            u8.k r5 = new u8.k
            r5.<init>(r4, r3, r2)
            r2 = r5
        L_0x0239:
            u8.e$a$a r1 = r1.f15322c
            if (r1 != 0) goto L_0x023e
            return r2
        L_0x023e:
            java.lang.IllegalArgumentException r1 = r1.a()
            throw r1
        L_0x0243:
            java.lang.IllegalArgumentException r1 = r2.a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.r.a():u8.k");
    }
}
