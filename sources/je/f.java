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
import te.c;
import xe.b;
import xe.h;
import xe.i;

/* compiled from: PictureCommonFragment */
public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f11870a;

    public f(h hVar) {
        this.f11870a = hVar;
    }

    public final void a() {
        String str;
        Uri uri;
        char c10;
        h hVar = this.f11870a;
        if (!a.T(hVar.m())) {
            hVar.D0();
            hVar.f11878i0.getClass();
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (intent.resolveActivity(hVar.m().getPackageManager()) != null) {
                hVar.p0();
                hVar.f11878i0.getClass();
                String str2 = ForegroundService.f8128a;
                Context p02 = hVar.p0();
                ke.a aVar = hVar.f11878i0;
                String str3 = "";
                if (TextUtils.isEmpty(aVar.f12543z)) {
                    str = str3;
                } else {
                    str = System.currentTimeMillis() + "_" + aVar.f12543z;
                }
                if (!i.a() || !TextUtils.isEmpty(aVar.B)) {
                    File b10 = h.b(p02, 2, str, aVar.f12520c, aVar.B);
                    aVar.E = b10.getAbsolutePath();
                    uri = h.e(p02, b10);
                } else {
                    String str4 = aVar.f12522e;
                    Context applicationContext = p02.getApplicationContext();
                    Uri[] uriArr = {null};
                    String externalStorageState = Environment.getExternalStorageState();
                    String E0 = a.E0(Long.valueOf(System.currentTimeMillis()));
                    ContentValues contentValues = new ContentValues(3);
                    if (TextUtils.isEmpty(str)) {
                        contentValues.put("_display_name", b.c("VID_"));
                    } else if (str.lastIndexOf(".") == -1) {
                        contentValues.put("_display_name", b.c("VID_"));
                    } else {
                        contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(".")), str3));
                    }
                    if (TextUtils.isEmpty(str4) || str4.startsWith("image")) {
                        str4 = "video/mp4";
                    }
                    contentValues.put("mime_type", str4);
                    if (i.a()) {
                        contentValues.put("datetaken", E0);
                        contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
                    }
                    if (externalStorageState.equals("mounted")) {
                        c10 = 0;
                        uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                    } else {
                        c10 = 0;
                        uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.INTERNAL_CONTENT_URI, contentValues);
                    }
                    uri = uriArr[c10];
                    if (uri != null) {
                        str3 = uri.toString();
                    }
                    aVar.E = str3;
                }
                if (uri != null) {
                    intent.putExtra("output", uri);
                    hVar.f11878i0.getClass();
                    intent.putExtra("android.intent.extra.quickCapture", hVar.f11878i0.L);
                    intent.putExtra("android.intent.extra.durationLimit", hVar.f11878i0.f12528k);
                    intent.putExtra("android.intent.extra.videoQuality", hVar.f11878i0.f12527j);
                    hVar.startActivityForResult(intent, 909);
                }
            }
        }
    }

    public final void b() {
        this.f11870a.s0(te.b.f15024b);
    }
}
