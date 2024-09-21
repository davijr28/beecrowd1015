import java.util.Scanner;
public class Beecrowd1015 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        double x1, x2, y1, y2, distancia;
        String p1,p2;
        
        //ler e armazenar p1 e p2 em array
        p1 = leitor.nextLine();
        String[] partsp1 = p1.split(" ");
        p2 = leitor.nextLine();
        String[] partsp2 = p2.split(" ");
        
        //transformar valores para double e atribuir as variáveis x e y
        x1 = Double.parseDouble(partsp1[0]);
        y1 = Double.parseDouble(partsp1[1]);
        x2 = Double.parseDouble(partsp2[0]);
        y2 = Double.parseDouble(partsp2[1]);
        
        //calcular a distância
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        //mostrar resultado no console
        System.out.printf("%.4f%n" , distancia);
    }
}