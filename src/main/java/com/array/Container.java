package com.array;

import com.google.gson.Gson;

import java.util.Arrays;

/**
 * 数组与容器
 *
 * 数组是第一级对象
 *  - 所以初始化时可以隐式创建（new可选）
 *  - length 是唯一一个可访问的字段或方法
 *  -  "[]"  语法是访问数组对象的唯一方式
 *
 * length额外说明
 *  - length只表示数组*能够容纳多少元素*。也就是说，length是数组的大小，而不是实际保存的元素个数。
 * 新生成一个数组对象时，其中所有的引用被自动初始化为null；所以检查其中的引用是否为null，即可知道
 * 数组的某个位置是否存在对象。
 *  - 同样，基本类型的数组如果是数值型（int）的，就被自动初始化为0；
 *  - 如果是字符型（char）的，就被自动初始化为(char)0；
 *  - 如果是布尔型（boolean）的，就被自动初始化为false
 * **/
public class Container {
    public static void main(String[] args) {
        Collection[] collections = new Collection[10];
        /* Arrays.toString 一维数组 */
        System.out.println(Arrays.toString(collections)); // [null, null, ... , null]
        System.out.println(collections[0]); // null

        for(int i = 0; i< 10; i ++){
            if(collections[i] == null)
                collections[i] = new Collection();
        }

        collections[0].str = "str";
        collections[1].anInt = 1;

        // 动态聚集初始化
        // collections[2].points = new float[][]{new float[]{1},{2}};
        float[][] point = {{1,2,3},{}};
        collections[2].points = point;

        /* Arrays.deepToString 多维数组 */
        System.out.println(Arrays.deepToString(collections[2].points));

        // 对于以下三种数据类型没必要动态聚集初始化
        char[] c = new char[1];
        int[] i = new int[1];
        boolean[] b = new boolean[1];
        System.out.println(c[0]); // 0
        System.out.println(i[0]); // 0
        System.out.println(b[0]); // false

        int[][] ii = new int[3][2];
        System.out.println("多维数组："+Arrays.deepToString(ii));

    }
}

class Collection {
    String str;
    int anInt;
    float[][] points;
}

class GsonDemo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String str = "{\"str\":\"It is a string\",\"anInt\":1,\"points\":[[1,2],[2,3]]}";

        System.out.println(gson.fromJson(str,Collection.class).str);
        System.out.println(gson.fromJson(str,Collection.class).anInt);
        System.out.println(gson.fromJson(str,Collection.class).points[0][0]);
    }
}
