package object;

public class Programa {

    public static void main(String[] args) {

        // Aqui vemos sobrecarga de metodos
        System.out.println("x");
        System.out.println(123);
        System.out.println(false);

        Object conta = new Conta();
        Object contaCorrente =  new ContaCorrente();

        Conta conta1 = new Conta();
        ContaCorrente contaCorrente1 = new ContaCorrente();

        println(contaCorrente);

        //println()
        System.out.println(contaCorrente);
        System.out.println(contaCorrente1);



    }

    static void println(){ }
    static void println(int a){}
    static void println(boolean valor){}

    static void println(Object conta){}
    //static void println(Conta conta1){}
}
