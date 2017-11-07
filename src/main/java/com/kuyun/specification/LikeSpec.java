package com.kuyun.specification;

import com.kuyun.model.User;

/**
 * Created by xuwuqiang on 2017/11/7.
 */
public class LikeSpec extends AbsSpec {

    private String cond;

    public LikeSpec(String cond) {
        this.cond = cond;
    }

    @Override
    public boolean match(User user) {
        return user.getName().contains(cond);

    }

}
