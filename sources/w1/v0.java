package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.R$id;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import v7.g;
import w1.d0;
import w1.w0;

/* compiled from: WindowInsetsAnimationCompat */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public e f16356a;

    /* compiled from: WindowInsetsAnimationCompat */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public WindowInsets f16359a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16360b = 0;

        public abstract w0 a(w0 w0Var, List<v0> list);
    }

    /* compiled from: WindowInsetsAnimationCompat */
    public static class c extends e {

        /* renamed from: e  reason: collision with root package name */
        public static final PathInterpolator f16361e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f  reason: collision with root package name */
        public static final q2.a f16362f = new q2.a();

        /* renamed from: g  reason: collision with root package name */
        public static final DecelerateInterpolator f16363g = new DecelerateInterpolator();

        /* compiled from: WindowInsetsAnimationCompat */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public final b f16364a;

            /* renamed from: b  reason: collision with root package name */
            public w0 f16365b;

            /* renamed from: w1.v0$c$a$a  reason: collision with other inner class name */
            /* compiled from: WindowInsetsAnimationCompat */
            public class C0212a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ v0 f16366a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ w0 f16367b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ w0 f16368c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ int f16369d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ View f16370e;

                public C0212a(v0 v0Var, w0 w0Var, w0 w0Var2, int i10, View view) {
                    this.f16366a = v0Var;
                    this.f16367b = w0Var;
                    this.f16368c = w0Var2;
                    this.f16369d = i10;
                    this.f16370e = view;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    w0.e eVar;
                    w0 w0Var;
                    w0 w0Var2;
                    float f10;
                    v0 v0Var = this.f16366a;
                    v0Var.f16356a.d(valueAnimator.getAnimatedFraction());
                    w0 w0Var3 = this.f16367b;
                    w0 w0Var4 = this.f16368c;
                    float b10 = this.f16366a.f16356a.b();
                    int i10 = this.f16369d;
                    PathInterpolator pathInterpolator = c.f16361e;
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30) {
                        eVar = new w0.d(w0Var3);
                    } else if (i11 >= 29) {
                        eVar = new w0.c(w0Var3);
                    } else {
                        eVar = new w0.b(w0Var3);
                    }
                    int i12 = 1;
                    while (i12 <= 256) {
                        if ((i10 & i12) == 0) {
                            eVar.c(i12, w0Var3.a(i12));
                            w0Var2 = w0Var3;
                            w0Var = w0Var4;
                            f10 = b10;
                        } else {
                            n1.e a10 = w0Var3.a(i12);
                            n1.e a11 = w0Var4.a(i12);
                            float f11 = 1.0f - b10;
                            w0Var2 = w0Var3;
                            w0Var = w0Var4;
                            f10 = b10;
                            eVar.c(i12, w0.f(a10, (int) (((double) (((float) (a10.f13427a - a11.f13427a)) * f11)) + 0.5d), (int) (((double) (((float) (a10.f13428b - a11.f13428b)) * f11)) + 0.5d), (int) (((double) (((float) (a10.f13429c - a11.f13429c)) * f11)) + 0.5d), (int) (((double) (((float) (a10.f13430d - a11.f13430d)) * f11)) + 0.5d)));
                        }
                        i12 <<= 1;
                        w0Var4 = w0Var;
                        b10 = f10;
                        w0Var3 = w0Var2;
                    }
                    c.g(this.f16370e, eVar.b(), Collections.singletonList(this.f16366a));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ v0 f16371a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ View f16372b;

                public b(v0 v0Var, View view) {
                    this.f16371a = v0Var;
                    this.f16372b = view;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f16371a.f16356a.d(1.0f);
                    c.e(this.f16372b, this.f16371a);
                }
            }

            /* renamed from: w1.v0$c$a$c  reason: collision with other inner class name */
            /* compiled from: WindowInsetsAnimationCompat */
            public class C0213c implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ View f16373a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ v0 f16374b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f16375c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f16376d;

                public C0213c(View view, v0 v0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f16373a = view;
                    this.f16374b = v0Var;
                    this.f16375c = aVar;
                    this.f16376d = valueAnimator;
                }

                public final void run() {
                    c.h(this.f16373a, this.f16374b, this.f16375c);
                    this.f16376d.start();
                }
            }

            public a(View view, g gVar) {
                w0 w0Var;
                w0.e eVar;
                this.f16364a = gVar;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                w0 a10 = d0.j.a(view);
                if (a10 != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        eVar = new w0.d(a10);
                    } else if (i10 >= 29) {
                        eVar = new w0.c(a10);
                    } else {
                        eVar = new w0.b(a10);
                    }
                    w0Var = eVar.b();
                } else {
                    w0Var = null;
                }
                this.f16365b = w0Var;
            }

            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                Interpolator interpolator;
                if (!view.isLaidOut()) {
                    this.f16365b = w0.i(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                w0 i10 = w0.i(view, windowInsets);
                if (this.f16365b == null) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    this.f16365b = d0.j.a(view);
                }
                if (this.f16365b == null) {
                    this.f16365b = i10;
                    return c.i(view, windowInsets);
                }
                b j10 = c.j(view);
                if (j10 != null && Objects.equals(j10.f16359a, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                w0 w0Var = this.f16365b;
                int i11 = 0;
                for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                    if (!i10.a(i12).equals(w0Var.a(i12))) {
                        i11 |= i12;
                    }
                }
                if (i11 == 0) {
                    return c.i(view, windowInsets);
                }
                w0 w0Var2 = this.f16365b;
                if ((i11 & 8) == 0) {
                    interpolator = c.f16363g;
                } else if (i10.a(8).f13430d > w0Var2.a(8).f13430d) {
                    interpolator = c.f16361e;
                } else {
                    interpolator = c.f16362f;
                }
                v0 v0Var = new v0(i11, interpolator, 160);
                v0Var.f16356a.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(v0Var.f16356a.a());
                n1.e a10 = i10.a(i11);
                n1.e a11 = w0Var2.a(i11);
                a aVar = new a(n1.e.b(Math.min(a10.f13427a, a11.f13427a), Math.min(a10.f13428b, a11.f13428b), Math.min(a10.f13429c, a11.f13429c), Math.min(a10.f13430d, a11.f13430d)), n1.e.b(Math.max(a10.f13427a, a11.f13427a), Math.max(a10.f13428b, a11.f13428b), Math.max(a10.f13429c, a11.f13429c), Math.max(a10.f13430d, a11.f13430d)));
                c.f(view, v0Var, windowInsets, false);
                duration.addUpdateListener(new C0212a(v0Var, i10, w0Var2, i11, view));
                duration.addListener(new b(v0Var, view));
                t.a(view, new C0213c(view, v0Var, aVar, duration));
                this.f16365b = i10;
                return c.i(view, windowInsets);
            }
        }

        public c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        public static void e(View view, v0 v0Var) {
            b j10 = j(view);
            if (j10 != null) {
                ((g) j10).f16081c.setTranslationY(0.0f);
                if (j10.f16360b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    e(viewGroup.getChildAt(i10), v0Var);
                }
            }
        }

        public static void f(View view, v0 v0Var, WindowInsets windowInsets, boolean z10) {
            b j10 = j(view);
            if (j10 != null) {
                j10.f16359a = windowInsets;
                if (!z10) {
                    g gVar = (g) j10;
                    gVar.f16081c.getLocationOnScreen(gVar.f16084f);
                    gVar.f16082d = gVar.f16084f[1];
                    if (j10.f16360b == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    f(viewGroup.getChildAt(i10), v0Var, windowInsets, z10);
                }
            }
        }

        public static void g(View view, w0 w0Var, List<v0> list) {
            b j10 = j(view);
            if (j10 != null) {
                j10.a(w0Var, list);
                if (j10.f16360b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    g(viewGroup.getChildAt(i10), w0Var, list);
                }
            }
        }

        public static void h(View view, v0 v0Var, a aVar) {
            b j10 = j(view);
            if (j10 != null) {
                g gVar = (g) j10;
                gVar.f16081c.getLocationOnScreen(gVar.f16084f);
                int i10 = gVar.f16082d - gVar.f16084f[1];
                gVar.f16083e = i10;
                gVar.f16081c.setTranslationY((float) i10);
                if (j10.f16360b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    h(viewGroup.getChildAt(i11), v0Var, aVar);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            if (view.getTag(R$id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R$id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f16364a;
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f16382a;

        /* renamed from: b  reason: collision with root package name */
        public float f16383b;

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f16384c;

        /* renamed from: d  reason: collision with root package name */
        public final long f16385d;

        public e(int i10, Interpolator interpolator, long j10) {
            this.f16382a = i10;
            this.f16384c = interpolator;
            this.f16385d = j10;
        }

        public long a() {
            return this.f16385d;
        }

        public float b() {
            Interpolator interpolator = this.f16384c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f16383b);
            }
            return this.f16383b;
        }

        public int c() {
            return this.f16382a;
        }

        public void d(float f10) {
            this.f16383b = f10;
        }
    }

    public v0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16356a = new d(i10, interpolator, j10);
        } else {
            this.f16356a = new c(i10, interpolator, j10);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat */
    public static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        public final WindowInsetsAnimation f16377e;

        /* compiled from: WindowInsetsAnimationCompat */
        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final b f16378a;

            /* renamed from: b  reason: collision with root package name */
            public List<v0> f16379b;

            /* renamed from: c  reason: collision with root package name */
            public ArrayList<v0> f16380c;

            /* renamed from: d  reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, v0> f16381d = new HashMap<>();

            public a(g gVar) {
                super(gVar.f16360b);
                this.f16378a = gVar;
            }

            public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
                v0 v0Var = this.f16381d.get(windowInsetsAnimation);
                if (v0Var == null) {
                    v0Var = new v0(0, (Interpolator) null, 0);
                    if (Build.VERSION.SDK_INT >= 30) {
                        v0Var.f16356a = new d(windowInsetsAnimation);
                    }
                    this.f16381d.put(windowInsetsAnimation, v0Var);
                }
                return v0Var;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f16378a;
                a(windowInsetsAnimation);
                ((g) bVar).f16081c.setTranslationY(0.0f);
                this.f16381d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f16378a;
                a(windowInsetsAnimation);
                g gVar = (g) bVar;
                gVar.f16081c.getLocationOnScreen(gVar.f16084f);
                gVar.f16082d = gVar.f16084f[1];
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<v0> arrayList = this.f16380c;
                if (arrayList == null) {
                    ArrayList<v0> arrayList2 = new ArrayList<>(list.size());
                    this.f16380c = arrayList2;
                    this.f16379b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                        v0 a10 = a(windowInsetsAnimation);
                        a10.f16356a.d(windowInsetsAnimation.getFraction());
                        this.f16380c.add(a10);
                    } else {
                        b bVar = this.f16378a;
                        w0 i10 = w0.i((View) null, windowInsets);
                        bVar.a(i10, this.f16379b);
                        return i10.h();
                    }
                }
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                b bVar = this.f16378a;
                a(windowInsetsAnimation);
                a aVar = new a(bounds);
                g gVar = (g) bVar;
                gVar.f16081c.getLocationOnScreen(gVar.f16084f);
                int i10 = gVar.f16082d - gVar.f16084f[1];
                gVar.f16083e = i10;
                gVar.f16081c.setTranslationY((float) i10);
                return d.e(aVar);
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f16377e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.f16357a.d(), aVar.f16358b.d());
        }

        public static n1.e f(WindowInsetsAnimation.Bounds bounds) {
            return n1.e.c(bounds.getUpperBound());
        }

        public static n1.e g(WindowInsetsAnimation.Bounds bounds) {
            return n1.e.c(bounds.getLowerBound());
        }

        public final long a() {
            return this.f16377e.getDurationMillis();
        }

        public final float b() {
            return this.f16377e.getInterpolatedFraction();
        }

        public final int c() {
            return this.f16377e.getTypeMask();
        }

        public final void d(float f10) {
            this.f16377e.setFraction(f10);
        }

        public d(int i10, Interpolator interpolator, long j10) {
            this(new WindowInsetsAnimation(i10, interpolator, j10));
        }
    }

    /* compiled from: WindowInsetsAnimationCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n1.e f16357a;

        /* renamed from: b  reason: collision with root package name */
        public final n1.e f16358b;

        public a(n1.e eVar, n1.e eVar2) {
            this.f16357a = eVar;
            this.f16358b = eVar2;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Bounds{lower=");
            q10.append(this.f16357a);
            q10.append(" upper=");
            q10.append(this.f16358b);
            q10.append("}");
            return q10.toString();
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f16357a = d.g(bounds);
            this.f16358b = d.f(bounds);
        }
    }
}
