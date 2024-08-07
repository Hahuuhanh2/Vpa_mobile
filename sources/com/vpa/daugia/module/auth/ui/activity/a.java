package com.vpa.daugia.module.auth.ui.activity;

import android.content.Intent;
import android.os.Build;
import android.provider.MediaStore;
import jf.a;
import kf.h;
import sk.j;

/* compiled from: StepThreeOrganizationActivity.kt */
public final class a implements a.C0130a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreeOrganizationActivity f19544a;

    public a(StepThreeOrganizationActivity stepThreeOrganizationActivity) {
        this.f19544a = stepThreeOrganizationActivity;
    }

    public final void a(String str) {
        if (j.a(str, "ACTION_LIBRARY")) {
            StepThreeOrganizationActivity stepThreeOrganizationActivity = this.f19544a;
            int i10 = StepThreeOrganizationActivity.Z;
            stepThreeOrganizationActivity.getClass();
            if (k1.a.checkSelfPermission(stepThreeOrganizationActivity, "android.permission.READ_EXTERNAL_STORAGE") == 0 && k1.a.checkSelfPermission(stepThreeOrganizationActivity, "android.permission.READ_MEDIA_IMAGES") == 0 && k1.a.checkSelfPermission(stepThreeOrganizationActivity, "android.permission.READ_MEDIA_VIDEO") == 0) {
                Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/* video/*");
                stepThreeOrganizationActivity.startActivityForResult(intent, stepThreeOrganizationActivity.T);
                int i11 = h.f12560a;
            } else if (Build.VERSION.SDK_INT >= 33) {
                i1.a.a(stepThreeOrganizationActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, stepThreeOrganizationActivity.U);
            } else {
                i1.a.a(stepThreeOrganizationActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, stepThreeOrganizationActivity.U);
            }
        } else {
            this.f19544a.Y.a("android.permission.CAMERA");
        }
    }
}
