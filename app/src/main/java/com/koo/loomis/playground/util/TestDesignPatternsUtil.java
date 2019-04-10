package com.koo.loomis.playground.util;

import com.koo.loomis.playground.designpatterns.Builder;
import com.koo.loomis.playground.designpatterns.Memoto.Caretaker;
import com.koo.loomis.playground.designpatterns.Memoto.Game;
import com.koo.loomis.playground.designpatterns.Memoto.Memento;
import com.koo.loomis.playground.designpatterns.Prototype;
import com.koo.loomis.playground.designpatterns.Singleton;
import com.koo.loomis.playground.designpatterns.Uniform;
import com.koo.loomis.playground.designpatterns.adapter.Adapter;
import com.koo.loomis.playground.designpatterns.adapter.Electric;
import com.koo.loomis.playground.designpatterns.adapter.PhoneAdapter;
import com.koo.loomis.playground.designpatterns.appearance.GameSdk;
import com.koo.loomis.playground.designpatterns.bridge.Clothes;
import com.koo.loomis.playground.designpatterns.bridge.Coder;
import com.koo.loomis.playground.designpatterns.bridge.Person;
import com.koo.loomis.playground.designpatterns.bridge.Shirt;
import com.koo.loomis.playground.designpatterns.bridge.Student;
import com.koo.loomis.playground.designpatterns.chain.BeijingChainPostman;
import com.koo.loomis.playground.designpatterns.chain.ChainPostman;
import com.koo.loomis.playground.designpatterns.chain.GuangzhouChainPostman;
import com.koo.loomis.playground.designpatterns.chain.ShanghaiChainPostman;
import com.koo.loomis.playground.designpatterns.combination.SafeComponent;
import com.koo.loomis.playground.designpatterns.combination.SafeLeaf;
import com.koo.loomis.playground.designpatterns.combination.SafeNode;
import com.koo.loomis.playground.designpatterns.command.Command;
import com.koo.loomis.playground.designpatterns.command.Invoker;
import com.koo.loomis.playground.designpatterns.command.Receiver;
import com.koo.loomis.playground.designpatterns.command.ShutdownCommand;
import com.koo.loomis.playground.designpatterns.decorator.Bedroom;
import com.koo.loomis.playground.designpatterns.decorator.Kitchen;
import com.koo.loomis.playground.designpatterns.decorator.NewRoom;
import com.koo.loomis.playground.designpatterns.decorator.Room;
import com.koo.loomis.playground.designpatterns.decorator.RoomDecorator;
import com.koo.loomis.playground.designpatterns.factory.AbstractComputerFactory;
import com.koo.loomis.playground.designpatterns.factory.AsusComputerFactory;
import com.koo.loomis.playground.designpatterns.factory.Factory;
import com.koo.loomis.playground.designpatterns.factory.HpComputerFactory;
import com.koo.loomis.playground.designpatterns.factory.LenovoComputerFactory;
import com.koo.loomis.playground.designpatterns.interpreter.Calculator;
import com.koo.loomis.playground.designpatterns.iterator.Aggregate;
import com.koo.loomis.playground.designpatterns.iterator.DeliveryAggregate;
import com.koo.loomis.playground.designpatterns.iterator.Iterator;
import com.koo.loomis.playground.designpatterns.mediation.Landlord;
import com.koo.loomis.playground.designpatterns.mediation.Lianjia;
import com.koo.loomis.playground.designpatterns.mediation.Purchaser;
import com.koo.loomis.playground.designpatterns.observer.Boy;
import com.koo.loomis.playground.designpatterns.observer.Girl;
import com.koo.loomis.playground.designpatterns.observer.Observable;
import com.koo.loomis.playground.designpatterns.observer.Observer;
import com.koo.loomis.playground.designpatterns.observer.ObserverPostman;
import com.koo.loomis.playground.designpatterns.proxy.Domestic;
import com.koo.loomis.playground.designpatterns.proxy.Oversea;
import com.koo.loomis.playground.designpatterns.proxy.People;
import com.koo.loomis.playground.designpatterns.share.BikeFactory;
import com.koo.loomis.playground.designpatterns.share.IBike;
import com.koo.loomis.playground.designpatterns.state.StateContext;
import com.koo.loomis.playground.designpatterns.strategy.PriceCalculate;
import com.koo.loomis.playground.designpatterns.strategy.SubwayCalculate;
import com.koo.loomis.playground.designpatterns.template.PostA;
import com.koo.loomis.playground.designpatterns.template.PostB;
import com.koo.loomis.playground.designpatterns.template.TemplatePostman;
import com.koo.loomis.playground.designpatterns.visitor.Busy;
import com.koo.loomis.playground.designpatterns.visitor.Idler;
import com.koo.loomis.playground.designpatterns.visitor.Music;
import com.koo.loomis.playground.designpatterns.visitor.Video;
import com.koo.loomis.playground.designpatterns.visitor.Visitor;
import com.koo.loomis.playground.designpatterns.visitor.Websites;

import java.util.ArrayList;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.util
 * @ClassName: TestDesignPatternsUtil
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/8 11:59
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 11:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TestDesignPatternsUtil {

    public void test() {
        testAbstractFactory();
        testAdapter();
        testAppearance();
        testBridge();
        testChain();
        testBuilder();
        testCombination();
        testCommand();
        testDecorator();
        testInterpreter();
        testIterator();
        testMediation();
        testMemento();
        testObserver();
        testPrototype();
        testProxy();
        testShare();
        testSimpleFactory();
        testSingleton();
        testState();
        testStrategy();
        testTemplate();
        testVisitor();
    }

    /**
     * 抽象工厂模式
     */
    private void testAbstractFactory() {
        System.out.println("--------------------生产联想电脑-----------------------");
        AbstractComputerFactory lenovoComputerFactory = new LenovoComputerFactory();
        lenovoComputerFactory.createCPU()
                             .showCPU();
        lenovoComputerFactory.createMemory()
                             .showMemory();
        lenovoComputerFactory.createHD()
                             .showHD();

        System.out.println("--------------------生产华硕电脑-----------------------");
        AbstractComputerFactory asusComputerFactory = new AsusComputerFactory();
        asusComputerFactory.createCPU()
                           .showCPU();
        asusComputerFactory.createMemory()
                           .showMemory();
        asusComputerFactory.createHD()
                           .showHD();

        System.out.println("--------------------生产惠普电脑-----------------------");
        AbstractComputerFactory hpComputerFactory = new HpComputerFactory();
        hpComputerFactory.createCPU()
                         .showCPU();
        hpComputerFactory.createMemory()
                         .showMemory();
        hpComputerFactory.createHD()
                         .showHD();
    }

    /**
     * 简单工厂模式
     */
    private void testSimpleFactory() {
        Factory factory = new Factory();
        factory.getProduct(Factory.PRODUCT_NAME_A)
               .show();
        factory.getProduct(Factory.PRODUCT_NAME_B)
               .show();
    }

    /**
     * build模式
     */
    private void testBuilder() {
        Builder.InnerBuilder innerBuilder = new Builder.InnerBuilder();
        innerBuilder.setName("koo");
        innerBuilder.setGender("man");
        innerBuilder.setHeight("175cm");
        innerBuilder.setWeight("60kg");
        innerBuilder.setHobby("music");
        Builder builder = innerBuilder.build();
        builder.toString();

        innerBuilder = new Builder.InnerBuilder();
        innerBuilder.setName("koo(only name)");
        builder = innerBuilder.build();
        builder.toString();
    }

    /**
     * 单例模式
     */
    private void testSingleton() {
        //模拟多线程
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //看是否打印一次初始化
                    Singleton.getInstance();
                }
            }).start();
        }
    }

    /**
     * 原型模式
     */
    private void testPrototype() {
        Prototype         prototype1 = new Prototype();
        ArrayList<String> imgs       = new ArrayList<>();
        imgs.add("picture1");
        imgs.add("picture2");
        imgs.add("picture3");

        prototype1.setText("prototype1");
        prototype1.setImages(imgs);
        prototype1.show();

        Prototype prototype2 = prototype1.clone();
        prototype2.getImages()
                  .add("picture4");
        prototype2.show();
    }

    /**
     * 策略模式
     */
    private void testStrategy() {
        PriceCalculate priceCalculate = new PriceCalculate();
        priceCalculate.setCalculateStrategy(new SubwayCalculate());
        int price = priceCalculate.getPrice(10);
        System.out.println(price);
    }

    /**
     * 状态模式
     */
    private void testState() {
        StateContext context = new StateContext();
        context.fallInLove();
        context.shopping();
        context.movies();
        context.disappointmentInLove();
        context.shopping();
        context.movies();
    }

    /**
     * 责任链模式
     */
    private void testChain() {
        //创建不同的快递员对象
        ChainPostman beijingChainPostman   = new BeijingChainPostman();
        ChainPostman shanghaiChainPostman  = new ShanghaiChainPostman();
        ChainPostman guangzhouChainPostman = new GuangzhouChainPostman();

        //创建下一个结点
        beijingChainPostman.nextChainPostman = shanghaiChainPostman;
        shanghaiChainPostman.nextChainPostman = guangzhouChainPostman;

        //处理不同地区的快递，都是从首结点北京快递员开始
        System.out.println("有一个上海快递需要派送:");
        beijingChainPostman.handleCourier("Shanghai");
        System.out.println("有一个广州快递需要派送:");
        beijingChainPostman.handleCourier("Guangzhou");
        System.out.println("有一个美国快递需要派送:");
        beijingChainPostman.handleCourier("America");
    }

    /**
     * 观察者模式
     */
    private void testObserver() {
        Observable postman = new ObserverPostman();

        Observer boy1  = new Boy("路飞");
        Observer boy2  = new Boy("乔巴");
        Observer girl1 = new Girl("娜美");

        postman.add(boy1);
        postman.add(boy2);
        postman.add(girl1);

        postman.notify("快递到了,请下楼领取.");
    }

    /**
     * 模板模式
     */
    private void testTemplate() {
        System.out.println("----派送A----");
        TemplatePostman postA = new PostA();
        postA.post();
        System.out.println("----派送B----");
        TemplatePostman postB = new PostB();
        postB.post();
    }

    /**
     * 迭代器模式
     */
    private void testIterator() {
        Aggregate aggregate = new DeliveryAggregate();
        aggregate.add("1111");
        aggregate.add("2222");
        aggregate.add("3333");
        aggregate.add("9527");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String tel = (String) iterator.next();
            System.out.println("当前号码为：" + tel);
        }
        System.out.println("后面没有了");
    }

    /**
     * 备忘录模式
     */
    private void testMemento() {
        System.out.println("首次进入游戏");
        Game game = new Game();
        //玩游戏
        game.play();
        //创建存档
        Memento   memento   = game.createMemento();
        Caretaker caretaker = new Caretaker();
        //保存存档
        caretaker.setMemento(memento);
        game.exit();//退出游戏

        System.out.println("-------------");
        System.out.println("二次进入游戏");
        Game secondGame = new Game();
        //读取存档
        secondGame.setMemento(caretaker.getMemento());
        //继续玩游戏
        secondGame.play();
        //不存档,嘿嘿嘿
        secondGame.exit();
    }

    /**
     * 访问者模式
     */
    private void testVisitor() {
        //创建不同的元素
        Music wangyiyue = new Music("网易云音乐");
        Music kugou     = new Music("酷狗");
        Video youku     = new Video("优酷");
        Video iqiyi     = new Video("爱奇艺");

        //放入对象结构中
        Websites websites = new Websites();
        websites.addWeb(wangyiyue);
        websites.addWeb(kugou);
        websites.addWeb(youku);
        websites.addWeb(iqiyi);

        Visitor idler = new Idler("闲人");
        //集合接受idler1的访问
        websites.accept(idler);

        Visitor busy = new Busy("忙人");
        //集合接受busy1的访问
        websites.accept(busy);
    }

    /**
     * 中介者模式
     */
    private void testMediation() {
        Lianjia   houseMediator = new Lianjia();
        Purchaser purchaser     = new Purchaser(houseMediator);
        Landlord  landlord      = new Landlord(houseMediator);
        houseMediator.setLandlord(landlord);
        houseMediator.setPurchaser(purchaser);

        landlord.send("出售一套别墅");
        System.out.println("------------------------");
        purchaser.send("求购一套学区房");
    }

    /**
     * 解释器模式
     */
    private void testInterpreter() {
        Calculator calculator = new Calculator("1 + 2 + 3 - 1");
        System.out.println(calculator.calculate());
    }

    /**
     * 命令模式
     */
    private void testCommand() {
        //创建命令接收者
        Receiver receiver = new Receiver();
        //创建一个命令的具体实现对象，并指定命令接收者
        Command command = new ShutdownCommand(receiver);
        //创建一个命令调用者，并指定具体命令
        Invoker invoker = new Invoker(command);
        invoker.action();//发起调用命令请求
    }

    /**
     * 代理模式
     */
    private void testProxy() {
        //创建国内购买人
        People domestic = new Domestic();
        //创建海外代购类并将domestic作为构造函数传递
        People oversea = new Oversea(domestic);
        //调用海外代购的buy()
        oversea.buy();
    }

    /**
     * 组合模式
     */
    private void testCombination() {
        SafeComponent root     = new SafeNode("XX公司");
        SafeComponent software = new SafeNode("软件部");
        SafeComponent hardware = new SafeNode("硬件部");

        SafeComponent androidSoftware = new SafeLeaf("android");
        SafeComponent iosSoftware     = new SafeLeaf("ios");
        SafeComponent layout          = new SafeLeaf("layout");

        ((SafeNode) root).addChild(software);
        ((SafeNode) root).addChild(hardware);
        ((SafeNode) software).addChild(androidSoftware);
        ((SafeNode) software).addChild(iosSoftware);
        ((SafeNode) hardware).addChild(layout);

        root.print();
    }

    /**
     * 适配器模式
     */
    private void testAdapter() {
        Electric electric = new Electric();
        System.out.println("默认电压：" + electric.output_220v());

        //传递一个对象给适配器
        Adapter phoneAdapter = new PhoneAdapter(electric);
        System.out.println("适配转换后的电压：" + phoneAdapter.convert_5v());

    }

    /**
     * 装饰者模式
     */
    private void testDecorator() {
        //有一间新房间
        Room          newRoom = new NewRoom();
        RoomDecorator bedroom = new Bedroom(newRoom);
        //装修成卧室
        bedroom.fitment();
        RoomDecorator kitchen = new Kitchen(newRoom);
        //装修成厨房
        kitchen.fitment();
    }

    /**
     * 享元模式
     */
    private void testShare() {
        BikeFactory factory = new BikeFactory();
        IBike       ofo     = factory.getBike("ofo");
        ofo.billing(2);
        IBike mobike = factory.getBike("Mobike");
        mobike.billing(1);
        IBike ofo1 = factory.getBike("ofo");
        ofo1.billing(3);
    }

    /**
     * 外观模式
     */
    private void testAppearance() {
        //这里是游戏研发，通过调用login()和pay()就能调起登录和支付，无需关心支付是使用支付宝还是微信等，这是游戏SDK里面去做的事。
        GameSdk gameSdk = new GameSdk();
        gameSdk.login();
        gameSdk.pay(6);
    }

    /**
     * 桥接模式
     */
    private void testBridge() {
        //创建各种衣服对象
        Clothes uniform = new Uniform();
        Clothes shirt   = new Shirt();

        //不同职业的人穿衣服
        Person coder = new Coder();
        coder.setClothes(shirt);
        coder.dress();

        Person student = new Student();
        student.setClothes(uniform);
        student.dress();

        student.setClothes(shirt);
        student.dress();
    }
}
