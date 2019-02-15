package doctors.spring.hello.hellospring.comm;

import org.springframework.stereotype.Component;

/**
 * @author chenjunlin
 * @date 2019-02-13
 */
@Component
public class Const {
    public static final String LOGO_FILE_NAME = "codesheep_logo.png";  // 水印图片文件名
    public static final int X = 10;    // 水印添加位置 X轴
    public static final int Y = 10;    // 水印添加位置 Y轴
    public static final float ALPHA = 0.3F; // 水印透明度
    public static final int X_INTERVAL = 100;  // 水印之间的间隔
    public static final int Y_INTERVAL = 150;
}
