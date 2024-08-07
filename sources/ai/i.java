package ai;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.vpa.daugia.module.payment.data.model.BankQr;
import mg.e4;
import rk.l;
import sk.k;
import tg.d;

/* compiled from: TransferPaymentFragment.kt */
public final class i extends k implements l<BankQr, ek.i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f18979a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(1);
        this.f18979a = jVar;
    }

    public final Object invoke(Object obj) {
        BankQr bankQr = (BankQr) obj;
        ((e4) this.f18979a.i0()).v(bankQr);
        ((e4) this.f18979a.i0()).f21047z.setImageBitmap(Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888));
        ImageView imageView = ((e4) this.f18979a.i0()).f21047z;
        j jVar = this.f18979a;
        String qrCode = bankQr.getQrCode();
        if (qrCode == null) {
            qrCode = "";
        }
        imageView.setImageBitmap(j.m0(jVar, qrCode));
        ((e4) this.f18979a.i0()).D.setOnClickListener(new d(3, this.f18979a, bankQr));
        return ek.i.f20112a;
    }
}
