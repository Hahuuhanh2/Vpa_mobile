package com.ots.base.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.base.utils.customview.EmptyView;
import com.vpa.daugia.C0535R$layout;
import d2.f;
import ek.g;
import j$.util.function.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import mg.e2;
import rk.l;
import sk.j;
import sk.k;
import ye.e;
import ye.h;
import ye.i;

/* compiled from: AddressSelectDialog.kt */
public final class a extends i {
    public String A0;
    public boolean B0 = false;
    public e2 C0;
    public final g D0 = j7.a.b0(new ye.d(this));
    public ArrayList<gf.b> E0 = new ArrayList<>();
    public ArrayList<gf.b> F0 = new ArrayList<>();
    public C0079a G0;

    /* renamed from: z0  reason: collision with root package name */
    public ArrayList<gf.b> f8243z0;

    /* renamed from: com.ots.base.ui.a$a  reason: collision with other inner class name */
    /* compiled from: AddressSelectDialog.kt */
    public interface C0079a {
        void a(ArrayList<gf.b> arrayList, String str);
    }

    /* compiled from: AddressSelectDialog.kt */
    public static final class b extends k implements l<gf.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8244a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f8244a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            if (yk.l.N0(r5, r4.f8244a) != false) goto L_0x005f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                gf.b r5 = (gf.b) r5
                java.lang.String r0 = "t"
                sk.j.f(r5, r0)
                java.lang.String r0 = r5.a()
                java.lang.String r1 = ""
                if (r0 != 0) goto L_0x0010
                r0 = r1
            L_0x0010:
                java.util.Locale r2 = java.util.Locale.getDefault()
                java.lang.String r3 = "getDefault(...)"
                sk.j.e(r2, r3)
                java.lang.String r0 = r0.toLowerCase(r2)
                java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
                sk.j.e(r0, r2)
                java.lang.String r2 = r4.f8244a
                r3 = 0
                boolean r0 = yk.l.N0(r0, r2)
                if (r0 != 0) goto L_0x005f
                java.lang.String r5 = r5.a()
                java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFD     // Catch:{ Exception -> 0x0048 }
                java.lang.String r5 = java.text.Normalizer.normalize(r5, r0)     // Catch:{ Exception -> 0x0048 }
                java.lang.String r0 = "\\p{InCombiningDiacriticalMarks}+"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x0048 }
                java.util.regex.Matcher r5 = r0.matcher(r5)     // Catch:{ Exception -> 0x0048 }
                java.lang.String r5 = r5.replaceAll(r1)     // Catch:{ Exception -> 0x0048 }
                sk.j.c(r5)     // Catch:{ Exception -> 0x0048 }
                r1 = r5
                goto L_0x004c
            L_0x0048:
                r5 = move-exception
                r5.printStackTrace()
            L_0x004c:
                java.util.Locale r5 = java.util.Locale.ROOT
                java.lang.String r5 = r1.toLowerCase(r5)
                java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                sk.j.e(r5, r0)
                java.lang.String r0 = r4.f8244a
                boolean r5 = yk.l.N0(r5, r0)
                if (r5 == 0) goto L_0x0060
            L_0x005f:
                r3 = 1
            L_0x0060:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ots.base.ui.a.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SearchViewExtensions.kt */
    public static final class c implements SearchView.m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f8245a;

        public c(a aVar) {
            this.f8245a = aVar;
        }

        public final void a(String str) {
            Timer n10 = n0.l.n(df.b.f8966a);
            df.b.f8966a = n10;
            n10.schedule(new e(this.f8245a, str), 500);
        }

        public final void b() {
        }
    }

    /* compiled from: AddressSelectDialog.kt */
    public static final class d implements Predicate {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f8246a;

        public d(b bVar) {
            this.f8246a = bVar;
        }

        public final /* synthetic */ Predicate and(Predicate predicate) {
            return Predicate.CC.$default$and(this, predicate);
        }

        public final /* synthetic */ Predicate negate() {
            return Predicate.CC.$default$negate(this);
        }

        public final /* synthetic */ Predicate or(Predicate predicate) {
            return Predicate.CC.$default$or(this, predicate);
        }

        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.f8246a.invoke(obj)).booleanValue();
        }
    }

    public a(ArrayList arrayList, String str) {
        j.f(arrayList, "selectionItem");
        j.f(str, "title");
        this.f8243z0 = arrayList;
        this.A0 = str;
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        LayoutInflater layoutInflater2 = this.Q;
        if (layoutInflater2 == null) {
            layoutInflater2 = P((Bundle) null);
            this.Q = layoutInflater2;
        }
        int i10 = e2.A;
        DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
        e2 e2Var = (e2) d2.l.l(layoutInflater2, C0535R$layout.address_select_dialog, viewGroup, (Object) null);
        this.C0 = e2Var;
        if (e2Var != null) {
            return e2Var.f8554e;
        }
        return null;
    }

    public final void W(View view, Bundle bundle) {
        EmptyView emptyView;
        int i10;
        e2 e2Var;
        RecyclerView recyclerView;
        TextView textView;
        j.f(view, "view");
        e2 e2Var2 = this.C0;
        if (!(e2Var2 == null || (textView = e2Var2.f21041z) == null)) {
            textView.getText();
        }
        e2 e2Var3 = this.C0;
        int i11 = 0;
        if (e2Var3 != null) {
            e2Var3.f21041z.setText(this.A0);
            RecyclerView recyclerView2 = e2Var3.f21039x;
            recyclerView2.setHasFixedSize(true);
            recyclerView2.setAdapter(u0());
            d0();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1));
            SearchView searchView = e2Var3.f21040y;
            j.e(searchView, "searchView");
            searchView.setOnQueryTextListener(new c(this));
        }
        this.F0.clear();
        this.F0.addAll(this.f8243z0);
        u0().A(this.F0);
        Iterator<gf.b> it = this.F0.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (it.next().f10499c) {
                break;
            } else {
                i12++;
            }
        }
        if (!(i12 == -1 || (e2Var = this.C0) == null || (recyclerView = e2Var.f21039x) == null)) {
            recyclerView.n0(i12);
        }
        e2 e2Var4 = this.C0;
        RecyclerView recyclerView3 = null;
        if (e2Var4 != null) {
            emptyView = e2Var4.f21038w;
        } else {
            emptyView = null;
        }
        if (emptyView != null) {
            if (this.F0.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            emptyView.setVisibility(i10);
        }
        e2 e2Var5 = this.C0;
        if (e2Var5 != null) {
            recyclerView3 = e2Var5.f21039x;
        }
        if (recyclerView3 != null) {
            if (!(!this.F0.isEmpty())) {
                i11 = 8;
            }
            recyclerView3.setVisibility(i11);
        }
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialog;
            if (bVar.f5863f == null) {
                bVar.f();
            }
            bVar.f5863f.K(3);
        }
    }

    public final h u0() {
        return (h) this.D0.getValue();
    }

    public final e2 v0() {
        return this.C0;
    }
}
