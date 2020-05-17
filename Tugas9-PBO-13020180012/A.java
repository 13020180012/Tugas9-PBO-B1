class A{
void methodDiA(){ //definis method di A
class B{          //definisi class B didalam method milik A
int i = 10;
void methodDiB(){ //deklarasi method di B
System.out.println(" i = " + i);
}                 //end method B
}                 //end method B
B b = new B();
b.methodDiB();
}                 //end methodDiA
}                 //end class A