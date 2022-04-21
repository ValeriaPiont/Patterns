package proxy.implementation_2.dao;

import proxy.implementation_2.dao.interfaces.UserDAO;
import proxy.implementation_2.dao.simpleProxy.annotations.RequestProxy;
import proxy.implementation_2.domain.User;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class UserDAOImpl implements UserDAO {
    private final File fileDb;
    private FileWriter fileWriter;
    private long idCounter;

    public UserDAOImpl() {
        fileDb = new File("src\\main\\java\\proxy\\implementation_2\\db\\UserDB.txt");
        this.idCounter = 0l;
        try {
            this.fileWriter = new FileWriter(fileDb);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User saveUser(User user) {
        user.setId(++idCounter);
        try {
            fileWriter.write(user.toString() + "\n");
            fileWriter.flush();
            return user;
        } catch (IOException ex) {
            System.out.println("Problems with creating fileWriter");
        }
        return null;
    }

    @Override
    public String getListOfUsers() {
        try {
            FileReader fileReader = new FileReader(fileDb);
            char[] buf = new char[1024];
            fileReader.read(buf);
            fileReader.close();
            return new String(buf);
        } catch (IOException ex) {
            System.out.println("Problems with creating fileReader");
        }
        return "";
    }

    @Override
    @RequestProxy
    public String getUserById(long id) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileDb));
            String line = bufferedReader.readLine();
            while (line != null) {
                if(line.startsWith("User{id=" + id)) {
                    return line;
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "User with id=" + id + " wasn't found";
    }

}
