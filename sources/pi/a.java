package pi;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import ek.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rk.l;
import sk.j;
import vl.d;

/* compiled from: ProvinceSelectionAdapter.kt */
public final class a extends RecyclerView.e<RecyclerView.a0> implements Filterable {

    /* renamed from: d  reason: collision with root package name */
    public final l<gf.b, i> f22650d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f22651e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f22652f = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f22653n = new ArrayList();

    /* renamed from: pi.a$a  reason: collision with other inner class name */
    /* compiled from: ProvinceSelectionAdapter.kt */
    public static final class C0302a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final d f22654u;

        public C0302a(d dVar) {
            super((TextView) dVar.f23362b);
            this.f22654u = dVar;
        }
    }

    /* compiled from: ProvinceSelectionAdapter.kt */
    public static final class b extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final a1.c f22655u;

        public b(a1.c cVar) {
            super((RelativeLayout) cVar.f24a);
            this.f22655u = cVar;
        }
    }

    /* compiled from: ProvinceSelectionAdapter.kt */
    public static final class c extends Filter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22656a;

        public c(a aVar) {
            this.f22656a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0037 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r10) {
            /*
                r9 = this;
                java.lang.String r10 = java.lang.String.valueOf(r10)
                int r0 = r10.length()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000e
                r0 = r1
                goto L_0x000f
            L_0x000e:
                r0 = r2
            L_0x000f:
                if (r0 == 0) goto L_0x002a
                pi.a r10 = r9.f22656a
                java.util.ArrayList r10 = r10.f22652f
                r10.clear()
                pi.a r10 = r9.f22656a
                java.util.ArrayList r0 = r10.f22652f
                java.util.ArrayList r10 = r10.f22651e
                r0.addAll(r10)
                pi.a r10 = r9.f22656a
                java.util.ArrayList r0 = r10.f22652f
                r10.t(r0)
                goto L_0x00a8
            L_0x002a:
                pi.a r0 = r9.f22656a
                java.util.ArrayList r0 = r0.f22651e
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0037:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0093
                java.lang.Object r4 = r0.next()
                r5 = r4
                gf.b r5 = (gf.b) r5
                java.lang.String r6 = r5.b()
                if (r6 == 0) goto L_0x0052
                boolean r6 = yk.l.N0(r6, r10)
                if (r6 != r1) goto L_0x0052
                r6 = r1
                goto L_0x0053
            L_0x0052:
                r6 = r2
            L_0x0053:
                if (r6 != 0) goto L_0x008c
                java.lang.String r6 = r5.a()
                java.lang.String r7 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                if (r6 == 0) goto L_0x006e
                java.util.Locale r8 = java.util.Locale.ROOT
                java.lang.String r6 = r6.toLowerCase(r8)
                sk.j.e(r6, r7)
                boolean r6 = yk.l.N0(r6, r10)
                if (r6 != r1) goto L_0x006e
                r6 = r1
                goto L_0x006f
            L_0x006e:
                r6 = r2
            L_0x006f:
                if (r6 != 0) goto L_0x008c
                java.lang.String r5 = r5.f10502f
                if (r5 == 0) goto L_0x0086
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r5 = r5.toLowerCase(r6)
                sk.j.e(r5, r7)
                boolean r5 = yk.l.N0(r5, r10)
                if (r5 != r1) goto L_0x0086
                r5 = r1
                goto L_0x0087
            L_0x0086:
                r5 = r2
            L_0x0087:
                if (r5 == 0) goto L_0x008a
                goto L_0x008c
            L_0x008a:
                r5 = r2
                goto L_0x008d
            L_0x008c:
                r5 = r1
            L_0x008d:
                if (r5 == 0) goto L_0x0037
                r3.add(r4)
                goto L_0x0037
            L_0x0093:
                pi.a r10 = r9.f22656a
                java.util.ArrayList r10 = r10.f22652f
                r10.clear()
                pi.a r10 = r9.f22656a
                java.util.ArrayList r10 = r10.f22652f
                r10.addAll(r3)
                pi.a r10 = r9.f22656a
                java.util.ArrayList r0 = r10.f22652f
                r10.t(r0)
            L_0x00a8:
                android.widget.Filter$FilterResults r10 = new android.widget.Filter$FilterResults
                r10.<init>()
                pi.a r0 = r9.f22656a
                java.util.ArrayList r0 = r0.f22653n
                r10.values = r0
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: pi.a.c.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
        }

        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            this.f22656a.f();
        }
    }

    public a(com.vpa.daugia.module.searching.ui.activity.a aVar) {
        this.f22650d = aVar;
    }

    public final int c() {
        return this.f22653n.size();
    }

    public final int e(int i10) {
        if (j.a(((gf.b) this.f22653n.get(i10)).b(), "")) {
            return C0535R$layout.item_province_header;
        }
        return C0535R$layout.item_province_selection;
    }

    public final Filter getFilter() {
        return new c(this);
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        if (a0Var instanceof b) {
            b bVar = (b) a0Var;
            gf.b bVar2 = (gf.b) this.f22653n.get(i10);
            j.f(bVar2, "item");
            ((AppTextView) bVar.f22655u.f26c).setText(bVar2.b());
            ((AppTextView) bVar.f22655u.f27d).setText(bVar2.a());
            if (bVar2.f10499c) {
                ((ImageView) bVar.f22655u.f25b).setVisibility(0);
            } else {
                ((ImageView) bVar.f22655u.f25b).setVisibility(8);
            }
        } else if (a0Var instanceof C0302a) {
            gf.b bVar3 = (gf.b) this.f22653n.get(i10);
            j.f(bVar3, "item");
            ((TextView) ((C0302a) a0Var).f22654u.f23363c).setText(bVar3.a());
        }
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        j.f(recyclerView, "parent");
        if (i10 == 2131558601) {
            View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(C0535R$layout.item_province_header, recyclerView, false);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                return new C0302a(new d(12, textView, textView));
            }
            throw new NullPointerException("rootView");
        }
        View inflate2 = LayoutInflater.from(recyclerView.getContext()).inflate(C0535R$layout.item_province_selection, recyclerView, false);
        int i11 = C0533R$id.imvCheck;
        ImageView imageView = (ImageView) j7.a.D(C0533R$id.imvCheck, inflate2);
        if (imageView != null) {
            i11 = C0533R$id.tvCode;
            AppTextView appTextView = (AppTextView) j7.a.D(C0533R$id.tvCode, inflate2);
            if (appTextView != null) {
                i11 = C0533R$id.tvName;
                AppTextView appTextView2 = (AppTextView) j7.a.D(C0533R$id.tvName, inflate2);
                if (appTextView2 != null) {
                    b bVar = new b(new a1.c((RelativeLayout) inflate2, imageView, appTextView, appTextView2));
                    bVar.f3013a.setOnClickListener(new tg.d(5, this, bVar));
                    return bVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i11)));
    }

    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((gf.b) next).f10499c) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!((gf.b) next2).f10499c) {
                arrayList3.add(next2);
            }
        }
        this.f22653n.clear();
        if (!arrayList2.isEmpty()) {
            this.f22653n.add(new gf.b("Đã chọn", false, (String) null, (Integer) null, 62));
            this.f22653n.addAll(arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            this.f22653n.add(new gf.b("Danh sách tỉnh, thành phố", false, (String) null, (Integer) null, 62));
            this.f22653n.addAll(arrayList3);
        }
    }

    public final ArrayList u() {
        ArrayList arrayList = this.f22651e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((gf.b) next).f10499c) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final void v(List<gf.b> list) {
        this.f22651e.clear();
        this.f22651e.addAll(list);
        this.f22652f.clear();
        this.f22652f.addAll(list);
        t(this.f22651e);
        f();
    }
}
