package l2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.d;

/* compiled from: TypefaceEmojiSpan */
public final class h extends e {
    public h(d dVar) {
        super(dVar);
    }

    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        d.a().getClass();
        d dVar = this.f12639b;
        Typeface typeface = dVar.f12636b.f2420d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i15 = dVar.f12635a * 2;
        char[] cArr = dVar.f12636b.f2418b;
        canvas.drawText(cArr, i15, 2, f10, (float) i13, paint);
        paint2.setTypeface(typeface2);
    }
}
