package com.soap.controller;

import com.soap.client.SoapClient;
import com.soap.wsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @project: SpringBootSoap
 * @author: rsaldanar
 * @date: 17/6/23
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@RestController
@RequestMapping("/api/mathe")
public class MatheController {

    @Autowired
    private SoapClient soapClient;

    @PostMapping("/suma")
    public ResponseEntity getAddResonse(@RequestParam int numberA, @RequestParam int numberB) {
        Map<String, Integer> response = new HashMap<>();
        AddResponse addResponse = soapClient.getAddResonse(numberA, numberB);
        response.put("Primera Cantidad", numberA);
        response.put("Segunda Cantidad", numberB);
        response.put("Resultado", addResponse.getAddResult());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/resta")
    public ResponseEntity getSubtractResonse(@RequestParam int numberA, @RequestParam int numberB) {
        Map<String, Integer> response = new HashMap<>();
        SubtractResponse addResponse = soapClient.getSubtractResponse(numberA, numberB);
        response.put("Primera Cantidad", numberA);
        response.put("Segunda Cantidad", numberB);
        response.put("Resultado", addResponse.getSubtractResult());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/multiplicacion")
    public ResponseEntity getMultiplyResonse(@RequestParam int numberA, @RequestParam int numberB) {
        Map<String, Integer> response = new HashMap<>();
        MultiplyResponse addResponse = soapClient.getMultiplyResponse(numberA, numberB);
        response.put("Primera Cantidad", numberA);
        response.put("Segunda Cantidad", numberB);
        response.put("Resultado", addResponse.getMultiplyResult());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/division")
    public ResponseEntity getDivideResonse(@RequestParam int numberA, @RequestParam int numberB) {
        Map<String, Integer> response = new HashMap<>();
        DivideResponse addResponse = soapClient.getDivideResponse(numberA, numberB);
        response.put("Primera Cantidad", numberA);
        response.put("Segunda Cantidad", numberB);
        response.put("Resultado", addResponse.getDivideResult());
        return ResponseEntity.ok(response);
    }


}
