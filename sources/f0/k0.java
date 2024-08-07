package f0;

import androidx.camera.core.impl.i;
import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9562a;

    public /* synthetic */ k0(int i10) {
        this.f9562a = i10;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f9562a) {
            case 0:
                return ((i.a) obj).b().compareTo(((i.a) obj2).b());
            default:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    }
}
