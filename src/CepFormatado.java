public class CepFormatado {
    public static void main(String[] args) {
        String cep = "13483605";

        try {

            System.out.println(formatarCep(cep));

        } catch (CepInvalidoException e) {

            System.out.println("O cep digitado é inválido, possui menos de 8 digitos");
        }

    }

    // Essa função por usar o Throws acaba obrigando um usuario a utilizar um try-catch ou adicionar um throws no inicio, caso não feito isso o codigo da erro

    public static String formatarCep(String cep) throws CepInvalidoException {

        // variavel que contera ocep formatado
        String cepFormatado = "";

        // Tratamento de exceção caso cep seja ínvalido
        if (cep.length() != 8 ) {
            throw new CepInvalidoException();
        }

        // O for iniciou no 1 pois foi utilizado um substring usando o i como referência, logo o primeiro item '0' quando subtraido daria um erro de compilação.

        for (int i = 1; i <= cep.length(); i++) {
            
            if(i == 3) {
                cepFormatado += ".";
            } 
            if ( i == 6) {
                cepFormatado += "-";
            }

            cepFormatado = cepFormatado + cep.substring((i-1), i);
        }

        return cepFormatado;

    }
}
