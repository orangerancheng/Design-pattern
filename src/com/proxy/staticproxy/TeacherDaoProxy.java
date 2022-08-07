package com.proxy.staticproxy;

public class TeacherDaoProxy implements IIecaherDao {

    private IIecaherDao iIecaherDao;

    @Override
    public void teach() {
        iIecaherDao.teach();
    }

    public TeacherDaoProxy(IIecaherDao iIecaherDao) {
        super();
        this.iIecaherDao = iIecaherDao;
    }
}
