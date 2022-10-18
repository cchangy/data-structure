package com.chency.datastructure.tree;

import java.util.Comparator;

/**
 * 红黑树
 *
 * @author chency
 * @email chaytech@163.com
 * @date 2022/03/01
 */
public class RedBlackTree<E> extends BinarySearchTree<E> {

    public RedBlackTree() {
        this(null);
    }

    public RedBlackTree(Comparator<E> comparator) {
        super(comparator);
    }

}
