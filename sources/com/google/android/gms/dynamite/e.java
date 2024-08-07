package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class e implements DynamiteModule.a {
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.C0060a aVar) {
        int i10;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b10 = aVar.b(context, str);
        bVar.f5539a = b10;
        int i11 = 1;
        int i12 = 0;
        if (b10 != 0) {
            i10 = aVar.a(context, str, false);
            bVar.f5540b = i10;
        } else {
            i10 = aVar.a(context, str, true);
            bVar.f5540b = i10;
        }
        int i13 = bVar.f5539a;
        if (i13 != 0) {
            i12 = i13;
        } else if (i10 == 0) {
            i11 = 0;
            bVar.f5541c = i11;
            return bVar;
        }
        if (i12 >= i10) {
            i11 = -1;
        }
        bVar.f5541c = i11;
        return bVar;
    }
}
