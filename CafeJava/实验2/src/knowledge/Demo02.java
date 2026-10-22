package knowledge;

public class Demo02 {

    public static void main(String[] args) {
        // 奶龙拿铁：把配方卡的五条数据写成五行变量
        int coffeeWeight = 18;            // 粉重（克）
        int waterVolume = 200;            // 水量（毫升）
        int waterTemperature = 92;        // 水温（摄氏度）
        int extractionDuration = 25;      // 时长（秒）
        String coffeeName = "奶龙拿铁";  // 品名

        System.out.println("===== cafeJava 配方卡 =====");
        System.out.println("品名：" + coffeeName);
        System.out.println("咖啡粉：" + coffeeWeight + " 克");
        System.out.println("水量：" + waterVolume + " 毫升");
        System.out.println("水温：" + waterTemperature + " 摄氏度");
        System.out.println("萃取：" + extractionDuration + " 秒");
        System.out.println("==========================");

        // 课后任务六：拿铁另建一套变量，再打印一张卡片
        int latteWeight = 20;
        int latteWater = 180;
        int latteTemperature = 88;
        int latteDuration = 30;
        String latteName = "拿铁";

        System.out.println();
        System.out.println("===== cafeJava 配方卡 =====");
        System.out.println("品名：" + latteName);
        System.out.println("咖啡粉：" + latteWeight + " 克");
        System.out.println("水量：" + latteWater + " 毫升");
        System.out.println("水温：" + latteTemperature + " 摄氏度");
        System.out.println("萃取：" + latteDuration + " 秒");
        System.out.println("==========================");

        // 任务五：给设一次就不动的值上锁
        final int MAX_TEMPERATURE = 100;    // 水温上限
        System.out.println();
        System.out.println("水温上限：" + MAX_TEMPERATURE + " 摄氏度");
    }
}
