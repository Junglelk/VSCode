# JavaScript

## JavaScript语法

### 语法

#### 变量

JavaScript中并不要求声明变量，可以直接对打算作为变量的字符串赋值；  
另外，和C、C++、Java等语言类似，也可声明变量：  

```javascript
var mood  
mood = "happy" //独占一行时，可以不加分号
//也可以
var age = 24; //也可以加分号，建议使用分号，一是层次清晰，二是方便
```  

变量名允许包含字母、数字、美元符号和下划线(第一个字符不能是数字)，JavaScript变量名对大小写敏感。  
**字面量**  
在var mood = "happy";中单词"happy"是一个*字面量*，文本happy除了表示它自己外不表示任何东西。  

#### 数据类型  

JavaScript是弱类型语言，程序员可以在任何阶段改变变量的数据类型。

```javascript
    var age = "twenty four";
    age = 24;
```

JavaScript中的数据类型

* 不区分字符串的单引号双引号，"happy"与'happy'一致，且支持" \ " 转义序列；
* 只要是数字就可以，正负、整数、浮点均可；
* 布尔类型。

#### 数组

数组关键字<kbd>Array</kbd>  

```JavaScript
var beatles = Array(4);//length是声明数组时指定的数组长度
beatles[0]  = "John";
beatles[1]  = "Paul";
beatles[2]  = "George";
beatles[3]  = "Ringo";  //填充数组的方式基本一致
//也可以不指定长度
//var beatles = Array();

//JavaScript中弱类型，于是可以这么写：
var lennon = ["John",1940,false];
//数组内容也可以是变量
var name = John；
lennon[0] = name;
//数组可嵌套数组
```  

有关联数组这种东西。

```JavaScript
var lennon = Array();
lennon["name"] = "John";
lennon["year"] = 1940;
lennon["living"] = false;
//不推荐这么做，不是一个好习惯
```

#### 使用对象

与数组类似，对象使用一个名字表示一组数值。对象的每一个值都是对象的一个属性。

```JavaScript
var lennon = Object();
lennon.name = John;
lennon.year = 1940;
lennon.living = false;

//亦可写为
var lennon = {name:'John' , year:1940 , living:false };
```

### 操作

#### 算术操作符

* 赋值 "="
* 加" + "
* 减" - "
* 乘" * "
* 除" / "
* 自增/减
* +=

加号可以用于数值，也可以用于字符串拼接：  

```JavaScript
var year = 2020;
var message = "今年是" + year+"年";
alert(message);
//显示为今年是2020年
```

### 条件语句

if语句：

```JavaScript
if(condition){
    statements;
}

if(condition){
    OneStatement;
}else{
    OtherStatements;
}
```

比较操作符：一致；<br>
逻辑操作符：

* 逻辑与&&，同真为真
* 逻辑或||，有真则真
* 逻辑非!，真值相反

### 循环

#### while循环

```JavaScript
while(condition){
    statements;
}
//条件为真可以一直执行，特点是可以一次也不执行
//当必须至s少执行一次时，使用do-while循环
do{
    statements;
}while(condition);
```

#### for循环

与Java、C并没有显著不同

```JavaScript
for(initial condition; test condition; alter condition){
    statements;
}
for(var count = 1; count<5; count++){
    alert(count);
}
```

### 函数

定义函数：

```JavaScript
function name(argument){
    statements;
}
//函数可以有任意多参数，定义时采用逗号分隔
function multiply(num1 , num2){
    var total = num1*num2;
    return total;
}
```

如何从命名上区分变量和函数：

* 命名变量时，使用下划线分隔两个单词；
* 命名函数时，第二个单词起使用大写字母开头；

### 变量作用域

* 全局变量
  * 可以在脚本的任意位置引用。作用域是整个脚本；
* 局部变量
  * 只存在于声明此变量的函数的内部，在函数外无法引用。作用域仅限于函数内部。

所以在函数内部既可以使用局部变量，也可以使用全局变量。而在函数内部使用变量时，默认为全局变量。使用<kbd>var</kbd>关键字，在函数内标记变量为局部变量。如果不使用<kbd>var</kbd>那个变量会被视为一个全局变量，若有重名的全局变量，则原变量值会被替换。

### 对象

对象是自包含的数据集合，包含在对象内的数据可以通过两种形式访问——属性(property)和方法(method):

* 属性是隶属于某个特定对象的变量,object.property;
* 方法是只有某个特定对象才能调用的函数,object.method()。

给对象创建一个实例需要使用new关键字(和java没什么不同)：

```JavaScript
var jeremy = new Person;
```

* 内建对象
  * 语言本身存在的对象，如Array、Date、Math等。
* 宿主对象
  * 这些对象不是由JavaScript语言本身而是由运行环境提供的，具体到web领域就是浏览器。由浏览器提供的预定义对象被称为**宿主对象**。
