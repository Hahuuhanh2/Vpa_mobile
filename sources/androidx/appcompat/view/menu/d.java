package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.R$layout;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f599a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f600b;

    /* renamed from: c  reason: collision with root package name */
    public f f601c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandedMenuView f602d;

    /* renamed from: e  reason: collision with root package name */
    public int f603e;

    /* renamed from: f  reason: collision with root package name */
    public j.a f604f;

    /* renamed from: n  reason: collision with root package name */
    public a f605n;

    /* compiled from: ListMenuPresenter */
    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public int f606a = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f601c;
            h hVar = fVar.f636v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f624j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == hVar) {
                        this.f606a = i10;
                        return;
                    }
                }
            }
            this.f606a = -1;
        }

        /* renamed from: c */
        public final h getItem(int i10) {
            f fVar = d.this.f601c;
            fVar.i();
            ArrayList<h> arrayList = fVar.f624j;
            d.this.getClass();
            int i11 = i10 + 0;
            int i12 = this.f606a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        public final int getCount() {
            f fVar = d.this.f601c;
            fVar.i();
            int size = fVar.f624j.size();
            d.this.getClass();
            int i10 = size + 0;
            if (this.f606a < 0) {
                return i10;
            }
            return i10 - 1;
        }

        public final long getItemId(int i10) {
            return (long) i10;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                d dVar = d.this;
                view = dVar.f600b.inflate(dVar.f603e, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10));
            return view;
        }

        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context, int i10) {
        this.f603e = i10;
        this.f599a = context;
        this.f600b = LayoutInflater.from(context);
    }

    public final void c(f fVar, boolean z10) {
        j.a aVar = this.f604f;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    public final void d(boolean z10) {
        a aVar = this.f605n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f(j.a aVar) {
        this.f604f = aVar;
    }

    public final boolean g(h hVar) {
        return false;
    }

    public final int getId() {
        return 0;
    }

    public final void h(Context context, f fVar) {
        if (this.f599a != null) {
            this.f599a = context;
            if (this.f600b == null) {
                this.f600b = LayoutInflater.from(context);
            }
        }
        this.f601c = fVar;
        a aVar = this.f605n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final void i(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f602d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        b.a aVar = new b.a(mVar.f615a);
        d dVar = new d(aVar.f424a.f339a, R$layout.abc_list_menu_item_layout);
        gVar.f641c = dVar;
        dVar.f604f = gVar;
        f fVar = gVar.f639a;
        fVar.b(dVar, fVar.f615a);
        d dVar2 = gVar.f641c;
        if (dVar2.f605n == null) {
            dVar2.f605n = new a();
        }
        a aVar2 = dVar2.f605n;
        AlertController.b bVar = aVar.f424a;
        bVar.f347i = aVar2;
        bVar.f348j = gVar;
        View view = mVar.f629o;
        if (view != null) {
            bVar.f343e = view;
        } else {
            bVar.f341c = mVar.f628n;
            bVar.f342d = mVar.f627m;
        }
        bVar.f346h = gVar;
        b a10 = aVar.a();
        gVar.f640b = a10;
        a10.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f640b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f640b.show();
        j.a aVar3 = this.f604f;
        if (aVar3 == null) {
            return true;
        }
        aVar3.d(mVar);
        return true;
    }

    public final Parcelable l() {
        if (this.f602d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f602d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final boolean m(h hVar) {
        return false;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f601c.q(this.f605n.getItem(i10), this, 0);
    }
}
