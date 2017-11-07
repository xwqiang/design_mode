package com.kuyun.specification;

import com.kuyun.model.User;

/**
 * Created by xuwuqiang on 2017/11/7.
 */
public class NotSpec extends AbsSpec {

    private ISpec spec;

    public NotSpec(ISpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean match(User user) {
        return !spec.match(user);
    }
}
