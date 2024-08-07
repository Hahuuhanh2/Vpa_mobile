package ji;

import ai.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import d2.l;
import ef.f;
import ff.a;
import mg.q2;
import sk.j;
import ug.b;

/* compiled from: DialogInfoAuction.kt */
public final class a extends f.a<a> {

    /* renamed from: i  reason: collision with root package name */
    public q2 f20781i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AwaitAuction awaitAuction) {
        super(context);
        j.f(awaitAuction, "data");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = q2.f21306y;
        DataBinderMapperImpl dataBinderMapperImpl = d2.f.f8544a;
        q2 q2Var = (q2) l.l(from, C0535R$layout.dialog_info_auction, (ViewGroup) null, (Object) null);
        j.e(q2Var, "inflate(...)");
        this.f20781i = q2Var;
        q2Var.v(new b(awaitAuction));
        this.f20781i.f21307w.setOnClickListener(new c(this, 6));
        e(this.f20781i.f8554e);
        ff.a.f10210a.getClass();
        a.C0107a aVar = a.C0107a.f10211a;
        c();
    }
}
