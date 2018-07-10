package file1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("基本类型: byte 二进制位数: " + Byte.SIZE);
        System.out.println("包装类： java.long.Byte");
        System.out.println("最小值： Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值： Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("基本类型： short 二进制位数： " + Short.SIZE);
        System.out.println("包装类: java.long.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();
        System.out.println("Hello World");
        char c1 = 'a';
        int i1 = c1;
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于" + i2);
        int a1 = 123;
        byte b = (byte)a1;
        System.out.println("int强制类型转换为byte后的值等于"+b);
        System.out.println("Hello world") ;
    }
}