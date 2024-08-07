package com.vpa.daugia.module.auth.data.api.response;

import android.support.v4.media.a;
import cc.b;
import com.vpa.daugia.data.model.setting.SettingModel;
import sk.e;
import sk.j;

/* compiled from: SettingResponse.kt */
public final class SettingResponse {
    @b("value")
    private final SettingModel result;

    public SettingResponse() {
        this((SettingModel) null, 1, (e) null);
    }

    public SettingResponse(SettingModel settingModel) {
        this.result = settingModel;
    }

    public static /* synthetic */ SettingResponse copy$default(SettingResponse settingResponse, SettingModel settingModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            settingModel = settingResponse.result;
        }
        return settingResponse.copy(settingModel);
    }

    public final SettingModel component1() {
        return this.result;
    }

    public final SettingResponse copy(SettingModel settingModel) {
        return new SettingResponse(settingModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SettingResponse) && j.a(this.result, ((SettingResponse) obj).result);
    }

    public final SettingModel getResult() {
        return this.result;
    }

    public int hashCode() {
        SettingModel settingModel = this.result;
        if (settingModel == null) {
            return 0;
        }
        return settingModel.hashCode();
    }

    public String toString() {
        StringBuilder q10 = a.q("SettingResponse(result=");
        q10.append(this.result);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingResponse(SettingModel settingModel, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : settingModel);
    }
}
