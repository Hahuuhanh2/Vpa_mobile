package ui;

import android.view.View;
import com.vpa.daugia.module.support.data.model.Categories;
import ek.i;
import rk.l;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: CategoryAdapter.kt */
public final class a extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f23064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Categories f23065b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f23066c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar, Categories categories, int i10) {
        super(1);
        this.f23064a = cVar;
        this.f23065b = categories;
        this.f23066c = i10;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        p<? super Categories, ? super Integer, i> pVar = this.f23064a.f23071q;
        if (pVar != null) {
            pVar.invoke(this.f23065b, Integer.valueOf(this.f23066c));
        }
        return i.f20112a;
    }
}
