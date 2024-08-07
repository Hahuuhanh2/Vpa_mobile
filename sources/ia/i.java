package ia;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11312a;

    public /* synthetic */ i(int i10) {
        this.f11312a = i10;
    }

    public final boolean accept(File file, String str) {
        switch (this.f11312a) {
            case 0:
                return str.startsWith("aqs.");
            default:
                return str.startsWith(".ae");
        }
    }
}
