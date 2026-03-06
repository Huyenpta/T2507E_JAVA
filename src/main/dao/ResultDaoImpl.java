package main.dao;

import main.entity.Result;

import java.util.ArrayList;

public class ResultDaoImpl implements BaseDao<Result, Integer>{
    @Override
    public ArrayList<Result> getAll() {
        return null;
    }

    @Override
    public boolean create(Result result) {
        return false;
    }

    @Override
    public boolean update(Result result) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Result findById(Integer id) {
        return null;
    }
}
