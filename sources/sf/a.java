package sf;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;
import p3.l0;
import sf.b;
import uf.h;
import vf.d;
import vf.e;
import vf.g;
import vf.j;
import vf.l;
import vf.m;
import vf.n;

/* compiled from: AnimationController */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f22850a;

    /* renamed from: b  reason: collision with root package name */
    public b.a f22851b;

    /* renamed from: c  reason: collision with root package name */
    public vf.a f22852c;

    /* renamed from: d  reason: collision with root package name */
    public yf.a f22853d;

    /* renamed from: e  reason: collision with root package name */
    public float f22854e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22855f;

    public a(yf.a aVar, b.a aVar2) {
        this.f22850a = new b(aVar2);
        this.f22851b = aVar2;
        this.f22853d = aVar;
    }

    public final void a() {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        int i16;
        int i17;
        boolean z17;
        long j10;
        int i18;
        int i19;
        boolean z18;
        boolean z19 = false;
        switch (this.f22853d.a().ordinal()) {
            case 0:
                ((com.smarteist.autoimageslider.IndicatorView.a) this.f22851b).b((tf.a) null);
                return;
            case 1:
                yf.a aVar = this.f22853d;
                int i20 = aVar.f23516l;
                int i21 = aVar.f23515k;
                long j11 = aVar.f23520p;
                b bVar = this.f22850a;
                if (bVar.f22856a == null) {
                    bVar.f22856a = new vf.b(bVar.f22865j);
                }
                vf.b bVar2 = bVar.f22856a;
                if (bVar2.f23261c != null) {
                    if (bVar2.f23263e == i21 && bVar2.f23264f == i20) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        bVar2.f23263e = i21;
                        bVar2.f23264f = i20;
                        ((ValueAnimator) bVar2.f23261c).setValues(new PropertyValuesHolder[]{bVar2.e(false), bVar2.e(true)});
                    }
                }
                bVar2.b(j11);
                if (this.f22855f) {
                    bVar2.f(this.f22854e);
                } else {
                    bVar2.c();
                }
                this.f22852c = bVar2;
                return;
            case 2:
                yf.a aVar2 = this.f22853d;
                int i22 = aVar2.f23516l;
                int i23 = aVar2.f23515k;
                int i24 = aVar2.f23507c;
                float f10 = aVar2.f23514j;
                long j12 = aVar2.f23520p;
                b bVar3 = this.f22850a;
                if (bVar3.f22857b == null) {
                    bVar3.f22857b = new g(bVar3.f22865j);
                }
                g gVar = bVar3.f22857b;
                gVar.h(f10, i23, i22, i24);
                gVar.b(j12);
                if (this.f22855f) {
                    gVar.f(this.f22854e);
                } else {
                    gVar.c();
                }
                this.f22852c = gVar;
                return;
            case 3:
                yf.a aVar3 = this.f22853d;
                boolean z20 = aVar3.f23517m;
                if (z20) {
                    i10 = aVar3.f23522r;
                } else {
                    i10 = aVar3.f23524t;
                }
                if (z20) {
                    i11 = aVar3.f23523s;
                } else {
                    i11 = aVar3.f23522r;
                }
                int a02 = l0.a0(aVar3, i10);
                int a03 = l0.a0(this.f22853d, i11);
                if (i11 > i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yf.a aVar4 = this.f22853d;
                int i25 = aVar4.f23507c;
                long j13 = aVar4.f23520p;
                b bVar4 = this.f22850a;
                if (bVar4.f22858c == null) {
                    bVar4.f22858c = new n(bVar4.f22865j);
                }
                n nVar = bVar4.f22858c;
                if (nVar.f23303d == a02 && nVar.f23304e == a03 && nVar.f23305f == i25 && nVar.f23306g == z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    T animatorSet = new AnimatorSet();
                    animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                    nVar.f23261c = animatorSet;
                    nVar.f23303d = a02;
                    nVar.f23304e = a03;
                    nVar.f23305f = i25;
                    nVar.f23306g = z11;
                    int i26 = a02 - i25;
                    int i27 = a02 + i25;
                    h hVar = nVar.f23307h;
                    hVar.f23041a = i26;
                    hVar.f23042b = i27;
                    n.b d10 = nVar.d(z11);
                    n nVar2 = nVar;
                    long j14 = nVar.f23259a / 2;
                    ((AnimatorSet) nVar.f23261c).playSequentially(new Animator[]{nVar2.e(d10.f23311a, d10.f23312b, j14, false, nVar.f23307h), nVar2.e(d10.f23313c, d10.f23314d, j14, true, nVar.f23307h)});
                }
                nVar.b(j13);
                if (this.f22855f) {
                    nVar.f(this.f22854e);
                } else {
                    nVar.c();
                }
                this.f22852c = nVar;
                return;
            case 4:
                yf.a aVar5 = this.f22853d;
                boolean z21 = aVar5.f23517m;
                if (z21) {
                    i12 = aVar5.f23522r;
                } else {
                    i12 = aVar5.f23524t;
                }
                if (z21) {
                    i13 = aVar5.f23523s;
                } else {
                    i13 = aVar5.f23522r;
                }
                int a04 = l0.a0(aVar5, i12);
                int a05 = l0.a0(this.f22853d, i13);
                long j15 = this.f22853d.f23520p;
                b bVar5 = this.f22850a;
                if (bVar5.f22859d == null) {
                    bVar5.f22859d = new j(bVar5.f22865j);
                }
                j jVar = bVar5.f22859d;
                if (jVar.f23261c != null) {
                    if (jVar.f23295e == a04 && jVar.f23296f == a05) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        jVar.f23295e = a04;
                        jVar.f23296f = a05;
                        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{a04, a05});
                        ofInt.setEvaluator(new IntEvaluator());
                        ((ValueAnimator) jVar.f23261c).setValues(new PropertyValuesHolder[]{ofInt});
                    }
                }
                jVar.b(j15);
                if (this.f22855f) {
                    float f11 = this.f22854e;
                    T t10 = jVar.f23261c;
                    if (t10 != null) {
                        long j16 = (long) (f11 * ((float) jVar.f23259a));
                        if (((ValueAnimator) t10).getValues() != null && ((ValueAnimator) jVar.f23261c).getValues().length > 0) {
                            ((ValueAnimator) jVar.f23261c).setCurrentPlayTime(j16);
                        }
                    }
                } else {
                    jVar.c();
                }
                this.f22852c = jVar;
                return;
            case 5:
                yf.a aVar6 = this.f22853d;
                int i28 = aVar6.f23516l;
                int i29 = aVar6.f23515k;
                int i30 = aVar6.f23507c;
                int i31 = aVar6.f23513i;
                long j17 = aVar6.f23520p;
                b bVar6 = this.f22850a;
                if (bVar6.f22860e == null) {
                    bVar6.f22860e = new e(bVar6.f22865j);
                }
                e eVar = bVar6.f22860e;
                if (eVar.f23261c != null) {
                    if (eVar.f23263e == i29 && eVar.f23264f == i28 && eVar.f23275h == i30 && eVar.f23276i == i31) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        eVar.f23263e = i29;
                        eVar.f23264f = i28;
                        eVar.f23275h = i30;
                        eVar.f23276i = i31;
                        ((ValueAnimator) eVar.f23261c).setValues(new PropertyValuesHolder[]{eVar.e(false), eVar.e(true), eVar.g(false), eVar.g(true), eVar.h(false), eVar.h(true)});
                    }
                }
                eVar.b(j17);
                if (this.f22855f) {
                    eVar.f(this.f22854e);
                } else {
                    eVar.c();
                }
                this.f22852c = eVar;
                return;
            case 6:
                yf.a aVar7 = this.f22853d;
                boolean z22 = aVar7.f23517m;
                if (z22) {
                    i14 = aVar7.f23522r;
                } else {
                    i14 = aVar7.f23524t;
                }
                if (z22) {
                    i15 = aVar7.f23523s;
                } else {
                    i15 = aVar7.f23522r;
                }
                int a06 = l0.a0(aVar7, i14);
                int a07 = l0.a0(this.f22853d, i15);
                if (i15 > i14) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                yf.a aVar8 = this.f22853d;
                int i32 = aVar8.f23507c;
                long j18 = aVar8.f23520p;
                b bVar7 = this.f22850a;
                if (bVar7.f22861f == null) {
                    bVar7.f22861f = new m(bVar7.f22865j);
                }
                m mVar = bVar7.f22861f;
                if (mVar.f23303d == a06 && mVar.f23304e == a07 && mVar.f23305f == i32 && mVar.f23306g == z15) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (z16) {
                    T animatorSet2 = new AnimatorSet();
                    animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                    mVar.f23261c = animatorSet2;
                    mVar.f23303d = a06;
                    mVar.f23304e = a07;
                    mVar.f23305f = i32;
                    mVar.f23306g = z15;
                    int i33 = i32 * 2;
                    uf.g gVar2 = mVar.f23301i;
                    gVar2.f23041a = a06 - i32;
                    gVar2.f23042b = a06 + i32;
                    gVar2.f23040c = i33;
                    n.b d11 = mVar.d(z15);
                    double d12 = (double) mVar.f23259a;
                    long j19 = (long) (d12 * 0.5d);
                    long j20 = (long) (d12 * 0.8d);
                    ValueAnimator e10 = mVar.e(d11.f23311a, d11.f23312b, j20, false, mVar.f23301i);
                    ValueAnimator e11 = mVar.e(d11.f23313c, d11.f23314d, j20, true, mVar.f23301i);
                    e11.setStartDelay((long) (d12 * 0.2d));
                    ValueAnimator g2 = mVar.g(i33, i32, j19);
                    ValueAnimator g10 = mVar.g(i32, i33, j19);
                    g10.setStartDelay(j19);
                    ((AnimatorSet) mVar.f23261c).playTogether(new Animator[]{e10, e11, g2, g10});
                }
                mVar.b(j18);
                if (this.f22855f) {
                    mVar.h(this.f22854e);
                } else {
                    mVar.c();
                }
                this.f22852c = mVar;
                return;
            case 7:
                yf.a aVar9 = this.f22853d;
                boolean z23 = aVar9.f23517m;
                if (z23) {
                    i16 = aVar9.f23522r;
                } else {
                    i16 = aVar9.f23524t;
                }
                if (z23) {
                    i17 = aVar9.f23523s;
                } else {
                    i17 = aVar9.f23522r;
                }
                int a08 = l0.a0(aVar9, i16);
                int a09 = l0.a0(this.f22853d, i17);
                yf.a aVar10 = this.f22853d;
                int i34 = aVar10.f23510f;
                int i35 = aVar10.f23509e;
                if (aVar10.b() != yf.b.HORIZONTAL) {
                    i34 = i35;
                }
                yf.a aVar11 = this.f22853d;
                int i36 = aVar11.f23507c;
                int i37 = (i36 * 3) + i34;
                int i38 = i34 + i36;
                long j21 = aVar11.f23520p;
                b bVar8 = this.f22850a;
                if (bVar8.f22862g == null) {
                    bVar8.f22862g = new d(bVar8.f22865j);
                }
                d dVar = bVar8.f22862g;
                dVar.b(j21);
                if (dVar.f23268d == a08 && dVar.f23269e == a09 && dVar.f23270f == i37 && dVar.f23271g == i38 && dVar.f23272h == i36) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z17) {
                    T animatorSet3 = new AnimatorSet();
                    animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
                    dVar.f23261c = animatorSet3;
                    dVar.f23268d = a08;
                    dVar.f23269e = a09;
                    dVar.f23270f = i37;
                    dVar.f23271g = i38;
                    dVar.f23272h = i36;
                    int i39 = (int) (((double) i36) / 1.5d);
                    long j22 = dVar.f23259a;
                    long j23 = j22 / 2;
                    ValueAnimator d13 = dVar.d(a08, a09, j22, 1);
                    d dVar2 = dVar;
                    long j24 = j23;
                    ValueAnimator d14 = dVar2.d(i37, i38, j24, 2);
                    ValueAnimator d15 = dVar2.d(i38, i37, j24, 2);
                    ((AnimatorSet) dVar.f23261c).play(d14).with(dVar2.d(i36, i39, j24, 3)).with(d13).before(d15).before(dVar2.d(i39, i36, j24, 3));
                }
                if (this.f22855f) {
                    float f12 = this.f22854e;
                    T t11 = dVar.f23261c;
                    if (t11 != null) {
                        long j25 = (long) (f12 * ((float) dVar.f23259a));
                        Iterator<Animator> it = ((AnimatorSet) t11).getChildAnimations().iterator();
                        while (it.hasNext()) {
                            ValueAnimator valueAnimator = (ValueAnimator) it.next();
                            long duration = valueAnimator.getDuration();
                            if (z19) {
                                j10 = j25 - duration;
                            } else {
                                j10 = j25;
                            }
                            if (j10 >= 0) {
                                if (j10 >= duration) {
                                    j10 = duration;
                                }
                                if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                                    valueAnimator.setCurrentPlayTime(j10);
                                }
                                if (!z19 && duration >= dVar.f23259a) {
                                    z19 = true;
                                }
                            }
                        }
                    }
                } else {
                    dVar.c();
                }
                this.f22852c = dVar;
                return;
            case 8:
                yf.a aVar12 = this.f22853d;
                boolean z24 = aVar12.f23517m;
                if (z24) {
                    i18 = aVar12.f23522r;
                } else {
                    i18 = aVar12.f23524t;
                }
                if (z24) {
                    i19 = aVar12.f23523s;
                } else {
                    i19 = aVar12.f23522r;
                }
                int a010 = l0.a0(aVar12, i18);
                int a011 = l0.a0(this.f22853d, i19);
                long j26 = this.f22853d.f23520p;
                b bVar9 = this.f22850a;
                if (bVar9.f22863h == null) {
                    bVar9.f22863h = new l(bVar9.f22865j);
                }
                l lVar = bVar9.f22863h;
                if (lVar.f23261c != null) {
                    if (lVar.f23298d == a010 && lVar.f23299e == a011) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (z18) {
                        lVar.f23298d = a010;
                        lVar.f23299e = a011;
                        PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{a010, a011});
                        ofInt2.setEvaluator(new IntEvaluator());
                        PropertyValuesHolder ofInt3 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE_REVERSE", new int[]{a011, a010});
                        ofInt3.setEvaluator(new IntEvaluator());
                        ((ValueAnimator) lVar.f23261c).setValues(new PropertyValuesHolder[]{ofInt2, ofInt3});
                    }
                }
                lVar.b(j26);
                if (this.f22855f) {
                    float f13 = this.f22854e;
                    T t12 = lVar.f23261c;
                    if (t12 != null) {
                        long j27 = (long) (f13 * ((float) lVar.f23259a));
                        if (((ValueAnimator) t12).getValues() != null && ((ValueAnimator) lVar.f23261c).getValues().length > 0) {
                            ((ValueAnimator) lVar.f23261c).setCurrentPlayTime(j27);
                        }
                    }
                } else {
                    lVar.c();
                }
                this.f22852c = lVar;
                return;
            case 9:
                yf.a aVar13 = this.f22853d;
                int i40 = aVar13.f23516l;
                int i41 = aVar13.f23515k;
                int i42 = aVar13.f23507c;
                float f14 = aVar13.f23514j;
                long j28 = aVar13.f23520p;
                b bVar10 = this.f22850a;
                if (bVar10.f22864i == null) {
                    bVar10.f22864i = new vf.h(bVar10.f22865j);
                }
                vf.h hVar2 = bVar10.f22864i;
                hVar2.h(f14, i41, i40, i42);
                hVar2.b(j28);
                if (this.f22855f) {
                    hVar2.f(this.f22854e);
                } else {
                    hVar2.c();
                }
                this.f22852c = hVar2;
                return;
            default:
                return;
        }
    }
}
