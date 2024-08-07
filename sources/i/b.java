package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import i.e;
import o1.a;

/* compiled from: DrawableContainerCompat */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f10838t = 0;

    /* renamed from: a  reason: collision with root package name */
    public c f10839a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f10840b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f10841c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f10842d;

    /* renamed from: e  reason: collision with root package name */
    public int f10843e = 255;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10844f;

    /* renamed from: n  reason: collision with root package name */
    public int f10845n = -1;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10846o;

    /* renamed from: p  reason: collision with root package name */
    public a f10847p;

    /* renamed from: q  reason: collision with root package name */
    public long f10848q;

    /* renamed from: r  reason: collision with root package name */
    public long f10849r;

    /* renamed from: s  reason: collision with root package name */
    public C0119b f10850s;

    /* compiled from: DrawableContainerCompat */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10851a;

        public a(e eVar) {
            this.f10851a = eVar;
        }

        public final void run() {
            this.f10851a.a(true);
            this.f10851a.invalidateSelf();
        }
    }

    /* renamed from: i.b$b  reason: collision with other inner class name */
    /* compiled from: DrawableContainerCompat */
    public static class C0119b implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        public Drawable.Callback f10852a;

        public final void invalidateDrawable(Drawable drawable) {
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f10852a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f10852a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainerCompat */
    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;

        /* renamed from: a  reason: collision with root package name */
        public final b f10853a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f10854b;

        /* renamed from: c  reason: collision with root package name */
        public int f10855c;

        /* renamed from: d  reason: collision with root package name */
        public int f10856d;

        /* renamed from: e  reason: collision with root package name */
        public int f10857e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f10858f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f10859g;

        /* renamed from: h  reason: collision with root package name */
        public int f10860h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10861i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f10862j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f10863k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10864l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f10865m;

        /* renamed from: n  reason: collision with root package name */
        public int f10866n;

        /* renamed from: o  reason: collision with root package name */
        public int f10867o;

        /* renamed from: p  reason: collision with root package name */
        public int f10868p;

        /* renamed from: q  reason: collision with root package name */
        public int f10869q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f10870r;

        /* renamed from: s  reason: collision with root package name */
        public int f10871s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f10872t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f10873u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f10874v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f10875w = true;

        /* renamed from: x  reason: collision with root package name */
        public int f10876x;

        /* renamed from: y  reason: collision with root package name */
        public int f10877y = 0;

        /* renamed from: z  reason: collision with root package name */
        public int f10878z = 0;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            int i10;
            this.f10853a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (cVar != null) {
                resources2 = cVar.f10854b;
            } else {
                resources2 = null;
            }
            this.f10854b = resources2;
            if (cVar != null) {
                i10 = cVar.f10855c;
            } else {
                i10 = 0;
            }
            int i11 = b.f10838t;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.f10855c = i10;
            if (cVar != null) {
                this.f10856d = cVar.f10856d;
                this.f10857e = cVar.f10857e;
                this.f10873u = true;
                this.f10874v = true;
                this.f10861i = cVar.f10861i;
                this.f10864l = cVar.f10864l;
                this.f10875w = cVar.f10875w;
                this.f10876x = cVar.f10876x;
                this.f10877y = cVar.f10877y;
                this.f10878z = cVar.f10878z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                if (cVar.f10855c == i10) {
                    if (cVar.f10862j) {
                        this.f10863k = cVar.f10863k != null ? new Rect(cVar.f10863k) : rect;
                        this.f10862j = true;
                    }
                    if (cVar.f10865m) {
                        this.f10866n = cVar.f10866n;
                        this.f10867o = cVar.f10867o;
                        this.f10868p = cVar.f10868p;
                        this.f10869q = cVar.f10869q;
                        this.f10865m = true;
                    }
                }
                if (cVar.f10870r) {
                    this.f10871s = cVar.f10871s;
                    this.f10870r = true;
                }
                if (cVar.f10872t) {
                    this.f10872t = true;
                }
                Drawable[] drawableArr = cVar.f10859g;
                this.f10859g = new Drawable[drawableArr.length];
                this.f10860h = cVar.f10860h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f10858f;
                if (sparseArray != null) {
                    this.f10858f = sparseArray.clone();
                } else {
                    this.f10858f = new SparseArray<>(this.f10860h);
                }
                int i12 = this.f10860h;
                for (int i13 = 0; i13 < i12; i13++) {
                    Drawable drawable = drawableArr[i13];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f10858f.put(i13, constantState);
                        } else {
                            this.f10859g[i13] = drawableArr[i13];
                        }
                    }
                }
                return;
            }
            this.f10859g = new Drawable[10];
            this.f10860h = 0;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f10860h;
            if (i10 >= this.f10859g.length) {
                int i11 = i10 + 10;
                e.a aVar = (e.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f10859g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f10859g = drawableArr;
                int[][] iArr = new int[i11][];
                System.arraycopy(aVar.H, 0, iArr, 0, i10);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f10853a);
            this.f10859g[i10] = drawable;
            this.f10860h++;
            this.f10857e = drawable.getChangingConfigurations() | this.f10857e;
            this.f10870r = false;
            this.f10872t = false;
            this.f10863k = null;
            this.f10862j = false;
            this.f10865m = false;
            this.f10873u = false;
            return i10;
        }

        public final void b() {
            this.f10865m = true;
            c();
            int i10 = this.f10860h;
            Drawable[] drawableArr = this.f10859g;
            this.f10867o = -1;
            this.f10866n = -1;
            this.f10869q = 0;
            this.f10868p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f10866n) {
                    this.f10866n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f10867o) {
                    this.f10867o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f10868p) {
                    this.f10868p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f10869q) {
                    this.f10869q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f10858f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f10858f.keyAt(i10);
                    Drawable[] drawableArr = this.f10859g;
                    Drawable newDrawable = this.f10858f.valueAt(i10).newDrawable(this.f10854b);
                    a.c.b(newDrawable, this.f10876x);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f10853a);
                    drawableArr[keyAt] = mutate;
                }
                this.f10858f = null;
            }
        }

        public final boolean canApplyTheme() {
            int i10 = this.f10860h;
            Drawable[] drawableArr = this.f10859g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f10858f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (a.b.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.f10859g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f10858f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f10858f.valueAt(indexOfKey).newDrawable(this.f10854b);
            a.c.b(newDrawable, this.f10876x);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f10853a);
            this.f10859g[i10] = mutate;
            this.f10858f.removeAt(indexOfKey);
            if (this.f10858f.size() == 0) {
                this.f10858f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final int getChangingConfigurations() {
            return this.f10856d | this.f10857e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f10844f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f10841c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f10848q
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f10843e
            r3.setAlpha(r9)
            r13.f10848q = r7
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            i.b$c r10 = r13.f10839a
            int r10 = r10.f10877y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f10843e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.f10848q = r7
        L_0x0038:
            r3 = r6
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f10842d
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f10849r
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f10842d = r0
            r13.f10849r = r7
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$c r4 = r13.f10839a
            int r4 = r4.f10878z
            int r3 = r3 / r4
            int r4 = r13.f10843e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f10849r = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            i.b$a r14 = r13.f10847p
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f10839a;
        if (theme != null) {
            cVar.c();
            int i10 = cVar.f10860h;
            Drawable[] drawableArr = cVar.f10859g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && a.b.b(drawable)) {
                    a.b.a(drawableArr[i11], theme);
                    cVar.f10857e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                cVar.f10854b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = cVar.f10855c;
                cVar.f10855c = i12;
                if (i13 != i12) {
                    cVar.f10865m = false;
                    cVar.f10862j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f10850s == null) {
            this.f10850s = new C0119b();
        }
        C0119b bVar = this.f10850s;
        bVar.f10852a = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f10839a.f10877y <= 0 && this.f10844f) {
                drawable.setAlpha(this.f10843e);
            }
            c cVar = this.f10839a;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    a.b.h(drawable, cVar.D);
                }
                c cVar2 = this.f10839a;
                if (cVar2.G) {
                    a.b.i(drawable, cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10839a.f10875w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            a.c.b(drawable, a.c.a(this));
            a.C0166a.e(drawable, this.f10839a.A);
            Rect rect = this.f10840b;
            if (rect != null) {
                a.b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0119b bVar2 = this.f10850s;
            Drawable.Callback callback = bVar2.f10852a;
            bVar2.f10852a = null;
            drawable.setCallback(callback);
        }
    }

    public final boolean canApplyTheme() {
        return this.f10839a.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f10845n
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$c r0 = r9.f10839a
            int r0 = r0.f10878z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f10842d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f10841c
            if (r0 == 0) goto L_0x0029
            r9.f10842d = r0
            i.b$c r0 = r9.f10839a
            int r0 = r0.f10878z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f10849r = r0
            goto L_0x0035
        L_0x0029:
            r9.f10842d = r4
            r9.f10849r = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f10841c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            i.b$c r0 = r9.f10839a
            int r1 = r0.f10860h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f10841c = r0
            r9.f10845n = r10
            if (r0 == 0) goto L_0x005a
            i.b$c r10 = r9.f10839a
            int r10 = r10.f10877y
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f10848q = r2
        L_0x0051:
            r9.c(r0)
            goto L_0x005a
        L_0x0055:
            r9.f10841c = r4
            r10 = -1
            r9.f10845n = r10
        L_0x005a:
            long r0 = r9.f10848q
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.f10849r
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x007c
        L_0x0067:
            i.b$a r10 = r9.f10847p
            if (r10 != 0) goto L_0x0076
            i.b$a r10 = new i.b$a
            r1 = r9
            i.e r1 = (i.e) r1
            r10.<init>(r1)
            r9.f10847p = r10
            goto L_0x0079
        L_0x0076:
            r9.unscheduleSelf(r10)
        L_0x0079:
            r9.a(r0)
        L_0x007c:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.d(int):boolean");
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10841c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f10842d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    public final int getAlpha() {
        return this.f10843e;
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f10839a;
        return changingConfigurations | cVar.f10857e | cVar.f10856d;
    }

    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f10839a;
        boolean z10 = true;
        if (!cVar.f10873u) {
            cVar.c();
            cVar.f10873u = true;
            int i10 = cVar.f10860h;
            Drawable[] drawableArr = cVar.f10859g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    cVar.f10874v = true;
                    break;
                } else if (drawableArr[i11].getConstantState() == null) {
                    cVar.f10874v = false;
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            z10 = cVar.f10874v;
        }
        if (!z10) {
            return null;
        }
        this.f10839a.f10856d = getChangingConfigurations();
        return this.f10839a;
    }

    public final Drawable getCurrent() {
        return this.f10841c;
    }

    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f10840b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public final int getIntrinsicHeight() {
        c cVar = this.f10839a;
        if (cVar.f10864l) {
            if (!cVar.f10865m) {
                cVar.b();
            }
            return cVar.f10867o;
        }
        Drawable drawable = this.f10841c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        c cVar = this.f10839a;
        if (cVar.f10864l) {
            if (!cVar.f10865m) {
                cVar.b();
            }
            return cVar.f10866n;
        }
        Drawable drawable = this.f10841c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public final int getMinimumHeight() {
        c cVar = this.f10839a;
        if (cVar.f10864l) {
            if (!cVar.f10865m) {
                cVar.b();
            }
            return cVar.f10869q;
        }
        Drawable drawable = this.f10841c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public final int getMinimumWidth() {
        c cVar = this.f10839a;
        if (cVar.f10864l) {
            if (!cVar.f10865m) {
                cVar.b();
            }
            return cVar.f10868p;
        }
        Drawable drawable = this.f10841c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public final int getOpacity() {
        Drawable drawable = this.f10841c;
        int i10 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f10839a;
        if (cVar.f10870r) {
            return cVar.f10871s;
        }
        cVar.c();
        int i11 = cVar.f10860h;
        Drawable[] drawableArr = cVar.f10859g;
        if (i11 > 0) {
            i10 = drawableArr[0].getOpacity();
        }
        for (int i12 = 1; i12 < i11; i12++) {
            i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
        }
        cVar.f10871s = i10;
        cVar.f10870r = true;
        return i10;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable = this.f10841c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public final boolean getPadding(Rect rect) {
        boolean z10;
        c cVar = this.f10839a;
        Rect rect2 = null;
        boolean z11 = false;
        if (!cVar.f10861i) {
            Rect rect3 = cVar.f10863k;
            if (rect3 != null || cVar.f10862j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f10860h;
                Drawable[] drawableArr = cVar.f10859g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f10862j = true;
                cVar.f10863k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            Drawable drawable = this.f10841c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f10839a.A && a.c.a(this) == 1) {
            z11 = true;
        }
        if (z11) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z10;
    }

    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f10839a;
        if (cVar != null) {
            cVar.f10870r = false;
            cVar.f10872t = false;
        }
        if (drawable == this.f10841c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final boolean isAutoMirrored() {
        return this.f10839a.A;
    }

    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f10842d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f10842d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f10841c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f10844f) {
                this.f10841c.setAlpha(this.f10843e);
            }
        }
        if (this.f10849r != 0) {
            this.f10849r = 0;
            z10 = true;
        }
        if (this.f10848q != 0) {
            this.f10848q = 0;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f10846o && super.mutate() == this) {
            c b10 = b();
            b10.e();
            e(b10);
            this.f10846o = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10842d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f10841c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i10) {
        c cVar = this.f10839a;
        int i11 = this.f10845n;
        int i12 = cVar.f10860h;
        Drawable[] drawableArr = cVar.f10859g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean b10 = a.c.b(drawable, i10);
                if (i13 == i11) {
                    z10 = b10;
                }
            }
        }
        cVar.f10876x = i10;
        return z10;
    }

    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f10842d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f10841c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10842d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f10841c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f10841c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i10) {
        if (!this.f10844f || this.f10843e != i10) {
            this.f10844f = true;
            this.f10843e = i10;
            Drawable drawable = this.f10841c;
            if (drawable == null) {
                return;
            }
            if (this.f10848q == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f10839a;
        if (cVar.A != z10) {
            cVar.A = z10;
            Drawable drawable = this.f10841c;
            if (drawable != null) {
                a.C0166a.e(drawable, z10);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f10839a;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.f10841c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public final void setDither(boolean z10) {
        c cVar = this.f10839a;
        if (cVar.f10875w != z10) {
            cVar.f10875w = z10;
            Drawable drawable = this.f10841c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f10841c;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
    }

    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f10840b;
        if (rect == null) {
            this.f10840b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f10841c;
        if (drawable != null) {
            a.b.f(drawable, i10, i11, i12, i13);
        }
    }

    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f10839a;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            o1.a.b(this.f10841c, colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f10839a;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            o1.a.c(this.f10841c, mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f10842d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f10841c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f10841c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
