package wi;

import al.g0;
import android.content.DialogInterface;
import com.vpa.daugia.ui.MainActivity;
import jf.b;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f23424a;

    public /* synthetic */ c(MainActivity mainActivity) {
        this.f23424a = mainActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        MainActivity mainActivity = this.f23424a;
        int i10 = MainActivity.Z;
        j.f(mainActivity, "this$0");
        b bVar = new b(mainActivity, "Cập nhật phiên bản mới", "Đã có phiên bản mới. Vui lòng cập nhật để tiếp tục sử dụng", "Để sau", "Cập nhật", false);
        bVar.f11889j = new g0();
        bVar.h();
    }
}
