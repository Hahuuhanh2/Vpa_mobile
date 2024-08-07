package ve;

import al.g0;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.luck.picture.lib.R$anim;
import p3.l0;

/* compiled from: PictureSelectorStyle */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public MaterialCardView f16191a;

    /* renamed from: b  reason: collision with root package name */
    public MaterialButton f16192b;

    /* renamed from: c  reason: collision with root package name */
    public MaterialButton f16193c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f16194d;

    /* renamed from: e  reason: collision with root package name */
    public Object f16195e;

    public /* synthetic */ b() {
    }

    public /* synthetic */ b(MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2) {
        this.f16191a = materialCardView;
        this.f16192b = materialButton;
        this.f16193c = materialButton2;
        this.f16194d = textView;
        this.f16195e = textView2;
    }

    public final m9.b a() {
        m9.b bVar = (m9.b) this.f16194d;
        if (bVar == null) {
            return new m9.b();
        }
        return bVar;
    }

    public final l0 b() {
        l0 l0Var = (l0) this.f16193c;
        if (l0Var == null) {
            return new l0();
        }
        return l0Var;
    }

    public final g0 c() {
        g0 g0Var = (g0) this.f16192b;
        if (g0Var == null) {
            return new g0();
        }
        return g0Var;
    }

    public final a d() {
        if (((a) this.f16195e) == null) {
            this.f16195e = new a(R$anim.ps_anim_enter, R$anim.ps_anim_exit);
        }
        return (a) this.f16195e;
    }
}
