package ai;

import al.r0;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.google.zxing.WriterException;
import com.ots.base.ui.AddressEdittext;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.payment.ui.PaymentViewModel;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import mg.e4;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.k;
import sk.s;

/* compiled from: TransferPaymentFragment.kt */
public final class j extends a<e4> {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ int f18980n0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f18981m0 = j0.b(this, s.a(PaymentViewModel.class), new b(this), new c(this), new d(this));

    /* compiled from: TransferPaymentFragment.kt */
    public static final class a implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f18982a;

        public a(i iVar) {
            this.f18982a = iVar;
        }

        public final ek.a<?> a() {
            return this.f18982a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f18982a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return sk.j.a(this.f18982a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f18982a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class b extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f18983a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f18983a = fragment;
        }

        public final Object invoke() {
            w n10 = this.f18983a.c0().n();
            sk.j.e(n10, "requireActivity().viewModelStore");
            return n10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f18984a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18984a = fragment;
        }

        public final Object invoke() {
            return this.f18984a.c0().g();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f18985a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18985a = fragment;
        }

        public final Object invoke() {
            f0.b f10 = this.f18985a.c0().f();
            sk.j.e(f10, "requireActivity().defaultViewModelProviderFactory");
            return f10;
        }
    }

    public static final Bitmap m0(j jVar, String str) {
        int i10;
        jVar.getClass();
        try {
            cd.b e10 = new a.a().e(str, uc.a.QR_CODE);
            int i11 = e10.f4689a;
            int i12 = e10.f4690b;
            int[] iArr = new int[(i11 * i12)];
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i13 * i11;
                for (int i15 = 0; i15 < i11; i15++) {
                    int i16 = i14 + i15;
                    if (e10.b(i15, i13)) {
                        i10 = -16777216;
                    } else {
                        i10 = -1;
                    }
                    iArr[i16] = i10;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i11, 0, 0, i11, i12);
            return createBitmap;
        } catch (WriterException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public final void W(View view, Bundle bundle) {
        Spanned spanned;
        sk.j.f(view, "view");
        ((e4) i0()).w((PaymentViewModel) this.f18981m0.getValue());
        ((PaymentViewModel) this.f18981m0.getValue()).f19792g.e(y(), new a(new i(this)));
        AppTextView appTextView = ((e4) i0()).F;
        String x10 = x(C0540R$string.payment_notice);
        sk.j.e(x10, "getString(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml(x10, 0);
            sk.j.c(spanned);
        } else {
            spanned = Html.fromHtml(x10);
            sk.j.c(spanned);
        }
        appTextView.setText(spanned);
        ((e4) i0()).f21044w.setOnClickListener(new zh.d(this, 1));
        ((e4) i0()).f21045x.setOnClickListener(new com.google.android.material.textfield.b(this, 29));
        ((e4) i0()).f21046y.setOnClickListener(new c(this, 0));
        AddressEdittext addressEdittext = ((e4) i0()).B;
        FragmentManager o10 = o();
        sk.j.e(o10, "getChildFragmentManager(...)");
        addressEdittext.setFragmentManager(o10);
        AddressEdittext addressEdittext2 = ((e4) i0()).B;
        sk.j.e(addressEdittext2, "tvBank");
        addressEdittext2.setOnClickListener(new kf.b(500, addressEdittext2, new g(this)));
        ((e4) i0()).B.setOnItemSelected(new h(this));
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.f18981m0.getValue();
        l0.j0(l0.d0(paymentViewModel), r0.f19085b, new yh.b(paymentViewModel, PaymentActivity.S, (ik.d<? super yh.b>) null), 2);
    }

    public final int j0() {
        return C0535R$layout.fragment_transfer_payment;
    }
}
