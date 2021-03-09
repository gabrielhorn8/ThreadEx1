package view;
import java.util.Random;
import controller.ThreadVetor;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet=new int[1000];
		Random gerar=new Random();
		for(int i=0;i<100;i++){
			vet[i]=gerar.nextInt(99)+1;
		}
		Thread tvet1=new ThreadVetor(vet,1);
		Thread tvet2=new ThreadVetor(vet,2);
		tvet1.start();
		tvet2.start();
	}
}
