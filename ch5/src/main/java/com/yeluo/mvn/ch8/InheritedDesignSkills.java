package com.yeluo.mvn.ch8;
/**
 * 
 * @author YeLuo
 * @function
 */
/*
 * 继承设计的技巧
 * 1.将公共操作和域放在超类
 * 
 * 2.不要使用受保护的域
 * 原因：1.子类集合是无限制的，任何一个人都能过由某个类派生一个子类，并编写代码以直接访问protected的实例域，从而破坏封装性。
 * 		2.在Java程序设计语言中，在同一个包中的所有类都可以访问protected域，而不管它是否为这个类的子类。
 * 
 * 3.使用继承实现“is-a”关系
 * 
 * 4.除非所有继承的方法都有意义，否则不要使用继承
 * 
 * 5.覆盖方法时，不要改变预期的行为
 * 	置换原则不仅应用于语法，而且也可以应用于行为，这似乎更加重要。在覆盖一个方法的时候，不应该毫无缘由地改变行为的内涵。
 * 
 * 6.使用多态，而非类型信息
 *	无论什么时候，对于下面的这种形式的代码
 *	if(x is of type1){
		action1(x);
	}else if(x is of type2){
		action2(x);
	}
	都应该考虑使用多态性。
	使用多态方法或接口编写的代码比使用对多种类型进行检测的代码更加易于维护和扩展。
 * 7.不要过多地使用反射
 * 	反射机制使得人们可以通过在运行时查看域和方法，让人们编写出更具有通用性的程序。
 * 这种功能对于编写系统程序来说极其实用，但是通常不适于编写应用程序。反射是很脆弱的，
 * 即编译器很难帮助人们发现程序中的错误，因此只有在运行时才发现错误并导致异常。
 */
public class InheritedDesignSkills {
	
}
