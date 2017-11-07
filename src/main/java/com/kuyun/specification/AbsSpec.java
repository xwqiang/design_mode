package com.kuyun.specification;

/**
 * Created by xuwuqiang on 2017/11/7.
 */
public abstract class AbsSpec implements ISpec {


    @Override
    public ISpec and(ISpec iSpec) {
        return new AndSpec(this, iSpec);
    }

    @Override
    public ISpec or(ISpec iSpec) {
        return new OrSpec(this, iSpec);
    }

    @Override
    public ISpec not(ISpec iSpec) {
        return new NotSpec(iSpec);
    }

}
