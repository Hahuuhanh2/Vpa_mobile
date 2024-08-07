package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.d;

/* compiled from: DefaultGlyphChecker */
public final class b implements d.C0022d {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f2376b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f2377a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f2377a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
