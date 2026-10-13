// Data type
//
// 整數: byte, short, int, long
// 浮點數: float, double 
// 布林值: boolean (true or false)
// 字元: char ('')
// 字串: string ("")

public class DataType {
    public static void main(String[] args) {

        // 整數
        int int_value = 1;
        long long_value = 10000000000L; // 長整數 (加 L)
        System.out.println(int_value);
        System.out.println(long_value);

        // 浮點數
        float float_value = 3.14159265f; // 單精度浮點數 (最多小數點後第七位，加 f)
        double double_value = 3.14159265; // 雙精度浮點數
        System.out.println(float_value);
        System.out.println(double_value);

        // 布林
        boolean boolean_value = true;
        System.out.println(boolean_value);

        // 字元
        char char_value = 'A';
        System.out.println(char_value);

        // 字串
        String string_value = "Hello World";
        System.out.println(string_value);
    }
}
