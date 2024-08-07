package y6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class u0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f17590d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f17591a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17592b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17593c;

    public u0(String str, String str2, boolean z10) {
        j.c(str);
        this.f17591a = str;
        j.c(str2);
        this.f17592b = str2;
        this.f17593c = z10;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        if (this.f17591a == null) {
            return new Intent().setComponent((ComponentName) null);
        }
        if (this.f17593c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f17591a);
            try {
                bundle = context.getContentResolver().call(f17590d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                "Dynamic intent resolution failed: ".concat(e10.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f17591a));
            }
        }
        if (intent == null) {
            return new Intent(this.f17591a).setPackage(this.f17592b);
        }
        return intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!i.a(this.f17591a, u0Var.f17591a) || !i.a(this.f17592b, u0Var.f17592b) || !i.a((Object) null, (Object) null) || this.f17593c != u0Var.f17593c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17591a, this.f17592b, null, 4225, Boolean.valueOf(this.f17593c)});
    }

    public final String toString() {
        String str = this.f17591a;
        if (str != null) {
            return str;
        }
        j.f((Object) null);
        throw null;
    }
}
