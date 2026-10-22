package com.cafe.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeApp {

    // 用 final 定义不变的常量：学号、店名、税率
    private static final long STUDENT_NO = 2026325011351L;
    private static final String SHOP_NAME = "CafeJava 咖啡店";
    private static final double TAX_RATE = 0.06;

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new CafeApp().start();
    }

    public void start() {
        printWelcome();
        // 菜单需要反复显示，直到输入 0 退出
        while (true) {
            printMenu();
            int choice = readChoice();
            if (choice == 0) {
                break;
            }
            handleChoice(choice);
        }
        System.out.println();
        System.out.println("感谢使用 " + SHOP_NAME + "，再见！");
        scanner.close();
    }

    private void printWelcome() {
        System.out.println("==================================================");
        System.out.println("      欢迎使用 " + SHOP_NAME + "（学号：" + STUDENT_NO + "）");
        System.out.println("==================================================");
        System.out.println();
    }

    private void printMenu() {
        System.out.println("------------------- 功能菜单 -------------------");
        System.out.println("  1. 查看咖啡菜单");
        System.out.println("  2. 点单（加入购物车）");
        System.out.println("  3. 查看我的美式咖啡");
        System.out.println("  4. 结账（生成订单）");
        System.out.println("  5. 制作咖啡（模拟冲泡流程）");
        System.out.println("  6. 库存管理（查看/补货）");
        System.out.println("  7. 会员注册与折扣");
        System.out.println("  8. 销售统计报表");
        System.out.println("  9. 多线程订单处理");
        System.out.println("  0. 退出系统");
        System.out.println("------------------------------------------------");
    }

    private int readChoice() {
        System.out.print("请输入功能编号（0-9）：");
        try {
            int choice = scanner.nextInt();
            scanner.nextLine(); // 吃掉数字后面的换行符
            return choice;
        } catch (InputMismatchException e) {
            scanner.nextLine(); // 把非法输入读掉，防止死循环
            System.out.println(">> 输入无效，请输入 0-9 之间的数字。");
            System.out.println();
            return -1;
        }
    }

    private void handleChoice(int choice) {
        System.out.println();
        switch (choice) {
            case 1:
                printCoffeeMenu();
                break;
            case 2:
                System.out.println(">> 点单：购物车功能将在后续任务实现。");
                break;
            case 3:
                System.out.println(">> 查看我的美式咖啡：功能将在后续任务实现。");
                break;
            case 4:
                System.out.println(">> 结账：生成订单功能将在后续任务实现。");
                break;
            case 5:
                System.out.println(">> 制作咖啡：冲泡流程将在后续任务实现。");
                break;
            case 6:
                System.out.println(">> 库存管理：将在后续任务实现。");
                break;
            case 7:
                System.out.println(">> 会员注册与折扣：将在后续任务实现。");
                break;
            case 8:
                System.out.println(">> 销售统计报表：将在后续任务实现。");
                break;
            case 9:
                System.out.println(">> 多线程订单处理：将在后续任务实现。");
                break;
            default:
                System.out.println(">> 无效的功能编号，请输入 0-9 之间的数字。");
                break;
        }
        System.out.println();
    }

    /** 任务1：声明饮品变量，输出饮品信息和菜单表 */
    private void printCoffeeMenu() {
        // 菜单变量：名称用 String，价格用 double，是否可售用 boolean
        String name1 = "美式咖啡";
        double price1 = 12.5;
        boolean onSale1 = true;

        String name2 = "经典拿铁";
        double price2 = 18.0;
        boolean onSale2 = true;

        String name3 = "卡布奇诺";
        double price3 = 20.0;
        boolean onSale3 = false;

        String name4 = "奶龙拿铁";
        double price4 = 22.5;
        boolean onSale4 = true;

        // 用 + 拼接字符串与变量，输出每款饮品的信息
        System.out.println(">> " + name1 + "：单价 " + price1 + " 元，是否可售：" + onSale1);
        System.out.println(">> " + name2 + "：单价 " + price2 + " 元，是否可售：" + onSale2);
        System.out.println(">> " + name3 + "：单价 " + price3 + " 元，是否可售：" + onSale3);
        System.out.println(">> " + name4 + "：单价 " + price4 + " 元，是否可售：" + onSale4);
        System.out.println();

        // 用 System.out.printf 输出对齐的菜单表
        System.out.printf("========== %s 菜单（学号后四位：%d）==========%n", SHOP_NAME, STUDENT_NO % 10000);
        System.out.printf("%-12s%6s  %s%n", "饮品名称", "价格", "状态");
        System.out.printf("%-12s%8.2f  %s%n", name1, price1, onSale1 ? "在售" : "售罄");
        System.out.printf("%-12s%8.2f  %s%n", name2, price2, onSale2 ? "在售" : "售罄");
        System.out.printf("%-12s%8.2f  %s%n", name3, price3, onSale3 ? "在售" : "售罄");
        System.out.printf("%-12s%8.2f  %s%n", name4, price4, onSale4 ? "在售" : "售罄");
        System.out.printf("（以上为不含税价格，当前税率：%.2f）%n", TAX_RATE);
        System.out.println();

        // 运算符小测试：整数除法和小数除法
        System.out.println("小测试：5 / 2 = " + (5 / 2));
        System.out.println("小测试：5.0 / 2 = " + (5.0 / 2));
    }
}
