package common.tool;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

/**
 * Created by CF on 2016/5/25.
 */
public class PasswordTool {

    /**
     * 随机生成密码盐
     * @return
     */
    public static String getSale(){
        return UUID.randomUUID().toString();
    }

    /**
     * 密码+盐 再进行md5 加密
     * @param pwd
     * @param sale
     * @return
     */
    public static String getPwdEncode(String pwd,String sale){
        return DigestUtils.md5Hex(pwd+sale);
    }
}
