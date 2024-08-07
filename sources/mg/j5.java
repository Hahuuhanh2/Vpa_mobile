package mg;

import android.util.SparseIntArray;
import android.widget.ImageView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import ui.d;

/* compiled from: ItemCategoryBindingImpl */
public final class j5 extends i5 {
    public static final SparseIntArray C;
    public final AppTextView A;
    public long B = -1;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f21131z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(2131362244, 3);
        sparseIntArray.put(C0533R$id.ivNext, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j5(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = C
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3 = 4
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r5.<init>(r6, r7, r1, r3)
            r3 = -1
            r5.B = r3
            r6 = 0
            r6 = r0[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6.setTag(r2)
            r6 = 1
            r6 = r0[r6]
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f21131z = r6
            r6.setTag(r2)
            r6 = 2
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.A = r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j5.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.B     // Catch:{ all -> 0x005d }
            r2 = 0
            r9.B = r2     // Catch:{ all -> 0x005d }
            monitor-exit(r9)     // Catch:{ all -> 0x005d }
            ui.d r4 = r9.f21119y
            r5 = 0
            r6 = 3
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x004f
            if (r4 == 0) goto L_0x003a
            com.vpa.daugia.module.support.data.model.Categories r2 = r4.f23072a
            int r3 = r4.f23073b
            r4 = 1
            if (r3 == r4) goto L_0x0035
            r4 = 2
            if (r3 == r4) goto L_0x0031
            r4 = 3
            if (r3 == r4) goto L_0x002d
            r4 = 4
            if (r3 == r4) goto L_0x0029
            r3 = 2131231321(0x7f080259, float:1.807872E38)
            goto L_0x0038
        L_0x0029:
            r3 = 2131231328(0x7f080260, float:1.8078734E38)
            goto L_0x0038
        L_0x002d:
            r3 = 2131231307(0x7f08024b, float:1.8078691E38)
            goto L_0x0038
        L_0x0031:
            r3 = 2131231289(0x7f080239, float:1.8078655E38)
            goto L_0x0038
        L_0x0035:
            r3 = 2131231405(0x7f0802ad, float:1.807889E38)
        L_0x0038:
            r5 = r3
            goto L_0x003b
        L_0x003a:
            r2 = r1
        L_0x003b:
            if (r2 == 0) goto L_0x0041
            java.lang.String r1 = r2.getCategoryTitle()
        L_0x0041:
            android.view.View r2 = r9.f8554e
            android.content.Context r2 = r2.getContext()
            android.graphics.drawable.Drawable r2 = k1.a.getDrawable(r2, r5)
            r8 = r2
            r2 = r1
            r1 = r8
            goto L_0x0050
        L_0x004f:
            r2 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x005c
            android.widget.ImageView r0 = r9.f21131z
            r0.setBackground(r1)
            com.ots.core.utils.customview.textview.AppTextView r0 = r9.A
            e2.c.d(r0, r2)
        L_0x005c:
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x005d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j5.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.B = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(d dVar) {
        this.f21119y = dVar;
        synchronized (this) {
            this.B |= 1;
        }
        f(3);
        t();
    }
}
