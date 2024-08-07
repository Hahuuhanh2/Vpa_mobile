package b5;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import b5.r;
import q4.a;
import s4.h;
import s4.j;
import v4.c;

/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class u implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4071a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4072b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f4071a = i10;
        this.f4072b = obj;
    }

    public final u4.u a(Object obj, int i10, int i11, h hVar) {
        switch (this.f4071a) {
            case 0:
                l lVar = (l) this.f4072b;
                return lVar.a(new r.c((ParcelFileDescriptor) obj, lVar.f4042d, lVar.f4041c), i10, i11, hVar, l.f4037k);
            default:
                return d.d(((a) obj).b(), (c) this.f4072b);
        }
    }

    public final boolean b(Object obj, h hVar) {
        boolean z10;
        switch (this.f4071a) {
            case 0:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
                ((l) this.f4072b).getClass();
                return true;
            default:
                a aVar = (a) obj;
                return true;
        }
    }
}
