package hi;

import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.qr.ScanQrActivity;
import ek.i;
import j7.a;
import nj.b;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: ScanQrActivity.kt */
public final class c extends k implements l<b.a, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScanQrActivity f20525a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ScanQrActivity scanQrActivity) {
        super(1);
        this.f20525a = scanQrActivity;
    }

    public final Object invoke(Object obj) {
        b.a aVar = (b.a) obj;
        j.f(aVar, "$this$build");
        aVar.f21733a = a.c0(nj.a.FORMAT_QR_CODE);
        aVar.f21735c = true;
        aVar.f21736d = false;
        aVar.f21739g = false;
        aVar.f21737e = 1.0f;
        aVar.f21738f = false;
        this.f20525a.setTitle(C0540R$string.title_home);
        return i.f20112a;
    }
}
