package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
    public int A;
    public int B;
    public int C;
    public final Paint D;
    public final Rect E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public float K;
    public float L;
    public int M;

    /* renamed from: x  reason: collision with root package name */
    public int f3520x;

    /* renamed from: y  reason: collision with root package name */
    public int f3521y;

    /* renamed from: z  reason: collision with root package name */
    public int f3522z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f3527a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f3527a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void c(int i10, float f10, boolean z10) {
        Rect rect = this.E;
        int height = getHeight();
        int left = this.f3529c.getLeft() - this.C;
        int right = this.f3529c.getRight() + this.C;
        int i11 = height - this.f3521y;
        rect.set(left, i11, right, height);
        super.c(i10, f10, z10);
        this.F = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f3529c.getLeft() - this.C, i11, this.f3529c.getRight() + this.C, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.G;
    }

    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.B);
    }

    public int getTabIndicatorColor() {
        return this.f3520x;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f3529c.getLeft() - this.C;
        int right = this.f3529c.getRight() + this.C;
        this.D.setColor((this.F << 24) | (this.f3520x & 16777215));
        float f10 = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f3521y), (float) right, f10, this.D);
        if (this.G) {
            this.D.setColor(-16777216 | (this.f3520x & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.I), (float) (getWidth() - getPaddingRight()), f10, this.D);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.J) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            this.K = x10;
            this.L = y10;
            this.J = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x10 - this.K) > ((float) this.M) || Math.abs(y10 - this.L) > ((float) this.M))) {
                this.J = true;
            }
        } else if (x10 < ((float) (this.f3529c.getLeft() - this.C))) {
            ViewPager viewPager = this.f3527a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x10 > ((float) (this.f3529c.getRight() + this.C))) {
            ViewPager viewPager2 = this.f3527a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(int i10) {
        boolean z10;
        super.setBackgroundColor(i10);
        if (!this.H) {
            if ((i10 & -16777216) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.G = z10;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        boolean z10;
        super.setBackgroundDrawable(drawable);
        if (!this.H) {
            if (drawable == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.G = z10;
        }
    }

    public void setBackgroundResource(int i10) {
        boolean z10;
        super.setBackgroundResource(i10);
        if (!this.H) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.G = z10;
        }
    }

    public void setDrawFullUnderline(boolean z10) {
        this.G = z10;
        this.H = true;
        invalidate();
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.f3522z;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(int i10) {
        this.f3520x = i10;
        this.D.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i10) {
        setTabIndicatorColor(k1.a.getColor(getContext(), i10));
    }

    public void setTextSpacing(int i10) {
        int i11 = this.A;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.D = paint;
        this.E = new Rect();
        this.F = 255;
        this.G = false;
        this.H = false;
        int i10 = this.f3540u;
        this.f3520x = i10;
        paint.setColor(i10);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f3521y = (int) ((3.0f * f10) + 0.5f);
        this.f3522z = (int) ((6.0f * f10) + 0.5f);
        this.A = (int) (64.0f * f10);
        this.C = (int) ((16.0f * f10) + 0.5f);
        this.I = (int) ((1.0f * f10) + 0.5f);
        this.B = (int) ((f10 * 32.0f) + 0.5f);
        this.M = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f3528b.setFocusable(true);
        this.f3528b.setOnClickListener(new a());
        this.f3530d.setFocusable(true);
        this.f3530d.setOnClickListener(new b());
        if (getBackground() == null) {
            this.G = true;
        }
    }
}
