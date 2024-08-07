package i;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import i.b;
import i.e;
import v0.i;

/* compiled from: AnimatedStateListDrawableCompat */
public final class a extends e {
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public b f10827w;

    /* renamed from: x  reason: collision with root package name */
    public f f10828x;

    /* renamed from: y  reason: collision with root package name */
    public int f10829y;

    /* renamed from: z  reason: collision with root package name */
    public int f10830z;

    /* renamed from: i.a$a  reason: collision with other inner class name */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class C0118a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f10831a;

        public C0118a(Animatable animatable) {
            this.f10831a = animatable;
        }

        public final void c() {
            this.f10831a.start();
        }

        public final void d() {
            this.f10831a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static class b extends e.a {
        public v0.e<Long> I;
        public i<Integer> J;

        public b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.I = bVar.I;
                this.J = bVar.J;
                return;
            }
            this.I = new v0.e<>();
            this.J = new i<>();
        }

        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        public final Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final j3.d f10832a;

        public c(j3.d dVar) {
            this.f10832a = dVar;
        }

        public final void c() {
            this.f10832a.start();
        }

        public final void d() {
            this.f10832a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f10833a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10834b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int i10;
            int i11;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z10) {
                i10 = numberOfFrames - 1;
            } else {
                i10 = 0;
            }
            if (z10) {
                i11 = 0;
            } else {
                i11 = numberOfFrames - 1;
            }
            e eVar = new e(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i10, i11});
            j.a.a(ofInt, true);
            ofInt.setDuration((long) eVar.f10837c);
            ofInt.setInterpolator(eVar);
            this.f10834b = z11;
            this.f10833a = ofInt;
        }

        public final boolean a() {
            return this.f10834b;
        }

        public final void b() {
            this.f10833a.reverse();
        }

        public final void c() {
            this.f10833a.start();
        }

        public final void d() {
            this.f10833a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static class e implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f10835a;

        /* renamed from: b  reason: collision with root package name */
        public int f10836b;

        /* renamed from: c  reason: collision with root package name */
        public int f10837c;

        public e(AnimationDrawable animationDrawable, boolean z10) {
            int i10;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f10836b = numberOfFrames;
            int[] iArr = this.f10835a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f10835a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f10835a;
            int i11 = 0;
            for (int i12 = 0; i12 < numberOfFrames; i12++) {
                if (z10) {
                    i10 = (numberOfFrames - i12) - 1;
                } else {
                    i10 = i12;
                }
                int duration = animationDrawable.getDuration(i10);
                iArr2[i12] = duration;
                i11 += duration;
            }
            this.f10837c = i11;
        }

        public final float getInterpolation(float f10) {
            float f11;
            int i10 = (int) ((f10 * ((float) this.f10837c)) + 0.5f);
            int i11 = this.f10836b;
            int[] iArr = this.f10835a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            if (i12 < i11) {
                f11 = ((float) i10) / ((float) this.f10837c);
            } else {
                f11 = 0.0f;
            }
            return (((float) i12) / ((float) i11)) + f11;
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static abstract class f {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    static {
        Class<a> cls = a.class;
    }

    public a() {
        this((b) null, (Resources) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0264, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r25.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i.a g(android.content.Context r21, android.content.res.Resources.Theme r22, android.content.res.Resources r23, android.util.AttributeSet r24, android.content.res.XmlResourceParser r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = r25.getName()
            java.lang.String r5 = "animated-selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0296
            i.a r4 = new i.a
            r4.<init>()
            int[] r5 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableCompat
            android.content.res.TypedArray r5 = m1.i.f(r1, r0, r2, r5)
            int r6 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableCompat_android_visible
            r7 = 1
            boolean r6 = r5.getBoolean(r6, r7)
            r4.setVisible(r6, r7)
            i.a$b r6 = r4.f10827w
            int r8 = r6.f10856d
            int r9 = j.b.b(r5)
            r8 = r8 | r9
            r6.f10856d = r8
            int r8 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableCompat_android_variablePadding
            boolean r9 = r6.f10861i
            boolean r8 = r5.getBoolean(r8, r9)
            r6.f10861i = r8
            int r8 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableCompat_android_constantSize
            boolean r9 = r6.f10864l
            boolean r8 = r5.getBoolean(r8, r9)
            r6.f10864l = r8
            int r8 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration
            int r9 = r6.f10877y
            int r8 = r5.getInt(r8, r9)
            r6.f10877y = r8
            int r8 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration
            int r9 = r6.f10878z
            int r8 = r5.getInt(r8, r9)
            r6.f10878z = r8
            int r8 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableCompat_android_dither
            boolean r6 = r6.f10875w
            boolean r6 = r5.getBoolean(r8, r6)
            r4.setDither(r6)
            i.b$c r6 = r4.f10839a
            r8 = 0
            if (r1 == 0) goto L_0x0083
            r6.f10854b = r1
            android.util.DisplayMetrics r9 = r23.getDisplayMetrics()
            int r9 = r9.densityDpi
            if (r9 != 0) goto L_0x0078
            r9 = 160(0xa0, float:2.24E-43)
        L_0x0078:
            int r10 = r6.f10855c
            r6.f10855c = r9
            if (r10 == r9) goto L_0x0086
            r6.f10865m = r8
            r6.f10862j = r8
            goto L_0x0086
        L_0x0083:
            r6.getClass()
        L_0x0086:
            r5.recycle()
            int r5 = r25.getDepth()
            int r5 = r5 + r7
            r9 = r21
            r6 = r0
            r10 = r4
        L_0x0092:
            int r11 = r25.next()
            if (r11 == r7) goto L_0x028e
            int r12 = r25.getDepth()
            if (r12 >= r5) goto L_0x00a1
            r13 = 3
            if (r11 == r13) goto L_0x028e
        L_0x00a1:
            r13 = 2
            if (r11 == r13) goto L_0x00a5
            goto L_0x0092
        L_0x00a5:
            if (r12 <= r5) goto L_0x00a8
            goto L_0x0092
        L_0x00a8:
            java.lang.String r11 = r25.getName()
            java.lang.String r12 = "item"
            boolean r11 = r11.equals(r12)
            r12 = -1
            if (r11 == 0) goto L_0x0183
            int[] r11 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableItem
            android.content.res.TypedArray r11 = m1.i.f(r1, r6, r2, r11)
            int r7 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableItem_android_id
            int r7 = r11.getResourceId(r7, r8)
            int r15 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableItem_android_drawable
            int r12 = r11.getResourceId(r15, r12)
            if (r12 <= 0) goto L_0x00d2
            androidx.appcompat.widget.d0 r15 = androidx.appcompat.widget.d0.d()
            android.graphics.drawable.Drawable r15 = r15.f(r9, r12)
            goto L_0x00d3
        L_0x00d2:
            r15 = 0
        L_0x00d3:
            r11.recycle()
            int r11 = r24.getAttributeCount()
            int[] r12 = new int[r11]
            r13 = r8
            r14 = r13
        L_0x00de:
            if (r13 >= r11) goto L_0x0109
            int r8 = r2.getAttributeNameResource(r13)
            r18 = r5
            if (r8 == 0) goto L_0x0103
            r5 = 16842960(0x10100d0, float:2.369414E-38)
            if (r8 == r5) goto L_0x0103
            r5 = 16843161(0x1010199, float:2.3694704E-38)
            if (r8 == r5) goto L_0x0103
            int r5 = r14 + 1
            r16 = r5
            r5 = 0
            boolean r19 = r2.getAttributeBooleanValue(r13, r5)
            if (r19 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            int r8 = -r8
        L_0x00ff:
            r12[r14] = r8
            r14 = r16
        L_0x0103:
            int r13 = r13 + 1
            r5 = r18
            r8 = 0
            goto L_0x00de
        L_0x0109:
            r18 = r5
            int[] r5 = android.util.StateSet.trimStateSet(r12, r14)
            java.lang.String r8 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r15 != 0) goto L_0x0151
        L_0x0113:
            int r11 = r25.next()
            r12 = 4
            if (r11 != r12) goto L_0x011b
            goto L_0x0113
        L_0x011b:
            r12 = 2
            if (r11 != r12) goto L_0x0138
            java.lang.String r11 = r25.getName()
            java.lang.String r12 = "vector"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0133
            j3.i r15 = new j3.i
            r15.<init>()
            r15.inflate(r1, r3, r2, r6)
            goto L_0x0151
        L_0x0133:
            android.graphics.drawable.Drawable r15 = j.b.a(r1, r3, r2, r6)
            goto L_0x0151
        L_0x0138:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0151:
            if (r15 == 0) goto L_0x016a
            i.a$b r8 = r10.f10827w
            int r11 = r8.a(r15)
            int[][] r12 = r8.H
            r12[r11] = r5
            v0.i<java.lang.Integer> r5 = r8.J
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.e(r11, r7)
            r13 = r21
            goto L_0x0284
        L_0x016a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0183:
            r18 = r5
            java.lang.String r5 = r25.getName()
            java.lang.String r7 = "transition"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x027e
            int[] r5 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r5 = m1.i.f(r1, r6, r2, r5)
            int r7 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition_android_fromId
            int r7 = r5.getResourceId(r7, r12)
            int r8 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition_android_toId
            int r8 = r5.getResourceId(r8, r12)
            int r11 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition_android_drawable
            int r11 = r5.getResourceId(r11, r12)
            if (r11 <= 0) goto L_0x01b4
            androidx.appcompat.widget.d0 r13 = androidx.appcompat.widget.d0.d()
            android.graphics.drawable.Drawable r15 = r13.f(r9, r11)
            goto L_0x01b5
        L_0x01b4:
            r15 = 0
        L_0x01b5:
            int r9 = androidx.appcompat.resources.R$styleable.AnimatedStateListDrawableTransition_android_reversible
            r11 = 0
            boolean r9 = r5.getBoolean(r9, r11)
            r5.recycle()
            java.lang.String r5 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r15 != 0) goto L_0x0205
        L_0x01c3:
            int r13 = r25.next()
            r14 = 4
            if (r13 != r14) goto L_0x01cb
            goto L_0x01c3
        L_0x01cb:
            r15 = 2
            if (r13 != r15) goto L_0x01ec
            java.lang.String r13 = r25.getName()
            java.lang.String r14 = "animated-vector"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x01e5
            j3.d r15 = new j3.d
            r13 = r21
            r15.<init>(r13)
            r15.inflate(r1, r3, r2, r0)
            goto L_0x0207
        L_0x01e5:
            r13 = r21
            android.graphics.drawable.Drawable r15 = j.b.a(r1, r3, r2, r6)
            goto L_0x0207
        L_0x01ec:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0205:
            r13 = r21
        L_0x0207:
            if (r15 == 0) goto L_0x0265
            if (r7 == r12) goto L_0x024a
            if (r8 == r12) goto L_0x024a
            i.a$b r5 = r10.f10827w
            int r6 = r5.a(r15)
            long r14 = (long) r7
            r7 = 32
            long r16 = r14 << r7
            long r11 = (long) r8
            long r7 = r11 | r16
            if (r9 == 0) goto L_0x0223
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0225
        L_0x0223:
            r16 = 0
        L_0x0225:
            v0.e<java.lang.Long> r10 = r5.I
            long r0 = (long) r6
            long r19 = r0 | r16
            java.lang.Long r6 = java.lang.Long.valueOf(r19)
            r10.a(r6, r7)
            if (r9 == 0) goto L_0x0280
            r6 = 32
            long r6 = r11 << r6
            long r6 = r6 | r14
            v0.e<java.lang.Long> r5 = r5.I
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 | r8
            long r0 = r0 | r16
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.a(r0, r6)
            goto L_0x0280
        L_0x024a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0265:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x027e:
            r13 = r21
        L_0x0280:
            r6 = r22
            r10 = r4
            r9 = r13
        L_0x0284:
            r0 = r22
            r1 = r23
            r5 = r18
            r7 = 1
            r8 = 0
            goto L_0x0092
        L_0x028e:
            int[] r0 = r4.getState()
            r4.onStateChange(r0)
            return r4
        L_0x0296:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.g(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):i.a");
    }

    public final b.c b() {
        return new b(this.f10827w, this, (Resources) null);
    }

    public final void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.f10827w = (b) cVar;
        }
    }

    public final e.a f() {
        return new b(this.f10827w, this, (Resources) null);
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f10828x;
        if (fVar != null) {
            fVar.d();
            this.f10828x = null;
            d(this.f10829y);
            this.f10829y = -1;
            this.f10830z = -1;
        }
    }

    public final Drawable mutate() {
        if (!this.A) {
            super.mutate();
            this.f10827w.e();
            this.A = true;
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0107, code lost:
        if (d(r1) == false) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r15) {
        /*
            r14 = this;
            i.a$b r0 = r14.f10827w
            int r1 = r0.f(r15)
            if (r1 < 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            int[] r1 = android.util.StateSet.WILD_CARD
            int r1 = r0.f(r1)
        L_0x000f:
            int r0 = r14.f10845n
            r2 = 1
            r3 = 0
            if (r1 == r0) goto L_0x010a
            i.a$f r4 = r14.f10828x
            if (r4 == 0) goto L_0x0039
            int r0 = r14.f10829y
            if (r1 != r0) goto L_0x001f
            goto L_0x00fe
        L_0x001f:
            int r0 = r14.f10830z
            if (r1 != r0) goto L_0x0034
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0034
            r4.b()
            int r0 = r14.f10830z
            r14.f10829y = r0
            r14.f10830z = r1
            goto L_0x00fe
        L_0x0034:
            int r0 = r14.f10829y
            r4.d()
        L_0x0039:
            r4 = 0
            r14.f10828x = r4
            r4 = -1
            r14.f10830z = r4
            r14.f10829y = r4
            i.a$b r4 = r14.f10827w
            if (r0 >= 0) goto L_0x004a
            r4.getClass()
            r5 = r3
            goto L_0x005a
        L_0x004a:
            v0.i<java.lang.Integer> r5 = r4.J
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r5.c(r0, r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x005a:
            if (r1 >= 0) goto L_0x005e
            r6 = r3
            goto L_0x006e
        L_0x005e:
            v0.i<java.lang.Integer> r6 = r4.J
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r6.c(r1, r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        L_0x006e:
            if (r6 == 0) goto L_0x0100
            if (r5 != 0) goto L_0x0074
            goto L_0x0100
        L_0x0074:
            long r7 = (long) r5
            r5 = 32
            long r7 = r7 << r5
            long r5 = (long) r6
            long r5 = r5 | r7
            v0.e<java.lang.Long> r7 = r4.I
            r8 = -1
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            java.lang.Object r7 = r7.f(r10, r5)
            java.lang.Long r7 = (java.lang.Long) r7
            long r10 = r7.longValue()
            int r7 = (int) r10
            if (r7 >= 0) goto L_0x0091
            goto L_0x0100
        L_0x0091:
            v0.e<java.lang.Long> r10 = r4.I
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
            java.lang.Object r10 = r10.f(r11, r5)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            long r10 = r10 & r12
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x00af
            r10 = r2
            goto L_0x00b0
        L_0x00af:
            r10 = r3
        L_0x00b0:
            r14.d(r7)
            android.graphics.drawable.Drawable r7 = r14.f10841c
            boolean r11 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r11 == 0) goto L_0x00de
            v0.e<java.lang.Long> r4 = r4.I
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r4 = r4.f(r8, r5)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            long r4 = r4 & r8
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x00d5
            r4 = r2
            goto L_0x00d6
        L_0x00d5:
            r4 = r3
        L_0x00d6:
            i.a$d r5 = new i.a$d
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r4, r10)
            goto L_0x00f5
        L_0x00de:
            boolean r4 = r7 instanceof j3.d
            if (r4 == 0) goto L_0x00ea
            i.a$c r5 = new i.a$c
            j3.d r7 = (j3.d) r7
            r5.<init>(r7)
            goto L_0x00f5
        L_0x00ea:
            boolean r4 = r7 instanceof android.graphics.drawable.Animatable
            if (r4 == 0) goto L_0x0100
            i.a$a r5 = new i.a$a
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L_0x00f5:
            r5.c()
            r14.f10828x = r5
            r14.f10830z = r0
            r14.f10829y = r1
        L_0x00fe:
            r0 = r2
            goto L_0x0101
        L_0x0100:
            r0 = r3
        L_0x0101:
            if (r0 != 0) goto L_0x010b
            boolean r0 = r14.d(r1)
            if (r0 == 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r2 = r3
        L_0x010b:
            android.graphics.drawable.Drawable r0 = r14.f10841c
            if (r0 == 0) goto L_0x0114
            boolean r15 = r0.setState(r15)
            r2 = r2 | r15
        L_0x0114:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.onStateChange(int[]):boolean");
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.f10828x;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public a(b bVar, Resources resources) {
        this.f10829y = -1;
        this.f10830z = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
