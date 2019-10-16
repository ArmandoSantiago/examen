public class Metodos {
    /* El método recibe como argumento sangre y lo pasa a mayusculas para
    *evaluar que tipo de sangre es y regresar una respuesta
     */
    public String grupo(String sangre) {
        if (sangre.toUpperCase().equals("A+")) {
            return "Puede dar: A+ y AB+ \nPuede recibir: O+, O-, A+ y A-";
        } else if (sangre.toUpperCase().equals("A-")) {
            return "Puede dar: A+, A-, AB+ y AB- \nPuede recibir: O- y A-";
        } else if (sangre.toUpperCase().equals("B+")) {
            return "Puede dar: B+ y AB+ \nPuede recibir: O+, O-, B+ y B-";
        } else if (sangre.toUpperCase().equals("B-")) {
            return "Puede dar: B+, B-, AB+ y AB- \nPuede recibir: O- y B-";
        } else if (sangre.toUpperCase().equals("AB+")) {
            return "Puede dar: AB+ \nPuede recibir: Todos";
        } else if (sangre.toUpperCase().equals("AB--")) {
            return "Puede dar: AB+ y AB- \nPuede recibir: AB-, O-, A- y B-";
        } else if (sangre.toUpperCase().equals("O+")) {
            return "Puede dar: A+, B+, O+ y AB+ \nPuede recibir: O+ y O-";
        } else if (sangre.toUpperCase().equals("O-")) {
            return "Puede dar: Todos \nPuede recibir: O-";
        }else{
            return "Grupo no reconocido";
        }
    }
}
