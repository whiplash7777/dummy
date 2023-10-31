package pong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pong.models.CallerName;
import pong.service.CallerService;

public class CallerServiceImpl implements CallerService {

    @Autowired
    public CallerName callerName;
    @Override
    public String getCaller() {
        String user=this.callerName.getUserName();
        return "hello" + user;

    }

    @Override
    public void putCaller(String s) {
        this.callerName.setUserName(s);

    }

}
