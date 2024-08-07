package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.n;
import j9.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static volatile i f7392b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f7393c = new i(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, n.e<?, ?>> f7394a;

    /* compiled from: ExtensionRegistryLite */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f7395a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7396b;

        public a(Object obj, int i10) {
            this.f7395a = obj;
            this.f7396b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7395a == aVar.f7395a && this.f7396b == aVar.f7396b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f7395a) * 65535) + this.f7396b;
        }
    }

    public i() {
        this.f7394a = new HashMap();
    }

    public static i a() {
        i iVar = f7392b;
        if (iVar == null) {
            synchronized (i.class) {
                iVar = f7392b;
                if (iVar == null) {
                    Class<?> cls = e.f11752a;
                    i iVar2 = null;
                    if (cls != null) {
                        try {
                            iVar2 = (i) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (iVar2 == null) {
                        iVar2 = f7393c;
                    }
                    f7392b = iVar2;
                    iVar = iVar2;
                }
            }
        }
        return iVar;
    }

    public i(int i10) {
        this.f7394a = Collections.emptyMap();
    }
}
