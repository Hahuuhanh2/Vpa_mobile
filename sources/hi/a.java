package hi;

import android.view.View;
import com.vpa.daugia.module.qr.QROverlayView;
import rk.l;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20521a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f20522b;

    public /* synthetic */ a(int i10, l lVar) {
        this.f20521a = i10;
        this.f20522b = lVar;
    }

    public final void onClick(View view) {
        switch (this.f20521a) {
            case 0:
                l lVar = this.f20522b;
                int i10 = QROverlayView.f19826y;
                j.f(lVar, "$action");
                lVar.invoke(Boolean.valueOf(!view.isSelected()));
                return;
            default:
                l lVar2 = this.f20522b;
                int i11 = io.github.g00fy2.quickie.QROverlayView.f20700y;
                j.f(lVar2, "$action");
                lVar2.invoke(Boolean.valueOf(!view.isSelected()));
                return;
        }
    }
}
