package com.chency.datastructure.tree;

import com.chency.datastructure.tree.printer.BinaryTrees;
import org.junit.Test;

/**
 * @author chency
 * @email chaytech@163.com
 * @date 2022/03/01
 */
public class BinarySearchTreeTest {

    @Test
    public void test1() {
        Integer[] array = new Integer[]{7, 4, 9, 2, 5, 8, 11, 3, 12, 1};

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.add(array[i]);
        }

        BinaryTrees.print(binarySearchTree, BinaryTrees.PrintStyle.LEVEL_ORDER);

        System.out.println();
        binarySearchTree.preOrderTraversal().forEach(System.out::print);
    }

}
