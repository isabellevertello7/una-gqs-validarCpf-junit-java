public class TesteValidadorCpf {

    public static void main(String[] args) {
        testarCpfValido();
        testarCpfComLetras();
        testarCpfCurto();
        testarCpfVazio();
    }

    public static void testarCpfValido() {
        boolean resultado = ValidadorCpf.validarCpf("12345678901");
        System.out.println("CPF válido: " + (resultado == true ? "PASSOU" : "FALHOU"));
    }

    public static void testarCpfComLetras() {
        boolean resultado = ValidadorCpf.validarCpf("abc45678901");
        System.out.println("CPF com letras: " + (resultado == false ? "PASSOU" : "FALHOU"));
    }

    public static void testarCpfCurto() {
        boolean resultado = ValidadorCpf.validarCpf("12345");
        System.out.println("CPF curto: " + (resultado == false ? "PASSOU" : "FALHOU"));
    }

    public static void testarCpfVazio() {
        boolean resultado = ValidadorCpf.validarCpf("");
        System.out.println("CPF vazio: " + (resultado == false ? "PASSOU" : "FALHOU"));
    }
}
