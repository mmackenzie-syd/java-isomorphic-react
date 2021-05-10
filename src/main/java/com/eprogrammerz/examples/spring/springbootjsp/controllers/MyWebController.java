package com.eprogrammerz.examples.spring.springbootjsp.controllers;

import java.io.InputStreamReader;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) throws Exception {

        // ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("graal.js");

        getClass().getResource("classpath:storedProcedures.sql");

        engine.eval(new InputStreamReader(new ClassPathResource("static/js/react.js").getInputStream()));
        engine.eval(new InputStreamReader(new ClassPathResource("static/js/react-dom-server.js").getInputStream()));

        engine.eval(new InputStreamReader(new ClassPathResource("static/app.js").getInputStream()));
        Object html = engine.eval("ReactDOMServer.renderToString(" + "React.createElement(App, {data: [0,1,1]})" + ");");

        model.put("content", String.valueOf(html));
        return "index";
    }
}
