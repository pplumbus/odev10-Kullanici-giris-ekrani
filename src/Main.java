import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input1 = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        userName = input1.nextLine();

        System.out.print("Sifreniz : ");
        password = input1.nextLine();

        if (userName.equals("deniz") && password.equals("243287")) {
            System.out.print("Basariyla Giris Yaptiniz");

        } else {
            System.out.println("Bilgileriniz Yanlis.\nSifre sifirlamak icin tuslayin : \n1-Evet \n2-Hayir ");

        }
        Scanner reset = new Scanner(System.in);
        String input2 = reset.nextLine();


        if (input2.equals("1")){
            System.out.print("Yeni Sifre Giriniz: ");
            String newPassword = reset.nextLine();
            if (newPassword.equals("243287")) {
                System.out.println("Eski sifreniz ile ayni olmamali.. Tekrar deneyiniz");
                reset.nextLine();

            }if (input2.equals("2"))
                System.out.print("Islem iptal edildi..");

            }
            else
                System.out.print("Hatali tusladiniz..");

            }

            }














