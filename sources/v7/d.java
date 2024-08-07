package v7;

import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.b;

/* compiled from: BottomSheetDialog */
public final class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16079a;

    public d(b bVar) {
        this.f16079a = bVar;
    }

    public final void onClick(View view) {
        b bVar = this.f16079a;
        if (bVar.f5867q && bVar.isShowing()) {
            b bVar2 = this.f16079a;
            if (!bVar2.f5869s) {
                TypedArray obtainStyledAttributes = bVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                bVar2.f5868r = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                bVar2.f5869s = true;
            }
            if (bVar2.f5868r) {
                this.f16079a.cancel();
            }
        }
    }
}
