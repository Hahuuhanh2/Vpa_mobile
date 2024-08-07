package ef;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.core.R$string;
import d2.e;
import d2.f;
import d2.l;
import ek.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kf.b;
import sk.j;

/* compiled from: BaseAdapter.kt */
public abstract class d<Model extends Serializable, DB extends l> extends RecyclerView.e<a<DB>> {

    /* renamed from: d  reason: collision with root package name */
    public final rk.l<Model, i> f9442d;

    /* renamed from: e  reason: collision with root package name */
    public Context f9443e;

    /* renamed from: f  reason: collision with root package name */
    public List<Model> f9444f = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public DB f9445n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9446o = true;

    /* compiled from: BaseAdapter.kt */
    public static final class a<DB extends l> extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final DB f9447u;

        public a(DB db2) {
            super(db2.f8554e);
            this.f9447u = db2;
        }
    }

    public d(rk.l<? super Model, i> lVar) {
        j.f(lVar, "listener");
        this.f9442d = lVar;
        r();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void A(List<Model> list) {
        i iVar;
        if (list != null) {
            this.f9444f = list;
            iVar = i.f20112a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            this.f9444f.clear();
        }
        f();
    }

    public int c() {
        return this.f9444f.size();
    }

    public final long d(int i10) {
        return (long) i10;
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        a aVar = (a) a0Var;
        aVar.f9447u.f8554e.setTag(R$string.position, Integer.valueOf(i10));
        u(aVar.f9447u, i10, (Serializable) this.f9444f.get(i10));
        if (this.f9446o) {
            View view = aVar.f9447u.f8554e;
            j.e(view, "getRoot(...)");
            view.setOnClickListener(new b(500, view, new e(this, i10)));
        }
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        j.f(recyclerView, "parent");
        Context context = recyclerView.getContext();
        j.e(context, "getContext(...)");
        this.f9443e = context;
        DB c10 = f.c(LayoutInflater.from(recyclerView.getContext()), x(), recyclerView, false, (e) null);
        j.e(c10, "inflate(...)");
        this.f9445n = c10;
        DB db2 = this.f9445n;
        if (db2 != null) {
            return new a(db2);
        }
        j.l("binding");
        throw null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void t(List<? extends Model> list) {
        j.f(list, "list");
        int size = this.f9444f.size();
        this.f9444f.addAll(list);
        this.f3034a.d(size, this.f9444f.size());
        f();
    }

    public abstract void u(DB db2, int i10, Model model);

    public final int v() {
        return this.f9444f.size();
    }

    public final Model w(int i10) {
        return (Serializable) this.f9444f.get(i10);
    }

    public abstract int x();

    public final Context y() {
        Context context = this.f9443e;
        if (context != null) {
            return context;
        }
        j.l("_context");
        throw null;
    }

    public void z(Model model) {
        j.f(model, "model");
    }
}
