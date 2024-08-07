package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import c6.e;
import ca.f;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.h;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import com.vpa.daugia.module.support.ui.activity.SupportActivity;
import d9.b;
import d9.m;
import d9.p;
import d9.u;
import e9.g;
import e9.i;
import f6.j;
import f6.s;
import i9.i0;
import i9.r;
import i9.v;
import io.github.g00fy2.quickie.QRScannerActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Set;
import ka.b0;
import ka.o;
import la.a;
import m6.o;
import p.a;
import ub.c;
import ub.f;
import v.c0;
import w1.q;
import w1.w0;
import x8.f;
import x8.h;
import x8.i;
import x8.t;
import z.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements q, x5.h, f, a, c0.e.a, c6.h, o.a, h.a, b.a, p.a, f.a, a.C0157a, Continuation, e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20819a;

    public /* synthetic */ h(int i10) {
        this.f20819a = i10;
    }

    public void a(Exception exc) {
    }

    public Object apply(Object obj) {
        byte[] bArr;
        switch (this.f20819a) {
            case 0:
                Void voidR = (Void) obj;
                return Boolean.TRUE;
            case 3:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                int i10 = c0.f.f15637f;
                return Boolean.FALSE;
            case 7:
                c6.b bVar = o.f13164f;
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            case 8:
                c6.b bVar2 = o.f13164f;
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 9:
                Cursor cursor = (Cursor) obj;
                c6.b bVar3 = o.f13164f;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    j.a a10 = s.a();
                    a10.b(cursor.getString(1));
                    a10.c(p6.a.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    if (string == null) {
                        bArr = null;
                    } else {
                        bArr = Base64.decode(string, 0);
                    }
                    a10.f10006b = bArr;
                    arrayList.add(a10.a());
                }
                return arrayList;
            case 10:
                Cursor cursor2 = (Cursor) obj;
                c6.b bVar4 = o.f13164f;
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (cursor2.moveToNext()) {
                    byte[] blob = cursor2.getBlob(0);
                    arrayList2.add(blob);
                    i11 += blob.length;
                }
                byte[] bArr2 = new byte[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    byte[] bArr3 = (byte[]) arrayList2.get(i13);
                    System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
                    i12 += bArr3.length;
                }
                return bArr2;
            default:
                gb.b bVar5 = (gb.b) obj;
                bVar5.getClass();
                va.h hVar = fb.s.f10164a;
                hVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    hVar.a(bVar5, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    public androidx.fragment.app.o b(u uVar) {
        h.a aVar;
        t.a aVar2;
        switch (this.f20819a) {
            case 13:
                d9.s sVar = (d9.s) uVar;
                m mVar = i.f17115a;
                if (sVar.f8805a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        i9.i L = i9.i.L(sVar.f8807c, com.google.crypto.tink.shaded.protobuf.i.a());
                        if (L.J() == 0) {
                            int size = L.H().size();
                            if (!(size == 16 || size == 24)) {
                                if (size != 32) {
                                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(size)}));
                                }
                            }
                            Integer valueOf = Integer.valueOf(size);
                            int G = L.I().G();
                            if (G != 12) {
                                if (G != 16) {
                                    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(G)}));
                                }
                            }
                            Integer valueOf2 = Integer.valueOf(G);
                            Integer num = 16;
                            i0 i0Var = sVar.f8809e;
                            int ordinal = i0Var.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        aVar = h.a.f17113d;
                                    } else if (ordinal != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
                                    }
                                }
                                aVar = h.a.f17112c;
                            } else {
                                aVar = h.a.f17111b;
                            }
                            if (valueOf == null) {
                                throw new GeneralSecurityException("Key size is not set");
                            } else if (valueOf2 == null) {
                                throw new GeneralSecurityException("IV size is not set");
                            } else if (num != null) {
                                x8.h hVar = new x8.h(valueOf.intValue(), valueOf2.intValue(), num.intValue(), aVar);
                                f.a aVar3 = new f.a();
                                aVar3.f17103a = hVar;
                                aVar3.f17104b = new d((Object) l9.a.a(L.H().s()));
                                aVar3.f17105c = sVar.f8810f;
                                return aVar3.a();
                            } else {
                                throw new GeneralSecurityException("Tag size is not set");
                            }
                        } else {
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
            case 17:
                d9.s sVar2 = (d9.s) uVar;
                m mVar2 = x8.u.f17154a;
                if (sVar2.f8805a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        r J = r.J(sVar2.f8807c, com.google.crypto.tink.shaded.protobuf.i.a());
                        if (J.H() == 0) {
                            i0 i0Var2 = sVar2.f8809e;
                            int ordinal2 = i0Var2.ordinal();
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        aVar2 = t.a.f17152d;
                                    } else if (ordinal2 != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var2.a());
                                    }
                                }
                                aVar2 = t.a.f17151c;
                            } else {
                                aVar2 = t.a.f17150b;
                            }
                            return x8.r.J(aVar2, new d((Object) l9.a.a(J.G().s())), sVar2.f8810f);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (InvalidProtocolBufferException unused2) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
            default:
                d9.s sVar3 = (d9.s) uVar;
                m mVar3 = e9.j.f9314a;
                if (sVar3.f8805a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        v M = v.M(sVar3.f8807c, com.google.crypto.tink.shaded.protobuf.i.a());
                        if (M.K() == 0) {
                            i.a aVar4 = new i.a();
                            aVar4.f9299a = Integer.valueOf(M.I().size());
                            aVar4.f9300b = Integer.valueOf(M.J().I());
                            aVar4.f9301c = e9.j.a(M.J().H());
                            aVar4.f9302d = e9.j.b(sVar3.f8809e);
                            e9.i a10 = aVar4.a();
                            g.a aVar5 = new g.a();
                            aVar5.f9290a = a10;
                            aVar5.f9291b = new d((Object) l9.a.a(M.I().s()));
                            aVar5.f9292c = sVar3.f8810f;
                            return aVar5.a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (InvalidProtocolBufferException | IllegalArgumentException unused3) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
        }
    }

    public Object c(JsonReader jsonReader) {
        switch (this.f20819a) {
            case 25:
                return la.a.e(jsonReader);
            case 26:
                return la.a.b(jsonReader);
            default:
                ua.d dVar = la.a.f12898a;
                o.a aVar = new o.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case 3373707:
                            if (nextName.equals("name")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3530753:
                            if (nextName.equals("size")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 3601339:
                            if (nextName.equals("uuid")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1153765347:
                            if (nextName.equals("baseAddress")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                aVar.f12375c = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 1:
                            aVar.f12374b = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            aVar.f12376d = new String(Base64.decode(jsonReader.nextString(), 2), b0.f12263a);
                            break;
                        case 3:
                            aVar.f12373a = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return aVar.a();
        }
    }

    public String d(Context context) {
        switch (this.f20819a) {
            case 23:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                return "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    return FirebaseCommonRegistrar.b(installerPackageName);
                }
                return "";
        }
    }

    public void e(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public Object f(androidx.fragment.app.o oVar) {
        e9.a aVar = (e9.a) oVar;
        return new f9.a();
    }

    public w0 g(View view, w0 w0Var) {
        switch (this.f20819a) {
            case 0:
                int i10 = AuctionReportActivity.V;
                sk.j.f(view, "v");
                n1.e a10 = w0Var.a(7);
                sk.j.e(a10, "getInsets(...)");
                view.setPadding(a10.f13427a, a10.f13428b, a10.f13429c, a10.f13430d);
                return w0Var;
            case 4:
                int i11 = ProfileActivity.f19812b0;
                sk.j.f(view, "v");
                n1.e a11 = w0Var.a(7);
                sk.j.e(a11, "getInsets(...)");
                view.setPadding(a11.f13427a, a11.f13428b, a11.f13429c, a11.f13430d);
                return w0Var;
            case 5:
                int i12 = VerifyActivity.f19818a0;
                sk.j.f(view, "v");
                n1.e a12 = w0Var.a(7);
                sk.j.e(a12, "getInsets(...)");
                view.setPadding(a12.f13427a, a12.f13428b, a12.f13429c, a12.f13430d);
                return w0Var;
            case 6:
                int i13 = SupportActivity.U;
                sk.j.f(view, "v");
                n1.e a13 = w0Var.a(7);
                sk.j.e(a13, "getInsets(...)");
                view.setPadding(a13.f13427a, a13.f13428b, a13.f13429c, a13.f13430d);
                return w0Var;
            default:
                int i14 = QRScannerActivity.Q;
                sk.j.f(view, "v");
                n1.e a14 = w0Var.a(7);
                view.setPadding(a14.f13427a, a14.f13428b, a14.f13429c, a14.f13430d);
                return w0.f16390b;
        }
    }

    public Object k(ca.s sVar) {
        switch (this.f20819a) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(sVar);
            case 1:
                return ExecutorsRegistrar.f7567b.get();
            default:
                Set h10 = sVar.h(ub.d.class);
                c cVar = c.f15426b;
                if (cVar == null) {
                    synchronized (c.class) {
                        cVar = c.f15426b;
                        if (cVar == null) {
                            cVar = new c();
                            c.f15426b = cVar;
                        }
                    }
                }
                return new ub.b(h10, cVar);
        }
    }

    public Object then(Task task) {
        Object obj = fb.j.f10141c;
        return -1;
    }
}
