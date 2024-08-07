package com.google.mlkit.vision.common.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import y6.j;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7862a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.mlkit:vision-common@@17.3.0 */
    public static class C0073a {
    }

    public a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0073a) it.next()).getClass();
            if (this.f7862a.containsKey((Object) null)) {
                Integer num = (Integer) hashMap.get((Object) null);
                j.f(num);
                if (num.intValue() > 0) {
                }
            }
            this.f7862a.put((Object) null, (Object) null);
            hashMap.put((Object) null, 0);
        }
    }
}
