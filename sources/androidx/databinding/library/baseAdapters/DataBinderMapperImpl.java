package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import d2.d;
import d2.e;
import d2.l;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f2200a = new SparseIntArray(0);

    public final List<d> a() {
        return new ArrayList(0);
    }

    public final l b(e eVar, View view, int i10) {
        if (f2200a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final l c(e eVar, View[] viewArr, int i10) {
        if (viewArr.length == 0 || f2200a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
