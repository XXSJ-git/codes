package com.haha.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {

    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    public static final String salt="1d8s9d89s8";

    public static String inputPassToFromPass(String inputPass){
        String str = salt.charAt(0)+salt.charAt(2)+inputPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    public static String formPassToDBPass(String formPass,String salt){
        String str = salt.charAt(0)+salt.charAt(2)+formPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    public static String inputPassToDBPass(String inputPass,String salt){
        String fromPass = inputPassToFromPass(inputPass);
        String dbPass = formPassToDBPass(fromPass, salt);
        return dbPass;
    }

    public static void main(String[] args) {
        System.out.println(inputPassToFromPass("17671735420"));
        System.out.println(formPassToDBPass("2a6e0d481fbb62a54358940c36ed74f2",salt));
        System.out.println(inputPassToDBPass("123456",salt));
    }
}
