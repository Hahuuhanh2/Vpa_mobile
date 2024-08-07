package g;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import g.a;
import sk.j;

/* compiled from: ActivityResultContracts.kt */
public final class c extends a<String, Boolean> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        j.f(componentActivity, "context");
        j.f(str, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        j.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    public final a.C0108a b(ComponentActivity componentActivity, Object obj) {
        boolean z10;
        String str = (String) obj;
        j.f(componentActivity, "context");
        j.f(str, "input");
        if (k1.a.checkSelfPermission(componentActivity, str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0108a(Boolean.TRUE);
        }
        return null;
    }

    public final Object c(Intent intent, int i10) {
        boolean z10;
        boolean z11;
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z12 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                if (intArrayExtra[i11] == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (z10) {
                z12 = true;
            }
        }
        return Boolean.valueOf(z12);
    }
}
