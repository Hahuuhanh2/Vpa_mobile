package dh;

import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import ek.i;
import mg.p;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: CartManagerActivity.kt */
public final class d extends k implements l<f<? extends Integer>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CartManagerActivity f19934a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(CartManagerActivity cartManagerActivity) {
        super(1);
        this.f19934a = cartManagerActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f19934a.O().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f19934a.O().show();
        } else if (fVar instanceof f.c) {
            this.f19934a.O().dismiss();
            f.c cVar = (f.c) fVar;
            this.f19934a.V = ((Number) cVar.f18006a).intValue();
            CartManagerActivity cartManagerActivity = this.f19934a;
            if (cartManagerActivity.V != 0) {
                cartManagerActivity.T = CartManagerActivity.T(cartManagerActivity, false, ((Number) cVar.f18006a).intValue(), 0);
            }
            ((p) this.f19934a.M()).f21280x.getChildAt(0).setSelected(true);
        }
        return i.f20112a;
    }
}
