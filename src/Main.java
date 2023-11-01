import java.util.HashSet;
import java.io.*;
import java.util.Scanner;

public class Main {
    static void elementeComune() {
        System.out.println("Problema1->Gasiti elementele comune din doua siruri\n");
        String[] a={"java","test","university","harry potter"};
        String[] b={"car","university","phone","mario","ipad","harry potter"};
        HashSet<String> setA = new HashSet<>();
        for(String comun : a)
            setA.add(comun);
        HashSet<String> cuvinteComune = new HashSet<>();
        for(String comun : b){
            if(setA.contains(comun))
                cuvinteComune.add(comun);
        }
        System.out.println(cuvinteComune);
    }
    static void fibonnaci(){
        int nr,x=0,y=1,aux;
        System.out.println("Problema 2->Sirul lui Fibonnaci\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti cate numere din sirul lui Fibonnaci sa se afiseze:");
        nr = s.nextInt();
        System.out.println("O sa se afiseze primele "+nr+" numere din sir");
        System.out.print(x+ " "+y);
        for(int i=2;i<nr;++i){
            aux=x+y;
            System.out.print(" "+aux);
            x=y;
            y=aux;
        }
    }
    static void palindrom(){
        String invers="";
        char ch;
        System.out.println("\nProblema 3->Aratati daca un cuvant e palindrom");
        Scanner s= new Scanner(System.in);
        System.out.println("Introduceti cuvantul ce doriti sa verificati daca e palindrom:");
        String cuvant=s.next();
        System.out.println("Cuvantul introdus este:"+cuvant);
        for(int i=0;i<cuvant.length();i++){
            ch=cuvant.charAt(i);
            invers=ch+invers;
        }
        System.out.println("Cuvantul inversat este:"+invers);
        if(cuvant.equals(invers))
            System.out.println("Cuvantul este palindrom!");
        else
            System.out.println("Cuvantul nu este palindrom:(");
    }
    public static void main(String[] args) {
        elementeComune();
        fibonnaci();
        palindrom();
    }
}