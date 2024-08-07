package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import z.k;

/* compiled from: CameraCharacteristicsCompat */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f16249a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final s f16250b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16251c;

    /* renamed from: d  reason: collision with root package name */
    public e0 f16252d = null;

    public t(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16250b = new r(cameraCharacteristics);
        } else {
            this.f16250b = new s(cameraCharacteristics);
        }
        this.f16251c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T a(android.hardware.camera2.CameraCharacteristics.Key<T> r3) {
        /*
            r2 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            w.s r0 = r2.f16250b
            android.hardware.camera2.CameraCharacteristics r0 = r0.f16248a
            java.lang.Object r3 = r0.get(r3)
            return r3
        L_0x0011:
            monitor-enter(r2)
            java.util.HashMap r0 = r2.f16249a     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x001c
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r0
        L_0x001c:
            w.s r0 = r2.f16250b     // Catch:{ all -> 0x002d }
            android.hardware.camera2.CameraCharacteristics r0 = r0.f16248a     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            java.util.HashMap r1 = r2.f16249a     // Catch:{ all -> 0x002d }
            r1.put(r3, r0)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r0
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w.t.a(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }

    public final e0 b() {
        if (this.f16252d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    this.f16252d = new e0(streamConfigurationMap, new k(this.f16251c));
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f16252d;
    }
}
