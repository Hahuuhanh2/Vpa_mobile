package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.library.R$id;
import com.google.android.material.divider.MaterialDivider;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import d2.e;
import d2.l;

/* compiled from: ItemForgotStep2BindingImpl */
public final class t5 extends s5 {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21361x;

    /* renamed from: w  reason: collision with root package name */
    public long f21362w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21361x = sparseIntArray;
        sparseIntArray.put(C0533R$id.lnStep1, 1);
        sparseIntArray.put(C0533R$id.step1, 2);
        sparseIntArray.put(C0533R$id.tvContent1, 3);
        sparseIntArray.put(2131362285, 4);
        sparseIntArray.put(C0533R$id.lnStep2, 5);
        sparseIntArray.put(C0533R$id.step2, 6);
        sparseIntArray.put(C0533R$id.tvContent2, 7);
        sparseIntArray.put(C0533R$id.line2, 8);
        sparseIntArray.put(C0533R$id.lnStep3, 9);
        sparseIntArray.put(C0533R$id.step3, 10);
        sparseIntArray.put(C0533R$id.tvContent3, 11);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t5(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 12, (l.d) null, f21361x);
        MaterialDivider materialDivider = (MaterialDivider) o10[4];
        MaterialDivider materialDivider2 = (MaterialDivider) o10[8];
        LinearLayout linearLayout = (LinearLayout) o10[1];
        LinearLayout linearLayout2 = (LinearLayout) o10[5];
        LinearLayout linearLayout3 = (LinearLayout) o10[9];
        ImageView imageView = (ImageView) o10[2];
        ImageView imageView2 = (ImageView) o10[6];
        ImageView imageView3 = (ImageView) o10[10];
        AppTextView appTextView = (AppTextView) o10[3];
        AppTextView appTextView2 = (AppTextView) o10[7];
        AppTextView appTextView3 = (AppTextView) o10[11];
        ((RelativeLayout) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21362w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21362w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21362w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
