package z9;

import al.g0;
import com.google.firebase.FirebaseException;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import v9.h;
import v9.i;
import wb.c;
import wb.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17896a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17897b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f17898c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f17896a = i10;
        this.f17897b = obj;
        this.f17898c = obj2;
    }

    public final Object call() {
        boolean z10;
        switch (this.f17896a) {
            case 0:
                b bVar = (b) this.f17897b;
                h hVar = bVar.f17900b;
                ((a.a) this.f17898c).getClass();
                byte[] bytes = new JSONObject().toString().getBytes("UTF-8");
                i iVar = bVar.f17901c;
                hVar.getClass();
                long j10 = iVar.f16111c;
                iVar.f16109a.getClass();
                if (j10 <= System.currentTimeMillis()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    JSONObject jSONObject = new JSONObject(hVar.b(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", new Object[]{hVar.f16107d, hVar.f16106c, hVar.f16105b})), bytes, iVar, false));
                    String a10 = h7.i.a(jSONObject.optString("challenge"));
                    String a11 = h7.i.a(jSONObject.optString("ttl"));
                    if (a10 != null && a11 != null) {
                        return new g0(a10, a11);
                    }
                    throw new FirebaseException("Unexpected server response.");
                }
                throw new FirebaseException("Too many attempts.");
            default:
                d dVar = (d) this.f17898c;
                wb.h hVar2 = ((c) this.f17897b).f16761b;
                synchronized (hVar2) {
                    FileOutputStream openFileOutput = hVar2.f16786a.openFileOutput(hVar2.f16787b, 0);
                    try {
                        openFileOutput.write(dVar.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
        }
    }
}
