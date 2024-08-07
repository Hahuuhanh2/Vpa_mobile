package jh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.common.data.model.MyDocument;
import com.vpa.daugia.module.common.ui.activity.a;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.d6;
import rk.l;
import sk.j;

/* compiled from: MyDocumentAdapter.kt */
public final class b extends d<MyDocument, d6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<MyDocument, i> f20780p;

    public b(a aVar) {
        super(aVar);
        this.f20780p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        d6 d6Var = (d6) lVar;
        MyDocument myDocument = (MyDocument) serializable;
        j.f(d6Var, "binding");
        j.f(myDocument, "model");
        d6Var.v(new a(myDocument));
    }

    public final int x() {
        return C0535R$layout.item_my_document;
    }

    public final void z(Serializable serializable) {
        MyDocument myDocument = (MyDocument) serializable;
        j.f(myDocument, "model");
        this.f20780p.invoke(myDocument);
    }
}
