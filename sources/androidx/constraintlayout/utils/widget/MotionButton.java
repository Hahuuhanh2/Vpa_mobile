package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.R$styleable;

public class MotionButton extends AppCompatButton {

    /* renamed from: d  reason: collision with root package name */
    public float f1800d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1801e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    public Path f1802f;

    /* renamed from: n  reason: collision with root package name */
    public ViewOutlineProvider f1803n;

    /* renamed from: o  reason: collision with root package name */
    public RectF f1804o;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionButton.this.f1800d) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f1801e);
        }
    }

    public MotionButton(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f1801e;
    }

    public float getRoundPercent() {
        return this.f1800d;
    }

    public void setRound(float f10) {
        boolean z10;
        if (Float.isNaN(f10)) {
            this.f1801e = f10;
            float f11 = this.f1800d;
            this.f1800d = -1.0f;
            setRoundPercent(f11);
            return;
        }
        if (this.f1801e != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1801e = f10;
        if (f10 != 0.0f) {
            if (this.f1802f == null) {
                this.f1802f = new Path();
            }
            if (this.f1804o == null) {
                this.f1804o = new RectF();
            }
            if (this.f1803n == null) {
                b bVar = new b();
                this.f1803n = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1804o.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f1802f.reset();
            Path path = this.f1802f;
            RectF rectF = this.f1804o;
            float f12 = this.f1801e;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10;
        if (this.f1800d != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1800d = f10;
        if (f10 != 0.0f) {
            if (this.f1802f == null) {
                this.f1802f = new Path();
            }
            if (this.f1804o == null) {
                this.f1804o = new RectF();
            }
            if (this.f1803n == null) {
                a aVar = new a();
                this.f1803n = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f1800d) / 2.0f;
            this.f1804o.set(0.0f, 0.0f, (float) width, (float) height);
            this.f1802f.reset();
            this.f1802f.addRoundRect(this.f1804o, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }
}
