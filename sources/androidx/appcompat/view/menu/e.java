package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public final class e extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public f f608a;

    /* renamed from: b  reason: collision with root package name */
    public int f609b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f610c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f611d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f612e;

    /* renamed from: f  reason: collision with root package name */
    public final int f613f;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f611d = z10;
        this.f612e = layoutInflater;
        this.f608a = fVar;
        this.f613f = i10;
        b();
    }

    public final void b() {
        f fVar = this.f608a;
        h hVar = fVar.f636v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f624j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == hVar) {
                    this.f609b = i10;
                    return;
                }
            }
        }
        this.f609b = -1;
    }

    /* renamed from: c */
    public final h getItem(int i10) {
        ArrayList<h> arrayList;
        if (this.f611d) {
            f fVar = this.f608a;
            fVar.i();
            arrayList = fVar.f624j;
        } else {
            arrayList = this.f608a.l();
        }
        int i11 = this.f609b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayList.get(i10);
    }

    public final int getCount() {
        ArrayList<h> arrayList;
        if (this.f611d) {
            f fVar = this.f608a;
            fVar.i();
            arrayList = fVar.f624j;
        } else {
            arrayList = this.f608a.l();
        }
        if (this.f609b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i10) {
        return (long) i10;
    }

    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.f612e.inflate(this.f613f, viewGroup, false);
        }
        int i12 = getItem(i10).f643b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f643b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f608a.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f610c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10));
        return view;
    }

    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
