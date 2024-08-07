package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class d implements DynamiteModule.a {
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.C0060a aVar) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.f5539a = aVar.b(context, str);
        int i10 = 1;
        int a10 = aVar.a(context, str, true);
        bVar.f5540b = a10;
        int i11 = bVar.f5539a;
        if (i11 == 0) {
            if (a10 == 0) {
                i10 = 0;
                bVar.f5541c = i10;
                return bVar;
            }
            i11 = 0;
        }
        if (i11 >= a10) {
            i10 = -1;
        }
        bVar.f5541c = i10;
        return bVar;
    }
}
