package xd;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.a;

/* compiled from: RotationListener */
public final class l extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f17305a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context, 3);
        this.f17305a = mVar;
    }

    public final void onOrientationChanged(int i10) {
        m mVar = this.f17305a;
        WindowManager windowManager = mVar.f17307b;
        k kVar = mVar.f17309d;
        if (windowManager != null && kVar != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            m mVar2 = this.f17305a;
            if (rotation != mVar2.f17306a) {
                mVar2.f17306a = rotation;
                CameraPreview.c cVar = (CameraPreview.c) kVar;
                CameraPreview.this.f7973c.postDelayed(new a(cVar), 250);
            }
        }
    }
}
