/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Patryk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4

 /*       import java.util.*; 
public class Silnia { 

// metoda silnia zwraca silnię z liczby przekazanej jako parametr
// obliczenie silni odbywa się za pomocą rekurencji
public static int silnia(int wartosc) {
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
if(wartosc == 0) return 1;
else return wartosc * silnia(wartosc - 1);
}
 
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Podaj liczbę: " ); 
// pobieramy od użytkownika liczbę
int liczba = sc.nextInt(); 
// wyświetlamy na ekranie obliczoną silnię
System.out.println(liczba + "! = " + silnia(liczba));
 }
}*/
 // zad 1.4
 int p;
 Scanner scanner = new Scanner (System.in);
 p= scanner.nextInt();
 
System.out.println(" Pierwsze przesunięcie będzie wyglądało następująco :" + (p>>=p));
System.out.println(" Kolejne przesunięcie będzie wyglądało tak: " + (p<<=p));
System.out.println(" Ostatnie przesunięcie wygląda tak: " + (p>>>=p));

//zad 1.7
    int z;
    do{
      System.out.println("1.NOT");
      System.out.println("2.XOR");
      System.out.println("0.KONIEC");
     
      Scanner kontrola= new Scanner(System.in);
      z=kontrola.nextInt();
      System.out.println(z);
        switch(z){
        case 1:{
        int a,b;
        
        System.out.println("Podaj a i b:");
        Scanner not= new Scanner(System.in);
        a=not.nextInt();
        b=not.nextInt();
        if(a>b)
        {
        System.out.println("A jest wieksze od b");
        }        
        else
        {
        System.out.println("B jest wieksze lub rowne A");
        }
        if(!(a>b))
        {
        System.out.println("NOT-B jest wieksze od A");
        }        
        else
        {
        System.out.println(" NOT A jest wieksze lub rowne B");
        }
        break;}
         
        case 2:{
        int c,d;
        System.out.println("Podaj c i d:");
        Scanner xor= new Scanner(System.in);
        c=xor.nextInt();
        d=xor.nextInt();
        if(c%2==0|| d%2==0)
        {
            System.out.println("Jedna z nich lub obie sa parzyste");
        }
        else
        {
            System.out.println("Zadna nie jest parzysta");
        }
        if(!(c%2==0|| d%2==0))
        {
            System.out.println("Zadna badz jedna jest parzysta");
        }
        else
        {
            System.out.println("Obie sa parzyste");
        }
        break;
         
            
     //zadanie 2.2
    static void zadanie3(){
        String str = "Tekst";
    char[] tab = str.toCharArray();
    for(int i=0;i<tab.length;i++)
    {
        System.out.println(i+"."+tab[i] );
    }
    
   byte[] byt= str.getBytes();
   for(int i=0;i<byt.length;i++)
    {
        System.out.println(tab[i]+"="+byt[i]);
    }
   
     String str2="tekst";
     boolean c;
     c=str.equals(str2);
     System.out.println(c);
   
     c=str.equalsIgnoreCase(str2);
     System.out.println(c);
    
     int i;
     
     i=str.compareTo(str2);
     System.out.println(i);
     
     
     i=str.compareToIgnoreCase(str2);
     System.out.println(i);
     
   
     i=str2.indexOf("t");
     System.out.println(i);
     
    
     i=str2.indexOf("t",2);
     System.out.println(i);
     
     i=str2.lastIndexOf("t");
     System.out.println(i);
     
     i=str2.lastIndexOf("t",4);
     System.out.println(i);
     
    String str3;
    str3=str.substring(2);
    System.out.println(str3);
     
    str3=str.substring(1,3);
    System.out.println(str3);
     
    String str4="Ala";
    str3=str4.replace("A","O");
    System.out.println(str3);
    
    String str5="      Ala ma kota";
    String str6=str5.trim();
    System.out.println(str5);
    System.out.println(str6);
    
    
    str5=str.toLowerCase();
    System.out.println(str5);
    
    str5=str2.toUpperCase();
    System.out.println(str5);
    
    String str8="tttt-aaa-kkk";  
    String str7[]=str8.split("-",2);
    for(i=0;i<str7.length;i++)
        {
            System.out.println(str7[i]);
        }
    
    
    String str9[]=str8.split("-");
    for(i=0;i<str9.length;i++)
        {
            System.out.println(str9[i]);
 
     //zad3.3
    int z4;
    
    System.out.println("1.Potegowanie for");
    System.out.println("2.Potegowanie rekurencja");
    System.out.println("0.Koniec");
    Scanner odczyt= new Scanner(System.in);
     z4=odczyt.nextInt();
      switch(z4){
          case 1:
              int k,n;
              int w=1;
              System.out.println("Podaj podstawe i wykladnik:");
              Scanner p= new Scanner(System.in);
              k=p.nextInt();
              n=p.nextInt();
              for(int i=1;i<=n;i++){
              w=w*k;
              }
              System.out.println(w);
              break;
          case 2:
              Scanner sc = new Scanner(System.in);
              System.out.print("Podaj liczbę oraz wykladnik: " ); 
              int liczba = sc.nextInt(); 
              int wykladnik=sc.nextInt();
              System.out.println(liczba + " ^ "+ wykladnik + "=" + potegowanie(liczba,wykladnik));
              break;           
              
              
      }
     
    }
      
    
}
public static int potegowanie(int podstawa, int wykladnik) {
if(wykladnik == 0) return 1;
else return podstawa * potegowanie(podstawa,wykladnik-1);
   
}

    static void zadanie5(){
        //Zada 3.4
        System.out.println("Podaj n ciagu");
        Scanner fib=new Scanner(System.in);
        int n=fib.nextInt();
        System.out.println("Suma ciagu: "+ciag(n));
         
        
                
     } 
public static int ciag(int n){
   if(n==1 ||n==2) return 1;
   else return ciag(n-1)+ciag(n-2);
}

    static void menu(){
        int zg;
    do
    {
    System.out.println("Menu:");
    System.out.println("Zadanie 1.");
    System.out.println("Zadanie 2.");
    System.out.println("Zadanie 3.");
    System.out.println("Zadanie 4.");
    System.out.println("Zadanie 5.");
    System.out.println("Koniec 0.");
    Scanner menu= new Scanner(System.in);
    zg=menu.nextInt();
    
        switch(zg){
            case 1:
                Zadania.zadanie1();
                break;
            case 2:
                Zadania.zadanie2();
                break;
            case 3:
                Zadania.zadanie3();
                break;
            case 4:    
                Zadania.zadanie4();
                break;
            case 5:
                Zadania.zadanie5();
                break; 
    }
}
    
