package d2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;

/* compiled from: DataBindingUtil */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static DataBinderMapperImpl f8544a = new DataBinderMapperImpl();

    public static <T extends l> T a(e eVar, View view, int i10) {
        return f8544a.b(eVar, view, i10);
    }

    public static <T extends l> T b(e eVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return a(eVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return f8544a.c(eVar, viewArr, i11);
    }

    public static <T extends l> T c(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, e eVar) {
        boolean z11;
        int i11 = 0;
        if (viewGroup == null || !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i11 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i10, viewGroup, z10);
        if (z11) {
            return b(eVar, viewGroup, i11, i10);
        }
        return a(eVar, inflate, i10);
    }
}
