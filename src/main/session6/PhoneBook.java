package main.session6;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{

    ArrayList<PhoneNumber> PhoneList = new ArrayList<>();


    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p : PhoneList){
            if(p.getName().equalsIgnoreCase(name)){
                if (!p.getPhone().contains(phone)){
                    p.getPhone().add(phone);
                }
            }
        }
        PhoneList.add(new PhoneNumber(name,phone));
        System.out.println("Tên: " +name);
        System.out.println("Số đt: " +phone);
        disPlay();
    }

    @Override
    public void removePhone(String name) {
        for (int i = 0; i <PhoneList.size(); i++){
            if (PhoneList.get(i).getName().equalsIgnoreCase(name)){
                PhoneList.remove(i);
                i--;
            }

        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber p : PhoneList ){
            if(p.getName().equalsIgnoreCase(name)){
                System.out.println("Name: " +p.getName());
                System.out.println("Phone: " +p.getPhone());
                disPlay();
                return;
            }
        }

    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, Comparator.comparing(PhoneNumber::getName));
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber p: PhoneList) {
            if (p.getName().equalsIgnoreCase(name)){
                p.getPhone().clear();
                p.getPhone().add(newphone);
                System.out.println("Tên: " +p.getName());
                System.out.println("Số điện thoại: " +p.getPhone());
                disPlay();
                return;
            }
        }
    }

    public void disPlay(){
        for (PhoneNumber p:PhoneList) {
            System.out.println("Tên: " +p.getName());
            System.out.println("Số điện thoại: " +p.getPhone());
        }
    }

}

