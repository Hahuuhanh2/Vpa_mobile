package ee;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: PictureSelectorPreviewFragment */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9406a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f9407b;

    public s(t tVar, boolean z10) {
        this.f9407b = tVar;
        this.f9406a = z10;
    }

    @SuppressLint({"WrongConstant"})
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f9407b;
        boolean z10 = false;
        tVar.C0 = false;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        }
        if (z10 && tVar.C()) {
            Window window = this.f9407b.c0().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (this.f9406a) {
                attributes.flags |= 1024;
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
                window.addFlags(512);
                return;
            }
            attributes.flags &= -1025;
            window.setAttributes(attributes);
            window.clearFlags(512);
        }
    }
}
