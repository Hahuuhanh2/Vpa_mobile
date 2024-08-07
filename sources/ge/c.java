package ge;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.entity.LocalMedia;
import ee.e;
import fe.d;
import p3.l0;

/* compiled from: BaseRecyclerMediaHolder */
public class c extends RecyclerView.a0 {
    public static final /* synthetic */ int D = 0;
    public ColorFilter A;
    public ColorFilter B;
    public d.a C;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f10460u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f10461v;

    /* renamed from: w  reason: collision with root package name */
    public View f10462w;

    /* renamed from: x  reason: collision with root package name */
    public Context f10463x;

    /* renamed from: y  reason: collision with root package name */
    public ke.a f10464y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10465z;

    /* compiled from: BaseRecyclerMediaHolder */
    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            c.this.f10462w.performClick();
        }
    }

    /* compiled from: BaseRecyclerMediaHolder */
    public class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocalMedia f10467a;

        public b(LocalMedia localMedia, int i10) {
            this.f10467a = localMedia;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r5.f10468b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.luck.picture.lib.entity.LocalMedia r6 = r5.f10467a
                boolean r0 = r6.N
                if (r0 != 0) goto L_0x0095
                ge.c r0 = ge.c.this
                fe.d$a r1 = r0.C
                if (r1 != 0) goto L_0x000e
                goto L_0x0095
            L_0x000e:
                android.widget.TextView r0 = r0.f10461v
                ee.e r1 = (ee.e) r1
                ee.c r2 = r1.f9390a
                boolean r3 = r0.isSelected()
                int r6 = r2.l0(r6, r3)
                if (r6 != 0) goto L_0x0039
                ee.c r2 = r1.f9390a
                ke.a r2 = r2.f11878i0
                r2.getClass()
                ee.c r1 = r1.f9390a
                android.content.Context r1 = r1.r()
                int r2 = com.luck.picture.lib.R$anim.ps_anim_modal_in
                android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
                r1.getDuration()
                java.lang.String r2 = ee.c.C0
                r0.startAnimation(r1)
            L_0x0039:
                r0 = -1
                if (r6 != r0) goto L_0x003d
                return
            L_0x003d:
                r0 = 1
                if (r6 != 0) goto L_0x0082
                ge.c r6 = ge.c.this
                ke.a r1 = r6.f10464y
                boolean r1 = r1.Q
                if (r1 == 0) goto L_0x008a
                android.widget.ImageView r6 = r6.f10460u
                android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
                r1.<init>()
                r2 = 3
                float[] r3 = new float[r2]
                r3 = {1065353216, 1065772646, 1065353216} // fill-array
                java.lang.String r4 = "scaleX"
                android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r6, r4, r3)
                float[] r2 = new float[r2]
                r2 = {1065353216, 1065772646, 1065353216} // fill-array
                java.lang.String r4 = "scaleY"
                android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r4, r2)
                r2 = 2
                android.animation.Animator[] r2 = new android.animation.Animator[r2]
                r4 = 0
                r2[r4] = r3
                r2[r0] = r6
                r1.playTogether(r2)
                r2 = 250(0xfa, double:1.235E-321)
                r1.setDuration(r2)
                android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
                r6.<init>()
                r1.setInterpolator(r6)
                r1.start()
                goto L_0x008a
            L_0x0082:
                if (r6 != r0) goto L_0x008a
                ge.c r6 = ge.c.this
                ke.a r6 = r6.f10464y
                boolean r6 = r6.Q
            L_0x008a:
                ge.c r6 = ge.c.this
                com.luck.picture.lib.entity.LocalMedia r0 = r5.f10467a
                boolean r0 = r6.s(r0)
                r6.u(r0)
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ge.c.b.onClick(android.view.View):void");
        }
    }

    /* renamed from: ge.c$c  reason: collision with other inner class name */
    /* compiled from: BaseRecyclerMediaHolder */
    public class C0114c implements View.OnLongClickListener {
        public C0114c(int i10) {
        }

        public final boolean onLongClick(View view) {
            d.a aVar = c.this.C;
            if (aVar == null) {
                return false;
            }
            ee.c cVar = ((e) aVar).f9390a;
            String str = ee.c.C0;
            cVar.getClass();
            return false;
        }
    }

    /* compiled from: BaseRecyclerMediaHolder */
    public class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocalMedia f10470a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f10471b;

        public d(LocalMedia localMedia, int i10) {
            this.f10470a = localMedia;
            this.f10471b = i10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
            if (r5.f12524g != 1) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
            if (r5.f12524g != 1) goto L_0x0054;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.luck.picture.lib.entity.LocalMedia r5 = r4.f10470a
                boolean r0 = r5.N
                if (r0 != 0) goto L_0x007d
                ge.c r0 = ge.c.this
                fe.d$a r0 = r0.C
                if (r0 != 0) goto L_0x000e
                goto L_0x007d
            L_0x000e:
                java.lang.String r5 = r5.f8086v
                boolean r5 = j7.a.Y(r5)
                r0 = 0
                r1 = 1
                if (r5 == 0) goto L_0x0020
                ge.c r5 = ge.c.this
                ke.a r5 = r5.f10464y
                boolean r5 = r5.f12535r
                if (r5 != 0) goto L_0x0055
            L_0x0020:
                ge.c r5 = ge.c.this
                ke.a r5 = r5.f10464y
                r5.getClass()
                com.luck.picture.lib.entity.LocalMedia r5 = r4.f10470a
                java.lang.String r5 = r5.f8086v
                boolean r5 = j7.a.Z(r5)
                if (r5 == 0) goto L_0x003d
                ge.c r5 = ge.c.this
                ke.a r5 = r5.f10464y
                boolean r2 = r5.f12536s
                if (r2 != 0) goto L_0x0055
                int r5 = r5.f12524g
                if (r5 == r1) goto L_0x0055
            L_0x003d:
                com.luck.picture.lib.entity.LocalMedia r5 = r4.f10470a
                java.lang.String r5 = r5.f8086v
                boolean r5 = j7.a.U(r5)
                if (r5 == 0) goto L_0x0054
                ge.c r5 = ge.c.this
                ke.a r5 = r5.f10464y
                boolean r2 = r5.f12537t
                if (r2 != 0) goto L_0x0055
                int r5 = r5.f12524g
                if (r5 != r1) goto L_0x0054
                goto L_0x0055
            L_0x0054:
                r1 = r0
            L_0x0055:
                if (r1 == 0) goto L_0x0076
                ge.c r5 = ge.c.this
                fe.d$a r1 = r5.C
                android.widget.TextView r5 = r5.f10461v
                int r5 = r4.f10471b
                ee.e r1 = (ee.e) r1
                ee.c r2 = r1.f9390a
                java.lang.String r3 = ee.c.C0
                ke.a r2 = r2.f11878i0
                int r2 = r2.f12524g
                boolean r2 = p3.l0.h0()
                if (r2 == 0) goto L_0x0070
                goto L_0x007d
            L_0x0070:
                ee.c r1 = r1.f9390a
                ee.c.M0(r1, r5, r0)
                goto L_0x007d
            L_0x0076:
                ge.c r5 = ge.c.this
                android.view.View r5 = r5.f10462w
                r5.performClick()
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ge.c.d.onClick(android.view.View):void");
        }
    }

    public c(View view) {
        super(view);
    }

    public void r(LocalMedia localMedia, int i10) {
        localMedia.f8084t = c();
        u(s(localMedia));
        if (this.f10465z) {
            this.f10464y.getClass();
        }
        String str = localMedia.f8073b;
        if (localMedia.e()) {
            str = localMedia.f8077f;
        }
        t(str);
        this.f10461v.setOnClickListener(new a());
        this.f10462w.setOnClickListener(new b(localMedia, i10));
        this.f3013a.setOnLongClickListener(new C0114c(i10));
        this.f3013a.setOnClickListener(new d(localMedia, i10));
    }

    public final boolean s(LocalMedia localMedia) {
        LocalMedia localMedia2;
        boolean contains = this.f10464y.b().contains(localMedia);
        if (contains && (localMedia2 = localMedia.Q) != null && localMedia2.e()) {
            localMedia.f8077f = localMedia2.f8077f;
            localMedia.f8083s = !TextUtils.isEmpty(localMedia2.f8077f);
            localMedia.P = localMedia2.e();
        }
        return contains;
    }

    public void t(String str) {
        this.f10464y.getClass();
    }

    public final void u(boolean z10) {
        ColorFilter colorFilter;
        if (this.f10461v.isSelected() != z10) {
            this.f10461v.setSelected(z10);
        }
        this.f10464y.getClass();
        ImageView imageView = this.f10460u;
        if (z10) {
            colorFilter = this.B;
        } else {
            colorFilter = this.A;
        }
        imageView.setColorFilter(colorFilter);
    }

    public c(View view, ke.a aVar) {
        super(view);
        this.f10464y = aVar;
        Context context = view.getContext();
        this.f10463x = context;
        this.A = l0.Z(context, R$color.ps_color_20);
        this.B = l0.Z(this.f10463x, R$color.ps_color_80);
        l0.Z(this.f10463x, R$color.ps_color_half_white);
        this.f10464y.U.b().getClass();
        this.f10460u = (ImageView) view.findViewById(R$id.ivPicture);
        this.f10461v = (TextView) view.findViewById(R$id.tvCheck);
        this.f10462w = view.findViewById(R$id.btnCheck);
        int i10 = aVar.f12524g;
        boolean z10 = false;
        this.f10461v.setVisibility(0);
        this.f10462w.setVisibility(0);
        int i11 = aVar.f12524g;
        this.f10465z = (i11 == 1 || i11 == 2) ? true : z10;
    }
}
