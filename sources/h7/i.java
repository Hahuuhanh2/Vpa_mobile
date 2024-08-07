package h7;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f10619a = 0;

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }
}
