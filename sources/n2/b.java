package n2;

import android.annotation.SuppressLint;
import android.text.Editable;
import l2.g;

/* compiled from: EmojiEditableFactory */
public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13455a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f13456b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f13457c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f13457c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f13457c;
        if (cls != null) {
            return new g(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
