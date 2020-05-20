import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class ImageUtil {
    /**
     * 将base64位字符串转换成图片
     * @user chaofei
     * @param baseStr        base64图片字符串
     * @param imgFilePath    要保存到图片地址
     * @return boolean
     */
    public static boolean baseStrToImg(String baseStr, String imgFilePath) {
        if (null == baseStr || "".equals(baseStr)) {// 图像数据为空
            System.out.println("Image base64Str is empty!");
            return false;
        }
        try {
            // Base64解码
            byte[] bytes = Base64.getDecoder().decode(baseStr);
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {// 调整异常数据
                    bytes[i] += 256;
                }
            }
            // 生成jpeg图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(bytes);
            out.flush();
            out.close();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    /**
     * 将图片转换成base64位字符串
     * @user chaofei
     * @param imgFilePath 图片路径
     * @return String
     */
    public static String imgToBaseStr(String imgFilePath) {
        InputStream in = null;
        byte[] data = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(imgFilePath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        return Base64.getEncoder().encodeToString(data); // 返回Base64编码过的字节数组字符串
    }

    public static void usage() {
        System.out.println("Usage: java ImageUtil -b imagePath -- ImageToBase64Str base64 str");
        System.out.println("Usage: java ImageUtil -i ImageBase64StrFile -- Base64StrToImage");
    }

    public static void main(String[] args) {
        System.out.println(String.format("===>>>Begin main argsLength:%s args:%s", args.length, args.toString()));
        if (args.length < 2) {
            usage();
            return;
        }
        String execFlag = args[0];
        String filePathStr = args[1];
        if ("-b".equalsIgnoreCase(execFlag)) {
            String base64Str = imgToBaseStr(filePathStr);
            String dateStr = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            File file = new File(filePathStr+ "-" + dateStr + "-base64.txt");
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                osw.write(base64Str);
                osw.flush();
                osw.close();
                System.out.println(String.format("===>>>End image to base64Str file is :%s", file.getAbsoluteFile()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if ("-i".equalsIgnoreCase(execFlag)) {
            try {
                File base64Strfile = new File(filePathStr);
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(base64Strfile), "UTF-8"));
                String base64Str = br.readLine();
                String imageFile = filePathStr.replace("-base64.txt", ".png");
                baseStrToImg(base64Str, imageFile);
                br.close();
                System.out.println(String.format("===>>>End base64Str to image file is :%s", new File(imageFile).getAbsoluteFile()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            usage();
        }
    }
}
