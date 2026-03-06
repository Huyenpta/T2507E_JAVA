package main.dao;

import java.util.ArrayList;

public interface BaseDao <E, K>{
    ArrayList<E> getAll();
    boolean create(E e);
    boolean update(E e);
    boolean delete(K id); // Tham số hoá luôn khi chưa biết kiểu gì
    E findById(K id);// Trừu tượng hoá là liệt kê những tính chất thiết yếu, cụ thể sẽ báo sau
}
