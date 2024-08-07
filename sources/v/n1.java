package v;

import android.util.Size;
import com.luck.picture.lib.entity.LocalMedia;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import na.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n1 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15755a;

    public /* synthetic */ n1(int i10) {
        this.f15755a = i10;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f15755a) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 1:
                Charset charset = b.f13542e;
                String name = ((File) obj).getName();
                int i10 = b.f13543f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            default:
                return Long.compare(((LocalMedia) obj2).L, ((LocalMedia) obj).L);
        }
    }
}
