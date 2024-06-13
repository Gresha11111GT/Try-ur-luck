package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    class HelloController {
        @GetMapping("/luck")
        public String luck() {
            return "ur lucky!)) <br> <a href='/'>return</a>";
        }
        @GetMapping("/unluck")
        public String unluck() {
            return "bad luck <br> <a href='/'>return</a>";
        }
        @GetMapping("/")
        public String home(){
            return "<html><head><style type=\"text/css\"></style><style type=\"text/css\" id=\"operaUserStyle\"></style></head><head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Try ur luck</title>\n" +
                    "    <style>\n" +
                    "        body {\n" +
                    "            display: flex;\n" +
                    "            justify-content: center;\n" +
                    "            align-items: center;\n" +
                    "            height: 100vh;\n" +
                    "            margin: 0;\n" +
                    "            background-color: #f0f0f0;\n" +
                    "        }\n" +
                    "        .container {\n" +
                    "            display: grid;\n" +
                    "            grid-template-columns: repeat(2, 100px);\n" +
                    "            grid-template-rows: repeat(2, 100px);\n" +
                    "            gap: 20px;\n" +
                    "        }\n" +
                    "        .square {\n" +
                    "            width: 100px;\n" +
                    "            height: 100px;\n" +
                    "            background-color: #4CAF50;\n" +
                    "        }\n" +
                    "    </style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <div class=\"container\">\n" +
                    "        <div class=\"square\"><a href='/unluck'>try ur luck</a></div>\n" +
                    "        <div class=\"square\"><a href='/unluck'>try ur luck</a></div>\n" +
                    "        <div class=\"square\"><a href='/luck'>try ur luck</a></div>\n" +
                    "        <div class=\"square\"><a href='/unluck'>try ur luck</a></div>\n" +
                    "    </div>\n" +
                    "\n" +
                    "</body></html>";
        }
    }
}