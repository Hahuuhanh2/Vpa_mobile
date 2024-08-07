package je;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PictureContextWrapper */
public final class i extends ContextWrapper {
    public i(Context context) {
        super(context);
    }

    public final Object getSystemService(String str) {
        if ("audio".equals(str)) {
            return getApplicationContext().getSystemService(str);
        }
        return super.getSystemService(str);
    }
}
