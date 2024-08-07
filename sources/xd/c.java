package xd;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.journeyapps.barcodescanner.CameraPreview;

/* compiled from: CameraPreview */
public final class c implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraPreview f17287a;

    public c(CameraPreview cameraPreview) {
        this.f17287a = cameraPreview;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        CameraPreview cameraPreview = this.f17287a;
        cameraPreview.f7986w = new n(i10, i11);
        cameraPreview.h();
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
