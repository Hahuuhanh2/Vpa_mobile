package mg;

import android.util.SparseIntArray;
import android.widget.LinearLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auth.data.model.AccountType;
import com.vpa.daugia.module.auth.data.model.User;
import e2.c;
import k1.a;
import rh.f;
import sk.j;
import ze.d;

/* compiled from: FragmentMenuBindingImpl */
public final class l3 extends k3 {
    public static final SparseIntArray O;
    public final AppTextView K;
    public final AppTextView L;
    public final LinearLayout M;
    public long N = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(2131362339, 6);
        sparseIntArray.put(C0533R$id.tvDateTime, 7);
        sparseIntArray.put(C0533R$id.tvVerify, 8);
        sparseIntArray.put(C0533R$id.tvAccount, 9);
        sparseIntArray.put(C0533R$id.btnSetting, 10);
        sparseIntArray.put(C0533R$id.btnChangePassword, 11);
        sparseIntArray.put(C0533R$id.btnDocument, 12);
        sparseIntArray.put(C0533R$id.btnHistory, 13);
        sparseIntArray.put(C0533R$id.btnResult, 14);
        sparseIntArray.put(C0533R$id.btnLogout, 15);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l3(d2.e r21, android.view.View r22) {
        /*
            r20 = this;
            r15 = r20
            r14 = r22
            android.util.SparseIntArray r0 = O
            r1 = 16
            r13 = 0
            r2 = r21
            java.lang.Object[] r16 = d2.l.o(r2, r14, r1, r13, r0)
            r0 = 11
            r0 = r16[r0]
            r3 = r0
            com.ots.core.utils.customview.textview.AppTextView r3 = (com.ots.core.utils.customview.textview.AppTextView) r3
            r0 = 12
            r0 = r16[r0]
            r4 = r0
            com.ots.core.utils.customview.textview.AppTextView r4 = (com.ots.core.utils.customview.textview.AppTextView) r4
            r0 = 13
            r0 = r16[r0]
            r5 = r0
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r0 = 15
            r0 = r16[r0]
            r6 = r0
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r0 = 14
            r0 = r16[r0]
            r7 = r0
            com.ots.core.utils.customview.textview.AppTextView r7 = (com.ots.core.utils.customview.textview.AppTextView) r7
            r0 = 10
            r0 = r16[r0]
            r8 = r0
            com.ots.core.utils.customview.textview.AppTextView r8 = (com.ots.core.utils.customview.textview.AppTextView) r8
            r0 = 0
            r0 = r16[r0]
            r9 = r0
            androidx.core.widget.NestedScrollView r9 = (androidx.core.widget.NestedScrollView) r9
            r0 = 2
            r0 = r16[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 6
            r0 = r16[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 9
            r0 = r16[r0]
            r12 = r0
            com.ots.core.utils.customview.textview.AppTextView r12 = (com.ots.core.utils.customview.textview.AppTextView) r12
            r0 = 7
            r0 = r16[r0]
            r17 = r0
            com.ots.core.utils.customview.textview.AppTextView r17 = (com.ots.core.utils.customview.textview.AppTextView) r17
            r0 = 3
            r0 = r16[r0]
            r18 = r0
            com.ots.core.utils.customview.textview.AppTextView r18 = (com.ots.core.utils.customview.textview.AppTextView) r18
            r0 = 8
            r0 = r16[r0]
            r19 = r0
            com.ots.core.utils.customview.textview.AppTextView r19 = (com.ots.core.utils.customview.textview.AppTextView) r19
            r0 = r20
            r1 = r21
            r2 = r22
            r13 = r17
            r14 = r18
            r15 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -1
            r2 = r20
            r2.N = r0
            androidx.core.widget.NestedScrollView r0 = r2.C
            r1 = 0
            r0.setTag(r1)
            android.widget.ImageView r0 = r2.D
            r0.setTag(r1)
            r0 = 1
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r2.K = r0
            r0.setTag(r1)
            r0 = 4
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r2.L = r0
            r0.setTag(r1)
            r0 = 5
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.M = r0
            r0.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r0 = r2.H
            r0.setTag(r1)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r1 = r22
            r1.setTag(r0, r2)
            r20.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.l3.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        int i10;
        String str2;
        int i11;
        String str3;
        int i12;
        String str4;
        boolean z10;
        int i13;
        User user;
        int i14;
        long j11;
        long j12;
        int i15;
        int i16;
        int i17;
        int i18;
        synchronized (this) {
            j10 = this.N;
            this.N = 0;
        }
        f fVar = this.J;
        int i19 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i19 != 0) {
            if (fVar != null) {
                Integer profileStatus = fVar.f22793b.getProfileStatus();
                if (profileStatus != null) {
                    i15 = profileStatus.intValue();
                } else {
                    i15 = 0;
                }
                if (i15 == 5) {
                    i13 = C0529R$color.dark_green;
                } else {
                    i13 = C0529R$color.un_paid;
                }
                str = fVar.a();
                Integer profileStatus2 = fVar.f22793b.getProfileStatus();
                if (profileStatus2 != null) {
                    i16 = profileStatus2.intValue();
                } else {
                    i16 = 0;
                }
                if (i16 < 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                user = fVar.f22793b;
                Integer profileStatus3 = user.getProfileStatus();
                if (profileStatus3 != null) {
                    i17 = profileStatus3.intValue();
                } else {
                    i17 = 0;
                }
                if (i17 == 5) {
                    str3 = fVar.f22792a.getString(C0540R$string.verification_account);
                    j.e(str3, "getString(...)");
                } else {
                    Integer profileStatus4 = fVar.f22793b.getProfileStatus();
                    if (profileStatus4 != null) {
                        i18 = profileStatus4.intValue();
                    } else {
                        i18 = 0;
                    }
                    if (i18 < 2) {
                        str3 = fVar.f22792a.getString(C0540R$string.unverify_account);
                        j.e(str3, "getString(...)");
                    } else {
                        str3 = "Chờ duyệt tài khoản";
                    }
                }
                Integer accountType = fVar.f22793b.getAccountType();
                AccountType accountType2 = AccountType.PERSON;
                int value = accountType2.getValue();
                if (accountType != null && accountType.intValue() == value) {
                    str4 = accountType2.getText();
                } else {
                    str4 = AccountType.ORGANIZATION.getText();
                }
            } else {
                str4 = null;
                str3 = null;
                user = null;
                i13 = 0;
                str = null;
                z10 = false;
            }
            if (i19 != 0) {
                if (z10) {
                    j12 = j10 | 8;
                    j11 = 32;
                } else {
                    j12 = j10 | 4;
                    j11 = 16;
                }
                j10 = j12 | j11;
            }
            i12 = a.getColor(this.f8554e.getContext(), i13);
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            if (z10) {
                i14 = 8;
            } else {
                i14 = 0;
            }
            if (user != null) {
                str2 = user.getCompanyName();
                i10 = i14;
            } else {
                i10 = i14;
                str2 = null;
            }
        } else {
            str4 = null;
            i12 = 0;
            str3 = null;
            i11 = 0;
            str2 = null;
            i10 = 0;
            str = null;
        }
        if ((j10 & 3) != 0) {
            d.a(this.D, str2, "CIRCLE", true);
            c.d(this.K, str4);
            this.L.setVisibility(i10);
            c.d(this.L, str3);
            this.L.setTextColor(i12);
            this.M.setVisibility(i11);
            c.d(this.H, str);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.N != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.N = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(f fVar) {
        this.J = fVar;
        synchronized (this) {
            this.N |= 1;
        }
        f(2);
        t();
    }
}
