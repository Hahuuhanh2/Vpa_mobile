package com.smarteist.autoimageslider.IndicatorView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.smarteist.autoimageslider.IndicatorView.a;
import com.smarteist.autoimageslider.IndicatorView.draw.data.PositionSavedState;
import com.smarteist.autoimageslider.R$styleable;
import com.smarteist.autoimageslider.SliderPager;
import java.util.ArrayList;
import java.util.Locale;
import u1.g;
import vf.f;
import xf.a;
import yf.b;
import yf.c;
import z.d;

public class PageIndicatorView extends View implements SliderPager.i, a.C0260a, SliderPager.h {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f19268e = 0;

    /* renamed from: a  reason: collision with root package name */
    public a f19269a;

    /* renamed from: b  reason: collision with root package name */
    public qf.a f19270b;

    /* renamed from: c  reason: collision with root package name */
    public SliderPager f19271c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19272d;

    public PageIndicatorView(Context context) {
        super(context);
        f((AttributeSet) null);
    }

    public final void a(float f10, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        yf.a a10 = this.f19269a.a();
        f a11 = a10.a();
        boolean z14 = a10.f23517m;
        boolean z15 = false;
        if (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !z14 || a11 == f.NONE) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            boolean g2 = g();
            int i11 = a10.f23521q;
            int i12 = a10.f23522r;
            if (g2) {
                i10 = (i11 - 1) - i10;
            }
            if (i10 < 0) {
                i10 = 0;
            } else {
                int i13 = i11 - 1;
                if (i10 > i13) {
                    i10 = i13;
                }
            }
            if (i10 > i12) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!g2 ? i10 + 1 >= i12 : i10 - 1 >= i12) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z12 || z13) {
                a10.f23522r = i10;
                i12 = i10;
            }
            float f11 = 0.0f;
            if (i12 == i10 && f10 != 0.0f) {
                z15 = true;
            }
            if (!z15) {
                f10 = 1.0f - f10;
            } else if (g2) {
                i10--;
            } else {
                i10++;
            }
            if (f10 > 1.0f) {
                f11 = 1.0f;
            } else if (f10 >= 0.0f) {
                f11 = f10;
            }
            Pair pair = new Pair(Integer.valueOf(i10), Float.valueOf(f11));
            setProgress(((Integer) pair.first).intValue(), ((Float) pair.second).floatValue());
        }
    }

    public final void b(int i10) {
        if (i10 == 0) {
            this.f19269a.a().f23517m = this.f19272d;
        }
    }

    public final void c(int i10) {
        boolean z10;
        yf.a a10 = this.f19269a.a();
        if (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = a10.f23521q;
        if (z10) {
            if (g()) {
                i10 = (i11 - 1) - i10;
            }
            setSelection(i10);
        }
    }

    public final void d() {
        i();
    }

    public final void e(ViewParent viewParent) {
        boolean z10;
        KeyEvent.Callback findViewById;
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int i10 = this.f19269a.a().f23525u;
            ViewGroup viewGroup = (ViewGroup) viewParent;
            SliderPager sliderPager = null;
            if (viewGroup.getChildCount() > 0 && (findViewById = viewGroup.findViewById(i10)) != null && (findViewById instanceof SliderPager)) {
                sliderPager = (SliderPager) findViewById;
            }
            if (sliderPager != null) {
                setViewPager(sliderPager);
            } else {
                e(viewParent.getParent());
            }
        }
    }

    public final void f(AttributeSet attributeSet) {
        int i10;
        if (getId() == -1) {
            int i11 = bg.a.f19119a;
            setId(View.generateViewId());
        }
        a aVar = new a(this);
        this.f19269a = aVar;
        wf.a aVar2 = aVar.f19273a;
        Context context = getContext();
        d dVar = aVar2.f23378d;
        dVar.getClass();
        f fVar = f.FILL;
        int i12 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PageIndicatorView, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.PageIndicatorView_piv_viewPager, -1);
        boolean z10 = obtainStyledAttributes.getBoolean(R$styleable.PageIndicatorView_piv_autoVisibility, true);
        boolean z11 = obtainStyledAttributes.getBoolean(R$styleable.PageIndicatorView_piv_dynamicCount, false);
        int i13 = obtainStyledAttributes.getInt(R$styleable.PageIndicatorView_piv_count, -1);
        if (i13 == -1) {
            i13 = 3;
        }
        int i14 = obtainStyledAttributes.getInt(R$styleable.PageIndicatorView_piv_select, 0);
        if (i14 < 0) {
            i14 = 0;
        } else if (i13 > 0 && i14 > i13 - 1) {
            i14 = i10;
        }
        yf.a aVar3 = (yf.a) dVar.f17746a;
        aVar3.f23525u = resourceId;
        aVar3.f23518n = z10;
        aVar3.f23519o = z11;
        aVar3.f23521q = i13;
        aVar3.f23522r = i14;
        aVar3.f23523s = i14;
        aVar3.f23524t = i14;
        int color = obtainStyledAttributes.getColor(R$styleable.PageIndicatorView_piv_unselectedColor, Color.parseColor("#33ffffff"));
        int color2 = obtainStyledAttributes.getColor(R$styleable.PageIndicatorView_piv_selectedColor, Color.parseColor("#ffffff"));
        yf.a aVar4 = (yf.a) dVar.f17746a;
        aVar4.f23515k = color;
        aVar4.f23516l = color2;
        boolean z12 = obtainStyledAttributes.getBoolean(R$styleable.PageIndicatorView_piv_interactiveAnimation, false);
        int i15 = obtainStyledAttributes.getInt(R$styleable.PageIndicatorView_piv_animationDuration, 350);
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = R$styleable.PageIndicatorView_piv_animationType;
        f fVar2 = f.NONE;
        switch (obtainStyledAttributes.getInt(i16, 0)) {
            case 1:
                fVar2 = f.COLOR;
                break;
            case 2:
                fVar2 = f.SCALE;
                break;
            case 3:
                fVar2 = f.WORM;
                break;
            case 4:
                fVar2 = f.SLIDE;
                break;
            case 5:
                fVar2 = fVar;
                break;
            case 6:
                fVar2 = f.THIN_WORM;
                break;
            case 7:
                fVar2 = f.DROP;
                break;
            case 8:
                fVar2 = f.SWAP;
                break;
            case 9:
                fVar2 = f.SCALE_DOWN;
                break;
        }
        int i17 = obtainStyledAttributes.getInt(R$styleable.PageIndicatorView_piv_rtl_mode, 1);
        c cVar = c.Auto;
        if (i17 == 0) {
            cVar = c.On;
        } else if (i17 == 1) {
            cVar = c.Off;
        }
        yf.a aVar5 = (yf.a) dVar.f17746a;
        aVar5.f23520p = (long) i15;
        aVar5.f23517m = z12;
        aVar5.f23527w = fVar2;
        aVar5.f23528x = cVar;
        int i18 = R$styleable.PageIndicatorView_piv_orientation;
        b bVar = b.HORIZONTAL;
        if (obtainStyledAttributes.getInt(i18, 0) != 0) {
            bVar = b.VERTICAL;
        }
        int dimension = (int) obtainStyledAttributes.getDimension(R$styleable.PageIndicatorView_piv_radius, (float) j7.a.z(6));
        if (dimension < 0) {
            dimension = 0;
        }
        int dimension2 = (int) obtainStyledAttributes.getDimension(R$styleable.PageIndicatorView_piv_padding, (float) j7.a.z(8));
        if (dimension2 < 0) {
            dimension2 = 0;
        }
        float f10 = obtainStyledAttributes.getFloat(R$styleable.PageIndicatorView_piv_scaleFactor, 0.7f);
        if (f10 < 0.3f) {
            f10 = 0.3f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        int dimension3 = (int) obtainStyledAttributes.getDimension(R$styleable.PageIndicatorView_piv_strokeWidth, (float) j7.a.z(1));
        if (dimension3 > dimension) {
            dimension3 = dimension;
        }
        if (((yf.a) dVar.f17746a).a() == fVar) {
            i12 = dimension3;
        }
        yf.a aVar6 = (yf.a) dVar.f17746a;
        aVar6.f23507c = dimension;
        aVar6.f23526v = bVar;
        aVar6.f23508d = dimension2;
        aVar6.f23514j = f10;
        aVar6.f23513i = i12;
        obtainStyledAttributes.recycle();
        yf.a a10 = this.f19269a.a();
        a10.f23509e = getPaddingLeft();
        a10.f23510f = getPaddingTop();
        a10.f23511g = getPaddingRight();
        a10.f23512h = getPaddingBottom();
        this.f19272d = a10.f23517m;
    }

    public final boolean g() {
        yf.a a10 = this.f19269a.a();
        if (a10.f23528x == null) {
            a10.f23528x = c.Off;
        }
        int ordinal = a10.f23528x.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return false;
        }
        Locale locale = getContext().getResources().getConfiguration().locale;
        int i10 = g.f15063a;
        if (g.a.a(locale) == 1) {
            return true;
        }
        return false;
    }

    public long getAnimationDuration() {
        return this.f19269a.a().f23520p;
    }

    public int getCount() {
        return this.f19269a.a().f23521q;
    }

    public int getPadding() {
        return this.f19269a.a().f23508d;
    }

    public int getRadius() {
        return this.f19269a.a().f23507c;
    }

    public float getScaleFactor() {
        return this.f19269a.a().f23514j;
    }

    public int getSelectedColor() {
        return this.f19269a.a().f23516l;
    }

    public int getSelection() {
        return this.f19269a.a().f23522r;
    }

    public int getStrokeWidth() {
        return this.f19269a.a().f23513i;
    }

    public int getUnselectedColor() {
        return this.f19269a.a().f23515k;
    }

    public final void h() {
        SliderPager sliderPager;
        if (this.f19270b != null && (sliderPager = this.f19271c) != null && sliderPager.getAdapter() != null) {
            try {
                this.f19271c.getAdapter().o(this.f19270b);
                this.f19270b = null;
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void i() {
        int i10;
        vf.a aVar;
        T t10;
        SliderPager sliderPager = this.f19271c;
        if (sliderPager != null && sliderPager.getAdapter() != null) {
            if (!(this.f19271c.getAdapter() instanceof cg.a)) {
                this.f19271c.getAdapter().c();
                i10 = this.f19271c.getCurrentItem();
            } else {
                ((cg.a) this.f19271c.getAdapter()).getClass();
                try {
                    throw null;
                } catch (Exception unused) {
                    i10 = 0;
                }
            }
            if (g()) {
                i10 = -1 - i10;
            }
            this.f19269a.a().f23522r = i10;
            this.f19269a.a().f23523s = i10;
            this.f19269a.a().f23524t = i10;
            this.f19269a.a().f23521q = 0;
            sf.a aVar2 = this.f19269a.f19274b.f22765a;
            if (!(aVar2 == null || (aVar = aVar2.f22852c) == null || (t10 = aVar.f23261c) == null || !t10.isStarted())) {
                aVar.f23261c.end();
            }
            j();
            requestLayout();
        }
    }

    public final void j() {
        if (this.f19269a.a().f23518n) {
            int i10 = this.f19269a.a().f23521q;
            int visibility = getVisibility();
            if (visibility != 0 && i10 > 1) {
                setVisibility(0);
            } else if (visibility != 4 && i10 <= 1) {
                setVisibility(4);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e(getParent());
    }

    public final void onDetachedFromWindow() {
        h();
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r6 = r19
            vf.f r7 = vf.f.DROP
            yf.b r8 = yf.b.HORIZONTAL
            r9 = r18
            com.smarteist.autoimageslider.IndicatorView.a r0 = r9.f19269a
            wf.a r0 = r0.f19273a
            xf.a r10 = r0.f23376b
            yf.a r0 = r10.f23446c
            int r11 = r0.f23521q
            r13 = 0
        L_0x0013:
            if (r13 >= r11) goto L_0x0289
            yf.a r0 = r10.f23446c
            if (r0 != 0) goto L_0x001b
            r1 = 0
            goto L_0x0033
        L_0x001b:
            yf.b r1 = r0.b()
            if (r1 != r8) goto L_0x0026
            int r1 = p3.l0.b0(r0, r13)
            goto L_0x0030
        L_0x0026:
            int r1 = r0.f23507c
            vf.f r2 = r0.a()
            if (r2 != r7) goto L_0x0030
            int r1 = r1 * 3
        L_0x0030:
            int r0 = r0.f23509e
            int r1 = r1 + r0
        L_0x0033:
            yf.a r0 = r10.f23446c
            if (r0 != 0) goto L_0x0039
            r2 = 0
            goto L_0x0051
        L_0x0039:
            yf.b r2 = r0.b()
            if (r2 != r8) goto L_0x004a
            int r2 = r0.f23507c
            vf.f r3 = r0.a()
            if (r3 != r7) goto L_0x004e
            int r2 = r2 * 3
            goto L_0x004e
        L_0x004a:
            int r2 = p3.l0.b0(r0, r13)
        L_0x004e:
            int r0 = r0.f23510f
            int r2 = r2 + r0
        L_0x0051:
            yf.a r0 = r10.f23446c
            boolean r3 = r0.f23517m
            int r4 = r0.f23522r
            int r5 = r0.f23523s
            int r14 = r0.f23524t
            r15 = 1
            if (r3 != 0) goto L_0x0064
            if (r13 == r4) goto L_0x0062
            if (r13 != r14) goto L_0x0064
        L_0x0062:
            r14 = r15
            goto L_0x0065
        L_0x0064:
            r14 = 0
        L_0x0065:
            if (r3 == 0) goto L_0x006d
            if (r13 == r4) goto L_0x006b
            if (r13 != r5) goto L_0x006d
        L_0x006b:
            r3 = r15
            goto L_0x006e
        L_0x006d:
            r3 = 0
        L_0x006e:
            r3 = r3 | r14
            zf.a r4 = r10.f23445b
            r4.f23612k = r13
            r4.f23613l = r1
            r4.f23614m = r2
            tf.a r1 = r10.f23444a
            if (r1 == 0) goto L_0x027c
            if (r3 == 0) goto L_0x027c
            vf.f r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0274;
                case 1: goto L_0x025d;
                case 2: goto L_0x0246;
                case 3: goto L_0x01d5;
                case 4: goto L_0x01c2;
                case 5: goto L_0x013d;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00a0;
                case 9: goto L_0x008a;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x0139
        L_0x008a:
            zf.a r0 = r10.f23445b
            tf.a r2 = r10.f23444a
            ag.d r1 = r0.f23611j
            if (r1 == 0) goto L_0x0139
            int r3 = r0.f23612k
            int r4 = r0.f23613l
            int r5 = r0.f23614m
            r0 = r1
            r1 = r19
            r0.o(r1, r2, r3, r4, r5)
            goto L_0x0139
        L_0x00a0:
            zf.a r0 = r10.f23445b
            tf.a r2 = r10.f23444a
            ag.d r1 = r0.f23610i
            if (r1 == 0) goto L_0x0139
            int r3 = r0.f23612k
            int r4 = r0.f23613l
            int r5 = r0.f23614m
            r0 = r1
            r1 = r19
            r0.o(r1, r2, r3, r4, r5)
            goto L_0x0139
        L_0x00b6:
            zf.a r0 = r10.f23445b
            tf.a r1 = r10.f23444a
            ag.b r2 = r0.f23609h
            if (r2 == 0) goto L_0x0139
            int r3 = r0.f23613l
            int r0 = r0.f23614m
            r2.o(r6, r1, r3, r0)
            goto L_0x0139
        L_0x00c6:
            zf.a r0 = r10.f23445b
            tf.a r1 = r10.f23444a
            ag.e r2 = r0.f23608g
            if (r2 == 0) goto L_0x0139
            int r3 = r0.f23613l
            int r0 = r0.f23614m
            boolean r4 = r1 instanceof uf.g
            if (r4 != 0) goto L_0x00d7
            goto L_0x0139
        L_0x00d7:
            uf.g r1 = (uf.g) r1
            int r4 = r1.f23041a
            int r5 = r1.f23042b
            int r1 = r1.f23040c
            int r1 = r1 / 2
            java.lang.Object r14 = r2.f17387b
            yf.a r14 = (yf.a) r14
            int r15 = r14.f23507c
            int r12 = r14.f23515k
            r16 = r7
            int r7 = r14.f23516l
            yf.b r14 = r14.b()
            if (r14 != r8) goto L_0x0105
            android.graphics.RectF r14 = r2.f18955c
            float r4 = (float) r4
            r14.left = r4
            float r4 = (float) r5
            r14.right = r4
            int r4 = r0 - r1
            float r4 = (float) r4
            r14.top = r4
            int r1 = r1 + r0
            float r1 = (float) r1
            r14.bottom = r1
            goto L_0x0116
        L_0x0105:
            android.graphics.RectF r14 = r2.f18955c
            int r9 = r3 - r1
            float r9 = (float) r9
            r14.left = r9
            int r1 = r1 + r3
            float r1 = (float) r1
            r14.right = r1
            float r1 = (float) r4
            r14.top = r1
            float r1 = (float) r5
            r14.bottom = r1
        L_0x0116:
            java.lang.Object r1 = r2.f17386a
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r1.setColor(r12)
            float r1 = (float) r3
            float r0 = (float) r0
            float r3 = (float) r15
            java.lang.Object r4 = r2.f17386a
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r6.drawCircle(r1, r0, r3, r4)
            java.lang.Object r0 = r2.f17386a
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r7)
            android.graphics.RectF r0 = r2.f18955c
            java.lang.Object r1 = r2.f17386a
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r6.drawRoundRect(r0, r3, r3, r1)
            goto L_0x0281
        L_0x0139:
            r16 = r7
            goto L_0x0281
        L_0x013d:
            r16 = r7
            zf.a r0 = r10.f23445b
            tf.a r1 = r10.f23444a
            ag.c r2 = r0.f23607f
            if (r2 == 0) goto L_0x0281
            int r3 = r0.f23612k
            int r4 = r0.f23613l
            int r0 = r0.f23614m
            boolean r5 = r1 instanceof uf.c
            if (r5 != 0) goto L_0x0153
            goto L_0x0281
        L_0x0153:
            uf.c r1 = (uf.c) r1
            java.lang.Object r5 = r2.f17387b
            yf.a r5 = (yf.a) r5
            int r7 = r5.f23515k
            int r9 = r5.f23507c
            float r9 = (float) r9
            int r12 = r5.f23513i
            int r14 = r5.f23522r
            int r15 = r5.f23523s
            r17 = r7
            int r7 = r5.f23524t
            boolean r5 = r5.f23517m
            if (r5 == 0) goto L_0x0180
            if (r3 != r15) goto L_0x0176
            int r7 = r1.f23026a
            int r3 = r1.f23031c
            float r9 = (float) r3
            int r12 = r1.f23033e
            goto L_0x0196
        L_0x0176:
            if (r3 != r14) goto L_0x0194
            int r7 = r1.f23027b
            int r3 = r1.f23032d
            float r9 = (float) r3
            int r12 = r1.f23034f
            goto L_0x0196
        L_0x0180:
            if (r3 != r14) goto L_0x018a
            int r7 = r1.f23026a
            int r3 = r1.f23031c
            float r9 = (float) r3
            int r12 = r1.f23033e
            goto L_0x0196
        L_0x018a:
            if (r3 != r7) goto L_0x0194
            int r7 = r1.f23027b
            int r3 = r1.f23032d
            float r9 = (float) r3
            int r12 = r1.f23034f
            goto L_0x0196
        L_0x0194:
            r7 = r17
        L_0x0196:
            android.graphics.Paint r1 = r2.f18953c
            r1.setColor(r7)
            android.graphics.Paint r1 = r2.f18953c
            java.lang.Object r3 = r2.f17387b
            yf.a r3 = (yf.a) r3
            int r3 = r3.f23513i
            float r3 = (float) r3
            r1.setStrokeWidth(r3)
            float r1 = (float) r4
            float r0 = (float) r0
            java.lang.Object r3 = r2.f17387b
            yf.a r3 = (yf.a) r3
            int r3 = r3.f23507c
            float r3 = (float) r3
            android.graphics.Paint r4 = r2.f18953c
            r6.drawCircle(r1, r0, r3, r4)
            android.graphics.Paint r3 = r2.f18953c
            float r4 = (float) r12
            r3.setStrokeWidth(r4)
            android.graphics.Paint r2 = r2.f18953c
            r6.drawCircle(r1, r0, r9, r2)
            goto L_0x0281
        L_0x01c2:
            r16 = r7
            zf.a r0 = r10.f23445b
            tf.a r1 = r10.f23444a
            ag.b r2 = r0.f23606e
            if (r2 == 0) goto L_0x0281
            int r3 = r0.f23613l
            int r0 = r0.f23614m
            r2.o(r6, r1, r3, r0)
            goto L_0x0281
        L_0x01d5:
            r16 = r7
            zf.a r0 = r10.f23445b
            tf.a r1 = r10.f23444a
            ag.f r2 = r0.f23605d
            if (r2 == 0) goto L_0x0281
            int r3 = r0.f23613l
            int r0 = r0.f23614m
            boolean r4 = r1 instanceof uf.h
            if (r4 != 0) goto L_0x01e9
            goto L_0x0281
        L_0x01e9:
            uf.h r1 = (uf.h) r1
            int r4 = r1.f23041a
            int r1 = r1.f23042b
            java.lang.Object r5 = r2.f17387b
            yf.a r5 = (yf.a) r5
            int r7 = r5.f23507c
            int r9 = r5.f23515k
            int r12 = r5.f23516l
            yf.b r5 = r5.b()
            if (r5 != r8) goto L_0x0212
            android.graphics.RectF r5 = r2.f18955c
            float r4 = (float) r4
            r5.left = r4
            float r1 = (float) r1
            r5.right = r1
            int r1 = r0 - r7
            float r1 = (float) r1
            r5.top = r1
            int r1 = r0 + r7
            float r1 = (float) r1
            r5.bottom = r1
            goto L_0x0224
        L_0x0212:
            android.graphics.RectF r5 = r2.f18955c
            int r14 = r3 - r7
            float r14 = (float) r14
            r5.left = r14
            int r14 = r3 + r7
            float r14 = (float) r14
            r5.right = r14
            float r4 = (float) r4
            r5.top = r4
            float r1 = (float) r1
            r5.bottom = r1
        L_0x0224:
            java.lang.Object r1 = r2.f17386a
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r1.setColor(r9)
            float r1 = (float) r3
            float r0 = (float) r0
            float r3 = (float) r7
            java.lang.Object r4 = r2.f17386a
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r6.drawCircle(r1, r0, r3, r4)
            java.lang.Object r0 = r2.f17386a
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r12)
            android.graphics.RectF r0 = r2.f18955c
            java.lang.Object r1 = r2.f17386a
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r6.drawRoundRect(r0, r3, r3, r1)
            goto L_0x0281
        L_0x0246:
            r16 = r7
            zf.a r0 = r10.f23445b
            tf.a r2 = r10.f23444a
            ag.b r1 = r0.f23604c
            if (r1 == 0) goto L_0x0281
            int r3 = r0.f23612k
            int r4 = r0.f23613l
            int r5 = r0.f23614m
            r0 = r1
            r1 = r19
            r0.p(r1, r2, r3, r4, r5)
            goto L_0x0281
        L_0x025d:
            r16 = r7
            zf.a r0 = r10.f23445b
            tf.a r2 = r10.f23444a
            ag.b r1 = r0.f23603b
            if (r1 == 0) goto L_0x0281
            int r3 = r0.f23612k
            int r4 = r0.f23613l
            int r5 = r0.f23614m
            r0 = r1
            r1 = r19
            r0.p(r1, r2, r3, r4, r5)
            goto L_0x0281
        L_0x0274:
            r16 = r7
            zf.a r0 = r10.f23445b
            r0.a(r6, r15)
            goto L_0x0281
        L_0x027c:
            r16 = r7
            r4.a(r6, r3)
        L_0x0281:
            int r13 = r13 + 1
            r9 = r18
            r7 = r16
            goto L_0x0013
        L_0x0289:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smarteist.autoimageslider.IndicatorView.PageIndicatorView.onDraw(android.graphics.Canvas):void");
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        wf.a aVar = this.f19269a.f19273a;
        xf.b bVar = aVar.f23377c;
        yf.a aVar2 = aVar.f23375a;
        bVar.getClass();
        b bVar2 = b.HORIZONTAL;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i14 = aVar2.f23521q;
        int i15 = aVar2.f23507c;
        int i16 = aVar2.f23513i;
        int i17 = aVar2.f23508d;
        int i18 = aVar2.f23509e;
        int i19 = aVar2.f23510f;
        int i20 = aVar2.f23511g;
        int i21 = aVar2.f23512h;
        int i22 = i15 * 2;
        b b10 = aVar2.b();
        if (i14 != 0) {
            i12 = (i22 * i14) + (i16 * 2 * i14) + ((i14 - 1) * i17);
            i13 = i22 + i16;
            if (b10 != bVar2) {
                int i23 = i12;
                i12 = i13;
                i13 = i23;
            }
        } else {
            i13 = 0;
            i12 = 0;
        }
        if (aVar2.a() == f.DROP) {
            if (b10 == bVar2) {
                i13 *= 2;
            } else {
                i12 *= 2;
            }
        }
        int i24 = i12 + i18 + i20;
        int i25 = i13 + i19 + i21;
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(i24, size);
            } else {
                size = i24;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i25, size2);
            } else {
                size2 = i25;
            }
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 < 0) {
            size2 = 0;
        }
        aVar2.f23506b = size;
        aVar2.f23505a = size2;
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(size2));
        setMeasuredDimension(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof PositionSavedState) {
            yf.a a10 = this.f19269a.a();
            PositionSavedState positionSavedState = (PositionSavedState) parcelable;
            a10.f23522r = positionSavedState.f19276a;
            a10.f23523s = positionSavedState.f19277b;
            a10.f23524t = positionSavedState.f19278c;
            super.onRestoreInstanceState(positionSavedState.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        yf.a a10 = this.f19269a.a();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.f19276a = a10.f23522r;
        positionSavedState.f19277b = a10.f23523s;
        positionSavedState.f19278c = a10.f23524t;
        return positionSavedState;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xf.a aVar = this.f19269a.f19273a.f23376b;
        aVar.getClass();
        if (motionEvent != null && motionEvent.getAction() == 1) {
            motionEvent.getX();
            motionEvent.getY();
            aVar.getClass();
        }
        return true;
    }

    public void setAnimationDuration(long j10) {
        this.f19269a.a().f23520p = j10;
    }

    public void setAnimationType(f fVar) {
        this.f19269a.b((tf.a) null);
        if (fVar != null) {
            this.f19269a.a().f23527w = fVar;
        } else {
            this.f19269a.a().f23527w = f.NONE;
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z10) {
        if (!z10) {
            setVisibility(0);
        }
        this.f19269a.a().f23518n = z10;
        j();
    }

    public void setClickListener(a.C0315a aVar) {
        this.f19269a.f19273a.f23376b.getClass();
    }

    public void setCount(int i10) {
        if (i10 >= 0 && this.f19269a.a().f23521q != i10) {
            this.f19269a.a().f23521q = i10;
            j();
            requestLayout();
        }
    }

    public void setDynamicCount(boolean z10) {
        SliderPager sliderPager;
        this.f19269a.a().f23519o = z10;
        if (!z10) {
            h();
        } else if (this.f19270b == null && (sliderPager = this.f19271c) != null && sliderPager.getAdapter() != null) {
            this.f19270b = new qf.a(this);
            try {
                this.f19271c.getAdapter().i(this.f19270b);
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setInteractiveAnimation(boolean z10) {
        this.f19269a.a().f23517m = z10;
        this.f19272d = z10;
    }

    public void setOrientation(b bVar) {
        if (bVar != null) {
            this.f19269a.a().f23526v = bVar;
            requestLayout();
        }
    }

    public void setPadding(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f19269a.a().f23508d = j7.a.z(i10);
        invalidate();
    }

    public void setProgress(int i10, float f10) {
        yf.a a10 = this.f19269a.a();
        if (a10.f23517m) {
            int i11 = a10.f23521q;
            if (i11 <= 0 || i10 < 0) {
                i10 = 0;
            } else {
                int i12 = i11 - 1;
                if (i10 > i12) {
                    i10 = i12;
                }
            }
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 == 1.0f) {
                a10.f23524t = a10.f23522r;
                a10.f23522r = i10;
            }
            a10.f23523s = i10;
            sf.a aVar = this.f19269a.f19274b.f22765a;
            if (aVar != null) {
                aVar.f22855f = true;
                aVar.f22854e = f10;
                aVar.a();
            }
        }
    }

    public void setRadius(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f19269a.a().f23507c = j7.a.z(i10);
        invalidate();
    }

    public void setRtlMode(c cVar) {
        yf.a a10 = this.f19269a.a();
        if (cVar == null) {
            a10.f23528x = c.Off;
        } else {
            a10.f23528x = cVar;
        }
        if (this.f19271c != null) {
            int i10 = a10.f23522r;
            if (g()) {
                i10 = (a10.f23521q - 1) - i10;
            } else {
                SliderPager sliderPager = this.f19271c;
                if (sliderPager != null) {
                    i10 = sliderPager.getCurrentItem();
                }
            }
            a10.f23524t = i10;
            a10.f23523s = i10;
            a10.f23522r = i10;
            invalidate();
        }
    }

    public void setScaleFactor(float f10) {
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.3f) {
            f10 = 0.3f;
        }
        this.f19269a.a().f23514j = f10;
    }

    public void setSelected(int i10) {
        yf.a a10 = this.f19269a.a();
        f a11 = a10.a();
        a10.f23527w = f.NONE;
        setSelection(i10);
        a10.f23527w = a11;
    }

    public void setSelectedColor(int i10) {
        this.f19269a.a().f23516l = i10;
        invalidate();
    }

    public void setSelection(int i10) {
        T t10;
        yf.a a10 = this.f19269a.a();
        int i11 = this.f19269a.a().f23521q - 1;
        if (i10 <= 0) {
            i10 = 0;
        } else if (i10 > i11) {
            i10 = i11;
        }
        int i12 = a10.f23522r;
        if (i10 != i12 && i10 != a10.f23523s) {
            a10.f23517m = false;
            a10.f23524t = i12;
            a10.f23523s = i10;
            a10.f23522r = i10;
            rf.a aVar = this.f19269a.f19274b;
            sf.a aVar2 = aVar.f22765a;
            if (aVar2 != null) {
                vf.a aVar3 = aVar2.f22852c;
                if (!(aVar3 == null || (t10 = aVar3.f23261c) == null || !t10.isStarted())) {
                    aVar3.f23261c.end();
                }
                sf.a aVar4 = aVar.f22765a;
                aVar4.f22855f = false;
                aVar4.f22854e = 0.0f;
                aVar4.a();
            }
        }
    }

    public void setStrokeWidth(float f10) {
        int i10 = this.f19269a.a().f23507c;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else {
            float f11 = (float) i10;
            if (f10 > f11) {
                f10 = f11;
            }
        }
        this.f19269a.a().f23513i = (int) f10;
        invalidate();
    }

    public void setUnselectedColor(int i10) {
        this.f19269a.a().f23515k = i10;
        invalidate();
    }

    public void setViewPager(SliderPager sliderPager) {
        SliderPager sliderPager2 = this.f19271c;
        if (sliderPager2 != null) {
            ArrayList arrayList = sliderPager2.T;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            this.f19271c = null;
        }
        if (sliderPager != null) {
            this.f19271c = sliderPager;
            if (sliderPager.T == null) {
                sliderPager.T = new ArrayList();
            }
            sliderPager.T.add(this);
            SliderPager sliderPager3 = this.f19271c;
            if (sliderPager3.V == null) {
                sliderPager3.V = new ArrayList();
            }
            sliderPager3.V.add(this);
            this.f19269a.a().f23525u = this.f19271c.getId();
            setDynamicCount(this.f19269a.a().f23519o);
            i();
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(attributeSet);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f(attributeSet);
    }

    public void setPadding(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f19269a.a().f23508d = (int) f10;
        invalidate();
    }

    public void setRadius(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f19269a.a().f23507c = (int) f10;
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        int z10 = j7.a.z(i10);
        int i11 = this.f19269a.a().f23507c;
        if (z10 < 0) {
            z10 = 0;
        } else if (z10 > i11) {
            z10 = i11;
        }
        this.f19269a.a().f23513i = z10;
        invalidate();
    }
}
