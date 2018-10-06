public class Main {

    public static void main(String[] args) {
//        String a="hello world";
//        Double b=1.11d;
//        System.out.println(a);
//        /**
//         * ceil天花板的意思，就是逢余进一
//         */
//        System.out.println(Math.ceil(-10.1)); // -10.0
//        System.out.println(Math.ceil(10.7)); // 11.0
//        System.out.println(Math.ceil(-0.7)); // -0.0
//        System.out.println(Math.ceil(0.0)); // 0.0
//        System.out.println(Math.ceil(-0.0)); // -0.0
//        System.out.println(Math.ceil(-1.7)); // -1.0
//
//        System.out.println("-------------------");
//
///**
// * floor地板的意思，就是逢余舍一
// */
//        System.out.println(Math.floor(-10.1)); // -11.0
//        System.out.println(Math.floor(10.7)); // 10.0
//        System.out.println(Math.floor(-0.7)); // -1.0
//        System.out.println(Math.floor(0.0)); // 0.0
//        System.out.println(Math.floor(-0.0)); // -0.0
//
//        System.out.println("-------------------");
//
///**
// * rint 四舍五入，返回double值 注意.5的时候会取偶数 异常的尴尬=。=
// */
//        System.out.println(Math.rint(10.1)); // 10.0
//        System.out.println(Math.rint(10.7)); // 11.0
//        System.out.println(Math.rint(11.5)); // 12.0
//        System.out.println(Math.rint(10.5)); // 10.0
//        System.out.println(Math.rint(10.51)); // 11.0
//        System.out.println(Math.rint(-10.5)); // -10.0
//        System.out.println(Math.rint(-11.5)); // -12.0
//        System.out.println(Math.rint(-10.51)); // -11.0
//        System.out.println(Math.rint(-10.6)); // -11.0
//        System.out.println(Math.rint(-10.2)); // -10.0
//
//        System.out.println("-------------------");
///**
// * round 四舍五入，float时返回int值，double时返回long值
// */
//        System.out.println(Math.round(10)); // 10
//        System.out.println(Math.round(10.1)); // 10
//        System.out.println(Math.round(10.7)); // 11
//        System.out.println(Math.round(10.5)); // 11
//        System.out.println(Math.round(10.51)); // 11
//        System.out.println(Math.round(-10.5)); // -10
//        System.out.println(Math.round(-10.51)); // -11
//        System.out.println(Math.round(-10.6)); // -11
//        System.out.println(Math.round(-10.2)); // -10


        /**
         * 测试枚举类型
         */
        //System.out.println(Code.TEST_CODE.code);

        //System.out.println(String.format("%,d",123123123));

        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);

        Integer i6 = 127;
        Integer i7 = 127;

        System.out.println(i6 == i7);
    }

    protected enum Code {
        TEST_CODE("num", 101);
        String name;
        int code;

        Code(String name, int code) {
            this.name = name;
            this.code = code;
        }
    }
}
