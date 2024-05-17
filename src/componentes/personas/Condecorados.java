package componentes.personas;

/**
 * Clase Condecorados representa a quienes han recibido una condecoración.
 */
public class Condecorados {


    // De claramos las columnas de la tabla como atributos
    // de la clase "Condecorados"
    private  String lastName;
    private String firstName;

    //oficial o individuo alistado al ejercito.
    private String officerOrEnlisted;
    //Grado del mérito.
    private  String typeOfActionComm;
    //Condecorado
    private String nameOfApprovedAward;

    /**
     *
     * @param lastName lastName Apellido de la persona condecorada.
     * @param firstName firstName Nombre de la persona condecorada.
     * @param officerOrEnlisted Indica si la persona es oficial o individuo alistado en el ejército.
     * @param typeOfActionComm Grado del mérito.
     * @param nameOfApprovedAward Nombre de la condecoración aprobada.
     */
    public Condecorados(String lastName, String firstName, String officerOrEnlisted, String typeOfActionComm, String nameOfApprovedAward){
        this.lastName = lastName;
        this.firstName = firstName;
        this.officerOrEnlisted = officerOrEnlisted;
        this.typeOfActionComm = typeOfActionComm;
        this.nameOfApprovedAward = nameOfApprovedAward;
    }

    //Metodos getters.

    public String getLastName() {
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getOfficerOrEnlisted(){
        return officerOrEnlisted;
    }
    public String getTypeOfActionComm(){
        return typeOfActionComm;
    }
    public String getNameOfApprovedAward(){
        return nameOfApprovedAward;
    }

    /**
     * Metodos setters.
     * @param lastName
     */
    public void setLastName(String lastName){
        this.lastName = firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setOfficerOrEnlisted(String officerOrEnlisted) {
        this.officerOrEnlisted = officerOrEnlisted;
    }
    public void setTypeOfActionComm(String typeOfActionComm){
        this.typeOfActionComm = typeOfActionComm;
    }

    public void setNameOfApprovedAward(String nameOfApprovedAward) {
        this.nameOfApprovedAward = nameOfApprovedAward;
    }

    /**
     * Devuelve una representación de cadena de la instancia de Condecorados.
     *
     * @return Una representación de cadena de la instancia de Condecorados.
     */
    @Override
    public String toString() {
        return "Condecorados{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", officerOrEnlisted='" + officerOrEnlisted + '\'' +
                ", typeOfActionComm='" + typeOfActionComm + '\'' +
                ", nameOfApprovedAward='" + nameOfApprovedAward + '\'' +
                '}';
    }
}
