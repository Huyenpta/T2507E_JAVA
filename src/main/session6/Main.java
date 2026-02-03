package main.session6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Person p = new Person();//error
        Asian a = new Asian();
        Euro e = new Euro();
        ArrayList<Person> arr= new ArrayList<>();
        arr.add(a);
        arr.add(e);
        for (int i = 0; i<arr.size(); i++){
            //arr.get(i).fly();
            //arr.get(i).jump();
            if (arr.get(i) instanceof Asian){
                ((Asian) arr.get(i)).fly();
            }
        }

        PhoneBook phones = new PhoneBook();
        phones.insertPhone("Hà","0985241235");
        phones.insertPhone("Lan","0985241236");
        phones.updatePhone("Mai", "0985241237");
        phones.removePhone("Hoa");
        phones.searchPhone("Hoa");
        phones.sort();
        phones.disPlay();


    }
}
