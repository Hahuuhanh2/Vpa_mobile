package c0;

import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.b;
import androidx.camera.core.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m0 implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f4308a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f4309b;

    public /* synthetic */ m0(d dVar, d dVar2) {
        this.f4308a = dVar;
        this.f4309b = dVar2;
    }

    public final void a(d dVar) {
        d dVar2 = this.f4308a;
        d dVar3 = this.f4309b;
        int i10 = ImageProcessingUtil.f1277a;
        if (dVar2 != null && dVar3 != null) {
            dVar3.close();
        }
    }
}
