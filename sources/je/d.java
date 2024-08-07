package je;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.luck.picture.lib.service.ForegroundService;
import j7.a;
import java.io.File;
import qe.c;
import xe.b;
import xe.h;
import xe.i;

/* compiled from: PictureCommonFragment */
public final class d implements c, te.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f11868a;

    public /* synthetic */ d(h hVar) {
        this.f11868a = hVar;
    }

    public void a() {
        String str;
        Uri uri;
        char c10;
        h hVar = this.f11868a;
        if (!a.T(hVar.m())) {
            hVar.D0();
            hVar.f11878i0.getClass();
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(hVar.m().getPackageManager()) != null) {
                hVar.p0();
                hVar.f11878i0.getClass();
                String str2 = ForegroundService.f8128a;
                Context p02 = hVar.p0();
                ke.a aVar = hVar.f11878i0;
                String str3 = "";
                if (TextUtils.isEmpty(aVar.f12542y)) {
                    str = str3;
                } else {
                    str = System.currentTimeMillis() + "_" + aVar.f12542y;
                }
                if (!i.a() || !TextUtils.isEmpty(aVar.B)) {
                    File b10 = h.b(p02, 1, str, aVar.f12519b, aVar.B);
                    aVar.E = b10.getAbsolutePath();
                    uri = h.e(p02, b10);
                } else {
                    String str4 = aVar.f12521d;
                    Context applicationContext = p02.getApplicationContext();
                    Uri[] uriArr = {null};
                    String externalStorageState = Environment.getExternalStorageState();
                    String E0 = a.E0(Long.valueOf(System.currentTimeMillis()));
                    ContentValues contentValues = new ContentValues(3);
                    if (TextUtils.isEmpty(str)) {
                        contentValues.put("_display_name", b.c("IMG_"));
                    } else if (str.lastIndexOf(".") == -1) {
                        contentValues.put("_display_name", b.c("IMG_"));
                    } else {
                        contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(".")), str3));
                    }
                    if (TextUtils.isEmpty(str4) || str4.startsWith("video")) {
                        str4 = "image/jpeg";
                    }
                    contentValues.put("mime_type", str4);
                    if (i.a()) {
                        contentValues.put("datetaken", E0);
                        contentValues.put("relative_path", "DCIM/Camera");
                    }
                    if (externalStorageState.equals("mounted")) {
                        c10 = 0;
                        uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    } else {
                        c10 = 0;
                        uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues);
                    }
                    uri = uriArr[c10];
                    if (uri != null) {
                        str3 = uri.toString();
                    }
                    aVar.E = str3;
                }
                if (uri != null) {
                    hVar.f11878i0.getClass();
                    intent.putExtra("output", uri);
                    hVar.startActivityForResult(intent, 909);
                }
            }
        }
    }

    public void b() {
        this.f11868a.s0(te.b.f15024b);
    }

    public void c(int i10) {
        if (i10 == 0) {
            this.f11868a.f11878i0.getClass();
            h hVar = this.f11868a;
            String[] strArr = te.b.f15024b;
            hVar.D0();
            hVar.f11878i0.getClass();
            te.a b10 = te.a.b();
            d dVar = new d(hVar);
            b10.getClass();
            te.a.d(hVar, strArr, dVar);
        } else if (i10 == 1) {
            this.f11868a.f11878i0.getClass();
            h hVar2 = this.f11868a;
            String[] strArr2 = te.b.f15024b;
            hVar2.D0();
            hVar2.f11878i0.getClass();
            te.a b11 = te.a.b();
            f fVar = new f(hVar2);
            b11.getClass();
            te.a.d(hVar2, strArr2, fVar);
        }
    }
}
