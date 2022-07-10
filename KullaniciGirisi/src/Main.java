import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
         * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
         * yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
         * ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         * kullanıcı adı: patika
         * şifre:123
         */
        String userName,password,newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını girininiz :");
        userName=input.nextLine();
        System.out.print("Sifrenizi giriniz : ");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("123") ){
            System.out.print("Giriş yaptınız");
        }else {
            System.out.print("Giriş başarısısız \n\n Yeni şifre girin ");
            newPassword=input.nextLine();
            if (newPassword.equals(password)){
                System.out.print("Eski sifreden farklı sifre giriniz ");
            }else {
                System.out.println("Sifre basarılı bir şekilde değiştirildi. ");
            }
        }
    }
}
