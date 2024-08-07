package dh;

import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: CartManagerActivity.kt */
public final class c extends k implements l<f<? extends Integer>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CartManagerActivity f19933a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(CartManagerActivity cartManagerActivity) {
        super(1);
        this.f19933a = cartManagerActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f19933a.O().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f19933a.O().show();
        } else if (fVar instanceof f.c) {
            this.f19933a.O().dismiss();
            f.c cVar = (f.c) fVar;
            this.f19933a.U = ((Number) cVar.f18006a).intValue();
            CartManagerActivity cartManagerActivity = this.f19933a;
            if (cartManagerActivity.U != 0) {
                cartManagerActivity.S = CartManagerActivity.T(cartManagerActivity, false, ((Number) cVar.f18006a).intValue(), 1);
            }
        }
        return i.f20112a;
    }
}
