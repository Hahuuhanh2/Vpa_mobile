package ee;

import android.net.Uri;
import com.luck.picture.lib.entity.LocalMedia;
import f.a;
import xe.i;

/* compiled from: PictureSelectorSystemFragment */
public final class d0 implements a<Uri> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f9389a;

    public d0(b0 b0Var) {
        this.f9389a = b0Var;
    }

    public final void b(Object obj) {
        String str;
        Uri uri = (Uri) obj;
        if (uri == null) {
            this.f9389a.C0();
            return;
        }
        b0 b0Var = this.f9389a;
        String uri2 = uri.toString();
        String str2 = b0.f9362s0;
        LocalMedia i02 = b0Var.i0(uri2);
        if (i.a()) {
            str = i02.f8073b;
        } else {
            str = i02.f8074c;
        }
        i02.f8073b = str;
        if (this.f9389a.l0(i02, false) == 0) {
            this.f9389a.n0();
        } else {
            this.f9389a.C0();
        }
    }
}
