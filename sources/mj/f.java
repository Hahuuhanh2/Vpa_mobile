package mj;

import android.content.DialogInterface;
import android.view.KeyEvent;
import io.github.g00fy2.quickie.QRScannerActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ QRScannerActivity f21561a;

    public /* synthetic */ f(QRScannerActivity qRScannerActivity) {
        this.f21561a = qRScannerActivity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        QRScannerActivity qRScannerActivity = this.f21561a;
        int i11 = QRScannerActivity.Q;
        j.f(qRScannerActivity, "this$0");
        if (i10 != 4) {
            return false;
        }
        qRScannerActivity.finish();
        dialogInterface.dismiss();
        return true;
    }
}
