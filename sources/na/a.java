package na;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13541a;

    public /* synthetic */ a(int i10) {
        this.f13541a = i10;
    }

    public final boolean accept(File file, String str) {
        switch (this.f13541a) {
            case 0:
                if (!str.startsWith("event") || str.endsWith("_")) {
                    return false;
                }
                return true;
            default:
                return str.startsWith("event");
        }
    }
}
