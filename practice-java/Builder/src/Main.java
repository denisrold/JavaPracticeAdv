import models.Person;

public class Main {
    public static void main(String[] args) {
        //Evitar losnull pointer exception a atraves de un constructor con datos completos.
     // models.Person p = new models.Person("Denis","Roldan","email@email.com","321321321312");
        //CON BUILDER
        //objetos inmutables-> no se puede modificar lo que tienen adentro.
        Person p = Person.Builder.aPerson()
                .withFirstname("Denis").withLastname("Roldan").withPhone("31231321231").withEmail("mail@mail.com").build();
    }



}