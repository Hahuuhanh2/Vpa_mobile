package sc;

import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import y6.e;
import y6.j;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final e f14726c = new e("StreamingFormatChecker", "");

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f14727a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public long f14728b = -1;

    public final void a(rc.a aVar) {
        String str;
        if (aVar.f14569f == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f14727a.add(Long.valueOf(elapsedRealtime));
            if (this.f14727a.size() > 5) {
                this.f14727a.removeFirst();
            }
            if (this.f14727a.size() == 5) {
                Long l10 = (Long) this.f14727a.peekFirst();
                j.f(l10);
                if (elapsedRealtime - l10.longValue() < 5000) {
                    long j10 = this.f14728b;
                    if (j10 == -1 || elapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5)) {
                        this.f14728b = elapsedRealtime;
                        e eVar = f14726c;
                        if (Log.isLoggable(eVar.f17554a, 5) && (str = eVar.f17555b) != null) {
                            str.concat("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                        }
                    }
                }
            }
        }
    }
}
