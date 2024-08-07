package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v0.h;

/* compiled from: AppCompatViewInflater */
public class o {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f446b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f447c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f448d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f449e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f450f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f451g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final h<String, Constructor<? extends View>> f452h = new h<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f453a = new Object[2];

    /* compiled from: AppCompatViewInflater */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f454a;

        /* renamed from: b  reason: collision with root package name */
        public final String f455b;

        /* renamed from: c  reason: collision with root package name */
        public Method f456c;

        /* renamed from: d  reason: collision with root package name */
        public Context f457d;

        public a(View view, String str) {
            this.f454a = view;
            this.f455b = str;
        }

        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f456c == null) {
                Context context = this.f454a.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f455b, new Class[]{View.class})) != null) {
                            this.f456c = method;
                            this.f457d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                }
                int id2 = this.f454a.getId();
                if (id2 == -1) {
                    str = "";
                } else {
                    StringBuilder q10 = android.support.v4.media.a.q(" with id '");
                    q10.append(this.f454a.getContext().getResources().getResourceEntryName(id2));
                    q10.append("'");
                    str = q10.toString();
                }
                StringBuilder q11 = android.support.v4.media.a.q("Could not find method ");
                q11.append(this.f455b);
                q11.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                q11.append(this.f454a.getClass());
                q11.append(str);
                throw new IllegalStateException(q11.toString());
            }
            try {
                this.f456c.invoke(this.f457d, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        h<String, Constructor<? extends View>> hVar = f452h;
        Constructor<? extends U> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f446b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f453a);
    }

    public final void g(TextView textView, String str) {
        if (textView == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
