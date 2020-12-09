package com.suyu.websocket.controller;

import com.suyu.websocket.server.SocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @BelongsProject: springbootwebsocket
 * @BelongsPackage: com.suyu.websocket.controller
 * @Author: lizeze
 * @CreateTime: 2020-12-09 20:28
 * @Description:
 */
@RestController
@RequestMapping("/api/socket")
public class WebChatController {

    @Autowired
    private SocketServer socketServer;

    @PostMapping("/send")
    public void sendMess(@RequestBody Map<String, String> map) {

        socketServer.SendMany(map.get("message"), map.get("clientId").split(","));


    }
}
