package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.camera.view.PreviewView;
import androidx.databinding.library.R$id;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import d2.e;
import d2.l;
import hf.c;
import io.github.g00fy2.quickie.QROverlayView;

/* compiled from: QuickieScannerActivityBindingImpl */
public final class m7 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21222x;

    /* renamed from: w  reason: collision with root package name */
    public long f21223w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21222x = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(2131361926, 2);
        sparseIntArray.put(C0533R$id.tvQuestion, 3);
        sparseIntArray.put(C0533R$id.card, 4);
        sparseIntArray.put(2131362506, 5);
        sparseIntArray.put(2131362476, 6);
        sparseIntArray.put(C0533R$id.tvContent, 7);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m7(e eVar, View view) {
        super(eVar, view, 0);
        Object[] o10 = l.o(eVar, view, 8, (l.d) null, f21222x);
        ImageButton imageButton = (ImageButton) o10[2];
        MaterialCardView materialCardView = (MaterialCardView) o10[4];
        QROverlayView qROverlayView = (QROverlayView) o10[6];
        PreviewView previewView = (PreviewView) o10[5];
        LinearLayout linearLayout = (LinearLayout) o10[1];
        AppTextView appTextView = (AppTextView) o10[7];
        AppTextView appTextView2 = (AppTextView) o10[3];
        ((FrameLayout) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21223w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21223w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21223w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
