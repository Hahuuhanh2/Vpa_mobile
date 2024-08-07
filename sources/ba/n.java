package ba;

import a7.a;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.p001firebaseauthapi.zzab;
import com.google.android.gms.internal.p001firebaseauthapi.zzj;
import com.google.android.gms.internal.p001firebaseauthapi.zzzr;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import v0.b;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4121a = new a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        byte[] bArr;
        j.c(str);
        List zzd = zzab.zzb(zzj.zzb('.')).zzd(str);
        if (zzd.size() < 2) {
            f4121a.a("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        String str2 = (String) zzd.get(1);
        try {
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(str2, 11);
            }
            b c10 = c(new String(bArr, "UTF-8"));
            if (c10 == null) {
                return new HashMap();
            }
            return c10;
        } catch (UnsupportedEncodingException unused) {
            f4121a.a("Unable to decode token", new Object[0]);
            return new HashMap();
        }
    }

    public static b c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            throw new zzzr(e10);
        }
    }

    public static b d(JSONObject jSONObject) {
        b bVar = new b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            bVar.put(next, obj);
        }
        return bVar;
    }
}
