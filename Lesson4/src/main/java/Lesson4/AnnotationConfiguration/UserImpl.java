package Lesson4.AnnotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements IUser{

    @Autowired
    private UserInclude userInclude;

    public String getUserName(){
        return userInclude.getName();
    }
}
