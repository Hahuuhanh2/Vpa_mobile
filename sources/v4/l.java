package v4;

import android.graphics.Bitmap;
import android.os.Build;
import h4.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy */
public final class l implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f16056d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f16057e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f16058f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f16059g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f16060h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f16061a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final f<b, Bitmap> f16062b = new f<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f16063c = new HashMap();

    /* compiled from: SizeConfigStrategy */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16064a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16064a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16064a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16064a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16064a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.l.a.<clinit>():void");
        }
    }

    /* compiled from: SizeConfigStrategy */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final c f16065a;

        /* renamed from: b  reason: collision with root package name */
        public int f16066b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f16067c;

        public b(c cVar) {
            this.f16065a = cVar;
        }

        public final void a() {
            this.f16065a.i(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f16066b != bVar.f16066b || !o5.l.b(this.f16067c, bVar.f16067c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f16066b * 31;
            Bitmap.Config config = this.f16067c;
            if (config != null) {
                i10 = config.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public final String toString() {
            return l.c(this.f16066b, this.f16067c);
        }
    }

    /* compiled from: SizeConfigStrategy */
    public static class c extends i {
        public final k d() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f16056d = configArr;
        f16057e = configArr;
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d10.remove(num);
        } else {
            d10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d10 = o5.l.d(config) * i10 * i11;
        b bVar = (b) this.f16061a.f();
        bVar.f16066b = d10;
        bVar.f16067c = config;
        int i12 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i13 = a.f16064a[config.ordinal()];
            if (i13 == 1) {
                configArr = f16056d;
            } else if (i13 == 2) {
                configArr = f16058f;
            } else if (i13 != 3) {
                configArr = i13 != 4 ? new Bitmap.Config[]{config} : f16060h;
            } else {
                configArr = f16059g;
            }
        } else {
            configArr = f16057e;
        }
        int length = configArr.length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i12];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(d10));
            if (ceilingKey == null || ceilingKey.intValue() > d10 * 8) {
                i12++;
            } else if (ceilingKey.intValue() != d10 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f16061a.i(bVar);
                c cVar = this.f16061a;
                int intValue = ceilingKey.intValue();
                bVar = (b) cVar.f();
                bVar.f16066b = intValue;
                bVar.f16067c = config2;
            }
        }
        Bitmap a10 = this.f16062b.a(bVar);
        if (a10 != null) {
            a(Integer.valueOf(bVar.f16066b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f16063c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f16063c.put(config, treeMap);
        return treeMap;
    }

    public final String e(Bitmap bitmap) {
        return c(o5.l.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c10 = o5.l.c(bitmap);
        c cVar = this.f16061a;
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) cVar.f();
        bVar.f16066b = c10;
        bVar.f16067c = config;
        this.f16062b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(bVar.f16066b));
        Integer valueOf = Integer.valueOf(bVar.f16066b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("SizeConfigStrategy{groupedMap=");
        q10.append(this.f16062b);
        q10.append(", sortedSizes=(");
        for (Map.Entry entry : this.f16063c.entrySet()) {
            q10.append(entry.getKey());
            q10.append('[');
            q10.append(entry.getValue());
            q10.append("], ");
        }
        if (!this.f16063c.isEmpty()) {
            q10.replace(q10.length() - 2, q10.length(), "");
        }
        q10.append(")}");
        return q10.toString();
    }
}
