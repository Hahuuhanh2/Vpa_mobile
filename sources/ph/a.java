package ph;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.datepicker.q;
import com.google.android.material.divider.MaterialDivider;
import com.ots.core.R$layout;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.home.ui.AuctionNotifyActivity;
import ef.f;
import ff.a;
import kf.h;
import mg.u2;
import sk.j;
import v.i;

/* compiled from: DialogPdf.kt */
public final class a extends f.a<a> {

    /* renamed from: i  reason: collision with root package name */
    public u2 f22642i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(AuctionNotifyActivity auctionNotifyActivity, String str) {
        super(auctionNotifyActivity);
        MaterialCardView materialCardView;
        j.f(auctionNotifyActivity, "context");
        View inflate = LayoutInflater.from(auctionNotifyActivity).inflate(C0535R$layout.dialog_pdf, (ViewGroup) null, false);
        int i10 = 2131361936;
        ImageButton imageButton = (ImageButton) j7.a.D(2131361936, inflate);
        if (imageButton != null) {
            i10 = 2131361937;
            MaterialButton materialButton = (MaterialButton) j7.a.D(2131361937, inflate);
            if (materialButton != null) {
                i10 = 2131362284;
                MaterialDivider materialDivider = (MaterialDivider) j7.a.D(2131362284, inflate);
                if (materialDivider != null) {
                    i10 = C0533R$id.lnPdf;
                    if (((LinearLayout) j7.a.D(C0533R$id.lnPdf, inflate)) != null) {
                        i10 = C0533R$id.lnTitle;
                        if (((LinearLayout) j7.a.D(C0533R$id.lnTitle, inflate)) != null) {
                            i10 = C0533R$id.pdfView;
                            PDFView pDFView = (PDFView) j7.a.D(C0533R$id.pdfView, inflate);
                            if (pDFView != null) {
                                this.f22642i = new u2((MaterialCardView) inflate, imageButton, materialButton, materialDivider, pDFView, 0);
                                try {
                                    Dialog dialog = new Dialog(auctionNotifyActivity);
                                    dialog.setContentView(LayoutInflater.from(auctionNotifyActivity).inflate(R$layout.widget_progress_dialog, (ViewGroup) null));
                                    dialog.setCancelable(false);
                                    Window window = dialog.getWindow();
                                    if (window != null) {
                                        window.setBackgroundDrawable(new ColorDrawable(0));
                                    }
                                } catch (Exception e10) {
                                    h.a(e10);
                                    new Dialog(auctionNotifyActivity);
                                }
                                new Thread(new i(8, str, this, auctionNotifyActivity)).start();
                                this.f22642i.f21378c.setOnClickListener(new q(this, 24));
                                this.f22642i.f21379d.setOnClickListener(new com.google.android.material.search.h(this, 24));
                                g(-1);
                                u2 u2Var = this.f22642i;
                                switch (u2Var.f21376a) {
                                    case 0:
                                        materialCardView = u2Var.f21377b;
                                        break;
                                    default:
                                        materialCardView = u2Var.f21377b;
                                        break;
                                }
                                e(materialCardView);
                                ff.a.f10210a.getClass();
                                a.C0107a aVar = a.C0107a.f10211a;
                                c();
                                d(false);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
