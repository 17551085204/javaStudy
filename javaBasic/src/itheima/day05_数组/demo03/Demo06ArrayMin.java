package itheima.day05_数组.demo03;

public class Demo06ArrayMin {

    public static void main(String[] args) {
        int[] array = { 5, 15, 30, 20, 10000, -20, 30, 35 };
        int min = getMin(array);
        System.out.println("最小值：" + min);
    }

    public static int getMin(int [] array){
        int min = array[0]; // 比武擂台
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素，比max更大，则换人
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }


}
