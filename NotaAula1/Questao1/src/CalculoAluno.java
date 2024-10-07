public class CalculoAluno {
    double media;
    public String CalculoMedia(int nota1, int nota2, int nota3) {
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 70) {
            return ("aprovado.");
        }
        else if (media >= 40){
            return ("na final.");
        }
        else {
            return ("reprovado.");
        }
    }
}
