package androidx.profileinstaller;

import java.io.File;

/* compiled from: BenchmarkOperation */
public final class a {
    public static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File a10 : listFiles) {
                if (!a(a10) || !z10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            return z10;
        }
        file.delete();
        return true;
    }
}
