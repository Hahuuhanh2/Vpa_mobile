package g0;

import android.util.Size;
import java.util.Comparator;

/* compiled from: CompareSizesByArea */
public final class c implements Comparator<Size> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10222a;

    public c(boolean z10) {
        this.f10222a = z10;
    }

    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        if (this.f10222a) {
            return signum * -1;
        }
        return signum;
    }
}
