package ad;

import android.hardware.Camera;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: CameraConfigurationUtils */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f165a = 0;

    static {
        Pattern.compile(";");
    }

    public static String a(List list, String... strArr) {
        Arrays.toString(strArr);
        Objects.toString(list);
        if (list == null) {
            return null;
        }
        for (String str : strArr) {
            if (list.contains(str)) {
                return str;
            }
        }
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z10) {
        String str;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z10) {
            str = a(supportedFlashModes, "torch", "on");
        } else {
            str = a(supportedFlashModes, "off");
        }
        if (str != null && !str.equals(parameters.getFlashMode())) {
            parameters.setFlashMode(str);
        }
    }
}
