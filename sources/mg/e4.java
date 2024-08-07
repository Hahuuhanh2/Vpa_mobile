package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.ots.base.ui.AddressEdittext;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.payment.data.model.BankQr;
import com.vpa.daugia.module.payment.ui.PaymentViewModel;
import d2.l;

/* compiled from: FragmentTransferPaymentBinding */
public abstract class e4 extends l {
    public final AppTextView A;
    public final AddressEdittext B;
    public final AppTextView C;
    public final GradientTextView D;
    public final AppTextView E;
    public final AppTextView F;
    public PaymentViewModel G;
    public BankQr H;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21044w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageButton f21045x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageButton f21046y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f21047z;

    public e4(Object obj, View view, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageView imageView, AppTextView appTextView, AddressEdittext addressEdittext, AppTextView appTextView2, GradientTextView gradientTextView, AppTextView appTextView3, AppTextView appTextView4) {
        super(1, view, obj);
        this.f21044w = imageButton;
        this.f21045x = imageButton2;
        this.f21046y = imageButton3;
        this.f21047z = imageView;
        this.A = appTextView;
        this.B = addressEdittext;
        this.C = appTextView2;
        this.D = gradientTextView;
        this.E = appTextView3;
        this.F = appTextView4;
    }

    public abstract void v(BankQr bankQr);

    public abstract void w(PaymentViewModel paymentViewModel);
}
