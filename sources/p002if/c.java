package p002if;

import com.ots.core.R$layout;
import ef.d;
import ek.i;
import gf.a;
import hf.p;
import rk.l;
import sk.j;

/* renamed from: if.c  reason: invalid package */
/* compiled from: ImageAdapter.kt */
public final class c extends d<a, p> {

    /* renamed from: p  reason: collision with root package name */
    public final l<a, i> f11437p;

    /* renamed from: q  reason: collision with root package name */
    public String f11438q;

    /* renamed from: r  reason: collision with root package name */
    public final ck.a<Integer> f11439r = new ck.a<>();

    /* renamed from: s  reason: collision with root package name */
    public String f11440s = "CREATE";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, com.ots.core.utils.customview.d dVar) {
        super(dVar);
        j.f(str, "token");
        this.f11437p = dVar;
        this.f11438q = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013e, code lost:
        if (r14 != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        if (r14 != false) goto L_0x016e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(d2.l r12, int r13, java.io.Serializable r14) {
        /*
            r11 = this;
            hf.p r12 = (hf.p) r12
            gf.a r14 = (gf.a) r14
            java.lang.String r0 = "binding"
            sk.j.f(r12, r0)
            java.lang.String r0 = "model"
            sk.j.f(r14, r0)
            r0 = 0
            r11.f9446o = r0
            android.graphics.Bitmap r1 = r14.f10496c
            java.lang.String r2 = "image"
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == 0) goto L_0x0029
            android.widget.ImageView r1 = r12.f10806x
            sk.j.e(r1, r2)
            android.graphics.Bitmap r5 = r14.f10496c
            if (r5 != 0) goto L_0x0024
            r5 = r3
        L_0x0024:
            kf.e.g(r1, r5)
            goto L_0x00cc
        L_0x0029:
            java.lang.String r1 = r14.a()
            if (r1 != 0) goto L_0x0030
            r1 = r3
        L_0x0030:
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0038
            r1 = r4
            goto L_0x0039
        L_0x0038:
            r1 = r0
        L_0x0039:
            if (r1 == 0) goto L_0x00c7
            y4.f r1 = new y4.f
            java.lang.String r5 = r14.a()
            c0.q0 r6 = new c0.q0
            r6.<init>(r11, r0)
            r1.<init>(r5, r6)
            int r5 = com.ots.core.R$drawable.ic_default_image
            android.widget.ImageView r6 = r12.f10806x
            com.bumptech.glide.l r6 = com.bumptech.glide.b.e(r6)
            r6.getClass()
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.k r8 = new com.bumptech.glide.k
            com.bumptech.glide.b r9 = r6.f4948a
            android.content.Context r10 = r6.f4949b
            r8.<init>(r9, r6, r7, r10)
            com.bumptech.glide.k r1 = r8.E(r1)
            u4.l$a r6 = u4.l.f15172a
            k5.a r1 = r1.e(r6)
            com.bumptech.glide.k r1 = (com.bumptech.glide.k) r1
            k5.a r1 = r1.l(r5)
            com.bumptech.glide.k r1 = (com.bumptech.glide.k) r1
            r1.getClass()
            b5.k$d r6 = b5.k.f4027c
            b5.h r7 = new b5.h
            r7.<init>()
            k5.a r1 = r1.s(r6, r7)
            com.bumptech.glide.k r1 = (com.bumptech.glide.k) r1
            k5.g r6 = new k5.g
            r6.<init>()
            k5.a r6 = r6.l(r5)
            k5.g r6 = (k5.g) r6
            k5.a r5 = r6.f(r5)
            com.bumptech.glide.k r1 = r1.y(r5)
            s4.f r5 = new s4.f
            r6 = 2
            s4.l[] r6 = new s4.l[r6]
            b5.h r7 = new b5.h
            r7.<init>()
            r6[r0] = r7
            b5.w r7 = new b5.w
            android.widget.ImageView r8 = r12.f10806x
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            int r9 = com.ots.core.R$dimen.dp_8
            float r8 = r8.getDimension(r9)
            int r8 = (int) r8
            r7.<init>(r8)
            r6[r4] = r7
            r5.<init>(r6)
            k5.a r1 = r1.u(r5, r4)
            com.bumptech.glide.k r1 = (com.bumptech.glide.k) r1
            android.widget.ImageView r5 = r12.f10806x
            r1.B(r5)
            goto L_0x00cc
        L_0x00c7:
            android.widget.ImageView r1 = r12.f10806x
            r1.setImageResource(r0)
        L_0x00cc:
            android.widget.LinearLayout r1 = r12.f10807y
            java.lang.String r5 = r14.a()
            if (r5 != 0) goto L_0x00d5
            r5 = r3
        L_0x00d5:
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00dd
            r5 = r4
            goto L_0x00de
        L_0x00dd:
            r5 = r0
        L_0x00de:
            r1.setEnabled(r5)
            android.widget.ImageView r1 = r12.f10805w
            java.lang.String r5 = "btnClose"
            sk.j.e(r1, r5)
            java.lang.String r6 = r14.a()
            if (r6 != 0) goto L_0x00ef
            r6 = r3
        L_0x00ef:
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x00f7
            r6 = r4
            goto L_0x00f8
        L_0x00f7:
            r6 = r0
        L_0x00f8:
            r7 = 8
            if (r6 == 0) goto L_0x00fe
            r6 = r0
            goto L_0x00ff
        L_0x00fe:
            r6 = r7
        L_0x00ff:
            r1.setVisibility(r6)
            android.widget.ImageView r1 = r12.f10806x
            sk.j.e(r1, r2)
            r8 = 500(0x1f4, double:2.47E-321)
            if.b r2 = new if.b
            r2.<init>(r14, r11)
            kf.b r6 = new kf.b
            r6.<init>(r8, r1, r2)
            r1.setOnClickListener(r6)
            java.lang.String r1 = r11.f11440s
            java.lang.String r2 = "CREATE"
            boolean r1 = sk.j.a(r1, r2)
            if (r1 == 0) goto L_0x014a
            android.widget.ImageView r1 = r12.f10805w
            sk.j.e(r1, r5)
            java.lang.String r5 = r11.f11440s
            boolean r2 = sk.j.a(r5, r2)
            if (r2 == 0) goto L_0x0141
            java.lang.String r14 = r14.a()
            if (r14 != 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r3 = r14
        L_0x0135:
            int r14 = r3.length()
            if (r14 <= 0) goto L_0x013d
            r14 = r4
            goto L_0x013e
        L_0x013d:
            r14 = r0
        L_0x013e:
            if (r14 == 0) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r4 = r0
        L_0x0142:
            if (r4 == 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r0 = r7
        L_0x0146:
            r1.setVisibility(r0)
            goto L_0x0175
        L_0x014a:
            android.widget.ImageView r1 = r12.f10805w
            sk.j.e(r1, r5)
            java.lang.String r2 = r11.f11440s
            java.lang.String r5 = "DETAIL"
            boolean r2 = sk.j.a(r2, r5)
            if (r2 == 0) goto L_0x016d
            java.lang.String r14 = r14.a()
            if (r14 != 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r3 = r14
        L_0x0161:
            int r14 = r3.length()
            if (r14 != 0) goto L_0x0169
            r14 = r4
            goto L_0x016a
        L_0x0169:
            r14 = r0
        L_0x016a:
            if (r14 == 0) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            r4 = r0
        L_0x016e:
            if (r4 == 0) goto L_0x0171
            goto L_0x0172
        L_0x0171:
            r0 = r7
        L_0x0172:
            r1.setVisibility(r0)
        L_0x0175:
            android.widget.ImageView r12 = r12.f10805w
            if.a r14 = new if.a
            r14.<init>(r11, r13)
            r12.setOnClickListener(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002if.c.u(d2.l, int, java.io.Serializable):void");
    }

    public final int x() {
        return R$layout.item_image_select;
    }
}
