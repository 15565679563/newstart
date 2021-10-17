package com.wlu.newstart.controller;

import com.wlu.newstart.service.impl.ExportReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 第一个测试接口
 *
 * @author: wlu
 * @created: 2021/04/07 22:26
 */

@RestController
@RequestMapping("/api/start")
public class HelloSpringBootController {

    @Autowired
    ExportReportServiceImpl exportReportService;

    @GetMapping("/hello")
    public String helloSpringBoot(){
        return "Hello Spring Boot";
    }

    @GetMapping("/export")
    public void export(HttpServletResponse response){
       exportReportService.exportExcel(response);
    }

}
