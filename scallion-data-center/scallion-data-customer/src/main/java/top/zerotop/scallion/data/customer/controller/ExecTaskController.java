package top.zerotop.scallion.data.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.zerotop.common.rest.Response;
import top.zerotop.common.rest.ResponseUtil;

@RestController
@RequestMapping(value = "/data")
public class ExecTaskController {

    @GetMapping(value = "/execSummaryTask")
    private Response invokeExample(@RequestParam String param) {
        String taskEcho = "收到任务，开始汇总。。。param" + param;
        System.out.println(taskEcho);
        return ResponseUtil.ok(taskEcho);
    }
}
