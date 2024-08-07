package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.databinding.library.R$id;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import d2.e;
import d2.l;
import hf.c;

/* compiled from: FragmentStepBindingImpl */
public final class t3 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21359x;

    /* renamed from: w  reason: collision with root package name */
    public long f21360w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21359x = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(2131361926, 2);
        sparseIntArray.put(C0533R$id.tvQuestion, 3);
        sparseIntArray.put(C0533R$id.radioGroup, 4);
        sparseIntArray.put(C0533R$id.radioButton1, 5);
        sparseIntArray.put(C0533R$id.radioButton2, 6);
        sparseIntArray.put(C0533R$id.button, 7);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t3(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 8, (l.d) null, f21359x);
        ImageButton imageButton = (ImageButton) o10[2];
        MaterialButton materialButton = (MaterialButton) o10[7];
        RadioButton radioButton = (RadioButton) o10[5];
        RadioButton radioButton2 = (RadioButton) o10[6];
        RadioGroup radioGroup = (RadioGroup) o10[4];
        LinearLayout linearLayout = (LinearLayout) o10[1];
        AppTextView appTextView = (AppTextView) o10[3];
        ((RelativeLayout) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21360w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21360w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21360w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
