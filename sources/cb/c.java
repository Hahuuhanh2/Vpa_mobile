package cb;

import cb.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import m9.d;
import org.json.JSONException;
import org.json.JSONObject;
import v.v;

/* compiled from: PersistedInstallation */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public File f4684a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4685b;

    public c(d dVar) {
        this.f4685b = dVar;
    }

    public final File a() {
        if (this.f4684a == null) {
            synchronized (this) {
                if (this.f4684a == null) {
                    d dVar = this.f4685b;
                    dVar.a();
                    File filesDir = dVar.f13218a.getFilesDir();
                    this.f4684a = new File(filesDir, "PersistedInstallation." + this.f4685b.f() + ".json");
                }
            }
        }
        return this.f4684a;
    }

    public final void b(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f4667b);
            jSONObject.put("Status", v.g(aVar.f4668c));
            jSONObject.put("AuthToken", aVar.f4669d);
            jSONObject.put("RefreshToken", aVar.f4670e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f4672g);
            jSONObject.put("ExpiresInSecs", aVar.f4671f);
            jSONObject.put("FisError", aVar.f4673h);
            d dVar = this.f4685b;
            dVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", dVar.f13218a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a c() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i10 = d.f4686a;
        a.C0053a aVar = new a.C0053a();
        aVar.f4679f = 0L;
        aVar.b(1);
        aVar.f4678e = 0L;
        aVar.f4674a = optString;
        aVar.b(v.k(5)[optInt]);
        aVar.f4676c = optString2;
        aVar.f4677d = optString3;
        aVar.f4679f = Long.valueOf(optLong);
        aVar.f4678e = Long.valueOf(optLong2);
        aVar.f4680g = optString4;
        return aVar.a();
        throw th;
    }
}
