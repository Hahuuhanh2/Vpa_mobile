package zg;

import android.content.Intent;
import android.os.Build;
import android.provider.MediaStore;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import jf.a;
import kf.h;
import sk.j;

/* compiled from: StepThreePersonalActivity.kt */
public final class a1 implements a.C0130a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23616a;

    public a1(StepThreePersonalActivity stepThreePersonalActivity) {
        this.f23616a = stepThreePersonalActivity;
    }

    public final void a(String str) {
        if (j.a(str, "ACTION_LIBRARY")) {
            StepThreePersonalActivity stepThreePersonalActivity = this.f23616a;
            int i10 = StepThreePersonalActivity.f19534a0;
            stepThreePersonalActivity.getClass();
            if (k1.a.checkSelfPermission(stepThreePersonalActivity, "android.permission.READ_EXTERNAL_STORAGE") == 0 && k1.a.checkSelfPermission(stepThreePersonalActivity, "android.permission.READ_MEDIA_IMAGES") == 0 && k1.a.checkSelfPermission(stepThreePersonalActivity, "android.permission.READ_MEDIA_VIDEO") == 0) {
                Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/* video/*");
                stepThreePersonalActivity.startActivityForResult(intent, stepThreePersonalActivity.T);
                int i11 = h.f12560a;
            } else if (Build.VERSION.SDK_INT >= 33) {
                i1.a.a(stepThreePersonalActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, stepThreePersonalActivity.U);
            } else {
                i1.a.a(stepThreePersonalActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, stepThreePersonalActivity.U);
            }
        } else {
            this.f23616a.Z.a("android.permission.CAMERA");
        }
    }
}
