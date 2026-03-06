package main.factory;

import main.dao.*;
import main.enums.FactoryDao;

public class Factory {
    public static BaseDao getModel(FactoryDao s) throws Exception {
        switch(s){
            case STUDENT: return new StudentDaoImpl();
            case SUBJECT: return new SubjectDaoImp();
            case RESULT: return new ResultDaoImpl();
            case TEACHER: return new TeacherDaoImpl();
            case CLASS: return new ClassDaoImpl();
            default: throw new Exception();
        }

        }

}

