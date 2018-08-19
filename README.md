# 《Head First 设计模式》-----温故而知新
好的OO设计必须具备可复用，可扩充，可维护三个特性。

## 包结构说明
## 1 com.pattern.strategy包--策略模式
### 策略模式
定义了算法簇，分别封装起来，让他们之间可以互相替换，让算法簇的变化独立于使用算法的客户。
#### 设计原则1
找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起。
#### 设计原则2
针对接口编程，而不是针对实现编程。
#### 设计原则3
多用组合，少用继承。

## 2 com.pattern.observer.one包--自己实现的观察者模式
### 观察者模式
定义了对象之间的一对多依赖，这样，当一个对象改变状态时，它的所有依赖者都会收到通知。

## 3 com.pattern.observer.java包--Java观察者模式
   被观察者继承Observable类，数据改变要通知观察者时，需先将Observable类中的标志位设为true调用setChanged()，
再调用notifyObservers()或者notifyObservers(Object arg)方法，用一个共同的接口update来更新观察者
   观察者implements接口Observer，观察者构造器中Observable作为参数，以此登记为观察者，
并实现Observer接口的update(Observable o, Object arg)方法，完成业务操作

## 4 com.pattern.decorator--装饰者模式
动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更加有弹性的替代方案。
![Image text](https://github.com/tangquanbin/learn-design-patterns/blob/master/img/zs.png)
#### 设计原则4
对拓展开放，对修改关闭
java IO中如InputStream就是一个抽象主键，FileInputStream是一个具体组件,FilterInputStream就是一个装饰者，
BufferedInputStream就是继承于FilterInputStream的具体装饰者。