package cd;

import java.nio.charset.Charset;

/* compiled from: StringUtils */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4721a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f4722b;

    static {
        boolean z10;
        String name = Charset.defaultCharset().name();
        f4721a = name;
        if ("SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4722b = z10;
    }
}
