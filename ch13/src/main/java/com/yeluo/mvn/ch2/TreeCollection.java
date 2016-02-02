package com.yeluo.mvn.ch2;
/**
 * 
 * @author YeLuo
 * @function 树集
 * 
 */
/**
 * 1.树集与散列集十分相似,不过,它比散列集有所改进.树集是一个有序集合.
 * 可以按照任意顺序将元素插入集合中.在对集合遍历时,每个值将自动地按照排序后的顺序呈现.
 * 
 * 2.排序是用树结构完成的(当前实现使用的是红黑树).每次将一个元素添加到树中时,都被放置在正确的排序位置上.
 * 因此,迭代器总是以排好序的顺序访问每个元素.
 * 
 * 3.将一个元素添加到树中要比添加到散列表中慢,但是,与将元素添加到数组或链表的正确位置上相比要快很多的.
 * 如果树中包含n个元素,查找新元素的正确位置平均需要log2 n次比较.
 * 
 * 4.要插入的元素对象,就必须通过实现Comparable接口自定义排列顺序.在Object类中,没有提供任何Comparable接口的默认实现.
 * 然而,使用Comparable接口定义的排列排序显然有其局限性.
 * 
 * 5.问题:如果需要对一个类的对象按照不同的条件进行排序,而且这个类的创建者又没有费心实现Comparable接口,该怎么办?
 * 解决:可以通过将Comparator对象传递给TreeSet构造器来告诉树集使用不同的比较方法.
 * 
 * 6.树的排序必须是全序的.也即是说,任意两个元素必须是可比的,并且只有在两个元素相等时结果才为0.
 */
public class TreeCollection {
	
}
