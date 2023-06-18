package com.soap.client;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.*;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * @project: SpringBootSoap
 * @author: rsaldanar
 * @date: 17/6/23
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
public class SoapClient extends WebServiceGatewaySupport {

    /**
     * @description: Metodo que se encarga de sumar dos numeros enteros y retorna el resultado de la suma
     * @param numberA
     * @param numberB
     * @return
     */
    public AddResponse getAddResonse(int numberA, int numberB) {
        Add addRequest = new Add();
        addRequest.setIntA(numberA);
        addRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

        AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest, soapActionCallback);

        return addResponse;
    }

    /**
     * @description: Metodo que se encarga de restar dos numeros enteros y retorna el resultado de la resta
     * @param numberA
     * @param numberB
     * @return
     */
    public SubtractResponse getSubtractResponse(int numberA, int numberB) {
        Subtract subtractRequest = new Subtract();
        subtractRequest.setIntA(numberA);
        subtractRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtractRequest, soapActionCallback);

        return subtractResponse;
    }

    /**
     * @description: Metodo que se encarga de dividir dos numeros enteros y retorna el resultado de la division
     * @param numberA
     * @param numberB
     * @return
     */
    public DivideResponse getDivideResponse(int numberA, int numberB) {
        Divide divideRequest = new Divide();
        divideRequest.setIntA(numberA);
        divideRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

        DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divideRequest, soapActionCallback);

        return divideResponse;
    }

    /**
     * @description: Metodo que se encarga de multiplicar dos numeros enteros y retorna el resultado de la multiplicacion
     * @param numberA
     * @param numberB
     * @return
     */
    public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {
        Multiply multiplyRequest = new Multiply();
        multiplyRequest.setIntA(numberA);
        multiplyRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiplyRequest, soapActionCallback);

        return multiplyResponse;
    }
}
