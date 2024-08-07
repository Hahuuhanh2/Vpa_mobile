package okhttp3.internal.http2;

import ll.j;

/* compiled from: Header.kt */
public final class Header {

    /* renamed from: d  reason: collision with root package name */
    public static final j f22370d = j.a.b(":");

    /* renamed from: e  reason: collision with root package name */
    public static final j f22371e = j.a.b(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final j f22372f = j.a.b(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final j f22373g = j.a.b(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final j f22374h = j.a.b(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final j f22375i = j.a.b(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final j f22376a;

    /* renamed from: b  reason: collision with root package name */
    public final j f22377b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22378c;

    /* compiled from: Header.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        new Companion(0);
        j jVar = j.f20882d;
    }

    public Header(j jVar, j jVar2) {
        sk.j.f(jVar, "name");
        sk.j.f(jVar2, "value");
        this.f22376a = jVar;
        this.f22377b = jVar2;
        this.f22378c = jVar2.i() + jVar.i() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return sk.j.a(this.f22376a, header.f22376a) && sk.j.a(this.f22377b, header.f22377b);
    }

    public final int hashCode() {
        return this.f22377b.hashCode() + (this.f22376a.hashCode() * 31);
    }

    public final String toString() {
        return this.f22376a.q() + ": " + this.f22377b.q();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(j.a.b(str), j.a.b(str2));
        sk.j.f(str, "name");
        sk.j.f(str2, "value");
        j jVar = j.f20882d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Header(j jVar, String str) {
        this(jVar, j.a.b(str));
        sk.j.f(jVar, "name");
        sk.j.f(str, "value");
        j jVar2 = j.f20882d;
    }
}
