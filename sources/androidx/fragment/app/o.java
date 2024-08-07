package androidx.fragment.app;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.google.android.material.carousel.b;
import hc.a;
import i3.p;

/* compiled from: FragmentContainer */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static a.C0117a f2694a;

    public /* synthetic */ o() {
    }

    public static float d(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public abstract b C(x7.b bVar, View view);

    public abstract void D(int i10);

    public abstract void E(Typeface typeface, boolean z10);

    public abstract boolean F();

    public abstract void G(Object obj, float f10);

    public abstract boolean H(x7.b bVar, int i10);

    public abstract void I(byte[] bArr, int i10, int i11);

    public abstract void c(p pVar);

    public String f() {
        return null;
    }

    public abstract long g();

    public String o() {
        return null;
    }

    public abstract void p();

    public String s() {
        return null;
    }

    public abstract long u(ViewGroup viewGroup, Transition transition, p pVar, p pVar2);

    public abstract String v();

    public abstract float w(Object obj);

    public abstract View z(int i10);

    public /* synthetic */ o(int i10) {
    }
}
