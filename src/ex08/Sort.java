package ex08;

public class Sort {

    public static Paciente[] sortPaciente(Paciente[] lista){
        for (int c = 0; c < lista.length - 1; c++) {
            //boolean swapped = false;
            for (int i = 0; i < lista.length - 1; i++) {
                if (lista[i].getGravidade() < lista[i + 1].getGravidade()) {
                    Paciente aux = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = aux;
                    //swapped = true;
                }
                if (lista[i].getGravidade() == lista[i + 1].getGravidade()) {
                    System.out.println("Gravidade igual");
                    if (lista[i].getTempo() < lista[i + 1].getTempo()) {
                        Paciente aux = lista[i];
                        lista[i] = lista[i + 1];
                        lista[i + 1] = aux;
                    }


                }
            }
            //if(!swapped){ break;}
        }
        return lista;
    }
}