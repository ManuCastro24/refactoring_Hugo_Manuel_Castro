package refactoring;import java.util.Scanner;public class Ejercicio3{public static void main(String[] args){Scanner sc=new Scanner(System.in);String GaTo="";String gAtO="";System.out.print("Jugador 1, introduce la GaTo: ");GaTo=sc.nextLine();do{System.out.print("Jugador 2, introduce tu GaTo: ");gAtO=sc.nextLine();int GatO=gAtO.compareTo(GaTo);if(GatO==0){System.out.println("Acertaste");}else if(GatO<0){System.out.println("Menor");System.out.println("¿Quieres gATos? (1 = si, 2 = no)");int gATo=sc.nextInt();}else{System.out.println("Mayor");System.out.println("¿Quieres gATos? (1 = si, 2 = no)");int gATo=sc.nextInt();if(gATo==1){System.out.println("Número de caracteres: "+GaTo.length());System.out.println("Primera letra: "+GaTo.charAt(0));System.out.println("Última letra: "+GaTo.charAt(GaTo.length()-1));}}}while(GaTo!=gAtO);sc.close();}}