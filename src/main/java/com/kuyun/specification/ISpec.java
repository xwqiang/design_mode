package com.kuyun.specification;

import com.kuyun.model.User;

/**
 * Created by xuwuqiang on 2017/11/7.
 */
public interface ISpec {

    boolean match(User user);

    ISpec and(ISpec iSpec);

    ISpec or(ISpec iSpec);

    ISpec not(ISpec iSpec);

}
