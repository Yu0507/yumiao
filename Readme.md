## 说明书

1. 创建人类（类名为 Person），放在 com.colin.model 包中。
2. 人类中包含如下的几个字段：姓名(String name)，年龄(int age)，身份证号(String idNum)，
电话号(String phoneNum)。
3. 通过重写 equals 方法制定人类的比较规则。
1) 如果被比较对象的运行期类型根本不是 Person 类型，则认为两个对象不相等。
2) 如果比较对象和被比较对象的姓名和身份证号一致，其他信息哪怕不一致也认为连 个对象是相等的。
4. 为人类创建构造方法使得在创建对象的时候方便初始化对象中的全部字段信息。
5. 创建商品类（类名为 Goods），放在 com.colin.model 包中。
6. 商品类包含如下的几个字段：品评(String name)，价格(double price)。
7. Goods 类需要重写 toString()方法，使得输出对象的时候展示出商品详细信息。