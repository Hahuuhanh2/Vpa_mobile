package l2;

import al.g0;
import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder */
public final class g extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f12642a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f12643b = new ArrayList();

    /* compiled from: SpannableBuilder */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final Object f12644a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicInteger f12645b = new AtomicInteger(0);

        public a(Object obj) {
            this.f12644a = obj;
        }

        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f12644a).afterTextChanged(editable);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f12644a).beforeTextChanged(charSequence, i10, i11, i12);
        }

        public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f12645b.get() <= 0 || !(obj instanceof e)) {
                ((SpanWatcher) this.f12644a).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            int i16;
            if (this.f12645b.get() <= 0 || !(obj instanceof e)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i10 > i11) {
                        i16 = 0;
                    } else {
                        i16 = i10;
                    }
                    if (i12 > i13) {
                        i15 = i16;
                        i14 = 0;
                    } else {
                        i14 = i12;
                        i15 = i16;
                    }
                } else {
                    i15 = i10;
                    i14 = i12;
                }
                ((SpanWatcher) this.f12644a).onSpanChanged(spannable, obj, i15, i11, i14, i13);
            }
        }

        public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f12645b.get() <= 0 || !(obj instanceof e)) {
                ((SpanWatcher) this.f12644a).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f12644a).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    public g(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        g0.D(cls, "watcherClass cannot be null");
        this.f12642a = cls;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f12643b.size(); i10++) {
            ((a) this.f12643b.get(i10)).f12645b.incrementAndGet();
        }
    }

    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        for (int i10 = 0; i10 < this.f12643b.size(); i10++) {
            ((a) this.f12643b.get(i10)).onTextChanged(this, 0, length(), length());
        }
    }

    public final a c(Object obj) {
        for (int i10 = 0; i10 < this.f12643b.size(); i10++) {
            a aVar = (a) this.f12643b.get(i10);
            if (aVar.f12644a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(Object obj) {
        boolean z10;
        if (obj != null) {
            if (this.f12642a == obj.getClass()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f12643b.size(); i10++) {
            ((a) this.f12643b.get(i10)).f12645b.decrementAndGet();
        }
    }

    public final int getSpanEnd(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        boolean z10;
        if (this.f12642a == cls) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f12644a;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r0 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class<l2.g.a> r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x000b
            java.lang.Class<?> r0 = r1.f12642a
            if (r0 != r4) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            java.lang.Class<l2.g$a> r4 = l2.g.a.class
        L_0x000d:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.g.nextSpanTransition(int, int, java.lang.Class):int");
    }

    public final void removeSpan(Object obj) {
        a aVar;
        if (d(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f12643b.remove(aVar);
        }
    }

    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f12643b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i10, int i11) {
        return new g(this.f12642a, this, i10, i11);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m12append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m17delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m18insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m15append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        e();
        return this;
    }

    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m19insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public g(Class<?> cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        g0.D(cls, "watcherClass cannot be null");
        this.f12642a = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m11append(char c10) {
        super.append(c10);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m14append(char c10) {
        super.append(c10);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        e();
        return this;
    }

    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m13append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m16append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
