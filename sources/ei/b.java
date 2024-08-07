package ei;

import ai.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.plate_selection.ui.activity.PlateSelectionActivity;
import ef.f;
import ek.i;
import ff.a;
import rk.a;
import zh.d;

/* compiled from: RegistrationTimeUpDialog.kt */
public final class b extends f.a<b> {

    /* renamed from: i  reason: collision with root package name */
    public a<i> f20071i;

    public b(PlateSelectionActivity plateSelectionActivity) {
        super(plateSelectionActivity);
        View inflate = LayoutInflater.from(plateSelectionActivity).inflate(C0535R$layout.dialog_registration_timeup, (ViewGroup) null, false);
        int i10 = 2131361931;
        MaterialButton materialButton = (MaterialButton) j7.a.D(2131361931, inflate);
        if (materialButton != null) {
            i10 = 2131361936;
            ImageButton imageButton = (ImageButton) j7.a.D(2131361936, inflate);
            if (imageButton != null) {
                i10 = 2131361937;
                MaterialButton materialButton2 = (MaterialButton) j7.a.D(2131361937, inflate);
                if (materialButton2 != null) {
                    i10 = C0533R$id.imvIcon;
                    if (((ImageView) j7.a.D(C0533R$id.imvIcon, inflate)) != null) {
                        i10 = 2131362806;
                        if (((AppTextView) j7.a.D(2131362806, inflate)) != null) {
                            MaterialCardView materialCardView = (MaterialCardView) inflate;
                            switch (1) {
                            }
                            e(materialCardView);
                            ff.a.f10210a.getClass();
                            a.C0107a aVar = a.C0107a.f10211a;
                            c();
                            imageButton.setOnClickListener(new a(this, 0));
                            materialButton.setOnClickListener(new c(this, 2));
                            materialButton2.setOnClickListener(new d(this, 3));
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
