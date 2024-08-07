package a6;

import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import com.github.florent37.singledateandtimepicker.widget.WheelPicker;
import java.util.Iterator;

/* compiled from: SingleDateAndTimePicker */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SingleDateAndTimePicker f105a;

    public b(SingleDateAndTimePicker singleDateAndTimePicker) {
        this.f105a = singleDateAndTimePicker;
    }

    public final void run() {
        SingleDateAndTimePicker singleDateAndTimePicker = this.f105a;
        if (singleDateAndTimePicker.f5117s != null) {
            if (singleDateAndTimePicker.f5106a.a(singleDateAndTimePicker.getDate()).before(singleDateAndTimePicker.f5106a.a(singleDateAndTimePicker.f5117s))) {
                Iterator it = this.f105a.f5114p.iterator();
                while (it.hasNext()) {
                    WheelPicker wheelPicker = (WheelPicker) it.next();
                    wheelPicker.q(wheelPicker.g(this.f105a.f5117s));
                }
            }
        }
    }
}
