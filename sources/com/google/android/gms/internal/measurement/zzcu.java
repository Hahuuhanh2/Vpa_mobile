package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import k7.a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public interface zzcu extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzcv zzcv);

    void getAppInstanceId(zzcv zzcv);

    void getCachedAppInstanceId(zzcv zzcv);

    void getConditionalUserProperties(String str, String str2, zzcv zzcv);

    void getCurrentScreenClass(zzcv zzcv);

    void getCurrentScreenName(zzcv zzcv);

    void getGmpAppId(zzcv zzcv);

    void getMaxUserProperties(String str, zzcv zzcv);

    void getSessionId(zzcv zzcv);

    void getTestFlag(zzcv zzcv, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzcv zzcv);

    void initForTests(Map map);

    void initialize(a aVar, zzdd zzdd, long j10);

    void isDataCollectionEnabled(zzcv zzcv);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcv, long j10);

    void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(a aVar, long j10);

    void onActivityPaused(a aVar, long j10);

    void onActivityResumed(a aVar, long j10);

    void onActivitySaveInstanceState(a aVar, zzcv zzcv, long j10);

    void onActivityStarted(a aVar, long j10);

    void onActivityStopped(a aVar, long j10);

    void performAction(Bundle bundle, zzcv zzcv, long j10);

    void registerOnMeasurementEventListener(zzda zzda);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzda);

    void setInstanceIdProvider(zzdb zzdb);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzda zzda);
}
