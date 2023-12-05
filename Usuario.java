import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Crie a sua senha: ");
        String senha = entrada.next();

        
        if (senha.length() > 8 && senha.contains("!!")|| senha.contains("@") || senha.contains("#")|| senha.contains("$")|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")) {
            System.out.println("Sua senha foi criada com sucesso!");
        }
        while (senha.length() < 8 && !senha.contains("!")|| !senha.contains("@") || !senha.contains("#")|| !senha.contains("$")|| !senha.contains("%") || !senha.contains("^") || !senha.contains("&") || !senha.contains("*")) {
            System.out.println("Sua senha deve conter no minimo 8 caracteres e ter um caractere especial (!,@,#,$,%,^,& ou*)");
            System.out.println("Digite outra senha: ");
        
            senha = entrada.next();
    }
}

}