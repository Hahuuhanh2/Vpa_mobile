package y4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders */
public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<h>> f17470a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Map<String, String> f17471b;

    /* compiled from: LazyHeaders */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f17472b;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, List<h>> f17473a = f17472b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = property.charAt(i10);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f17472b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* compiled from: LazyHeaders */
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f17474a;

        public b(String str) {
            this.f17474a = str;
        }

        public final String a() {
            return this.f17474a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f17474a.equals(((b) obj).f17474a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f17474a.hashCode();
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("StringHeaderFactory{value='");
            q10.append(this.f17474a);
            q10.append('\'');
            q10.append('}');
            return q10.toString();
        }
    }

    public i(Map<String, List<h>> map) {
        this.f17470a = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f17470a.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String a10 = ((h) list.get(i10)).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb2.append(a10);
                    if (i10 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(next.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final Map<String, String> b() {
        if (this.f17471b == null) {
            synchronized (this) {
                if (this.f17471b == null) {
                    this.f17471b = Collections.unmodifiableMap(a());
                }
            }
        }
        return this.f17471b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f17470a.equals(((i) obj).f17470a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17470a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("LazyHeaders{headers=");
        q10.append(this.f17470a);
        q10.append('}');
        return q10.toString();
    }
}
