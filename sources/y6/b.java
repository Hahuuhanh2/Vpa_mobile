package y6;

import android.accounts.Account;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import v0.d;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Account f17534a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f17535b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f17536c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f17537d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17538e;

    /* renamed from: f  reason: collision with root package name */
    public final String f17539f;

    /* renamed from: g  reason: collision with root package name */
    public final q7.a f17540g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f17541h;

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f17542a;

        /* renamed from: b  reason: collision with root package name */
        public d f17543b;

        /* renamed from: c  reason: collision with root package name */
        public String f17544c;

        /* renamed from: d  reason: collision with root package name */
        public String f17545d;
    }

    public b(Account account, d dVar, String str, String str2) {
        Set set;
        q7.a aVar = q7.a.f14371a;
        this.f17534a = account;
        if (dVar == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.unmodifiableSet(dVar);
        }
        this.f17535b = set;
        Map emptyMap = Collections.emptyMap();
        this.f17537d = emptyMap;
        this.f17538e = str;
        this.f17539f = str2;
        this.f17540g = aVar;
        HashSet hashSet = new HashSet(set);
        for (p pVar : emptyMap.values()) {
            pVar.getClass();
            hashSet.addAll((Collection) null);
        }
        this.f17536c = Collections.unmodifiableSet(hashSet);
    }
}
