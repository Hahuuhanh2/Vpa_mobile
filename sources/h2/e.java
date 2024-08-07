package h2;

import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p;
import j2.c;
import j2.i;
import j2.q;
import j2.r;
import j2.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PreferencesProto */
public final class e extends n<e, a> implements j2.n {
    /* access modifiers changed from: private */
    public static final e DEFAULT_INSTANCE;
    private static volatile q<e> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private p.c<String> strings_ = e0.f2257d;

    /* compiled from: PreferencesProto */
    public static final class a extends n.a<e, a> implements j2.n {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        n.o(e.class, eVar);
    }

    public static void q(e eVar, Set set) {
        int i10;
        if (!eVar.strings_.f()) {
            p.c<String> cVar = eVar.strings_;
            int size = cVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            eVar.strings_ = cVar.b(i10);
        }
        p.c<String> cVar2 = eVar.strings_;
        Charset charset = p.f2318a;
        set.getClass();
        if (set instanceof i) {
            List<?> c10 = ((i) set).c();
            i iVar = (i) cVar2;
            int size2 = cVar2.size();
            for (Object next : c10) {
                if (next == null) {
                    StringBuilder q10 = android.support.v4.media.a.q("Element at index ");
                    q10.append(iVar.size() - size2);
                    q10.append(" is null.");
                    String sb2 = q10.toString();
                    int size3 = iVar.size();
                    while (true) {
                        size3--;
                        if (size3 >= size2) {
                            iVar.remove(size3);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else if (next instanceof c) {
                    iVar.k((c) next);
                } else {
                    iVar.add((String) next);
                }
            }
        } else if (set instanceof r) {
            cVar2.addAll(set);
        } else {
            if (cVar2 instanceof ArrayList) {
                ((ArrayList) cVar2).ensureCapacity(set.size() + cVar2.size());
            }
            int size4 = cVar2.size();
            for (Object next2 : set) {
                if (next2 == null) {
                    StringBuilder q11 = android.support.v4.media.a.q("Element at index ");
                    q11.append(cVar2.size() - size4);
                    q11.append(" is null.");
                    String sb3 = q11.toString();
                    int size5 = cVar2.size();
                    while (true) {
                        size5--;
                        if (size5 >= size4) {
                            cVar2.remove(size5);
                        } else {
                            throw new NullPointerException(sb3);
                        }
                    }
                } else {
                    cVar2.add(next2);
                }
            }
        }
    }

    public static e r() {
        return DEFAULT_INSTANCE;
    }

    public static a t() {
        return (a) ((n.a) DEFAULT_INSTANCE.k(n.f.NEW_BUILDER));
    }

    public final Object k(n.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new t(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q<e> qVar = PARSER;
                if (qVar == null) {
                    synchronized (e.class) {
                        try {
                            qVar = PARSER;
                            if (qVar == null) {
                                qVar = new n.b<>(DEFAULT_INSTANCE);
                                PARSER = qVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return qVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final p.c s() {
        return this.strings_;
    }
}
