package p002if;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.R$attr;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ortiz.touchview.TouchImageView;
import com.ots.core.R$drawable;
import com.ots.core.R$layout;
import d2.e;
import d2.f;
import ek.i;
import gf.a;
import kf.h;
import rk.l;
import sk.j;
import sk.k;

/* renamed from: if.b  reason: invalid package */
/* compiled from: ImageAdapter.kt */
public final class b extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f11435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f11436b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, c cVar) {
        super(1);
        this.f11435a = aVar;
        this.f11436b = cVar;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        j.f((View) obj, "it");
        if (this.f11435a.a() != null) {
            String a10 = this.f11435a.a();
            if (a10 == null) {
                a10 = "";
            }
            if (a10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Context y10 = this.f11436b.y();
                String a11 = this.f11435a.a();
                j.c(a11);
                int i10 = h.f12560a;
                com.google.android.material.bottomsheet.b bVar = new com.google.android.material.bottomsheet.b(y10, 0);
                bVar.f5871u = bVar.getContext().getTheme().obtainStyledAttributes(new int[]{R$attr.enableEdgeToEdge}).getBoolean(0, false);
                d2.l c10 = f.c(LayoutInflater.from(y10), R$layout.image_view_layout, (ViewGroup) null, false, (e) null);
                j.e(c10, "inflate(...)");
                hf.l lVar = (hf.l) c10;
                TouchImageView touchImageView = lVar.f10799y;
                j.e(touchImageView, "ivImageActivity");
                touchImageView.setVisibility(0);
                com.bumptech.glide.l e10 = com.bumptech.glide.b.e(lVar.f10799y);
                e10.getClass();
                com.bumptech.glide.k E = new com.bumptech.glide.k(e10.f4948a, e10, Drawable.class, e10.f4949b).E(a11);
                int i11 = R$drawable.ic_empty_state_list;
                com.bumptech.glide.k kVar = (com.bumptech.glide.k) E.l(i11);
                kVar.getClass();
                ((com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) kVar.n(b5.k.f4026b, new b5.i(), true)).p(z4.a.f17866b, 120000)).f(i11)).e(u4.l.f15172a)).B(lVar.f10799y);
                bVar.setContentView(lVar.f8554e);
                bVar.setCancelable(false);
                ViewParent parent = lVar.f8554e.getParent();
                j.d(parent, "null cannot be cast to non-null type android.view.View");
                BottomSheetBehavior C = BottomSheetBehavior.C((View) parent);
                j.e(C, "from(...)");
                ViewParent parent2 = lVar.f8554e.getParent();
                j.d(parent2, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent2;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -1;
                view.setLayoutParams(layoutParams);
                C.K(3);
                C.I(false);
                C.R = false;
                if (!bVar.isShowing()) {
                    bVar.show();
                }
                lVar.f10797w.setOnClickListener(new com.google.android.material.search.h(bVar, 5));
                lVar.f10798x.setOnClickListener(new com.google.android.material.textfield.b(bVar, 8));
                return i.f20112a;
            }
        }
        this.f11436b.f11437p.invoke(this.f11435a);
        return i.f20112a;
    }
}
