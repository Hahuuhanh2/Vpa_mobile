package z6;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import w6.o;
import y6.l;
import y6.m;
import z.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class c extends b implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17891a = new a("ClientTelemetry.API", new b(), new a.g());

    public c(Context context, m mVar) {
        super(context, f17891a, mVar, b.a.f5354c);
    }

    public final Task<Void> a(TelemetryData telemetryData) {
        o.a aVar = new o.a();
        aVar.f16641c = new Feature[]{zaf.zaa};
        aVar.f16640b = false;
        aVar.f16639a = new j(telemetryData, 7);
        return doBestEffortWrite(aVar.a());
    }
}
