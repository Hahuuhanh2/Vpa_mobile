package dh;

import al.d0;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import dl.f;
import dl.s;
import ik.d;
import kk.e;
import kk.i;
import kotlin.KotlinNothingValueException;
import p3.l0;
import rk.p;
import ze.e;

@e(c = "com.vpa.daugia.module.cart.ui.CartManagerActivity$observer$1", f = "CartManagerActivity.kt", l = {151}, m = "invokeSuspend")
/* compiled from: CartManagerActivity.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19930a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CartManagerActivity f19931b;

    /* compiled from: CartManagerActivity.kt */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CartManagerActivity f19932a;

        public a(CartManagerActivity cartManagerActivity) {
            this.f19932a = cartManagerActivity;
        }

        public final Object e(Object obj, d dVar) {
            if (((e.a) obj) == e.a.f18002a) {
                CartManagerActivity cartManagerActivity = this.f19932a;
                int i10 = CartManagerActivity.W;
                cartManagerActivity.U().e(CartStatus.NOT_PAID);
                this.f19932a.U().e(CartStatus.PAID);
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(CartManagerActivity cartManagerActivity, d<? super b> dVar) {
        super(2, dVar);
        this.f19931b = cartManagerActivity;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f19931b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        return jk.a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f19930a;
        if (i10 == 0) {
            l0.Q0(obj);
            s sVar = ze.e.f18001b;
            a aVar2 = new a(this.f19931b);
            this.f19930a = 1;
            if (sVar.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            l0.Q0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
