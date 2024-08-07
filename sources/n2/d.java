package n2;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f13460a;

    /* renamed from: b  reason: collision with root package name */
    public a f13461b;

    /* compiled from: EmojiInputFilter */
    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f13462a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f13463b;

        public a(TextView textView, d dVar) {
            this.f13462a = new WeakReference(textView);
            this.f13463b = new WeakReference(dVar);
        }

        public final void b() {
            boolean z10;
            int i10;
            InputFilter[] filters;
            TextView textView = (TextView) this.f13462a.get();
            InputFilter inputFilter = (InputFilter) this.f13463b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= filters.length) {
                        break;
                    } else if (filters[i11] == inputFilter) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            z10 = false;
            if (z10 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
                if (text == null) {
                    i10 = 0;
                } else {
                    a10.getClass();
                    i10 = text.length();
                }
                CharSequence f10 = a10.f(0, i10, text);
                if (text != f10) {
                    int selectionStart = Selection.getSelectionStart(f10);
                    int selectionEnd = Selection.getSelectionEnd(f10);
                    textView.setText(f10);
                    if (f10 instanceof Spannable) {
                        Spannable spannable = (Spannable) f10;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                        } else if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                        }
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f13460a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f13460a.isInEditMode()) {
            return charSequence;
        }
        int b10 = androidx.emoji2.text.d.a().b();
        if (b10 != 0) {
            boolean z10 = true;
            if (b10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f13460a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (!(i10 == 0 && i11 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.d.a().f(0, charSequence.length(), charSequence);
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
        if (this.f13461b == null) {
            this.f13461b = new a(this.f13460a, this);
        }
        a10.g(this.f13461b);
        return charSequence;
    }
}
