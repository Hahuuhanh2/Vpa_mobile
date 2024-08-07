package c0;

import android.media.ImageReader;
import f0.d0;
import java.util.concurrent.Executor;
import v.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4175a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f4176b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d0.a f4177c;

    public /* synthetic */ a(b bVar, Executor executor, d0.a aVar) {
        this.f4175a = bVar;
        this.f4176b = executor;
        this.f4177c = aVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        b bVar = this.f4175a;
        Executor executor = this.f4176b;
        d0.a aVar = this.f4177c;
        synchronized (bVar.f4182b) {
            if (!bVar.f4183c) {
                executor.execute(new n(7, bVar, aVar));
            }
        }
    }
}
