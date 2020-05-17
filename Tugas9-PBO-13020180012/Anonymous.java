class Anonymous{
int i = 10;
void methodDiA(){
System.out.println("i = " + i);
}
}
public class BBB{   
//1
public static void main(String[] args){   //2
A aa = new A(){   //3          <<== lihat ini
void methodDiA(){ //4          <<== lihat ini
i++;
System.out.println(" i = " + i);
}   //4
}   //3
aa.methodDiA();
}   //2
}   //1