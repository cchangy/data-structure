package com.chency.datastructure.array;

import com.chency.datastructure.List;
import com.chency.datastructure.util.Task;
import com.chency.datastructure.util.TimeTool;
import org.junit.Test;

/**
 * @author chency
 * @email chaytech@163.com
 * @date 2022/02/16
 */
public class ArrayListTest {

    @Test
    public void testArrayList(){
        TimeTool.run("测试程序", new Task() {
            @Override
            public void execute() {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < 15; i++) {
                    list.add(i+1);
                }
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(1,4);
            }
        });
    }
}
