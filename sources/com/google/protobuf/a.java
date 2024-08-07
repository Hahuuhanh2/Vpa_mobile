package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.a;
import com.google.protobuf.a.C0074a;
import com.google.protobuf.k;
import com.google.protobuf.u;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import tc.c;
import tc.x;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0074a<MessageType, BuilderType>> implements u {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0074a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0074a<MessageType, BuilderType>> implements u.a {
    }

    public static void d(List list, k.c cVar) {
        Charset charset = k.f7917a;
        list.getClass();
        if (list instanceof tc.k) {
            List<?> c10 = ((tc.k) list).c();
            tc.k kVar = (tc.k) cVar;
            int size = cVar.size();
            for (Object next : c10) {
                if (next == null) {
                    StringBuilder q10 = android.support.v4.media.a.q("Element at index ");
                    q10.append(kVar.size() - size);
                    q10.append(" is null.");
                    String sb2 = q10.toString();
                    int size2 = kVar.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            kVar.remove(size2);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else if (next instanceof c) {
                    kVar.j((c) next);
                } else {
                    kVar.add((String) next);
                }
            }
        } else if (list instanceof tc.u) {
            cVar.addAll(list);
        } else {
            if (cVar instanceof ArrayList) {
                ((ArrayList) cVar).ensureCapacity(list.size() + cVar.size());
            }
            int size3 = cVar.size();
            for (Object next2 : list) {
                if (next2 == null) {
                    StringBuilder q11 = android.support.v4.media.a.q("Element at index ");
                    q11.append(cVar.size() - size3);
                    q11.append(" is null.");
                    String sb3 = q11.toString();
                    int size4 = cVar.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            cVar.remove(size4);
                        } else {
                            throw new NullPointerException(sb3);
                        }
                    }
                } else {
                    cVar.add(next2);
                }
            }
        }
    }

    private String q(String str) {
        StringBuilder q10 = android.support.v4.media.a.q("Serializing ");
        q10.append(getClass().getName());
        q10.append(" to a ");
        q10.append(str);
        q10.append(" threw an IOException (should never happen).");
        return q10.toString();
    }

    public final c.e b() {
        try {
            int i10 = ((i) this).i((x) null);
            c.e eVar = c.f14960b;
            byte[] bArr = new byte[i10];
            Logger logger = CodedOutputStream.f7863c;
            CodedOutputStream.a aVar = new CodedOutputStream.a(bArr, i10);
            ((i) this).k(aVar);
            if (aVar.C0() == 0) {
                return new c.e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(q("ByteString"), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int h() {
        throw new UnsupportedOperationException();
    }

    public int i(x xVar) {
        int h10 = h();
        if (h10 != -1) {
            return h10;
        }
        int f10 = xVar.f(this);
        r(f10);
        return f10;
    }

    /* access modifiers changed from: package-private */
    public void r(int i10) {
        throw new UnsupportedOperationException();
    }

    public final byte[] s() {
        try {
            int i10 = ((i) this).i((x) null);
            byte[] bArr = new byte[i10];
            Logger logger = CodedOutputStream.f7863c;
            CodedOutputStream.a aVar = new CodedOutputStream.a(bArr, i10);
            ((i) this).k(aVar);
            if (aVar.C0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(q("byte array"), e10);
        }
    }
}
