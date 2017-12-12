package com.java.multithread;


class Test extends Thread
{

	@Override
	public void run() {
		
		int num=1;
		for(;num<=10;num+=2){
			System.out.println("odd :" +num);
			}
		
			}
	
}
class Test2 extends Thread
{
	@Override
	public void run() {
		
		int num=2;
		for(;num<=10;num+=2){
			System.out.println("even :" +num);
			}
		
			}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test t=new Test();
		
		 Test2 t2=new Test2();
		 t.start();
		 t2.start();

	}

}
