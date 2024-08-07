package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import ug.b;

/* compiled from: ItemAwaitPlateBindingImpl */
public final class h5 extends g5 {
    public static final SparseIntArray G;
    public long F = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(C0533R$id.tvCountDown, 4);
        sparseIntArray.put(2131362804, 5);
        sparseIntArray.put(C0533R$id.llRegister, 6);
        sparseIntArray.put(C0533R$id.btnCart, 7);
        sparseIntArray.put(C0533R$id.btnRegister, 8);
        sparseIntArray.put(C0533R$id.tvMore, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h5(d2.e r15, android.view.View r16) {
        /*
            r14 = this;
            r11 = r14
            r12 = r16
            android.util.SparseIntArray r0 = G
            r1 = 10
            r13 = 0
            r2 = r15
            java.lang.Object[] r0 = d2.l.o(r15, r12, r1, r13, r0)
            r1 = 7
            r1 = r0[r1]
            r3 = r1
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r1 = 8
            r1 = r0[r1]
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r1 = 0
            r1 = r0[r1]
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r1 = 6
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 4
            r1 = r0[r1]
            com.ots.core.utils.customview.textview.AppTextView r1 = (com.ots.core.utils.customview.textview.AppTextView) r1
            r1 = 9
            r1 = r0[r1]
            r6 = r1
            com.ots.base.utils.customview.GradientTextView r6 = (com.ots.base.utils.customview.GradientTextView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            com.ots.base.utils.customview.TimeCounterView r8 = (com.ots.base.utils.customview.TimeCounterView) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r1 = 2
            r0 = r0[r1]
            r10 = r0
            com.ots.core.utils.customview.textview.AppTextView r10 = (com.ots.core.utils.customview.textview.AppTextView) r10
            r0 = r14
            r1 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r11.F = r0
            android.widget.LinearLayout r0 = r11.f21082y
            r0.setTag(r13)
            android.widget.TextView r0 = r11.A
            r0.setTag(r13)
            com.ots.core.utils.customview.textview.AppTextView r0 = r11.C
            r0.setTag(r13)
            com.ots.core.utils.customview.textview.AppTextView r0 = r11.D
            r0.setTag(r13)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r0, r14)
            r14.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.h5.<init>(d2.e, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.F     // Catch:{ all -> 0x00bb }
            r2 = 0
            r9.F = r2     // Catch:{ all -> 0x00bb }
            monitor-exit(r9)     // Catch:{ all -> 0x00bb }
            ug.b r4 = r9.E
            r5 = 3
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x00a7
            if (r4 == 0) goto L_0x00a7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.vpa.daugia.module.auction.data.model.AwaitAuction r3 = r4.f23044a
            java.lang.String r3 = r3.getPlateNumber()
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            r6 = 3
            if (r3 == 0) goto L_0x002d
            r7 = 0
            java.lang.String r3 = r3.substring(r7, r6)
            sk.j.e(r3, r5)
            goto L_0x002e
        L_0x002d:
            r3 = r1
        L_0x002e:
            r2.append(r3)
            r3 = 10
            r2.append(r3)
            com.vpa.daugia.module.auction.data.model.AwaitAuction r3 = r4.f23044a
            java.lang.String r3 = r3.getPlateNumber()
            r7 = 6
            if (r3 == 0) goto L_0x0047
            java.lang.String r3 = r3.substring(r6, r7)
            sk.j.e(r3, r5)
            goto L_0x0048
        L_0x0047:
            r3 = r1
        L_0x0048:
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            com.vpa.daugia.module.auction.data.model.AwaitAuction r3 = r4.f23044a
            java.lang.String r3 = r3.getPlateNumber()
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = r3.substring(r7)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            sk.j.e(r3, r5)
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.vpa.daugia.module.auction.data.model.AwaitAuction r5 = r4.f23044a
            java.lang.Long r5 = r5.getType()
            if (r5 == 0) goto L_0x0080
            long r5 = r5.longValue()
            int r1 = (int) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0080:
            java.lang.String r1 = ze.b.n(r1)
            r3.append(r1)
            java.lang.String r1 = " - "
            r3.append(r1)
            com.vpa.daugia.module.auction.data.model.AwaitAuction r1 = r4.f23044a
            java.lang.String r1 = r1.getNameProvince()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.vpa.daugia.module.auction.data.model.AwaitAuction r3 = r4.f23044a
            java.lang.Integer r3 = r3.getWishListCount()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8 = r2
            r2 = r1
            r1 = r8
            goto L_0x00a9
        L_0x00a7:
            r2 = r1
            r3 = r2
        L_0x00a9:
            if (r0 == 0) goto L_0x00ba
            android.widget.TextView r0 = r9.A
            e2.c.d(r0, r1)
            com.ots.core.utils.customview.textview.AppTextView r0 = r9.C
            e2.c.d(r0, r3)
            com.ots.core.utils.customview.textview.AppTextView r0 = r9.D
            e2.c.d(r0, r2)
        L_0x00ba:
            return
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00bb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.h5.h():void");
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

    public final void v(b bVar) {
        this.E = bVar;
        synchronized (this) {
            this.F |= 1;
        }
        f(3);
        t();
    }
}
