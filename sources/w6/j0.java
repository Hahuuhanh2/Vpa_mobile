package w6;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import y6.a;
import y6.k;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class j0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f16609a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16610b;

    /* renamed from: c  reason: collision with root package name */
    public final a f16611c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16612d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16613e;

    @VisibleForTesting
    public j0(d dVar, int i10, a aVar, long j10, long j11) {
        this.f16609a = dVar;
        this.f16610b = i10;
        this.f16611c = aVar;
        this.f16612d = j10;
        this.f16613e = j11;
    }

    public static ConnectionTelemetryConfiguration a(b0 b0Var, a aVar, int i10) {
        ConnectionTelemetryConfiguration telemetryConfiguration = aVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f5384b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f5386d;
        boolean z10 = false;
        if (iArr == null) {
            int[] iArr2 = telemetryConfiguration.f5388f;
            if (iArr2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= iArr2.length) {
                        break;
                    } else if (iArr2[i11] == i10) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z10) {
                    return null;
                }
            }
        } else {
            int i12 = 0;
            while (true) {
                if (i12 >= iArr.length) {
                    break;
                } else if (iArr[i12] == i10) {
                    z10 = true;
                    break;
                } else {
                    i12++;
                }
            }
            if (!z10) {
                return null;
            }
        }
        if (b0Var.f16557o < telemetryConfiguration.f5387e) {
            return telemetryConfiguration;
        }
        return null;
    }

    public final void onComplete(Task task) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long j11;
        int i15;
        if (this.f16609a.b()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = k.a().f17567a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f5415b) {
                b0 b0Var = (b0) this.f16609a.f16578j.get(this.f16611c);
                if (b0Var != null) {
                    a.f fVar = b0Var.f16547b;
                    if (fVar instanceof y6.a) {
                        y6.a aVar = (y6.a) fVar;
                        boolean z11 = true;
                        int i16 = 0;
                        if (this.f16612d > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int gCoreServiceId = aVar.getGCoreServiceId();
                        if (rootTelemetryConfiguration != null) {
                            boolean z12 = z10 & rootTelemetryConfiguration.f5416c;
                            int i17 = rootTelemetryConfiguration.f5417d;
                            int i18 = rootTelemetryConfiguration.f5418e;
                            i12 = rootTelemetryConfiguration.f5414a;
                            if (aVar.hasConnectionInfo() && !aVar.isConnecting()) {
                                ConnectionTelemetryConfiguration a10 = a(b0Var, aVar, this.f16610b);
                                if (a10 != null) {
                                    if (!a10.f5385c || this.f16612d <= 0) {
                                        z11 = false;
                                    }
                                    i18 = a10.f5387e;
                                    z12 = z11;
                                } else {
                                    return;
                                }
                            }
                            i11 = i17;
                            i10 = i18;
                        } else {
                            i12 = 0;
                            i10 = 100;
                            i11 = 5000;
                        }
                        d dVar = this.f16609a;
                        if (task.isSuccessful()) {
                            i13 = 0;
                        } else {
                            if (task.isCanceled()) {
                                i16 = 100;
                            } else {
                                Exception exception = task.getException();
                                if (exception instanceof ApiException) {
                                    Status status = ((ApiException) exception).getStatus();
                                    int i19 = status.f5345a;
                                    ConnectionResult connectionResult = status.f5348d;
                                    if (connectionResult == null) {
                                        i15 = -1;
                                    } else {
                                        i15 = connectionResult.f5321b;
                                    }
                                    i13 = i15;
                                    i16 = i19;
                                } else {
                                    i16 = 101;
                                }
                            }
                            i13 = -1;
                        }
                        if (z10) {
                            long j12 = this.f16612d;
                            long currentTimeMillis = System.currentTimeMillis();
                            i14 = (int) (SystemClock.elapsedRealtime() - this.f16613e);
                            j11 = j12;
                            j10 = currentTimeMillis;
                        } else {
                            j11 = 0;
                            j10 = 0;
                            i14 = -1;
                        }
                        MethodInvocation methodInvocation = new MethodInvocation(this.f16610b, i16, i13, j11, j10, (String) null, (String) null, gCoreServiceId, i14);
                        long j13 = (long) i11;
                        zau zau = dVar.f16582n;
                        zau.sendMessage(zau.obtainMessage(18, new k0(methodInvocation, i12, j13, i10)));
                    }
                }
            }
        }
    }
}
