import java.util.Arrays;
import java.util.List;

public class Sort {
    /**
     * 冒泡排序，
     *
     * @param datas 输入的 int 数组排序
     * @return 输出排序好的数组
     */
    public static int[] bubbleSort(int... datas) {
        //交换的标志
        boolean isChange = false;
        do {
            isChange = false;
            for (int i = 0; i < datas.length; i++) {
                //如果前一个元素比后一个大，就交换
                if (datas.length > i + 1 && datas[i] > datas[i + 1]) {
                    int a = datas[i];
                    datas[i] = datas[i + 1];
                    datas[i + 1] = a;
                    isChange = true;
                }
            }
        } while (isChange);
        return datas;
    }

    /**
     * 选择排序
     *
     * @param datas 输入的 int 数组排序
     * @return 输出排序好的数组
     */
    public static int[] selectionSort(int... datas) {
        //遍历数组，实现选择排序
        for (int i = 0; i < datas.length - 1; i++) {
            //先记录第一个数的数值
            int a = datas[i];
            int position = 0;
            for (int j = i; j < datas.length; j++) {
                //在后面的数值中找到比较小的那个
                if (a > datas[j]) {
                    a = datas[j];
                    position = j;
                }
            }
            //交换
            if (position > 0) {
                int data = datas[i];
                datas[i] = datas[position];
                datas[position] = data;
            }
        }
        return datas;
    }

    /**
     * 插入排序
     *
     * @param datas
     * @return
     */
    public static int[] insertionSort(int... datas) {
        for (int i = 0; i < datas.length; i++) {
            int a = datas[i];
            datas = delete(datas, i);
            int position = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (a > datas[j]) {
                    position = j + 1;
                    break;
                }
            }
            datas = insert(datas, position, a);
        }
        return datas;
    }

//    public static int[] mergingSorting(int... datas) {
//
//    }

    /**
     * 数组中，插入一个值
     *
     * @param datas 数组
     * @param index 下标
     * @param value 值
     * @return
     */
    public static int[] insert(int[] datas, int index, int value) {
        int[] newArray = new int[datas.length + 1];
        System.arraycopy(datas, 0, newArray, 0, datas.length);
        System.arraycopy(newArray, index, newArray, index + 1, newArray.length - 1 - index);
        newArray[index] = value;
        datas = newArray;
        return datas;
    }

    /**
     * 数组中删除一个数值
     *
     * @param array 数组
     * @param index 下标
     * @return
     */
    public static int[] delete(int array[], int index) {
        //数组的删除其实就是覆盖前一位
        int[] arrNew = new int[array.length - 1];
        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        System.arraycopy(array, 0, arrNew, 0, arrNew.length);
        return arrNew;
    }


    public static void main(String[] args) {
        int[] data = {9, 12, 32, 1, 3, 5, 13, 4, 31, 31, 23, 123, 21, 41};

        // int[] newData = bubbleSort(data);
//        int[] newData = selectionSort(data);
        int[] newData = insertionSort(data);
        for (int b : newData) {
            System.out.println(b);
        }
    }
}
