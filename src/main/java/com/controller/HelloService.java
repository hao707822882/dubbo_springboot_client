package com.controller;

import com.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * ���������������޳�û������������
 * ��������������������
 * ���������ߩ��������ߩ�
 * ����������������������
 * ����������������������
 * ���������ש������ס���
 * ����������������������
 * �������������ߡ�������
 * ����������������������
 * ����������������������
 * ���������������������ޱ���, ����BUG!
 * ������������������Code is far away from bug with the animal protecting
 * ��������������������������
 * �������������������������ǩ�
 * ����������������������������
 * �������������������ש�����
 * �������������ϩϡ����ϩ�
 * �������������ߩ������ߩ�
 * �������������о������թ�����������
 * Module Desc:clover
 * User: z.mm | 2428922347@qq.com
 * Date: 2016/2/1
 * Time: 12:21
 * state:
 */
@Controller
public class HelloService {

    @Autowired
    private UserService userService;


    @RequestMapping("/user")
    @ResponseBody
    public Map show1() {
        String data = userService.getUser(10L);
        Map map = new HashMap<>();
        map.put("data", data);
        return map;
    }
}
