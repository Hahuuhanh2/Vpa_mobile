package ig;

import com.swnishan.materialdatetimepicker.R$id;
import com.swnishan.materialdatetimepicker.common.LowFlingRecyclerView;
import com.swnishan.materialdatetimepicker.timepicker.MaterialTimePickerView;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: MaterialTimePickerView.kt */
public final class e extends k implements l<Integer, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LowFlingRecyclerView f20551a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialTimePickerView f20552b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(LowFlingRecyclerView lowFlingRecyclerView, MaterialTimePickerView materialTimePickerView) {
        super(1);
        this.f20551a = lowFlingRecyclerView;
        this.f20552b = materialTimePickerView;
    }

    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        MaterialTimePickerView materialTimePickerView = this.f20552b;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) this.f20551a.r0(R$id.rvTimePeriod);
        j.e(lowFlingRecyclerView, "rvTimePeriod");
        materialTimePickerView.getClass();
        lowFlingRecyclerView.n0(intValue);
        return i.f20112a;
    }
}
