package te;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import je.h;

/* compiled from: PermissionChecker */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f15022a;

    public static boolean a(Context context, String[] strArr) {
        if (strArr != null) {
            for (String checkSelfPermission : strArr) {
                if (k1.a.checkSelfPermission(context.getApplicationContext(), checkSelfPermission) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static a b() {
        if (f15022a == null) {
            synchronized (a.class) {
                if (f15022a == null) {
                    f15022a = new a();
                }
            }
        }
        return f15022a;
    }

    public static boolean c(Context context, int i10) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return a(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
        }
        if (i10 == 1) {
            return a(context, new String[]{"android.permission.READ_MEDIA_IMAGES"});
        }
        if (i10 == 2) {
            return a(context, new String[]{"android.permission.READ_MEDIA_VIDEO"});
        }
        if (i10 == 3) {
            return a(context, new String[]{"android.permission.READ_MEDIA_AUDIO"});
        }
        if (!a(context, new String[]{"android.permission.READ_MEDIA_IMAGES"}) || !a(context, new String[]{"android.permission.READ_MEDIA_VIDEO"})) {
            return false;
        }
        return true;
    }

    public static void d(Fragment fragment, String[] strArr, c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr);
        if (!j7.a.T(fragment.m()) && (fragment instanceof h)) {
            FragmentActivity m10 = fragment.m();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (String str : (String[]) it.next()) {
                    if (k1.a.checkSelfPermission(m10, str) != 0) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2.size() > 0) {
                ((h) fragment).f11874e0 = cVar;
                String[] strArr2 = new String[arrayList2.size()];
                arrayList2.toArray(strArr2);
                fragment.b0(strArr2);
                i1.a.a(m10, strArr2, 10086);
                return;
            }
            cVar.a();
        }
    }
}
