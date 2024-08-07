package a6;

import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import com.github.florent37.singledateandtimepicker.widget.WheelPicker;
import java.util.Iterator;

/* compiled from: SingleDateAndTimePicker */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SingleDateAndTimePicker f106a;

    public c(SingleDateAndTimePicker singleDateAndTimePicker) {
        this.f106a = singleDateAndTimePicker;
    }

    public final void run() {
        SingleDateAndTimePicker singleDateAndTimePicker = this.f106a;
        if (singleDateAndTimePicker.f5118t != null) {
            if (singleDateAndTimePicker.f5106a.a(singleDateAndTimePicker.getDate()).after(singleDateAndTimePicker.f5106a.a(singleDateAndTimePicker.f5118t))) {
                Iterator it = this.f106a.f5114p.iterator();
                while (it.hasNext()) {
                    WheelPicker wheelPicker = (WheelPicker) it.next();
                    wheelPicker.q(wheelPicker.g(this.f106a.f5118t));
                }
            }
        }
    }
}
