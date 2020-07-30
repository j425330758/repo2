package DataType;
//类型转换

public class Demo01 {
    public static void main(String[] args) {
        byte b1=2,b2=3,b;
//        b = b1 + b2; //变量参与表达式运算会自动转成int型
        b = 2 + 125;  //根据数字值自动赋予不同数据类型
//        b = 2 + 128;
        char c = 'a';
        c = 'a' + 'b'; //Ã
//        c = c + 'b';  //变量参与表达式运算会自动转成int型
        c += 'b';  //+=可以强制转换
        System.out.println(c);
    }
}
