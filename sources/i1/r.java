package i1;

import android.app.Notification;
import android.app.Notification$DecoratedCustomViewStyle;
import android.os.Build;
import android.widget.RemoteViews;

/* compiled from: NotificationCompat */
public final class r extends s {

    /* compiled from: NotificationCompat */
    public static class a {
        public static void a(RemoteViews remoteViews, int i10, CharSequence charSequence) {
            remoteViews.setContentDescription(i10, charSequence);
        }
    }

    /* compiled from: NotificationCompat */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, Object obj) {
            return builder.setStyle((Notification.Style) obj);
        }
    }

    /* compiled from: NotificationCompat */
    public static class c {
        public static Notification$DecoratedCustomViewStyle a() {
            return new Notification$DecoratedCustomViewStyle();
        }
    }

    public final void b(t tVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            b.a(tVar.f10996b, c.a());
        }
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.RemoteViews f() {
        /*
            r14 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 24
            if (r0 < r2) goto L_0x0008
            return r1
        L_0x0008:
            i1.p r0 = r14.f10994a
            android.widget.RemoteViews r2 = r0.f10989t
            if (r2 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r1
        L_0x0010:
            if (r2 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r3 = androidx.core.R$layout.notification_template_custom_big
            android.content.Context r0 = r0.f10970a
            android.content.res.Resources r0 = r0.getResources()
            android.widget.RemoteViews r10 = new android.widget.RemoteViews
            i1.p r4 = r14.f10994a
            android.content.Context r4 = r4.f10970a
            java.lang.String r4 = r4.getPackageName()
            r10.<init>(r4, r3)
            i1.p r3 = r14.f10994a
            int r4 = r3.f10981l
            androidx.core.graphics.drawable.IconCompat r4 = r3.f10978i
            r11 = 0
            if (r4 == 0) goto L_0x006e
            int r3 = androidx.core.R$id.icon
            r10.setViewVisibility(r3, r11)
            i1.p r4 = r14.f10994a
            androidx.core.graphics.drawable.IconCompat r4 = r4.f10978i
            android.graphics.Bitmap r4 = r14.c(r4, r11, r11)
            r10.setImageViewBitmap(r3, r4)
            i1.p r3 = r14.f10994a
            android.app.Notification r3 = r3.f10992w
            int r3 = r3.icon
            if (r3 == 0) goto L_0x009b
            int r3 = androidx.core.R$dimen.notification_right_icon_size
            int r3 = r0.getDimensionPixelSize(r3)
            int r4 = androidx.core.R$dimen.notification_small_icon_background_padding
            int r4 = r0.getDimensionPixelSize(r4)
            int r4 = r4 * 2
            int r4 = r3 - r4
            i1.p r5 = r14.f10994a
            android.app.Notification r6 = r5.f10992w
            int r6 = r6.icon
            int r5 = r5.f10987r
            android.graphics.Bitmap r3 = r14.d(r6, r3, r4, r5)
            int r4 = androidx.core.R$id.right_icon
            r10.setImageViewBitmap(r4, r3)
            r10.setViewVisibility(r4, r11)
            goto L_0x009b
        L_0x006e:
            android.app.Notification r3 = r3.f10992w
            int r3 = r3.icon
            if (r3 == 0) goto L_0x009b
            int r3 = androidx.core.R$id.icon
            r10.setViewVisibility(r3, r11)
            int r4 = androidx.core.R$dimen.notification_large_icon_width
            int r4 = r0.getDimensionPixelSize(r4)
            int r5 = androidx.core.R$dimen.notification_big_circle_margin
            int r5 = r0.getDimensionPixelSize(r5)
            int r4 = r4 - r5
            int r5 = androidx.core.R$dimen.notification_small_icon_size_as_large
            int r5 = r0.getDimensionPixelSize(r5)
            i1.p r6 = r14.f10994a
            android.app.Notification r7 = r6.f10992w
            int r7 = r7.icon
            int r6 = r6.f10987r
            android.graphics.Bitmap r4 = r14.d(r7, r4, r5, r6)
            r10.setImageViewBitmap(r3, r4)
        L_0x009b:
            i1.p r3 = r14.f10994a
            java.lang.CharSequence r3 = r3.f10974e
            if (r3 == 0) goto L_0x00a6
            int r4 = androidx.core.R$id.title
            r10.setTextViewText(r4, r3)
        L_0x00a6:
            i1.p r3 = r14.f10994a
            java.lang.CharSequence r3 = r3.f10975f
            r12 = 1
            if (r3 == 0) goto L_0x00b4
            int r4 = androidx.core.R$id.text
            r10.setTextViewText(r4, r3)
            r3 = r12
            goto L_0x00b5
        L_0x00b4:
            r3 = r11
        L_0x00b5:
            i1.p r4 = r14.f10994a
            java.lang.CharSequence r5 = r4.f10979j
            r13 = 8
            if (r5 == 0) goto L_0x00c6
            int r0 = androidx.core.R$id.info
            r10.setTextViewText(r0, r5)
            r10.setViewVisibility(r0, r11)
            goto L_0x00f9
        L_0x00c6:
            int r4 = r4.f10980k
            if (r4 <= 0) goto L_0x00fc
            int r3 = androidx.core.R$integer.status_bar_notification_info_maxnum
            int r3 = r0.getInteger(r3)
            i1.p r4 = r14.f10994a
            int r4 = r4.f10980k
            if (r4 <= r3) goto L_0x00e2
            int r3 = androidx.core.R$id.info
            int r4 = androidx.core.R$string.status_bar_notification_info_overflow
            java.lang.String r0 = r0.getString(r4)
            r10.setTextViewText(r3, r0)
            goto L_0x00f4
        L_0x00e2:
            java.text.NumberFormat r0 = java.text.NumberFormat.getIntegerInstance()
            int r3 = androidx.core.R$id.info
            i1.p r4 = r14.f10994a
            int r4 = r4.f10980k
            long r4 = (long) r4
            java.lang.String r0 = r0.format(r4)
            r10.setTextViewText(r3, r0)
        L_0x00f4:
            int r0 = androidx.core.R$id.info
            r10.setViewVisibility(r0, r11)
        L_0x00f9:
            r0 = r12
            r3 = r0
            goto L_0x0102
        L_0x00fc:
            int r0 = androidx.core.R$id.info
            r10.setViewVisibility(r0, r13)
            r0 = r11
        L_0x0102:
            i1.p r4 = r14.f10994a
            java.lang.CharSequence r4 = r4.f10984o
            if (r4 == 0) goto L_0x0122
            int r5 = androidx.core.R$id.text
            r10.setTextViewText(r5, r4)
            i1.p r4 = r14.f10994a
            java.lang.CharSequence r4 = r4.f10975f
            if (r4 == 0) goto L_0x011d
            int r5 = androidx.core.R$id.text2
            r10.setTextViewText(r5, r4)
            r10.setViewVisibility(r5, r11)
            r4 = r12
            goto L_0x0123
        L_0x011d:
            int r4 = androidx.core.R$id.text2
            r10.setViewVisibility(r4, r13)
        L_0x0122:
            r4 = r11
        L_0x0123:
            if (r4 == 0) goto L_0x012f
            int r5 = androidx.core.R$id.line1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r10
            i1.s.a.b(r4, r5, r6, r7, r8, r9)
        L_0x012f:
            i1.p r4 = r14.f10994a
            boolean r5 = r4.f10982m
            r6 = 0
            if (r5 == 0) goto L_0x013c
            android.app.Notification r4 = r4.f10992w
            long r4 = r4.when
            goto L_0x013d
        L_0x013c:
            r4 = r6
        L_0x013d:
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0156
            int r0 = androidx.core.R$id.time
            r10.setViewVisibility(r0, r11)
            i1.p r4 = r14.f10994a
            boolean r5 = r4.f10982m
            if (r5 == 0) goto L_0x0150
            android.app.Notification r4 = r4.f10992w
            long r6 = r4.when
        L_0x0150:
            java.lang.String r4 = "setTime"
            r10.setLong(r0, r4, r6)
            r0 = r12
        L_0x0156:
            int r4 = androidx.core.R$id.right_side
            if (r0 == 0) goto L_0x015c
            r0 = r11
            goto L_0x015d
        L_0x015c:
            r0 = r13
        L_0x015d:
            r10.setViewVisibility(r4, r0)
            int r0 = androidx.core.R$id.line3
            if (r3 == 0) goto L_0x0166
            r3 = r11
            goto L_0x0167
        L_0x0166:
            r3 = r13
        L_0x0167:
            r10.setViewVisibility(r0, r3)
            int r0 = androidx.core.R$id.actions
            r10.removeAllViews(r0)
            i1.p r0 = r14.f10994a
            java.util.ArrayList<i1.m> r0 = r0.f10971b
            if (r0 != 0) goto L_0x0176
            goto L_0x0193
        L_0x0176:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x017f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0193
            java.lang.Object r3 = r0.next()
            i1.m r3 = (i1.m) r3
            boolean r4 = r3.f10961g
            if (r4 != 0) goto L_0x017f
            r1.add(r3)
            goto L_0x017f
        L_0x0193:
            if (r1 == 0) goto L_0x01f4
            int r0 = r1.size()
            r3 = 3
            int r0 = java.lang.Math.min(r0, r3)
            if (r0 <= 0) goto L_0x01f4
            r3 = r11
        L_0x01a1:
            if (r3 >= r0) goto L_0x01f5
            java.lang.Object r4 = r1.get(r3)
            i1.m r4 = (i1.m) r4
            android.app.PendingIntent r5 = r4.f10964j
            if (r5 != 0) goto L_0x01af
            r5 = r12
            goto L_0x01b0
        L_0x01af:
            r5 = r11
        L_0x01b0:
            android.widget.RemoteViews r6 = new android.widget.RemoteViews
            i1.p r7 = r14.f10994a
            android.content.Context r7 = r7.f10970a
            java.lang.String r7 = r7.getPackageName()
            if (r5 == 0) goto L_0x01bf
            int r8 = androidx.core.R$layout.notification_action_tombstone
            goto L_0x01c1
        L_0x01bf:
            int r8 = androidx.core.R$layout.notification_action
        L_0x01c1:
            r6.<init>(r7, r8)
            androidx.core.graphics.drawable.IconCompat r7 = r4.a()
            if (r7 == 0) goto L_0x01d5
            int r8 = androidx.core.R$id.action_image
            int r9 = androidx.core.R$color.notification_action_color_filter
            android.graphics.Bitmap r7 = r14.c(r7, r9, r11)
            r6.setImageViewBitmap(r8, r7)
        L_0x01d5:
            int r7 = androidx.core.R$id.action_text
            java.lang.CharSequence r8 = r4.f10963i
            r6.setTextViewText(r7, r8)
            if (r5 != 0) goto L_0x01e5
            int r5 = androidx.core.R$id.action_container
            android.app.PendingIntent r7 = r4.f10964j
            r6.setOnClickPendingIntent(r5, r7)
        L_0x01e5:
            int r5 = androidx.core.R$id.action_container
            java.lang.CharSequence r4 = r4.f10963i
            i1.r.a.a(r6, r5, r4)
            int r4 = androidx.core.R$id.actions
            r10.addView(r4, r6)
            int r3 = r3 + 1
            goto L_0x01a1
        L_0x01f4:
            r12 = r11
        L_0x01f5:
            if (r12 == 0) goto L_0x01f9
            r0 = r11
            goto L_0x01fa
        L_0x01f9:
            r0 = r13
        L_0x01fa:
            int r1 = androidx.core.R$id.actions
            r10.setViewVisibility(r1, r0)
            int r1 = androidx.core.R$id.action_divider
            r10.setViewVisibility(r1, r0)
            int r0 = androidx.core.R$id.title
            r10.setViewVisibility(r0, r13)
            int r0 = androidx.core.R$id.text2
            r10.setViewVisibility(r0, r13)
            int r0 = androidx.core.R$id.text
            r10.setViewVisibility(r0, r13)
            int r0 = androidx.core.R$id.notification_main_column
            r10.removeAllViews(r0)
            android.widget.RemoteViews r1 = r2.clone()
            r10.addView(r0, r1)
            r10.setViewVisibility(r0, r11)
            int r5 = androidx.core.R$id.notification_main_column_container
            r6 = 0
            i1.p r0 = r14.f10994a
            android.content.Context r0 = r0.f10970a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.core.R$dimen.notification_top_pad
            int r1 = r0.getDimensionPixelSize(r1)
            int r2 = androidx.core.R$dimen.notification_top_pad_large_text
            int r2 = r0.getDimensionPixelSize(r2)
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r7 = 1067869798(0x3fa66666, float:1.3)
            if (r4 >= 0) goto L_0x024a
            r0 = r3
            goto L_0x024f
        L_0x024a:
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x024f
            r0 = r7
        L_0x024f:
            float r0 = r0 - r3
            r4 = 1050253720(0x3e999998, float:0.29999995)
            float r0 = r0 / r4
            float r3 = r3 - r0
            float r1 = (float) r1
            float r3 = r3 * r1
            float r1 = (float) r2
            float r0 = r0 * r1
            float r0 = r0 + r3
            int r7 = java.lang.Math.round(r0)
            r8 = 0
            r9 = 0
            r4 = r10
            i1.s.a.b(r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.r.f():android.widget.RemoteViews");
    }

    public final void g() {
        if (Build.VERSION.SDK_INT < 24) {
            this.f10994a.getClass();
        }
    }

    public final void h() {
        if (Build.VERSION.SDK_INT < 24) {
            this.f10994a.getClass();
            this.f10994a.getClass();
        }
    }
}
