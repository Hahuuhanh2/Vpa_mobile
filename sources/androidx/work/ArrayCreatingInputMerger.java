package androidx.work;

import androidx.work.c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o3.f;
import sk.j;

/* compiled from: ArrayCreatingInputMerger.kt */
public final class ArrayCreatingInputMerger extends f {
    public final c a(ArrayList arrayList) {
        Class cls;
        Object newInstance;
        c.a aVar = new c.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((c) it.next()).f3754a);
            j.e(unmodifiableMap, "input.keyValueMap");
            Iterator it2 = unmodifiableMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        cls = value.getClass();
                    } else {
                        cls = String.class;
                    }
                    Object obj = hashMap.get(str);
                    j.e(str, "key");
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (j.a(cls2, cls)) {
                            j.e(value, "value");
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Class<?> componentType = obj.getClass().getComponentType();
                            j.c(componentType);
                            Object newInstance2 = Array.newInstance(componentType, length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            j.e(newInstance2, "newArray");
                            value = newInstance2;
                            j.e(value, "if (existingValue == nul…      }\n                }");
                            hashMap.put(str, value);
                        } else if (j.a(cls2.getComponentType(), cls)) {
                            int length3 = Array.getLength(obj);
                            newInstance = Array.newInstance(cls, length3 + 1);
                            System.arraycopy(obj, 0, newInstance, 0, length3);
                            Array.set(newInstance, length3, value);
                            j.e(newInstance, "newArray");
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (cls.isArray()) {
                        j.e(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    } else {
                        newInstance = Array.newInstance(cls, 1);
                        Array.set(newInstance, 0, value);
                        j.e(newInstance, "newArray");
                    }
                    value = newInstance;
                    j.e(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        aVar.a(hashMap);
        c cVar = new c(aVar.f3755a);
        c.b(cVar);
        return cVar;
    }
}
