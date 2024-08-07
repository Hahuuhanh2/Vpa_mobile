package th;

import com.google.android.material.datepicker.b;
import ef.f;

/* compiled from: AuthSuccessDialog.kt */
public final class a extends f.a<a> {

    /* renamed from: i  reason: collision with root package name */
    public b f23012i;

    /* renamed from: j  reason: collision with root package name */
    public b f23013j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0166, code lost:
        if (r3 != false) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r14 = this;
            r0 = r14
            java.lang.String r1 = "context"
            r2 = r15
            sk.j.f(r15, r1)
            r14.<init>(r15)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r15)
            r2 = 2131558512(0x7f0d0070, float:1.8742342E38)
            r3 = 0
            r4 = 0
            android.view.View r1 = r1.inflate(r2, r3, r4)
            r2 = 2131361931(0x7f0a008b, float:1.8343628E38)
            android.view.View r3 = j7.a.D(r2, r1)
            r7 = r3
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            if (r7 == 0) goto L_0x01b7
            r2 = 2131361936(0x7f0a0090, float:1.8343638E38)
            android.view.View r3 = j7.a.D(r2, r1)
            r8 = r3
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            if (r8 == 0) goto L_0x01b7
            r2 = 2131361937(0x7f0a0091, float:1.834364E38)
            android.view.View r3 = j7.a.D(r2, r1)
            r9 = r3
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            if (r9 == 0) goto L_0x01b7
            r2 = 2131362254(0x7f0a01ce, float:1.8344283E38)
            android.view.View r3 = j7.a.D(r2, r1)
            r10 = r3
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            if (r10 == 0) goto L_0x01b7
            r2 = 2131362266(0x7f0a01da, float:1.8344308E38)
            android.view.View r3 = j7.a.D(r2, r1)
            r11 = r3
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 == 0) goto L_0x01b7
            r2 = 2131362747(0x7f0a03bb, float:1.8345283E38)
            android.view.View r3 = j7.a.D(r2, r1)
            r12 = r3
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x01b7
            r2 = 2131362806(0x7f0a03f6, float:1.8345403E38)
            android.view.View r3 = j7.a.D(r2, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x01b7
            com.google.android.material.datepicker.b r2 = new com.google.android.material.datepicker.b
            r6 = r1
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r5 = r2
            r13 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.f23012i = r2
            r1 = r16
            r3.setText(r1)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6126g
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r17
            r1.setText(r2)
            int r1 = r19.length()
            r2 = 1
            if (r1 <= 0) goto L_0x008f
            r1 = r2
            goto L_0x0090
        L_0x008f:
            r1 = r4
        L_0x0090:
            java.lang.String r3 = "btnConfirm"
            r5 = 8
            if (r1 == 0) goto L_0x00ae
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6123d
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r6 = r19
            r1.setText(r6)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6123d
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            sk.j.e(r1, r3)
            r1.setVisibility(r4)
            goto L_0x00bc
        L_0x00ae:
            r6 = r19
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6123d
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            sk.j.e(r1, r3)
            r1.setVisibility(r5)
        L_0x00bc:
            int r1 = r18.length()
            if (r1 <= 0) goto L_0x00c4
            r1 = r2
            goto L_0x00c5
        L_0x00c4:
            r1 = r4
        L_0x00c5:
            java.lang.String r3 = "btnCancel"
            if (r1 == 0) goto L_0x00e1
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6121b
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r7 = r18
            r1.setText(r7)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6121b
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            sk.j.e(r1, r3)
            r1.setVisibility(r4)
            goto L_0x00ef
        L_0x00e1:
            r7 = r18
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6121b
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            sk.j.e(r1, r3)
            r1.setVisibility(r5)
        L_0x00ef:
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6122c
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r3 = "btnClose"
            sk.j.e(r1, r3)
            int r3 = r19.length()
            if (r3 != 0) goto L_0x0102
            r3 = r2
            goto L_0x0103
        L_0x0102:
            r3 = r4
        L_0x0103:
            if (r3 == 0) goto L_0x0112
            int r3 = r18.length()
            if (r3 != 0) goto L_0x010d
            r3 = r2
            goto L_0x010e
        L_0x010d:
            r3 = r4
        L_0x010e:
            if (r3 == 0) goto L_0x0112
            r3 = r2
            goto L_0x0113
        L_0x0112:
            r3 = r4
        L_0x0113:
            if (r3 == 0) goto L_0x0117
            r3 = r4
            goto L_0x0118
        L_0x0117:
            r3 = r5
        L_0x0118:
            r1.setVisibility(r3)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6125f
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r3 = "ivSuccess"
            sk.j.e(r1, r3)
            int r3 = r19.length()
            if (r3 != 0) goto L_0x012e
            r3 = r2
            goto L_0x012f
        L_0x012e:
            r3 = r4
        L_0x012f:
            if (r3 == 0) goto L_0x013e
            int r3 = r18.length()
            if (r3 != 0) goto L_0x0139
            r3 = r2
            goto L_0x013a
        L_0x0139:
            r3 = r4
        L_0x013a:
            if (r3 == 0) goto L_0x013e
            r3 = r2
            goto L_0x013f
        L_0x013e:
            r3 = r4
        L_0x013f:
            if (r3 == 0) goto L_0x0143
            r3 = r4
            goto L_0x0144
        L_0x0143:
            r3 = r5
        L_0x0144:
            r1.setVisibility(r3)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6124e
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r3 = "ivError"
            sk.j.e(r1, r3)
            int r3 = r19.length()
            if (r3 <= 0) goto L_0x015a
            r3 = r2
            goto L_0x015b
        L_0x015a:
            r3 = r4
        L_0x015b:
            if (r3 == 0) goto L_0x0169
            int r3 = r18.length()
            if (r3 <= 0) goto L_0x0165
            r3 = r2
            goto L_0x0166
        L_0x0165:
            r3 = r4
        L_0x0166:
            if (r3 == 0) goto L_0x0169
            goto L_0x016a
        L_0x0169:
            r2 = r4
        L_0x016a:
            if (r2 == 0) goto L_0x016d
            r5 = r4
        L_0x016d:
            r1.setVisibility(r5)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6121b
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r3 = 24
            r2.<init>(r14, r3)
            r1.setOnClickListener(r2)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6122c
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            com.google.android.material.datepicker.q r2 = new com.google.android.material.datepicker.q
            r3 = 26
            r2.<init>(r14, r3)
            r1.setOnClickListener(r2)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6123d
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            com.google.android.material.search.h r2 = new com.google.android.material.search.h
            r3 = 27
            r2.<init>(r14, r3)
            r1.setOnClickListener(r2)
            com.google.android.material.datepicker.b r1 = r0.f23012i
            java.lang.Object r1 = r1.f6120a
            com.google.android.material.card.MaterialCardView r1 = (com.google.android.material.card.MaterialCardView) r1
            r14.e(r1)
            ff.a$a r1 = ff.a.f10210a
            r1.getClass()
            ff.a$a r1 = ff.a.C0107a.f10211a
            r14.c()
            r14.d(r4)
            return
        L_0x01b7:
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceName(r2)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Missing required view with ID: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: th.a.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
