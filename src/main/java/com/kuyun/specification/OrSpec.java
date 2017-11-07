package com.kuyun.specification;

import com.kuyun.model.User;

/**
 * Created by xuwuqiang on 2017/11/7.
 */
public class OrSpec extends AbsSpec {

    private ISpec left;
    private ISpec right;

    public OrSpec(ISpec left, ISpec right) {
        this.right = right;
        this.left = left;
    }


    @Override
    public boolean match(User user) {
        return left.match(user) || right.match(user);
    }
}
