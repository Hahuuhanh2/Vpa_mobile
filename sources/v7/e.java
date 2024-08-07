package v7;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.b;
import w1.a;
import x1.f;

/* compiled from: BottomSheetDialog */
public final class e extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f16080d;

    public e(b bVar) {
        this.f16080d = bVar;
    }

    public final void d(View view, f fVar) {
        this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
        if (this.f16080d.f5867q) {
            fVar.a(1048576);
            fVar.f16862a.setDismissable(true);
            return;
        }
        fVar.f16862a.setDismissable(false);
    }

    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            b bVar = this.f16080d;
            if (bVar.f5867q) {
                bVar.cancel();
                return true;
            }
        }
        return super.g(view, i10, bundle);
    }
}
