package main.session7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoTime {
    public static void main(String[] args){
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(1);
        System.out.println(ld2);
        LocalDate ld3 = ld1.plusYears(1);
        System.out.println(ld3);
        LocalDate ld4 = ld1.plusDays(30);
        System.out.println(ld4);
        LocalDate ld5 = ld1.minusYears(30);
        System.out.println(ld5);
        //hết hạn vào ngày 19/5/2026
        LocalDate ld6 = LocalDate.parse("2026-05-19");
        LocalDate ld7 = ld6.plusMonths(12);
        System.out.println(ld7);
        //hết hạn vào ngày 19/2/2026
        LocalDate ld8 = LocalDate.of(2026,2,19);

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDateTime ldt2 = ldt1.plusHours(1);
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.parse("2026-02-28T12:08:00");
        System.out.println(ldt3);
        LocalDateTime ldt4 = LocalDateTime.of(2026,2,13,13,30,15,19);

        System.out.println(ldt4.getDayOfYear());
        System.out.println(ldt4.getDayOfWeek());
        //Nhập ngày sinh, xem hôm đấy là thứ mấy?
        //Kiểm tra xem 9 tháng 10 ngày trước đó là thứ mấy
        LocalDate ld9 = LocalDate.parse("1990-09-25");
        LocalDate ld10 = LocalDate.of(1990,9,25);
        LocalDate ld11 = ld10.minusMonths(9).minusDays(10);
        System.out.println(ld10.getDayOfWeek());
        System.out.println(ld11.getDayOfWeek());

    }
}
