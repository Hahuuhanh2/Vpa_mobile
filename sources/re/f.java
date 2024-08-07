package re;

import android.content.Context;
import android.text.TextUtils;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.io.File;
import java.io.FileFilter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import ke.b;
import v.n1;
import xe.g;
import xe.i;

/* compiled from: SandboxFileLoader */
public final class f {

    /* compiled from: SandboxFileLoader */
    public class a implements FileFilter {
        public final boolean accept(File file) {
            return !file.isDirectory();
        }
    }

    public static ArrayList<LocalMedia> a(Context context, String str) {
        MessageDigest messageDigest;
        int i10;
        MessageDigest messageDigest2;
        int i11;
        ArrayList<LocalMedia> arrayList;
        long j10;
        long j11;
        long j12;
        long j13;
        int i12;
        int i13;
        Context context2 = context;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<LocalMedia> arrayList2 = new ArrayList<>();
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles(new a());
            if (listFiles == null) {
                return arrayList2;
            }
            ke.a b10 = b.a().b();
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e10) {
                e10.printStackTrace();
                messageDigest = null;
            }
            int length = listFiles.length;
            int i14 = 0;
            while (i14 < length) {
                File file2 = listFiles[i14];
                String e11 = g.e(file2.getAbsolutePath());
                int i15 = b10.f12517a;
                if (i15 != 1 ? i15 != 2 ? i15 != 3 || j7.a.U(e11) : j7.a.Z(e11) : j7.a.Y(e11)) {
                    ArrayList arrayList3 = b10.f12540w;
                    if ((arrayList3 == null || arrayList3.size() <= 0 || b10.f12540w.contains(e11)) && !j7.a.W(e11)) {
                        String absolutePath = file2.getAbsolutePath();
                        long length2 = file2.length();
                        if (length2 > 0) {
                            if (messageDigest != null) {
                                messageDigest.update(absolutePath.getBytes());
                                j10 = new BigInteger(1, messageDigest.digest()).longValue();
                            } else {
                                j10 = file2.lastModified() / 1000;
                            }
                            int i16 = length;
                            int i17 = i14;
                            long j14 = j10;
                            i10 = i16;
                            ArrayList<LocalMedia> arrayList4 = arrayList2;
                            long C0 = j7.a.C0(Integer.valueOf(file.getName().hashCode()));
                            long lastModified = file2.lastModified() / 1000;
                            if (j7.a.Z(e11)) {
                                oe.b g2 = g.g(context2, absolutePath);
                                messageDigest2 = messageDigest;
                                int i18 = g2.f13867a;
                                j12 = lastModified;
                                j11 = length2;
                                i12 = g2.f13868b;
                                i11 = i17;
                                i13 = i18;
                                j13 = g2.f13869c;
                            } else {
                                messageDigest2 = messageDigest;
                                j12 = lastModified;
                                if (j7.a.U(e11)) {
                                    oe.b c10 = g.c(context2, absolutePath);
                                    int i19 = c10.f13867a;
                                    int i20 = c10.f13868b;
                                    long j15 = c10.f13869c;
                                    j11 = length2;
                                    i13 = i19;
                                    i11 = i17;
                                    j13 = j15;
                                    i12 = i20;
                                } else {
                                    oe.b d10 = g.d(context2, absolutePath);
                                    i11 = i17;
                                    j11 = length2;
                                    j13 = 0;
                                    int i21 = d10.f13867a;
                                    i12 = d10.f13868b;
                                    i13 = i21;
                                }
                            }
                            if ((j7.a.Z(e11) || j7.a.U(e11)) && j13 == 0) {
                                arrayList = arrayList4;
                                i14 = i11 + 1;
                                length = i10;
                                arrayList2 = arrayList;
                                messageDigest = messageDigest2;
                            } else {
                                LocalMedia localMedia = new LocalMedia();
                                localMedia.f8072a = j14;
                                localMedia.f8073b = absolutePath;
                                localMedia.f8074c = absolutePath;
                                localMedia.I = file2.getName();
                                localMedia.J = file.getName();
                                localMedia.f8081q = j13;
                                localMedia.f8087w = b10.f12517a;
                                localMedia.f8086v = e11;
                                localMedia.f8090z = i13;
                                localMedia.A = i12;
                                localMedia.G = j11;
                                localMedia.K = C0;
                                localMedia.L = j12;
                                if (!i.a()) {
                                    absolutePath = null;
                                }
                                localMedia.f8080p = absolutePath;
                                arrayList = arrayList4;
                                arrayList.add(localMedia);
                                i14 = i11 + 1;
                                length = i10;
                                arrayList2 = arrayList;
                                messageDigest = messageDigest2;
                            }
                        }
                    }
                }
                messageDigest2 = messageDigest;
                arrayList = arrayList2;
                i10 = length;
                i11 = i14;
                i14 = i11 + 1;
                length = i10;
                arrayList2 = arrayList;
                messageDigest = messageDigest2;
            }
        }
        return arrayList2;
    }

    public static LocalMediaFolder b(Context context, String str) {
        ArrayList<LocalMedia> a10 = a(context, str);
        if (a10 == null || a10.size() <= 0) {
            return null;
        }
        Collections.sort(a10, new n1(2));
        LocalMedia localMedia = a10.get(0);
        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
        localMediaFolder.f8092b = localMedia.J;
        localMediaFolder.f8093c = localMedia.f8073b;
        localMediaFolder.f8094d = localMedia.f8086v;
        localMediaFolder.f8091a = localMedia.K;
        localMediaFolder.f8095e = a10.size();
        localMediaFolder.f8097n = a10;
        return localMediaFolder;
    }
}
