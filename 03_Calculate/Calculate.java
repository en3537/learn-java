// Calculate
//
// 比較運算的結果為布林值 (boolean)
//
//【算術運算子】
// +   加
// -   減
// *   乘
// /   除
// %   取餘數
//
//【比較運算子】
// >   大於
// <   小於
// >=  大於等於
// <=  小於等於
//
//【相等運算子】
// ==  等於
// !=  不等於
//
//【單元運算子】
// ++ 遞增 1
// -- 遞減 1
//
//【邏輯運算子】
// && 且 (and，兩者皆為 true，結果為 true)
// || 或 (or，其中一個為 true，結果為 true)

public class Calculate {

    public static void main(String[] args) {

        // 比較大小
        boolean x = 5 > 2;
        System.out.println("5 > 2: " + x);

        boolean y = 5 <= 2;
        System.out.println("5 <= 2: " + y);

        // 比較相等
        boolean m = "Java" == "java";
        System.out.println("Java == java: " + m);

        boolean n = 2 != 1;
        System.out.println("2 != 1: " + n);

        // 遞增、遞減
        int z = 1;
        z++; // z+=1 z=2
        z--; // z-=1 z=1
        System.out.println("z = " + z); // 1

        // 且、或
        boolean and_value = true && true;
        System.out.println(and_value); // true

        boolean or_value = true || false;
        System.out.println(or_value); // true
    }
}