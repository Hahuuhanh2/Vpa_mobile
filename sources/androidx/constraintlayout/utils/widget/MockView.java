package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;

public class MockView extends View {

    /* renamed from: a  reason: collision with root package name */
    public Paint f1789a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    public Paint f1790b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    public Paint f1791c = new Paint();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1792d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1793e = true;

    /* renamed from: f  reason: collision with root package name */
    public String f1794f = null;

    /* renamed from: n  reason: collision with root package name */
    public Rect f1795n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    public int f1796o = Color.argb(255, 0, 0, 0);

    /* renamed from: p  reason: collision with root package name */
    public int f1797p = Color.argb(255, 200, 200, 200);

    /* renamed from: q  reason: collision with root package name */
    public int f1798q = Color.argb(255, 50, 50, 50);

    /* renamed from: r  reason: collision with root package name */
    public int f1799r = 4;

    public MockView(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.MockView_mock_label) {
                    this.f1794f = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.MockView_mock_showDiagonals) {
                    this.f1792d = obtainStyledAttributes.getBoolean(index, this.f1792d);
                } else if (index == R$styleable.MockView_mock_diagonalsColor) {
                    this.f1796o = obtainStyledAttributes.getColor(index, this.f1796o);
                } else if (index == R$styleable.MockView_mock_labelBackgroundColor) {
                    this.f1798q = obtainStyledAttributes.getColor(index, this.f1798q);
                } else if (index == R$styleable.MockView_mock_labelColor) {
                    this.f1797p = obtainStyledAttributes.getColor(index, this.f1797p);
                } else if (index == R$styleable.MockView_mock_showLabel) {
                    this.f1793e = obtainStyledAttributes.getBoolean(index, this.f1793e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f1794f == null) {
            try {
                this.f1794f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f1789a.setColor(this.f1796o);
        this.f1789a.setAntiAlias(true);
        this.f1790b.setColor(this.f1797p);
        this.f1790b.setAntiAlias(true);
        this.f1791c.setColor(this.f1798q);
        this.f1799r = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * ((float) this.f1799r));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1792d) {
            width--;
            height--;
            float f10 = (float) width;
            float f11 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f10, f11, this.f1789a);
            Canvas canvas2 = canvas;
            float f12 = f10;
            canvas2.drawLine(0.0f, f11, f12, 0.0f, this.f1789a);
            canvas2.drawLine(0.0f, 0.0f, f12, 0.0f, this.f1789a);
            float f13 = f10;
            float f14 = f11;
            canvas2.drawLine(f13, 0.0f, f12, f14, this.f1789a);
            float f15 = f11;
            canvas2.drawLine(f13, f15, 0.0f, f14, this.f1789a);
            canvas2.drawLine(0.0f, f15, 0.0f, 0.0f, this.f1789a);
        }
        String str = this.f1794f;
        if (str != null && this.f1793e) {
            this.f1790b.getTextBounds(str, 0, str.length(), this.f1795n);
            float width2 = ((float) (width - this.f1795n.width())) / 2.0f;
            float height2 = (((float) (height - this.f1795n.height())) / 2.0f) + ((float) this.f1795n.height());
            this.f1795n.offset((int) width2, (int) height2);
            Rect rect = this.f1795n;
            int i10 = rect.left;
            int i11 = this.f1799r;
            rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
            canvas.drawRect(this.f1795n, this.f1791c);
            canvas.drawText(this.f1794f, width2, height2, this.f1790b);
        }
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }
}
