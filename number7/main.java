package number7;

public class main {

    public static void main(){
        comGenerco<Integer> comgernerco1 = new comGenerco<>(); 
        comGenerco<String> comgernerco2 = new comGenerco<>();



        int r1 =comgernerco1.comparar(1, 2);
        int r2 = comgernerco2.comparar("hola","hola 2");

        System.out.println(" nteger " +r1 + " string " + r2);
    }
    
}
