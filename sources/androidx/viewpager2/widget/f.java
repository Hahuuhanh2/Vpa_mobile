package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: PageTransformerAdapter */
public final class f extends ViewPager2.g {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayoutManager f3632a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager2.i f3633b;

    public f(LinearLayoutManager linearLayoutManager) {
        this.f3632a = linearLayoutManager;
    }

    public final void a(int i10) {
    }

    public final void b(float f10, int i10, int i11) {
        if (this.f3633b != null) {
            float f11 = -f10;
            int i12 = 0;
            while (i12 < this.f3632a.H()) {
                View G = this.f3632a.G(i12);
                boolean z10 = true;
                if (G != null) {
                    this.f3632a.getClass();
                    float O = ((float) (RecyclerView.m.O(G) - i10)) + f11;
                    e eVar = (e) this.f3633b;
                    eVar.getClass();
                    ViewParent parent = G.getParent();
                    ViewParent parent2 = parent.getParent();
                    if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
                        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
                    }
                    ViewPager2 viewPager2 = (ViewPager2) parent2;
                    float f12 = ((float) eVar.f3631a) * O;
                    if (viewPager2.getOrientation() == 0) {
                        if (viewPager2.f3597n.M() != 1) {
                            z10 = false;
                        }
                        if (z10) {
                            f12 = -f12;
                        }
                        G.setTranslationX(f12);
                    } else {
                        G.setTranslationY(f12);
                    }
                    i12++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i12), Integer.valueOf(this.f3632a.H())}));
                }
            }
        }
    }

    public final void c(int i10) {
    }
}
