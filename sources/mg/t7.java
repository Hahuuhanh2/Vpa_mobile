package mg;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import d2.l;

/* compiled from: ViewLoginAuctionBinding */
public abstract class t7 extends l {
    public final AppCompatEditText A;
    public final TextInputLayout B;
    public final AppCompatEditText C;
    public final LinearLayout D;
    public final PasswordEditText E;
    public AuctionRoomViewModel F;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21365w;

    /* renamed from: x  reason: collision with root package name */
    public final MaterialButton f21366x;

    /* renamed from: y  reason: collision with root package name */
    public final TextInputLayout f21367y;

    /* renamed from: z  reason: collision with root package name */
    public final TextInputLayout f21368z;

    public t7(Object obj, View view, MaterialButton materialButton, MaterialButton materialButton2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AppCompatEditText appCompatEditText, TextInputLayout textInputLayout3, AppCompatEditText appCompatEditText2, LinearLayout linearLayout, PasswordEditText passwordEditText) {
        super(1, view, obj);
        this.f21365w = materialButton;
        this.f21366x = materialButton2;
        this.f21367y = textInputLayout;
        this.f21368z = textInputLayout2;
        this.A = appCompatEditText;
        this.B = textInputLayout3;
        this.C = appCompatEditText2;
        this.D = linearLayout;
        this.E = passwordEditText;
    }

    public abstract void v(AuctionRoomViewModel auctionRoomViewModel);
}
