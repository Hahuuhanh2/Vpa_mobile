package mj;

import ek.i;
import io.github.g00fy2.quickie.QRScannerActivity;
import rk.l;
import sk.j;

/* compiled from: QRScannerActivity.kt */
public final class k extends sk.k implements l<Exception, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ QRScannerActivity f21567a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(QRScannerActivity qRScannerActivity) {
        super(1);
        this.f21567a = qRScannerActivity;
    }

    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        j.f(exc, "exception");
        QRScannerActivity qRScannerActivity = this.f21567a;
        int i10 = QRScannerActivity.Q;
        qRScannerActivity.L(exc);
        return i.f20112a;
    }
}
