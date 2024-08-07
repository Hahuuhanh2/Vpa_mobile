package ph;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.m;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.search.h;
import com.google.android.material.textfield.b;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import ek.i;
import mg.x2;
import rk.a;
import sk.j;

/* compiled from: RequireVerifyDialog.kt */
public final class c extends m {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f22647o = 0;

    /* renamed from: f  reason: collision with root package name */
    public x2 f22648f;

    /* renamed from: n  reason: collision with root package name */
    public a<i> f22649n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, 2132082982);
        j.f(context, "context");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (getWindow() != null) {
            new WindowManager.LayoutParams(-2, -2, 2002, 10, -3).dimAmount = 0.65f;
        }
        View inflate = getLayoutInflater().inflate(C0535R$layout.dialog_require_verify, (ViewGroup) null, false);
        int i10 = 2131361936;
        ImageButton imageButton = (ImageButton) j7.a.D(2131361936, inflate);
        if (imageButton != null) {
            i10 = C0533R$id.btnVerify;
            MaterialButton materialButton = (MaterialButton) j7.a.D(C0533R$id.btnVerify, inflate);
            if (materialButton != null) {
                i10 = C0533R$id.imvIcon;
                if (((ImageView) j7.a.D(C0533R$id.imvIcon, inflate)) != null) {
                    i10 = C0533R$id.tvContent;
                    if (((TextView) j7.a.D(C0533R$id.tvContent, inflate)) != null) {
                        i10 = 2131362806;
                        if (((TextView) j7.a.D(2131362806, inflate)) != null) {
                            MaterialCardView materialCardView = (MaterialCardView) inflate;
                            this.f22648f = new x2(materialCardView, imageButton, materialButton);
                            setContentView((View) materialCardView);
                            x2 x2Var = this.f22648f;
                            if (x2Var != null) {
                                x2Var.f21450a.setOnClickListener(new h(this, 26));
                                x2 x2Var2 = this.f22648f;
                                if (x2Var2 != null) {
                                    x2Var2.f21451b.setOnClickListener(new b(this, 22));
                                    return;
                                } else {
                                    j.l("binding");
                                    throw null;
                                }
                            } else {
                                j.l("binding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
