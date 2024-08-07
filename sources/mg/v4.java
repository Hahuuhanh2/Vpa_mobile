package mg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.library.R$id;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.history.data.model.NotifyAuction;
import d2.e;
import d2.l;
import java.text.SimpleDateFormat;
import java.util.Locale;
import qh.c;

/* compiled from: ItemAuctionDocumentBindingImpl */
public final class v4 extends u4 {

    /* renamed from: x  reason: collision with root package name */
    public final AppTextView f21403x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21404y;

    /* renamed from: z  reason: collision with root package name */
    public long f21405z = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v4(e eVar, View view) {
        super(view, eVar);
        Object[] o10 = l.o(eVar, view, 3, (l.d) null, (SparseIntArray) null);
        ((MaterialCardView) o10[0]).setTag((Object) null);
        AppTextView appTextView = (AppTextView) o10[1];
        this.f21403x = appTextView;
        appTextView.setTag((Object) null);
        AppTextView appTextView2 = (AppTextView) o10[2];
        this.f21404y = appTextView2;
        appTextView2.setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        long j10;
        String str;
        NotifyAuction notifyAuction;
        synchronized (this) {
            j10 = this.f21405z;
            this.f21405z = 0;
        }
        c cVar = this.f21385w;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str2 = null;
        if (i10 != 0) {
            if (cVar != null) {
                notifyAuction = cVar.f22756a;
                Long timePublic = notifyAuction.getTimePublic();
                if (timePublic != null) {
                    str = n0.l.h(timePublic.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
            } else {
                notifyAuction = null;
                str = null;
            }
            if (notifyAuction != null) {
                str2 = notifyAuction.getNameFile();
            }
        } else {
            str = null;
        }
        if (i10 != 0) {
            e2.c.d(this.f21403x, str2);
            e2.c.d(this.f21404y, str);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21405z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21405z = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(c cVar) {
        this.f21385w = cVar;
        synchronized (this) {
            this.f21405z |= 1;
        }
        f(3);
        t();
    }
}
