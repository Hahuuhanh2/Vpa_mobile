package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CameraAccessExceptionCompat extends Exception {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<Integer> f1275b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{4, 5, 1, 2, 3})));

    /* renamed from: a  reason: collision with root package name */
    public final int f1276a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{10001, 10002})));
    }

    public CameraAccessExceptionCompat(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f1276a = 10001;
        if (f1275b.contains(10001)) {
            new CameraAccessException(10001, (String) null, runtimeException);
        }
    }

    public static CameraAccessExceptionCompat a(CameraAccessException cameraAccessException) {
        return new CameraAccessExceptionCompat(cameraAccessException);
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f1276a = cameraAccessException.getReason();
    }

    public CameraAccessExceptionCompat(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", new Object[]{"CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str}), assertionError);
        this.f1276a = 10002;
        if (f1275b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
