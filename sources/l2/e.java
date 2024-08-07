package l2;

import al.g0;
import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import m2.a;

/* compiled from: EmojiSpan */
public abstract class e extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f12638a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final d f12639b;

    /* renamed from: c  reason: collision with root package name */
    public float f12640c = 1.0f;

    public e(d dVar) {
        g0.D(dVar, "metadata cannot be null");
        this.f12639b = dVar;
    }

    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        paint.getFontMetricsInt(this.f12638a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f12638a;
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        a c10 = this.f12639b.c();
        int a10 = c10.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = c10.f13087b.getShort(a10 + c10.f13086a);
        } else {
            s10 = 0;
        }
        this.f12640c = abs / ((float) s10);
        a c11 = this.f12639b.c();
        int a11 = c11.a(14);
        if (a11 != 0) {
            c11.f13087b.getShort(a11 + c11.f13086a);
        }
        a c12 = this.f12639b.c();
        int a12 = c12.a(12);
        if (a12 != 0) {
            s11 = c12.f13087b.getShort(a12 + c12.f13086a);
        }
        short s12 = (short) ((int) (((float) s11) * this.f12640c));
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f12638a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s12;
    }
}
