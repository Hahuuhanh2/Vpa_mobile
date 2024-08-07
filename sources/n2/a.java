package n2;

import al.g0;
import android.widget.EditText;

/* compiled from: EmojiEditTextHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0163a f13452a;

    /* renamed from: n2.a$a  reason: collision with other inner class name */
    /* compiled from: EmojiEditTextHelper */
    public static class C0163a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f13453a;

        /* renamed from: b  reason: collision with root package name */
        public final g f13454b;

        public C0163a(EditText editText) {
            this.f13453a = editText;
            g gVar = new g(editText);
            this.f13454b = gVar;
            editText.addTextChangedListener(gVar);
            if (b.f13456b == null) {
                synchronized (b.f13455a) {
                    if (b.f13456b == null) {
                        b.f13456b = new b();
                    }
                }
            }
            editText.setEditableFactory(b.f13456b);
        }
    }

    /* compiled from: EmojiEditTextHelper */
    public static class b {
    }

    public a(EditText editText) {
        g0.D(editText, "editText cannot be null");
        this.f13452a = new C0163a(editText);
    }
}
