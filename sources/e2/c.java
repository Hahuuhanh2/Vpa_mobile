package e2;

import android.text.TextWatcher;
import android.widget.TextView;
import androidx.databinding.library.baseAdapters.R$id;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.g;

/* compiled from: TextViewBindingAdapter */
public final class c {

    /* compiled from: TextViewBindingAdapter */
    public interface a {
        void a();
    }

    /* compiled from: TextViewBindingAdapter */
    public interface b {
        void a();
    }

    /* renamed from: e2.c$c  reason: collision with other inner class name */
    /* compiled from: TextViewBindingAdapter */
    public interface C0096c {
        void a();
    }

    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    public static void b(AppTextView appTextView, int i10) {
        appTextView.setShadowLayer(appTextView.getShadowRadius(), appTextView.getShadowDx(), appTextView.getShadowDy(), i10);
    }

    public static void c(AppTextView appTextView, float f10) {
        appTextView.setShadowLayer(f10, appTextView.getShadowDx(), appTextView.getShadowDy(), appTextView.getShadowColor());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.widget.TextView r7, java.lang.CharSequence r8) {
        /*
            java.lang.CharSequence r0 = r7.getText()
            if (r8 == r0) goto L_0x004f
            if (r8 != 0) goto L_0x000f
            int r1 = r0.length()
            if (r1 != 0) goto L_0x000f
            goto L_0x004f
        L_0x000f:
            boolean r1 = r8 instanceof android.text.Spanned
            if (r1 == 0) goto L_0x001a
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004c
            return
        L_0x001a:
            r1 = 0
            r2 = 1
            if (r8 != 0) goto L_0x0020
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r0 != 0) goto L_0x0025
            r4 = r2
            goto L_0x0026
        L_0x0025:
            r4 = r1
        L_0x0026:
            if (r3 == r4) goto L_0x002a
        L_0x0028:
            r1 = r2
            goto L_0x0049
        L_0x002a:
            if (r8 != 0) goto L_0x002d
            goto L_0x0049
        L_0x002d:
            int r3 = r8.length()
            int r4 = r0.length()
            if (r3 == r4) goto L_0x0038
            goto L_0x0028
        L_0x0038:
            r4 = r1
        L_0x0039:
            if (r4 >= r3) goto L_0x0049
            char r5 = r8.charAt(r4)
            char r6 = r0.charAt(r4)
            if (r5 == r6) goto L_0x0046
            goto L_0x0028
        L_0x0046:
            int r4 = r4 + 1
            goto L_0x0039
        L_0x0049:
            if (r1 != 0) goto L_0x004c
            return
        L_0x004c:
            r7.setText(r8)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.c.d(android.widget.TextView, java.lang.CharSequence):void");
    }

    public static void e(TextView textView, g gVar) {
        b bVar;
        if (gVar == null) {
            bVar = null;
        } else {
            bVar = new b(gVar);
        }
        int i10 = R$id.textWatcher;
        int i11 = a.f9087a;
        Object tag = textView.getTag(i10);
        textView.setTag(i10, bVar);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (bVar != null) {
            textView.addTextChangedListener(bVar);
        }
    }
}
