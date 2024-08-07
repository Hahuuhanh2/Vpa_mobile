package c7;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import w6.o;
import x2.g;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class p extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4584a = new a("ModuleInstall.API", new k(), new a.g());

    public p(Context context) {
        super(context, f4584a, a.d.f5353j, b.a.f5354c);
    }

    public final Task<ModuleAvailabilityResponse> a(v6.b... bVarArr) {
        boolean z10;
        if (r0 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.a("Please provide at least one OptionalModuleApi.", z10);
        for (v6.b g2 : bVarArr) {
            j.g(g2, "Requested API must not be null.");
        }
        ApiFeatureRequest P0 = ApiFeatureRequest.P0(Arrays.asList(bVarArr), false);
        if (P0.f5451a.isEmpty()) {
            return Tasks.forResult(new ModuleAvailabilityResponse(0, true));
        }
        o.a aVar = new o.a();
        aVar.f16641c = new Feature[]{zav.zaa};
        aVar.f16642d = 27301;
        aVar.f16640b = false;
        aVar.f16639a = new g(4, this, P0);
        return doRead(aVar.a());
    }
}
