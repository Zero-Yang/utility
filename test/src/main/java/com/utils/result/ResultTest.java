package com.utils.result;

import com.utils.ResultHelper;
import org.junit.Test;

public class ResultTest {

    @Test
    public void testSuccess(){
        User user=new User();
        user.setId(1L);
        user.setName("杨京京");
        System.out.println(ResultHelper.success(user));
        System.out.println(ResultHelper.fail("10001","用户不存在"));
    }
}
