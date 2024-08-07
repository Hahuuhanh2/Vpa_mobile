package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import c0.i0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e;
import com.google.android.material.internal.f;
import com.google.android.material.internal.h;
import com.google.android.material.internal.m;
import com.google.android.material.internal.n;
import com.google.android.material.internal.v;
import com.google.android.material.internal.x;
import f8.g;
import i.d;
import java.util.WeakHashMap;
import t7.b;
import w1.d0;
import w1.q0;

/* compiled from: SearchViewAnimationHelper */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final SearchView f6708a;

    /* renamed from: b  reason: collision with root package name */
    public final View f6709b;

    /* renamed from: c  reason: collision with root package name */
    public final ClippableRoundedCornerLayout f6710c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f6711d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f6712e;

    /* renamed from: f  reason: collision with root package name */
    public final MaterialToolbar f6713f;

    /* renamed from: g  reason: collision with root package name */
    public final Toolbar f6714g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f6715h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f6716i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageButton f6717j;

    /* renamed from: k  reason: collision with root package name */
    public final View f6718k;

    /* renamed from: l  reason: collision with root package name */
    public final TouchObserverFrameLayout f6719l;

    /* renamed from: m  reason: collision with root package name */
    public final g f6720m;

    /* renamed from: n  reason: collision with root package name */
    public AnimatorSet f6721n;

    /* renamed from: o  reason: collision with root package name */
    public SearchBar f6722o;

    /* compiled from: SearchViewAnimationHelper */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6723a;

        public a(boolean z10) {
            this.f6723a = z10;
        }

        public final void onAnimationEnd(Animator animator) {
            float f10;
            o oVar = o.this;
            if (this.f6723a) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            o.a(oVar, f10);
            ClippableRoundedCornerLayout clippableRoundedCornerLayout = o.this.f6710c;
            clippableRoundedCornerLayout.f6361a = null;
            clippableRoundedCornerLayout.f6362b = 0.0f;
            clippableRoundedCornerLayout.invalidate();
        }

        public final void onAnimationStart(Animator animator) {
            float f10;
            o oVar = o.this;
            if (this.f6723a) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            o.a(oVar, f10);
        }
    }

    public o(SearchView searchView) {
        this.f6708a = searchView;
        this.f6709b = searchView.f6661a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f6662b;
        this.f6710c = clippableRoundedCornerLayout;
        this.f6711d = searchView.f6665e;
        this.f6712e = searchView.f6666f;
        this.f6713f = searchView.f6667n;
        this.f6714g = searchView.f6668o;
        this.f6715h = searchView.f6669p;
        this.f6716i = searchView.f6670q;
        this.f6717j = searchView.f6671r;
        this.f6718k = searchView.f6672s;
        this.f6719l = searchView.f6673t;
        this.f6720m = new g(clippableRoundedCornerLayout);
    }

    public static void a(o oVar, float f10) {
        ActionMenuView a10;
        oVar.f6717j.setAlpha(f10);
        oVar.f6718k.setAlpha(f10);
        oVar.f6719l.setAlpha(f10);
        if (oVar.f6708a.D && (a10 = v.a(oVar.f6713f)) != null) {
            a10.setAlpha(f10);
        }
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton b10 = v.b(this.f6713f);
        if (b10 != null) {
            Drawable d10 = o1.a.d(b10.getDrawable());
            if (this.f6708a.C) {
                if (d10 instanceof d) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new com.google.android.material.navigation.a((d) d10, 1));
                    animatorSet.playTogether(new Animator[]{ofFloat});
                }
                if (d10 instanceof e) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat2.addUpdateListener(new w7.a((e) d10, 2));
                    animatorSet.playTogether(new Animator[]{ofFloat2});
                    return;
                }
                return;
            }
            if (d10 instanceof d) {
                ((d) d10).setProgress(1.0f);
            }
            if (d10 instanceof e) {
                ((e) d10).a(1.0f);
            }
        }
    }

    public final AnimatorSet c(boolean z10) {
        long j10;
        AnimatorSet animatorSet = new AnimatorSet();
        ImageButton b10 = v.b(this.f6713f);
        if (b10 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) f(b10), 0.0f});
            ofFloat.addUpdateListener(new h(new kh.h(11), b10));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) g(), 0.0f});
            ofFloat2.addUpdateListener(h.a(b10));
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        }
        ActionMenuView a10 = v.a(this.f6713f);
        if (a10 != null) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{(float) e(a10), 0.0f});
            ofFloat3.addUpdateListener(new h(new kh.h(11), a10));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{(float) g(), 0.0f});
            ofFloat4.addUpdateListener(h.a(a10));
            animatorSet.playTogether(new Animator[]{ofFloat3, ofFloat4});
        }
        if (z10) {
            j10 = 300;
        } else {
            j10 = 250;
        }
        animatorSet.setDuration(j10);
        animatorSet.setInterpolator(n.a(z10, b.f14886b));
        return animatorSet;
    }

    public final AnimatorSet d(boolean z10) {
        boolean z11;
        Interpolator interpolator;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        boolean z12 = z10;
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f6721n != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator[] animatorArr = new Animator[2];
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            if (z12) {
                j19 = 300;
            } else {
                j19 = 250;
            }
            animatorSet2.setDuration(j19);
            animatorSet2.setInterpolator(n.a(z12, b.f14886b));
            animatorArr[0] = animatorSet2;
            animatorArr[1] = c(z10);
            animatorSet.playTogether(animatorArr);
        }
        Animator[] animatorArr2 = new Animator[9];
        if (z12) {
            interpolator = b.f14885a;
        } else {
            interpolator = b.f14886b;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (z12) {
            j10 = 300;
        } else {
            j10 = 250;
        }
        ofFloat.setDuration(j10);
        ofFloat.setInterpolator(n.a(z12, interpolator));
        ofFloat.addUpdateListener(new h(new i0(8), this.f6709b));
        animatorArr2[0] = ofFloat;
        g gVar = this.f6720m;
        Rect rect = gVar.f10059j;
        Rect rect2 = gVar.f10060k;
        if (rect == null) {
            SearchView searchView = this.f6708a;
            rect = new Rect(searchView.getLeft(), searchView.getTop() + 0, searchView.getRight(), searchView.getBottom() + 0);
        }
        if (rect2 == null) {
            rect2 = x.a(this.f6710c, this.f6722o);
        }
        Rect rect3 = new Rect(rect2);
        float cornerSize = this.f6722o.getCornerSize();
        float max = Math.max(this.f6710c.getCornerRadius(), (float) this.f6720m.b());
        ValueAnimator ofObject = ValueAnimator.ofObject(new m(rect3), new Object[]{rect2, rect});
        ofObject.addUpdateListener(new j(this, cornerSize, max, rect3));
        if (z12) {
            j11 = 300;
        } else {
            j11 = 250;
        }
        ofObject.setDuration(j11);
        q2.b bVar = b.f14886b;
        ofObject.setInterpolator(n.a(z12, bVar));
        animatorArr2[1] = ofObject;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (z12) {
            j12 = 50;
        } else {
            j12 = 42;
        }
        ofFloat2.setDuration(j12);
        if (z12) {
            j13 = 250;
        } else {
            j13 = 0;
        }
        ofFloat2.setStartDelay(j13);
        LinearInterpolator linearInterpolator = b.f14885a;
        ofFloat2.setInterpolator(n.a(z12, linearInterpolator));
        ofFloat2.addUpdateListener(new h(new i0(8), this.f6717j));
        animatorArr2[2] = ofFloat2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator[] animatorArr3 = new Animator[3];
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (z12) {
            j14 = 150;
        } else {
            j14 = 83;
        }
        ofFloat3.setDuration(j14);
        if (z12) {
            j15 = 75;
        } else {
            j15 = 0;
        }
        ofFloat3.setStartDelay(j15);
        ofFloat3.setInterpolator(n.a(z12, linearInterpolator));
        ofFloat3.addUpdateListener(new h(new i0(8), this.f6718k, this.f6719l));
        animatorArr3[0] = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{(((float) this.f6719l.getHeight()) * 0.050000012f) / 2.0f, 0.0f});
        if (z12) {
            j16 = 300;
        } else {
            j16 = 250;
        }
        ofFloat4.setDuration(j16);
        ofFloat4.setInterpolator(n.a(z12, bVar));
        ofFloat4.addUpdateListener(h.a(this.f6718k));
        animatorArr3[1] = ofFloat4;
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.95f, 1.0f});
        if (z12) {
            j17 = 300;
        } else {
            j17 = 250;
        }
        ofFloat5.setDuration(j17);
        ofFloat5.setInterpolator(n.a(z12, bVar));
        ofFloat5.addUpdateListener(new h(new i0(7), this.f6719l));
        animatorArr3[2] = ofFloat5;
        animatorSet3.playTogether(animatorArr3);
        animatorArr2[3] = animatorSet3;
        animatorArr2[4] = i(this.f6711d, z12, false);
        animatorArr2[5] = i(this.f6714g, z12, false);
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (z12) {
            j18 = 300;
        } else {
            j18 = 250;
        }
        ofFloat6.setDuration(j18);
        ofFloat6.setInterpolator(n.a(z12, bVar));
        if (this.f6708a.D) {
            ofFloat6.addUpdateListener(new f(v.a(this.f6714g), v.a(this.f6713f)));
        }
        animatorArr2[6] = ofFloat6;
        animatorArr2[7] = i(this.f6716i, z12, true);
        animatorArr2[8] = i(this.f6715h, z12, true);
        animatorSet.playTogether(animatorArr2);
        animatorSet.addListener(new a(z12));
        return animatorSet;
    }

    public final int e(View view) {
        int b10 = w1.g.b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        if (x.g(this.f6722o)) {
            return this.f6722o.getLeft() - b10;
        }
        return (this.f6722o.getRight() - this.f6708a.getWidth()) + b10;
    }

    public final int f(View view) {
        int c10 = w1.g.c((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        SearchBar searchBar = this.f6722o;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int f10 = d0.e.f(searchBar);
        if (x.g(this.f6722o)) {
            return ((this.f6722o.getWidth() - this.f6722o.getRight()) + c10) - f10;
        }
        return (this.f6722o.getLeft() - c10) + f10;
    }

    public final int g() {
        int top = this.f6712e.getTop();
        return ((this.f6722o.getBottom() + this.f6722o.getTop()) / 2) - ((this.f6712e.getBottom() + top) / 2);
    }

    public final AnimatorSet h(boolean z10) {
        long j10;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) this.f6710c.getHeight(), 0.0f});
        ofFloat.addUpdateListener(h.a(this.f6710c));
        animatorSet.playTogether(new Animator[]{ofFloat});
        b(animatorSet);
        animatorSet.setInterpolator(n.a(z10, b.f14886b));
        if (z10) {
            j10 = 350;
        } else {
            j10 = 300;
        }
        animatorSet.setDuration(j10);
        return animatorSet;
    }

    public final AnimatorSet i(View view, boolean z10, boolean z11) {
        int i10;
        long j10;
        if (z11) {
            i10 = f(view);
        } else {
            i10 = e(view);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i10, 0.0f});
        ofFloat.addUpdateListener(new h(new kh.h(11), view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) g(), 0.0f});
        ofFloat2.addUpdateListener(h.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        if (z10) {
            j10 = 300;
        } else {
            j10 = 250;
        }
        animatorSet.setDuration(j10);
        animatorSet.setInterpolator(n.a(z10, b.f14886b));
        return animatorSet;
    }

    public final AnimatorSet j() {
        if (this.f6722o != null) {
            if (this.f6708a.g()) {
                this.f6708a.f();
            }
            AnimatorSet d10 = d(false);
            d10.addListener(new l(this));
            d10.start();
            return d10;
        }
        if (this.f6708a.g()) {
            this.f6708a.f();
        }
        AnimatorSet h10 = h(false);
        h10.addListener(new n(this));
        h10.start();
        return h10;
    }

    public final void k(SearchBar searchBar) {
        this.f6722o = searchBar;
    }
}
