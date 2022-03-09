package com.liangzhicheng.common.utils;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void encrypt(){
        String username = "root";
        String password = "admin";
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        //密钥
        encryptor.setPassword("liangzhicheng@778899");
        //加密
        username = encryptor.encrypt(username);
        password = encryptor.encrypt(password);
        System.out.println("加密后账号：" + username);
        System.out.println("加密后密码：" + password);
    }

    public static void main(String[] args) {
        encrypt();
    }

}
