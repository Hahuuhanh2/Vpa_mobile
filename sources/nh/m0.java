package nh;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.common.ui.activity.WebViewActivity;
import com.vpa.daugia.module.home.data.model.NewDetail;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import mg.g3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: HomeFragment.kt */
public final class m0 extends k implements l<f<? extends NewDetail>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21669a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0(HomeFragment homeFragment) {
        super(1);
        this.f21669a = homeFragment;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((g3) this.f21669a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            Intent intent = new Intent(this.f21669a.d0(), WebViewActivity.class);
            f.c cVar = (f.c) fVar;
            intent.putExtra("WEB_LINK", ((NewDetail) cVar.f18006a).getContent());
            intent.putExtra("WEB_TITLE", ((NewDetail) cVar.f18006a).getCategoryTitle());
            this.f21669a.h0(intent);
        }
        return i.f20112a;
    }
}
