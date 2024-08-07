package mg;

import android.util.SparseIntArray;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.payment.data.model.BankQr;
import com.vpa.daugia.module.payment.ui.PaymentViewModel;
import d2.g;
import d2.i;
import gf.b;
import java.util.ArrayList;
import ye.c;

/* compiled from: FragmentTransferPaymentBindingImpl */
public final class f4 extends e4 {
    public static final SparseIntArray L;
    public final AppTextView I;
    public a J = new a();
    public long K = -1;

    /* compiled from: FragmentTransferPaymentBindingImpl */
    public class a implements g {
        public a() {
        }

        public final void b() {
            boolean z10;
            ArrayList<b> b10 = c.b(f4.this.B);
            PaymentViewModel paymentViewModel = f4.this.G;
            boolean z11 = true;
            if (paymentViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<ArrayList<b>> iVar = paymentViewModel.f19793h;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(b10);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(C0533R$id.tv1, 6);
        sparseIntArray.put(C0533R$id.ivQrCode, 7);
        sparseIntArray.put(C0533R$id.tvDownload, 8);
        sparseIntArray.put(C0533R$id.accountNumber, 9);
        sparseIntArray.put(C0533R$id.btnAccountNumber, 10);
        sparseIntArray.put(2131362023, 11);
        sparseIntArray.put(C0533R$id.btnContent, 12);
        sparseIntArray.put(C0533R$id.money, 13);
        sparseIntArray.put(C0533R$id.btnMoney, 14);
        sparseIntArray.put(C0533R$id.tvNotice, 15);
        sparseIntArray.put(C0533R$id.tv2, 16);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f4(d2.e r18, android.view.View r19) {
        /*
            r17 = this;
            r13 = r17
            r14 = r19
            android.util.SparseIntArray r0 = L
            r1 = 17
            r15 = 0
            r2 = r18
            java.lang.Object[] r16 = d2.l.o(r2, r14, r1, r15, r0)
            r0 = 9
            r0 = r16[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 10
            r0 = r16[r0]
            r3 = r0
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r0 = 12
            r0 = r16[r0]
            r4 = r0
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0 = 14
            r0 = r16[r0]
            r5 = r0
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r0 = 11
            r0 = r16[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 7
            r0 = r16[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 13
            r0 = r16[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 6
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r0 = 16
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r0 = 2
            r0 = r16[r0]
            r7 = r0
            com.ots.core.utils.customview.textview.AppTextView r7 = (com.ots.core.utils.customview.textview.AppTextView) r7
            r0 = 5
            r0 = r16[r0]
            r8 = r0
            com.ots.base.ui.AddressEdittext r8 = (com.ots.base.ui.AddressEdittext) r8
            r0 = 3
            r0 = r16[r0]
            r9 = r0
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r0 = 8
            r0 = r16[r0]
            r10 = r0
            com.ots.base.utils.customview.GradientTextView r10 = (com.ots.base.utils.customview.GradientTextView) r10
            r0 = 4
            r0 = r16[r0]
            r11 = r0
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r0 = 15
            r0 = r16[r0]
            r12 = r0
            com.ots.core.utils.customview.textview.AppTextView r12 = (com.ots.core.utils.customview.textview.AppTextView) r12
            r0 = r17
            r1 = r18
            r2 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            mg.f4$a r0 = new mg.f4$a
            r0.<init>()
            r13.J = r0
            r0 = -1
            r13.K = r0
            r0 = 0
            r0 = r16[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0.setTag(r15)
            r0 = 1
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r13.I = r0
            r0.setTag(r15)
            com.ots.core.utils.customview.textview.AppTextView r0 = r13.A
            r0.setTag(r15)
            com.ots.base.ui.AddressEdittext r0 = r13.B
            r0.setTag(r15)
            com.ots.core.utils.customview.textview.AppTextView r0 = r13.C
            r0.setTag(r15)
            com.ots.core.utils.customview.textview.AppTextView r0 = r13.E
            r0.setTag(r15)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r14.setTag(r0, r13)
            r17.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.f4.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        i<ArrayList<b>> iVar;
        synchronized (this) {
            j10 = this.K;
            this.K = 0;
        }
        BankQr bankQr = this.H;
        PaymentViewModel paymentViewModel = this.G;
        int i10 = ((10 & j10) > 0 ? 1 : ((10 & j10) == 0 ? 0 : -1));
        ArrayList arrayList = null;
        if (i10 == 0 || bankQr == null) {
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        } else {
            str3 = bankQr.getTotal();
            str2 = bankQr.getBankAccount();
            str = bankQr.getName();
            str4 = bankQr.getTransferContent();
        }
        int i11 = ((13 & j10) > 0 ? 1 : ((13 & j10) == 0 ? 0 : -1));
        if (i11 != 0) {
            if (paymentViewModel != null) {
                iVar = paymentViewModel.f19793h;
            } else {
                iVar = null;
            }
            u(0, iVar);
            if (iVar != null) {
                arrayList = (ArrayList) iVar.f8545b;
            }
        }
        if (i10 != 0) {
            e2.c.d(this.I, str);
            e2.c.d(this.A, str2);
            e2.c.d(this.C, str4);
            e2.c.d(this.E, str3);
        }
        if (i11 != 0) {
            c.f(this.B, arrayList);
        }
        if ((j10 & 8) != 0) {
            c.e(this.B, this.J);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.K = 8;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        if (i10 != 0) {
            return false;
        }
        i iVar = (i) obj;
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    public final void v(BankQr bankQr) {
        this.H = bankQr;
        synchronized (this) {
            this.K |= 2;
        }
        f(3);
        t();
    }

    public final void w(PaymentViewModel paymentViewModel) {
        this.G = paymentViewModel;
        synchronized (this) {
            this.K |= 4;
        }
        f(4);
        t();
    }
}
