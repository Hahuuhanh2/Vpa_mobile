package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* compiled from: StreamConfigurationMapCompatBaseImpl */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final StreamConfigurationMap f16212a;

    /* compiled from: StreamConfigurationMapCompatBaseImpl */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    public g0(StreamConfigurationMap streamConfigurationMap) {
        this.f16212a = streamConfigurationMap;
    }
}
