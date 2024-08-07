package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import ca.b;
import ca.c;
import ca.m;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kh.h;
import o9.a;
import ub.f;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.c(p9.a.class));
    }

    public List<b<?>> getComponents() {
        b.a<a> b10 = b.b(a.class);
        b10.f4614a = LIBRARY_NAME;
        b10.a(m.b(Context.class));
        b10.a(m.a(p9.a.class));
        b10.f4619f = new h(0);
        return Arrays.asList(new b[]{b10.b(), f.a(LIBRARY_NAME, "21.1.1")});
    }
}
