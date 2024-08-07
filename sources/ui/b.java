package ui;

import android.view.View;
import com.vpa.daugia.module.support.data.model.Categories;
import ek.i;
import rk.l;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: CategoryAdapter.kt */
public final class b extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f23067a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Categories f23068b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f23069c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, Categories categories, int i10) {
        super(1);
        this.f23067a = cVar;
        this.f23068b = categories;
        this.f23069c = i10;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        p<? super Categories, ? super Integer, i> pVar = this.f23067a.f23071q;
        if (pVar != null) {
            pVar.invoke(this.f23068b, Integer.valueOf(this.f23069c));
        }
        return i.f20112a;
    }
}
