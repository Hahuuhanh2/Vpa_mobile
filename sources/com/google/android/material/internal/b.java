package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: CheckableGroup */
public final class b<T extends g<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6383a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f6384b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public a f6385c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6386d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6387e;

    /* compiled from: CheckableGroup */
    public interface a {
    }

    public final boolean a(g<T> gVar) {
        int id2 = gVar.getId();
        if (this.f6384b.contains(Integer.valueOf(id2))) {
            return false;
        }
        g gVar2 = (g) this.f6383a.get(Integer.valueOf(c()));
        if (gVar2 != null) {
            e(gVar2, false);
        }
        boolean add = this.f6384b.add(Integer.valueOf(id2));
        if (!gVar.isChecked()) {
            gVar.setChecked(true);
        }
        return add;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f6384b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof g) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.f6386d || this.f6384b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f6384b.iterator().next()).intValue();
    }

    public final void d() {
        a aVar = this.f6385c;
        if (aVar != null) {
            new HashSet(this.f6384b);
            ChipGroup chipGroup = ChipGroup.this;
            ChipGroup.d dVar = chipGroup.f6024n;
            if (dVar != null) {
                chipGroup.f6025o.b(chipGroup);
                ChipGroup.b bVar = (ChipGroup.b) dVar;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f6025o.f6386d) {
                    bVar.getClass();
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(g<T> gVar, boolean z10) {
        int id2 = gVar.getId();
        if (!this.f6384b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (!z10 || this.f6384b.size() != 1 || !this.f6384b.contains(Integer.valueOf(id2))) {
            boolean remove = this.f6384b.remove(Integer.valueOf(id2));
            if (gVar.isChecked()) {
                gVar.setChecked(false);
            }
            return remove;
        }
        gVar.setChecked(true);
        return false;
    }
}
