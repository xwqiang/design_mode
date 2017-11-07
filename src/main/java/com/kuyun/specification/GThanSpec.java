package com.kuyun.specification;

import com.kuyun.model.User;

/**
 * Created by xuwuqiang on 2017/11/7.
 */
public class GThanSpec extends AbsSpec {

    private int age;

    public GThanSpec(int age) {
        this.age = age;
    }

    @Override
    public boolean match(User user) {
        return user.getAge() > this.age;

    }

}
