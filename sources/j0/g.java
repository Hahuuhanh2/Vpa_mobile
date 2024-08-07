package j0;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.o;
import f0.q;
import p3.l0;

/* compiled from: SupportedOutputSizesSorterLegacy */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f11461a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11462b;

    /* renamed from: c  reason: collision with root package name */
    public final Rational f11463c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11464d;

    public g(q qVar, Rational rational) {
        this.f11461a = qVar.a();
        this.f11462b = qVar.f();
        this.f11463c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f11464d = z10;
    }

    public final Size a(o oVar) {
        boolean z10;
        int x10 = oVar.x();
        Size y10 = oVar.y();
        int i10 = this.f11462b;
        int i11 = this.f11461a;
        if (y10 == null) {
            return y10;
        }
        int M0 = l0.M0(x10);
        boolean z11 = true;
        if (1 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int c02 = l0.c0(z10, M0, i11);
        if (!(c02 == 90 || c02 == 270)) {
            z11 = false;
        }
        if (z11) {
            return new Size(y10.getHeight(), y10.getWidth());
        }
        return y10;
    }
}
