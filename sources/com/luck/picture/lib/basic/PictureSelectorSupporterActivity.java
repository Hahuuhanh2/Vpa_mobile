package com.luck.picture.lib.basic;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$layout;
import ee.c;
import je.i;
import ke.a;
import ke.b;
import p3.l0;

public class PictureSelectorSupporterActivity extends AppCompatActivity {
    public a I;

    public final void attachBaseContext(Context context) {
        a b10 = b.a().b();
        if (b10 != null) {
            int i10 = b10.f12530m;
            int i11 = b10.f12531n;
            if (i10 != -2) {
                l0.G0(context, i10, i11);
            }
            super.attachBaseContext(new i(context));
            return;
        }
        super.attachBaseContext(context);
    }

    public final void finish() {
        super.finish();
        a aVar = this.I;
        if (aVar != null) {
            overridePendingTransition(0, aVar.U.d().f16188b);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        a aVar = this.I;
        if (aVar != null && (i10 = aVar.f12530m) != -2) {
            l0.G0(this, i10, aVar.f12531n);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a b10 = b.a().b();
        this.I = b10;
        b10.U.b().getClass();
        int i10 = R$color.ps_color_grey;
        pe.a.a(this, k1.a.getColor(this, i10), k1.a.getColor(this, i10));
        setContentView(R$layout.ps_activity_container);
        String str = c.C0;
        c cVar = new c();
        cVar.g0(new Bundle());
        je.a.a(this, str, cVar);
    }
}
