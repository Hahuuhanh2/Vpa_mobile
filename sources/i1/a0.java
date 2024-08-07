package i1;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;

/* compiled from: RemoteInput */
public final class a0 {

    /* compiled from: RemoteInput */
    public static class a {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static RemoteInput a(a0 a0Var) {
        a0Var.getClass();
        RemoteInput.Builder addExtras = new RemoteInput.Builder((String) null).setLabel((CharSequence) null).setChoices((CharSequence[]) null).setAllowFreeFormInput(false).addExtras((Bundle) null);
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(addExtras, 0);
        }
        return addExtras.build();
    }
}
