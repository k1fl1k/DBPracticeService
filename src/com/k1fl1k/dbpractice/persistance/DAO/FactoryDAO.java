package com.k1fl1k.dbpractice.persistance.DAO;

public class FactoryDAO {

    // Private static instance of DAOFactory
    private static final FactoryDAO instance = new FactoryDAO();

    // Private constructor to prevent instantiation from outside
    private FactoryDAO() {
    }

    // Static method to get the instance of DAOFactory
    public static FactoryDAO getInstance() {
        return instance;
    }

    // Factory method to create AnimalDAO object
    public StorageDAO createStorageDAO() {
        return StorageDAO.getInstance();
    }

    // Factory method to create EmployeeDAO object
    public SectionDAO createSectionDAO() {
        return SectionDAO.getInstance();
    }

    // Factory method to create EnclosureDAO object
    public ToysDAO createToysDAO() {
        return ToysDAO.getInstance();
    }

    // Factory method to create VisitorDAO object
    public UsersDAO createUsersDAO() {
        return UsersDAO.getInstance();
    }
}
