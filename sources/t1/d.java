package t1;

import com.luck.picture.lib.entity.LocalMediaFolder;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import ka.b0;
import na.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14761a;

    public /* synthetic */ d(int i10) {
        this.f14761a = i10;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f14761a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
                return ((b0.c) obj).a().compareTo(((b0.c) obj2).a());
            case 2:
                Charset charset = b.f13542e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                LocalMediaFolder localMediaFolder = (LocalMediaFolder) obj;
                LocalMediaFolder localMediaFolder2 = (LocalMediaFolder) obj2;
                if (localMediaFolder.a() == null || localMediaFolder2.a() == null) {
                    return 0;
                }
                return Integer.compare(localMediaFolder2.f8095e, localMediaFolder.f8095e);
        }
    }
}
