package com.yeluo.mvn.ch1;
/**
 * 
 * @author YeLuo
 * @function
 */
/*
 * 1.类、子类和超类
 * 		1.子类比超类拥有的功能更加丰富。
 * 		2.在通过扩展超类定义子类的时候，仅需要指出子类与超类的不同之处。
 * 在设计类的时候，应该将通用的方法放在超类中，而将具有特殊用途的方法放在子类中。
 * 有时候超类的通用方法对子类不一定适用，可通过重写来覆盖原父类方法。
 * 		3.在子类中如果要调用父类的对象方法（不通过父类对象调用），可以通过特殊关键字super
 * 
 * 2.this的用途：
 * 		1.引用隐式参数                2.调用该类其他的构造器。
 * 	 super的用途：
 * 		1.调用超类的方法           3.调用超类的构造器。
 * 注意：
 * 		1.super不是一个对象的引用，不能将super赋给另一个对象变量，它只是一个指示编译器调用超类方法的特殊关键字。
 * 从本质上讲，this是一个指向本对象的指针, 然而super是一个Java关键字。
 * 		2.在调用构造器的时候，这两个关键字的使用方式很相似。调用构造器的语句只能作为另一个构造器的第一条语句。
 * 也就是说在子类的构造器中不能同时使用super和this这两个关键字。
 * 		3.this()和super()都指的是对象，所以，均不可以在static环境中使用。
 * 包括：static变量,static方法，static语句块。
 * 
 * 3.继承的好处：
 * 		（1）继承关系是传递的。若类C继承类B，类B继承类A，则类C既有从类B那里继承下来的属性与方法，
 * 也有从类A那里继承下来的属性与方法，还可以有自己新定义的属性和方法。继承来的属性和方法尽管是隐式的，
 * 但仍是类C的属性和方法。继承是在一些比较一般的类的基础上构造、建立和扩充新类的最有效的手段。
 *　　        （2）继承简化了人们对事物的认识和描述，能清晰体现相关类间的层次结构关系。 　　
 *		（3）继承提供了软件复用功能。若类B继承类A，那么建立类B时只需要再描述与基类(类A)不同的少量特征(数据成员和成员方法)即可。
 *这种做法能减小代码和数据的冗余度，大大增加程序的重用性。 　　
 *		（4）继承通过增强一致性来减少模块间的接口和界面，大大增加了程序的易维护性。 　　
 *		（5）提供多重继承机制。从理论上说，一个类可以是多个一般类的特殊类，它可以从多个一般类中继承属性与方法，
 *这便是多重继承。Java出于安全性和可靠性的考虑，仅支持单重继承，而通过使用接口机制来实现多重继承。
 *
 *4.java 中的继承的 优点和缺点如下：
		优点：1.可以使用父类的所有非私有方法；而且单继承可由接口来弥补。
			 2.可以继承父类中定义的成员方法以及成员变量，使得子类可以减少代码的书写。还可以重写父类的方法以增加子类的功能。
		缺点：1.耦合性太大
			 2.就是破坏了类的封装性，其实继承一般多用于抽象方法的继承和接口的实现
 *
 *5.多态：一个对象变量可以指示多种实际类型的现象被称为多态。
 *	动态绑定：在运行时能够自动地选择调用哪个方法的现象称为动态绑定。
 *	继承层次：有一个公共超类派生出来的所有类的集合被称为继承层次。
 *  继承链：在继承层次中，从某个特定的类到其祖先的路径被称为该类的继承链。
 *  
 *6.有一个用来判断是否应该设计为继承关系的简单规则，这就是“is-a”规则，它表明子类的每个对象也是超类的对象。
 *“is-a”规则的另一种表述法是置换法则。
 *注意：不能将一个超类的引用赋给子类变量。但是可以通过强转通过运行时的检查。
 *
 *7.动态绑定的调用对象的执行过程
 *		1.编译器查看对象的声明类型和方法名。编译器会一一列举所有该类型的指定方法和其超类中访问属性为public且指定方法名的方法。
 *至此，编译器已获得所有可能被调用的候选方法。
 *		2.接下来，编译器将查看调用方法时提供的参数类型。该过程称为重载解析。
 *至此，编译器已获得需要调用的方法名字和参数类型。
 *		3.虚拟机调用方法。
 *由于每次调用方法都要进行搜索，时间开销相当大。因此，JVM预先为每个类创建一个方法表，其中列出了所有方法的签名和实际调用的方法。
 *
 *8.静态绑定：
 *如果是private方法、static方法、final方法或者构造器，
 *那么编译器将可以准确地知道应该调用那个方法，我们将这种调用称为静态绑定。
 *
 *9.阻止继承：final类和方法
 *	将方法或类声明为final主要的目的：确保它们不会在子类中改变语义。
 *
 *10.内联：如果一个方法没有覆盖并且很短，编译器就能够对它进行优化处理，这个过程被称为内联。
 *
 *11.强制类型转换：讲一个类型强制转换成另外一个类型的过程被称为类型转换。
 *注意：1.只能在继承层次内进行类型转换
 *	   2.在将超类转换成子类前，应该使用instanceof进行检查。
 *实际上，通过类型转换调整对象的类型并不是一种好的做法。
 *
 *12.抽象类   abstract
 *		1.抽象类可以没有抽象方法
 *		2.有抽象方法的类必须是抽象类
 *		3.抽象方法没有构造器，不能被实例化。
 *但是可以定义一个抽象类的对象变量，只能引用非抽象子类的对象。
 *建议：尽量将通用的域和方法（不管是否是抽象的）放在超类（不管是否是抽象类）中。
 *扩展抽象类：1.子类还是抽象类    2.子类实现了全部抽象方法。
 *		
 *13.访问修饰符
 *		1.public——对所有的类可见
 *		2.protected——对本包和所有的子类可见
 *		3.默认（不需要修饰符）——对本包可见
 *		4.private——仅对本类可见
 *注意：谨慎使用protected属性，这样违背了OOP提倡的数据封装原则。
 *
 */
public class InheritanceTest {
	public static void main(String[] args) {
		fatherAndSonTest();
	}

	/*
	 * 可以将子类对象赋给父类变量
	 * 不能将一个超类的引用赋给子类变量。
	 */
	private static void fatherAndSonTest() {
		Father father=new Father();
		//Son son=father;   //error   Type mismatch: cannot convert from Father to Son
		Son son=new Son();
		Father father1=son;
		
		//
		Son[] sons=new Son[10];
		Father[] fathers=sons;
		fathers[0]=new Father();  //这是错误的，但是编译器竟然没有报错。
		/*
		 * 这是一种很忌讳发生的情形，当调用sons[0].toFatherString()方法的时候，
		 * 将会导致调用一个不存在的实例域，进而搅乱相邻存储空间的内容。
		 */
		/*
		 * 运行后会报：ArrayStoreException异常
		 *  Exception in thread "main" java.lang.ArrayStoreException: com.yeluo.mvn.ch1.Father
			at com.yeluo.mvn.ch1.InheritanceTest.fatherAndSonTest(InheritanceTest.java:71)
			at com.yeluo.mvn.ch1.InheritanceTest.main(InheritanceTest.java:55)
		 */
		
		
	}
}
