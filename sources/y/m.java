package y;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import f0.m0;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: ExtraCroppingQuirk */
public class m implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f17340a;

    static {
        HashMap hashMap = new HashMap();
        f17340a = hashMap;
        hashMap.put("SM-T580", (Object) null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", (Object) null);
        hashMap.put("SM-G570M", (Object) null);
        hashMap.put("SM-G610F", (Object) null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size a(int i10) {
        if (!b()) {
            return null;
        }
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 0) {
                return new Size(1920, 1080);
            }
            if (i11 == 1) {
                return new Size(1280, 720);
            }
            if (i11 != 2) {
                return null;
            }
            return new Size(3264, 1836);
        }
        throw null;
    }

    public static boolean b() {
        boolean z10;
        if (!"samsung".equalsIgnoreCase(Build.BRAND) || !f17340a.containsKey(Build.MODEL.toUpperCase(Locale.US))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        Range range = (Range) f17340a.get(Build.MODEL.toUpperCase(Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
