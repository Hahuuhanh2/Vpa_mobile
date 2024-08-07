package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import c0.i0;
import c6.g;
import ca.b;
import ca.m;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import ub.f;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<b<?>> getComponents() {
        b.a<g> b10 = b.b(g.class);
        b10.f4614a = LIBRARY_NAME;
        b10.a(m.b(Context.class));
        b10.f4619f = new i0(2);
        return Arrays.asList(new b[]{b10.b(), f.a(LIBRARY_NAME, "18.1.8")});
    }
}
