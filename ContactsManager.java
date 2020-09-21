
public class ContactsManager {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();

        Contact f1 = new Contact("Esra", "0123456789");
        myContactManager.addContact(f1);

        Contact f2=new Contact("Gunduz", "9876543210");
        myContactManager.addContact(f2);

        Contact f3=new Contact("Selma", "05508291382");
        myContactManager.addContact(f3);

        System.out.print(myContactManager.searchContact(f1));
    }


    Contact [] myContacts;
    private int indexOfContacts;

    ContactsManager(){
        myContacts = new Contact[10];
        indexOfContacts=0;
    }

    public void addContact(Contact contact){
        myContacts[indexOfContacts]=contact;
        indexOfContacts++;
    }
    public String searchContact(Contact contact){
        for(int i=0; i<indexOfContacts; i++){
            if(myContacts[i].equals(contact)){
                return "Phone number of searched contact: " + myContacts[i].getPhoneNumber();
            }
        }
        return null;
    }
}

class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


