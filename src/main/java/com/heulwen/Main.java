package com.heulwen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        int x = 2;
*        PassByValue pbv = new PassByValue();
*        pbv.changValue(x);
*        // Java truyền giá trị chứ không truyền tham chiếu
*        System.out.println(x);
*/

/*        System.out.println("=================================");
*         Day today = Day.MONDAY;
*         System.out.println(today.getDayName());
*/

/*        System.out.println("=================================");
*        Singleton singleInstance1 = Singleton.getInstance();
*        Singleton singleInstance2 = Singleton.getInstance();
*        System.out.println("Mã băm của trường hợp đơn lẻ 1: " + singleInstance1.hashCode()); // 1915318863
*        System.out.println("Mã băm của trường hợp đơn lẻ 2: " + singleInstance2.hashCode()); // 1915318863
*        // Dùng khi muốn đảm bảo class có duy nhất 1 thể hiện
*        // Không tự do tạo bằng new - chỉ tạo 1 lần duy nhất - cung cấp điểm truy cập toàn cục
*/

        /* static?
        * Thuộc về class
        * Không thuộc về object
        * Chỉ có 1 bản duy nhất trong chương trình
        */

//        System.out.println("=================================");
//        System.out.println("Số nguyên tĩnh: " + StaticBlockExample.getStaticInt());
//        System.out.println("Số thực tĩnh: " + StaticBlockExample.getStaticDouble());
//        System.out.println("Chuỗi tĩnh: " + StaticBlockExample.getStaticString());

        System.out.println("=================================");
        String s = new String("Fluffy");
        String t = s.intern();

        System.out.println(t.equals(s));
        System.out.println("=================================");
        List<Integer> a = new ArrayList<>();
    }
}