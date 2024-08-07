package com.airbnb.lottie;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import u9.a;
import u9.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4827a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4828b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4829c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f4827a = i10;
        this.f4828b = obj;
        this.f4829c = obj2;
    }

    public final Object call() {
        switch (this.f4827a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f4828b;
                String str = (String) this.f4829c;
                if (!lottieAnimationView.f4747t) {
                    return p.b(lottieAnimationView.getContext(), str, (String) null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap hashMap = p.f4876a;
                return p.b(context, str, "asset_" + str);
            case 1:
                a aVar = (a) this.f4828b;
                b bVar = (b) this.f4829c;
                v9.h hVar = aVar.f15400a;
                bVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("debugToken", bVar.f15404b);
                return hVar.a(jSONObject.toString().getBytes("UTF-8"), 2, aVar.f15402c);
            default:
                z9.b bVar2 = (z9.b) this.f4828b;
                dc.h hVar2 = (dc.h) this.f4829c;
                v9.h hVar3 = bVar2.f17900b;
                hVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playIntegrityToken", hVar2.f8904a);
                return hVar3.a(jSONObject2.toString().getBytes("UTF-8"), 3, bVar2.f17901c);
        }
    }
}
