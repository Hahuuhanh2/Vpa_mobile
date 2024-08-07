package q8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.r;
import l8.g;
import l8.h;
import l8.j;
import l8.m;

/* compiled from: TooltipDrawable */
public final class a extends h implements r.b {
    public CharSequence F;
    public final Context G;
    public final Paint.FontMetrics H = new Paint.FontMetrics();
    public final r I;
    public final C0185a J;
    public final Rect K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;

    /* renamed from: q8.a$a  reason: collision with other inner class name */
    /* compiled from: TooltipDrawable */
    public class C0185a implements View.OnLayoutChangeListener {
        public C0185a() {
        }

        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a aVar = a.this;
            aVar.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            aVar.Q = iArr[0];
            view.getWindowVisibleDisplayFrame(aVar.K);
        }
    }

    public a(Context context, int i10) {
        super(context, (AttributeSet) null, 0, i10);
        r rVar = new r(this);
        this.I = rVar;
        this.J = new C0185a();
        this.K = new Rect();
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = 0.5f;
        this.U = 1.0f;
        this.G = context;
        rVar.f6494a.density = context.getResources().getDisplayMetrics().density;
        rVar.f6494a.setTextAlign(Paint.Align.CENTER);
    }

    public final void a() {
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        float x10 = x();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.R, this.S, (((float) getBounds().width()) * 0.5f) + ((float) getBounds().left), (((float) getBounds().height()) * this.T) + ((float) getBounds().top));
        canvas.translate(x10, (float) (-((sqrt * ((double) this.P)) - ((double) this.P))));
        super.draw(canvas);
        if (this.F != null) {
            Rect bounds = getBounds();
            this.I.f6494a.getFontMetrics(this.H);
            Paint.FontMetrics fontMetrics = this.H;
            int centerY = (int) (((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            r rVar = this.I;
            if (rVar.f6500g != null) {
                rVar.f6494a.drawableState = getState();
                r rVar2 = this.I;
                rVar2.f6500g.e(this.G, rVar2.f6494a, rVar2.f6495b);
                this.I.f6494a.setAlpha((int) (this.U * 255.0f));
            }
            CharSequence charSequence = this.F;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) centerY, this.I.f6494a);
        }
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return (int) Math.max(this.I.f6494a.getTextSize(), (float) this.N);
    }

    public final int getIntrinsicWidth() {
        float f10;
        float f11 = (float) (this.L * 2);
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            f10 = 0.0f;
        } else {
            f10 = this.I.a(charSequence.toString());
        }
        return (int) Math.max(f11 + f10, (float) this.M);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m mVar = this.f12778a.f12798a;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        aVar.f12847k = y();
        setShapeAppearanceModel(new m(aVar));
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final float x() {
        int i10;
        if (((this.K.right - getBounds().right) - this.Q) - this.O < 0) {
            i10 = ((this.K.right - getBounds().right) - this.Q) - this.O;
        } else if (((this.K.left - getBounds().left) - this.Q) + this.O <= 0) {
            return 0.0f;
        } else {
            i10 = ((this.K.left - getBounds().left) - this.Q) + this.O;
        }
        return (float) i10;
    }

    public final j y() {
        float width = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.P)))) / 2.0f;
        return new j(new g((float) this.P), Math.min(Math.max(-x(), -width), width));
    }
}
