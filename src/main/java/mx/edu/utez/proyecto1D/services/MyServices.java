package mx.edu.utez.proyecto1D.services;

import mx.edu.utez.proyecto1D.controller.dto.RequestCalculadoraDTO;
import mx.edu.utez.proyecto1D.controller.dto.ResponseCalculadoraDTO;
import mx.edu.utez.proyecto1D.exception.customException.CustomBadRequestException;
import org.springframework.stereotype.Service;

@Service
public class MyServices {
    public ResponseCalculadoraDTO calculadora(RequestCalculadoraDTO data){
        ResponseCalculadoraDTO respuesta = new ResponseCalculadoraDTO();
        if (
                !data.getOperacion().equalsIgnoreCase("suma")
                && !data.getOperacion().equalsIgnoreCase("resta")
                && !data.getOperacion().equalsIgnoreCase("multiplicacion")
                && !data.getOperacion().equalsIgnoreCase("division")
        ){
            throw new CustomBadRequestException("La Operacion solicitada no es valida");
        }

        switch(data.getOperacion().trim().toLowerCase()){
            case "suma":
                respuesta.setResultado(data.getNum1()+data.getNum2());
                break;
            case  "resta":
                respuesta.setResultado(data.getNum1()-data.getNum2());
                break;
            case "multiplicacion":
                respuesta.setResultado(data.getNum1()*data.getNum2());
                break;
            case  "division":
                respuesta.setResultado(data.getNum1()/data.getNum2());
                break;
        }
        respuesta.setOperacionRealizada(data.getOperacion());
        return respuesta;

    }
}
