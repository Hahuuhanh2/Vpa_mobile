package yd;

import android.hardware.Camera;
import xd.h;
import yd.e;

/* compiled from: CameraInstance */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f17673a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f17674b;

    /* compiled from: CameraInstance */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            c cVar = c.this;
            e eVar = cVar.f17674b.f17679c;
            l lVar = cVar.f17673a;
            Camera camera = eVar.f17695a;
            if (camera != null && eVar.f17699e) {
                e.a aVar = eVar.f17707m;
                aVar.f17708a = lVar;
                camera.setOneShotPreviewCallback(aVar);
            }
        }
    }

    public c(d dVar, h.b bVar) {
        this.f17674b = dVar;
        this.f17673a = bVar;
    }

    public final void run() {
        d dVar = this.f17674b;
        if (!dVar.f17682f) {
            int i10 = d.f17676n;
        } else {
            dVar.f17677a.b(new a());
        }
    }
}
