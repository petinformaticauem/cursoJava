import java.util.Scanner;

public class Main {

    public static void checagemDeErros(int a) throws MyException{
        try{
            if(a > 5)
                throw new MyDifferentException();
            else
                System.out.println("Não deu a exceção MyDifferentException!");
        }catch (MyDifferentException e){
            e.printStackTrace();
        }

        if(a < -10)
            throw new MyException();
    }

    public static void main(String[] args) {
        int a;
        Scanner numero = new Scanner(System.in);
        System.out.println("Insira o valor de a: ");
        a = numero.nextInt();

        try {
            checagemDeErros(a);
        }catch (MyException e){
            e.printStackTrace();
        }

    }
}