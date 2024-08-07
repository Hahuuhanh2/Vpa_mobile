package com.luck.picture.lib.basic;

import androidx.appcompat.app.AppCompatActivity;
import com.luck.picture.lib.R$anim;
import ke.a;

public class PictureSelectorTransparentActivity extends AppCompatActivity {
    public a I;

    public final void finish() {
        super.finish();
        if (getIntent().getIntExtra("com.luck.picture.lib.mode_type_source", 0) == 2) {
            a aVar = this.I;
            if (!aVar.f12539v) {
                overridePendingTransition(0, aVar.U.d().f16188b);
                return;
            }
        }
        overridePendingTransition(0, R$anim.ps_anim_fade_out);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ee.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ee.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ee.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: ee.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ee.b0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            ke.b r8 = ke.b.a()
            ke.a r8 = r8.b()
            r7.I = r8
            ve.b r8 = r8.U
            if (r8 != 0) goto L_0x0018
            ke.b r8 = ke.b.a()
            r8.b()
        L_0x0018:
            ke.a r8 = r7.I
            ve.b r8 = r8.U
            p3.l0 r8 = r8.b()
            r8.getClass()
            int r8 = com.luck.picture.lib.R$color.ps_color_grey
            int r0 = k1.a.getColor(r7, r8)
            int r8 = k1.a.getColor(r7, r8)
            r1 = 0
            pe.a.a(r7, r0, r8)
            int r8 = com.luck.picture.lib.R$layout.ps_empty
            r7.setContentView((int) r8)
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "com.luck.picture.lib.mode_type_source"
            int r8 = r8.getIntExtra(r0, r1)
            r2 = 2
            r3 = 1
            if (r8 != r2) goto L_0x0046
            r8 = r3
            goto L_0x0047
        L_0x0046:
            r8 = r1
        L_0x0047:
            if (r8 == 0) goto L_0x004a
            goto L_0x0062
        L_0x004a:
            android.view.Window r8 = r7.getWindow()
            r4 = 51
            r8.setGravity(r4)
            android.view.WindowManager$LayoutParams r4 = r8.getAttributes()
            r4.x = r1
            r4.y = r1
            r4.height = r3
            r4.width = r3
            r8.setAttributes(r4)
        L_0x0062:
            android.content.Intent r8 = r7.getIntent()
            int r8 = r8.getIntExtra(r0, r1)
            if (r8 != r3) goto L_0x0074
            java.lang.String r8 = ee.b0.f9362s0
            ee.b0 r0 = new ee.b0
            r0.<init>()
            goto L_0x00bd
        L_0x0074:
            if (r8 != r2) goto L_0x00b6
            ke.a r8 = r7.I
            r8.getClass()
            java.lang.String r8 = ee.t.O0
            ee.t r0 = new ee.t
            r0.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.g0(r2)
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r4 = "com.luck.picture.lib.current_preview_position"
            int r2 = r2.getIntExtra(r4, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            ke.a r5 = r7.I
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> r5 = r5.Y
            r4.<init>(r5)
            android.content.Intent r5 = r7.getIntent()
            java.lang.String r6 = "com.luck.picture.lib.external_preview_display_delete"
            boolean r1 = r5.getBooleanExtra(r6, r1)
            int r5 = r4.size()
            r0.f9408o0 = r4
            r0.D0 = r5
            r0.f9415v0 = r2
            r0.B0 = r1
            r0.A0 = r3
            goto L_0x00bd
        L_0x00b6:
            java.lang.String r8 = ee.a.f9356o0
            ee.a r0 = new ee.a
            r0.<init>()
        L_0x00bd:
            androidx.fragment.app.w r1 = r7.G()
            androidx.fragment.app.Fragment r2 = r1.D(r8)
            if (r2 == 0) goto L_0x00d2
            androidx.fragment.app.a r4 = new androidx.fragment.app.a
            r4.<init>(r1)
            r4.i(r2)
            r4.d()
        L_0x00d2:
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r1)
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            r2.g(r1, r0, r8, r3)
            boolean r0 = r2.f2562h
            if (r0 == 0) goto L_0x00e9
            r2.f2561g = r3
            r2.f2563i = r8
            r2.d()
            return
        L_0x00e9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "This FragmentTransaction is not allowed to be added to the back stack."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.basic.PictureSelectorTransparentActivity.onCreate(android.os.Bundle):void");
    }
}
