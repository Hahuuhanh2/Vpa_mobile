package j$.time.zone;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f18325a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f18326b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f18325a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected i() {
    }

    public static HashSet a() {
        return new HashSet(f18326b.keySet());
    }

    public static e b(String str, boolean z10) {
        if (str != null) {
            ConcurrentHashMap concurrentHashMap = f18326b;
            i iVar = (i) concurrentHashMap.get(str);
            if (iVar != null) {
                return iVar.c(str);
            }
            if (concurrentHashMap.isEmpty()) {
                throw new f("No time-zone data files registered");
            }
            throw new f("Unknown time-zone ID: " + str);
        }
        throw new NullPointerException("zoneId");
    }

    public static void e(i iVar) {
        if (iVar != null) {
            for (String str : iVar.d()) {
                if (str == null) {
                    throw new NullPointerException("zoneId");
                } else if (((i) f18326b.putIfAbsent(str, iVar)) != null) {
                    throw new f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
                }
            }
            f18325a.add(iVar);
            return;
        }
        throw new NullPointerException("provider");
    }

    /* access modifiers changed from: protected */
    public abstract e c(String str);

    /* access modifiers changed from: protected */
    public abstract Set d();
}
