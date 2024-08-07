package gg;

import androidx.recyclerview.widget.RecyclerView;
import com.swnishan.materialdatetimepicker.common.view.BaseMaterialDateTimePickerView;
import rk.l;
import sk.j;

/* compiled from: BaseMaterialDateTimePickerView.kt */
public final class b extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseMaterialDateTimePickerView f20278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f20279b;

    public b(BaseMaterialDateTimePickerView baseMaterialDateTimePickerView, l lVar) {
        this.f20278a = baseMaterialDateTimePickerView;
        this.f20279b = lVar;
    }

    public final void a(int i10, RecyclerView recyclerView) {
        j.f(recyclerView, "recyclerView");
        if (i10 == 0) {
            BaseMaterialDateTimePickerView baseMaterialDateTimePickerView = this.f20278a;
            baseMaterialDateTimePickerView.r(recyclerView, baseMaterialDateTimePickerView.getFadeOutDuration$materialdatetimepicker_release(), this.f20278a.getFadeOutAlpha$materialdatetimepicker_release());
        } else if (i10 == 1) {
            BaseMaterialDateTimePickerView baseMaterialDateTimePickerView2 = this.f20278a;
            baseMaterialDateTimePickerView2.r(recyclerView, baseMaterialDateTimePickerView2.getFadeInDuration$materialdatetimepicker_release(), this.f20278a.getFadeInAlpha$materialdatetimepicker_release());
        }
        if (i10 == 0) {
            this.f20279b.invoke(Integer.valueOf(recyclerView.getId()));
        }
    }
}
