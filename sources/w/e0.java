package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import c0.p0;
import java.util.HashMap;
import z.k;

/* compiled from: StreamConfigurationMapCompat */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f16200a;

    /* renamed from: b  reason: collision with root package name */
    public final k f16201b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f16202c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f16203d = new HashMap();

    public e0(StreamConfigurationMap streamConfigurationMap, k kVar) {
        new HashMap();
        this.f16200a = new f0(streamConfigurationMap);
        this.f16201b = kVar;
    }

    public final Size[] a(int i10) {
        if (!this.f16202c.containsKey(Integer.valueOf(i10))) {
            Size[] outputSizes = this.f16200a.f16212a.getOutputSizes(i10);
            if (outputSizes == null || outputSizes.length == 0) {
                p0.g("StreamConfigurationMapCompat");
                return outputSizes;
            }
            Size[] a10 = this.f16201b.a(outputSizes, i10);
            this.f16202c.put(Integer.valueOf(i10), a10);
            return (Size[]) a10.clone();
        } else if (((Size[]) this.f16202c.get(Integer.valueOf(i10))) == null) {
            return null;
        } else {
            return (Size[]) ((Size[]) this.f16202c.get(Integer.valueOf(i10))).clone();
        }
    }
}
