package androidx.transition;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import i3.l;
import i3.m;
import i3.p;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import w1.d0;
import w1.q0;

public class Slide extends Visibility {
    public static final DecelerateInterpolator I = new DecelerateInterpolator();
    public static final AccelerateInterpolator J = new AccelerateInterpolator();
    public static final a K = new a();
    public static final b L = new b();
    public static final c M = new c();
    public static final d N = new d();
    public static final e O = new e();
    public static final f P = new f();
    public g H;

    public class a extends h {
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    public class b extends h {
        public final float b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            boolean z10 = true;
            if (d0.e.d(viewGroup) != 1) {
                z10 = false;
            }
            if (z10) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    public class c extends i {
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    public class d extends h {
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    public class e extends h {
        public final float b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            boolean z10 = true;
            if (d0.e.d(viewGroup) != 1) {
                z10 = false;
            }
            if (z10) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    public class f extends i {
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    public static abstract class h implements g {
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    public static abstract class i implements g {
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        throw null;
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = P;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11055f);
        int c10 = m1.i.c(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        P(c10);
    }

    public final Animator N(ViewGroup viewGroup, View view, p pVar, p pVar2) {
        if (pVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) pVar2.f11062a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return j.a(view, pVar2, iArr[0], iArr[1], this.H.b(viewGroup, view), this.H.a(viewGroup, view), translationX, translationY, I, this);
    }

    public final Animator O(ViewGroup viewGroup, View view, p pVar) {
        if (pVar == null) {
            return null;
        }
        int[] iArr = (int[]) pVar.f11062a.get("android:slide:screenPosition");
        return j.a(view, pVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.H.b(viewGroup, view), this.H.a(viewGroup, view), J, this);
    }

    public final void P(int i10) {
        if (i10 == 3) {
            this.H = K;
        } else if (i10 == 5) {
            this.H = N;
        } else if (i10 == 48) {
            this.H = M;
        } else if (i10 == 80) {
            this.H = P;
        } else if (i10 == 8388611) {
            this.H = L;
        } else if (i10 == 8388613) {
            this.H = O;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        l lVar = new l();
        lVar.f11049c = i10;
        this.f3449z = lVar;
    }

    public final void e(p pVar) {
        L(pVar);
        int[] iArr = new int[2];
        pVar.f11063b.getLocationOnScreen(iArr);
        pVar.f11062a.put("android:slide:screenPosition", iArr);
    }

    public final void j(p pVar) {
        L(pVar);
        int[] iArr = new int[2];
        pVar.f11063b.getLocationOnScreen(iArr);
        pVar.f11062a.put("android:slide:screenPosition", iArr);
    }
}
