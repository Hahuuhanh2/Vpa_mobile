package com.vpa.daugia.module.menu.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import java.util.concurrent.Executor;
import k1.a;
import lg.b;
import mg.p1;
import q.l;
import sh.c;
import sk.e;
import sk.j;
import zg.c0;

/* compiled from: SettingActivity.kt */
public final class SettingActivity extends Hilt_SettingActivity<p1> {
    public static final /* synthetic */ int U = 0;
    public b R;
    public l S;
    public l.d T;

    public SettingActivity() {
        new User((Integer) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (Object) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Object) null, (String) null, (Integer) null, (Object) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (e) null);
    }

    public final int N() {
        return C0535R$layout.activity_setting;
    }

    public final void T(boolean z10) {
        ((p1) M()).f21283w.setChecked(z10);
        b bVar = this.R;
        if (bVar != null) {
            bVar.j(Boolean.valueOf(z10), "isUsedBiometric");
        } else {
            j.l("sharedPrefsHelper");
            throw null;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Executor mainExecutor = a.getMainExecutor(this);
        j.e(mainExecutor, "getMainExecutor(...)");
        l lVar = new l((FragmentActivity) this, mainExecutor, new c(this));
        this.S = lVar;
        lVar.b();
        l.d.a aVar = new l.d.a();
        boolean z10 = false;
        aVar.f14221d = false;
        aVar.f14218a = getResources().getString(C0540R$string.biometric_title);
        aVar.f14219b = "";
        aVar.f14220c = getResources().getString(2132017215);
        aVar.f14222e = 255;
        this.T = aVar.a();
        ((AppTextView) ((p1) M()).f21284x.f10530d).setText("sinh trắc học");
        ((ImageButton) ((p1) M()).f21284x.f10528b).setOnClickListener(new com.google.android.material.textfield.b(this, 23));
        b bVar = this.R;
        if (bVar == null) {
            j.l("sharedPrefsHelper");
            throw null;
        } else if (bVar.e() != null) {
            MaterialSwitch materialSwitch = ((p1) M()).f21283w;
            b bVar2 = this.R;
            if (bVar2 != null) {
                Boolean bool = (Boolean) bVar2.b(Boolean.TYPE, "isUsedBiometric");
                if (bool != null) {
                    z10 = bool.booleanValue();
                }
                materialSwitch.setChecked(z10);
                ((p1) M()).f21283w.setOnCheckedChangeListener(new c0(this, 2));
                return;
            }
            j.l("sharedPrefsHelper");
            throw null;
        }
    }
}
