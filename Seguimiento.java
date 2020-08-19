import java.util.Scanner;
public class Seguimiento{
	public static void main(String args[]){
		Scanner Lector=  new Scanner(System.in);
		int compra;  int  dia; int pago; int cedula;
		double descuento; double recargo; double compra_total;
		String premio;
		System.out.println("Bienvenido, por favor ingrese el valor de su compra");
		compra= Lector.nextInt();
		System.out.println("Por favor ingrese el dia en el que realizo la compra");
		dia=Lector.nextInt();
		System.out.println("Por favor ingrese el ultimo digito de su cedula");
		cedula=Lector.nextInt();
		
		System.out.println("Por favor indique el metodo de pago 1 para efectivo, 2 para tarjeta de credito");
		pago= Lector.nextInt();
		do{
		   if(pago==1){
		    descuento=compra*0.05;
			compra_total=compra-descuento;
			System.out.println("Se le ha aplicado un descuento de: "+descuento);
		}else{
		   recargo=compra*0.03;
			compra_total= compra+recargo;
		    System.out.println("Se le ha aplicado un recargo de: "+recargo);
		}
		System.out.println("Su compra total es de: "+compra_total);	
			switch(dia){
		
				case 6: if(cedula%2==0){
	             	premio="Gana un botella de te de durazno";
					System.out.println("El dia de hoy "+premio);
		
				}else{
           
					premio="Gana una cocacola de 750cm";
					System.out.println("El dia de hoy "+premio);
		
				}break;
		
				case 9: premio="Tienes un 9% de descuento en su siguiente compra";
                        System.out.println("El dia de hoy "+premio);					
			     break;
		
				case 24: if(cedula%2==0){
                    premio="Gana un gel antibacterial";	
					System.out.println("El dia de hoy "+premio);
		
				}else{
		   
					premio=" Gana un sobre de Dolex";
					System.out.println("El dia de hoy "+premio);
		
				}break;
		
				default: premio="Hoy no tienes premio gracias por venir";
					     System.out.println("El dia de hoy "+premio);
					break;
			}break;
		   
		}
	 while(pago==1 || pago==2);

	}
}