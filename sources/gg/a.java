package gg;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.swnishan.materialdatetimepicker.common.view.BaseMaterialDateTimePickerView;
import sk.j;

/* compiled from: BaseMaterialDateTimePickerView.kt */
public final class a implements RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseMaterialDateTimePickerView f20277a;

    public a(BaseMaterialDateTimePickerView baseMaterialDateTimePickerView) {
        this.f20277a = baseMaterialDateTimePickerView;
    }

    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        j.f(recyclerView, "rv");
        j.f(motionEvent, "e");
    }

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        j.f(recyclerView, "rv");
        j.f(motionEvent, "e");
        if (motionEvent.getAction() == 0) {
            BaseMaterialDateTimePickerView baseMaterialDateTimePickerView = this.f20277a;
            baseMaterialDateTimePickerView.r(recyclerView, baseMaterialDateTimePickerView.getFadeInDuration$materialdatetimepicker_release(), this.f20277a.getFadeInAlpha$materialdatetimepicker_release());
            return false;
        } else if (motionEvent.getAction() != 1 || recyclerView.getScrollState() != 0) {
            return false;
        } else {
            BaseMaterialDateTimePickerView baseMaterialDateTimePickerView2 = this.f20277a;
            baseMaterialDateTimePickerView2.r(recyclerView, baseMaterialDateTimePickerView2.getFadeOutDuration$materialdatetimepicker_release(), this.f20277a.getFadeOutAlpha$materialdatetimepicker_release());
            return false;
        }
    }

    public final void c(boolean z10) {
    }
}
