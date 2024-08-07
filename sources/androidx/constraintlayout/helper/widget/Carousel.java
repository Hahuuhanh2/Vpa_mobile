package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import java.util.ArrayList;

public class Carousel extends MotionHelper {
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public float D = 0.9f;
    public int E = 0;
    public int F = 4;
    public int G = 1;
    public float H = 2.0f;
    public int I = -1;
    public int J = 200;
    public a K = new a();

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<View> f1530t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public int f1531u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f1532v = 0;

    /* renamed from: w  reason: collision with root package name */
    public MotionLayout f1533w;

    /* renamed from: x  reason: collision with root package name */
    public int f1534x = -1;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1535y = false;

    /* renamed from: z  reason: collision with root package name */
    public int f1536z = -1;

    public class a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a  reason: collision with other inner class name */
        public class C0013a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ float f1538a;

            public C0013a(float f10) {
                this.f1538a = f10;
            }

            public final void run() {
                Carousel.this.f1533w.D(1.0f, this.f1538a, 5);
            }
        }

        public a() {
        }

        public final void run() {
            Carousel.this.f1533w.setProgress(0.0f);
            Carousel.this.x();
            Carousel.this.getClass();
            throw null;
        }
    }

    public interface b {
        void a();

        void b();

        int count();
    }

    public Carousel(Context context) {
        super(context);
    }

    public final void a(int i10) {
        int i11 = this.f1532v;
        this.f1531u = i11;
        if (i10 == this.C) {
            this.f1532v = i11 + 1;
        } else if (i10 == this.B) {
            this.f1532v = i11 - 1;
        }
        if (this.f1535y) {
            throw null;
        }
        throw null;
    }

    public final void b() {
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f1532v;
    }

    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i10 = 0; i10 < this.f1843b; i10++) {
                int i11 = this.f1842a[i10];
                View c10 = motionLayout.c(i11);
                if (this.f1534x == i11) {
                    this.E = i10;
                }
                this.f1530t.add(c10);
            }
            this.f1533w = motionLayout;
            if (this.G == 2) {
                a.b x10 = motionLayout.x(this.A);
                if (!(x10 == null || (bVar2 = x10.f1671l) == null)) {
                    bVar2.f1683c = 5;
                }
                a.b x11 = this.f1533w.x(this.f1536z);
                if (!(x11 == null || (bVar = x11.f1671l) == null)) {
                    bVar.f1683c = 5;
                }
            }
            x();
        }
    }

    public void setAdapter(b bVar) {
    }

    public final void v(int i10, boolean z10) {
        MotionLayout motionLayout;
        a.b x10;
        if (i10 != -1 && (motionLayout = this.f1533w) != null && (x10 = motionLayout.x(i10)) != null && z10 != (!x10.f1674o)) {
            x10.f1674o = !z10;
        }
    }

    public final void w(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.Carousel_carousel_firstView) {
                    this.f1534x = obtainStyledAttributes.getResourceId(index, this.f1534x);
                } else if (index == R$styleable.Carousel_carousel_backwardTransition) {
                    this.f1536z = obtainStyledAttributes.getResourceId(index, this.f1536z);
                } else if (index == R$styleable.Carousel_carousel_forwardTransition) {
                    this.A = obtainStyledAttributes.getResourceId(index, this.A);
                } else if (index == R$styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.F = obtainStyledAttributes.getInt(index, this.F);
                } else if (index == R$styleable.Carousel_carousel_previousState) {
                    this.B = obtainStyledAttributes.getResourceId(index, this.B);
                } else if (index == R$styleable.Carousel_carousel_nextState) {
                    this.C = obtainStyledAttributes.getResourceId(index, this.C);
                } else if (index == R$styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.D = obtainStyledAttributes.getFloat(index, this.D);
                } else if (index == R$styleable.Carousel_carousel_touchUpMode) {
                    this.G = obtainStyledAttributes.getInt(index, this.G);
                } else if (index == R$styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.H = obtainStyledAttributes.getFloat(index, this.H);
                } else if (index == R$styleable.Carousel_carousel_infinite) {
                    this.f1535y = obtainStyledAttributes.getBoolean(index, this.f1535y);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void x() {
    }

    public final void y(int i10, View view) {
        androidx.constraintlayout.widget.a aVar;
        a.C0016a i11;
        MotionLayout motionLayout = this.f1533w;
        if (motionLayout != null) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            for (int i12 : constraintSetIds) {
                androidx.constraintlayout.motion.widget.a aVar2 = this.f1533w.f1595x;
                if (aVar2 == null) {
                    aVar = null;
                } else {
                    aVar = aVar2.b(i12);
                }
                if (!(aVar == null || (i11 = aVar.i(view.getId())) == null)) {
                    i11.f1949c.f2026c = 1;
                    view.setVisibility(i10);
                }
            }
        }
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w(context, attributeSet);
    }
}
