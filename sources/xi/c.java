package xi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import vb.e;
import wb.f;

/* compiled from: HelperUtils.kt */
public final class c implements jf.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f23479a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f23480b;

    public c(e eVar, Activity activity) {
        this.f23479a = eVar;
        this.f23480b = activity;
    }

    public final void a(boolean z10) {
        if (z10) {
            f fVar = this.f23479a.f16149h;
            String d10 = f.d(fVar.f16780c, "VPA_UPDATE_LINK");
            if (d10 != null) {
                fVar.a(f.b(fVar.f16780c), "VPA_UPDATE_LINK");
            } else {
                d10 = f.d(fVar.f16781d, "VPA_UPDATE_LINK");
                if (d10 == null) {
                    f.e("VPA_UPDATE_LINK", "String");
                    d10 = "";
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(d10));
            this.f23480b.startActivity(intent);
        }
    }
}
