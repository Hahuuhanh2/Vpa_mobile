package m6;

import f0.b0;

/* compiled from: EventStoreConfig */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13150a;

    static {
        String str;
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        if (l10 == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (num == null) {
            str = b0.r(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = b0.r(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = b0.r(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = b0.r(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f13150a = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue());
            return;
        }
        throw new IllegalStateException(b0.r("Missing required properties:", str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
