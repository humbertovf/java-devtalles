package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        int age = 19;
        double average = 7.5;
        boolean isAdult = age > 17;
        boolean hasPassingGrade = average >= 7;

        if (isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos.");
        } /*else if (age <= 0) {
            System.out.println("No es valido.");
        } else {
            System.out.println("Es menor de edad.");
        }*/

        if(!isAdult){
            System.out.println("Es adulto.");
        }

        // Comentarios
        /*
        * */
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("El dato ingresado no es valido.");
        }
    }
}
