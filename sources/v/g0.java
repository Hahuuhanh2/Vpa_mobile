package v;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import androidx.camera.core.impl.w;
import c6.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.internal.h;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.remoteconfig.internal.b;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import com.vpa.daugia.module.auth.ui.activity.ForgotActivity;
import d9.b;
import d9.m;
import d9.s;
import d9.u;
import e9.a;
import e9.c;
import i9.i0;
import i9.k0;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import ka.b0;
import ka.d;
import ka.g;
import la.a;
import m6.o;
import p.a;
import tb.i;
import ua.d;
import ub.f;
import w1.q;
import w1.w0;
import x8.a0;
import x8.j;
import x8.l;
import x8.y;
import za.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g0 implements a, o.a, h.a, b.a, f.a, SuccessContinuation, Continuation, a.C0251a, a.C0157a, e, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15685a;

    public /* synthetic */ g0(int i10) {
        this.f15685a = i10;
    }

    public final boolean a(w.a aVar) {
        if (!aVar.f1414d || !aVar.f1413c) {
            return false;
        }
        return true;
    }

    public final Object apply(Object obj) {
        switch (this.f15685a) {
            case 0:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 4:
                c6.b bVar = o.f13164f;
                return (List) o.K(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new kh.h(9));
            case 5:
                Cursor cursor = (Cursor) obj;
                c6.b bVar2 = o.f13164f;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 24:
                b0 b0Var = (b0) obj;
                oa.a.f13764b.getClass();
                d dVar = la.a.f12898a;
                dVar.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    dVar.a(b0Var, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
            default:
                return ((i) obj).s();
        }
    }

    public final androidx.fragment.app.o b(u uVar) {
        l.a aVar;
        a0.a aVar2;
        switch (this.f15685a) {
            case 9:
                s sVar = (s) uVar;
                m mVar = x8.m.f17131a;
                if (sVar.f8805a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        i9.l J = i9.l.J(sVar.f8807c, com.google.crypto.tink.shaded.protobuf.i.a());
                        if (J.H() == 0) {
                            int size = J.G().size();
                            if (!(size == 16 || size == 24)) {
                                if (size != 32) {
                                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(size)}));
                                }
                            }
                            Integer valueOf = Integer.valueOf(size);
                            Integer num = 12;
                            Integer num2 = 16;
                            i0 i0Var = sVar.f8809e;
                            int ordinal = i0Var.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        aVar = l.a.f17129d;
                                    } else if (ordinal != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
                                    }
                                }
                                aVar = l.a.f17128c;
                            } else {
                                aVar = l.a.f17127b;
                            }
                            if (valueOf == null) {
                                throw new GeneralSecurityException("Key size is not set");
                            } else if (num == null) {
                                throw new GeneralSecurityException("IV size is not set");
                            } else if (num2 != null) {
                                l lVar = new l(valueOf.intValue(), num.intValue(), num2.intValue(), aVar);
                                j.a aVar3 = new j.a();
                                aVar3.f17119a = lVar;
                                aVar3.f17120b = new z.d((Object) l9.a.a(J.G().s()));
                                aVar3.f17121c = sVar.f8810f;
                                return aVar3.a();
                            } else {
                                throw new GeneralSecurityException("Tag size is not set");
                            }
                        } else {
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
            case 13:
                s sVar2 = (s) uVar;
                m mVar2 = x8.b0.f17092a;
                if (sVar2.f8805a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        k0 J2 = k0.J(sVar2.f8807c, com.google.crypto.tink.shaded.protobuf.i.a());
                        if (J2.H() == 0) {
                            i0 i0Var2 = sVar2.f8809e;
                            int ordinal2 = i0Var2.ordinal();
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        aVar2 = a0.a.f17090d;
                                    } else if (ordinal2 != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var2.a());
                                    }
                                }
                                aVar2 = a0.a.f17089c;
                            } else {
                                aVar2 = a0.a.f17088b;
                            }
                            return y.J(aVar2, new z.d((Object) l9.a.a(J2.G().s())), sVar2.f8810f);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (InvalidProtocolBufferException unused2) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
            default:
                s sVar3 = (s) uVar;
                m mVar3 = e9.d.f9283a;
                if (sVar3.f8805a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        i9.a L = i9.a.L(sVar3.f8807c, com.google.crypto.tink.shaded.protobuf.i.a());
                        if (L.J() == 0) {
                            c.a aVar4 = new c.a();
                            aVar4.b(L.H().size());
                            aVar4.c(L.I().G());
                            aVar4.f9277c = e9.d.a(sVar3.f8809e);
                            c a10 = aVar4.a();
                            a.C0100a aVar5 = new a.C0100a();
                            aVar5.f9268a = a10;
                            aVar5.f9269b = new z.d((Object) l9.a.a(L.H().s()));
                            aVar5.f9270c = sVar3.f8810f;
                            return aVar5.a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (InvalidProtocolBufferException | IllegalArgumentException unused3) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
        }
    }

    public final Object c(JsonReader jsonReader) {
        String str;
        switch (this.f15685a) {
            case 21:
                d dVar = la.a.f12898a;
                jsonReader.beginObject();
                String str2 = null;
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    if (nextName.equals("filename")) {
                        str2 = jsonReader.nextString();
                        if (str2 == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (!nextName.equals("contents")) {
                        jsonReader.skipValue();
                    } else {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException("Null contents");
                        }
                    }
                }
                jsonReader.endObject();
                if (str2 == null) {
                    str = " filename";
                } else {
                    str = "";
                }
                if (bArr == null) {
                    str = f0.b0.r(str, " contents");
                }
                if (str.isEmpty()) {
                    return new g(str2, bArr);
                }
                throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
            case 22:
                d dVar2 = la.a.f12898a;
                d.a aVar = new d.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    nextName2.hashCode();
                    char c10 = 65535;
                    switch (nextName2.hashCode()) {
                        case -609862170:
                            if (nextName2.equals("libraryName")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3002454:
                            if (nextName2.equals("arch")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 230943785:
                            if (nextName2.equals("buildId")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                aVar.f12287b = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null libraryName");
                            }
                        case 1:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 != null) {
                                aVar.f12286a = nextString2;
                                break;
                            } else {
                                throw new NullPointerException("Null arch");
                            }
                        case 2:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 != null) {
                                aVar.f12288c = nextString3;
                                break;
                            } else {
                                throw new NullPointerException("Null buildId");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return aVar.a();
            default:
                return la.a.a(jsonReader);
        }
    }

    public final String d(Context context) {
        return FirebaseCommonRegistrar.a(context);
    }

    public final void e(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void f(za.b bVar) {
    }

    public final w0 g(View view, w0 w0Var) {
        switch (this.f15685a) {
            case 28:
                int i10 = SessionAuctionActivity.X;
                sk.j.f(view, "v");
                n1.e a10 = w0Var.a(7);
                sk.j.e(a10, "getInsets(...)");
                view.setPadding(a10.f13427a, a10.f13428b, a10.f13429c, a10.f13430d);
                return w0Var;
            default:
                int i11 = ForgotActivity.S;
                sk.j.f(view, "v");
                n1.e a11 = w0Var.a(7);
                sk.j.e(a11, "getInsets(...)");
                view.setPadding(a11.f13427a, a11.f13428b, a11.f13429c, a11.f13430d);
                return w0Var;
        }
    }

    public final Object then(Task task) {
        Object obj = fb.j.f10141c;
        return 403;
    }

    public final Task then(Object obj) {
        switch (this.f15685a) {
            case 18:
                int i10 = u9.a.f15399d;
                return Tasks.forResult(v9.b.J((v9.a) obj));
            default:
                b.a aVar = (b.a) obj;
                return Tasks.forResult(null);
        }
    }
}
