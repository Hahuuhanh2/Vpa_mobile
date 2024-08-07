package e0;

import androidx.camera.core.ImageCaptureException;
import v1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9014a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f9015b;

    public /* synthetic */ j(l lVar, int i10) {
        this.f9014a = i10;
        this.f9015b = lVar;
    }

    public final void accept(Object obj) {
        switch (this.f9014a) {
            case 0:
                this.f9015b.c((w) obj);
                return;
            default:
                this.f9015b.d((ImageCaptureException) obj);
                return;
        }
    }
}
