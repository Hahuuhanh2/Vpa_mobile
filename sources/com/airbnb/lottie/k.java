package com.airbnb.lottie;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import vb.h;
import xa.b;
import xa.f;
import xa.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4859a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4860b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f4859a = i10;
        this.f4860b = obj;
    }

    public final Object call() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        switch (this.f4859a) {
            case 0:
                return new h0((i) this.f4860b);
            case 1:
                b bVar = (b) this.f4860b;
                synchronized (bVar) {
                    f fVar = bVar.f17166a.get();
                    ArrayList c10 = fVar.c();
                    fVar.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < c10.size(); i10++) {
                        g gVar = (g) c10.get(i10);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", gVar.b());
                        jSONObject.put("dates", new JSONArray(gVar.a()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th2) {
                        try {
                            base64OutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                return byteArrayOutputStream;
            default:
                return ((h) this.f4860b).a("firebase");
        }
        throw th;
    }
}
