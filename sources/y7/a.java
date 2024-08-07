package y7;

import android.view.KeyEvent;
import android.widget.CompoundButton;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17615a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f17616b;

    public /* synthetic */ a(KeyEvent.Callback callback, int i10) {
        this.f17615a = i10;
        this.f17616b = callback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1.f6382a.a(r0) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2.e(r0, r2.f6387e) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.f17615a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0032
        L_0x0006:
            android.view.KeyEvent$Callback r0 = r4.f17616b
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            com.google.android.material.internal.g$a<com.google.android.material.chip.Chip> r1 = r0.f6009q
            if (r1 == 0) goto L_0x002a
            com.google.android.material.internal.a r1 = (com.google.android.material.internal.a) r1
            if (r6 == 0) goto L_0x001b
            com.google.android.material.internal.b r2 = r1.f6382a
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L_0x002a
            goto L_0x0025
        L_0x001b:
            com.google.android.material.internal.b r2 = r1.f6382a
            boolean r3 = r2.f6387e
            boolean r2 = r2.e(r0, r3)
            if (r2 == 0) goto L_0x002a
        L_0x0025:
            com.google.android.material.internal.b r1 = r1.f6382a
            r1.d()
        L_0x002a:
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.f6008p
            if (r0 == 0) goto L_0x0031
            r0.onCheckedChanged(r5, r6)
        L_0x0031:
            return
        L_0x0032:
            android.view.KeyEvent$Callback r5 = r4.f17616b
            com.vpa.daugia.module.auth.ui.activity.StepOneActivity r5 = (com.vpa.daugia.module.auth.ui.activity.StepOneActivity) r5
            int r0 = com.vpa.daugia.module.auth.ui.activity.StepOneActivity.T
            java.lang.String r0 = "this$0"
            sk.j.f(r5, r0)
            if (r6 == 0) goto L_0x0057
            d2.l r6 = r5.M()
            mg.w3 r6 = (mg.w3) r6
            android.widget.RadioButton r6 = r6.A
            r0 = 0
            r6.setChecked(r0)
            d2.l r5 = r5.M()
            mg.w3 r5 = (mg.w3) r5
            com.google.android.material.button.MaterialButton r5 = r5.f21415x
            r6 = 1
            r5.setEnabled(r6)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.a.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
