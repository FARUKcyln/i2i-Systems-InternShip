package com.test;

import com.calculator.CalculatorImpl;
import com.calculator.CalculatorImplService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.Scanner;

public class Test {

    private static final Logger log = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
        DOMConfigurator.configure("log4j.xml");
        log.info("Program is started");

//         Test for compress process
//         for (int i = 0; i < 20000; i++) {
//            log.info("Program is started");
//        }

        CalculatorImplService wsdl = new CalculatorImplService();
        CalculatorImpl service = wsdl.getCalculatorImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the first number");
            int num1 = sc.nextInt();
            log.debug("Input number 1 : " + num1);
            System.out.println("Please enter the second number");
            int num2 = sc.nextInt();
            log.debug("Input number 2 : " + num2);
            System.out.println(
                    "Please enter process number" + "\n1.Add" + "\n2.Substract" + "\n3.Divide" + "\n4.Multiply" + "\n5.Exit");
            int processNum = sc.nextInt();
            log.debug("Process number  : " + processNum);
            int result = 0;
            boolean processComplete = true;
            if (processNum == 1) {
                result = service.add(num1, num2);
            } else if (processNum == 2) {
                result = service.substract(num1, num2);
            } else if (processNum == 3) {
                if (num2 != 0) {
                    result = service.divide(num1, num2);
                } else {
                    log.error("Dividing 0 error");
                }
            } else if (processNum == 4) {
                result = service.multiply(num1, num2);
            } else if (processNum == 5) {
                sc.close();
                log.info("Program terminated");
                break;
            } else {
                log.error("Wrong process number");
                processComplete = false;
            }

            if (processComplete) {
                log.debug("Result = " + result);
                System.out.println("Result = " + result);
            }
        }

    }

}
