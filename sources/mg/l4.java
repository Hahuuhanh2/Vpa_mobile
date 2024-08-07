package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.library.R$id;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.e;
import d2.l;
import qh.a;

/* compiled from: ItemActionHomeBindingImpl */
public final class l4 extends k4 {

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f21164x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21165y;

    /* renamed from: z  reason: collision with root package name */
    public long f21166z = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l4(e eVar, View view) {
        super(view, eVar);
        Object[] o10 = l.o(eVar, view, 3, (l.d) null, (SparseIntArray) null);
        ((LinearLayout) o10[0]).setTag((Object) null);
        ImageView imageView = (ImageView) o10[1];
        this.f21164x = imageView;
        imageView.setTag((Object) null);
        AppTextView appTextView = (AppTextView) o10[2];
        this.f21165y = appTextView;
        appTextView.setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f21166z     // Catch:{ all -> 0x0042 }
            r2 = 0
            r7.f21166z = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            qh.a r4 = r7.f21154w
            r5 = 3
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0034
            if (r4 == 0) goto L_0x0029
            com.vpa.daugia.module.home.data.model.Item r2 = r4.f22753b
            android.content.Context r3 = r4.f22752a
            java.lang.Integer r4 = r2.getId()
            if (r4 == 0) goto L_0x0023
            int r4 = r4.intValue()
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            goto L_0x002b
        L_0x0029:
            r2 = r1
            r3 = r2
        L_0x002b:
            if (r2 == 0) goto L_0x0031
            java.lang.String r1 = r2.getTitle()
        L_0x0031:
            r2 = r1
            r1 = r3
            goto L_0x0035
        L_0x0034:
            r2 = r1
        L_0x0035:
            if (r0 == 0) goto L_0x0041
            android.widget.ImageView r0 = r7.f21164x
            r0.setImageDrawable(r1)
            com.ots.core.utils.customview.textview.AppTextView r0 = r7.f21165y
            e2.c.d(r0, r2)
        L_0x0041:
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.l4.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21166z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21166z = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(a aVar) {
        this.f21154w = aVar;
        synchronized (this) {
            this.f21166z |= 1;
        }
        f(3);
        t();
    }
}
