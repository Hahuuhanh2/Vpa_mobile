package p3;

import android.content.Context;
import java.io.File;
import sk.j;

/* compiled from: WorkDatabasePathHelper.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13918a = new a();

    public final File a(Context context) {
        j.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        j.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
