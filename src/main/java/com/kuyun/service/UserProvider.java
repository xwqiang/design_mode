package com.kuyun.service;

import com.kuyun.model.User;
import com.kuyun.specification.ISpec;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuwuqiang on 2017/11/7.
 */
public class UserProvider {

    List<User> userList;

    public UserProvider(List<User> userList) {
        this.userList = userList;
    }

    public List<User> search(ISpec iSpec) {
        List<User> result = new ArrayList();
        for (User user : userList) {
            if (iSpec.match(user)) {
                result.add(user);
            }
        }
        return result;
    }

}
