package javaapplication50;

public class Main{
    
    public static void main(String[] args){
        
        Line tinggi = new Line(1, 2, 3, 4);
        Line lebar = new Line(4, 3, 2, 1);
        
        System.out.println("Tinggi ="+tinggi.getLength());
        System.out.println("Lebar ="+lebar.getLength());
        
        if(tinggi.isGreater(tinggi, lebar)){
            System.out.println("Tinggi > Lebar");
        }
        else if(tinggi.isLess(tinggi, lebar)){
            System.out.println("Tinggi < Lebar");
        }
        else if(tinggi.isEqual(tinggi, lebar)){
            System.out.println("Tinggi = Lebar");
        }
    }

}
