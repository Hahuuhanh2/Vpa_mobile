package d6;

import c6.b;
import f6.l;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p3.l0;

/* compiled from: CCTDestination */
public final class a implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final String f8750c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<b> f8751d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{new b("proto"), new b("json")})));

    /* renamed from: e  reason: collision with root package name */
    public static final a f8752e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f8753f;

    /* renamed from: a  reason: collision with root package name */
    public final String f8754a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8755b;

    static {
        String l02 = l0.l0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f8750c = l02;
        String l03 = l0.l0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String l04 = l0.l0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8752e = new a(l02, (String) null);
        f8753f = new a(l03, l04);
    }

    public a(String str, String str2) {
        this.f8754a = str;
        this.f8755b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public final byte[] b() {
        String str = this.f8755b;
        if (str == null && this.f8754a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f8754a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
