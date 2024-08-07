package mg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.library.R$id;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.cart.data.model.Cart;
import d2.e;
import d2.l;
import e2.c;
import eh.a;

/* compiled from: ItemPaidCartBindingImpl */
public final class n6 extends m6 {
    public final AppTextView A;
    public final AppTextView B;
    public final AppTextView C;
    public long D = -1;

    /* renamed from: x  reason: collision with root package name */
    public final AppTextView f21254x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21255y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21256z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n6(e eVar, View view) {
        super(view, eVar);
        Object[] o10 = l.o(eVar, view, 7, (l.d) null, (SparseIntArray) null);
        ((MaterialCardView) o10[0]).setTag((Object) null);
        AppTextView appTextView = (AppTextView) o10[1];
        this.f21254x = appTextView;
        appTextView.setTag((Object) null);
        AppTextView appTextView2 = (AppTextView) o10[2];
        this.f21255y = appTextView2;
        appTextView2.setTag((Object) null);
        AppTextView appTextView3 = (AppTextView) o10[3];
        this.f21256z = appTextView3;
        appTextView3.setTag((Object) null);
        AppTextView appTextView4 = (AppTextView) o10[4];
        this.A = appTextView4;
        appTextView4.setTag((Object) null);
        AppTextView appTextView5 = (AppTextView) o10[5];
        this.B = appTextView5;
        appTextView5.setTag((Object) null);
        AppTextView appTextView6 = (AppTextView) o10[6];
        this.C = appTextView6;
        appTextView6.setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Cart cart;
        synchronized (this) {
            j10 = this.D;
            this.D = 0;
        }
        a aVar = this.f21221w;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str6 = null;
        if (i10 != 0) {
            if (aVar != null) {
                cart = aVar.f20059a;
                str5 = String.valueOf(cart.getQuantity());
                str3 = aVar.c();
                str2 = aVar.a();
                str = aVar.b();
                str4 = aVar.d();
            } else {
                cart = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (cart != null) {
                str6 = cart.getOrderCode();
            }
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i10 != 0) {
            c.d(this.f21254x, str6);
            c.d(this.f21255y, str3);
            c.d(this.f21256z, str);
            c.d(this.A, str5);
            c.d(this.B, str4);
            c.d(this.C, str2);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.D = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(a aVar) {
        this.f21221w = aVar;
        synchronized (this) {
            this.D |= 1;
        }
        f(3);
        t();
    }
}
