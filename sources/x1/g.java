package x1;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16882a;

    /* compiled from: AccessibilityNodeProviderCompat */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final g f16883a;

        public a(g gVar) {
            this.f16883a = gVar;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            f a10 = this.f16883a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f16862a;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f16883a.getClass();
            return null;
        }

        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f16883a.c(i10, i11, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    public static class b extends a {
        public b(g gVar) {
            super(gVar);
        }

        public final AccessibilityNodeInfo findFocus(int i10) {
            f b10 = this.f16883a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.f16862a;
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    public static class c extends b {
        public c(g gVar) {
            super(gVar);
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f16883a.getClass();
        }
    }

    public g() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f16882a = new c(this);
        } else {
            this.f16882a = new b(this);
        }
    }

    public f a(int i10) {
        return null;
    }

    public f b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }

    public g(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f16882a = accessibilityNodeProvider;
    }
}
