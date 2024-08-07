package yk;

import java.nio.charset.Charset;
import sk.j;

/* compiled from: Charsets.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23581a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f23582b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Charset f23583c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Charset f23584d;

    static {
        Charset forName = Charset.forName("UTF-8");
        j.e(forName, "forName(\"UTF-8\")");
        f23582b = forName;
        j.e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        j.e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        j.e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        j.e(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        j.e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
