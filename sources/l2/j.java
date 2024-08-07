package l2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import u1.d;

/* compiled from: UnprecomputeTextOnModificationSpannable */
public final class j implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12646a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f12647b;

    /* compiled from: UnprecomputeTextOnModificationSpannable */
    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof d;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable */
    public static class b extends a {
        public final boolean a(Spannable spannable) {
            if ((spannable instanceof PrecomputedText) || (spannable instanceof d)) {
                return true;
            }
            return false;
        }
    }

    public j(Spannable spannable) {
        this.f12647b = spannable;
    }

    public final void a() {
        a aVar;
        Spannable spannable = this.f12647b;
        if (!this.f12646a) {
            if (Build.VERSION.SDK_INT < 28) {
                aVar = new a();
            } else {
                aVar = new b();
            }
            if (aVar.a(spannable)) {
                this.f12647b = new SpannableString(spannable);
            }
        }
        this.f12646a = true;
    }

    public final char charAt(int i10) {
        return this.f12647b.charAt(i10);
    }

    public final IntStream chars() {
        return IntStream.VivifiedWrapper.convert(this.f12647b.chars());
    }

    public final IntStream codePoints() {
        return IntStream.VivifiedWrapper.convert(this.f12647b.codePoints());
    }

    public final int getSpanEnd(Object obj) {
        return this.f12647b.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f12647b.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f12647b.getSpanStart(obj);
    }

    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return this.f12647b.getSpans(i10, i11, cls);
    }

    public final int length() {
        return this.f12647b.length();
    }

    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f12647b.nextSpanTransition(i10, i11, cls);
    }

    public final void removeSpan(Object obj) {
        a();
        this.f12647b.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f12647b.setSpan(obj, i10, i11, i12);
    }

    public final CharSequence subSequence(int i10, int i11) {
        return this.f12647b.subSequence(i10, i11);
    }

    public final String toString() {
        return this.f12647b.toString();
    }

    public j(CharSequence charSequence) {
        this.f12647b = new SpannableString(charSequence);
    }
}
