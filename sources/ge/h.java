package ge;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.widget.MediaPlayerView;
import ee.t;
import ge.b;
import ue.j;

/* compiled from: PreviewVideoHolder */
public final class h extends b {
    public ImageView B;
    public ProgressBar C;
    public View D;
    public final e E = new e();

    /* compiled from: PreviewVideoHolder */
    public class a implements j {
        public a() {
        }

        public final void a() {
            b.a aVar = h.this.A;
            if (aVar != null) {
                ((t.g) aVar).a();
            }
        }
    }

    /* compiled from: PreviewVideoHolder */
    public class b implements View.OnLongClickListener {
        public b(LocalMedia localMedia) {
        }

        public final boolean onLongClick(View view) {
            b.a aVar = h.this.A;
            if (aVar == null) {
                return false;
            }
            ((t.g) aVar).b();
            return false;
        }
    }

    /* compiled from: PreviewVideoHolder */
    public class c implements View.OnClickListener {
        public c() {
        }

        public final void onClick(View view) {
            h.this.f10458y.getClass();
            h.this.E();
        }
    }

    /* compiled from: PreviewVideoHolder */
    public class d implements View.OnClickListener {
        public d() {
        }

        public final void onClick(View view) {
            h.this.f10458y.getClass();
            b.a aVar = h.this.A;
            if (aVar != null) {
                ((t.g) aVar).a();
            }
        }
    }

    /* compiled from: PreviewVideoHolder */
    public class e implements qe.d {
        public e() {
        }

        public final void a() {
            h hVar = h.this;
            hVar.C.setVisibility(8);
            hVar.B.setVisibility(8);
            hVar.f10459z.setVisibility(8);
            hVar.D.setVisibility(0);
        }

        public final void b() {
            h.this.D();
        }

        public final void c() {
            h.this.D();
        }
    }

    public h(View view) {
        super(view);
        int i10;
        this.B = (ImageView) view.findViewById(R$id.iv_play_video);
        this.C = (ProgressBar) view.findViewById(R$id.progress);
        ImageView imageView = this.B;
        if (this.f10458y.f12539v) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        ke.a aVar = this.f10458y;
        if (aVar.V == null) {
            aVar.V = new ne.d();
        }
        ne.d dVar = this.f10458y.V;
        Context context = view.getContext();
        dVar.getClass();
        MediaPlayerView mediaPlayerView = new MediaPlayerView(context);
        this.D = mediaPlayerView;
        if (mediaPlayerView.getLayoutParams() == null) {
            this.D.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.indexOfChild(this.D) != -1) {
            viewGroup.removeView(this.D);
        }
        viewGroup.addView(this.D, 0);
        this.D.setVisibility(8);
    }

    public final void A() {
        ne.d dVar = this.f10458y.V;
        if (dVar != null) {
            dVar.i(this.E);
            this.f10458y.V.b(this.D);
        }
    }

    public final void B() {
        if (u()) {
            this.B.setVisibility(0);
            ne.d dVar = this.f10458y.V;
            if (dVar != null) {
                dVar.d(this.D);
                return;
            }
            return;
        }
        this.B.setVisibility(8);
        ne.d dVar2 = this.f10458y.V;
        if (dVar2 != null) {
            dVar2.g(this.D);
        }
    }

    public final void C(LocalMedia localMedia) {
        super.C(localMedia);
        if (!this.f10458y.f12539v && this.f10454u < this.f10455v) {
            ViewGroup.LayoutParams layoutParams = this.D.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = this.f10454u;
                layoutParams2.height = this.f10456w;
                layoutParams2.gravity = 17;
            } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams3.width = this.f10454u;
                layoutParams3.height = this.f10456w;
                layoutParams3.addRule(13);
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams4.width = this.f10454u;
                layoutParams4.height = this.f10456w;
                layoutParams4.gravity = 17;
            } else if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams5.width = this.f10454u;
                layoutParams5.height = this.f10456w;
                layoutParams5.f1882i = 0;
                layoutParams5.f1888l = 0;
            }
        }
    }

    public final void D() {
        this.B.setVisibility(0);
        this.C.setVisibility(8);
        this.f10459z.setVisibility(0);
        this.D.setVisibility(8);
        b.a aVar = this.A;
        if (aVar != null) {
            ((t.g) aVar).c((String) null);
        }
    }

    public final void E() {
        this.f10458y.getClass();
        if (this.D == null) {
            throw new NullPointerException("VideoPlayer cannot be empty,Please implement " + ne.e.class);
        } else if (this.f10458y.V != null) {
            this.C.setVisibility(0);
            this.B.setVisibility(8);
            ((t.g) this.A).c(this.f10457x.I);
            this.f10458y.V.h(this.D, this.f10457x);
        }
    }

    public final void r(LocalMedia localMedia, int i10) {
        super.r(localMedia, i10);
        C(localMedia);
        this.B.setOnClickListener(new c());
        this.f3013a.setOnClickListener(new d());
    }

    public final void s() {
    }

    public final boolean u() {
        ne.d dVar = this.f10458y.V;
        if (dVar == null || !dVar.c(this.D)) {
            return false;
        }
        return true;
    }

    public final void v(LocalMedia localMedia, int i10, int i11) {
        this.f10458y.getClass();
    }

    public final void w() {
        this.f10459z.setOnViewTapListener(new a());
    }

    public final void x(LocalMedia localMedia) {
        this.f10459z.setOnLongClickListener(new b(localMedia));
    }

    public final void y() {
        ne.d dVar = this.f10458y.V;
        if (dVar != null) {
            dVar.e(this.D);
            this.f10458y.V.a(this.E);
        }
    }

    public final void z() {
        ne.d dVar = this.f10458y.V;
        if (dVar != null) {
            dVar.f(this.D);
            this.f10458y.V.i(this.E);
        }
        D();
    }
}
