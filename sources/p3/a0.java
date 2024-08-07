package p3;

import al.g0;
import android.content.Context;
import ek.e;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import sk.j;

/* compiled from: WorkDatabasePathHelper.kt */
public final class a0 {
    public static final void a(Context context) {
        LinkedHashMap linkedHashMap;
        j.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        j.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            o3.j a10 = o3.j.a();
            String[] strArr = b0.f13920a;
            a10.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            j.e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(a.f13918a.a(context), "androidx.work.workdb");
            String[] strArr2 = b0.f13920a;
            int d02 = g0.d0(strArr2.length);
            if (d02 < 16) {
                d02 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(d02);
            for (String str : strArr2) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            e eVar = new e(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = g0.e0(eVar);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        o3.j a11 = o3.j.a();
                        String[] strArr3 = b0.f13920a;
                        file3.toString();
                        a11.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    o3.j a12 = o3.j.a();
                    String[] strArr4 = b0.f13920a;
                    a12.getClass();
                }
            }
        }
    }
}
