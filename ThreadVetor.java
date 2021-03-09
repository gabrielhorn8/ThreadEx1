package controller;

public class ThreadVetor extends Thread{
	private int[] vetor;
	private int num;
	public ThreadVetor(int[]vetor, int num) {
		this.vetor=vetor;
		this.num=num;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		double tempoini;
		double tempofinal;
		double segundos;
		if(num%2==0){
			tempoini=System.nanoTime();
			for(int y=0;y<vetor.length;y++){
				
			}
			tempofinal=System.nanoTime();
			segundos=tempofinal-tempoini;
			segundos=segundos/Math.pow(10, 9);
			System.out.println("Thread Par: "+segundos+" segundos");
		}else{
			tempoini=System.nanoTime();
			for(Integer i: vetor){
	
			}
			tempofinal=System.nanoTime();
			segundos=tempofinal-tempoini;
			segundos=segundos/Math.pow(10, 9);
			System.out.println("Thread Ímpar: "+segundos+" segundos");
		}
	}

}
