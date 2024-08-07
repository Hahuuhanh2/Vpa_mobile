package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class b implements DynamiteModule.a {
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.C0060a aVar) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a10 = aVar.a(context, str, true);
        bVar.f5540b = a10;
        if (a10 != 0) {
            bVar.f5541c = 1;
        } else {
            int b10 = aVar.b(context, str);
            bVar.f5539a = b10;
            if (b10 != 0) {
                bVar.f5541c = -1;
            }
        }
        return bVar;
    }
}
