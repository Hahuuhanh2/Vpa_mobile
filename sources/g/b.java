package g;

import al.g0;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import ek.e;
import fk.h;
import fk.s;
import g.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import sk.j;

/* compiled from: ActivityResultContracts.kt */
public final class b extends a<String[], Map<String, Boolean>> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        j.f(componentActivity, "context");
        j.f(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        j.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    public final a.C0108a b(ComponentActivity componentActivity, Object obj) {
        boolean z10;
        boolean z11;
        String[] strArr = (String[]) obj;
        j.f(componentActivity, "context");
        j.f(strArr, "input");
        boolean z12 = true;
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0108a(s.f20214a);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (k1.a.checkSelfPermission(componentActivity, strArr[i10]) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = false;
                break;
            }
            i10++;
        }
        if (!z12) {
            return null;
        }
        int d02 = g0.d0(strArr.length);
        if (d02 < 16) {
            d02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d02);
        for (String put : strArr) {
            linkedHashMap.put(put, Boolean.TRUE);
        }
        return new a.C0108a(linkedHashMap);
    }

    public final Object c(Intent intent, int i10) {
        boolean z10;
        if (i10 != -1) {
            return s.f20214a;
        }
        if (intent == null) {
            return s.f20214a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return s.f20214a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList.add(Boolean.valueOf(z10));
        }
        ArrayList r02 = h.r0(stringArrayExtra);
        Iterator it = r02.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(fk.j.H0(r02), fk.j.H0(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new e(it.next(), it2.next()));
        }
        return h.A0(arrayList2);
    }
}
