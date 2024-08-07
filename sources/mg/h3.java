package mg;

import android.os.Build;
import android.support.v4.media.a;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.AccountType;
import e2.c;
import rh.d;
import rh.e;
import rh.f;
import sk.j;
import yk.l;

/* compiled from: FragmentHomeBindingImpl */
public final class h3 extends g3 {
    public static final SparseIntArray L;
    public final AppTextView J;
    public long K = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(2131362339, 3);
        sparseIntArray.put(C0533R$id.ivLogo, 4);
        sparseIntArray.put(C0533R$id.btnCart, 5);
        sparseIntArray.put(C0533R$id.btnNotify, 6);
        sparseIntArray.put(C0533R$id.lnTitle, 7);
        sparseIntArray.put(C0533R$id.ivAvatar, 8);
        sparseIntArray.put(C0533R$id.searchView, 9);
        sparseIntArray.put(C0533R$id.rcvAuctions, 10);
        sparseIntArray.put(C0533R$id.tvAnnouncementList, 11);
        sparseIntArray.put(C0533R$id.rcv, 12);
        sparseIntArray.put(C0533R$id.tvAllList, 13);
        sparseIntArray.put(C0533R$id.rcvPlate, 14);
        sparseIntArray.put(C0533R$id.rcvNotify, 15);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h3(d2.e r20, android.view.View r21) {
        /*
            r19 = this;
            r15 = r19
            r14 = r21
            android.util.SparseIntArray r0 = L
            r1 = 16
            r13 = 0
            r2 = r20
            java.lang.Object[] r16 = d2.l.o(r2, r14, r1, r13, r0)
            r0 = 5
            r0 = r16[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 6
            r0 = r16[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 8
            r0 = r16[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 4
            r0 = r16[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 7
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 3
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 12
            r0 = r16[r0]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = 10
            r0 = r16[r0]
            r8 = r0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r0 = 15
            r0 = r16[r0]
            r9 = r0
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r0 = 14
            r0 = r16[r0]
            r10 = r0
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r0 = 9
            r0 = r16[r0]
            r11 = r0
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r0 = 13
            r0 = r16[r0]
            r12 = r0
            com.ots.base.utils.customview.GradientTextView r12 = (com.ots.base.utils.customview.GradientTextView) r12
            r0 = 11
            r0 = r16[r0]
            r17 = r0
            com.ots.base.utils.customview.GradientTextView r17 = (com.ots.base.utils.customview.GradientTextView) r17
            r0 = 2
            r0 = r16[r0]
            r18 = r0
            com.ots.core.utils.customview.textview.AppTextView r18 = (com.ots.core.utils.customview.textview.AppTextView) r18
            r0 = r19
            r1 = r20
            r2 = r21
            r13 = r17
            r14 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1
            r15.K = r0
            r0 = 0
            r0 = r16[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r15.J = r0
            r0.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r0 = r15.H
            r0.setTag(r1)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r1 = r21
            r1.setTag(r0, r15)
            r19.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.h3.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        Spanned spanned;
        String str;
        String str2;
        boolean z10;
        Spanned spanned2;
        String str3;
        String str4;
        synchronized (this) {
            j10 = this.K;
            this.K = 0;
        }
        f fVar = this.I;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str5 = null;
        if (i10 == 0 || fVar == null) {
            spanned = null;
        } else {
            Integer accountType = fVar.f22793b.getAccountType();
            AccountType accountType2 = AccountType.PERSON;
            int value = accountType2.getValue();
            if (accountType != null && accountType.intValue() == value) {
                str = fVar.f22793b.getFullname();
            } else {
                str = fVar.f22793b.getCompanyName();
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            boolean z11 = true;
            if (str2.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int S0 = l.S0("Đăng ký hoặc Đăng nhập", "Đăng ký", 0, false, 6);
                int S02 = l.S0("Đăng ký hoặc Đăng nhập", "Đăng nhập", 0, false, 6);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("Đăng ký hoặc Đăng nhập");
                int i11 = S0 + 7;
                spannableStringBuilder.setSpan(new StyleSpan(1), S0, i11, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(fVar.f22792a.getColor(C0529R$color.dark_green)), S0, i11, 33);
                int i12 = S02 + 9;
                spannableStringBuilder.setSpan(new StyleSpan(1), S02, i12, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(fVar.f22792a.getColor(C0529R$color.dark_green)), S02, i12, 33);
                spannableStringBuilder.setSpan(new d(fVar), S0, i11, 0);
                spannableStringBuilder.setSpan(new e(fVar), S02, i12, 0);
                spanned2 = spannableStringBuilder;
            } else {
                StringBuilder q10 = a.q("<strong>");
                if (str == null) {
                    str = "";
                }
                q10.append(str);
                q10.append("</strong>");
                String sb2 = q10.toString();
                j.f(sb2, "string");
                if (Build.VERSION.SDK_INT >= 24) {
                    spanned2 = Html.fromHtml(sb2, 0);
                    j.c(spanned2);
                } else {
                    spanned2 = Html.fromHtml(sb2);
                    j.c(spanned2);
                }
            }
            Integer accountType3 = fVar.f22793b.getAccountType();
            int value2 = accountType2.getValue();
            if (accountType3 != null && accountType3.intValue() == value2) {
                str3 = fVar.f22793b.getFullname();
            } else {
                str3 = fVar.f22793b.getCompanyName();
            }
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() != 0) {
                z11 = false;
            }
            if (z11) {
                str4 = "Để tham gia buổi đấu giá";
            } else {
                str4 = "Chào mừng";
            }
            String str6 = str4;
            spanned = spanned2;
            str5 = str6;
        }
        if (i10 != 0) {
            c.d(this.J, str5);
            c.d(this.H, spanned);
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
            this.K = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(f fVar) {
        this.I = fVar;
        synchronized (this) {
            this.K |= 1;
        }
        f(2);
        t();
    }
}
