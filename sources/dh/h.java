package dh;

import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import com.vpa.daugia.module.cart.ui.Hilt_CartManagerActivity;
import e.b;

/* compiled from: Hilt_CartManagerActivity */
public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Hilt_CartManagerActivity f19941a;

    public h(Hilt_CartManagerActivity hilt_CartManagerActivity) {
        this.f19941a = hilt_CartManagerActivity;
    }

    public final void a() {
        Hilt_CartManagerActivity hilt_CartManagerActivity = this.f19941a;
        if (!hilt_CartManagerActivity.Q) {
            hilt_CartManagerActivity.Q = true;
            CartManagerActivity cartManagerActivity = (CartManagerActivity) hilt_CartManagerActivity;
            ((e) hilt_CartManagerActivity.d()).x();
        }
    }
}
