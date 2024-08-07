package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import f1.d;
import f1.g;
import f1.l;
import f1.n;
import f1.p;
import f1.s;
import java.util.ArrayList;
import java.util.Iterator;
import lc.b;
import v.f;

/* compiled from: ViewTransition */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f1707a;

    /* renamed from: b  reason: collision with root package name */
    public int f1708b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1709c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f1710d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1711e;

    /* renamed from: f  reason: collision with root package name */
    public g f1712f;

    /* renamed from: g  reason: collision with root package name */
    public a.C0016a f1713g;

    /* renamed from: h  reason: collision with root package name */
    public int f1714h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f1715i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f1716j;

    /* renamed from: k  reason: collision with root package name */
    public String f1717k;

    /* renamed from: l  reason: collision with root package name */
    public int f1718l = 0;

    /* renamed from: m  reason: collision with root package name */
    public String f1719m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f1720n = -1;

    /* renamed from: o  reason: collision with root package name */
    public Context f1721o;

    /* renamed from: p  reason: collision with root package name */
    public int f1722p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f1723q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f1724r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f1725s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f1726t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f1727u = -1;

    /* compiled from: ViewTransition */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f1728a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1729b;

        /* renamed from: c  reason: collision with root package name */
        public n f1730c;

        /* renamed from: d  reason: collision with root package name */
        public int f1731d;

        /* renamed from: e  reason: collision with root package name */
        public b f1732e = new b(2);

        /* renamed from: f  reason: collision with root package name */
        public d f1733f;

        /* renamed from: g  reason: collision with root package name */
        public Interpolator f1734g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1735h = false;

        /* renamed from: i  reason: collision with root package name */
        public float f1736i;

        /* renamed from: j  reason: collision with root package name */
        public float f1737j;

        /* renamed from: k  reason: collision with root package name */
        public long f1738k;

        /* renamed from: l  reason: collision with root package name */
        public Rect f1739l = new Rect();

        /* renamed from: m  reason: collision with root package name */
        public boolean f1740m = false;

        public a(d dVar, n nVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            float f10;
            this.f1733f = dVar;
            this.f1730c = nVar;
            this.f1731d = i11;
            this.f1738k = System.nanoTime();
            d dVar2 = this.f1733f;
            if (dVar2.f1744d == null) {
                dVar2.f1744d = new ArrayList<>();
            }
            dVar2.f1744d.add(this);
            this.f1734g = interpolator;
            this.f1728a = i13;
            this.f1729b = i14;
            if (i12 == 3) {
                this.f1740m = true;
            }
            if (i10 == 0) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f / ((float) i10);
            }
            this.f1737j = f10;
            a();
        }

        public final void a() {
            float f10;
            float f11;
            if (this.f1735h) {
                long nanoTime = System.nanoTime();
                this.f1738k = nanoTime;
                float f12 = this.f1736i - (((float) (((double) (nanoTime - this.f1738k)) * 1.0E-6d)) * this.f1737j);
                this.f1736i = f12;
                if (f12 < 0.0f) {
                    this.f1736i = 0.0f;
                }
                Interpolator interpolator = this.f1734g;
                if (interpolator == null) {
                    f11 = this.f1736i;
                } else {
                    f11 = interpolator.getInterpolation(this.f1736i);
                }
                n nVar = this.f1730c;
                boolean e10 = nVar.e(f11, nanoTime, nVar.f9730b, this.f1732e);
                if (this.f1736i <= 0.0f) {
                    int i10 = this.f1728a;
                    if (i10 != -1) {
                        this.f1730c.f9730b.setTag(i10, Long.valueOf(System.nanoTime()));
                    }
                    int i11 = this.f1729b;
                    if (i11 != -1) {
                        this.f1730c.f9730b.setTag(i11, (Object) null);
                    }
                    this.f1733f.f1745e.add(this);
                }
                if (this.f1736i > 0.0f || e10) {
                    this.f1733f.f1741a.invalidate();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            this.f1738k = nanoTime2;
            float f13 = (((float) (((double) (nanoTime2 - this.f1738k)) * 1.0E-6d)) * this.f1737j) + this.f1736i;
            this.f1736i = f13;
            if (f13 >= 1.0f) {
                this.f1736i = 1.0f;
            }
            Interpolator interpolator2 = this.f1734g;
            if (interpolator2 == null) {
                f10 = this.f1736i;
            } else {
                f10 = interpolator2.getInterpolation(this.f1736i);
            }
            float f14 = f10;
            n nVar2 = this.f1730c;
            boolean e11 = nVar2.e(f14, nanoTime2, nVar2.f9730b, this.f1732e);
            if (this.f1736i >= 1.0f) {
                int i12 = this.f1728a;
                if (i12 != -1) {
                    this.f1730c.f9730b.setTag(i12, Long.valueOf(System.nanoTime()));
                }
                int i13 = this.f1729b;
                if (i13 != -1) {
                    this.f1730c.f9730b.setTag(i13, (Object) null);
                }
                if (!this.f1740m) {
                    this.f1733f.f1745e.add(this);
                }
            }
            if (this.f1736i < 1.0f || e11) {
                this.f1733f.f1741a.invalidate();
            }
        }

        public final void b() {
            float f10;
            this.f1735h = true;
            int i10 = this.f1731d;
            if (i10 != -1) {
                if (i10 == 0) {
                    f10 = Float.MAX_VALUE;
                } else {
                    f10 = 1.0f / ((float) i10);
                }
                this.f1737j = f10;
            }
            this.f1733f.f1741a.invalidate();
            this.f1738k = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f1708b = r0
            r1 = 0
            r9.f1709c = r1
            r9.f1710d = r1
            r9.f1714h = r0
            r9.f1715i = r0
            r9.f1718l = r1
            r2 = 0
            r9.f1719m = r2
            r9.f1720n = r0
            r9.f1722p = r0
            r9.f1723q = r0
            r9.f1724r = r0
            r9.f1725s = r0
            r9.f1726t = r0
            r9.f1727u = r0
            r9.f1721o = r10
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
        L_0x0028:
            r3 = 1
            if (r2 == r3) goto L_0x00b8
            java.lang.String r4 = "ViewTransition"
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L_0x0040
            if (r2 == r5) goto L_0x0035
            goto L_0x00a9
        L_0x0035:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            boolean r2 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x00a9
            return
        L_0x0040:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r8 = 4
            switch(r7) {
                case -1962203927: goto L_0x0073;
                case -1239391468: goto L_0x0069;
                case 61998586: goto L_0x0061;
                case 366511058: goto L_0x0057;
                case 1791837707: goto L_0x004d;
                default: goto L_0x004c;
            }     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
        L_0x004c:
            goto L_0x007d
        L_0x004d:
            java.lang.String r4 = "CustomAttribute"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = r5
            goto L_0x007e
        L_0x0057:
            java.lang.String r4 = "CustomMethod"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = r8
            goto L_0x007e
        L_0x0061:
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = r1
            goto L_0x007e
        L_0x0069:
            java.lang.String r4 = "KeyFrameSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = r3
            goto L_0x007e
        L_0x0073:
            java.lang.String r4 = "ConstraintOverride"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = r6
            goto L_0x007e
        L_0x007d:
            r2 = r0
        L_0x007e:
            if (r2 == 0) goto L_0x00a6
            if (r2 == r3) goto L_0x009e
            if (r2 == r6) goto L_0x0097
            if (r2 == r5) goto L_0x008f
            if (r2 == r8) goto L_0x008f
            f1.a.a()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x00a9
        L_0x008f:
            androidx.constraintlayout.widget.a$a r2 = r9.f1713g     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            java.util.HashMap<java.lang.String, g1.a> r2 = r2.f1953g     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            g1.a.d(r10, r11, r2)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x00a9
        L_0x0097:
            androidx.constraintlayout.widget.a$a r2 = androidx.constraintlayout.widget.a.d(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r9.f1713g = r2     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x00a9
        L_0x009e:
            f1.g r2 = new f1.g     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r9.f1712f = r2     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x00a9
        L_0x00a6:
            r9.d(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
        L_0x00a9:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x0028
        L_0x00af:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00b8
        L_0x00b4:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.c.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void a(d dVar, MotionLayout motionLayout, int i10, androidx.constraintlayout.widget.a aVar, View... viewArr) {
        androidx.constraintlayout.widget.a aVar2;
        s sVar;
        MotionLayout motionLayout2 = motionLayout;
        int i11 = i10;
        androidx.constraintlayout.widget.a aVar3 = aVar;
        View[] viewArr2 = viewArr;
        if (!this.f1709c) {
            int i12 = this.f1711e;
            Interpolator interpolator = null;
            if (i12 == 2) {
                View view = viewArr2[0];
                n nVar = new n(view);
                p pVar = nVar.f9734f;
                pVar.f9758c = 0.0f;
                pVar.f9759d = 0.0f;
                nVar.H = true;
                pVar.j(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
                nVar.f9735g.j(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
                l lVar = nVar.f9736h;
                lVar.getClass();
                view.getX();
                view.getY();
                view.getWidth();
                view.getHeight();
                lVar.c(view);
                l lVar2 = nVar.f9737i;
                lVar2.getClass();
                view.getX();
                view.getY();
                view.getWidth();
                view.getHeight();
                lVar2.c(view);
                ArrayList arrayList = this.f1712f.f9660a.get(-1);
                if (arrayList != null) {
                    nVar.f9751w.addAll(arrayList);
                }
                nVar.h(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
                int i13 = this.f1714h;
                int i14 = this.f1715i;
                int i15 = this.f1708b;
                Context context = motionLayout.getContext();
                int i16 = this.f1718l;
                if (i16 == -2) {
                    interpolator = AnimationUtils.loadInterpolator(context, this.f1720n);
                } else if (i16 == -1) {
                    sVar = new s(b1.c.c(this.f1719m));
                    new a(dVar, nVar, i13, i14, i15, sVar, this.f1722p, this.f1723q);
                    return;
                } else if (i16 == 0) {
                    interpolator = new AccelerateDecelerateInterpolator();
                } else if (i16 == 1) {
                    interpolator = new AccelerateInterpolator();
                } else if (i16 == 2) {
                    interpolator = new DecelerateInterpolator();
                } else if (i16 == 4) {
                    interpolator = new BounceInterpolator();
                } else if (i16 == 5) {
                    interpolator = new OvershootInterpolator();
                } else if (i16 == 6) {
                    interpolator = new AnticipateInterpolator();
                }
                sVar = interpolator;
                new a(dVar, nVar, i13, i14, i15, sVar, this.f1722p, this.f1723q);
                return;
            }
            if (i12 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i17 : constraintSetIds) {
                    if (i17 != i11) {
                        a aVar4 = motionLayout2.f1595x;
                        if (aVar4 == null) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar4.b(i17);
                        }
                        for (View id2 : viewArr2) {
                            a.C0016a i18 = aVar2.i(id2.getId());
                            a.C0016a aVar5 = this.f1713g;
                            if (aVar5 != null) {
                                a.C0016a.C0017a aVar6 = aVar5.f1954h;
                                if (aVar6 != null) {
                                    aVar6.e(i18);
                                }
                                i18.f1953g.putAll(this.f1713g.f1953g);
                            }
                        }
                    }
                }
            }
            androidx.constraintlayout.widget.a aVar7 = new androidx.constraintlayout.widget.a();
            aVar7.f1946f.clear();
            for (Integer next : aVar3.f1946f.keySet()) {
                a.C0016a aVar8 = aVar3.f1946f.get(next);
                if (aVar8 != null) {
                    aVar7.f1946f.put(next, aVar8.clone());
                }
            }
            for (View id3 : viewArr2) {
                a.C0016a i19 = aVar7.i(id3.getId());
                a.C0016a aVar9 = this.f1713g;
                if (aVar9 != null) {
                    a.C0016a.C0017a aVar10 = aVar9.f1954h;
                    if (aVar10 != null) {
                        aVar10.e(i19);
                    }
                    i19.f1953g.putAll(this.f1713g.f1953g);
                }
            }
            motionLayout2.F(i11, aVar7);
            int i20 = R$id.view_transition;
            motionLayout2.F(i20, aVar3);
            motionLayout2.setState(i20, -1, -1);
            a.b bVar = new a.b(motionLayout2.f1595x, i20, i11);
            for (View view2 : viewArr2) {
                int i21 = this.f1714h;
                if (i21 != -1) {
                    bVar.f1667h = Math.max(i21, 8);
                }
                bVar.f1675p = this.f1710d;
                int i22 = this.f1718l;
                String str = this.f1719m;
                int i23 = this.f1720n;
                bVar.f1664e = i22;
                bVar.f1665f = str;
                bVar.f1666g = i23;
                int id4 = view2.getId();
                g gVar = this.f1712f;
                if (gVar != null) {
                    g gVar2 = new g();
                    Iterator it = gVar.f9660a.get(-1).iterator();
                    while (it.hasNext()) {
                        d b10 = ((d) it.next()).clone();
                        b10.f9620b = id4;
                        gVar2.b(b10);
                    }
                    bVar.f1670k.add(gVar2);
                }
            }
            motionLayout2.setTransition(bVar);
            f fVar = new f(13, this, viewArr2);
            motionLayout2.r(1.0f);
            motionLayout2.C0 = fVar;
        }
    }

    public final boolean b(View view) {
        boolean z10;
        boolean z11;
        int i10 = this.f1724r;
        if (i10 != -1 && view.getTag(i10) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = this.f1725s;
        if (i11 == -1 || view.getTag(i11) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f1716j == -1 && this.f1717k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f1716j) {
            return true;
        }
        if (this.f1717k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).Y) != null && str.matches(this.f1717k)) {
            return true;
        }
        return false;
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == R$styleable.ViewTransition_android_id) {
                this.f1707a = obtainStyledAttributes.getResourceId(index, this.f1707a);
            } else if (index == R$styleable.ViewTransition_motionTarget) {
                if (MotionLayout.M0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f1716j);
                    this.f1716j = resourceId;
                    if (resourceId == -1) {
                        this.f1717k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f1717k = obtainStyledAttributes.getString(index);
                } else {
                    this.f1716j = obtainStyledAttributes.getResourceId(index, this.f1716j);
                }
            } else if (index == R$styleable.ViewTransition_onStateTransition) {
                this.f1708b = obtainStyledAttributes.getInt(index, this.f1708b);
            } else if (index == R$styleable.ViewTransition_transitionDisable) {
                this.f1709c = obtainStyledAttributes.getBoolean(index, this.f1709c);
            } else if (index == R$styleable.ViewTransition_pathMotionArc) {
                this.f1710d = obtainStyledAttributes.getInt(index, this.f1710d);
            } else if (index == R$styleable.ViewTransition_duration) {
                this.f1714h = obtainStyledAttributes.getInt(index, this.f1714h);
            } else if (index == R$styleable.ViewTransition_upDuration) {
                this.f1715i = obtainStyledAttributes.getInt(index, this.f1715i);
            } else if (index == R$styleable.ViewTransition_viewTransitionMode) {
                this.f1711e = obtainStyledAttributes.getInt(index, this.f1711e);
            } else if (index == R$styleable.ViewTransition_motionInterpolator) {
                int i11 = obtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f1720n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f1718l = -2;
                    }
                } else if (i11 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1719m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f1718l = -1;
                    } else {
                        this.f1720n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f1718l = -2;
                    }
                } else {
                    this.f1718l = obtainStyledAttributes.getInteger(index, this.f1718l);
                }
            } else if (index == R$styleable.ViewTransition_setsTag) {
                this.f1722p = obtainStyledAttributes.getResourceId(index, this.f1722p);
            } else if (index == R$styleable.ViewTransition_clearsTag) {
                this.f1723q = obtainStyledAttributes.getResourceId(index, this.f1723q);
            } else if (index == R$styleable.ViewTransition_ifTagSet) {
                this.f1724r = obtainStyledAttributes.getResourceId(index, this.f1724r);
            } else if (index == R$styleable.ViewTransition_ifTagNotSet) {
                this.f1725s = obtainStyledAttributes.getResourceId(index, this.f1725s);
            } else if (index == R$styleable.ViewTransition_SharedValueId) {
                this.f1727u = obtainStyledAttributes.getResourceId(index, this.f1727u);
            } else if (index == R$styleable.ViewTransition_SharedValue) {
                this.f1726t = obtainStyledAttributes.getInteger(index, this.f1726t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ViewTransition(");
        q10.append(f1.a.c(this.f1721o, this.f1707a));
        q10.append(")");
        return q10.toString();
    }
}
