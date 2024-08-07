package u1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import v1.b;

/* compiled from: PrecomputedTextCompat */
public final class d implements Spannable {
    public final char charAt(int i10) {
        throw null;
    }

    public final int getSpanEnd(Object obj) {
        throw null;
    }

    public final int getSpanFlags(Object obj) {
        throw null;
    }

    public final int getSpanStart(Object obj) {
        throw null;
    }

    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    public final int length() {
        throw null;
    }

    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    public final String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f15052a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f15053b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15054c;

        /* renamed from: d  reason: collision with root package name */
        public final int f15055d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f15052a = textPaint;
            this.f15053b = textDirectionHeuristic;
            this.f15054c = i10;
            this.f15055d = i11;
        }

        public final boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f15054c != aVar.f15054c || this.f15055d != aVar.f15055d || this.f15052a.getTextSize() != aVar.f15052a.getTextSize() || this.f15052a.getTextScaleX() != aVar.f15052a.getTextScaleX() || this.f15052a.getTextSkewX() != aVar.f15052a.getTextSkewX() || this.f15052a.getLetterSpacing() != aVar.f15052a.getLetterSpacing() || !TextUtils.equals(this.f15052a.getFontFeatureSettings(), aVar.f15052a.getFontFeatureSettings()) || this.f15052a.getFlags() != aVar.f15052a.getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f15052a.getTextLocales().equals(aVar.f15052a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f15052a.getTextLocale().equals(aVar.f15052a.getTextLocale())) {
                return false;
            }
            if (this.f15052a.getTypeface() == null) {
                if (aVar.f15052a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f15052a.getTypeface().equals(aVar.f15052a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar) && this.f15053b == aVar.f15053b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return b.b(Float.valueOf(this.f15052a.getTextSize()), Float.valueOf(this.f15052a.getTextScaleX()), Float.valueOf(this.f15052a.getTextSkewX()), Float.valueOf(this.f15052a.getLetterSpacing()), Integer.valueOf(this.f15052a.getFlags()), this.f15052a.getTextLocales(), this.f15052a.getTypeface(), Boolean.valueOf(this.f15052a.isElegantTextHeight()), this.f15053b, Integer.valueOf(this.f15054c), Integer.valueOf(this.f15055d));
            }
            return b.b(Float.valueOf(this.f15052a.getTextSize()), Float.valueOf(this.f15052a.getTextScaleX()), Float.valueOf(this.f15052a.getTextSkewX()), Float.valueOf(this.f15052a.getLetterSpacing()), Integer.valueOf(this.f15052a.getFlags()), this.f15052a.getTextLocale(), this.f15052a.getTypeface(), Boolean.valueOf(this.f15052a.isElegantTextHeight()), this.f15053b, Integer.valueOf(this.f15054c), Integer.valueOf(this.f15055d));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder q10 = android.support.v4.media.a.q("textSize=");
            q10.append(this.f15052a.getTextSize());
            sb2.append(q10.toString());
            sb2.append(", textScaleX=" + this.f15052a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f15052a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            StringBuilder q11 = android.support.v4.media.a.q(", letterSpacing=");
            q11.append(this.f15052a.getLetterSpacing());
            sb2.append(q11.toString());
            sb2.append(", elegantTextHeight=" + this.f15052a.isElegantTextHeight());
            if (i10 >= 24) {
                StringBuilder q12 = android.support.v4.media.a.q(", textLocale=");
                q12.append(this.f15052a.getTextLocales());
                sb2.append(q12.toString());
            } else {
                StringBuilder q13 = android.support.v4.media.a.q(", textLocale=");
                q13.append(this.f15052a.getTextLocale());
                sb2.append(q13.toString());
            }
            StringBuilder q14 = android.support.v4.media.a.q(", typeface=");
            q14.append(this.f15052a.getTypeface());
            sb2.append(q14.toString());
            if (i10 >= 26) {
                StringBuilder q15 = android.support.v4.media.a.q(", variationSettings=");
                q15.append(this.f15052a.getFontVariationSettings());
                sb2.append(q15.toString());
            }
            StringBuilder q16 = android.support.v4.media.a.q(", textDir=");
            q16.append(this.f15053b);
            sb2.append(q16.toString());
            sb2.append(", breakStrategy=" + this.f15054c);
            sb2.append(", hyphenationFrequency=" + this.f15055d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f15052a = params.getTextPaint();
            this.f15053b = params.getTextDirection();
            this.f15054c = params.getBreakStrategy();
            this.f15055d = params.getHyphenationFrequency();
        }
    }
}
