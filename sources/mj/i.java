package mj;

import io.github.g00fy2.quickie.QROverlayView;
import io.github.g00fy2.quickie.QRScannerActivity;
import pj.a;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: QRScannerActivity.kt */
public final class i extends k implements l<Integer, ek.i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ QRScannerActivity f21564a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(QRScannerActivity qRScannerActivity) {
        super(1);
        this.f21564a = qRScannerActivity;
    }

    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        a aVar = this.f21564a.I;
        if (aVar != null) {
            QROverlayView qROverlayView = aVar.f22659a;
            boolean z10 = true;
            if (num == null || num.intValue() != 1) {
                z10 = false;
            }
            qROverlayView.setTorchState(z10);
            return ek.i.f20112a;
        }
        j.l("binding");
        throw null;
    }
}
