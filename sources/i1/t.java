package i1;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.R$color;
import androidx.core.R$drawable;
import androidx.core.R$string;
import androidx.core.graphics.drawable.IconCompat;
import i1.y;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NotificationCompatBuilder */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10995a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f10996b;

    /* renamed from: c  reason: collision with root package name */
    public final p f10997c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteViews f10998d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f10999e;

    /* compiled from: NotificationCompatBuilder */
    public static class a {
        public static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        public static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class c {
        public static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class d {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class e {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class f {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class g {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class h {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class i {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class j {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    public static class k {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    public t(p pVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Icon icon;
        ArrayList<String> arrayList;
        int i10;
        Bundle bundle;
        a0[] a0VarArr;
        a0[] a0VarArr2;
        t tVar = this;
        p pVar2 = pVar;
        new ArrayList();
        tVar.f10999e = new Bundle();
        tVar.f10997c = pVar2;
        Context context = pVar2.f10970a;
        tVar.f10995a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            tVar.f10996b = h.a(context, pVar2.f10990u);
        } else {
            tVar.f10996b = new Notification.Builder(pVar2.f10970a);
        }
        Notification notification = pVar2.f10992w;
        Bundle[] bundleArr = null;
        Notification.Builder lights = tVar.f10996b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i11 = 2;
        int i12 = 0;
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(pVar2.f10974e).setContentText(pVar2.f10975f).setContentInfo(pVar2.f10979j).setContentIntent(pVar2.f10976g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = pVar2.f10977h;
        if ((notification.flags & 128) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z13).setNumber(pVar2.f10980k).setProgress(0, 0, false);
        Notification.Builder builder = tVar.f10996b;
        IconCompat iconCompat = pVar2.f10978i;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = IconCompat.a.f(iconCompat, context);
        }
        f.b(builder, icon);
        a.b(a.d(a.c(tVar.f10996b, pVar2.f10984o), false), pVar2.f10981l);
        s sVar = pVar2.f10983n;
        if (sVar instanceof q) {
            q qVar = (q) sVar;
            int i13 = R$drawable.ic_call_decline;
            int i14 = R$string.call_notification_hang_up_action;
            Integer valueOf = Integer.valueOf(k1.a.getColor(qVar.f10994a.f10970a, R$color.call_notification_decline_color));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(qVar.f10994a.f10970a.getResources().getString(i14));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
            Context context2 = qVar.f10994a.f10970a;
            PorterDuff.Mode mode = IconCompat.f2119k;
            context2.getClass();
            IconCompat b10 = IconCompat.b(context2.getResources(), context2.getPackageName(), i13);
            Bundle bundle2 = new Bundle();
            CharSequence b11 = p.b(spannableStringBuilder);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (arrayList2.isEmpty()) {
                a0VarArr = null;
            } else {
                a0VarArr = (a0[]) arrayList2.toArray(new a0[arrayList2.size()]);
            }
            if (arrayList3.isEmpty()) {
                a0VarArr2 = null;
            } else {
                a0VarArr2 = (a0[]) arrayList3.toArray(new a0[arrayList3.size()]);
            }
            m mVar = new m(b10, b11, (PendingIntent) null, bundle2, a0VarArr2, a0VarArr, true, 0, true, false, false);
            mVar.f10955a.putBoolean("key_action_priority", true);
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(mVar);
            ArrayList<m> arrayList5 = qVar.f10994a.f10971b;
            if (arrayList5 != null) {
                Iterator<m> it = arrayList5.iterator();
                while (it.hasNext()) {
                    m next = it.next();
                    if (next.f10961g) {
                        arrayList4.add(next);
                    } else if (!next.f10955a.getBoolean("key_action_priority") && i11 > 1) {
                        arrayList4.add(next);
                        i11--;
                    }
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                tVar.a((m) it2.next());
            }
        } else {
            Iterator<m> it3 = pVar2.f10971b.iterator();
            while (it3.hasNext()) {
                tVar.a(it3.next());
            }
        }
        Bundle bundle3 = pVar2.f10986q;
        if (bundle3 != null) {
            tVar.f10999e.putAll(bundle3);
        }
        int i15 = Build.VERSION.SDK_INT;
        tVar.f10998d = pVar2.f10989t;
        b.a(tVar.f10996b, pVar2.f10982m);
        d.i(tVar.f10996b, pVar2.f10985p);
        d.g(tVar.f10996b, (String) null);
        d.j(tVar.f10996b, (String) null);
        d.h(tVar.f10996b, false);
        e.b(tVar.f10996b, (String) null);
        e.c(tVar.f10996b, pVar2.f10987r);
        e.f(tVar.f10996b, pVar2.f10988s);
        e.d(tVar.f10996b, (Notification) null);
        e.e(tVar.f10996b, notification.sound, notification.audioAttributes);
        if (i15 < 28) {
            ArrayList<y> arrayList6 = pVar2.f10972c;
            if (arrayList6 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList6.size());
                Iterator<y> it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    y next2 = it4.next();
                    String str = next2.f11005c;
                    if (str == null) {
                        if (next2.f11003a != null) {
                            StringBuilder q10 = android.support.v4.media.a.q("name:");
                            q10.append(next2.f11003a);
                            str = q10.toString();
                        } else {
                            str = "";
                        }
                    }
                    arrayList.add(str);
                }
            }
            ArrayList<String> arrayList7 = pVar2.f10993x;
            if (arrayList == null) {
                arrayList = arrayList7;
            } else if (arrayList7 != null) {
                v0.d dVar = new v0.d(arrayList7.size() + arrayList.size());
                dVar.addAll(arrayList);
                dVar.addAll(arrayList7);
                arrayList = new ArrayList<>(dVar);
            }
        } else {
            arrayList = pVar2.f10993x;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String a10 : arrayList) {
                e.a(tVar.f10996b, a10);
            }
        }
        if (pVar2.f10973d.size() > 0) {
            if (pVar2.f10986q == null) {
                pVar2.f10986q = new Bundle();
            }
            Bundle bundle4 = pVar2.f10986q.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i16 = 0;
            while (i12 < pVar2.f10973d.size()) {
                String num = Integer.toString(i12);
                m mVar2 = pVar2.f10973d.get(i12);
                Object obj = u.f11000a;
                Bundle bundle7 = new Bundle();
                IconCompat a11 = mVar2.a();
                if (a11 != null) {
                    i10 = a11.c();
                } else {
                    i10 = i16;
                }
                bundle7.putInt("icon", i10);
                bundle7.putCharSequence("title", mVar2.f10963i);
                bundle7.putParcelable("actionIntent", mVar2.f10964j);
                if (mVar2.f10955a != null) {
                    bundle = new Bundle(mVar2.f10955a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", mVar2.f10958d);
                bundle7.putBundle("extras", bundle);
                a0[] a0VarArr3 = mVar2.f10957c;
                if (a0VarArr3 != null) {
                    bundleArr = new Bundle[a0VarArr3.length];
                    while (i16 < a0VarArr3.length) {
                        a0 a0Var = a0VarArr3[i16];
                        Bundle bundle8 = new Bundle();
                        a0Var.getClass();
                        bundle8.putString("resultKey", (String) null);
                        bundle8.putCharSequence("label", (CharSequence) null);
                        bundle8.putCharSequenceArray("choices", (CharSequence[]) null);
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", (Bundle) null);
                        bundleArr[i16] = bundle8;
                        i16++;
                        a0VarArr3 = a0VarArr3;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", mVar2.f10959e);
                bundle7.putInt("semanticAction", mVar2.f10960f);
                bundle6.putBundle(num, bundle7);
                i12++;
                i16 = 0;
                bundleArr = null;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (pVar2.f10986q == null) {
                pVar2.f10986q = new Bundle();
            }
            pVar2.f10986q.putBundle("android.car.EXTENSIONS", bundle4);
            tVar = this;
            tVar.f10999e.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 24) {
            c.a(tVar.f10996b, pVar2.f10986q);
            g.e(tVar.f10996b, (CharSequence[]) null);
            RemoteViews remoteViews = pVar2.f10989t;
            if (remoteViews != null) {
                g.b(tVar.f10996b, remoteViews);
            }
        }
        if (i17 >= 26) {
            h.b(tVar.f10996b, 0);
            h.e(tVar.f10996b, (CharSequence) null);
            h.f(tVar.f10996b, (String) null);
            h.g(tVar.f10996b, 0);
            h.d(tVar.f10996b, 0);
            if (!TextUtils.isEmpty(pVar2.f10990u)) {
                tVar.f10996b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i17 >= 28) {
            Iterator<y> it5 = pVar2.f10972c.iterator();
            while (it5.hasNext()) {
                y next3 = it5.next();
                Notification.Builder builder2 = tVar.f10996b;
                next3.getClass();
                i.a(builder2, y.a.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(tVar.f10996b, pVar2.f10991v);
            j.b(tVar.f10996b, (Notification.BubbleMetadata) null);
        }
    }

    public final void a(m mVar) {
        Icon icon;
        Bundle bundle;
        IconCompat a10 = mVar.a();
        RemoteInput[] remoteInputArr = null;
        if (a10 != null) {
            icon = IconCompat.a.f(a10, (Context) null);
        } else {
            icon = null;
        }
        Notification.Action.Builder a11 = f.a(icon, mVar.f10963i, mVar.f10964j);
        a0[] a0VarArr = mVar.f10957c;
        if (a0VarArr != null) {
            if (a0VarArr != null) {
                remoteInputArr = new RemoteInput[a0VarArr.length];
                for (int i10 = 0; i10 < a0VarArr.length; i10++) {
                    remoteInputArr[i10] = a0.a(a0VarArr[i10]);
                }
            }
            for (RemoteInput c10 : remoteInputArr) {
                d.c(a11, c10);
            }
        }
        if (mVar.f10955a != null) {
            bundle = new Bundle(mVar.f10955a);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", mVar.f10958d);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            g.a(a11, mVar.f10958d);
        }
        bundle.putInt("android.support.action.semanticAction", mVar.f10960f);
        if (i11 >= 28) {
            i.b(a11, mVar.f10960f);
        }
        if (i11 >= 29) {
            j.c(a11, mVar.f10961g);
        }
        if (i11 >= 31) {
            k.a(a11, mVar.f10965k);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", mVar.f10959e);
        d.b(a11, bundle);
        d.a(this.f10996b, d.d(a11));
    }
}
