package qc;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrw;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.h;
import nc.b;
import u6.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class e extends lc.e {

    /* renamed from: a  reason: collision with root package name */
    public final h f14413a;

    public e(h hVar) {
        this.f14413a = hVar;
    }

    public final Object create(Object obj) {
        String str;
        i iVar;
        b bVar = (b) obj;
        Context b10 = this.f14413a.b();
        boolean z10 = true;
        if (true != b.c()) {
            str = "play-services-mlkit-barcode-scanning";
        } else {
            str = "barcode-scanning";
        }
        zzrl zzb = zzrw.zzb(str);
        zzcd zzcd = k.f14430h;
        int i10 = 0;
        if (DynamiteModule.a(b10, "com.google.mlkit.dynamite.barcode") <= 0) {
            z10 = false;
        }
        if (!z10) {
            u6.b.f15290b.getClass();
            AtomicBoolean atomicBoolean = d.f15292a;
            try {
                i10 = b10.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (i10 < 204500000) {
                iVar = new m(b10, bVar, zzb);
                return new h(this.f14413a, bVar, iVar, zzb);
            }
        }
        iVar = new k(b10, bVar, zzb);
        return new h(this.f14413a, bVar, iVar, zzb);
    }
}
