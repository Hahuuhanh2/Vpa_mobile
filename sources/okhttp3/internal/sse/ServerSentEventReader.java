package okhttp3.internal.sse;

import ll.f;
import ll.i;
import ll.j;
import ll.s;
import okhttp3.internal.Util;

/* compiled from: ServerSentEventReader.kt */
public final class ServerSentEventReader {

    /* renamed from: d  reason: collision with root package name */
    public static final s f22603d = s.a.b(j.a.b("\r\n"), j.a.b("\r"), j.a.b("\n"), j.a.b("data: "), j.a.b("data:"), j.a.b("data\r\n"), j.a.b("data\r"), j.a.b("data\n"), j.a.b("id: "), j.a.b("id:"), j.a.b("id\r\n"), j.a.b("id\r"), j.a.b("id\n"), j.a.b("event: "), j.a.b("event:"), j.a.b("event\r\n"), j.a.b("event\r"), j.a.b("event\n"), j.a.b("retry: "), j.a.b("retry:"));

    /* renamed from: e  reason: collision with root package name */
    public static final j f22604e = j.a.b("\r\n");

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f22605f = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public String f22606a;

    /* renamed from: b  reason: collision with root package name */
    public final i f22607b;

    /* renamed from: c  reason: collision with root package name */
    public final Callback f22608c;

    /* compiled from: ServerSentEventReader.kt */
    public interface Callback {
        void a(String str, String str2, String str3);

        void b();
    }

    /* compiled from: ServerSentEventReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        j jVar = j.f20882d;
    }

    public ServerSentEventReader(i iVar, Callback callback) {
        sk.j.f(iVar, "source");
        sk.j.f(callback, "callback");
        this.f22607b = iVar;
        this.f22608c = callback;
    }

    public final boolean a() {
        long j10;
        String str = this.f22606a;
        f fVar = new f();
        while (true) {
            String str2 = null;
            while (true) {
                i iVar = this.f22607b;
                s sVar = f22603d;
                int u02 = iVar.u0(sVar);
                boolean z10 = true;
                if (u02 >= 0 && 2 >= u02) {
                    if (fVar.f20878b != 0) {
                        this.f22606a = str;
                        fVar.skip(1);
                        this.f22608c.a(str, str2, fVar.U());
                    }
                    return true;
                } else if (3 <= u02 && 4 >= u02) {
                    Companion companion = f22605f;
                    i iVar2 = this.f22607b;
                    companion.getClass();
                    fVar.g0(10);
                    iVar2.Z(fVar, iVar2.T(f22604e));
                    iVar2.u0(sVar);
                } else if (5 <= u02 && 7 >= u02) {
                    fVar.g0(10);
                } else {
                    if (8 <= u02 && 9 >= u02) {
                        str = this.f22607b.p0();
                        if (str.length() <= 0) {
                            z10 = false;
                        }
                        if (z10) {
                        }
                    } else if (10 > u02 || 12 < u02) {
                        if (13 <= u02 && 14 >= u02) {
                            str2 = this.f22607b.p0();
                            if (str2.length() <= 0) {
                                z10 = false;
                            }
                            if (!z10) {
                                break;
                            }
                        } else if (15 <= u02 && 17 >= u02) {
                            break;
                        } else if (18 <= u02 && 19 >= u02) {
                            Companion companion2 = f22605f;
                            i iVar3 = this.f22607b;
                            companion2.getClass();
                            String p02 = iVar3.p0();
                            byte[] bArr = Util.f22171a;
                            sk.j.f(p02, "<this>");
                            try {
                                j10 = Long.parseLong(p02);
                            } catch (NumberFormatException unused) {
                                j10 = -1;
                            }
                            if (j10 != -1) {
                                this.f22608c.b();
                            }
                        } else if (u02 == -1) {
                            long T = this.f22607b.T(f22604e);
                            if (T == -1) {
                                return false;
                            }
                            this.f22607b.skip(T);
                            this.f22607b.u0(sVar);
                        } else {
                            throw new AssertionError();
                        }
                    }
                    str = null;
                }
            }
        }
    }
}
