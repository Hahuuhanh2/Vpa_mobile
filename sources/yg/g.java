package yg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ek.i;
import java.util.concurrent.Executor;
import kf.h;
import mg.i3;
import q.k;
import q.l;
import r2.q;
import r2.w;
import r2.x;
import s2.a;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: LoginFragment.kt */
public final class g extends b<i3> {

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ int f23548q0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f23549m0;

    /* renamed from: n0  reason: collision with root package name */
    public l f23550n0;

    /* renamed from: o0  reason: collision with root package name */
    public l.d f23551o0;

    /* renamed from: p0  reason: collision with root package name */
    public lg.b f23552p0;

    /* compiled from: LoginFragment.kt */
    public static final class a extends k implements rk.l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f23553a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super(1);
            this.f23553a = gVar;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            EditText editText = ((i3) this.f23553a.i0()).f21114z.getEditText();
            if (editText != null) {
                editText.setText("");
            }
            MaterialCardView materialCardView = ((i3) this.f23553a.i0()).f21112x;
            j.e(materialCardView, "btnFaceId");
            materialCardView.setVisibility(8);
            LinearLayout linearLayout = ((i3) this.f23553a.i0()).D.f21421w;
            j.e(linearLayout, "container");
            linearLayout.setVisibility(8);
            ImageView imageView = ((i3) this.f23553a.i0()).C;
            j.e(imageView, "imvLogo");
            imageView.setVisibility(0);
            ((i3) this.f23553a.i0()).f21114z.setEnabled(true);
            TextInputLayout textInputLayout = ((i3) this.f23553a.i0()).f21114z;
            j.e(textInputLayout, "edtCard");
            textInputLayout.setVisibility(0);
            return i.f20112a;
        }
    }

    /* compiled from: LoginFragment.kt */
    public static final class b implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.l f23554a;

        public b(f fVar) {
            this.f23554a = fVar;
        }

        public final ek.a<?> a() {
            return this.f23554a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f23554a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f23554a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f23554a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f23555a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f23555a = fragment;
        }

        public final Object invoke() {
            return this.f23555a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f23556a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f23556a = cVar;
        }

        public final Object invoke() {
            return (x) this.f23556a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f23557a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ek.c cVar) {
            super(0);
            this.f23557a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f23557a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f23558a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ek.c cVar) {
            super(0);
            this.f23558a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f23558a);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                return fVar.g();
            }
            return a.C0190a.f14602b;
        }
    }

    /* renamed from: yg.g$g  reason: collision with other inner class name */
    /* compiled from: FragmentViewModelLazy.kt */
    public static final class C0317g extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f23559a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f23560b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0317g(Fragment fragment, ek.c cVar) {
            super(0);
            this.f23559a = fragment;
            this.f23560b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f23560b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f23559a.f();
            j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    static {
        Class<g> cls = g.class;
    }

    public g() {
        c cVar = new c(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new d(cVar));
        this.f23549m0 = j0.b(this, s.a(LoginViewModel.class), new e(a02), new f(a02), new C0317g(this, a02));
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        o oVar = this.U;
        j.e(oVar, "<get-lifecycle>(...)");
        ((kf.a) this.f9459f0.getValue()).a(oVar);
        Executor mainExecutor = k1.a.getMainExecutor(d0());
        j.e(mainExecutor, "getMainExecutor(...)");
        this.f23550n0 = new l((Fragment) this, mainExecutor, (l.a) new e(this));
        l.d.a aVar = new l.d.a();
        aVar.f14221d = false;
        aVar.f14218a = w().getString(C0540R$string.biometric_title);
        aVar.f14219b = w().getString(C0540R$string.biometric_subtitle);
        aVar.f14220c = w().getString(C0540R$string.biometric_negative_button_text);
        aVar.f14222e = 255;
        this.f23551o0 = aVar.a();
        j7.a.u(n0(), c0());
    }

    public final void W(View view, Bundle bundle) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        j.f(view, "view");
        ((i3) i0()).v(o0());
        o0().f19556o.e(y(), new b(new f(this)));
        Boolean bool = (Boolean) n0().b(Boolean.TYPE, "isUsedBiometric");
        if (n0().d("PREF_KEY_REFRESH_TOKEN").length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bool != null && bool.booleanValue() && z10) {
            m0();
        }
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        User e10 = n0().e();
        if (e10 != null) {
            ((i3) i0()).D.v(new rh.f(d0(), e10, n0()));
        }
        MaterialCardView materialCardView = ((i3) i0()).f21112x;
        j.e(materialCardView, "btnFaceId");
        if (!bool.booleanValue() || !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i13 = 8;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        materialCardView.setVisibility(i10);
        bool.booleanValue();
        int i14 = h.f12560a;
        LinearLayout linearLayout = ((i3) i0()).D.f21421w;
        j.e(linearLayout, "container");
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        ImageView imageView = ((i3) i0()).C;
        j.e(imageView, "imvLogo");
        boolean z12 = !z10;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        TextInputLayout textInputLayout = ((i3) i0()).f21114z;
        j.e(textInputLayout, "edtCard");
        if (z12) {
            i13 = 0;
        }
        textInputLayout.setVisibility(i13);
        ((i3) i0()).f21114z.setEnabled(z12);
        ((i3) i0()).f21111w.setOnClickListener(new c(this, 0));
        ((i3) i0()).f21113y.setOnClickListener(new d(this, 0));
        ((i3) i0()).f21112x.setOnClickListener(new com.google.android.material.textfield.b(this, 13));
        ((i3) i0()).F.setOnClickListener(new c(this, 1));
        ((i3) i0()).G.setOnClickListener(new d(this, 1));
        ImageButton imageButton = ((i3) i0()).D.f21422x;
        j.e(imageButton, "ivChangeAccount");
        imageButton.setOnClickListener(new kf.b(500, imageButton, new a(this)));
    }

    public final int j0() {
        return C0535R$layout.fragment_login;
    }

    public final void m0() {
        int a10 = new q.k(new k.c(d0())).a(15);
        if (a10 == 0) {
            l lVar = this.f23550n0;
            if (lVar != null) {
                l.d dVar = this.f23551o0;
                if (dVar != null) {
                    lVar.a(dVar);
                } else {
                    j.l("promptInfo");
                    throw null;
                }
            } else {
                j.l("biometricPrompt");
                throw null;
            }
        } else if (a10 == 11) {
            Intent intent = new Intent("android.settings.BIOMETRIC_ENROLL");
            intent.putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 15);
            startActivityForResult(intent, 100);
        }
    }

    public final lg.b n0() {
        lg.b bVar = this.f23552p0;
        if (bVar != null) {
            return bVar;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }

    public final LoginViewModel o0() {
        return (LoginViewModel) this.f23549m0.getValue();
    }
}
