import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        System.out.println(gato.hashCode());

        Gato gato1 = new Gato("Gatinho", "branco", 2);
        System.out.println(gato1);
        System.out.println(gato1.hashCode());

        Gato gato2 = new Gato();
        System.out.println(gato2);
        System.out.println(gato2.hashCode());

        System.out.println(gato.equals(gato1)? "São iguais" : "Diferentes");
        System.out.println(gato.equals(gato2)? "São iguais" : "Diferentes");

        System.out.println(gato1.toString());
    }
}
