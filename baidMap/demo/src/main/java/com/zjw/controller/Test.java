package com.zjw.controller;

import java.util.Objects;

/**
 * @author : zhangJW
 * @Description : java类作用描述
 * @CreateDate : 2019/4/8 17:03
 * @Updat :  更新作者
 * @UpdateDate : 2019/4/8 17:03
 * @UpdateRemark : 更新内容注释
 * @Version : 1.0
 */
public class Test {
    String age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(age, test.age) &&
                Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }
}
