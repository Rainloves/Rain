package knowledge;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        // 配方卡（上节搬来，一行未改）
        int coffeeWeight = 18;          // 粉重（克）
        int waterVolume = 200;          // 水量（毫升）
        int waterTemperature = 92;      // 水温（摄氏度）
        int brewSeconds = 25;           // 时长（秒）
        String coffeeName = "美式";      // 品名

        double unitPrice = 12.5;        // 单价（元）

        // 点单：问客人要几杯
        Scanner sc = new Scanner(System.in);
        System.out.print("您好，请问要几杯？");
        int cups = sc.nextInt();

        // 算账
        double total = unitPrice * cups;

        // 库存扣减：一杯扣 18 克
        int stock = 500;
        stock -= coffeeWeight * cups;

        // 交代：打印小票
        System.out.println("===== cafeJava 小票 =====");
        System.out.println("品名：" + coffeeName);
        System.out.println("单价：" + unitPrice + " 元");
        System.out.println("杯数：" + cups);
        System.out.println("总价：" + total + " 元");
        System.out.println("豆子剩余：" + stock + " 克");
        System.out.println("========================");

        // 课后任务六：大杯小杯一起算
        double bigPrice = 15.0;     int bigCups = 2;
        double smallPrice = 12.5;   int smallCups = 3;
        double income = bigPrice * bigCups + smallPrice * smallCups;
        System.out.println("今日收入：" + income + " 元");
    }
}
