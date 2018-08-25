# 《Head First 设计模式》-----温故而知新
好的OO设计必须具备可复用，可扩充，可维护三个特性。

## 包结构说明
## 1、 com.pattern.strategy包--策略模式
### 策略模式
定义了算法簇，分别封装起来，让他们之间可以互相替换，让算法簇的变化独立于使用算法的客户。
#### 设计原则1
找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起。
#### 设计原则2
针对接口编程，而不是针对实现编程。
#### 设计原则3
多用组合，少用继承。

## 2、 com.pattern.observer.one包--自己实现的观察者模式
### 观察者模式
定义了对象之间的一对多依赖，这样，当一个对象改变状态时，它的所有依赖者都会收到通知。

## 3、 com.pattern.observer.java包--Java观察者模式
    被观察者继承Observable类，数据改变要通知观察者时，需先将Observable类中的标志位设为true调用setChanged()，
再调用notifyObservers()或者notifyObservers(Object arg)方法，用一个共同的接口update来更新观察者
    观察者implements接口Observer，观察者构造器中Observable作为参数，以此登记为观察者，
并实现Observer接口的update(Observable o, Object arg)方法，完成业务操作

## 4、 com.pattern.decorator--装饰者模式
动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更加有弹性的替代方案。
装饰者类反映出被装饰的组件类型，它们具有相同的类型（通过接口或者继承实现）
你可以用无数个装饰者包装一个组件，如：
```组件 instance = new Decorator1(new Decorator2(new Decorator3(new 组件())))```
下面是源码买咖啡的UML图
![Image text](https://github.com/tangquanbin/learn-design-patterns/blob/master/img/zs.png)
#### 设计原则4
对拓展开放，对修改关闭
java IO中如InputStream就是一个抽象主键，FileInputStream是一个具体组件,FilterInputStream就是一个装饰者，
BufferedInputStream就是继承于FilterInputStream的具体装饰者。

## 5、 com.pattern.factory --工厂模式
所有工厂模式都用来封装对象的创建。**工厂模式就是定义了一个创建对象的接口，但由子类决定要实例化的类是哪个。**
工厂模式让类把实例化推迟到子类。
工厂模式都有一个抽象创建者类，该类中有一个抽象的工厂方法，其子类都要实现这个工厂方法，以此生产各个工厂的具体产品。
抽象工厂模式：提供一个接口用于创建相关或依赖的家族，而不用明确指定具体类。
#### 设计原则5--依赖倒置原则
要依赖抽象，不要依赖具体类

工厂方法模式：
一个抽象产品类，可以派生出多个具体产品类。   
一个抽象工厂类，可以派生出多个具体工厂类。   
每个具体工厂类只能创建一个具体产品类的实例。
抽象工厂模式：
多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。   
一个抽象工厂类，可以派生出多个具体工厂类。   
每个具体工厂类可以创建多个具体产品类的实例。   
区别：
工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个。   
工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。
