package com.yeluo.mvn.ch1;
/**
 * 
 * @author YeLuo
 * @function Algorithm
 */
/**
 * 1.迭代集合元素的算法
 * 
 * 2.求集合最大值、最小值的算法
 * 
 * 3.排序和混排（shuffle）的算法
 * 注释：集合类库中使用的归并排序算法比快速排序要慢一些，快速排序是通用排序算法的传统选择。
 * 但是，归并排序有一个主要的优点：稳定，即不需要交换相同的元素。
 * 在集合中，什么样的列表能传递给排序算法？
 * 		1.列表必须是可修改的（如果列表支持set方法，则是可修改的）
 * 		2.不必是可以改变大小的（如果列表支持add和remove方法，则是可改变大小的）
 * 
 * 4.二分查找（前提是有序的集合）
 * 注释：只有采用随机访问，二分查找才有意义。如果二分算法提供一个链表，它将自动地变为线性查找。
 * 因此，现在binarySearch方法检查列表参数是否实现了RandomAccess接口。
 * 如果实现了这个接口，这个方法将采用二分查找，否则，将采用线性查找。
 * 
 * 5.其他的算法
 * 		1.将一个列表中的元素复制到另一个列表中
 * 		2.用一个常量值填充容器
 * 		3.逆置一个列表的顺序
 * 
 */
public class Algorithm {

}
