package v7;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.x;
import n1.e;
import w1.w0;

/* compiled from: BottomSheetBehavior */
public final class b implements x.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f16075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f16076b;

    public b(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f16076b = bottomSheetBehavior;
        this.f16075a = z10;
    }

    public final w0 a(View view, w0 w0Var, x.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        e a10 = w0Var.a(7);
        e a11 = w0Var.a(32);
        this.f16076b.D = a10.f13428b;
        boolean g2 = x.g(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = this.f16076b;
        if (bottomSheetBehavior.f5830v) {
            bottomSheetBehavior.C = w0Var.b();
            paddingBottom = cVar.f6515d + this.f16076b.C;
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f16076b;
        if (bottomSheetBehavior2.f5831w) {
            if (g2) {
                i14 = cVar.f6514c;
            } else {
                i14 = cVar.f6512a;
            }
            paddingLeft = i14 + a10.f13427a;
        }
        if (bottomSheetBehavior2.f5832x) {
            if (g2) {
                i13 = cVar.f6512a;
            } else {
                i13 = cVar.f6514c;
            }
            paddingRight = i13 + a10.f13429c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = this.f16076b;
        boolean z10 = false;
        boolean z11 = true;
        if (bottomSheetBehavior3.f5834z && marginLayoutParams.leftMargin != (i12 = a10.f13427a)) {
            marginLayoutParams.leftMargin = i12;
            z10 = true;
        }
        if (bottomSheetBehavior3.A && marginLayoutParams.rightMargin != (i11 = a10.f13429c)) {
            marginLayoutParams.rightMargin = i11;
            z10 = true;
        }
        if (!bottomSheetBehavior3.B || marginLayoutParams.topMargin == (i10 = a10.f13428b)) {
            z11 = z10;
        } else {
            marginLayoutParams.topMargin = i10;
        }
        if (z11) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z12 = this.f16075a;
        if (z12) {
            this.f16076b.f5828t = a11.f13430d;
        }
        BottomSheetBehavior bottomSheetBehavior4 = this.f16076b;
        if (bottomSheetBehavior4.f5830v || z12) {
            bottomSheetBehavior4.S();
        }
        return w0Var;
    }
}
