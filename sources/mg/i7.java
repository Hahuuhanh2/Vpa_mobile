package mg;

import android.util.SparseIntArray;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.cart.data.model.Cart;
import e2.c;
import eh.a;

/* compiled from: ItemUnpaidCartBindingImpl */
public final class i7 extends h7 {
    public static final SparseIntArray G;
    public final AppTextView A;
    public final AppTextView B;
    public final AppTextView C;
    public final AppTextView D;
    public final AppTextView E;
    public long F = -1;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21122z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(C0533R$id.btnDelete, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i7(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = G
            r1 = 9
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 7
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r3 = 8
            r3 = r0[r3]
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r5.<init>(r6, r7, r1, r3)
            r3 = -1
            r5.F = r3
            com.google.android.material.button.MaterialButton r6 = r5.f21095w
            r6.setTag(r2)
            r6 = 0
            r6 = r0[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6.setTag(r2)
            r6 = 1
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.f21122z = r6
            r6.setTag(r2)
            r6 = 2
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.A = r6
            r6.setTag(r2)
            r6 = 3
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.B = r6
            r6.setTag(r2)
            r6 = 4
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.C = r6
            r6.setTag(r2)
            r6 = 5
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.D = r6
            r6.setTag(r2)
            r6 = 6
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.E = r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.i7.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        String str5;
        String str6;
        boolean z10;
        int i11;
        Cart cart;
        String str7;
        long j11;
        long j12;
        long j13;
        long j14;
        synchronized (this) {
            j10 = this.F;
            this.F = 0;
        }
        a aVar = this.f21097y;
        int i12 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        int i13 = 0;
        String str8 = null;
        if (i12 != 0) {
            if (aVar != null) {
                cart = aVar.f20059a;
                str3 = aVar.c();
                if (aVar.f20059a.getDueDate() == null) {
                    str2 = "Chưa có kế hoạch đấu giá";
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    Long dueDate = aVar.f20059a.getDueDate();
                    if (dueDate != null) {
                        j14 = dueDate.longValue();
                    } else {
                        j14 = 0;
                    }
                    if (currentTimeMillis > j14) {
                        str2 = "Quá hạn thanh toán";
                    } else {
                        str2 = "Chưa thanh toán";
                    }
                }
                Long dueDate2 = aVar.f20059a.getDueDate();
                i11 = C0529R$color.un_paid;
                if (dueDate2 != null) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Long dueDate3 = aVar.f20059a.getDueDate();
                    if (dueDate3 != null) {
                        j13 = dueDate3.longValue();
                    } else {
                        j13 = 0;
                    }
                    if (currentTimeMillis2 > j13) {
                        i11 = C0529R$color.expired;
                    }
                }
                z10 = true;
                if (aVar.f20059a.getDueDate() != null) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    Long dueDate4 = aVar.f20059a.getDueDate();
                    if (dueDate4 != null) {
                        j12 = dueDate4.longValue();
                    } else {
                        j12 = 0;
                    }
                    if (currentTimeMillis3 >= j12) {
                        z10 = false;
                    }
                }
                str = String.valueOf(aVar.f20059a.getQuantity());
                str6 = aVar.b();
                str7 = aVar.d();
            } else {
                i11 = 0;
                z10 = false;
                str7 = null;
                cart = null;
                str3 = null;
                str2 = null;
                str = null;
                str6 = null;
            }
            if (i12 != 0) {
                if (z10) {
                    j11 = 8;
                } else {
                    j11 = 4;
                }
                j10 |= j11;
            }
            if (cart != null) {
                str8 = cart.getOrderCode();
            }
            i10 = this.f8554e.getContext().getColor(i11);
            if (!z10) {
                i13 = 8;
            }
            str4 = str7;
            str5 = str6;
        } else {
            i10 = 0;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((j10 & 3) != 0) {
            this.f21095w.setVisibility(i13);
            c.d(this.f21122z, str8);
            c.d(this.A, str3);
            c.d(this.B, str2);
            this.B.setTextColor(i10);
            c.d(this.C, str5);
            c.d(this.D, str);
            c.d(this.E, str4);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.F = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(a aVar) {
        this.f21097y = aVar;
        synchronized (this) {
            this.F |= 1;
        }
        f(3);
        t();
    }
}
