package n2;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher */
public final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f13471a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13472b = false;

    /* renamed from: c  reason: collision with root package name */
    public a f13473c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13474d = true;

    /* compiled from: EmojiTextWatcher */
    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f13475a;

        public a(EditText editText) {
            this.f13475a = new WeakReference(editText);
        }

        public final void b() {
            g.a((EditText) this.f13475a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f13471a = editText;
    }

    public static void a(EditText editText, int i10) {
        int i11;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            d a10 = d.a();
            if (editableText == null) {
                i11 = 0;
            } else {
                a10.getClass();
                i11 = editableText.length();
            }
            a10.f(0, i11, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0 == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            android.widget.EditText r0 = r3.f13471a
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r3.f13474d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001b
            boolean r0 = r3.f13472b
            if (r0 != 0) goto L_0x001c
            androidx.emoji2.text.d r0 = androidx.emoji2.text.d.f2380j
            if (r0 == 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0056
        L_0x001f:
            if (r6 > r7) goto L_0x0056
            boolean r6 = r4 instanceof android.text.Spannable
            if (r6 == 0) goto L_0x0056
            androidx.emoji2.text.d r6 = androidx.emoji2.text.d.a()
            int r6 = r6.b()
            if (r6 == 0) goto L_0x0040
            if (r6 == r2) goto L_0x0035
            r4 = 3
            if (r6 == r4) goto L_0x0040
            goto L_0x0056
        L_0x0035:
            android.text.Spannable r4 = (android.text.Spannable) r4
            androidx.emoji2.text.d r6 = androidx.emoji2.text.d.a()
            int r7 = r7 + r5
            r6.f(r5, r7, r4)
            goto L_0x0056
        L_0x0040:
            androidx.emoji2.text.d r4 = androidx.emoji2.text.d.a()
            n2.g$a r5 = r3.f13473c
            if (r5 != 0) goto L_0x0051
            n2.g$a r5 = new n2.g$a
            android.widget.EditText r6 = r3.f13471a
            r5.<init>(r6)
            r3.f13473c = r5
        L_0x0051:
            n2.g$a r5 = r3.f13473c
            r4.g(r5)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
