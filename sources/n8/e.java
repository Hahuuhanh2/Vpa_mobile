package n8;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import w1.a;
import x1.f;

/* compiled from: BaseTransientBottomBar */
public final class e extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f13527d;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f13527d = baseTransientBottomBar;
    }

    public final void d(View view, f fVar) {
        this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
        fVar.a(1048576);
        fVar.f16862a.setDismissable(true);
    }

    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 1048576) {
            return super.g(view, i10, bundle);
        }
        this.f13527d.a();
        return true;
    }
}
