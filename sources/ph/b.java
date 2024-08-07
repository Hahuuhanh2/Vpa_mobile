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
import com.google.android.material.datepicker.q;
import com.google.android.material.search.h;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import ek.i;
import mg.u2;
import rk.a;
import sk.j;

/* compiled from: RequireLoginDialog.kt */
public final class b extends m {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f22643p = 0;

    /* renamed from: f  reason: collision with root package name */
    public u2 f22644f;

    /* renamed from: n  reason: collision with root package name */
    public a<i> f22645n;

    /* renamed from: o  reason: collision with root package name */
    public a<i> f22646o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, 2132082982);
        j.f(context, "context");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (getWindow() != null) {
            new WindowManager.LayoutParams(-2, -2, 2002, 10, -3).dimAmount = 0.65f;
        }
        View inflate = getLayoutInflater().inflate(C0535R$layout.dialog_require_login, (ViewGroup) null, false);
        int i10 = 2131361936;
        ImageButton imageButton = (ImageButton) j7.a.D(2131361936, inflate);
        if (imageButton != null) {
            i10 = C0533R$id.btnCreateAccount;
            MaterialButton materialButton = (MaterialButton) j7.a.D(C0533R$id.btnCreateAccount, inflate);
            if (materialButton != null) {
                i10 = C0533R$id.btnRegister;
                MaterialButton materialButton2 = (MaterialButton) j7.a.D(C0533R$id.btnRegister, inflate);
                if (materialButton2 != null) {
                    i10 = C0533R$id.imvIcon;
                    if (((ImageView) j7.a.D(C0533R$id.imvIcon, inflate)) != null) {
                        i10 = C0533R$id.tvContent;
                        if (((TextView) j7.a.D(C0533R$id.tvContent, inflate)) != null) {
                            i10 = 2131362806;
                            TextView textView = (TextView) j7.a.D(2131362806, inflate);
                            if (textView != null) {
                                MaterialCardView materialCardView = (MaterialCardView) inflate;
                                this.f22644f = new u2(materialCardView, imageButton, materialButton, materialButton2, textView, 1);
                                switch (1) {
                                }
                                setContentView((View) materialCardView);
                                u2 u2Var = this.f22644f;
                                if (u2Var != null) {
                                    u2Var.f21378c.setOnClickListener(new h(this, 25));
                                    u2 u2Var2 = this.f22644f;
                                    if (u2Var2 != null) {
                                        u2Var2.f21379d.setOnClickListener(new com.google.android.material.textfield.b(this, 21));
                                        u2 u2Var3 = this.f22644f;
                                        if (u2Var3 != null) {
                                            ((MaterialButton) u2Var3.f21380e).setOnClickListener(new q(this, 25));
                                            return;
                                        } else {
                                            j.l("binding");
                                            throw null;
                                        }
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
