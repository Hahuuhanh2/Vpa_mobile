package ee;

import android.widget.ImageView;
import com.luck.picture.lib.entity.LocalMedia;
import fe.e;
import ge.b;

/* compiled from: PictureSelectorPreviewFragment */
public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f9401a;

    public o(t tVar) {
        this.f9401a = tVar;
    }

    public final void run() {
        LocalMedia localMedia;
        t tVar = this.f9401a;
        e eVar = tVar.f9411r0;
        int i10 = tVar.f9415v0;
        b u10 = eVar.u(i10);
        if (u10 != null) {
            if (i10 > eVar.f10207d.size()) {
                localMedia = null;
            } else {
                localMedia = eVar.f10207d.get(i10);
            }
            if (localMedia.f8090z == 0 && localMedia.A == 0) {
                u10.f10459z.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                u10.f10459z.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }
}
