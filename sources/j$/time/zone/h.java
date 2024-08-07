package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

final class h extends i {

    /* renamed from: c  reason: collision with root package name */
    private final Set f18324c;

    h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String add : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(add);
        }
        this.f18324c = Collections.unmodifiableSet(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    public final e c(String str) {
        if (this.f18324c.contains(str)) {
            return new e(TimeZone.getTimeZone(str));
        }
        throw new f("Not a built-in time zone: " + str);
    }

    /* access modifiers changed from: protected */
    public final Set d() {
        return this.f18324c;
    }
}
