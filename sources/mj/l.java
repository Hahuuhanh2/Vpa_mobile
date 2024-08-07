package mj;

import ek.i;
import io.github.g00fy2.quickie.QRScannerActivity;
import pj.a;
import sk.j;
import sk.k;

/* compiled from: QRScannerActivity.kt */
public final class l extends k implements rk.l<Boolean, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ QRScannerActivity f21568a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(QRScannerActivity qRScannerActivity) {
        super(1);
        this.f21568a = qRScannerActivity;
    }

    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        QRScannerActivity qRScannerActivity = this.f21568a;
        int i10 = QRScannerActivity.Q;
        if (!qRScannerActivity.isFinishing()) {
            a aVar = qRScannerActivity.I;
            if (aVar != null) {
                aVar.f22659a.setLoading(booleanValue);
            } else {
                j.l("binding");
                throw null;
            }
        }
        return i.f20112a;
    }
}
