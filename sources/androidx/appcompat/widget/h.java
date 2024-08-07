package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import n2.f;

/* compiled from: AppCompatEmojiTextHelper */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1114a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1115b;

    public h(TextView textView) {
        this.f1114a = textView;
        this.f1115b = new f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1115b.f13466a.a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1114a.getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i10, 0);
        try {
            int i11 = R$styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z10 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        this.f1115b.f13466a.c(z10);
    }

    public final void d(boolean z10) {
        this.f1115b.f13466a.d(z10);
    }
}
