package design_stack;

public class StackOfIntegers {

    private int[] elements;        //一个存储栈中整数的数组
    private int size = 0;          //栈中整数的个数
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){               //默认创建一个容量为16的栈
        this(DEFAULT_CAPACITY);
    } 

    public StackOfIntegers(int capacity){   //创建一个指定大小的栈
        elements = new int[capacity];
    }

    public boolean empty(){                 //判断栈是否为空
        return size==0;
    }

    public int peek(){                      //返回栈顶元素，但不删除它
        return elements[size-1];            //size指向下一个位置，所以应减一后访问
    }

    public void push(int value){            //将一个整数存到栈顶

        if(size>=elements.length){          //栈溢出处理方式
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements=temp;
        }
        elements[size++] = value;
    }

    public int pop(){                       //返回并删除栈顶元素

        int i = elements[--size];           //保存栈顶并使大小减一即可，原来的空间可下次使用，size应先自减，
                                            //因为size每次保存的都是下一次入栈的元素的位置
        return i;
    }

    public int getSize() {                  //返回栈中元素的个数

        return size;                        //即是size大小
    }


}