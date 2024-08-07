package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ee.c;
import ee.f;
import qe.g;
import qe.h;
import qe.i;

public class RecyclerPreloadView extends RecyclerView {
    public boolean S0 = false;
    public boolean T0 = false;
    public int U0;
    public int V0;
    public int W0 = 1;
    public g X0;
    public i Y0;
    public h Z0;

    static {
        Class<RecyclerPreloadView> cls = RecyclerPreloadView.class;
    }

    public RecyclerPreloadView(Context context) {
        super(context);
    }

    private void setLayoutManagerPosition(RecyclerView.m mVar) {
        if (mVar instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) mVar;
            this.U0 = gridLayoutManager.Z0();
            this.V0 = gridLayoutManager.a1();
        } else if (mVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
            this.U0 = linearLayoutManager.Z0();
            this.V0 = linearLayoutManager.a1();
        }
    }

    public final void X(int i10) {
        i iVar;
        if (i10 == 0 || i10 == 1) {
            setLayoutManagerPosition(getLayoutManager());
        }
        h hVar = this.Z0;
        if (hVar != null) {
            f fVar = (f) hVar;
            if (i10 == 1) {
                c cVar = fVar.f9391a;
                String str = c.C0;
                if (cVar.f11878i0.P && cVar.A0.f10204e.size() > 0 && cVar.f9376t0.getAlpha() == 0.0f) {
                    cVar.f9376t0.animate().setDuration(150).alphaBy(1.0f).start();
                }
            } else if (i10 == 0) {
                c cVar2 = fVar.f9391a;
                String str2 = c.C0;
                if (cVar2.f11878i0.P && cVar2.A0.f10204e.size() > 0) {
                    cVar2.f9376t0.animate().setDuration(250).alpha(0.0f).start();
                }
            }
        }
        if (i10 == 0 && (iVar = this.Y0) != null) {
            c cVar3 = ((f) iVar).f9391a;
            String str3 = c.C0;
            cVar3.f11878i0.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(int r11) {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r10.getLayoutManager()
            if (r0 == 0) goto L_0x011e
            r10.setLayoutManagerPosition(r0)
            qe.g r1 = r10.X0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0057
            boolean r1 = r10.T0
            if (r1 == 0) goto L_0x0057
            androidx.recyclerview.widget.RecyclerView$e r1 = r10.getAdapter()
            if (r1 == 0) goto L_0x004f
            boolean r4 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r4 == 0) goto L_0x0034
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            int r1 = r1.c()
            int r4 = r0.N
            int r1 = r1 / r4
            int r4 = r0.a1()
            int r0 = r0.N
            int r4 = r4 / r0
            int r0 = r10.W0
            int r1 = r1 - r0
            if (r4 < r1) goto L_0x0034
            r0 = r2
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            if (r0 != 0) goto L_0x003a
            r10.S0 = r3
            goto L_0x0057
        L_0x003a:
            boolean r0 = r10.S0
            if (r0 != 0) goto L_0x004a
            qe.g r0 = r10.X0
            ee.c r0 = (ee.c) r0
            r0.T0()
            if (r11 <= 0) goto L_0x0057
            r10.S0 = r2
            goto L_0x0057
        L_0x004a:
            if (r11 != 0) goto L_0x0057
            r10.S0 = r3
            goto L_0x0057
        L_0x004f:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Adapter is null,Please check it!"
            r11.<init>(r0)
            throw r11
        L_0x0057:
            qe.h r0 = r10.Z0
            if (r0 == 0) goto L_0x00f6
            ee.f r0 = (ee.f) r0
            ee.c r0 = r0.f9391a
            java.lang.String r1 = ee.c.C0
            ke.a r1 = r0.f11878i0
            boolean r1 = r1.P
            if (r1 == 0) goto L_0x00f6
            com.luck.picture.lib.widget.RecyclerPreloadView r1 = r0.f9371o0
            int r1 = r1.getFirstVisiblePosition()
            r4 = -1
            if (r1 == r4) goto L_0x00f6
            fe.d r4 = r0.A0
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> r4 = r4.f10204e
            int r5 = r4.size()
            if (r5 <= r1) goto L_0x00f6
            java.lang.Object r5 = r4.get(r1)
            com.luck.picture.lib.entity.LocalMedia r5 = (com.luck.picture.lib.entity.LocalMedia) r5
            long r5 = r5.L
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f6
            android.widget.TextView r5 = r0.f9376t0
            android.content.Context r0 = r0.r()
            java.lang.Object r1 = r4.get(r1)
            com.luck.picture.lib.entity.LocalMedia r1 = (com.luck.picture.lib.entity.LocalMedia) r1
            long r6 = r1.L
            java.text.SimpleDateFormat r1 = xe.b.f17318a
            java.lang.String r1 = java.lang.String.valueOf(r6)
            int r1 = r1.length()
            r4 = 10
            if (r1 <= r4) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
        L_0x00a8:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r4 = 3
            int r8 = r1.get(r4)
            java.util.Date r9 = new java.util.Date
            r9.<init>(r6)
            r1.setTime(r9)
            int r1 = r1.get(r4)
            if (r1 != r8) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r2 = r3
        L_0x00c1:
            if (r2 == 0) goto L_0x00ca
            int r1 = com.luck.picture.lib.R$string.ps_current_week
            java.lang.String r0 = r0.getString(r1)
            goto L_0x00f3
        L_0x00ca:
            java.util.Date r1 = new java.util.Date
            r1.<init>(r6)
            java.text.SimpleDateFormat r2 = xe.b.f17319b
            java.lang.String r1 = r2.format(r1)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r3 = r2.format(r3)
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00eb
            int r1 = com.luck.picture.lib.R$string.ps_current_month
            java.lang.String r0 = r0.getString(r1)
            goto L_0x00f3
        L_0x00eb:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.String r0 = r2.format(r0)
        L_0x00f3:
            r5.setText(r0)
        L_0x00f6:
            qe.i r0 = r10.Y0
            if (r0 == 0) goto L_0x011d
            int r11 = java.lang.Math.abs(r11)
            r0 = 150(0x96, float:2.1E-43)
            if (r11 >= r0) goto L_0x0110
            qe.i r11 = r10.Y0
            ee.f r11 = (ee.f) r11
            ee.c r11 = r11.f9391a
            java.lang.String r0 = ee.c.C0
            ke.a r11 = r11.f11878i0
            r11.getClass()
            goto L_0x011d
        L_0x0110:
            qe.i r11 = r10.Y0
            ee.f r11 = (ee.f) r11
            ee.c r11 = r11.f9391a
            java.lang.String r0 = ee.c.C0
            ke.a r11 = r11.f11878i0
            r11.getClass()
        L_0x011d:
            return
        L_0x011e:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "LayoutManager is null,Please check it!"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.widget.RecyclerPreloadView.Y(int):void");
    }

    public int getFirstVisiblePosition() {
        return this.U0;
    }

    public int getLastVisiblePosition() {
        return this.V0;
    }

    public void setEnabledLoadMore(boolean z10) {
        this.T0 = z10;
    }

    public void setLastVisiblePosition(int i10) {
        this.V0 = i10;
    }

    public void setOnRecyclerViewPreloadListener(g gVar) {
        this.X0 = gVar;
    }

    public void setOnRecyclerViewScrollListener(h hVar) {
        this.Z0 = hVar;
    }

    public void setOnRecyclerViewScrollStateListener(i iVar) {
        this.Y0 = iVar;
    }

    public void setReachBottomRow(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.W0 = i10;
    }

    public RecyclerPreloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecyclerPreloadView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
