mood = "happy";  //定义变量
age  = 24;
alert(mood);    //alert：弹出窗口，显示变量值。
alert(age);
/*var beatles = Array(4);
beatles[0]  = "John";
beatles[1]  = "Paul";
beatles[2]  = "George";
beatles[3]  = "Ringo";  //填充数组的方式基本一致 */
var lennon  = { name:"John" , year:1940 , living:false}; 

var beatles = Array();

beatles[0] = lennon; //可以使用lennon.name获取变量值

var year = 2020;
var message = "今年是" + year+"年";
alert(message);

