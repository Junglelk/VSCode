# 变量  

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

## 数据类型  

JavaScript是弱类型语言，程序员可以在任何阶段改变变量的数据类型。

```javascript
    var age = "twenty four";
    age = 24;
```

JavaScript中的数据类型

* 不区分字符串的单引号双引号，"happy"与'happy'一致，且支持" \ " 转义序列；
* 只要是数字就可以，正负、整数、浮点均可；
* 布尔类型。

## 数组

数组关键字<kbd>Array</kbd>  

```JavaScript
var beatles = Array(4);//length是声明数组时指定的数组长度
beatles[0]  = "John";
beatles[1]  = "Paul";
beatles[2]  = "George";
beatles[3]  = "Ringo";  //填充数组的方式基本一致
//也可以不指定长度
//var beatles = Array();
```  
