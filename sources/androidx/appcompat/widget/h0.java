package androidx.appcompat.widget;

import a2.c;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$id;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: SuggestionsAdapter */
public final class h0 extends c implements View.OnClickListener {
    public static final /* synthetic */ int E = 0;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;

    /* renamed from: r  reason: collision with root package name */
    public final SearchView f1116r;

    /* renamed from: s  reason: collision with root package name */
    public final SearchableInfo f1117s;

    /* renamed from: t  reason: collision with root package name */
    public final Context f1118t;

    /* renamed from: u  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1119u;

    /* renamed from: v  reason: collision with root package name */
    public final int f1120v;

    /* renamed from: w  reason: collision with root package name */
    public int f1121w = 1;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f1122x;

    /* renamed from: y  reason: collision with root package name */
    public int f1123y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f1124z = -1;

    /* compiled from: SuggestionsAdapter */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1125a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1126b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1127c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1128d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1129e;

        public a(View view) {
            this.f1125a = (TextView) view.findViewById(16908308);
            this.f1126b = (TextView) view.findViewById(16908309);
            this.f1127c = (ImageView) view.findViewById(16908295);
            this.f1128d = (ImageView) view.findViewById(16908296);
            this.f1129e = (ImageView) view.findViewById(R$id.edit_query);
        }
    }

    public h0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1116r = searchView;
        this.f1117s = searchableInfo;
        this.f1120v = searchView.getSuggestionCommitIconResId();
        this.f1118t = context;
        this.f1119u = weakHashMap;
    }

    public static String i(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r19, android.database.Cursor r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            androidx.appcompat.widget.h0$a r3 = (androidx.appcompat.widget.h0.a) r3
            int r0 = r1.D
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = r5
        L_0x0018:
            android.widget.TextView r0 = r3.f1125a
            r7 = 8
            if (r0 == 0) goto L_0x0036
            int r0 = r1.f1123y
            java.lang.String r0 = i(r2, r0)
            android.widget.TextView r8 = r3.f1125a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
            r8.setVisibility(r7)
            goto L_0x0036
        L_0x0033:
            r8.setVisibility(r5)
        L_0x0036:
            android.widget.TextView r0 = r3.f1126b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00be
            int r0 = r1.A
            java.lang.String r0 = i(r2, r0)
            if (r0 == 0) goto L_0x0087
            android.content.res.ColorStateList r10 = r1.f1122x
            if (r10 != 0) goto L_0x0066
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f1118t
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int r12 = androidx.appcompat.R$attr.textColorSearchUrl
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f1118t
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.f1122x = r10
        L_0x0066:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.f1122x
            r16 = 0
            r17 = r11
            r11 = r15
            r4 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r4, r5, r0, r11)
            goto L_0x008d
        L_0x0087:
            int r0 = r1.f1124z
            java.lang.String r10 = i(r2, r0)
        L_0x008d:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x00a0
            android.widget.TextView r0 = r3.f1125a
            if (r0 == 0) goto L_0x00ac
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f1125a
            r0.setMaxLines(r8)
            goto L_0x00ac
        L_0x00a0:
            android.widget.TextView r0 = r3.f1125a
            if (r0 == 0) goto L_0x00ac
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.f1125a
            r0.setMaxLines(r9)
        L_0x00ac:
            android.widget.TextView r0 = r3.f1126b
            r0.setText(r10)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x00bb
            r0.setVisibility(r7)
            goto L_0x00be
        L_0x00bb:
            r0.setVisibility(r5)
        L_0x00be:
            android.widget.ImageView r4 = r3.f1127c
            r10 = 0
            if (r4 == 0) goto L_0x0157
            int r0 = r1.B
            r11 = -1
            if (r0 != r11) goto L_0x00cb
            r0 = r10
            goto L_0x0144
        L_0x00cb:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.g(r0)
            if (r0 == 0) goto L_0x00d7
            goto L_0x0144
        L_0x00d7:
            android.app.SearchableInfo r0 = r1.f1117s
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f1119u
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x0100
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f1119u
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f5
            r0 = r10
            goto L_0x0137
        L_0x00f5:
            android.content.Context r11 = r1.f1118t
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0137
        L_0x0100:
            android.content.Context r12 = r1.f1118t
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x0123 }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0113
            goto L_0x0128
        L_0x0113:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x0129
            r0.flattenToShortString()
            goto L_0x0128
        L_0x0123:
            r0 = move-exception
            r12 = r0
            r12.toString()
        L_0x0128:
            r12 = r10
        L_0x0129:
            if (r12 != 0) goto L_0x012d
            r0 = r10
            goto L_0x0131
        L_0x012d:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x0131:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r1.f1119u
            r13.put(r11, r0)
            r0 = r12
        L_0x0137:
            if (r0 == 0) goto L_0x013a
            goto L_0x0144
        L_0x013a:
            android.content.Context r0 = r1.f1118t
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0144:
            r11 = 4
            r4.setImageDrawable(r0)
            if (r0 != 0) goto L_0x014e
            r4.setVisibility(r11)
            goto L_0x0157
        L_0x014e:
            r4.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r9, r5)
        L_0x0157:
            android.widget.ImageView r0 = r3.f1128d
            if (r0 == 0) goto L_0x017b
            int r4 = r1.C
            r11 = -1
            if (r4 != r11) goto L_0x0161
            goto L_0x0169
        L_0x0161:
            java.lang.String r2 = r2.getString(r4)
            android.graphics.drawable.Drawable r10 = r1.g(r2)
        L_0x0169:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0172
            r0.setVisibility(r7)
            goto L_0x017b
        L_0x0172:
            r0.setVisibility(r5)
            r10.setVisible(r5, r5)
            r10.setVisible(r9, r5)
        L_0x017b:
            int r0 = r1.f1121w
            if (r0 == r8) goto L_0x018c
            if (r0 != r9) goto L_0x0186
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0186
            goto L_0x018c
        L_0x0186:
            android.widget.ImageView r0 = r3.f1129e
            r0.setVisibility(r7)
            goto L_0x01a1
        L_0x018c:
            android.widget.ImageView r0 = r3.f1129e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f1129e
            android.widget.TextView r2 = r3.f1125a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f1129e
            r0.setOnClickListener(r1)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.b(android.view.View, android.database.Cursor):void");
    }

    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f1123y = cursor.getColumnIndex("suggest_text_1");
                this.f1124z = cursor.getColumnIndex("suggest_text_2");
                this.A = cursor.getColumnIndex("suggest_text_2_url");
                this.B = cursor.getColumnIndex("suggest_icon_1");
                this.C = cursor.getColumnIndex("suggest_icon_2");
                this.D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    public final String d(Cursor cursor) {
        String i10;
        String i11;
        if (cursor == null) {
            return null;
        }
        String i12 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i12 != null) {
            return i12;
        }
        if (this.f1117s.shouldRewriteQueryFromData() && (i11 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i11;
        }
        if (!this.f1117s.shouldRewriteQueryFromText() || (i10 = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i10;
    }

    public final View e(ViewGroup viewGroup) {
        View inflate = this.f78q.inflate(this.f76o, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R$id.edit_query)).setImageResource(this.f1120v);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int i10;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1118t.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i10 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i10 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i10 != 0) {
                        return resourcesForApplication.getDrawable(i10);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:44|45|46|47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|38|39|40|41|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x00b9=Splitter:B:47:0x00b9, B:30:0x007f=Splitter:B:30:0x007f, B:41:0x00af=Splitter:B:41:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable g(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x00e6
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x00e6
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0013
            goto L_0x00e6
        L_0x0013:
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = "android.resource://"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.content.Context r3 = r5.f1118t     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.append(r1)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f1119u     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            if (r3 != 0) goto L_0x0042
            r3 = r0
            goto L_0x0046
        L_0x0042:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
        L_0x0046:
            if (r3 == 0) goto L_0x0049
            return r3
        L_0x0049:
            android.content.Context r3 = r5.f1118t     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable r1 = k1.a.getDrawable(r3, r1)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            if (r1 == 0) goto L_0x005a
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f1119u     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable$ConstantState r4 = r1.getConstantState()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r3.put(r2, r4)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
        L_0x005a:
            return r1
        L_0x005b:
            return r0
        L_0x005c:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f1119u
            java.lang.Object r1 = r1.get(r6)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 != 0) goto L_0x0068
            r1 = r0
            goto L_0x006c
        L_0x0068:
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
        L_0x006c:
            if (r1 == 0) goto L_0x006f
            return r1
        L_0x006f:
            android.net.Uri r1 = android.net.Uri.parse(r6)
            java.lang.String r2 = r1.getScheme()     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x00d4 }
            if (r2 == 0) goto L_0x009b
            android.graphics.drawable.Drawable r0 = r5.f(r1)     // Catch:{ NotFoundException -> 0x0084 }
            goto L_0x00db
        L_0x0084:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d4 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00d4 }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00d4 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d4 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x009b:
            android.content.Context r2 = r5.f1118t     // Catch:{ FileNotFoundException -> 0x00d4 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.io.InputStream r2 = r2.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x00d4 }
            if (r2 == 0) goto L_0x00bd
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r0)     // Catch:{ all -> 0x00b4 }
            r2.close()     // Catch:{ IOException -> 0x00af }
            goto L_0x00b2
        L_0x00af:
            r1.toString()     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x00b2:
            r0 = r3
            goto L_0x00db
        L_0x00b4:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00bc
        L_0x00b9:
            r1.toString()     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x00bc:
            throw r3     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x00bd:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d4 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00d4 }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00d4 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d4 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x00d4:
            r2 = move-exception
            java.util.Objects.toString(r1)
            r2.getMessage()
        L_0x00db:
            if (r0 == 0) goto L_0x00e6
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f1119u
            android.graphics.drawable.Drawable$ConstantState r2 = r0.getConstantState()
            r1.put(r6, r2)
        L_0x00e6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View inflate = this.f78q.inflate(this.f77p, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1125a.setText(e10.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f1125a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        Uri build = fragment.build();
        return this.f1118t.getContentResolver().query(build, (String[]) null, suggestSelection, strArr, (String) null);
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f68c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f68c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1116r.p((CharSequence) tag);
        }
    }
}
