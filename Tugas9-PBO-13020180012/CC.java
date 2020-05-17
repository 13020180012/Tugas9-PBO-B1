interface A{
public void methodDiA();
}
interface B extends A{
public void methodDiB();
}
public class CC{
public static void main(String[] args){
B b = new B(){
public void methodDiA(){
System.out.println("Ini method di A");
}
public void methodDiB(){
System.out.println("Ini method di B");
}
};
b.methodDiA();
b.methodDiB();
}
}