package jf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c7.j;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.datepicker.q;
import com.ots.core.R$id;
import com.ots.core.R$layout;
import ef.f;
import ff.a;
import j7.a;

/* compiled from: ConfirmDialog.kt */
public final class b extends f.a<b> {

    /* renamed from: i  reason: collision with root package name */
    public j f11888i;

    /* renamed from: j  reason: collision with root package name */
    public c f11889j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, String str2, String str3, String str4, boolean z10) {
        super(context);
        boolean z11;
        sk.j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R$layout.alert_dialog, (ViewGroup) null, false);
        int i10 = R$id.btnCancel;
        MaterialButton materialButton = (MaterialButton) a.D(i10, inflate);
        if (materialButton != null) {
            i10 = R$id.btnConfirm;
            MaterialButton materialButton2 = (MaterialButton) a.D(i10, inflate);
            if (materialButton2 != null) {
                i10 = R$id.tvBody;
                TextView textView = (TextView) a.D(i10, inflate);
                if (textView != null) {
                    i10 = R$id.tvTitle;
                    TextView textView2 = (TextView) a.D(i10, inflate);
                    if (textView2 != null) {
                        this.f11888i = new j((MaterialCardView) inflate, materialButton, materialButton2, textView, textView2);
                        textView2.setText(str);
                        ((TextView) this.f11888i.f4575d).setText(str2);
                        boolean z12 = true;
                        if (str4.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            ((MaterialButton) this.f11888i.f4574c).setText(str4);
                            MaterialButton materialButton3 = (MaterialButton) this.f11888i.f4574c;
                            sk.j.e(materialButton3, "btnConfirm");
                            materialButton3.setVisibility(0);
                        } else {
                            MaterialButton materialButton4 = (MaterialButton) this.f11888i.f4574c;
                            sk.j.e(materialButton4, "btnConfirm");
                            materialButton4.setVisibility(8);
                        }
                        if (str3.length() <= 0 ? false : z12) {
                            ((MaterialButton) this.f11888i.f4573b).setText(str3);
                            MaterialButton materialButton5 = (MaterialButton) this.f11888i.f4573b;
                            sk.j.e(materialButton5, "btnCancel");
                            materialButton5.setVisibility(0);
                        } else {
                            MaterialButton materialButton6 = (MaterialButton) this.f11888i.f4573b;
                            sk.j.e(materialButton6, "btnCancel");
                            materialButton6.setVisibility(8);
                        }
                        ((MaterialButton) this.f11888i.f4573b).setOnClickListener(new com.google.android.material.textfield.b(this, 6));
                        ((MaterialButton) this.f11888i.f4574c).setOnClickListener(new q(this, 4));
                        e((MaterialCardView) this.f11888i.f4572a);
                        ff.a.f10210a.getClass();
                        a.C0107a aVar = a.C0107a.f10211a;
                        c();
                        d(z10);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
