package com.vpa.daugia.module.cart.ui;

import al.d0;
import al.r0;
import com.vpa.daugia.module.cart.data.api.CartApiHelper;
import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.data.model.Order;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import r2.p;
import r2.v;
import sk.j;
import ze.f;

/* compiled from: CartViewModel.kt */
public final class CartViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final CartApiHelper f19597d;

    /* renamed from: e  reason: collision with root package name */
    public n<Cart> f19598e = new n<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public final p<f<ArrayList<Cart>>> f19599f;

    /* renamed from: g  reason: collision with root package name */
    public final p f19600g;

    /* renamed from: h  reason: collision with root package name */
    public final p<f<Integer>> f19601h;

    /* renamed from: i  reason: collision with root package name */
    public final p f19602i;

    /* renamed from: j  reason: collision with root package name */
    public final p<f<Integer>> f19603j;

    /* renamed from: k  reason: collision with root package name */
    public final p f19604k;

    /* renamed from: l  reason: collision with root package name */
    public final p<f<Integer>> f19605l;

    /* renamed from: m  reason: collision with root package name */
    public final p<f<Object>> f19606m;

    /* renamed from: n  reason: collision with root package name */
    public final p f19607n;

    /* renamed from: o  reason: collision with root package name */
    public final p<f<ArrayList<Order>>> f19608o;

    /* renamed from: p  reason: collision with root package name */
    public final p f19609p;

    @e(c = "com.vpa.daugia.module.cart.ui.CartViewModel$getCartList$1", f = "CartViewModel.kt", l = {61}, m = "invokeSuspend")
    /* compiled from: CartViewModel.kt */
    public static final class a extends i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19610a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CartViewModel f19611b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ CartStatus f19612c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(CartViewModel cartViewModel, CartStatus cartStatus, d<? super a> dVar) {
            super(2, dVar);
            this.f19611b = cartViewModel;
            this.f19612c = cartStatus;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f19611b, this.f19612c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList a10;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19610a;
            if (i10 == 0) {
                l0.Q0(obj);
                if (!this.f19611b.f19598e.d()) {
                    return ek.i.f20112a;
                }
                this.f19611b.f19599f.k(f.b.f18005a);
                CartViewModel cartViewModel = this.f19611b;
                this.f19610a = 1;
                obj = cartViewModel.f19597d.getCartList(this.f19612c, cartViewModel.f19598e.e() + 1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    l.p(e10, this.f19611b.f19599f);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            n nVar = (n) kVar.d();
            if (!(nVar == null || (a10 = nVar.a()) == null)) {
                this.f19611b.f19599f.k(new f.c(a10));
            }
            CartViewModel cartViewModel2 = this.f19611b;
            Object d10 = kVar.d();
            j.c(d10);
            cartViewModel2.getClass();
            cartViewModel2.f19598e = (n) d10;
            return ek.i.f20112a;
        }
    }

    @e(c = "com.vpa.daugia.module.cart.ui.CartViewModel$getCount$1", f = "CartViewModel.kt", l = {78}, m = "invokeSuspend")
    /* compiled from: CartViewModel.kt */
    public static final class b extends i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19613a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CartViewModel f19614b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ CartStatus f19615c;

        /* compiled from: CartViewModel.kt */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f19616a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    com.vpa.daugia.module.cart.data.model.CartStatus[] r0 = com.vpa.daugia.module.cart.data.model.CartStatus.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.vpa.daugia.module.cart.data.model.CartStatus r1 = com.vpa.daugia.module.cart.data.model.CartStatus.REFUND     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.vpa.daugia.module.cart.data.model.CartStatus r1 = com.vpa.daugia.module.cart.data.model.CartStatus.PAID     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.vpa.daugia.module.cart.data.model.CartStatus r1 = com.vpa.daugia.module.cart.data.model.CartStatus.NOT_PAID     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f19616a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.cart.ui.CartViewModel.b.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CartViewModel cartViewModel, CartStatus cartStatus, d<? super b> dVar) {
            super(2, dVar);
            this.f19614b = cartViewModel;
            this.f19615c = cartStatus;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new b(this.f19614b, this.f19615c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19613a;
            if (i10 == 0) {
                l0.Q0(obj);
                this.f19614b.f19601h.k(f.b.f18005a);
                CartApiHelper cartApiHelper = this.f19614b.f19597d;
                CartStatus cartStatus = this.f19615c;
                this.f19613a = 1;
                obj = cartApiHelper.getCount(cartStatus, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    l.p(e10, this.f19614b.f19601h);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Integer num = (Integer) ((k) obj).d();
            if (num != null) {
                CartStatus cartStatus2 = this.f19615c;
                CartViewModel cartViewModel = this.f19614b;
                int intValue = num.intValue();
                int i11 = a.f19616a[cartStatus2.ordinal()];
                if (i11 == 1) {
                    cartViewModel.f19605l.k(new f.c(new Integer(intValue)));
                } else if (i11 == 2) {
                    cartViewModel.f19601h.k(new f.c(new Integer(intValue)));
                } else if (i11 == 3) {
                    cartViewModel.f19603j.k(new f.c(new Integer(intValue)));
                }
            }
            return ek.i.f20112a;
        }
    }

    public CartViewModel(CartApiHelper cartApiHelper, lg.b bVar) {
        j.f(cartApiHelper, "apiHelper");
        j.f(bVar, "sharedPrefsHelper");
        this.f19597d = cartApiHelper;
        p<f<ArrayList<Cart>>> pVar = new p<>();
        this.f19599f = pVar;
        this.f19600g = pVar;
        p<f<Integer>> pVar2 = new p<>();
        this.f19601h = pVar2;
        this.f19602i = pVar2;
        p<f<Integer>> pVar3 = new p<>();
        this.f19603j = pVar3;
        this.f19604k = pVar3;
        this.f19605l = new p<>();
        p<f<Object>> pVar4 = new p<>();
        this.f19606m = pVar4;
        this.f19607n = pVar4;
        p<f<ArrayList<Order>>> pVar5 = new p<>();
        this.f19608o = pVar5;
        this.f19609p = pVar5;
    }

    public final void d(CartStatus cartStatus) {
        j.f(cartStatus, "cartStatus");
        l0.j0(l0.d0(this), r0.f19085b, new a(this, cartStatus, (d<? super a>) null), 2);
    }

    public final void e(CartStatus cartStatus) {
        j.f(cartStatus, "cartStatus");
        l0.j0(l0.d0(this), r0.f19085b, new b(this, cartStatus, (d<? super b>) null), 2);
    }
}
