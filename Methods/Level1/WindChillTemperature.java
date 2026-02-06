package Methods.Level1;
import java.util.Scanner;
public class WindChillTemperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        int wind=sc.nextInt();
        double windchill=WindChill(temp,wind);
        System.out.println(windchill);
    }
    public static double WindChill(double temperature, double windSpeed){
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16);
    }
}
