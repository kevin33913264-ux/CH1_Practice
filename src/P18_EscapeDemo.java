public class P18_EscapeDemo {
    public static void main(String[] args) {
        System.out.println("顯示換行\\n效果：\n下一行");
        System.out.println("顯示Tab\\t效果：\tA\tB\tC");
        System.out.println("顯示雙引號：\"Java\"");
        System.out.println("顯示反斜線：\\");
        
        char oct = '\101';   // 八進位 101 = 65 = 'A'
        char hex = '\u0061'; // Unicode 0061 = 'a'
        System.out.println("八進位\\101 -> " + oct);
        System.out.println("十六進位\\u0061 -> " + hex);
    }
}
