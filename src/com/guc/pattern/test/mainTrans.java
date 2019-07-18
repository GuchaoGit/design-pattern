package com.guc.pattern.test;

import com.guc.pattern.generics.ByteUtils;

import java.util.Arrays;

/**
 * @Author guc
 * @Date 2019/7/18 16:15
 * @Description 数据转换测试
 */
public class mainTrans {

    public static void main(String[] args) {

        System.out.println("Int正整型--------------------------");
        int ocb = 255;
        System.out.println("十进制数：\t" + ocb);
        System.out.println("十六进制数：\t0x" + Integer.toHexString(ocb));
        System.out.println("二进制数：\t" + Integer.toBinaryString(ocb));

        System.out.println("Int 负整型--------------------------");
        int ocb2 = -255;
        System.out.println("十进制数：\t" + ocb2);
        System.out.println("十六进制数：\t0x" + Integer.toHexString(ocb2));
        System.out.println("二进制数：\t" + Integer.toBinaryString(ocb2));

        System.out.println("Short 整型--------------------------");
        short ocb3 = -32768;
        System.out.println("十进制数：\t" + ocb3 +" size："+ Short.SIZE);
        System.out.println("十六进制数：\t0x"  +Integer.toHexString(ocb3));
        System.out.println("十六进制数：\t0x"  +ByteUtils.shortToHexString(ocb3));
        System.out.println("二进制数：\t" + Integer.toBinaryString(ocb3) );
        System.out.println("二进制数：\t" + ByteUtils.shortToBinaryString(ocb3) );

    }
}
