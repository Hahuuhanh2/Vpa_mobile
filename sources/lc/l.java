package lc;

import al.g0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import c7.p;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.internal.mlkit_common.zzau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import u6.b;
import u6.d;
import w6.o;
import y6.j;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final Feature[] f12923a = new Feature[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Feature f12924b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzau f12925c;

    /* renamed from: d  reason: collision with root package name */
    public static final zzau f12926d;

    static {
        Feature feature = new Feature("vision.barcode", 1);
        f12924b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1);
        Feature feature3 = new Feature("vision.face", 1);
        Feature feature4 = new Feature("vision.ica", 1);
        Feature feature5 = new Feature("vision.ocr", 1);
        new Feature("mlkit.ocr.chinese", 1);
        new Feature("mlkit.ocr.common", 1);
        new Feature("mlkit.ocr.devanagari", 1);
        new Feature("mlkit.ocr.japanese", 1);
        new Feature("mlkit.ocr.korean", 1);
        Feature feature6 = new Feature("mlkit.langid", 1);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1);
        Feature feature8 = new Feature("tflite_dynamite", 1);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1);
        Feature feature10 = new Feature("mlkit.smartreply", 1);
        new Feature("mlkit.image.caption", 1);
        new Feature("mlkit.docscan.detect", 1);
        new Feature("mlkit.docscan.crop", 1);
        new Feature("mlkit.docscan.enhance", 1);
        new Feature("mlkit.quality.aesthetic", 1);
        new Feature("mlkit.quality.technical", 1);
        zzat zzat = new zzat();
        zzat.zza("barcode", feature);
        zzat.zza("custom_ica", feature2);
        zzat.zza("face", feature3);
        zzat.zza("ica", feature4);
        zzat.zza("ocr", feature5);
        zzat.zza("langid", feature6);
        zzat.zza("nlclassifier", feature7);
        zzat.zza("tflite_dynamite", feature8);
        zzat.zza("barcode_ui", feature9);
        zzat.zza("smart_reply", feature10);
        f12925c = zzat.zzb();
        zzat zzat2 = new zzat();
        zzat2.zza("com.google.android.gms.vision.barcode", feature);
        zzat2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzat2.zza("com.google.android.gms.vision.face", feature3);
        zzat2.zza("com.google.android.gms.vision.ica", feature4);
        zzat2.zza("com.google.android.gms.vision.ocr", feature5);
        zzat2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzat2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzat2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzat2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        f12926d = zzat2.zzb();
    }

    @Deprecated
    public static void a(Context context, List<String> list) {
        int i10;
        Task task;
        b.f15290b.getClass();
        AtomicBoolean atomicBoolean = d.f15292a;
        try {
            i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i10 = 0;
        }
        if (i10 >= 221500000) {
            Feature[] b10 = b(list, f12925c);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new v(b10));
            j.a("APIs must not be empty.", !arrayList.isEmpty());
            p pVar = new p(context);
            ApiFeatureRequest P0 = ApiFeatureRequest.P0(arrayList, true);
            if (P0.f5451a.isEmpty()) {
                task = Tasks.forResult(new ModuleInstallResponse(0, false));
            } else {
                o.a aVar = new o.a();
                aVar.f16641c = new Feature[]{zav.zaa};
                aVar.f16640b = true;
                aVar.f16642d = 27304;
                aVar.f16639a = new vl.d(5, pVar, P0);
                task = pVar.doRead(aVar.a());
            }
            task.addOnFailureListener(g0.f19028r);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static Feature[] b(List list, zzau zzau) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            Feature feature = (Feature) zzau.get(list.get(i10));
            j.f(feature);
            featureArr[i10] = feature;
        }
        return featureArr;
    }
}
