package com.vpa.daugia.module.home.data.api.response;

import cc.b;
import com.vpa.daugia.module.home.data.model.Feature;
import java.util.ArrayList;
import sk.e;
import sk.j;

/* compiled from: FeatureResponse.kt */
public final class FeatureResponse {
    @b("data")
    private ArrayList<Feature> data;
    @b("value")
    private Feature result;

    public FeatureResponse() {
        this((ArrayList) null, (Feature) null, 3, (e) null);
    }

    public FeatureResponse(ArrayList<Feature> arrayList, Feature feature) {
        j.f(arrayList, "data");
        this.data = arrayList;
        this.result = feature;
    }

    public final ArrayList<Feature> getData() {
        return this.data;
    }

    public final Feature getResult() {
        return this.result;
    }

    public final void setData(ArrayList<Feature> arrayList) {
        j.f(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public final void setResult(Feature feature) {
        this.result = feature;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeatureResponse(ArrayList arrayList, Feature feature, int i10, e eVar) {
        this((i10 & 1) != 0 ? new ArrayList() : arrayList, (i10 & 2) != 0 ? null : feature);
    }
}
