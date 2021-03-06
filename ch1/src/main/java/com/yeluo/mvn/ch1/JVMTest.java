package com.yeluo.mvn.ch1;
/**
 * 
 * @author YeLuo
 *
 */
/* 1-1 JVM是Java的核心和基础，是Java编译器和操作系统（OS）平台之间的虚拟处理器，用软件模拟的虚拟计算机。
 * 1-2 Java编译器只有面向JVM，生成JVM能理解的代码或字节码文件。
 * 1-3 Java源文件编译成字节码文件，通过JVM将每一条指令翻译成不同平台的机器码，通过特定平台运行。
 * 1-4 在我看来该过程中最重要的两部分是：
 * 	      1.Java代码编译和执行的整个过程
 * 		  2.JVM内存管理和垃圾回收机制
 * 	其中第一部分的过程包含了三个重要的机制：1.Java源码编译机制    2.类加载机制   3.类执行机制
 *  而Java源码编译机制有三个过程组成：1.分析和输入到符号表   2.注解处理  3.语义分析和生成class文件
 *  JVM的类加载：通过ClassLoader及其子类来完成的
 *  类执行机制：JVM是基于栈的体系结构来执行class字节码的。线程创建后，都会产生程序计数器（PC）和栈（Stack），
 *    程序计数器存放下一条要执行的指令在方法内的偏移量，栈中存放一个个栈帧，每个栈帧对应着每个方法的每次调用，
 *    而栈帧又是由局部变量和操作数栈两部分组成，局部变量区用于存放方法中的局部变量和参数，操作数栈中用于存放方法执行过程中产生的中间结果。
 *  第二部分包含内存管理和垃圾回收机制
 *  JVM内存管理：JVM栈有堆、栈、本地方法栈、方法区等部分组成
 *  垃圾回收机制：JVM分别对新生代和旧生代采用不同的垃圾回收机制
 *  新生代：新建的对象都是哟领新生代分配内存 ，Eden空间不足时候，会把存活的对象转移到Survivor中，新生代大小可以有 -Xmn来控制，也可以用
 *  -XX:SurvivorRatio来控制Eden和Survivor的比例
 *  旧生代：用于存放新生代中经过多次垃圾回收仍然存活的对象。
 *  
 * 
 */
public class JVMTest {

}
