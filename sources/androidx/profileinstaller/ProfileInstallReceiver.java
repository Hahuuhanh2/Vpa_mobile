package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.c;
import java.io.File;
import n.b;
import q.e;

public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements c.C0027c {
        public a() {
        }

        public final void a() {
        }

        public final void b(int i10, Object obj) {
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Throwable th2 = (Throwable) obj;
            }
            ProfileInstallReceiver.this.setResultCode(i10);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File file;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                c.b(context, new b(1), new a(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        w2.b bVar = new w2.b(0);
                        a aVar = new a();
                        try {
                            c.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            bVar.execute(new e(aVar, 10, 3, (Object) null));
                        } catch (PackageManager.NameNotFoundException e10) {
                            bVar.execute(new e(aVar, 7, 3, e10));
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        a aVar2 = new a();
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new e(aVar2, 11, 3, (Object) null).run();
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    setResultCode(12);
                    return;
                }
                setResultCode(13);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        file = context.createDeviceProtectedStorageContext().getCodeCacheDir();
                    } else {
                        file = context.getCodeCacheDir();
                    }
                    if (a.a(file)) {
                        setResultCode(14);
                    } else {
                        setResultCode(15);
                    }
                } else {
                    setResultCode(16);
                }
            }
        }
    }
}
